package ya;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import b8.a5;
import b8.ia;
import b8.k2;
import b8.m4;
import b8.t6;
import b8.z5;
import d.d;
import d.f;
import d1.a;
import d1.c;
import d1.h;
import d1.j;
import d1.o;
import d1.r;
import df.a;
import df.p;
import f0.e;
import h8.m;
import k1.l0;
import k1.r;
import l.a;
import o0.x1;
import o6.a;
import p.a;
import q2.s;
import r0.a1;
import r0.i1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import s6.g;
import s6.l;
import s6.n;
import s6.o;
import s7.a;
import s7.b;
import s7.c;
import s7.d;
import s7.i;
import s7.j;
import v.i;
import vb.a;
import wa.n7;
import wb.a;
import x.b;
import x.h;
import x.m;
import x.q;
import x.r;
import x2.k;
import z0.g;
import z0.h;
import z1.p0;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public abstract class yb {
    public static final void a(a aVar, a aVar2, m mVar, int i) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(144603233);
        if ((i & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            b.a(a.d(androidx.compose.foundation.layout.d.f506c, 30.0f), null, h.d(-1995120309, new m4(aVar, 4, aVar2), rVar), rVar, 3078);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new t6(aVar, aVar2, i, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [o, java.lang.Object] */
    public static final void b(boolean z3, a aVar, a aVar2, a aVar3, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        r rVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        r rVar2 = (r) mVar;
        rVar2.c0(467519716);
        if (rVar2.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i | i10;
        if (rVar2.h(aVar2)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if (rVar2.h(aVar3)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i15 = i14 | i12;
        if ((i15 & 1171) != 1170) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar2.R(i15 & 1, z9)) {
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            r b10 = androidx.compose.foundation.a.b(a.d(fillElement, 40.0f), r.c(r.f19513b, 0.45f), l0.f19495a);
            Object O = rVar2.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = a.r(rVar2);
            }
            r e = androidx.compose.foundation.a.e(b10, (i) O, null, false, null, aVar, 28);
            j jVar = c.f15674y;
            p0 d2 = m.d(jVar, false);
            int hashCode = Long.hashCode(rVar2.T);
            g l10 = rVar2.l();
            r c10 = a.c(e, rVar2);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            f fVar = g.e;
            y.I(fVar, d2, rVar2);
            f fVar2 = g.f1464d;
            y.I(fVar2, l10, rVar2);
            f fVar3 = g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar3);
            }
            f fVar4 = g.f1463c;
            y.I(fVar4, c10, rVar2);
            h hVar = c.H;
            o oVar = o.f15687a;
            r n10 = androidx.compose.foundation.layout.d.n(oVar, 300);
            long j10 = r.f19515d;
            r b11 = androidx.compose.foundation.a.b(n10, j10, e.a(28));
            Object O2 = rVar2.O();
            if (O2 == v0Var) {
                O2 = a.r(rVar2);
            }
            i iVar = (i) O2;
            Object O3 = rVar2.O();
            if (O3 == v0Var) {
                O3 = new fg.o(19);
                rVar2.k0(O3);
            }
            float f10 = 24;
            r l11 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.e(b11, iVar, null, false, null, (a) O3, 28), f10, f10);
            r a10 = q.a(h.f29962b, hVar, rVar2, 48);
            int hashCode2 = Long.hashCode(rVar2.T);
            g l12 = rVar2.l();
            r c11 = a.c(l11, rVar2);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(fVar, a10, rVar2);
            y.I(fVar2, l12, rVar2);
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar2, hashCode2, fVar3);
            }
            y.I(fVar4, c11, rVar2);
            n c12 = xb.c(new Object(), rVar2);
            g a11 = a((a) c12.getValue(), new l(0.0f, 0.33333334f), rVar2);
            r k3 = androidx.compose.foundation.layout.d.k(oVar, 84);
            p0 d10 = m.d(c.f15670u, false);
            int hashCode3 = Long.hashCode(rVar2.T);
            g l13 = rVar2.l();
            r c13 = a.c(k3, rVar2);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(fVar, d10, rVar2);
            y.I(fVar2, l13, rVar2);
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode3))) {
                a.t(hashCode3, rVar2, hashCode3, fVar3);
            }
            y.I(fVar4, c13, rVar2);
            a aVar4 = (a) c12.getValue();
            if (aVar4 == null) {
                rVar2.a0(-1711110126);
                z11 = false;
                rVar2.p(false);
                z10 = true;
            } else {
                rVar2.a0(-1711110125);
                boolean f11 = rVar2.f(a11);
                Object O4 = rVar2.O();
                if (!f11 && O4 != v0Var) {
                    z10 = true;
                } else {
                    z10 = true;
                    O4 = new a(a11, 1);
                    rVar2.k0(O4);
                }
                a(aVar4, (a) O4, fillElement, rVar2, 384);
                z11 = false;
                rVar2.p(false);
            }
            rVar2.p(z10);
            float f12 = 10;
            b.b(androidx.compose.foundation.layout.f(oVar, f12), rVar2);
            x1.b(n7.b(R.string.apis_promo_title, rVar2), null, l0.d(4280032286L), ae.e(20), null, s.B, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, 200064, 0, 131026);
            float f13 = 6;
            b.b(androidx.compose.foundation.layout.f(oVar, f13), rVar2);
            x1.b(n7.b(R.string.apis_promo_text, rVar2), null, l0.d(4285298045L), ae.e(14), null, null, null, 0L, new k(3), ae.e(19), 0, false, 0, 0, null, rVar2, 3456, 6, 129522);
            b.b(androidx.compose.foundation.layout.f(oVar, 18), rVar2);
            r b12 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.f(androidx.compose.foundation.layout.d(oVar, 1.0f), 46), l0.d(4280032286L), e.a(23));
            Object O5 = rVar2.O();
            if (O5 == v0Var) {
                O5 = a.r(rVar2);
            }
            r e8 = androidx.compose.foundation.a.e(b12, (i) O5, null, false, null, aVar3, 28);
            p0 d11 = m.d(jVar, false);
            int hashCode4 = Long.hashCode(rVar2.T);
            g l14 = rVar2.l();
            r c14 = a.c(e8, rVar2);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(fVar, d11, rVar2);
            y.I(fVar2, l14, rVar2);
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode4))) {
                a.t(hashCode4, rVar2, hashCode4, fVar3);
            }
            y.I(fVar4, c14, rVar2);
            x1.b(n7.b(R.string.apis_promo_store, rVar2), null, j10, ae.e(14), null, s.A, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, 200064, 0, 131026);
            rVar = rVar2;
            rVar.p(true);
            if (!z3) {
                rVar.a0(1748396754);
                b.b(androidx.compose.foundation.layout.f(oVar, f12), rVar);
                String b13 = n7.b(R.string.apis_promo_never, rVar);
                long d12 = l0.d(4288585374L);
                long e10 = ae.e(13);
                Object O6 = rVar.O();
                if (O6 == v0Var) {
                    O6 = a.r(rVar);
                }
                z12 = true;
                x1.b(b13, androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.e(oVar, (i) O6, null, false, null, aVar2, 28), 12, f13), d12, e10, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 3456, 0, 131056);
                rVar = rVar;
                z13 = false;
            } else {
                z12 = true;
                z13 = false;
                rVar.a0(1728453090);
            }
            rVar.p(z13);
            rVar.p(z12);
            rVar.p(z12);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new m(z3, aVar, aVar2, aVar3, i);
        }
    }

    public static final void c(boolean z3, m mVar, int i) {
        int i10;
        boolean z9;
        a1 a1Var;
        boolean z10;
        a1 a1Var2;
        r rVar = (r) mVar;
        rVar.c0(-150026848);
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
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            Object O = rVar.O();
            Object obj = l.f24285a;
            if (O == obj) {
                O = y.B(Boolean.FALSE);
                rVar.k0(O);
            }
            a1 a1Var3 = (a1) O;
            Object O2 = rVar.O();
            if (O2 == obj) {
                O2 = y.B(Boolean.FALSE);
                rVar.k0(O2);
            }
            a1 a1Var4 = (a1) O2;
            Object O3 = rVar.O();
            if (O3 == obj) {
                O3 = y.B(Boolean.FALSE);
                rVar.k0(O3);
            }
            a1 a1Var5 = (a1) O3;
            i1 i1Var = j.f25029a;
            Boolean bool = (Boolean) i1Var.getValue();
            bool.booleanValue();
            boolean f10 = rVar.f(i1Var);
            Object O4 = rVar.O();
            if (f10 || O4 == obj) {
                a1Var = a1Var4;
                Object k2Var = new k2(i1Var, a1Var5, a1Var, null, 6);
                rVar.k0(k2Var);
                O4 = k2Var;
            } else {
                a1Var = a1Var4;
            }
            y.f((p) O4, bool, rVar);
            a1 o10 = y.o(z5.i, rVar);
            if (z3 && !((Boolean) o10.getValue()).booleanValue() && !ia.e()) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            boolean g8 = rVar.g(z10) | rVar.h(context);
            Object O5 = rVar.O();
            if (!g8 && O5 != obj) {
                a1Var2 = a1Var;
            } else {
                a1Var2 = a1Var;
                Object iVar = new i(z10, context, a1Var3, a1Var2, null);
                rVar.k0(iVar);
                O5 = iVar;
            }
            y.f((p) O5, valueOf, rVar);
            if (((Boolean) a1Var3.getValue()).booleanValue()) {
                rVar.a0(1614133990);
                Object O6 = rVar.O();
                if (O6 == obj) {
                    O6 = new a5(a1Var3, 12);
                    rVar.k0(O6);
                }
                a aVar = (a) O6;
                Object O7 = rVar.O();
                if (O7 == obj) {
                    O7 = new b(0, a1Var5, a1Var2, a1Var3);
                    rVar.k0(O7);
                }
                a(aVar, (a) O7, rVar, 54);
            } else {
                rVar.a0(1603216162);
            }
            rVar.p(false);
            if (((Boolean) a1Var2.getValue()).booleanValue()) {
                rVar.a0(1614471270);
                boolean booleanValue = ((Boolean) a1Var5.getValue()).booleanValue();
                Object O8 = rVar.O();
                if (O8 == obj) {
                    O8 = new a5(a1Var2, 13);
                    rVar.k0(O8);
                }
                a aVar2 = (a) O8;
                boolean h3 = rVar.h(context);
                Object O9 = rVar.O();
                if (h3 || O9 == obj) {
                    O9 = new c(context, a1Var2, 0);
                    rVar.k0(O9);
                }
                a aVar3 = (a) O9;
                boolean h10 = rVar.h(context);
                Object O10 = rVar.O();
                if (h10 || O10 == obj) {
                    O10 = new c(context, a1Var2, 1);
                    rVar.k0(O10);
                }
                b(booleanValue, aVar2, aVar3, (a) O10, rVar, 48);
            } else {
                rVar.a0(1603216162);
            }
            rVar.p(false);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d(i, 0, z3);
        }
    }
}
