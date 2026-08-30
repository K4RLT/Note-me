package k0;
import o0.a;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import r0.l;
import r0.m;
import r0.v0;
import r0.y;
import v0.e;
import x.b;
import x.o0;
import x.p0;
import x.q0;
import z0.g;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f19226u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f19227v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f19228w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f19229x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j10, boolean z3, r rVar, o oVar) {
        super(2);
        this.f19226u = j10;
        this.f19227v = z3;
        this.f19228w = rVar;
        this.f19229x = oVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        q0 q0Var;
        m mVar = (m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (rVar.R(intValue & 1, z3)) {
            long j10 = this.f19226u;
            v0 v0Var = l.f24285a;
            o oVar = this.f19229x;
            boolean z9 = this.f19227v;
            if (j10 != 9205357640488583168L) {
                rVar.a0(-837626688);
                if (z9) {
                    q0Var = x.b.f29944b;
                } else {
                    q0Var = x.b.f29943a;
                }
                r j11 = androidx.compose.foundation.layout.d.j(this.f19228w, y2.h.b(j10), y2.a(j10), 0.0f, 0.0f, 12);
                p0 a10 = o0.a(q0Var, c.D, rVar, 0);
                int hashCode = Long.hashCode(rVar.T);
                g l10 = rVar.l();
                r c10 = a.c(j11, rVar);
                b2.h.f1471d.getClass();
                b2.b0 b0Var = b2.g.f1462b;
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                y.I(b2.g.e, a10, rVar);
                y.I(b2.g.f1464d, l10, rVar);
                b2.f fVar = b2.g.f1465f;
                if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                    a.t(hashCode, rVar, hashCode, fVar);
                }
                y.I(b2.g.f1463c, c10, rVar);
                boolean h3 = rVar.h(oVar);
                Object O = rVar.O();
                if (h3 || O == v0Var) {
                    O = new a(oVar, 0);
                    rVar.k0(O);
                }
                e(6, o.f15687a, (df.a) O, rVar, z9);
                rVar.p(true);
                rVar.p(false);
            } else {
                rVar.a0(-836697680);
                boolean h10 = rVar.h(oVar);
                Object O2 = rVar.O();
                if (h10 || O2 == v0Var) {
                    O2 = new a(oVar, 1);
                    rVar.k0(O2);
                }
                e(0, this.f19228w, (df.a) O2, rVar, z9);
                rVar.p(false);
            }
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
