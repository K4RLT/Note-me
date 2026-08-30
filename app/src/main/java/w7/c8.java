package w7;
import b2.f;
import b2.g;
import b2.h;
import d.d;
import d.f;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import h8.b;
import j.a;
import k1.l0;
import k1.r;
import p.a;
import p.x;
import r0.a1;
import r0.l;
import r0.m;
import r0.r;
import r0.y;
import sa.a;
import x.b;
import x.h;
import x.m;
import x.o0;
import x.p0;
import x.q;
import x.r;
import y.a;
import y2.f;
import z0.g;
import z1.p0;

import androidx.compose.foundation.layout.LayoutWeightElement;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public final /* synthetic */ class c8 implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28039u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28040v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28041w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f28042x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f28043y;

    public /* synthetic */ c8(u7.c cVar, u7.m3 m3Var, int i, int i10) {
        this.f28043y = cVar;
        this.f28040v = m3Var;
        this.f28041w = i;
        this.f28042x = i10;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i;
        int i10 = this.f28039u;
        pe.z zVar = pe.z.f22715a;
        Object obj4 = l.f24285a;
        Object obj5 = this.f28043y;
        switch (i10) {
            case 0:
                a1 a1Var = (a1) obj5;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                r rVar = (r) ((m) obj2);
                boolean f10 = rVar.f(a1Var);
                Object O = rVar.O();
                if (f10 || O == obj4) {
                    O = new u7.k4(a1Var, 22);
                    rVar.k0(O);
                }
                b(this.f28040v, this.f28041w, this.f28042x, (df.a) O, rVar, 0);
                return zVar;
            default:
                u7.c cVar = (u7.c) obj5;
                m mVar = (m) obj2;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                r a10 = q.a(h.f29962b, c.H, mVar, 48);
                int t3 = y.t(mVar);
                r rVar2 = (r) mVar;
                g l10 = rVar2.l();
                o oVar = o.f15687a;
                r c10 = a.c(oVar, mVar);
                h.f1471d.getClass();
                df.a aVar = g.f1462b;
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(aVar);
                } else {
                    rVar2.n0();
                }
                f fVar = g.e;
                y.I(fVar, a10, mVar);
                f fVar2 = g.f1464d;
                y.I(fVar2, l10, mVar);
                f fVar3 = g.f1465f;
                if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(t3))) {
                    a.t(t3, rVar2, t3, fVar3);
                }
                f fVar4 = g.f1463c;
                y.I(fVar4, c10, mVar);
                b.b(androidx.compose.foundation.layout.f(oVar, 12), mVar);
                n4.A0(wa.n7.b(R.string.shape_thickness, mVar), mVar, 0);
                float f11 = 14;
                r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.d(oVar, 1.0f), f11, 0.0f, 2);
                p0 a11 = o0.a(h.i(f11), c.E, mVar, 54);
                int t10 = y.t(mVar);
                g l11 = rVar2.l();
                r c11 = a.c(m4, mVar);
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(aVar);
                } else {
                    rVar2.n0();
                }
                y.I(fVar, a11, mVar);
                y.I(fVar2, l11, mVar);
                if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(t10))) {
                    a.t(t10, rVar2, t10, fVar3);
                }
                y.I(fVar4, c11, mVar);
                r k3 = androidx.compose.foundation.layout.d.k(oVar, 40);
                p0 d2 = m.d(c.f15674y, false);
                int t11 = y.t(mVar);
                g l12 = rVar2.l();
                r c12 = a.c(k3, mVar);
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(aVar);
                } else {
                    rVar2.n0();
                }
                y.I(fVar, d2, mVar);
                y.I(fVar2, l12, mVar);
                if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(t11))) {
                    a.t(t11, rVar2, t11, fVar3);
                }
                y.I(fVar4, c12, mVar);
                r n10 = androidx.compose.foundation.layout.d.n(oVar, 26);
                f fVar5 = new f((cVar.e * 260.0f) + 1.0f);
                f fVar6 = new f(22);
                if (fVar5.compareTo(fVar6) > 0) {
                    fVar5 = fVar6;
                }
                r f12 = androidx.compose.foundation.layout.f(n10, fVar5.f30805u);
                f0.d dVar = f0.e.f16629a;
                r a12 = wa.j7.a(f12, dVar);
                Integer num = cVar.f25972d;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -6381922;
                }
                m.a(0, ya.a(androidx.compose.foundation.a.b(a12, l0.c(i), l0.f19495a), (float) 0.5d, r.c(r.f19515d, 0.35f), dVar), mVar);
                rVar2.p(true);
                float d10 = wa.b9.d(cVar.e, 0.0015f, 0.022f);
                if (1.0f <= 0.0d) {
                    a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                u7.m3 m3Var = this.f28040v;
                boolean h3 = rVar2.h(m3Var);
                int i11 = this.f28041w;
                boolean d11 = h3 | rVar2.d(i11);
                int i12 = this.f28042x;
                boolean d12 = d11 | rVar2.d(i12) | rVar2.f(cVar);
                Object O2 = rVar2.O();
                if (d12 || O2 == obj4) {
                    O2 = new a9(i11, i12, 1, cVar, m3Var);
                    rVar2.k0(O2);
                }
                df.l lVar = (df.l) O2;
                boolean h10 = rVar2.h(m3Var) | rVar2.d(i11) | rVar2.d(i12);
                Object O3 = rVar2.O();
                if (h10 || O3 == obj4) {
                    O3 = new u7.o2(m3Var, i11, i12, 6);
                    rVar2.k0(O3);
                }
                x7.a(d10, 0.0015f, 0.022f, lVar, layoutWeightElement, (df.a) O3, mVar, 432, 0);
                rVar2.p(true);
                rVar2.p(true);
                return zVar;
        }
    }

    public /* synthetic */ c8(u7.m3 m3Var, int i, int i10, a1 a1Var) {
        this.f28040v = m3Var;
        this.f28041w = i;
        this.f28042x = i10;
        this.f28043y = a1Var;
    }
}
