package w7;
import k.a;
import m7.f;
import o0.a;
import r.c;
import w7.i;
import y.a;
import a.a;
import a1.g;
import b2.b0;
import b2.f;
import b2.h;
import d.d;
import d1.c;
import d1.j;
import d1.o;
import d1.r;
import i1.i;
import k1.k;
import k1.l0;
import k1.r0;
import m2.g0;
import m2.q0;
import p7.e;
import q2.s;
import r0.a1;
import r0.l;
import r0.m;
import r0.n2;
import r0.q1;
import r0.v0;
import r0.y;
import r2.x;
import w7.a7;
import w7.m7;
import w7.s0;
import x.o0;
import x.p0;
import x.p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ya.ae;

/* loaded from: classes.dex */
public abstract class m7 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f28732a = l0.d(4291566190L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f28733b = l0.d(4062060322L);

    /* renamed from: c, reason: collision with root package name */
    public static final float f28734c = 16;

    /* renamed from: d, reason: collision with root package name */
    public static final float f28735d = 62;
    public static final float e;

    /* renamed from: f, reason: collision with root package name */
    public static final a7 f28736f;

    /* renamed from: g, reason: collision with root package name */
    public static final a7 f28737g;

    static {
        float f10 = 10;
        e = f10;
        float f11 = 12;
        float f12 = 26;
        float f13 = 13;
        f28736f = new a7(156, 56, 4, 34, f11, 12.0f, 11.0f, 9.0f, f12, 30, 15, f12, f13, 8);
        f28737g = new a7(142, 48, 3, 28, f10, 11.0f, 10.0f, 8.5f, 24, 25, f13, 23, f11, 6);
    }

    public static final void a(int i, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(-1648095770);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new f3(12);
                rVar.k0(O);
            }
            ya.ta.a(fillElement, (df.l) O, rVar, 54);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i, 3);
        }
    }

    public static final void b(boolean z3, m mVar, int i) {
        int i10;
        boolean z9;
        float f10;
        r rVar = (r) mVar;
        rVar.c0(933994957);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 3) != 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i11 & 1, z9)) {
            long j10 = r.f19515d;
            if (z3) {
                f10 = 0.75f;
            } else {
                f10 = 0.3f;
            }
            long c10 = r.c(j10, f10);
            r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 12);
            boolean e8 = rVar.e(c10);
            Object O = rVar.O();
            if (e8 || O == l.f24285a) {
                O = new b8.fb(c10, 2);
                rVar.k0(O);
            }
            ya.ta.a(k3, (df.l) O, rVar, 6);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d(i, 3, z3);
        }
    }

    public static final void c(boolean z3, m mVar, int i) {
        int i10;
        boolean z9;
        long j10;
        float f10;
        r rVar = (r) mVar;
        rVar.c0(995845181);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        boolean z10 = false;
        if ((i11 & 3) != 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i11 & 1, z9)) {
            if (z3) {
                j10 = r.f19515d;
                f10 = 0.9f;
            } else {
                j10 = r.f19515d;
                f10 = 0.32f;
            }
            long c10 = r.c(j10, f10);
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            boolean e8 = rVar.e(c10);
            if ((i11 & 14) == 4) {
                z10 = true;
            }
            boolean z11 = e8 | z10;
            Object O = rVar.O();
            if (z11 || O == l.f24285a) {
                O = new b7(c10, z3);
                rVar.k0(O);
            }
            ya.ta.a(fillElement, (df.l) O, rVar, 6);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d(i, 4, z3);
        }
    }

    public static final void d(int i, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(1429232382);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 22);
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new f3(11);
                rVar.k0(O);
            }
            ya.ta.a(k3, (df.l) O, rVar, 54);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i, 2);
        }
    }

    public static final void e(String str, float f10, df.l lVar, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z3;
        r rVar;
        boolean z9;
        Object obj;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        a1 a1Var;
        g0.d1 d1Var;
        int i14;
        boolean z13;
        boolean z14;
        Object j4Var;
        g0.c1 c1Var;
        String str2 = str;
        df.l lVar2 = lVar;
        r rVar2 = (r) mVar;
        rVar2.c0(-83791153);
        if (rVar2.f(str2)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i15 = i10 | i;
        if (rVar2.c(f10)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i16 = i15 | i11;
        if (rVar2.h(lVar2)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i17 = i16 | i12;
        if ((i17 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i17 & 1, z3)) {
            Object O = rVar2.O();
            Object obj2 = l.f24285a;
            if (O == obj2) {
                O = new o();
                rVar2.k0(O);
            }
            o oVar = (o) O;
            Object obj3 = (i) rVar2.j(c2.p1.i);
            int i18 = i17 & 14;
            if (i18 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object O2 = rVar2.O();
            if (!z9 && O2 != obj2) {
                obj = obj2;
            } else {
                obj = obj2;
                O2 = y.B(new x(str2, g0.b(0, str2.length()), 4));
                rVar2.k0(O2);
            }
            a1 a1Var2 = (a1) O2;
            a1 G = y.G((x) a1Var2.getValue(), rVar2);
            Object O3 = rVar2.O();
            Object obj4 = obj;
            if (O3 == obj4) {
                O3 = y.B(Boolean.FALSE);
                rVar2.k0(O3);
            }
            a1 a1Var3 = (a1) O3;
            Object O4 = rVar2.O();
            if (O4 == obj4) {
                O4 = y.B(Boolean.FALSE);
                rVar2.k0(O4);
            }
            a1 a1Var4 = (a1) O4;
            a1 G2 = y.G(lVar2, rVar2);
            boolean f11 = rVar2.f(G);
            if (i18 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean f12 = f11 | z10 | rVar2.f(G2);
            Object O5 = rVar2.O();
            if (f12 || O5 == obj4) {
                O5 = new androidx.ink.authoring.compose.c(G, str2, G2, a1Var3);
                rVar2.k0(O5);
            }
            pe.z zVar = pe.z.f22715a;
            y.c(zVar, (df.l) O5, rVar2);
            Object O6 = rVar2.O();
            if (O6 == obj4) {
                O6 = new u7.z1(oVar, null, 1);
                rVar2.k0(O6);
            }
            y.f((df.p) O6, zVar, rVar2);
            x xVar = (x) a1Var2.getValue();
            q0 q0Var = new q0(r.f19515d, ae.f(4294967296L, f10), s.A, null, null, 0L, 0, 0L, null, 16777208);
            r0 r0Var = new r0(f28732a);
            g0.d1 d1Var2 = new g0.d1(0, 7, 118);
            boolean h3 = rVar2.h(obj3) | rVar2.f(a1Var2);
            int i19 = i17 & 896;
            if (i19 == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = h3 | z11;
            if (i18 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z16 = z15 | z12;
            Object O7 = rVar2.O();
            if (!z16 && O7 != obj4) {
                i13 = i18;
                a1Var = a1Var3;
                i14 = i19;
                d1Var = d1Var2;
            } else {
                i13 = i18;
                a1Var = a1Var3;
                d1Var = d1Var2;
                i14 = i19;
                Object j4Var2 = new u7.j4(obj3, lVar, str, a1Var, a1Var2, 3);
                rVar2.k0(j4Var2);
                O7 = j4Var2;
            }
            g0.c1 c1Var2 = new g0.c1(62, (df.l) O7);
            r a10 = androidx.compose.ui.focus.a(androidx.compose.foundation.layout.d(o.f15687a, 1.0f), oVar);
            boolean f13 = rVar2.f(a1Var2);
            if (i14 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z17 = f13 | z13;
            if (i13 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z18 = z17 | z14;
            Object O8 = rVar2.O();
            if (!z18 && O8 != obj4) {
                lVar2 = lVar;
                c1Var = c1Var2;
                j4Var = O8;
                str2 = str;
            } else {
                str2 = str;
                c1Var = c1Var2;
                lVar2 = lVar;
                j4Var = new u7.j4(lVar2, str2, a1Var4, a1Var, a1Var2, 4);
                rVar2.k0(j4Var);
            }
            r b10 = androidx.compose.ui.focus.a.b(a10, (df.l) j4Var);
            boolean f14 = rVar2.f(a1Var2);
            Object O9 = rVar2.O();
            if (f14 || O9 == obj4) {
                O9 = new b8.a0(a1Var2, 24);
                rVar2.k0(O9);
            }
            rVar = rVar2;
            g0.o.b(xVar, (df.l) O9, b10, false, q0Var, d1Var, c1Var, true, 0, 0, null, null, r0Var, null, rVar, 100663296, 24576, 48664);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.t7(str2, f10, lVar2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final u7.a8 r48, final a7 r49, final boolean r50, final boolean r51, final boolean r52, final float r53, final f r54, final r r55, final df.a r56, final df.a r57, final df.a r58, final df.a r59, final df.a r60, final df.a r61, final df.a r62, final df.l r63, final r r64, m r65, final int r66) {
        /*
            Method dump skipped, instructions count: 2869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.m7.f(u7.a8, a7, boolean, boolean, boolean, float, f, r, df.a, df.a, df.a, df.a, df.a, df.a, df.a, df.l, r, m, int):void");
    }

    public static final void g(a1 a1Var, boolean z3) {
        a1Var.setValue(Boolean.valueOf(z3));
    }

    public static final void h(final p pVar, final int i, final int i10, final u7.m3 m3Var, final float f10, final boolean z3, final r0 r0Var, final df.a aVar, final String str, final s0 s0Var, final df.l lVar, final float f11, final float f12, final float f13, final int i11, final int i12, final int i13, m mVar, final int i14) {
        p pVar2;
        int i15;
        int i16;
        int i17;
        u7.m3 m3Var2;
        float f14;
        pVar.getClass();
        aVar.getClass();
        lVar.getClass();
        r rVar = (r) mVar;
        rVar.c0(-1662715170);
        if ((i14 & 6) == 0) {
            pVar2 = pVar;
            i15 = (rVar.f(pVar2) ? 4 : 2) | i14;
        } else {
            pVar2 = pVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 = i;
            i15 |= rVar.d(i16) ? 32 : 16;
        } else {
            i16 = i;
        }
        if ((i14 & 384) == 0) {
            i17 = i10;
            i15 |= rVar.d(i17) ? 256 : 128;
        } else {
            i17 = i10;
        }
        if ((i14 & 3072) == 0) {
            m3Var2 = m3Var;
            i15 |= rVar.h(m3Var2) ? 2048 : 1024;
        } else {
            m3Var2 = m3Var;
        }
        if ((i14 & 24576) == 0) {
            f14 = f10;
            i15 |= rVar.c(f14) ? 16384 : 8192;
        } else {
            f14 = f10;
        }
        if ((i14 & 196608) == 0) {
            i15 |= rVar.g(z3) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= rVar.h(r0Var) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= rVar.h(aVar) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= rVar.f(str) ? 67108864 : 33554432;
        }
        if ((i14 & 805306368) == 0) {
            i15 |= rVar.h(s0Var) ? 536870912 : 268435456;
        }
        if (rVar.R(i15 & 1, ((i15 & 306783379) == 306783378 && (((((6 | (rVar.c(f12) ? (char) 256 : (char) 128)) | (rVar.d(i11) ? (char) 16384 : (char) 8192)) | (rVar.d(i12) ? (char) 0 : (char) 0)) | (rVar.d(i13) ? (char) 0 : (char) 0)) & 598147) == 598146) ? false : true)) {
            c q12 = n4.q1(n4.r1(rVar), rVar);
            a7 a7Var = ((Configuration) rVar.j(AndroidCompositionLocals_androidKt.f641a)).smallestScreenWidthDp < 600 ? f28737g : f28736f;
            final float l0 = q12.l0(a7Var.f27879a);
            final a7 a7Var2 = a7Var;
            float max = f12 - (Math.max(i11, i12 - i13 < 0 ? 0 : r16) * 2.0f);
            if (max < 0.0f) {
                max = 0.0f;
            }
            float l02 = max - q12.l0(16);
            final float a02 = q12.a0(l02 < 0.0f ? 0.0f : l02);
            final p pVar3 = pVar2;
            final int i18 = i16;
            final int i19 = i17;
            final u7.m3 m3Var3 = m3Var2;
            final float f15 = f14;
            y.a(c2.p1.f3606h.a(q12), h.d(-1134256226, new df.p() { // from class: w7.f7
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    boolean z9;
                    float f16;
                    boolean z10;
                    m mVar2 = (m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    r rVar2 = (r) mVar2;
                    if (rVar2.R(intValue & 1, z9)) {
                        boolean z11 = z3;
                        float f17 = l0;
                        if (z11) {
                            f16 = 0.0f;
                        } else {
                            f16 = f17;
                        }
                        n2 a10 = q.a(f16, q.e.r(0.85f, 560.0f, null, 4), "layersDrawerOffset", rVar2, 3120, 20);
                        Object O = rVar2.O();
                        Object obj3 = l.f24285a;
                        if (O == obj3) {
                            O = new z6(m7.f28734c, m7.f28735d, 14, 10);
                            rVar2.k0(O);
                        }
                        z6 z6Var = (z6) O;
                        j jVar = c.f15675z;
                        p pVar4 = pVar3;
                        o oVar = o.f15687a;
                        r a11 = pVar4.a(oVar, jVar);
                        boolean f18 = rVar2.f(a10) | rVar2.c(f17);
                        Object O2 = rVar2.O();
                        if (f18 || O2 == obj3) {
                            O2 = new u7.f4(f17, a10, 1);
                            rVar2.k0(O2);
                        }
                        r b10 = androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a(a11, (df.l) O2), m7.f28733b, z6Var);
                        p0 a12 = o0.a(h.f29961a, c.E, rVar2, 48);
                        int hashCode = Long.hashCode(rVar2.T);
                        g l10 = rVar2.l();
                        r c10 = a.c(b10, rVar2);
                        h.f1471d.getClass();
                        df.a aVar2 = g.f1462b;
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(aVar2);
                        } else {
                            rVar2.n0();
                        }
                        y.I(g.e, a12, rVar2);
                        y.I(g.f1464d, l10, rVar2);
                        f fVar = g.f1465f;
                        if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                            a.t(hashCode, rVar2, hashCode, fVar);
                        }
                        y.I(g.f1463c, c10, rVar2);
                        boolean g8 = rVar2.g(z11);
                        df.a aVar3 = aVar;
                        boolean f19 = g8 | rVar2.f(aVar3);
                        Object obj4 = r0Var;
                        boolean f20 = f19 | rVar2.f(obj4);
                        Object O3 = rVar2.O();
                        if (f20 || O3 == obj3) {
                            O3 = new b8.v(2, aVar3, obj4, z11);
                            rVar2.k0(O3);
                        }
                        j(0, null, (df.a) O3, rVar2, z11);
                        i(i18, i19, m3Var3, f15, a02, a7Var2, str, s0Var, lVar, aVar3, rVar2, 0);
                        rVar2.p(true);
                        if (!z11) {
                            rVar2.a0(-2117620473);
                            r f21 = androidx.compose.foundation.layout.f(androidx.compose.foundation.layout.d.n(pVar4.a(oVar, jVar), 28), 80);
                            Object O4 = rVar2.O();
                            if (O4 == obj3) {
                                O4 = a.r(rVar2);
                            }
                            v.i iVar = (v.i) O4;
                            boolean f22 = rVar2.f(obj4);
                            Object O5 = rVar2.O();
                            if (f22 || O5 == obj3) {
                                O5 = new m4(1, obj4);
                                rVar2.k0(O5);
                            }
                            r e8 = androidx.compose.foundation.a.e(f21, iVar, null, false, null, (df.a) O5, 28);
                            z10 = false;
                            m.a(0, e8, rVar2);
                        } else {
                            z10 = false;
                            rVar2.a0(-2131442908);
                        }
                        rVar2.p(z10);
                    } else {
                        rVar2.U();
                    }
                    return pe.z.f22715a;
                }
            }, rVar), rVar, 56);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p() { // from class: w7.g7
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(i14 | 1);
                    h(p.this, i, i10, m3Var, f10, z3, r0Var, aVar, str, s0Var, lVar, f11, f12, f13, i11, i12, i13, (m) obj, L);
                    return pe.z.f22715a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0267, code lost:
    
        if (kotlin.jvm.internal.l.a(r0.O(), java.lang.Integer.valueOf(r4)) == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05a5  */
    /* JADX WARN: Type inference failed for: r0v1, types: [r, m] */
    /* JADX WARN: Type inference failed for: r22v7, types: [df.a] */
    /* JADX WARN: Type inference failed for: r23v7, types: [df.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final int r67, final int r68, final u7.m3 r69, final float r70, final float r71, final a7 r72, final java.lang.String r73, final s0 r74, final df.l r75, final df.a r76, m r77, final int r78) {
        /*
            Method dump skipped, instructions count: 2307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.i(int, int, u7.m3, float, float, a7, java.lang.String, s0, df.l, df.a, m, int):void");
    }

    public static final void j(int i, r rVar, df.a aVar, m mVar, boolean z3) {
        int i10;
        int i11;
        boolean z9;
        r rVar2;
        boolean z10;
        aVar.getClass();
        r rVar3 = (r) mVar;
        rVar3.c0(315936336);
        if (rVar3.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i;
        if (rVar3.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11 | 384;
        if ((i13 & 147) != 146) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar3.R(i13 & 1, z9)) {
            float f10 = f28734c;
            rVar2 = o.f15687a;
            r f11 = androidx.compose.foundation.layout.f(androidx.compose.foundation.layout.d.n(rVar2, f10), f28735d);
            if ((i13 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object O = rVar3.O();
            if (z10 || O == l.f24285a) {
                O = new b8.z(16, aVar);
                rVar3.k0(O);
            }
            r r8 = r(0, f11, (df.a) O, rVar3);
            p0 d2 = m.d(c.f15674y, false);
            int hashCode = Long.hashCode(rVar3.T);
            g l10 = rVar3.l();
            r c10 = a.c(r8, rVar3);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(b0Var);
            } else {
                rVar3.n0();
            }
            f fVar = g.e;
            y.I(fVar, d2, rVar3);
            f fVar2 = g.f1464d;
            y.I(fVar2, l10, rVar3);
            f fVar3 = g.f1465f;
            if (rVar3.S || !kotlin.jvm.internal.l.a(rVar3.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar3, hashCode, fVar3);
            }
            f fVar4 = g.f1463c;
            y.I(fVar4, c10, rVar3);
            r k3 = androidx.compose.foundation.layout.d.k(rVar2, 11);
            p0 d10 = m.d(c.f15670u, false);
            int hashCode2 = Long.hashCode(rVar3.T);
            g l11 = rVar3.l();
            r c11 = a.c(k3, rVar3);
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(b0Var);
            } else {
                rVar3.n0();
            }
            y.I(fVar, d10, rVar3);
            y.I(fVar2, l11, rVar3);
            if (rVar3.S || !kotlin.jvm.internal.l.a(rVar3.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar3, hashCode2, fVar3);
            }
            y.I(fVar4, c11, rVar3);
            k(z3, rVar3, i13 & 14);
            rVar3.p(true);
            rVar3.p(true);
        } else {
            rVar3.U();
            rVar2 = rVar;
        }
        q1 t3 = rVar3.t();
        if (t3 != null) {
            t3.f24332d = new b8.b0(i, rVar2, aVar, z3);
        }
    }

    public static final void k(final boolean z3, m mVar, final int i) {
        int i10;
        boolean z9;
        long d2;
        int i11;
        r rVar = (r) mVar;
        rVar.c0(-914024200);
        if ((i & 6) == 0) {
            if (rVar.g(z3)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i;
        } else {
            i10 = i;
        }
        boolean z10 = false;
        if ((i10 & 3) != 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i10 & 1, z9)) {
            if (z3) {
                d2 = r.f19515d;
            } else {
                d2 = l0.d(4287532691L);
            }
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            boolean e8 = rVar.e(d2);
            if ((i10 & 14) == 4) {
                z10 = true;
            }
            boolean z11 = e8 | z10;
            Object O = rVar.O();
            if (z11 || O == l.f24285a) {
                O = new b7(z3, d2);
                rVar.k0(O);
            }
            ya.ta.a(fillElement, (df.l) O, rVar, 6);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p() { // from class: w7.e7
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int L = y.L(i | 1);
                    k(z3, (m) obj, L);
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final void l(d dVar, long j10, float f10, float f11, float f12, float f13, boolean z3) {
        h a10 = k.a();
        float f14 = 0.5f * f11;
        float f15 = f12 * 0.13f;
        a10.h(f14, f13 - f15);
        a10.g(0.85f * f11, f13);
        a10.g(f14, f15 + f13);
        a10.g(f11 * 0.15f, f13);
        a10.d();
        if (z3) {
            d.o0(dVar, a10, j10, null, 60);
        } else {
            d.o0(dVar, a10, j10, new h(f10, 0.0f, 0, 0, null, 30), 52);
        }
    }

    public static final void m(int i, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(-1765897753);
        if ((i & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            long c10 = r.c(f28732a, 0.95f);
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            boolean e8 = rVar.e(c10);
            Object O = rVar.O();
            if (e8 || O == l.f24285a) {
                O = new b8.fb(c10, 5);
                rVar.k0(O);
            }
            ya.ta.a(fillElement, (df.l) O, rVar, 6);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i, 5);
        }
    }

    public static final void n(int i, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(-1988752386);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            long c10 = r.c(r.f19515d, 0.55f);
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new b8.fb(c10, 4);
                rVar.k0(O);
            }
            ya.ta.a(fillElement, (df.l) O, rVar, 54);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i, 4);
        }
    }

    public static final void o(int i, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(832510402);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 22);
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new f3(13);
                rVar.k0(O);
            }
            ya.ta.a(k3, (df.l) O, rVar, 54);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i, 6);
        }
    }

    public static final void p(boolean z3, m mVar, int i) {
        int i10;
        boolean z9;
        float f10;
        r rVar = (r) mVar;
        rVar.c0(966706261);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 3) != 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i11 & 1, z9)) {
            long j10 = r.f19515d;
            if (z3) {
                f10 = 0.75f;
            } else {
                f10 = 0.22f;
            }
            long c10 = r.c(j10, f10);
            r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 13);
            boolean e8 = rVar.e(c10);
            Object O = rVar.O();
            if (e8 || O == l.f24285a) {
                O = new b8.fb(c10, 3);
                rVar.k0(O);
            }
            ya.ta.a(k3, (df.l) O, rVar, 6);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d(i, 5, z3);
        }
    }

    public static final void q(u7.d dVar, m mVar, int i) {
        int i10;
        boolean z3;
        Object obj;
        String str;
        String obj2;
        r rVar = (r) mVar;
        rVar.c0(-1807964227);
        if (rVar.f(dVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        boolean z9 = false;
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            String str2 = dVar.f26035c;
            boolean z10 = dVar.f26045o;
            boolean z11 = dVar.f26044n;
            boolean f10 = rVar.f(str2) | rVar.g(z11) | rVar.g(z10) | rVar.d(e.e.h());
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (f10 || O == v0Var) {
                O = e.f(context, dVar.f26035c, z11, z10);
                rVar.k0(O);
            }
            Typeface typeface = (Typeface) O;
            String str3 = dVar.f26034b;
            str3.getClass();
            mf.d dVar2 = new mf.d(str3);
            while (true) {
                if (dVar2.hasNext()) {
                    obj = dVar2.next();
                    if (!mf.f.u((String) obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            String str4 = (String) obj;
            if (str4 != null && (obj2 = mf.f.I(str4).toString()) != null) {
                str = mf.f.H(12, obj2);
            } else {
                str = "Aa";
            }
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            boolean h3 = rVar.h(typeface);
            if ((i11 & 14) == 4) {
                z9 = true;
            }
            boolean f11 = h3 | z9 | rVar.f(str);
            Object O2 = rVar.O();
            if (f11 || O2 == v0Var) {
                O2 = new g(19, str, typeface, dVar);
                rVar.k0(O2);
            }
            ya.ta.a(fillElement, (df.l) O2, rVar, 6);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new a(dVar, i, 18);
        }
    }

    public static final r r(int i, r rVar, df.a aVar, m mVar) {
        boolean z3;
        r rVar2 = (r) mVar;
        Object O = rVar2.O();
        v0 v0Var = l.f24285a;
        if (O == v0Var) {
            O = a.r(rVar2);
        }
        v.i iVar = (v.i) O;
        if ((((i & 112) ^ 48) > 32 && rVar2.f(aVar)) || (i & 48) == 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        Object O2 = rVar2.O();
        if (z3 || O2 == v0Var) {
            O2 = new b8.z(17, aVar);
            rVar2.k0(O2);
        }
        return androidx.compose.foundation.a.e(rVar, iVar, null, false, null, (df.a) O2, 28);
    }

    public static final boolean s(float f10, float f11, m mVar) {
        a7 a7Var;
        c q12 = n4.q1(n4.r1(mVar), mVar);
        if (((Configuration) ((r) mVar).j(AndroidCompositionLocals_androidKt.f641a)).smallestScreenWidthDp < 600) {
            a7Var = f28737g;
        } else {
            a7Var = f28736f;
        }
        float f12 = (f10 - f11) / 2.0f;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 >= q12.l0(a7Var.f27879a + f28734c + e)) {
            return true;
        }
        return false;
    }
}
