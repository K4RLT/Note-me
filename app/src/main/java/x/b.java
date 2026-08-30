package x;
import a.a;
import a0.g;
import m.d;
import r0.l;
import r0.m;
import r0.r;
import r0.y;
import z0.c;

import c2.p1;
import java.util.List;
import r0.q1;
import z1.h1;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f29943a = new q0(1);

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f29944b = new q0(2);

    public static final void a(d1.r rVar, d1.e eVar, c cVar, m mVar, int i) {
        int i10;
        boolean z3;
        d1.e eVar2;
        int i11;
        int i12;
        r rVar2 = (r) mVar;
        rVar2.c0(1781813501);
        if ((i & 6) == 0) {
            if (rVar2.f(rVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i;
        } else {
            i10 = i;
        }
        int i13 = i10 | 432;
        if ((i & 3072) == 0) {
            if (rVar2.h(cVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i13 |= i11;
        }
        boolean z9 = false;
        if ((i13 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i13 & 1, z3)) {
            d1.j jVar = d1.c.f15670u;
            z1.p0 d2 = d(jVar, false);
            if ((i13 & 7168) == 2048) {
                z9 = true;
            }
            boolean f10 = rVar2.f(d2) | z9;
            Object O = rVar2.O();
            if (f10 || O == l.f24285a) {
                O = new g(d2, 16, cVar);
                rVar2.k0(O);
            }
            h1.b(rVar, (df.p) O, rVar2, i13 & 14);
            eVar2 = jVar;
        } else {
            rVar2.U();
            eVar2 = eVar;
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new b3.n(rVar, eVar2, cVar, i);
        }
    }

    public static final void b(d1.r rVar, m mVar) {
        l lVar = l.f29974c;
        int t3 = y.t(mVar);
        d1.r c10 = d1.a.c(rVar, mVar);
        r rVar2 = (r) mVar;
        g l10 = rVar2.l();
        b2.h.f1471d.getClass();
        b2.b0 b0Var = b2.g.f1462b;
        rVar2.e0();
        if (rVar2.S) {
            rVar2.k(b0Var);
        } else {
            rVar2.n0();
        }
        y.I(b2.g.e, lVar, mVar);
        y.I(b2.g.f1464d, l10, mVar);
        y.I(b2.g.f1463c, c10, mVar);
        b2.f fVar = b2.g.f1465f;
        if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(t3))) {
            a.t(t3, rVar2, t3, fVar);
        }
        rVar2.p(true);
    }

    public static final b0 c(u0 u0Var, m mVar) {
        return new b0(u0Var, (y2.c) ((r) mVar).j(p1.f3606h));
    }

    public static final n0 d(z1.o0 o0Var) {
        Object H = o0Var.H();
        if (H instanceof n0) {
            return (n0) H;
        }
        return null;
    }

    public static final float e(n0 n0Var) {
        if (n0Var != null) {
            return n0Var.f29986a;
        }
        return 0.0f;
    }

    public static z1.q0 f(m0 m0Var, int i, int i10, int i11, int i12, int i13, z1.r0 r0Var, List list, z1.a1[] a1VarArr, int i14) {
        int i15;
        int i16;
        float f10;
        boolean z3;
        int i17;
        long j10;
        int i18;
        int i19;
        int i20;
        List list2 = list;
        long j11 = i13;
        int[] iArr = new int[i14];
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        float f11 = 0.0f;
        while (i22 < i14) {
            z1.o0 o0Var = (z1.o0) list2.get(i22);
            float e = e(d(o0Var));
            if (e > 0.0f) {
                f11 += e;
                i23++;
                j10 = j11;
                i18 = i22;
            } else {
                int i26 = i11 - i24;
                z1.a1 a1Var = a1VarArr[i22];
                j10 = j11;
                if (a1Var == null) {
                    if (i11 == Integer.MAX_VALUE) {
                        i18 = i22;
                        i19 = i23;
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i18 = i22;
                        i19 = i23;
                        if (i26 < 0) {
                            i20 = 0;
                        } else {
                            i20 = i26;
                        }
                    }
                    a1Var = o0Var.z(m0Var.c(0, i20, i12, false));
                } else {
                    i18 = i22;
                    i19 = i23;
                }
                z1.a1 a1Var2 = a1Var;
                int h3 = m0Var.h(a1Var2);
                int j12 = m0Var.j(a1Var2);
                iArr[i18] = h3;
                int i27 = i26 - h3;
                if (i27 < 0) {
                    i27 = 0;
                }
                i25 = Math.min(i13, i27);
                i24 += h3 + i25;
                i21 = Math.max(i21, j12);
                a1VarArr[i18] = a1Var2;
                i23 = i19;
            }
            i22 = i18 + 1;
            j11 = j10;
        }
        long j13 = j11;
        if (i23 == 0) {
            i24 -= i25;
            i16 = 0;
        } else {
            if (i11 != Integer.MAX_VALUE) {
                i15 = i11;
            } else {
                i15 = i;
            }
            long j14 = (r21 - 1) * j13;
            long j15 = (i15 - i24) - j14;
            if (j15 < 0) {
                j15 = 0;
            }
            float f12 = ((float) j15) / f11;
            for (int i28 = 0; i28 < i14; i28++) {
                j15 -= Math.round(e(d((z1.o0) list2.get(i28))) * f12);
            }
            int i29 = i21;
            int i30 = 0;
            int i31 = 0;
            while (i30 < i14) {
                if (a1VarArr[i30] == null) {
                    z1.o0 o0Var2 = (z1.o0) list2.get(i30);
                    n0 d2 = d(o0Var2);
                    float e8 = e(d2);
                    if (e8 <= 0.0f) {
                        a.b("All weights <= 0 should have placeables");
                    }
                    f10 = f12;
                    int signum = Long.signum(j15);
                    j15 -= signum;
                    int max = Math.max(0, Math.round(e8 * f10) + signum);
                    if (d2 != null) {
                        z3 = d2.f29987b;
                    } else {
                        z3 = true;
                    }
                    if (z3 && max != Integer.MAX_VALUE) {
                        i17 = max;
                        z1.a1 z9 = o0Var2.z(m0Var.c(i17, max, i12, true));
                        int h10 = m0Var.h(z9);
                        int j16 = m0Var.j(z9);
                        iArr[i30] = h10;
                        i31 += h10;
                        int max2 = Math.max(i29, j16);
                        a1VarArr[i30] = z9;
                        i29 = max2;
                    }
                    i17 = 0;
                    z1.a1 z92 = o0Var2.z(m0Var.c(i17, max, i12, true));
                    int h102 = m0Var.h(z92);
                    int j162 = m0Var.j(z92);
                    iArr[i30] = h102;
                    i31 += h102;
                    int max22 = Math.max(i29, j162);
                    a1VarArr[i30] = z92;
                    i29 = max22;
                } else {
                    f10 = f12;
                }
                i30++;
                list2 = list;
                f12 = f10;
            }
            i16 = (int) (i31 + j14);
            int i32 = i11 - i24;
            if (i16 < 0) {
                i16 = 0;
            }
            if (i16 > i32) {
                i16 = i32;
            }
            i21 = i29;
        }
        int i33 = i16 + i24;
        if (i33 < 0) {
            i33 = 0;
        }
        int max3 = Math.max(i33, i);
        int max4 = Math.max(i21, Math.max(i10, 0));
        int[] iArr2 = new int[i14];
        m0Var.e(max3, iArr, iArr2, r0Var);
        return m0Var.b(a1VarArr, r0Var, iArr2, max3, max4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.m, df.q] */
    public static final d1.r g(d1.r rVar) {
        return d1.a(rVar, new kotlin.jvm.internal.m(3));
    }

    public static final c0 h(j3.c cVar) {
        return new c0(cVar.f18874a, cVar.f18875b, cVar.f18876c, cVar.f18877d);
    }
}
