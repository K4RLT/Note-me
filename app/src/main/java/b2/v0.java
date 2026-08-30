package b2;
import z0.j;
import c2.x;
import z1.z0;

/* loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w0 f1611u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v1 f1612v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f1613w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, v1 v1Var, long j10) {
        super(0);
        this.f1611u = w0Var;
        this.f1612v = v1Var;
        this.f1613w = j10;
    }

    @Override // df.a
    public final Object invoke() {
        s0 f12;
        n0 n0Var = this.f1611u.f1614z;
        z0 z0Var = null;
        if (!l.p(n0Var.f1545a) && !n0Var.f1547c) {
            k1 k1Var = n0Var.a().M;
            if (k1Var != null && (f12 = k1Var.f1()) != null) {
                z0Var = f12.F;
            }
        } else {
            k1 k1Var2 = n0Var.a().M;
            if (k1Var2 != null) {
                z0Var = k1Var2.F;
            }
        }
        if (z0Var == null) {
            z0Var = ((x) this.f1612v).getPlacementScope();
        }
        s0 f13 = n0Var.a().f1();
        f13.getClass();
        z0.j(z0Var, f13, this.f1613w);
        return pe.z.f22715a;
    }
}
