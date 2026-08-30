package p;
import b0.d1;
import d1.r;
import e1.b;
import h1.a;
import k0.v;
import n.i0;
import p.l1;
import q.e;
import q.r0;
import q.t1;
import r0.m;
import r0.q1;
import r0.r;
import z0.c;
import z0.h;

import g0.f2;

/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f22209a = e.r(0.0f, 400.0f, t1.f23011a, 1);

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f22210b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final k1 f22211c = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [l1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.k1, java.lang.Object] */
    static {
        new i0();
    }

    public static final void a(r rVar, c cVar, m mVar, int i) {
        int i10;
        boolean z3;
        r rVar2 = (r) mVar;
        rVar2.c0(2043053727);
        if (rVar2.f(rVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i11 & 1, z3)) {
            b(h.d(-130587847, new b(rVar, 1, cVar), rVar2), rVar2, 6);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new v(rVar, cVar, i, 2);
        }
    }

    public static final void b(c cVar, m mVar, int i) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(-2093217917);
        if ((i & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            z1.a(h.d(-863967934, new f2(8, cVar), rVar), rVar, 6);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d1(cVar, i, 2);
        }
    }
}
