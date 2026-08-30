package w7;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import c.d;
import c.k;
import c.m;
import d.f;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import h0.a;
import h8.c;
import h9.c;
import k.a;
import k1.l0;
import k1.r;
import m1.d;
import m2.f0;
import o0.x1;
import p.a;
import p.p0;
import p7.h0;
import q2.s;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import sa.a;
import w7.h8;
import x.b;
import x.h;
import x.m;
import x.p;
import x.q;
import x.r;
import y2.c;
import z0.g;
import z0.h;
import z1.p0;

import androidx.compose.foundation.layout.FillElement;
import ya.ae;

/* loaded from: classes.dex */
public abstract class h8 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f28370a = 14;

    public static final void a(u7.i7 i7Var, boolean z3, boolean z9, df.a aVar, boolean z10, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11;
        r rVar;
        boolean z12;
        float f10;
        long j10;
        float f11;
        boolean z13;
        boolean z14;
        long c10;
        s sVar;
        r rVar2 = (r) mVar;
        rVar2.c0(-1468479982);
        if (rVar2.h(i7Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i15 = i | i10;
        if (rVar2.g(z3)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i16 = i15 | i11;
        if (rVar2.g(z9)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i17 = i16 | i12;
        if (rVar2.h(aVar)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i18 = i17 | i13;
        if (rVar2.g(z10)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i19 = i18 | i14;
        if ((i19 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar2.R(i19 & 1, z11)) {
            o oVar = o.f15687a;
            r n10 = androidx.compose.foundation.layout.d.n(oVar, 76);
            Object O = rVar2.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = a.r(rVar2);
            }
            r e = androidx.compose.foundation.a.e(n10, (v.i) O, null, false, null, aVar, 28);
            r a10 = q.a(h.f29962b, c.H, rVar2, 48);
            int hashCode = Long.hashCode(rVar2.T);
            g l10 = rVar2.l();
            r c11 = a.c(e, rVar2);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            f fVar = g.e;
            y.I(fVar, a10, rVar2);
            f fVar2 = g.f1464d;
            y.I(fVar2, l10, rVar2);
            f fVar3 = g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar3);
            }
            f fVar4 = g.f1463c;
            y.I(fVar4, c11, rVar2);
            float f12 = 5;
            r a11 = wa.j7.a(androidx.compose.foundation.layout.f(androidx.compose.foundation.layout.d.n(oVar, 60), 90), f0.e.a(f12));
            if (z3) {
                f10 = 2;
            } else {
                f10 = 1;
            }
            if (z3) {
                j10 = r.f19515d;
                f11 = 0.92f;
            } else {
                j10 = r.f19515d;
                f11 = 0.16f;
            }
            r a12 = ya.a(a11, f10, r.c(j10, f11), f0.e.a(f12));
            p0 d2 = m.d(c.f15670u, false);
            int hashCode2 = Long.hashCode(rVar2.T);
            g l11 = rVar2.l();
            r c12 = a.c(a12, rVar2);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(fVar, d2, rVar2);
            y.I(fVar2, l11, rVar2);
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar2, hashCode2, fVar3);
            }
            y.I(fVar4, c12, rVar2);
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            boolean h3 = rVar2.h(i7Var);
            if ((i19 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z15 = h3 | z13;
            Object O2 = rVar2.O();
            if (!z15 && O2 != v0Var) {
                z12 = z9;
            } else {
                z12 = z9;
                O2 = new b8.na(2, i7Var, z12);
                rVar2.k0(O2);
            }
            ya.ta.a(fillElement, (df.l) O2, rVar2, 6);
            if (z10) {
                rVar2.a0(-822479083);
                z14 = false;
                x7.a(0, androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.b.f501a.a(oVar, c.f15672w), 3), rVar2);
            } else {
                z14 = false;
                rVar2.a0(-833846132);
            }
            rVar2.p(z14);
            rVar2.p(true);
            b.b(androidx.compose.foundation.layout.f(oVar, f12), rVar2);
            String b10 = wa.n7.b(i7Var.f26340b, rVar2);
            if (z3) {
                c10 = r.f19515d;
            } else {
                c10 = r.c(r.f19515d, 0.72f);
            }
            long j11 = c10;
            long f13 = ae.f(4294967296L, 10.5f);
            if (z3) {
                sVar = s.A;
            } else {
                sVar = s.f23367y;
            }
            x1.b(b10, null, j11, f13, null, sVar, null, 0L, null, 0L, 2, false, 1, 0, null, rVar2, 0, 3120, 120786);
            rVar = rVar2;
            rVar.p(true);
        } else {
            rVar = rVar2;
            z12 = z9;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new x7.r(i7Var, z3, z12, aVar, z10, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x013f, code lost:
    
        if (kotlin.jvm.internal.l.a(r14.O(), java.lang.Integer.valueOf(r2)) == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x041e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(u7.m3 r59, int r60, int r61, df.a r62, m r63, int r64) {
        /*
            Method dump skipped, instructions count: 1549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.h8.b(u7.m3, int, int, df.a, m, int):void");
    }

    public static final void c(final p pVar, final u7.m3 m3Var, final e3 e3Var, final boolean z3, final int i, final int i10, final boolean z9, final a1 a1Var, m mVar, final int i11) {
        int i12;
        e3 e3Var2;
        boolean z10;
        r rVar;
        boolean z11;
        boolean z12;
        float f10;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        pVar.getClass();
        a1Var.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(-351501025);
        if ((i11 & 6) == 0) {
            if (rVar2.f(pVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar2.h(m3Var)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i11 & 384) == 0) {
            e3Var2 = e3Var;
            if (rVar2.f(e3Var2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        } else {
            e3Var2 = e3Var;
        }
        if ((i11 & 3072) == 0) {
            if (rVar2.g(z3)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i12 |= i17;
        }
        if ((i11 & 24576) == 0) {
            if (rVar2.d(i)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i12 |= i16;
        }
        if ((196608 & i11) == 0) {
            if (rVar2.d(i10)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        if ((1572864 & i11) == 0) {
            if (rVar2.g(z9)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i12 |= i14;
        }
        if ((12582912 & i11) == 0) {
            if (rVar2.f(a1Var)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i12 |= i13;
        }
        boolean z14 = true;
        if ((4793491 & i12) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.R(i12 & 1, z10)) {
            boolean m4 = e3Var2.m();
            String B = qe.l.B(qe.m.h(Boolean.valueOf(e3Var2.j()), Boolean.valueOf(e3Var2.i()), Boolean.valueOf(e3Var2.c()), Boolean.valueOf(e3Var2.a()), Boolean.valueOf(e3Var2.n()), Boolean.valueOf(e3Var2.b()), Boolean.valueOf(e3Var2.k()), Boolean.valueOf(e3Var2.r())), "", null, null, null, 62);
            int i21 = i12 & 29360128;
            if (i21 == 8388608) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object O = rVar2.O();
            v0 v0Var = l.f24285a;
            if (z11 || O == v0Var) {
                O = new b8.h0(a1Var, null, 3);
                rVar2.k0(O);
            }
            y.f((df.p) O, B, rVar2);
            if (((Boolean) a1Var.getValue()).booleanValue() && !z3) {
                rVar2.a0(-435337754);
                FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
                Object O2 = rVar2.O();
                if (O2 == v0Var) {
                    O2 = a.r(rVar2);
                }
                v.i iVar = (v.i) O2;
                if (i21 == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Object O3 = rVar2.O();
                if (z13 || O3 == v0Var) {
                    O3 = new u7.k4(a1Var, 21);
                    rVar2.k0(O3);
                }
                r e = androidx.compose.foundation.a.e(fillElement, iVar, null, false, null, (df.a) O3, 28);
                z12 = false;
                m.a(0, e, rVar2);
            } else {
                z12 = false;
                rVar2.a0(-457039645);
            }
            rVar2.p(z12);
            if (!((Boolean) a1Var.getValue()).booleanValue() || z3 || !z9 || m4) {
                z14 = false;
            }
            r a10 = pVar.a(o.f15687a, c.B);
            if (e3Var2.p() > 0) {
                rVar2.a0(1510002458);
                f10 = ((c) rVar2.j(c2.p1.f3606h)).Y(e3Var2.p());
                rVar2.p(false);
            } else {
                rVar2.a0(1510005249);
                rVar2.p(false);
                f10 = 132;
            }
            r o10 = androidx.compose.foundation.layout.a.o(a10, 0.0f, 0.0f, 0.0f, f10 - f28370a, 7);
            q.r0 r8 = q.e.r(0.8f, 520.0f, null, 4);
            Object O4 = rVar2.O();
            if (O4 == v0Var) {
                O4 = new f0(13);
                rVar2.k0(O4);
            }
            p0 a11 = androidx.compose.animation.k((df.l) O4, r8).a(androidx.compose.animation.d(q.e.r(0.8f, 520.0f, null, 4), 2));
            q.r0 r10 = q.e.r(1.0f, 800.0f, null, 4);
            Object O5 = rVar2.O();
            if (O5 == v0Var) {
                O5 = new f0(13);
                rVar2.k0(O5);
            }
            boolean z15 = z14;
            rVar = rVar2;
            ya.c(z15, o10, a11, androidx.compose.animation.m((df.l) O5, r10).a(androidx.compose.animation.c.e(q.e.r(1.0f, 800.0f, null, 4), 2)), null, h.d(1166192455, new c8(m3Var, i, i10, a1Var), rVar2), rVar, 196608, 16);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p() { // from class: w7.d8
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c(p.this, m3Var, e3Var, z3, i, i10, z9, a1Var, (m) obj, y.L(i11 | 1));
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final void d(boolean z3, String str, m mVar, int i) {
        int i10;
        int i11;
        boolean z9;
        long j10;
        long j11;
        long j12;
        float f10;
        str.getClass();
        r rVar = (r) mVar;
        rVar.c0(-856300767);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i;
        if (rVar.f(str)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        boolean z10 = true;
        if ((i13 & 19) != 18) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i13 & 1, z9)) {
            if (z3) {
                j10 = 4294835189L;
            } else {
                j10 = 4290756543L;
            }
            final long d2 = l0.d(j10);
            if (z3) {
                j11 = 4293320914L;
            } else {
                j11 = 4288585374L;
            }
            final long d10 = l0.d(j11);
            if (z3) {
                j12 = 4284186553L;
            } else {
                j12 = 4286216826L;
            }
            final long d11 = l0.d(j12);
            if (z3) {
                f10 = 1.0f;
            } else {
                f10 = 0.92f;
            }
            r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 52);
            if ((i13 & 112) != 32) {
                z10 = false;
            }
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (z10 || O == v0Var) {
                O = new b8.w(str, 18);
                rVar.k0(O);
            }
            r a10 = j2.a(k3, false, (df.l) O);
            boolean c10 = rVar.c(f10) | rVar.e(d10) | rVar.e(d2) | rVar.e(d11);
            Object O2 = rVar.O();
            if (c10 || O2 == v0Var) {
                final float f11 = f10;
                O2 = new df.l() { // from class: w7.b8
                    @Override // df.l
                    public final Object invoke(Object obj) {
                        float f12;
                        d dVar = (d) obj;
                        dVar.getClass();
                        char c11 = ' ';
                        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() >> 32));
                        long j13 = 4294967295L;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.e() & 4294967295L));
                        float f13 = intBitsToFloat * 0.58f;
                        float f14 = f13 / 0.6666667f;
                        float f15 = ((intBitsToFloat - f13) / 2.0f) - (intBitsToFloat * 0.03f);
                        float f16 = (0.02f * intBitsToFloat2) + ((intBitsToFloat2 - f14) / 2.0f);
                        float f17 = intBitsToFloat * 0.045f;
                        long floatToRawIntBits = (Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L);
                        int i14 = 3;
                        while (true) {
                            f12 = f11;
                            if (i14 <= 0) {
                                break;
                            }
                            char c12 = c11;
                            d.z0(dVar, r.c(r.f19513b, f12 * 0.1f), (Float.floatToRawIntBits(((0.022f * intBitsToFloat) + f15) - r4) << c12) | (Float.floatToRawIntBits(((intBitsToFloat2 * 0.03f) + f16) - r4) & 4294967295L), (Float.floatToRawIntBits(f14 + r4) & 4294967295L) | (Float.floatToRawIntBits(f13 + (((0.012f * intBitsToFloat) * i14) * 2.0f)) << c12), floatToRawIntBits, null, 240);
                            i14--;
                            c11 = c12;
                            intBitsToFloat = intBitsToFloat;
                        }
                        char c13 = c11;
                        d.z0(dVar, r.c(d10, f12), (Float.floatToRawIntBits((intBitsToFloat * 0.075f) + f15) << c13) | (Float.floatToRawIntBits(f16 - (0.045f * intBitsToFloat2)) & 4294967295L), (Float.floatToRawIntBits(f13) << c13) | (Float.floatToRawIntBits(f14) & 4294967295L), floatToRawIntBits, null, 240);
                        d.z0(dVar, r.c(d2, f12), (Float.floatToRawIntBits(f15) << c13) | (Float.floatToRawIntBits(f16) & 4294967295L), (Float.floatToRawIntBits(f13) << c13) | (Float.floatToRawIntBits(f14) & 4294967295L), floatToRawIntBits, null, 240);
                        float f18 = 0.16f;
                        float f19 = f13 * 0.16f;
                        float f20 = intBitsToFloat2 * 0.022f;
                        int i15 = 1;
                        while (i15 < 5) {
                            float f21 = ((((i15 - 1) * f18) + 0.2f) * f14) + f16;
                            long j14 = j13;
                            d.n0(dVar, r.c(d11, f12), (Float.floatToRawIntBits(f15 + f19) << c13) | (Float.floatToRawIntBits(f21) & j13), (Float.floatToRawIntBits((f15 + f13) - f19) << c13) | (Float.floatToRawIntBits(f21) & j14), f20, 0, null, 496);
                            i15++;
                            j13 = j14;
                            f18 = 0.16f;
                        }
                        return pe.z.f22715a;
                    }
                };
                rVar.k0(O2);
            }
            ya.ta.a(a10, (df.l) O2, rVar, 0);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new h0(i, str, z3);
        }
    }
}
