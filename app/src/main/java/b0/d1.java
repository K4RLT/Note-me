package b0;
import d1.a;
import d1.c;
import d1.r;
import f0.c;
import h1.a;
import l.a;
import p.a;
import p.m1;
import r0.m;
import r0.r;
import r0.y;
import x.m;
import x.q0;
import z0.c;
import z0.g;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1173u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f1174v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(c cVar) {
        super(2);
        this.f1173u = 1;
        this.f1174v = cVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1173u) {
            case 0:
                ((Number) obj2).intValue();
                c(this.f1174v, (m) obj, y.L(7));
                return pe.z.f22715a;
            case 1:
                m mVar = (m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    r rVar = (r) mVar;
                    if (rVar.D()) {
                        rVar.U();
                        return pe.z.f22715a;
                    }
                }
                r o10 = androidx.compose.foundation.layout.a.o(q0.g(1.0f), 0, 0.0f, 0, 0.0f, 10);
                z1.p0 d2 = m.d(c.f15670u, false);
                int t3 = y.t(mVar);
                r rVar2 = (r) mVar;
                g l10 = rVar2.l();
                r c10 = a.c(o10, mVar);
                b2.h.f1471d.getClass();
                b2.b0 b0Var = b2.g.f1462b;
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(b0Var);
                } else {
                    rVar2.n0();
                }
                y.I(b2.g.e, d2, mVar);
                y.I(b2.g.f1464d, l10, mVar);
                b2.f fVar = b2.g.f1465f;
                if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(t3))) {
                    a.t(t3, rVar2, t3, fVar);
                }
                y.I(b2.g.f1463c, c10, mVar);
                this.f1174v.invoke(mVar, 0);
                rVar2.p(true);
                return pe.z.f22715a;
            case 2:
                ((Number) obj2).intValue();
                m1.b(this.f1174v, (m) obj, y.L(7));
                return pe.z.f22715a;
            default:
                ((Number) obj2).intValue();
                z1.a(this.f1174v, (m) obj, y.L(7));
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(c cVar, int i, int i10) {
        super(2);
        this.f1173u = i10;
        this.f1174v = cVar;
    }
}
