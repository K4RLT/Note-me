package z7;
import a.a;
import b.b;
import c.b;
import d.b;
import d.d;
import d.f;
import l.a;
import m.d;
import p.a;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b2.b0;
import com.daren.scraply.R;
import df.q;
import k1.k0;
import k1.l0;
import o0.h1;
import o0.x1;
import p.x;
import pe.z;
import q2.s;
import r0.a1;
import r0.r;
import r0.v0;
import r0.y;
import v1.d0;
import w7.ab;
import w7.c9;
import w7.h9;
import wa.n7;
import x.o0;
import ya.ae;
import ya.xa;
import z1.p0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31938u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.a f31939v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f31940w;

    public /* synthetic */ a(df.a aVar, a1 a1Var, int i) {
        this.f31938u = i;
        this.f31939v = aVar;
        this.f31940w = a1Var;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        a1 a1Var;
        boolean z3;
        int i;
        int i10;
        boolean z9;
        r rVar;
        boolean z10;
        int i11;
        int i12;
        int i13 = this.f31938u;
        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f501a;
        v0 v0Var = r0.l.f24285a;
        z zVar = z.f22715a;
        k0 k0Var = l0.f19495a;
        d1.o oVar = d1.o.f15687a;
        a1 a1Var2 = this.f31940w;
        switch (i13) {
            case 0:
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                d1.r b10 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f506c, l0.d(4280163870L), k0Var);
                r rVar2 = (r) ((r0.m) obj2);
                Object O = rVar2.O();
                if (O == v0Var) {
                    O = b.f31941b;
                    rVar2.k0(O);
                }
                d1.r b11 = d0.b(b10, zVar, (PointerInputEventHandler) O);
                p0 d2 = x.d(d1.c.f15670u, false);
                int hashCode = Long.hashCode(rVar2.T);
                z0.g l10 = rVar2.l();
                d1.r c10 = d1.a.c(b11, rVar2);
                b2.h.f1471d.getClass();
                b0 b0Var = b2.g.f1462b;
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(b0Var);
                } else {
                    rVar2.n0();
                }
                b2.f fVar = b2.g.e;
                y.I(fVar, d2, rVar2);
                b2.f fVar2 = b2.g.f1464d;
                y.I(fVar2, l10, rVar2);
                b2.f fVar3 = b2.g.f1465f;
                if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                    p.a.t(hashCode, rVar2, hashCode, fVar3);
                }
                b2.f fVar4 = b2.g.f1463c;
                y.I(fVar4, c10, rVar2);
                float f10 = 16;
                d1.r o10 = androidx.compose.foundation.layout.a.o(bVar.a(androidx.compose.foundation.layout.d.o(androidx.compose.foundation.layout.d.f505b, Float.NaN, 560), d1.c.f15671v), f10, 48, f10, 0.0f, 8);
                x.c cVar = x.h.f29962b;
                d1.h hVar = d1.c.G;
                x.r a10 = x.q.a(cVar, hVar, rVar2, 0);
                int hashCode2 = Long.hashCode(rVar2.T);
                z0.g l11 = rVar2.l();
                d1.r c11 = d1.a.c(o10, rVar2);
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(b0Var);
                } else {
                    rVar2.n0();
                }
                y.I(fVar, a10, rVar2);
                y.I(fVar2, l11, rVar2);
                if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode2))) {
                    p.a.t(hashCode2, rVar2, hashCode2, fVar3);
                }
                y.I(fVar4, c11, rVar2);
                d1.r d10 = androidx.compose.foundation.layout.d(oVar, 1.0f);
                x.p0 a11 = o0.a(x.h.f29961a, d1.c.E, rVar2, 48);
                int hashCode3 = Long.hashCode(rVar2.T);
                z0.g l12 = rVar2.l();
                d1.r c12 = d1.a.c(d10, rVar2);
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(b0Var);
                } else {
                    rVar2.n0();
                }
                y.I(fVar, a11, rVar2);
                y.I(fVar2, l12, rVar2);
                if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode3))) {
                    p.a.t(hashCode3, rVar2, hashCode3, fVar3);
                }
                y.I(fVar4, c12, rVar2);
                String b12 = n7.b(R.string.about_title, rVar2);
                long j10 = k1.r.f19515d;
                long e = ae.e(28);
                s sVar = s.B;
                double d11 = 1.0f;
                if (d11 <= 0.0d) {
                    y.a.a("invalid weight; must be greater than zero");
                }
                x1.b(b12, new LayoutWeightElement(1.0f, true), j10, e, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, 200064, 0, 131024);
                h1.a(this.f31939v, null, false, null, d.f31947a, rVar2, 196608, 30);
                rVar2.p(true);
                x.b(androidx.compose.foundation.layout.f(oVar, 28), rVar2);
                if (d11 <= 0.0d) {
                    y.a.a("invalid weight; must be greater than zero");
                }
                d1.r d12 = xa.d(androidx.compose.foundation.layout.d(new LayoutWeightElement(1.0f, true), 1.0f), xa.b(rVar2), false, 14);
                x.r a12 = x.q.a(cVar, hVar, rVar2, 0);
                int hashCode4 = Long.hashCode(rVar2.T);
                z0.g l13 = rVar2.l();
                d1.r c13 = d1.a.c(d12, rVar2);
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(b0Var);
                } else {
                    rVar2.n0();
                }
                y.I(fVar, a12, rVar2);
                y.I(fVar2, l13, rVar2);
                if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode4))) {
                    p.a.t(hashCode4, rVar2, hashCode4, fVar3);
                }
                y.I(fVar4, c13, rVar2);
                x1.b(n7.b(R.string.about_legal_header, rVar2), null, k1.r.c(j10, 0.5f), ae.e(13), null, sVar, null, ae.e(1), null, 0L, 0, false, 0, 0, null, rVar2, 12782976, 0, 130898);
                x.b(androidx.compose.foundation.layout.f(oVar, 12), rVar2);
                int i14 = R.string.legal_terms_title;
                String b13 = n7.b(R.string.legal_terms_title, rVar2);
                Object O2 = rVar2.O();
                if (O2 == v0Var) {
                    a1Var = a1Var2;
                    O2 = new h9(a1Var, 12);
                    rVar2.k0(O2);
                } else {
                    a1Var = a1Var2;
                }
                b(b13, (df.a) O2, rVar2, 48);
                x.b(androidx.compose.foundation.layout.f(oVar, 10), rVar2);
                String b14 = n7.b(R.string.legal_privacy_title, rVar2);
                Object O3 = rVar2.O();
                if (O3 == v0Var) {
                    O3 = new h9(a1Var, 13);
                    rVar2.k0(O3);
                }
                b(b14, (df.a) O3, rVar2, 48);
                float f11 = 32;
                x.b(androidx.compose.foundation.layout.f(oVar, f11), rVar2);
                x1.b(n7.b(R.string.about_footer, rVar2), androidx.compose.foundation.layout.d(oVar, 1.0f), k1.r.c(j10, 0.4f), ae.e(12), null, null, null, 0L, new x2.k(3), 0L, 0, false, 0, 0, null, rVar2, 3504, 0, 130544);
                x.b(androidx.compose.foundation.layout.f(oVar, f11), rVar2);
                rVar2.p(true);
                rVar2.p(true);
                if (!kotlin.jvm.internal.l.a((String) a1Var.getValue(), "terminos")) {
                    i14 = R.string.legal_privacy_title;
                }
                String b15 = n7.b(i14, rVar2);
                if (kotlin.jvm.internal.l.a((String) a1Var.getValue(), "terminos")) {
                    i = -411709951;
                    i10 = R.string.legal_terms_body;
                    z3 = false;
                } else {
                    z3 = false;
                    i = -411708645;
                    i10 = R.string.legal_privacy_body;
                }
                String p10 = p.a.p(rVar2, i, i10, rVar2, z3);
                if (((String) a1Var.getValue()) != null) {
                    z9 = true;
                } else {
                    z9 = z3;
                }
                Object O4 = rVar2.O();
                if (O4 == v0Var) {
                    O4 = new h9(a1Var, 14);
                    rVar2.k0(O4);
                }
                b(b15, p10, z9, (df.a) O4, rVar2, 3072);
                rVar2.p(true);
                return zVar;
            default:
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                d1.r b16 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f506c, l0.d(4280163870L), k0Var);
                r rVar3 = (r) ((r0.m) obj2);
                Object O5 = rVar3.O();
                if (O5 == v0Var) {
                    O5 = b.f31942c;
                    rVar3.k0(O5);
                }
                d1.r b17 = d0.b(b16, zVar, (PointerInputEventHandler) O5);
                p0 d13 = x.d(d1.c.f15670u, false);
                int hashCode5 = Long.hashCode(rVar3.T);
                z0.g l14 = rVar3.l();
                d1.r c14 = d1.a.c(b17, rVar3);
                b2.h.f1471d.getClass();
                b0 b0Var2 = b2.g.f1462b;
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(b0Var2);
                } else {
                    rVar3.n0();
                }
                b2.f fVar5 = b2.g.e;
                y.I(fVar5, d13, rVar3);
                b2.f fVar6 = b2.g.f1464d;
                y.I(fVar6, l14, rVar3);
                b2.f fVar7 = b2.g.f1465f;
                if (rVar3.S || !kotlin.jvm.internal.l.a(rVar3.O(), Integer.valueOf(hashCode5))) {
                    p.a.t(hashCode5, rVar3, hashCode5, fVar7);
                }
                b2.f fVar8 = b2.g.f1463c;
                y.I(fVar8, c14, rVar3);
                float f12 = 16;
                d1.r o11 = androidx.compose.foundation.layout.a.o(bVar.a(androidx.compose.foundation.layout.d.o(androidx.compose.foundation.layout.d.f505b, Float.NaN, 560), d1.c.f15671v), f12, 48, f12, 0.0f, 8);
                x.r a13 = x.q.a(x.h.f29962b, d1.c.G, rVar3, 0);
                int hashCode6 = Long.hashCode(rVar3.T);
                z0.g l15 = rVar3.l();
                d1.r c15 = d1.a.c(o11, rVar3);
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(b0Var2);
                } else {
                    rVar3.n0();
                }
                y.I(fVar5, a13, rVar3);
                y.I(fVar6, l15, rVar3);
                if (rVar3.S || !kotlin.jvm.internal.l.a(rVar3.O(), Integer.valueOf(hashCode6))) {
                    p.a.t(hashCode6, rVar3, hashCode6, fVar7);
                }
                y.I(fVar8, c15, rVar3);
                d1.r d14 = androidx.compose.foundation.layout.d(oVar, 1.0f);
                x.p0 a14 = o0.a(x.h.f29961a, d1.c.E, rVar3, 48);
                int hashCode7 = Long.hashCode(rVar3.T);
                z0.g l16 = rVar3.l();
                d1.r c16 = d1.a.c(d14, rVar3);
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(b0Var2);
                } else {
                    rVar3.n0();
                }
                y.I(fVar5, a14, rVar3);
                y.I(fVar6, l16, rVar3);
                if (rVar3.S || !kotlin.jvm.internal.l.a(rVar3.O(), Integer.valueOf(hashCode7))) {
                    p.a.t(hashCode7, rVar3, hashCode7, fVar7);
                }
                y.I(fVar8, c16, rVar3);
                m mVar = (m) a1Var2.getValue();
                m mVar2 = m.MAIN;
                if (mVar != mVar2) {
                    rVar3.a0(-823146433);
                    Object O6 = rVar3.O();
                    if (O6 == v0Var) {
                        O6 = new h9(a1Var2, 16);
                        rVar3.k0(O6);
                    }
                    h1.a((df.a) O6, null, false, null, d.f31948b, rVar3, 196614, 30);
                    rVar = rVar3;
                    x.b(androidx.compose.foundation.layout.d.n(oVar, 8), rVar);
                    z10 = false;
                } else {
                    rVar = rVar3;
                    z10 = false;
                    rVar.a0(-826224392);
                }
                rVar.p(z10);
                if (((m) a1Var2.getValue()) == mVar2) {
                    i11 = 1913128845;
                    i12 = R.string.help_title;
                } else {
                    i11 = 1913130169;
                    i12 = R.string.help_quick_start_title;
                }
                String p11 = p.a.p(rVar, i11, i12, rVar, z10);
                long j11 = k1.r.f19515d;
                long e8 = ae.e(28);
                s sVar2 = s.B;
                double d15 = 1.0f;
                if (d15 <= 0.0d) {
                    y.a.a("invalid weight; must be greater than zero");
                }
                r rVar4 = rVar;
                x1.b(p11, new LayoutWeightElement(1.0f, true), j11, e8, null, sVar2, null, 0L, null, 0L, 0, false, 0, 0, null, rVar4, 200064, 0, 131024);
                h1.a(this.f31939v, null, false, null, d.f31949c, rVar4, 196608, 30);
                int i15 = 1;
                rVar4.p(true);
                x.b(androidx.compose.foundation.layout.f(oVar, 28), rVar4);
                m mVar3 = (m) a1Var2.getValue();
                if (d15 <= 0.0d) {
                    y.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                Object O7 = rVar4.O();
                if (O7 == v0Var) {
                    O7 = new c9(8);
                    rVar4.k0(O7);
                }
                androidx.compose.animation.a.a(mVar3, layoutWeightElement, (df.l) O7, null, null, null, z0.h.d(-911337969, new ab(a1Var2, i15), rVar4), rVar4, 1573248, 56);
                rVar4.p(true);
                rVar4.p(true);
                return zVar;
        }
    }
}
