package k0;
import g0.a1;
import g0.y;
import r0.m;
import r0.r;
import z0.c;
import z0.h;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19458u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t0 f19459v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f19460w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f19461x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t0 t0Var, a1 a1Var, c cVar) {
        super(2);
        this.f19459v = t0Var;
        this.f19460w = a1Var;
        this.f19461x = cVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        boolean z9;
        switch (this.f19458u) {
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
                    y.a(b1.f19236a.a(this.f19460w), h.d(-272381430, new y(this.f19461x, this.f19459v), rVar), rVar, 56);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
            default:
                m mVar2 = (m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.R(intValue2 & 1, z9)) {
                    a1 a1Var = this.f19460w;
                    c cVar = this.f19461x;
                    t0 t0Var = this.f19459v;
                    a1.e(t0Var, h.d(577209674, new z(a1Var, cVar, t0Var), rVar2), rVar2, 48);
                } else {
                    rVar2.U();
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a1 a1Var, c cVar, t0 t0Var) {
        super(2);
        this.f19460w = a1Var;
        this.f19461x = cVar;
        this.f19459v = t0Var;
    }
}
