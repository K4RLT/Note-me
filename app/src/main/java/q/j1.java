package q;
import k0.w;
import p.a;
import p.f0;
import p.h;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;

/* loaded from: classes.dex */
public abstract class j1 {
    static {
        pe.a.c(pe.h.f22691v, h1.f22915u);
    }

    public static final void a(g1 g1Var, f1 f1Var, Object obj, Object obj2, z zVar, m mVar, int i) {
        int i10;
        boolean z3;
        boolean h3;
        int i11;
        boolean h10;
        int i12;
        boolean h11;
        int i13;
        int i14;
        int i15;
        r rVar = (r) mVar;
        rVar.c0(867041821);
        if ((i & 6) == 0) {
            if (rVar.f(g1Var)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.f(f1Var)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h11 = rVar.f(obj);
            } else {
                h11 = rVar.h(obj);
            }
            if (h11) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                h10 = rVar.f(obj2);
            } else {
                h10 = rVar.h(obj2);
            }
            if (h10) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i10 |= i12;
        }
        if ((i & 24576) == 0) {
            if ((32768 & i) == 0) {
                h3 = rVar.f(zVar);
            } else {
                h3 = rVar.h(zVar);
            }
            if (h3) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i10 |= i11;
        }
        if ((i10 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            if (g1Var.g()) {
                f1Var.f(obj, obj2, zVar);
            } else {
                f1Var.g(obj2, zVar);
            }
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new h(g1Var, f1Var, obj, obj2, zVar, i, 2);
        }
    }

    public static final g1 b(g1 g1Var, Object obj, Object obj2, String str, m mVar, int i) {
        boolean z3;
        int i10 = (i & 14) ^ 6;
        boolean z9 = true;
        if ((i10 > 4 && ((r) mVar).f(g1Var)) || (i & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        Object O = rVar.O();
        v0 v0Var = l.f24285a;
        if (z3 || O == v0Var) {
            O = new g1(new i0(obj), g1Var, a.o(new StringBuilder(), g1Var.f22904c, " > ", str));
            rVar.k0(O);
        }
        g1 g1Var2 = (g1) O;
        if ((i10 <= 4 || !rVar.f(g1Var)) && (i & 6) != 4) {
            z9 = false;
        }
        boolean f10 = rVar.f(g1Var2) | z9;
        Object O2 = rVar.O();
        if (f10 || O2 == v0Var) {
            O2 = new w(g1Var, 11, g1Var2);
            rVar.k0(O2);
        }
        y.c(g1Var2, (df.l) O2, rVar);
        if (g1Var.g()) {
            g1Var2.j(obj, obj2);
            return g1Var2;
        }
        g1Var2.k(obj2);
        g1Var2.f22910k.setValue(Boolean.FALSE);
        return g1Var2;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.internal.m, df.l] */
    public static final c1 c(g1 g1Var, l1 l1Var, String str, m mVar, int i, int i10) {
        boolean z3;
        b1 b1Var;
        if ((i10 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i11 = (i & 14) ^ 6;
        boolean z9 = true;
        if ((i11 > 4 && ((r) mVar).f(g1Var)) || (i & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        Object O = rVar.O();
        v0 v0Var = l.f24285a;
        if (z3 || O == v0Var) {
            O = new c1(g1Var, l1Var, str);
            rVar.k0(O);
        }
        c1 c1Var = (c1) O;
        if ((i11 <= 4 || !rVar.f(g1Var)) && (i & 6) != 4) {
            z9 = false;
        }
        boolean h3 = rVar.h(c1Var) | z9;
        Object O2 = rVar.O();
        if (h3 || O2 == v0Var) {
            O2 = new w(g1Var, 12, c1Var);
            rVar.k0(O2);
        }
        y.c(c1Var, (df.l) O2, rVar);
        if (g1Var.g() && (b1Var = (b1) c1Var.f22861b.getValue()) != null) {
            g1 g1Var2 = c1Var.f22862c;
            b1Var.f22851u.f(b1Var.f22853w.invoke(g1Var2.f().a()), b1Var.f22853w.invoke(g1Var2.f().c()), (z) b1Var.f22852v.invoke(g1Var2.f()));
        }
        return c1Var;
    }

    public static final f1 d(g1 g1Var, Object obj, Object obj2, z zVar, l1 l1Var, m mVar, int i) {
        boolean f10 = ((r) mVar).f(g1Var);
        r rVar = (r) mVar;
        Object O = rVar.O();
        Object obj3 = l.f24285a;
        if (f10 || O == obj3) {
            q qVar = (q) l1Var.f22943a.invoke(obj2);
            qVar.d();
            O = new f1(g1Var, obj, qVar, l1Var);
            rVar.k0(O);
        }
        f1 f1Var = (f1) O;
        a(g1Var, f1Var, obj, obj2, zVar, rVar, 0);
        boolean f11 = rVar.f(g1Var) | rVar.f(f1Var);
        Object O2 = rVar.O();
        if (f11 || O2 == obj3) {
            O2 = new w(g1Var, 13, f1Var);
            rVar.k0(O2);
        }
        y.c(f1Var, (df.l) O2, rVar);
        return f1Var;
    }

    public static final g1 e(i0 i0Var, m mVar, int i, int i10) {
        String str;
        boolean z3;
        if ((i10 & 2) != 0) {
            str = null;
        } else {
            str = "DropDownMenu";
        }
        if ((((i & 14) ^ 6) > 4 && ((r) mVar).f(i0Var)) || (i & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        Object O = rVar.O();
        Object obj = l.f24285a;
        if (z3 || O == obj) {
            O = new g1(i0Var, null, str);
            rVar.k0(O);
        }
        g1 g1Var = (g1) O;
        rVar.a0(1031290843);
        g1Var.a(i0Var.f22920c.getValue(), rVar, 0);
        rVar.p(false);
        boolean f10 = rVar.f(g1Var);
        Object O2 = rVar.O();
        if (f10 || O2 == obj) {
            O2 = new f0(g1Var, 1);
            rVar.k0(O2);
        }
        y.c(g1Var, (df.l) O2, rVar);
        return g1Var;
    }

    public static final g1 f(Object obj, String str, m mVar, int i, int i10) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        r rVar = (r) mVar;
        Object O = rVar.O();
        v0 v0Var = l.f24285a;
        if (O == v0Var) {
            O = new g1(new i0(obj), null, str);
            rVar.k0(O);
        }
        g1 g1Var = (g1) O;
        g1Var.a(obj, rVar, (i & 8) | 48 | (i & 14));
        Object O2 = rVar.O();
        if (O2 == v0Var) {
            O2 = new f0(g1Var, 2);
            rVar.k0(O2);
        }
        y.c(g1Var, (df.l) O2, rVar);
        return g1Var;
    }
}
