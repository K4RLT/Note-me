package k6;
import a.a;
import m.b;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends jg.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b6.r f19551w;

    public c(b6.r rVar) {
        this.f19551w = rVar;
    }

    @Override // jg.a
    public final void c() {
        b6.r rVar = this.f19551w;
        WorkDatabase workDatabase = rVar.f1774c;
        workDatabase.c();
        try {
            ArrayList i = workDatabase.C().i();
            int size = i.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = i.get(i10);
                i10++;
                jg.a(rVar, (String) obj);
            }
            workDatabase.v();
            workDatabase.h();
            b6.b(rVar.f1773b, workDatabase, rVar.e);
        } catch (Throwable th) {
            workDatabase.h();
            throw th;
        }
    }
}
