package b6;
import q.f;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1758a = a6.f("Schedulers");

    public static void a(j6.q qVar, a6.r rVar, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            rVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                qVar.l(currentTimeMillis, ((j6.p) obj).f18944a);
            }
        }
    }

    public static void b(a6.a aVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            j6.q C = workDatabase.C();
            workDatabase.c();
            try {
                ArrayList d2 = C.d();
                a(C, aVar.f247c, d2);
                ArrayList c10 = C.c(aVar.f252j);
                a(C, aVar.f247c, c10);
                c10.addAll(d2);
                ArrayList b10 = C.b();
                workDatabase.v();
                workDatabase.h();
                if (c10.size() > 0) {
                    j6.p[] pVarArr = (j6.p[]) c10.toArray(new j6.p[c10.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        j jVar = (j) it.next();
                        if (jVar.c()) {
                            jVar.a(pVarArr);
                        }
                    }
                }
                if (b10.size() > 0) {
                    j6.p[] pVarArr2 = (j6.p[]) b10.toArray(new j6.p[b10.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        j jVar2 = (j) it2.next();
                        if (!jVar2.c()) {
                            jVar2.a(pVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.h();
                throw th;
            }
        }
    }
}
