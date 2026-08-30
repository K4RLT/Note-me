package c2;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import b2.v1;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import g0.a1;
import k0.j1;
import k0.w;
import o0.e0;
import o0.r0;
import p.a;
import p1.a;
import r.l1;
import r0.a1;
import r0.m;
import r0.r;
import r0.y;
import t.x1;
import t.z1;
import x.h;
import x.j0;
import x.m;
import x.q;
import x.r;
import x.s;
import z0.c;
import z0.g;
import z1.p0;

import ya.xa;

/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3624u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3625v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3626w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3627x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i, Object obj, Object obj2, Object obj3) {
        super(2);
        this.f3624u = i;
        this.f3627x = obj;
        this.f3625v = obj2;
        this.f3626w = obj3;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        int i = this.f3624u;
        pe.z zVar = pe.z.f22715a;
        Object obj3 = this.f3626w;
        Object obj4 = this.f3625v;
        Object obj5 = this.f3627x;
        switch (i) {
            case 0:
                m mVar = (m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    a((x) obj5, (b1) obj4, (df.p) obj3, rVar, 0);
                } else {
                    rVar.U();
                }
                return zVar;
            case 1:
                ((Number) obj2).intValue();
                a((v1) obj5, (b1) obj4, (df.p) obj3, (m) obj, y.L(1));
                return zVar;
            case 2:
                ((Number) obj2).intValue();
                a1.h((r) obj5, (j1) obj4, (c) obj3, (m) obj, y.L(385));
                return zVar;
            case 3:
                m mVar2 = (m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    r rVar2 = (r) mVar2;
                    if (rVar2.D()) {
                        rVar2.U();
                        return zVar;
                    }
                }
                r d2 = xa.d(androidx.compose.foundation.layout.a.p(androidx.compose.foundation.layout.a.m((r) obj5, 0.0f, e0.f21459d, 1)), (l1) obj4, false, 14);
                c cVar = (c) obj3;
                r a10 = q.a(h.f29962b, c.G, mVar2, 0);
                int t3 = y.t(mVar2);
                r rVar3 = (r) mVar2;
                g l10 = rVar3.l();
                r c10 = a.c(d2, mVar2);
                h.f1471d.getClass();
                b0 b0Var = g.f1462b;
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(b0Var);
                } else {
                    rVar3.n0();
                }
                y.I(g.e, a10, mVar2);
                y.I(g.f1464d, l10, mVar2);
                f fVar = g.f1465f;
                if (rVar3.S || !kotlin.jvm.internal.l.a(rVar3.O(), Integer.valueOf(t3))) {
                    a.t(t3, rVar3, t3, fVar);
                }
                y.I(g.f1463c, c10, mVar2);
                cVar.b(s.f29999a, mVar2, 6);
                rVar3.p(true);
                return zVar;
            case 4:
                m mVar3 = (m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    r rVar4 = (r) mVar3;
                    if (rVar4.D()) {
                        rVar4.U();
                        return zVar;
                    }
                }
                r c11 = androidx.compose.ui.layout.a.c(o.f15687a, "Container");
                float f10 = r0.f21644a;
                r c12 = androidx.compose.ui.draw.a.c(c11, new w(new kotlin.jvm.internal.t((a1) obj5, a1.class, "value", "getValue()Ljava/lang/Object;", 0), 5, (j0) obj4));
                c cVar2 = (c) obj3;
                p0 d10 = m.d(c.f15670u, true);
                int t10 = y.t(mVar3);
                r rVar5 = (r) mVar3;
                g l11 = rVar5.l();
                r c13 = a.c(c12, mVar3);
                h.f1471d.getClass();
                b0 b0Var2 = g.f1462b;
                rVar5.e0();
                if (rVar5.S) {
                    rVar5.k(b0Var2);
                } else {
                    rVar5.n0();
                }
                y.I(g.e, d10, mVar3);
                y.I(g.f1464d, l11, mVar3);
                f fVar2 = g.f1465f;
                if (rVar5.S || !kotlin.jvm.internal.l.a(rVar5.O(), Integer.valueOf(t10))) {
                    a.t(t10, rVar5, t10, fVar2);
                }
                y.I(g.f1463c, c13, mVar3);
                cVar2.invoke(mVar3, 0);
                rVar5.p(true);
                return zVar;
            default:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj5;
                z1 z1Var = (z1) obj4;
                long h3 = z1Var.h(z1Var.d(floatValue - vVar.f19784u));
                z1 z1Var2 = ((x1) obj3).f25580a;
                vVar.f19784u += z1Var.d(z1Var.g(z1.a(z1Var2, z1Var2.f25607j, h3, 1)));
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, Object obj2, df.p pVar, int i, int i10) {
        super(2);
        this.f3624u = i10;
        this.f3627x = obj;
        this.f3625v = obj2;
        this.f3626w = pVar;
    }
}
