package b8;
import a.a;
import x1.b;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d.d;
import d1.a;
import d1.c;
import d1.i;
import d1.j;
import d1.o;
import d1.r;
import f0.e;
import k1.k0;
import k1.l0;
import o0.x1;
import o0.y;
import p.x;
import q2.s;
import r0.a1;
import r0.l;
import r0.m;
import r0.v0;
import u7.k4;

import androidx.compose.foundation.layout.LayoutWeightElement;
import com.daren.scraply.R;
import ya.ae;

/* loaded from: classes.dex */
public final /* synthetic */ class ja implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2273u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f2274v;

    public /* synthetic */ ja(a1 a1Var, int i) {
        this.f2273u = i;
        this.f2274v = a1Var;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z3;
        int i;
        int i10 = this.f2273u;
        v0 v0Var = l.f24285a;
        k0 k0Var = l0.f19495a;
        o oVar = o.f15687a;
        pe.z zVar = pe.z.f22715a;
        boolean z9 = true;
        a1 a1Var = this.f2274v;
        switch (i10) {
            case 0:
                m mVar = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((x.s) obj).getClass();
                if ((intValue & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    r d2 = androidx.compose.foundation.layout.d(oVar, 1.0f);
                    x.p0 a10 = x.a(x.h.e, c.D, rVar, 54);
                    int hashCode = Long.hashCode(rVar.T);
                    g l10 = rVar.l();
                    r c10 = a.c(d2, rVar);
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
                    x.e i11 = x.h.i(7);
                    i iVar = c.E;
                    if (1.0f <= 0.0d) {
                        a.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    x.p0 a11 = x.a(i11, iVar, rVar, 54);
                    int hashCode2 = Long.hashCode(rVar.T);
                    g l11 = rVar.l();
                    r c11 = a.c(layoutWeightElement, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar, a11, rVar);
                    y.I(fVar2, l11, rVar);
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode2))) {
                        a.t(hashCode2, rVar, hashCode2, fVar3);
                    }
                    y.I(fVar4, c11, rVar);
                    f(15, 0L, null, 0.0f, rVar, 6, 14);
                    String b10 = wa.n7.b(R.string.universe_notice_title, rVar);
                    long j10 = r.f19515d;
                    x1.b(b10, null, j10, ae.e(13), null, s.B, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 200064, 0, 131026);
                    rVar.p(true);
                    r b11 = androidx.compose.foundation.a.b(wa.a(androidx.compose.foundation.layout.d.k(oVar, 22), e.f16629a), r.c(j10, 0.08f), k0Var);
                    Object O = rVar.O();
                    if (O == v0Var) {
                        O = a.r(rVar);
                    }
                    i iVar2 = (i) O;
                    Object O2 = rVar.O();
                    if (O2 == v0Var) {
                        O2 = new a5(a1Var, 10);
                        rVar.k0(O2);
                    }
                    r e = androidx.compose.foundation.a.e(b11, iVar2, null, false, null, (df.a) O2, 28);
                    j jVar = c.f15674y;
                    z1.p0 d10 = x.d(jVar, false);
                    int hashCode3 = Long.hashCode(rVar.T);
                    g l12 = rVar.l();
                    r c12 = a.c(e, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar, d10, rVar);
                    y.I(fVar2, l12, rVar);
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode3))) {
                        a.t(hashCode3, rVar, hashCode3, fVar3);
                    }
                    y.I(fVar4, c12, rVar);
                    y.b(wa.a(), wa.n7.b(R.string.universe_notice_dismiss, rVar), androidx.compose.foundation.layout.d.k(oVar, 11), j10, rVar, 3456, 0);
                    rVar.p(true);
                    rVar.p(true);
                    x1.b(wa.n7.b(R.string.universe_notice_body, rVar), null, r.c(j10, 0.72f), ae.e(11), null, null, null, 0L, null, ae.e(15), 0, false, 0, 0, null, rVar, 3456, 6, 130034);
                    r b12 = androidx.compose.foundation.a.b(wa.a(androidx.compose.foundation.layout.d(oVar, 1.0f), e.a(10)), kb.f2336c, k0Var);
                    Object O3 = rVar.O();
                    if (O3 == v0Var) {
                        O3 = a.r(rVar);
                    }
                    i iVar3 = (i) O3;
                    Object O4 = rVar.O();
                    if (O4 == v0Var) {
                        O4 = new a5(a1Var, 11);
                        rVar.k0(O4);
                    }
                    r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.e(b12, iVar3, null, false, null, (df.a) O4, 28), 0.0f, 8, 1);
                    z1.p0 d11 = x.d(jVar, false);
                    int hashCode4 = Long.hashCode(rVar.T);
                    g l13 = rVar.l();
                    r c13 = a.c(m4, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar, d11, rVar);
                    y.I(fVar2, l13, rVar);
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode4))) {
                        a.t(hashCode4, rVar, hashCode4, fVar3);
                    }
                    y.I(fVar4, c13, rVar);
                    x1.b(wa.n7.b(R.string.universe_notice_cta, rVar), null, j10, ae.e(12), null, s.A, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 200064, 0, 131026);
                    rVar.p(true);
                    return zVar;
                }
                rVar.U();
                return zVar;
            case 1:
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                r b13 = androidx.compose.foundation.a.b(wa.a(androidx.compose.foundation.layout.d.k(oVar, 24), e.f16629a), l0.d(3861522986L), k0Var);
                r rVar2 = (r) ((m) obj2);
                Object O5 = rVar2.O();
                if (O5 == v0Var) {
                    O5 = a.r(rVar2);
                }
                i iVar4 = (i) O5;
                Object O6 = rVar2.O();
                if (O6 == v0Var) {
                    O6 = new k4(a1Var, 6);
                    rVar2.k0(O6);
                }
                r e8 = androidx.compose.foundation.a.e(b13, iVar4, null, false, null, (df.a) O6, 28);
                z1.p0 d12 = x.d(c.f15674y, false);
                int hashCode5 = Long.hashCode(rVar2.T);
                g l14 = rVar2.l();
                r c14 = a.c(e8, rVar2);
                h.f1471d.getClass();
                b0 b0Var2 = g.f1462b;
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(b0Var2);
                } else {
                    rVar2.n0();
                }
                y.I(g.e, d12, rVar2);
                y.I(g.f1464d, l14, rVar2);
                f fVar5 = g.f1465f;
                if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode5))) {
                    a.t(hashCode5, rVar2, hashCode5, fVar5);
                }
                y.I(g.f1463c, c14, rVar2);
                y.b((e) w7.z.f29518b.getValue(), wa.n7.b(R.string.canvas_show_tools, rVar2), androidx.compose.foundation.layout.d.k(oVar, 12), r.f19515d, rVar2, 3456, 0);
                rVar2.p(true);
                return zVar;
            default:
                df.p pVar = (df.p) obj;
                m mVar2 = (m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                pVar.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((r) mVar2).h(pVar)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) == 18) {
                    z9 = false;
                }
                r rVar3 = (r) mVar2;
                if (rVar3.R(intValue2 & 1, z9)) {
                    if (((String) a1Var.getValue()).length() == 0) {
                        rVar3.a0(1566195935);
                        x1.b(wa.n7.b(R.string.font_search_hint, rVar3), null, r.c(r.f19515d, 0.32f), ae.e(12), null, null, null, 0L, null, 0L, 2, false, 1, 0, null, rVar3, 3456, 3120, 120818);
                    } else {
                        rVar3.a0(1549985105);
                    }
                    rVar3.p(false);
                    pVar.invoke(rVar3, Integer.valueOf(intValue2 & 14));
                } else {
                    rVar3.U();
                }
                return zVar;
        }
    }
}
