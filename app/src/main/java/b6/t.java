package b6;
import d.e;
import d.i;
import m.a;
import m.h;
import q.d;
import r.f;
import t.a;
import t.n0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.daren.scraply.R;
import g5.d0;
import wa.y6;

/* loaded from: classes.dex */
public abstract class t {
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0266, code lost:
    
        if (r14.g(false) != false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(d1.r r37, a0.l0 r38, a0.d r39, x.k0 r40, n0 r41, boolean r42, f r43, x.f r44, x.d r45, df.l r46, r0.m r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a(d1.r, a0.l0, a0.d, x.k0, n0, boolean, f, x.f, x.d, df.l, r0.m, int, int):void");
    }

    public static final r b(Context context, a6.a aVar) {
        g5.r a10;
        context.getClass();
        m6.b bVar = new m6.b(aVar.f246b);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        d0 d0Var = bVar.f20613a;
        d0Var.getClass();
        a6.r rVar = aVar.f247c;
        boolean z3 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        rVar.getClass();
        int i = 1;
        if (z3) {
            a10 = new g5.r(applicationContext, WorkDatabase.class, null);
            a10.i = true;
        } else {
            a10 = y6.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            a10.f17520h = new b1.h(i, applicationContext);
        }
        a10.f17518f = d0Var;
        a10.f17517d.add(new b(rVar));
        a10.a(d.f1720h);
        a10.a(new i(2, 3, applicationContext));
        a10.a(i);
        a10.a(d.f1721j);
        a10.a(new i(5, 6, applicationContext));
        a10.a(d.f1722k);
        a10.a(d.f1723l);
        a10.a(d.f1724m);
        a10.a(new i(applicationContext));
        a10.a(new i(10, 11, applicationContext));
        a10.a(d.f1717d);
        a10.a(e);
        a10.a(d.f1718f);
        a10.a(d.f1719g);
        a10.f17527p = false;
        a10.f17528q = true;
        WorkDatabase workDatabase = (WorkDatabase) a10.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        h6.j jVar = new h6.j(applicationContext2, bVar);
        h hVar = new h(context.getApplicationContext(), aVar, bVar, workDatabase);
        s.f1780u.getClass();
        m6.b bVar2 = bVar;
        context.getClass();
        String str = m.f1758a;
        e6.b bVar3 = new e6.b(context, workDatabase, aVar);
        k6.a(context, SystemJobService.class, true);
        a6.d().a(m.f1758a, "Created SystemJobScheduler and enabled SystemJobService");
        return new r(context.getApplicationContext(), aVar, bVar, workDatabase, qe.h(bVar3, new c6.c(context, aVar, jVar, hVar, new j6.c(hVar, bVar2), bVar2)), hVar, jVar);
    }
}
