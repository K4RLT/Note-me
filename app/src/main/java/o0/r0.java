package o0;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import c2.p1;
import d1.a;
import d1.c;
import d1.j;
import d1.o;
import d1.r;
import g0.c1;
import g0.d1;
import k1.p0;
import p.b;
import q0.m;
import r0.l;
import r0.q1;
import r0.y;
import v.i;
import x.j0;
import x.k0;
import z1.a1;

import ya.ac;
import ya.ae;
import ya.sc;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f21644a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final long f21645b;

    static {
        q2.u uVar = m.f23151a;
        long j10 = m.f23171l;
        ae.a(j10);
        f21645b = ae.f(1095216660480L & j10, y2.o.c(j10) / 2);
    }

    public static final void a(String str, df.l lVar, r rVar, boolean z3, m2.q0 q0Var, df.p pVar, r2.e0 e0Var, d1 d1Var, c1 c1Var, boolean z9, int i, int i10, p0 p0Var, s1 s1Var, m mVar, int i11, int i12) {
        int i13;
        int i14;
        r2.e0 e0Var2;
        char c10;
        int i15;
        char c11;
        m2.q0 q0Var2;
        r2.e0 e0Var3;
        int i16;
        c1 c1Var2;
        int i17;
        int i18;
        p0 a10;
        r rVar2;
        c1 c1Var3;
        int i19;
        int i20;
        r2.e0 e0Var4;
        p0 p0Var2;
        m2.q0 q0Var3;
        r rVar3 = (r) mVar;
        rVar3.c0(-1922450045);
        if (rVar3.f(str)) {
            i13 = 4;
        } else {
            i13 = 2;
        }
        int i21 = i11 | i13;
        if (rVar3.g(z3)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i22 = i21 | i14 | 918642688;
        int i23 = i12 & 16384;
        if (i23 != 0) {
            i15 = 12807606;
            e0Var2 = e0Var;
        } else {
            e0Var2 = e0Var;
            if (rVar3.f(e0Var2)) {
                c10 = 16384;
            } else {
                c10 = 8192;
            }
            i15 = c10 | 3510;
        }
        int i24 = i15 | 840433664;
        if (rVar3.f(s1Var)) {
            c11 = 256;
        } else {
            c11 = 128;
        }
        int i25 = c11 | 22;
        if ((i22 & 306783379) == 306783378 && (i24 & 306783379) == 306783378 && (i25 & 147) == 146 && rVar3.D()) {
            rVar3.U();
            q0Var3 = q0Var;
            c1Var3 = c1Var;
            i19 = i;
            i20 = i10;
            p0Var2 = p0Var;
            rVar2 = rVar3;
            e0Var4 = e0Var2;
        } else {
            rVar3.W();
            if ((i11 & 1) != 0 && !rVar3.A()) {
                rVar3.U();
                q0Var2 = q0Var;
                c1Var2 = c1Var;
                i18 = i;
                i17 = i10;
                a10 = p0Var;
                e0Var3 = e0Var2;
            } else {
                q0Var2 = (m2.q0) rVar3.j(x1.f21744a);
                if (i23 != 0) {
                    e0Var3 = r2.d0.f24485u;
                } else {
                    e0Var3 = e0Var2;
                }
                c1 c1Var4 = c1.f17032b;
                if (z9) {
                    i16 = 1;
                } else {
                    i16 = Integer.MAX_VALUE;
                }
                j0 j0Var = j0.f21526a;
                c1Var2 = c1Var4;
                i17 = 1;
                i18 = i16;
                a10 = a(3, rVar3);
            }
            rVar3.q();
            rVar3.a0(30062948);
            Object O = rVar3.O();
            if (O == l.f24285a) {
                O = a.r(rVar3);
            }
            i iVar = (i) O;
            rVar3.p(false);
            rVar3.a0(30069058);
            long b10 = q0Var2.b();
            if (b10 == 16) {
                boolean booleanValue = ((Boolean) sc.a(iVar, rVar3, 0).getValue()).booleanValue();
                if (!z3) {
                    b10 = s1Var.f21661c;
                } else if (booleanValue) {
                    b10 = s1Var.f21659a;
                } else {
                    b10 = s1Var.f21660b;
                }
            }
            long j10 = b10;
            rVar3.p(false);
            rVar2 = rVar3;
            r2.e0 e0Var5 = e0Var3;
            y.a(p1.f19390a.a(s1Var.f21667k), h.d(-1886965181, new n0(rVar, pVar, (y2.c) rVar3.j(p1.f3606h), s1Var, str, lVar, z3, q0Var2.d(new m2.q0(j10, 0L, null, null, null, 0L, 0, 0L, null, 16777214)), d1Var, c1Var2, z9, i18, i17, e0Var5, iVar, a10), rVar2), rVar2, 56);
            c1Var3 = c1Var2;
            i19 = i18;
            i20 = i17;
            e0Var4 = e0Var5;
            p0Var2 = a10;
            q0Var3 = q0Var2;
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new o0(str, lVar, rVar, z3, q0Var3, pVar, e0Var4, d1Var, c1Var3, z9, i19, i20, p0Var2, s1Var, i11, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    public static final void b(df.p pVar, df.q qVar, df.p pVar2, df.p pVar3, df.p pVar4, df.p pVar5, df.p pVar6, boolean z3, float f10, df.l lVar, c cVar, df.p pVar7, j0 j0Var, m mVar, int i, int i10) {
        int i11;
        int i12;
        j0 j0Var2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        j jVar;
        df.p pVar8;
        df.p pVar9;
        j jVar2;
        df.p pVar10;
        float f11;
        f fVar;
        float f12;
        float f13;
        df.p pVar11;
        float f14;
        df.p pVar12;
        boolean z13;
        df.p pVar13;
        df.p pVar14;
        df.p pVar15;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        j jVar3 = c.f15674y;
        j jVar4 = c.f15670u;
        r rVar = (r) mVar;
        rVar.c0(1408290209);
        int i23 = i & 6;
        o oVar = o.f15687a;
        int i24 = 2;
        if (i23 == 0) {
            if (rVar.f(oVar)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i11 = i | i22;
        } else {
            i11 = i;
        }
        int i25 = 16;
        if ((i & 48) == 0) {
            if (rVar.h(pVar)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i11 |= i21;
        }
        int i26 = 128;
        if ((i & 384) == 0) {
            if (rVar.h(qVar)) {
                i20 = 256;
            } else {
                i20 = 128;
            }
            i11 |= i20;
        }
        int i27 = 1024;
        if ((i & 3072) == 0) {
            if (rVar.h(pVar2)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i11 |= i19;
        }
        if ((i & 24576) == 0) {
            if (rVar.h(pVar3)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i11 |= i18;
        }
        if ((196608 & i) == 0) {
            if (rVar.h(pVar4)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i11 |= i17;
        }
        if ((1572864 & i) == 0) {
            if (rVar.h(pVar5)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i11 |= i16;
        }
        if ((12582912 & i) == 0) {
            if (rVar.h(pVar6)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i11 |= i15;
        }
        if ((100663296 & i) == 0) {
            if (rVar.g(z3)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i11 |= i14;
        }
        if ((i & 805306368) == 0) {
            if (rVar.c(f10)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i11 |= i13;
        }
        if ((i10 & 6) == 0) {
            if (rVar.h(lVar)) {
                i24 = 4;
            }
            i12 = i10 | i24;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.h(cVar)) {
                i25 = 32;
            }
            i12 |= i25;
        }
        if ((i10 & 384) == 0) {
            if (rVar.h(pVar7)) {
                i26 = 256;
            }
            i12 |= i26;
        }
        if ((i10 & 3072) == 0) {
            j0Var2 = j0Var;
            if (rVar.f(j0Var2)) {
                i27 = 2048;
            }
            i12 |= i27;
        } else {
            j0Var2 = j0Var;
        }
        int i28 = i12;
        if ((i11 & 306783379) == 306783378 && (i28 & 1171) == 1170 && rVar.D()) {
            rVar.U();
            pVar15 = pVar2;
            pVar13 = pVar7;
            pVar14 = pVar;
            f14 = f10;
        } else {
            if ((i28 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z14 = z9;
            if ((i11 & 234881024) == 67108864) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z15 = z14 | z10;
            if ((i11 & 1879048192) == 536870912) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z16 = z15 | z11;
            if ((i28 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z17 = z16 | z12;
            Object O = rVar.O();
            if (z17 || O == l.f24285a) {
                O = new u0(lVar, z3, f10, j0Var2);
                rVar.k0(O);
            }
            u0 u0Var = (u0) O;
            y2.m mVar2 = (y2.m) rVar.j(p1.f3611n);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            r c10 = a.c(oVar, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            f fVar2 = g.e;
            y.I(fVar2, u0Var, rVar);
            f fVar3 = g.f1464d;
            y.I(fVar3, l10, rVar);
            f fVar4 = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar4);
            }
            f fVar5 = g.f1463c;
            y.I(fVar5, c10, rVar);
            cVar.invoke(rVar, Integer.valueOf((i28 >> 3) & 14));
            rVar.a0(250370369);
            if (pVar3 != null) {
                r d2 = androidx.compose.ui.layout.a.c(oVar, "Leading").d(o.i);
                jVar = jVar3;
                p0 d10 = m.d(jVar, false);
                int hashCode2 = Long.hashCode(rVar.T);
                g l11 = rVar.l();
                r c11 = a.c(d2, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                y.I(fVar2, d10, rVar);
                y.I(fVar3, l11, rVar);
                if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode2))) {
                    a.t(hashCode2, rVar, hashCode2, fVar4);
                }
                y.I(fVar5, c11, rVar);
                pVar3.invoke(rVar, Integer.valueOf((i11 >> 12) & 14));
                rVar.p(true);
            } else {
                jVar = jVar3;
            }
            Object r10 = 0;
            rVar.p(false);
            rVar.a0(250379492);
            if (pVar4 != null) {
                r d11 = androidx.compose.ui.layout.a.c(oVar, "Trailing").d(o.i);
                p0 d12 = m.d(jVar, false);
                int hashCode3 = Long.hashCode(rVar.T);
                g l12 = rVar.l();
                r c12 = a.c(d11, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                y.I(fVar2, d12, rVar);
                y.I(fVar3, l12, rVar);
                if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode3))) {
                    a.t(hashCode3, rVar, hashCode3, fVar4);
                }
                y.I(fVar5, c12, rVar);
                df.p pVar16 = pVar4;
                pVar16.invoke(rVar, Integer.valueOf((i11 >> 15) & 14));
                rVar.p(true);
                r10 = 0;
                pVar8 = pVar16;
            } else {
                pVar8 = pVar4;
            }
            rVar.p(r10);
            float e = androidx.compose.foundation.layout.a.e(j0Var2, mVar2);
            float d13 = androidx.compose.foundation.layout.a.d(j0Var2, mVar2);
            if (pVar3 != null) {
                e -= o.f22345c;
                float f15 = (float) r10;
                if (e < f15) {
                    e = f15;
                }
            }
            float f16 = e;
            if (pVar8 != null) {
                d13 -= o.f22345c;
                float f17 = (float) r10;
                if (d13 < f17) {
                    d13 = f17;
                }
            }
            rVar.a0(250410106);
            if (pVar5 != null) {
                r o10 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d.p(androidx.compose.foundation.layout.g(androidx.compose.ui.layout.a.c(oVar, "Prefix"), o.f22347f, Float.NaN), 3), f16, 0.0f, o.e, 0.0f, 10);
                jVar2 = jVar4;
                p0 d14 = m.d(jVar2, false);
                int hashCode4 = Long.hashCode(rVar.T);
                g l13 = rVar.l();
                r c13 = a.c(o10, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                y.I(fVar2, d14, rVar);
                y.I(fVar3, l13, rVar);
                if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode4))) {
                    a.t(hashCode4, rVar, hashCode4, fVar4);
                }
                y.I(fVar5, c13, rVar);
                df.p pVar17 = pVar5;
                pVar17.invoke(rVar, Integer.valueOf((i11 >> 18) & 14));
                rVar.p(true);
                pVar9 = pVar17;
            } else {
                pVar9 = pVar5;
                jVar2 = jVar4;
            }
            rVar.p(false);
            rVar.a0(250422072);
            if (pVar6 != null) {
                f11 = d13;
                r o11 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d.p(androidx.compose.foundation.layout.g(androidx.compose.ui.layout.a.c(oVar, "Suffix"), o.f22347f, Float.NaN), 3), o.e, 0.0f, f11, 0.0f, 10);
                p0 d15 = m.d(jVar2, false);
                fVar = fVar3;
                int hashCode5 = Long.hashCode(rVar.T);
                g l14 = rVar.l();
                r c14 = a.c(o11, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                y.I(fVar2, d15, rVar);
                y.I(fVar, l14, rVar);
                if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode5))) {
                    a.t(hashCode5, rVar, hashCode5, fVar4);
                }
                y.I(fVar5, c14, rVar);
                df.p pVar18 = pVar6;
                pVar18.invoke(rVar, Integer.valueOf((i11 >> 21) & 14));
                rVar.p(true);
                pVar10 = pVar18;
            } else {
                pVar10 = pVar6;
                f11 = d13;
                fVar = fVar3;
            }
            rVar.p(false);
            float f18 = o.f22347f;
            r p10 = androidx.compose.foundation.layout.d.p(androidx.compose.foundation.layout.g(oVar, f18, Float.NaN), 3);
            if (pVar9 == null) {
                f12 = f16;
            } else {
                f12 = 0;
            }
            if (pVar10 == null) {
                f13 = f11;
            } else {
                f13 = 0;
            }
            r o12 = androidx.compose.foundation.layout.a.o(p10, f12, 0.0f, f13, 0.0f, 10);
            rVar.a0(250444361);
            if (qVar != null) {
                qVar.b(androidx.compose.ui.layout.a.c(oVar, "Hint").d(o12), rVar, Integer.valueOf((i11 >> 3) & 112));
            }
            rVar.p(false);
            r d16 = androidx.compose.ui.layout.a.c(oVar, "TextField").d(o12);
            p0 d17 = m.d(jVar2, true);
            int hashCode6 = Long.hashCode(rVar.T);
            g l15 = rVar.l();
            r c15 = a.c(d16, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(fVar2, d17, rVar);
            y.I(fVar, l15, rVar);
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode6))) {
                a.t(hashCode6, rVar, hashCode6, fVar4);
            }
            y.I(fVar5, c15, rVar);
            df.p pVar19 = pVar;
            pVar19.invoke(rVar, Integer.valueOf((i11 >> 3) & 14));
            rVar.p(true);
            rVar.a0(250455481);
            if (pVar2 != null) {
                f14 = f10;
                r c16 = androidx.compose.ui.layout.a.c(androidx.compose.foundation.layout.d.p(androidx.compose.foundation.layout.g(oVar, c7.b(f18, o.f22348g, f14), Float.NaN), 3), "Label");
                p0 d18 = m.d(jVar2, false);
                int hashCode7 = Long.hashCode(rVar.T);
                g l16 = rVar.l();
                r c17 = a.c(c16, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                y.I(fVar2, d18, rVar);
                y.I(fVar, l16, rVar);
                if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode7))) {
                    a.t(hashCode7, rVar, hashCode7, fVar4);
                }
                y.I(fVar5, c17, rVar);
                df.p pVar20 = pVar2;
                pVar20.invoke(rVar, Integer.valueOf((i11 >> 9) & 14));
                rVar.p(true);
                pVar11 = pVar20;
            } else {
                pVar11 = pVar2;
                f14 = f10;
            }
            rVar.p(false);
            rVar.a0(250473414);
            if (pVar7 != null) {
                r p11 = androidx.compose.foundation.layout.d.p(androidx.compose.foundation.layout.g(androidx.compose.ui.layout.a.c(oVar, "Supporting"), o.f22349h, Float.NaN), 3);
                float f19 = o.f22344b;
                r j10 = androidx.compose.foundation.layout.a.j(p11, new k0(f19, o.f22346d, f19, 0));
                p0 d19 = m.d(jVar2, false);
                int hashCode8 = Long.hashCode(rVar.T);
                g l17 = rVar.l();
                r c18 = a.c(j10, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                y.I(fVar2, d19, rVar);
                y.I(fVar, l17, rVar);
                if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode8))) {
                    a.t(hashCode8, rVar, hashCode8, fVar4);
                }
                y.I(fVar5, c18, rVar);
                df.p pVar21 = pVar7;
                pVar21.invoke(rVar, Integer.valueOf((i28 >> 6) & 14));
                z13 = true;
                rVar.p(true);
                pVar12 = pVar21;
            } else {
                pVar12 = pVar7;
                z13 = true;
            }
            rVar.p(false);
            rVar.p(z13);
            pVar15 = pVar11;
            pVar14 = pVar19;
            pVar13 = pVar12;
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new p0(pVar14, qVar, pVar15, pVar3, pVar4, pVar5, pVar6, z3, f14, lVar, cVar, pVar13, j0Var2, i, i10);
        }
    }

    public static final int c(int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, float f11, j0 j0Var) {
        int b10 = ac.b(i13, i15, i11, i12, c7.c(i14, 0, f10));
        float d2 = j0Var.d() * f11;
        return Math.max(y2.a.i(j10), Math.max(i, Math.max(i10, ff.a.b(c7.b(d2, Math.max(d2, i14 / 2.0f), f10) + b10 + (j0Var.c() * f11)))) + i16);
    }

    public static final int d(int i, int i10, int i11, int i12, int i13, int i14, int i15, float f10, long j10, float f11, j0 j0Var) {
        int i16 = i11 + i12;
        int max = Math.max(i13 + i16, Math.max(i15 + i16, c7.c(i14, 0, f10))) + i + i10;
        y2.m mVar = y2.m.f30814u;
        return Math.max(max, Math.max(ff.a.b((i14 + ((j0Var.a(mVar) + j0Var.b(mVar)) * f11)) * f10), y2.a.j(j10)));
    }

    public static final int e(boolean z3, int i, int i10, a1 a1Var, a1 a1Var2) {
        int i11;
        if (z3) {
            i10 = Math.round((1 + 0.0f) * ((i - a1Var2.f31770v) / 2.0f));
        }
        float f10 = o.f22344b;
        if (a1Var != null) {
            i11 = a1Var.f31770v;
        } else {
            i11 = 0;
        }
        return Math.max(i10, i11 / 2);
    }
}