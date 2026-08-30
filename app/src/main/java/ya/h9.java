package ya;
import j1.b;
import h9.b;
import h9.c;
import a6.f;
import b2.b0;
import b2.g;
import b2.h;
import c.a;
import c0.n;
import d1.o;
import d1.r;
import df.l;
import df.p;
import df.q;
import p.g0;
import p.i;
import p.p0;
import p.q0;
import p.v;
import p.y;
import pe.z;
import q.g1;
import q.j1;
import r0.a1;
import r0.i1;
import r0.k2;
import r0.m;
import r0.q1;
import r0.v0;
import x.s;
import ya.h9;

/* loaded from: classes.dex */
public abstract class h9 {
    public static final void a(g1 g1Var, l lVar, r rVar, p0 p0Var, q0 q0Var, p pVar, c cVar, m mVar, int i) {
        int i10;
        boolean z3;
        boolean z9;
        i1 i1Var;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        i1 i1Var2 = g1Var.f22905d;
        r rVar2 = (r) mVar;
        rVar2.c0(-891967166);
        if ((i & 6) == 0) {
            if (rVar2.f(g1Var)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar2.h(lVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        if ((i & 384) == 0) {
            if (rVar2.f(rVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i10 |= i15;
        }
        if ((i & 3072) == 0) {
            if (rVar2.f(p0Var)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        }
        if ((i & 24576) == 0) {
            if (rVar2.f(q0Var)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i10 |= i13;
        }
        if ((196608 & i) == 0) {
            if (rVar2.h(pVar)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i10 |= i12;
        }
        int i18 = i10 | 1572864;
        if ((12582912 & i) == 0) {
            if (rVar2.h(cVar)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i18 |= i11;
        }
        int i19 = i18;
        if ((i19 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i19 & 1, z3)) {
            if (!((Boolean) lVar.invoke(i1Var2.getValue())).booleanValue() && !((Boolean) lVar.invoke(g1Var.c())).booleanValue() && !g1Var.g() && !g1Var.d()) {
                rVar2.a0(1790694746);
                rVar2.p(false);
            } else {
                rVar2.a0(1788522886);
                int i20 = i19 & 14;
                int i21 = i20 | 48;
                int i22 = i21 & 14;
                if (((i22 ^ 6) > 4 && rVar2.f(g1Var)) || (i21 & 6) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Object O = rVar2.O();
                v0 v0Var = l.f24285a;
                if (z9 || O == v0Var) {
                    O = g1Var.c();
                    rVar2.k0(O);
                }
                if (g1Var.g()) {
                    O = g1Var.c();
                }
                rVar2.a0(-466616829);
                g0 e = e(g1Var, lVar, O, rVar2);
                rVar2.p(false);
                Object value = i1Var2.getValue();
                rVar2.a0(-466616829);
                g0 e8 = e(g1Var, lVar, value, rVar2);
                rVar2.p(false);
                g1 b10 = j1.b(g1Var, e, e8, "EnterExitTransition", rVar2, i22 | 3072);
                a1 G = y.G(pVar, rVar2);
                Object c10 = b10.c();
                i1 i1Var3 = b10.f22905d;
                Object invoke = pVar.invoke(c10, i1Var3.getValue());
                boolean f10 = rVar2.f(b10) | rVar2.f(G);
                Object O2 = rVar2.O();
                c cVar2 = null;
                if (f10 || O2 == v0Var) {
                    O2 = new f(b10, G, cVar2, 22);
                    rVar2.k0(O2);
                }
                p pVar2 = (p) O2;
                Object O3 = rVar2.O();
                if (O3 == v0Var) {
                    O3 = y.B(invoke);
                    rVar2.k0(O3);
                }
                a1 a1Var = (a1) O3;
                boolean h3 = rVar2.h(pVar2);
                Object O4 = rVar2.O();
                if (!h3 && O4 != v0Var) {
                    i1Var = i1Var3;
                } else {
                    i1Var = i1Var3;
                    O4 = new k2(pVar2, a1Var, null, 0);
                    rVar2.k0(O4);
                }
                y.f((p) O4, z.f22715a, rVar2);
                Object c11 = b10.c();
                g0 g0Var = g0.f22154w;
                if (c11 == g0Var && i1Var.getValue() == g0Var && ((Boolean) a1Var.getValue()).booleanValue()) {
                    rVar2.a0(1790688794);
                    rVar2.p(false);
                    z11 = false;
                    rVar2 = rVar2;
                } else {
                    rVar2.a0(1789551931);
                    if (i20 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Object O5 = rVar2.O();
                    if (z10 || O5 == v0Var) {
                        O5 = new y(b10);
                        rVar2.k0(O5);
                    }
                    y yVar = (y) O5;
                    int i23 = i19 >> 6;
                    z11 = false;
                    rVar2 = rVar2;
                    r a10 = androidx.compose.animation.a(b10, p0Var, q0Var, "Built-in", rVar2, (i23 & 112) | 24576 | (i23 & 896));
                    rVar2.a0(1581779440);
                    rVar2.p(false);
                    r d2 = rVar.d(a10.d(o.f15687a));
                    Object O6 = rVar2.O();
                    if (O6 == v0Var) {
                        O6 = new q(yVar);
                        rVar2.k0(O6);
                    }
                    q qVar = (q) O6;
                    int hashCode = Long.hashCode(rVar2.T);
                    g l10 = rVar2.l();
                    r c12 = a.c(d2, rVar2);
                    h.f1471d.getClass();
                    b0 b0Var = g.f1462b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(b0Var);
                    } else {
                        rVar2.n0();
                    }
                    y.I(g.e, qVar, rVar2);
                    y.I(g.f1464d, l10, rVar2);
                    f fVar = g.f1465f;
                    if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                        a.t(hashCode, rVar2, hashCode, fVar);
                    }
                    y.I(g.f1463c, c12, rVar2);
                    cVar.b(yVar, rVar2, Integer.valueOf((i19 >> 18) & 112));
                    rVar2.p(true);
                    rVar2.p(false);
                }
                rVar2.p(z11);
            }
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new r(g1Var, lVar, rVar, p0Var, q0Var, pVar, cVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(s r13, boolean r14, r r15, p0 r16, q0 r17, java.lang.String r18, c r19, m r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.h9.b(s, boolean, r, p0, q0, java.lang.String, c, m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(boolean r16, r r17, p0 r18, q0 r19, java.lang.String r20, c r21, m r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.h9.c(boolean, r, p0, q0, java.lang.String, c, m, int, int):void");
    }

    public static final void d(g1 g1Var, l lVar, r rVar, p0 p0Var, q0 q0Var, c cVar, m mVar, int i) {
        int i10;
        p0 p0Var2;
        q0 q0Var2;
        c cVar2;
        boolean z3;
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        r rVar2 = (r) mVar;
        rVar2.c0(429978603);
        if ((i & 6) == 0) {
            if (rVar2.f(g1Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar2.h(lVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i & 384) == 0) {
            if (rVar2.f(rVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i & 3072) == 0) {
            p0Var2 = p0Var;
            if (rVar2.f(p0Var2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        } else {
            p0Var2 = p0Var;
        }
        if ((i & 24576) == 0) {
            q0Var2 = q0Var;
            if (rVar2.f(q0Var2)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        } else {
            q0Var2 = q0Var;
        }
        if ((i & 196608) == 0) {
            cVar2 = cVar;
            if (rVar2.h(cVar2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i10 |= i11;
        } else {
            cVar2 = cVar;
        }
        boolean z10 = false;
        if ((74899 & i10) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i10 & 1, z3)) {
            int i17 = i10 & 112;
            if (i17 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i18 = i10 & 14;
            if (i18 == 4) {
                z10 = true;
            }
            boolean z11 = z9 | z10;
            Object O = rVar2.O();
            if (z11 || O == l.f24285a) {
                O = new n(lVar, g1Var);
                rVar2.k0(O);
            }
            a(g1Var, lVar, androidx.compose.ui.layout.a.b(rVar, (q) O), p0Var2, q0Var2, i.f22174w, cVar2, rVar2, 196608 | i18 | i17 | (i10 & 7168) | (57344 & i10) | ((i10 << 6) & 29360128));
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new v(g1Var, lVar, rVar, p0Var, q0Var, cVar, i);
        }
    }

    public static final g0 e(g1 g1Var, l lVar, Object obj, m mVar) {
        r rVar = (r) mVar;
        rVar.Y(-902032957, g1Var);
        boolean g8 = g1Var.g();
        g0 g0Var = g0.f22152u;
        g0 g0Var2 = g0.f22154w;
        g0 g0Var3 = g0.f22153v;
        if (g8) {
            rVar.a0(2101770115);
            rVar.p(false);
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                g0Var = g0Var3;
            } else if (((Boolean) lVar.invoke(g1Var.c())).booleanValue()) {
                g0Var = g0Var2;
            }
        } else {
            rVar.a0(2102044248);
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = y.B(Boolean.FALSE);
                rVar.k0(O);
            }
            a1 a1Var = (a1) O;
            if (((Boolean) lVar.invoke(g1Var.c())).booleanValue()) {
                a1Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                g0Var = g0Var3;
            } else if (((Boolean) a1Var.getValue()).booleanValue()) {
                g0Var = g0Var2;
            }
            rVar.p(false);
        }
        rVar.p(false);
        return g0Var;
    }
}
