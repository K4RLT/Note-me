package wa;
import a6.a;
import a6.s;
import b6.o;
import c0.d;
import g5.a0;
import j6.q;
import m.i;
import q.x;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e9 {
    public static final void a(WorkDatabase workDatabase, a aVar, o oVar) {
        int i;
        workDatabase.getClass();
        aVar.getClass();
        oVar.getClass();
        ArrayList i10 = qe.i(oVar);
        int i11 = 0;
        int i12 = 0;
        while (!i10.isEmpty()) {
            List list = ((o) qe.q(i10)).f1763d;
            list.getClass();
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((s) it.next()).f291b.f18951j.f264h.isEmpty() && (i = i + 1) < 0) {
                        qe.m.k();
                        throw null;
                    }
                }
            }
            i12 += i;
        }
        if (i12 != 0) {
            q C = workDatabase.C();
            C.getClass();
            a0 k3 = a0.k(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
            WorkDatabase_Impl workDatabase_Impl = C.f18965a;
            workDatabase_Impl.b();
            Cursor d2 = ya.d(workDatabase_Impl, k3, false);
            try {
                if (d2.moveToFirst()) {
                    i11 = d2.getInt(0);
                }
                d2.close();
                k3.m();
                int i13 = aVar.i;
                if (i11 + i12 <= i13) {
                    return;
                }
                x.n(a.j(i12, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", a.n("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i13, ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ", i11)));
            } catch (Throwable th) {
                d2.close();
                k3.m();
                throw th;
            }
        }
    }
}
