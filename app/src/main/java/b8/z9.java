package b8;
import a.a;
import a0.l0;
import a1.g;
import a1.i;
import a6.f;
import b1.o;
import b2.b0;
import b2.h;
import b8.ca;
import b8.o5;
import b8.z9;
import c2.p1;
import d.d;
import d1.c;
import d1.j;
import d1.r;
import f0.e;
import g0.d1;
import k1.r0;
import m2.q0;
import o0.x1;
import q2.s;
import r0.a1;
import r0.l;
import r0.m;
import r0.o2;
import r0.q1;
import r0.v0;
import r0.y;
import u7.m3;
import x2.k;
import x7.h0;
import x7.m0;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.daren.scraply.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ya.ae;
import ya.we;

/* loaded from: classes.dex */
public abstract class z9 {

    /* renamed from: a, reason: collision with root package name */
    public static final q.t f3099a = new q.t(0.05f, 0.7f, 0.1f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final q.t f3100b = new q.t(0.3f, 0.0f, 0.8f, 0.15f);

    /* renamed from: c, reason: collision with root package name */
    public static final List f3101c = qe.h(new g4(l0.d(4293438136L), l0.d(4286191666L), l0.d(4290259026L)), new g4(l0.d(4293250746L), l0.d(4284103972L), l0.d(4287258426L)), new g4(l0.d(4293967275L), l0.d(4286458392L), l0.d(4290266413L)), new g4(l0.d(4290436815L), l0.d(4279981120L), l0.d(4280844900L)), new g4(l0.d(4290302952L), l0.d(4279977064L), l0.d(4281035678L)), new g4(l0.d(4292133611L), l0.d(4283180154L), l0.d(4286005941L)), new g4(l0.d(4293976230L), l0.d(4285223694L), l0.d(4288576539L)), new g4(l0.d(4291747512L), l0.d(4281881109L), l0.d(4284121125L)));

    /* renamed from: d, reason: collision with root package name */
    public static final float f3102d = 118;

    public static final void a(boolean z3, c cVar, m mVar, int i) {
        int i10;
        boolean z9;
        q1 t3;
        d8 d8Var;
        r rVar = (r) mVar;
        rVar.c0(-1436105334);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 19) != 18) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i11 & 1, z9)) {
            if (!z3) {
                rVar.a0(-844677170);
                cVar.invoke(rVar, 6);
                rVar.p(false);
                t3 = rVar.t();
                if (t3 != null) {
                    d8Var = new d8(z3, cVar, i, 2);
                    t3.f24332d = d8Var;
                }
                return;
            }
            rVar.a0(-962505256);
            rVar.p(false);
            z1.p0 d2 = x.d(c.f15670u, false);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            o oVar = o.f15687a;
            r c10 = a.c(oVar, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(g.e, d2, rVar);
            y.I(g.f1464d, l10, rVar);
            f fVar = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar);
            cVar.invoke(rVar, 6);
            h0.a(0, androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.b.f501a.a(oVar, c.f15672w), 4, -4), rVar);
            rVar.p(true);
        } else {
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            d8Var = new d8(z3, cVar, i, 3);
            t3.f24332d = d8Var;
        }
    }

    public static final void b(boolean z3, c cVar, m mVar, int i) {
        int i10;
        boolean z9;
        int i11;
        q1 t3;
        d8 d8Var;
        r rVar = (r) mVar;
        rVar.c0(883129426);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i;
        int i13 = 0;
        if ((i12 & 19) != 18) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i12 & 1, z9)) {
            if (!z3) {
                rVar.a0(-1660832359);
                cVar.invoke(rVar, 6);
                rVar.p(false);
                t3 = rVar.t();
                if (t3 != null) {
                    d8Var = new d8(z3, cVar, i, i13);
                    t3.f24332d = d8Var;
                }
                return;
            }
            rVar.a0(-1777529968);
            rVar.p(false);
            j jVar = c.f15670u;
            z1.p0 d2 = x.d(jVar, false);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            o oVar = o.f15687a;
            r c10 = a.c(oVar, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(g.e, d2, rVar);
            y.I(g.f1464d, l10, rVar);
            f fVar = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar);
            cVar.invoke(rVar, 6);
            String b10 = wa.n7.b(R.string.taller_badge, rVar);
            long d10 = l0.d(4280949248L);
            long e = ae.e(9);
            s sVar = s.D;
            long e8 = ae.e(1);
            r h3 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.b.f501a.a(oVar, jVar), -6, 6);
            Object O = rVar.O();
            int i14 = 3;
            if (O == l.f24285a) {
                O = new b7(i14);
                rVar.k0(O);
            }
            i11 = 1;
            x1.b(b10, androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a(h3, (df.l) O), l0.d(4294947584L), e.a(3)), 8, 2), d10, e, null, sVar, null, e8, null, 0L, 0, false, 0, 0, null, rVar, 12782976, 0, 130896);
            rVar = rVar;
            rVar.p(true);
        } else {
            i11 = 1;
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            d8Var = new d8(z3, cVar, i, i11);
            t3.f24332d = d8Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0199, code lost:
    
        if (kotlin.jvm.internal.a(r12.O(), java.lang.Integer.valueOf(r13)) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(ca r42, final java.io.File r43, final java.util.List r44, final boolean r45, final e r46, final df.l r47, final m r48, final df.p r49, final df.a r50, final df.a r51, final df.a r52, final df.a r53, m r54, final int r55) {
        /*
            Method dump skipped, instructions count: 1279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.z9.c(ca, java.io.File, java.util.List, boolean, e, df.l, m, df.p, df.a, df.a, df.a, df.a, m, int):void");
    }

    public static final void d(File file, df.l lVar, df.a aVar, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z3;
        boolean z9;
        boolean z10;
        r rVar = (r) mVar;
        rVar.c0(48130200);
        int i13 = 2;
        if (rVar.h(file)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i | i10;
        if (rVar.h(lVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar.h(aVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        int i17 = 1;
        if ((i16 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i16 & 1, z3)) {
            f j10 = j(file, 900, rVar, (i16 & 14) | 48);
            int i18 = i16 & 112;
            if (i18 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (z9 || O == v0Var) {
                O = new o(i17, lVar);
                rVar.k0(O);
            }
            y.c(pe.z.f22715a, (df.l) O, rVar);
            float f10 = 190;
            float f11 = m0.f30239a;
            d a10 = e.a(0.05333333f * f10);
            r n10 = androidx.compose.foundation.layout.d.n(androidx.compose.foundation.layout.f(o.f15687a, f10), f10 * 1.3333334f);
            if (i18 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object O2 = rVar.O();
            if (z10 || O2 == v0Var) {
                O2 = new o(i13, lVar);
                rVar.k0(O2);
            }
            r b10 = androidx.compose.foundation.a.b(wa.a(wa.a(androidx.compose.ui.layout.a.d(n10, (df.l) O2), 8, a10, 0L, r.f19513b, 12), a10), l0.d(4294439916L), l0.f19495a);
            Object O3 = rVar.O();
            if (O3 == v0Var) {
                O3 = a.r(rVar);
            }
            r e = androidx.compose.foundation.a.e(b10, (i) O3, null, false, null, aVar, 28);
            z1.p0 d2 = x.d(c.f15670u, false);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            r c10 = a.c(e, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(g.e, d2, rVar);
            y.I(g.f1464d, l10, rVar);
            f fVar = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar);
            if (j10 != null) {
                rVar.a0(61771634);
                ya.wa.b(j10, null, androidx.compose.foundation.layout.d.f506c, z1.n.f31848a, rVar, 25008, 232);
            } else {
                rVar.a0(-95634896);
            }
            rVar.p(false);
            rVar.p(true);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new g(file, lVar, aVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0490  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.util.List r33, final f r34, final df.l r35, final o5 r36, final df.l r37, final java.util.List r38, final java.util.Map r39, final boolean r40, final df.l r41, final java.lang.String r42, final df.l r43, final df.l r44, final df.a r45, final df.a r46, final df.l r47, final e r48, final java.util.Set r49, final java.util.Set r50, final m r51, final df.l r52, m r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.z9.e(java.util.List, f, df.l, o5, df.l, java.util.List, java.util.Map, boolean, df.l, java.lang.String, df.l, df.l, df.a, df.a, df.l, e, java.util.Set, java.util.Set, m, df.l, m, int):void");
    }

    public static final void f(String str, String str2, boolean z3, df.a aVar, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        r rVar;
        long j10;
        String str3;
        long j11;
        r rVar2 = (r) mVar;
        rVar2.c0(-256933040);
        if (rVar2.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i | i10;
        if (rVar2.f(str2)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar2.g(z3)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 1171) != 1170) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar2.R(i15 & 1, z9)) {
            o oVar = o.f15687a;
            r a10 = wa.a(androidx.compose.foundation.layout.d(oVar, 1.0f), e.a(12));
            if (z3) {
                j10 = r.c(r.f19515d, 0.1f);
            } else {
                j10 = r.f19520k;
            }
            r b10 = androidx.compose.foundation.a.b(a10, j10, l0.f19495a);
            Object O = rVar2.O();
            if (O == l.f24285a) {
                O = a.r(rVar2);
            }
            r k3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.a.e(b10, (i) O, null, false, null, aVar, 28), 14);
            x.r a11 = x.q.a(x.h.i(3), c.G, rVar2, 6);
            int hashCode = Long.hashCode(rVar2.T);
            g l10 = rVar2.l();
            r c10 = a.c(k3, rVar2);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(g.e, a11, rVar2);
            y.I(g.f1464d, l10, rVar2);
            f fVar = g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar2);
            if (z3) {
                str3 = "●  ";
            } else {
                str3 = "○  ";
            }
            String g8 = a.g(str3, str);
            if (z3) {
                j11 = kb.f2336c;
            } else {
                j11 = r.f19515d;
            }
            x1.b(g8, null, j11, ae.e(14), null, s.B, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, 199680, 0, 131026);
            x1.b(str2, androidx.compose.foundation.layout.a.o(oVar, 20, 0.0f, 0.0f, 0.0f, 14), r.c(r.f19515d, 0.5f), ae.e(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, ((i15 >> 3) & 14) | 3504, 0, 131056);
            rVar = rVar2;
            rVar.p(true);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new w8(str, str2, z3, aVar, i, 0);
        }
    }

    public static final void g(int i, int i10, final long j10, r rVar, m mVar) {
        int i11;
        boolean z3;
        r rVar2;
        int i12;
        r rVar3 = (r) mVar;
        rVar3.c0(634684681);
        if (rVar3.d(i)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i13 = i10 | i11;
        if ((i10 & 48) == 0) {
            if (rVar3.e(j10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i13 |= i12;
        }
        boolean z9 = false;
        if ((i13 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar3.R(i13 & 1, z3)) {
            final int abs = Math.abs(i);
            float f10 = (float) 0.8d;
            rVar2 = rVar;
            r l10 = androidx.compose.foundation.layout.a.l(ya.a(androidx.compose.foundation.a.b(wa.a(rVar2, e.a(f10)), r.c(r.f19515d, 0.72f), l0.f19495a), (float) 0.25d, r.c(r.f19513b, 0.15f), e.a(f10)), f10, (float) 0.4d);
            z1.p0 d2 = x.d(c.f15670u, false);
            int hashCode = Long.hashCode(rVar3.T);
            g l11 = rVar3.l();
            r c10 = a.c(l10, rVar3);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(b0Var);
            } else {
                rVar3.n0();
            }
            y.I(g.e, d2, rVar3);
            y.I(g.f1464d, l11, rVar3);
            f fVar = g.f1465f;
            if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar3, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar3);
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            boolean d10 = rVar3.d(abs);
            if ((i13 & 112) == 32) {
                z9 = true;
            }
            boolean z10 = d10 | z9;
            Object O = rVar3.O();
            if (z10 || O == l.f24285a) {
                O = new df.l() { // from class: b8.f8
                    @Override // df.l
                    public final Object invoke(Object obj) {
                        float f11;
                        double d11;
                        d dVar = (d) obj;
                        dVar.getClass();
                        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.e() & 4294967295L));
                        int i14 = 1575931494 ^ abs;
                        long c11 = r.c(j10, 0.85f);
                        float f12 = intBitsToFloat2 * 0.75f;
                        float f13 = 0.3f;
                        while (f13 < intBitsToFloat - 0.6f) {
                            int i15 = ((i14 * 1103515245) + 12345) & Integer.MAX_VALUE;
                            float f14 = (r2 & 65535) / 65535.0f;
                            if (f14 > 0.62f) {
                                f11 = 1;
                            } else {
                                f11 = (float) 0.5d;
                            }
                            float l0 = dVar.l0(f11);
                            if (f14 < 0.35f) {
                                d11 = 0.8d;
                            } else {
                                d11 = 0.45d;
                            }
                            float l02 = dVar.l0((float) d11);
                            if (f13 + l0 > intBitsToFloat) {
                                break;
                            }
                            long j11 = c11;
                            d.t(dVar, j11, (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(l0) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), 0.0f, null, 120);
                            f13 = l0 + l02 + f13;
                            c11 = j11;
                            i14 = i15;
                        }
                        float f15 = intBitsToFloat2 - 0.2f;
                        d.n0(dVar, r.c(c11, 0.35f), (Float.floatToRawIntBits(0.3f) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat - 0.3f) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), dVar.l0((float) 0.3d), 0, null, 496);
                        return pe.z.f22715a;
                    }
                };
                rVar3.k0(O);
            }
            ya.a(fillElement, (df.l) O, rVar3, 6);
            rVar3.p(true);
        } else {
            rVar2 = rVar;
            rVar3.U();
        }
        q1 t3 = rVar3.t();
        if (t3 != null) {
            t3.f24332d = new g8(i, j10, rVar2, i10);
        }
    }

    public static final void h(w7.s9 s9Var, h hVar, df.a aVar, float f10, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(1862988885);
        if (rVar.h(s9Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i10 | i;
        if (rVar.f(hVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar.h(aVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if (rVar.c(f10)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i17 = i16 | i13;
        if ((i17 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i17 & 1, z3)) {
            o2 o2Var = p1.f3606h;
            c cVar = (c) rVar.j(o2Var);
            a(o2Var.a(new d(cVar.a() * f10, cVar.i0())), h.d(-1160796267, new u2(s9Var, hVar, aVar, 2), rVar), rVar, 56);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new v2(s9Var, hVar, aVar, f10, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x014d, code lost:
    
        if (r3 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013c, code lost:
    
        if (r3 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0252, code lost:
    
        if (kotlin.jvm.internal.a(r11.O(), java.lang.Integer.valueOf(r3)) == false) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(w7.s9 r65, h r66, df.a r67, m r68, int r69) {
        /*
            Method dump skipped, instructions count: 2026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.z9.i(w7.s9, h, df.a, m, int):void");
    }

    public static final void j(ArrayList arrayList, Map map, boolean z3, df.l lVar, l0 l0Var, Set set, r rVar, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z9;
        r rVar2;
        q1 t3;
        a8 a8Var;
        boolean z10;
        r rVar3 = (r) mVar;
        rVar3.c0(179452940);
        if (rVar3.h(arrayList)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i16 = i | i10;
        if (rVar3.h(map)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i17 = i16 | i11;
        if (rVar3.g(z3)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i18 = i17 | i12;
        if (rVar3.h(lVar)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i19 = i18 | i13;
        if (rVar3.f(l0Var)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i20 = i19 | i14;
        if (rVar3.h(set)) {
            i15 = 131072;
        } else {
            i15 = 65536;
        }
        int i21 = i20 | i15;
        if ((599187 & i21) != 599186) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar3.R(i21 & 1, z9)) {
            if (arrayList.isEmpty()) {
                rVar3.a0(-1150541024);
                boolean E = e1.E(!z3, 320L, rVar3, 48);
                if (!z3 && E) {
                    rVar3.a0(-1149990061);
                    r d2 = rVar.d(androidx.compose.foundation.layout.d.f506c);
                    z1.p0 d10 = x.d(c.f15674y, false);
                    int hashCode = Long.hashCode(rVar3.T);
                    g l10 = rVar3.l();
                    r c10 = a.c(d2, rVar3);
                    h.f1471d.getClass();
                    b0 b0Var = g.f1462b;
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(b0Var);
                    } else {
                        rVar3.n0();
                    }
                    f fVar = g.e;
                    y.I(fVar, d10, rVar3);
                    f fVar2 = g.f1464d;
                    y.I(fVar2, l10, rVar3);
                    f fVar3 = g.f1465f;
                    if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode))) {
                        a.t(hashCode, rVar3, hashCode, fVar3);
                    }
                    f fVar4 = g.f1463c;
                    y.I(fVar4, c10, rVar3);
                    h hVar = c.H;
                    x.e i22 = x.h.i(10);
                    o oVar = o.f15687a;
                    r k3 = androidx.compose.foundation.layout.a.k(oVar, 36);
                    x.r a10 = x.q.a(i22, hVar, rVar3, 54);
                    int hashCode2 = Long.hashCode(rVar3.T);
                    g l11 = rVar3.l();
                    r c11 = a.c(k3, rVar3);
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(b0Var);
                    } else {
                        rVar3.n0();
                    }
                    y.I(fVar, a10, rVar3);
                    y.I(fVar2, l11, rVar3);
                    if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode2))) {
                        a.t(hashCode2, rVar3, hashCode2, fVar3);
                    }
                    y.I(fVar4, c11, rVar3);
                    long j10 = r.f19515d;
                    f(64, r.c(j10, 0.18f), androidx.compose.foundation.layout.a.o(oVar, 0.0f, 0.0f, 0.0f, 6, 7), 0.0f, rVar3, 438, 8);
                    x1.b(wa.n7.b(R.string.universe_empty, rVar3), null, j10, ae.e(16), null, s.B, null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 200064, 0, 131026);
                    x1.b(wa.n7.b(R.string.universe_empty_hint_readonly, rVar3), null, r.c(j10, 0.45f), ae.e(13), null, null, null, 0L, new k(3), 0L, 0, false, 0, 0, null, rVar3, 3456, 0, 130546);
                    rVar3 = rVar3;
                    rVar3.p(true);
                    rVar3.p(true);
                    rVar3.p(false);
                    z10 = false;
                } else {
                    rVar3.a0(-1150094314);
                    z10 = false;
                    e1.o(6, 2, 0L, rVar, rVar3);
                    rVar3.p(false);
                }
                rVar3.p(z10);
                t3 = rVar3.t();
                if (t3 != null) {
                    a8Var = new a8(arrayList, map, z3, lVar, l0Var, set, rVar, i, 1);
                    t3.f24332d = a8Var;
                }
                return;
            }
            rVar2 = rVar;
            rVar3.a0(-1258070538);
            rVar3.p(false);
            x.a(rVar2, null, h.d(-116919562, new y8(l0Var, arrayList, set, map, lVar, 0), rVar3), rVar3, 3078);
        } else {
            rVar2 = rVar;
            rVar3.U();
        }
        t3 = rVar3.t();
        if (t3 != null) {
            a8Var = new a8(arrayList, map, z3, lVar, l0Var, set, rVar2, i, 0);
            t3.f24332d = a8Var;
        }
    }

    public static final void k(List list, m3 m3Var, df.a aVar, df.l lVar, m mVar, int i) {
        int i10;
        int i11;
        boolean z3;
        df.l lVar2;
        boolean z9;
        r rVar = (r) mVar;
        rVar.c0(-931566771);
        if (rVar.h(list)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i | i10;
        if (rVar.h(m3Var)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i13 & 1, z3)) {
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            x.r a10 = x.q.a(x.h.f29962b, c.G, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            r c10 = a.c(fillElement, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(g.e, a10, rVar);
            y.I(g.f1464d, l10, rVar);
            f fVar = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar);
            g(wa.n7.b(R.string.universe_publish, rVar), aVar, false, rVar, 48, 12);
            x1.b(wa.n7.b(R.string.universe_publish_pick, rVar), androidx.compose.foundation.layout.a.l(o.f15687a, 20, 8), r.c(r.f19515d, 0.6f), ae.e(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 3504, 0, 131056);
            rVar = rVar;
            if (1.0f <= 0.0d) {
                a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            boolean h3 = rVar.h(list);
            if ((i13 & 112) != 32 && !rVar.h(m3Var)) {
                z9 = false;
            } else {
                z9 = true;
            }
            boolean z10 = h3 | z9;
            Object O = rVar.O();
            if (!z10 && O != l.f24285a) {
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                O = new g(3, list, lVar2, m3Var);
                rVar.k0(O);
            }
            we.a(layoutWeightElement, null, null, null, null, null, false, null, (df.l) O, rVar, 0, 510);
            rVar.p(true);
        } else {
            lVar2 = lVar;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new q8(list, m3Var, aVar, lVar2, i, 1);
        }
    }

    public static final void l(int i, r rVar, df.a aVar, String str, m mVar, boolean z3) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z9;
        r rVar2;
        long j10;
        float f10;
        long c10;
        long c11;
        s sVar;
        r rVar3 = (r) mVar;
        rVar3.c0(-1744333144);
        if (rVar3.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i | i10;
        if (rVar3.g(z3)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar3.h(aVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if (rVar3.f(rVar)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i17 = i16 | i13;
        if ((i17 & 1171) != 1170) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar3.R(i17 & 1, z9)) {
            float f11 = 12;
            r a10 = wa.a(rVar, e.a(f11));
            if (z3) {
                j10 = kb.f2336c;
                f10 = 0.18f;
            } else {
                j10 = r.f19515d;
                f10 = 0.06f;
            }
            r b10 = androidx.compose.foundation.a.b(a10, r.c(j10, f10), l0.f19495a);
            float f12 = 1;
            if (z3) {
                c10 = kb.f2336c;
            } else {
                c10 = r.c(r.f19515d, 0.16f);
            }
            r a11 = ya.a(b10, f12, c10, e.a(f11));
            Object O = rVar3.O();
            if (O == l.f24285a) {
                O = a.r(rVar3);
            }
            r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.e(a11, (i) O, null, false, null, aVar, 28), 0.0f, 10, 1);
            z1.p0 d2 = x.d(c.f15674y, false);
            int hashCode = Long.hashCode(rVar3.T);
            g l10 = rVar3.l();
            r c12 = a.c(m4, rVar3);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(b0Var);
            } else {
                rVar3.n0();
            }
            y.I(g.e, d2, rVar3);
            y.I(g.f1464d, l10, rVar3);
            f fVar = g.f1465f;
            if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar3, hashCode, fVar);
            }
            y.I(g.f1463c, c12, rVar3);
            if (z3) {
                c11 = kb.f2336c;
            } else {
                c11 = r.c(r.f19515d, 0.8f);
            }
            long j11 = c11;
            long e = ae.e(13);
            if (z3) {
                sVar = s.B;
            } else {
                sVar = s.f23368z;
            }
            x1.b(str, null, j11, e, null, sVar, null, 0L, null, 0L, 0, false, 1, 0, null, rVar3, (i17 & 14) | 3072, 3072, 122834);
            rVar2 = rVar3;
            rVar2.p(true);
        } else {
            rVar2 = rVar3;
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new x8(str, z3, aVar, rVar, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
    
        if (kotlin.jvm.internal.a(r6.O(), java.lang.Integer.valueOf(r10)) == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(f r48, java.lang.String r49, df.a r50, df.r r51, m r52, int r53) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.z9.m(f, java.lang.String, df.a, df.r, m, int):void");
    }

    public static final void n(String str, String str2, df.l lVar, String str3, m mVar, int i, int i10) {
        int i11;
        int i12;
        String str4;
        int i13;
        int i14;
        boolean z3;
        String str5;
        String str6;
        o oVar;
        long j10;
        String str7;
        r rVar = (r) mVar;
        rVar.c0(747489970);
        if (rVar.f(str)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i15 = i | i11;
        if (rVar.f(str2)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i16 = i15 | i12;
        int i17 = i10 & 8;
        if (i17 != 0) {
            i14 = i16 | 3072;
            str4 = str3;
        } else {
            str4 = str3;
            if (rVar.f(str4)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i14 = i16 | i13;
        }
        int i18 = i14 | 24576;
        if ((i18 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i18 & 1, z3)) {
            if (i17 != 0) {
                str6 = "";
            } else {
                str6 = str4;
            }
            x.r a10 = x.q.a(x.h.i(6), c.G, rVar, 6);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            o oVar2 = o.f15687a;
            r c10 = a.c(oVar2, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            f fVar = g.e;
            y.I(fVar, a10, rVar);
            f fVar2 = g.f1464d;
            y.I(fVar2, l10, rVar);
            f fVar3 = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar3);
            }
            f fVar4 = g.f1463c;
            y.I(fVar4, c10, rVar);
            long j11 = r.f19515d;
            x1.b(str, null, r.c(j11, 0.55f), ae.e(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, (i18 & 14) | 3456, 0, 131058);
            rVar = rVar;
            float f10 = 12;
            r l11 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.b(wa.a(androidx.compose.foundation.layout.d(oVar2, 1.0f), e.a(10)), r.c(j11, 0.08f), l0.f19495a), f10, f10);
            boolean z9 = false;
            z1.p0 d2 = x.d(c.f15670u, false);
            int hashCode2 = Long.hashCode(rVar.T);
            g l12 = rVar.l();
            r c11 = a.c(l11, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(fVar, d2, rVar);
            y.I(fVar2, l12, rVar);
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar, hashCode2, fVar3);
            }
            y.I(fVar4, c11, rVar);
            if (str2.length() == 0 && str6.length() > 0) {
                rVar.a0(-720739039);
                j10 = j11;
                String str8 = str6;
                oVar = oVar2;
                x1.b(str8, null, r.c(j11, 0.28f), ae.e(15), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, ((i18 >> 9) & 14) | 3456, 0, 131058);
                rVar = rVar;
                z9 = false;
                str7 = str8;
            } else {
                oVar = oVar2;
                j10 = j11;
                str7 = str6;
                rVar.a0(-910500300);
            }
            rVar.p(z9);
            o.a(str2, lVar, androidx.compose.foundation.layout.d(oVar, 1.0f), false, new q0(j10, ae.e(15), null, null, null, 0L, 0, 0L, null, 16777212), d1.f17042d, null, true, 0, 0, null, null, null, new r0(kb.f2336c), null, rVar, ((i18 >> 3) & 14) | 100860336, 24576, 48792);
            rVar.p(true);
            rVar.p(true);
            str5 = str7;
        } else {
            rVar.U();
            str5 = str4;
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new z7(str, str2, lVar, str5, i, i10);
        }
    }

    public static final void o(int i, m mVar) {
        boolean z3;
        q1 t3;
        i iVar;
        r rVar = (r) mVar;
        rVar.c0(-1945361818);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            a1 o10 = y.o(i, rVar);
            a1 o11 = y.o(z5.f3083k, rVar);
            Object O = rVar.O();
            Object obj = l.f24285a;
            if (O == obj) {
                O = q.e.a(0.0f);
                rVar.k0(O);
            }
            q.d dVar = (q.d) O;
            Object O2 = rVar.O();
            if (O2 == obj) {
                O2 = y.B(Boolean.FALSE);
                rVar.k0(O2);
            }
            a1 a1Var = (a1) O2;
            Boolean bool = (Boolean) o10.getValue();
            bool.booleanValue();
            boolean f10 = rVar.f(o10) | rVar.h(dVar);
            Object O3 = rVar.O();
            if (f10 || O3 == obj) {
                Object fVar = new f(dVar, o10, a1Var, (te.c) null, 8);
                rVar.k0(fVar);
                O3 = fVar;
            }
            y.f((df.p) O3, bool, rVar);
            if (!((Boolean) a1Var.getValue()).booleanValue()) {
                t3 = rVar.t();
                if (t3 != null) {
                    iVar = new i(i, 11);
                    t3.f24332d = iVar;
                }
                return;
            }
            boolean f11 = rVar.f(o11) | rVar.h(dVar);
            Object O4 = rVar.O();
            if (f11 || O4 == obj) {
                O4 = new c5(dVar, o11, 1);
                rVar.k0(O4);
            }
            r a10 = androidx.compose.ui.graphics.a(o.f15687a, (df.l) O4);
            boolean h3 = rVar.h(dVar) | rVar.f(o11);
            Object O5 = rVar.O();
            if (h3 || O5 == obj) {
                O5 = new c5(dVar, o11, 2);
                rVar.k0(O5);
            }
            r c10 = androidx.compose.ui.draw.a.c(a10, (df.l) O5);
            z1.p0 d2 = x.d(c.f15670u, false);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            r c11 = a.c(c10, rVar);
            h.f1471d.getClass();
            df.a aVar = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(aVar);
            } else {
                rVar.n0();
            }
            y.I(g.e, d2, rVar);
            y.I(g.f1464d, l10, rVar);
            f fVar2 = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar2);
            }
            y.I(g.f1463c, c11, rVar);
            p(0, rVar);
            rVar.p(true);
        } else {
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            iVar = new i(i, 12);
            t3.f24332d = iVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x05ad, code lost:
    
        if (kotlin.jvm.internal.a(r7.O(), java.lang.Integer.valueOf(r2)) == false) goto L192;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r7v1, types: [r, m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(int r56, m r57) {
        /*
            Method dump skipped, instructions count: 2119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.z9.p(int, m):void");
    }

    public static final void q(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }

    public static final int r(la laVar) {
        int i = x9.f2990a[laVar.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            a.o();
            return 0;
        }
        return 0;
    }
}
