package z7;
import a.a;
import b.b;
import c.d;
import d.a;
import d.d;
import d.f;
import h.a;
import l.a;
import m.d;
import p.a;
import p.b0;
import p.p0;
import p.v0;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b2.b0;
import b8.w8;
import com.daren.scraply.R;
import java.util.LinkedHashMap;
import k1.k0;
import k1.l0;
import m2.f0;
import o0.p1;
import o0.x1;
import p.q0;
import p.r0;
import p.t1;
import p.v1;
import q.k1;
import q2.s;
import r0.o2;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import w7.b9;
import w7.d9;
import w7.i1;
import w7.r5;
import wa.j7;
import wa.n7;
import wa.o9;
import wa.v9;
import x.o0;
import x.p0;
import x.q;
import ya.ae;
import ya.h9;
import ya.sa;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final long f31968a = l0.d(4284246976L);

    public static final void a(int i, r0.m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(-2002619887);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            View view = (View) rVar.j(AndroidCompositionLocals_androidKt.f645f);
            e(n7.b(R.string.settings_group_feedback, rVar), rVar, 0);
            x.b(androidx.compose.foundation.layout.f(d1.o.f15687a, 12), rVar);
            String b10 = n7.b(R.string.haptics_title, rVar);
            String b11 = n7.b(R.string.haptics_desc, rVar);
            boolean a10 = a();
            boolean h3 = rVar.h(context) | rVar.h(view);
            Object O = rVar.O();
            if (h3 || O == r0.l.f24285a) {
                O = new d9(context, 1, view);
                rVar.k0(O);
            }
            g(b10, b11, a10, (df.l) O, rVar, 0);
            a(0, rVar);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i, 29);
        }
    }

    public static final void b(f fVar, String str, df.l lVar, r0.m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z3;
        f fVar2;
        df.l lVar2;
        boolean z9;
        boolean z10;
        fVar.getClass();
        str.getClass();
        lVar.getClass();
        r rVar = (r) mVar;
        rVar.c0(450090271);
        if (rVar.d(fVar.ordinal())) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i | i10;
        if (rVar.f(str)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar.h(lVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i15 & 1, z3)) {
            e(n7.b(R.string.graphics_quality, rVar), rVar, 0);
            d1.o oVar = d1.o.f15687a;
            x.b(androidx.compose.foundation.layout.f(oVar, 4), rVar);
            x1.b(n7.b(R.string.quality_desc, rVar), null, k1.r.c(k1.r.f19515d, 0.6f), ae.e(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 3456, 0, 131058);
            rVar = rVar;
            x.b(androidx.compose.foundation.layout.f(oVar, 12), rVar);
            for (f fVar3 : f.values()) {
                String b10 = n7.b(fVar3.getLabelRes(), rVar);
                if (fVar3 == f.AUTO) {
                    b10 = i1.d(b10, " (", str, ")");
                }
                String b11 = n7.b(fVar3.getDescriptionRes(), rVar);
                if (fVar3 == fVar) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((i15 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean d2 = z10 | rVar.d(fVar3.ordinal());
                Object O = rVar.O();
                if (d2 || O == r0.l.f24285a) {
                    O = new androidx.ink.brush.b(lVar, 23, fVar3);
                    rVar.k0(O);
                }
                d(b10, b11, z9, (df.a) O, rVar, 0);
                x.b(androidx.compose.foundation.layout.f(oVar, 10), rVar);
            }
            fVar2 = fVar;
            lVar2 = lVar;
        } else {
            fVar2 = fVar;
            lVar2 = lVar;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.g(fVar2, str, lVar2, i, 9);
        }
    }

    public static final void c(String str, String str2, df.a aVar, r0.m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z3;
        r rVar;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(-1038785806);
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
        if (rVar2.h(aVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i15 & 1, z3)) {
            d1.o oVar = d1.o.f15687a;
            d1.r a10 = j7.a(androidx.compose.foundation.layout.d(oVar, 1.0f), f0.e.a(14));
            long j10 = k1.r.f19515d;
            d1.r l10 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.f(null, false, androidx.compose.foundation.a.b(a10, k1.r.c(j10, 0.05f), l0.f19495a), aVar, 7), 16, 18);
            p0 a11 = o0.a(x.h.f29961a, d1.c.E, rVar2, 48);
            int hashCode = Long.hashCode(rVar2.T);
            z0.g l11 = rVar2.l();
            d1.r c10 = d1.a.c(l10, rVar2);
            b2.h.f1471d.getClass();
            b0 b0Var = b2.g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            b2.f fVar = b2.g.e;
            y.I(fVar, a11, rVar2);
            b2.f fVar2 = b2.g.f1464d;
            y.I(fVar2, l11, rVar2);
            b2.f fVar3 = b2.g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar3);
            }
            b2.f fVar4 = b2.g.f1463c;
            y.I(fVar4, c10, rVar2);
            if (1.0f <= 0.0d) {
                y.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            x.r a12 = q.a(x.h.f29962b, d1.c.G, rVar2, 0);
            int hashCode2 = Long.hashCode(rVar2.T);
            z0.g l12 = rVar2.l();
            d1.r c11 = d1.a.c(layoutWeightElement, rVar2);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(fVar, a12, rVar2);
            y.I(fVar2, l12, rVar2);
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar2, hashCode2, fVar3);
            }
            y.I(fVar4, c11, rVar2);
            x1.b(str, null, j10, ae.e(17), null, s.A, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, (i15 & 14) | 200064, 0, 131026);
            x.b(androidx.compose.foundation.layout.f(oVar, 2), rVar2);
            x1.b(str2, null, k1.r.c(j10, 0.6f), ae.e(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, (14 & (i15 >> 3)) | 3456, 0, 131058);
            rVar2.p(true);
            o0.y.b(v9.a(), n7.b(R.string.open, rVar2), null, k1.r.c(j10, 0.6f), rVar2, 3072, 4);
            rVar = rVar2;
            rVar.p(true);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.g(str, str2, aVar, i, 8);
        }
    }

    public static final void d(String str, String str2, boolean z3, df.a aVar, r0.m mVar, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z9;
        float f10;
        float f11;
        float f12;
        r rVar;
        long j10;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(361949067);
        if (rVar2.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i | i10;
        if (rVar2.f(str2)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar2.g(z3)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if (rVar2.h(aVar)) {
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
        if (rVar2.R(i17 & 1, z9)) {
            d1.o oVar = d1.o.f15687a;
            float f13 = 14;
            d1.r a10 = j7.a(androidx.compose.foundation.layout.d(oVar, 1.0f), f0.e.a(f13));
            long j11 = k1.r.f19515d;
            if (z3) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            long c10 = k1.r.c(j11, f10);
            k0 k0Var = l0.f19495a;
            d1.r b10 = androidx.compose.foundation.a.b(a10, c10, k0Var);
            if (z3) {
                f11 = f13;
                f12 = (float) 1.5d;
            } else {
                f11 = f13;
                f12 = 0;
            }
            long j12 = f31968a;
            if (z3) {
                rVar = rVar2;
                j10 = j12;
            } else {
                rVar = rVar2;
                j10 = k1.r.f19520k;
            }
            float f14 = 16;
            d1.r l10 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.f(null, false, sa.a(b10, f12, j10, f0.e.a(f11)), aVar, 7), f14, f11);
            r rVar3 = rVar;
            p0 a11 = o0.a(x.h.f29961a, d1.c.E, rVar3, 48);
            int hashCode = Long.hashCode(rVar3.T);
            z0.g l11 = rVar3.l();
            d1.r c11 = d1.a.c(l10, rVar3);
            b2.h.f1471d.getClass();
            b0 b0Var = b2.g.f1462b;
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(b0Var);
            } else {
                rVar3.n0();
            }
            b2.f fVar = b2.g.e;
            y.I(fVar, a11, rVar3);
            b2.f fVar2 = b2.g.f1464d;
            y.I(fVar2, l11, rVar3);
            b2.f fVar3 = b2.g.f1465f;
            if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar3, hashCode, fVar3);
            }
            b2.f fVar4 = b2.g.f1463c;
            y.I(fVar4, c11, rVar3);
            if (1.0f <= 0.0d) {
                y.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            x.r a12 = q.a(x.h.f29962b, d1.c.G, rVar3, 0);
            int hashCode2 = Long.hashCode(rVar3.T);
            z0.g l12 = rVar3.l();
            d1.r c12 = d1.a.c(layoutWeightElement, rVar3);
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(b0Var);
            } else {
                rVar3.n0();
            }
            y.I(fVar, a12, rVar3);
            y.I(fVar2, l12, rVar3);
            if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar3, hashCode2, fVar3);
            }
            y.I(fVar4, c12, rVar3);
            x1.b(str, null, j11, ae.e(17), null, s.A, null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, (i17 & 14) | 200064, 0, 131026);
            x.b(androidx.compose.foundation.layout.f(oVar, 2), rVar3);
            x1.b(str2, null, k1.r.c(j11, 0.6f), ae.e(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, ((i17 >> 3) & 14) | 3456, 0, 131058);
            rVar2 = rVar3;
            rVar2.p(true);
            d1.r a13 = j7.a(androidx.compose.foundation.layout.d.k(oVar, 24), f0.e.f16629a);
            if (!z3) {
                j12 = k1.r.c(j11, 0.12f);
            }
            d1.r b11 = androidx.compose.foundation.a.b(a13, j12, k0Var);
            z1.p0 d2 = x.d(d1.c.f15674y, false);
            int hashCode3 = Long.hashCode(rVar2.T);
            z0.g l13 = rVar2.l();
            d1.r c13 = d1.a.c(b11, rVar2);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(fVar, d2, rVar2);
            y.I(fVar2, l13, rVar2);
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode3))) {
                a.t(hashCode3, rVar2, hashCode3, fVar3);
            }
            y.I(fVar4, c13, rVar2);
            if (z3) {
                rVar2.a0(-34459529);
                o0.y.b(o9.a(), n7.b(R.string.selected, rVar2), androidx.compose.foundation.layout.d.k(oVar, f14), j11, rVar2, 3456, 0);
            } else {
                rVar2.a0(-43209651);
            }
            rVar2.p(false);
            rVar2.p(true);
            rVar2.p(true);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new w8(str, str2, z3, aVar, i, 2);
        }
    }

    public static final void e(String str, r0.m mVar, int i) {
        int i10;
        boolean z3;
        r rVar;
        str.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(382810293);
        if (rVar2.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i | i10;
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i11 & 1, z3)) {
            rVar = rVar2;
            x1.b(str, null, k1.r.c(k1.r.f19515d, 0.5f), ae.e(13), null, s.B, null, ae.e(1), null, 0L, 0, false, 0, 0, null, rVar, (i11 & 14) | 12782976, 0, 130898);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b9(str, i, 3);
        }
    }

    public static final void f(String str, boolean z3, df.a aVar, z0.c cVar, r0.m mVar, int i) {
        int i10;
        int i11;
        boolean z9;
        df.a aVar2;
        z0.c cVar2;
        str.getClass();
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.c0(-2057818499);
        if (rVar.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i | i10;
        if (rVar.g(z3)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 1171) != 1170) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i13 & 1, z9)) {
            p0 d2 = androidx.compose.animation.d(q.e.s(300, 0, null, 6), 2);
            k1 s10 = q.e.s(300, 0, null, 6);
            Object O = rVar.O();
            v0 v0Var = r0.l.f24285a;
            if (O == v0Var) {
                O = new f0(13);
                rVar.k0(O);
            }
            p0 a10 = d2.a(new p0(new v1((r0) null, new t1(new h1.c(3, (df.l) O), s10), (b0) null, (v0) null, (LinkedHashMap) null, 61)));
            q0 e = androidx.compose.animation.c.e(q.e.s(300, 0, null, 6), 2);
            k1 s11 = q.e.s(300, 0, null, 6);
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = new f0(13);
                rVar.k0(O2);
            }
            aVar2 = aVar;
            cVar2 = cVar;
            h9.c(z3, null, a10, e.a(new q0(new v1((r0) null, new t1(new h1.c(5, (df.l) O2), s11), (b0) null, (v0) null, (LinkedHashMap) null, 61))), null, z0.h.d(1216324773, new r7.j(cVar2, aVar2, str), rVar), rVar, ((i13 >> 3) & 14) | 200064, 18);
        } else {
            aVar2 = aVar;
            cVar2 = cVar;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new h8.m(str, z3, aVar2, cVar2, i);
        }
    }

    public static final void g(String str, String str2, boolean z3, df.l lVar, r0.m mVar, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z9;
        float f10;
        boolean z10;
        boolean z11;
        str.getClass();
        str2.getClass();
        lVar.getClass();
        r rVar = (r) mVar;
        rVar.c0(916350201);
        if (rVar.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i | i10;
        if (rVar.f(str2)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar.g(z3)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if (rVar.h(lVar)) {
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
        if (rVar.R(i17 & 1, z9)) {
            d1.o oVar = d1.o.f15687a;
            float f11 = 14;
            d1.r a10 = j7.a(androidx.compose.foundation.layout.d(oVar, 1.0f), f0.e.a(f11));
            long j10 = k1.r.f19515d;
            if (z3) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            d1.r b10 = androidx.compose.foundation.a.b(a10, k1.r.c(j10, f10), l0.f19495a);
            if ((i17 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i17 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = z11 | z10;
            Object O = rVar.O();
            if (z12 || O == r0.l.f24285a) {
                O = new i5.d(1, lVar, z3);
                rVar.k0(O);
            }
            d1.r l10 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.f(null, false, b10, (df.a) O, 7), 16, f11);
            p0 a11 = o0.a(x.h.f29961a, d1.c.E, rVar, 48);
            int hashCode = Long.hashCode(rVar.T);
            z0.g l11 = rVar.l();
            d1.r c10 = d1.a.c(l10, rVar);
            b2.h.f1471d.getClass();
            b0 b0Var = b2.g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            b2.f fVar = b2.g.e;
            y.I(fVar, a11, rVar);
            b2.f fVar2 = b2.g.f1464d;
            y.I(fVar2, l11, rVar);
            b2.f fVar3 = b2.g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar3);
            }
            b2.f fVar4 = b2.g.f1463c;
            y.I(fVar4, c10, rVar);
            if (1.0f <= 0.0d) {
                y.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            x.r a12 = q.a(x.h.f29962b, d1.c.G, rVar, 0);
            int hashCode2 = Long.hashCode(rVar.T);
            z0.g l12 = rVar.l();
            d1.r c11 = d1.a.c(layoutWeightElement, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(fVar, a12, rVar);
            y.I(fVar2, l12, rVar);
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar, hashCode2, fVar3);
            }
            y.I(fVar4, c11, rVar);
            x1.b(str, null, j10, ae.e(17), null, s.A, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, (i17 & 14) | 200064, 0, 131026);
            x.b(androidx.compose.foundation.layout.f(oVar, 2), rVar);
            x1.b(str2, null, k1.r.c(j10, 0.6f), ae.e(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, ((i17 >> 3) & 14) | 3456, 0, 131058);
            rVar = rVar;
            rVar.p(true);
            x.b(androidx.compose.foundation.layout.d.n(oVar, 12), rVar);
            long c12 = k1.r.c(j10, 0.7f);
            long c13 = k1.r.c(j10, 0.1f);
            long c14 = k1.r.c(j10, 0.25f);
            float f12 = q0.l.f23145a;
            long c15 = o0.o.c(11, rVar);
            long c16 = o0.o.c(39, rVar);
            long c17 = k1.r.c(o0.o.c(35, rVar), 1.0f);
            o2 o2Var = o0.o.f21604a;
            long n10 = l0.n(c17, ((o0.m) rVar.j(o2Var)).f21568p);
            long n11 = l0.n(k1.r.c(o0.o.c(18, rVar), 0.12f), ((o0.m) rVar.j(o2Var)).f21568p);
            long j11 = k1.r.f19520k;
            long n12 = l0.n(k1.r.c(o0.o.c(18, rVar), 0.38f), ((o0.m) rVar.j(o2Var)).f21568p);
            long n13 = l0.n(k1.r.c(o0.o.c(18, rVar), 0.38f), ((o0.m) rVar.j(o2Var)).f21568p);
            long n14 = l0.n(k1.r.c(o0.o.c(39, rVar), 0.12f), ((o0.m) rVar.j(o2Var)).f21568p);
            long n15 = l0.n(k1.r.c(o0.o.c(18, rVar), 0.12f), ((o0.m) rVar.j(o2Var)).f21568p);
            long n16 = l0.n(k1.r.c(o0.o.c(39, rVar), 0.38f), ((o0.m) rVar.j(o2Var)).f21568p);
            long j12 = f31968a;
            androidx.compose.material3.a(z3, lVar, null, false, new p1(j10, j12, j12, c15, c12, c13, c14, c16, n10, n11, j11, n12, n13, n14, n15, n16), rVar, (i17 >> 6) & 126);
            rVar.p(true);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new h8.m(str, str2, z3, lVar, i, 2);
        }
    }
}
