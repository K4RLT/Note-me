package k0;
import j1.b;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19453u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t0 f19454v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(t0 t0Var, int i) {
        super(0);
        this.f19453u = i;
        this.f19454v = t0Var;
    }

    @Override // df.a
    public final Object invoke() {
        long j10;
        long j11;
        switch (this.f19453u) {
            case 0:
                b bVar = (b) this.f19454v.f19424n.getValue();
                if (bVar != null) {
                    j10 = bVar.f18762a;
                } else {
                    j10 = 9205357640488583168L;
                }
                return new b(j10);
            case 1:
                b bVar2 = (b) this.f19454v.f19425o.getValue();
                if (bVar2 != null) {
                    j11 = bVar2.f18762a;
                } else {
                    j11 = 9205357640488583168L;
                }
                return new b(j11);
            case 2:
                t0 t0Var = this.f19454v;
                t0Var.f19429s = true;
                t0Var.p();
                t0Var.f19426p.setValue(null);
                t0Var.f19427q.setValue(null);
                return pe.z.f22715a;
            default:
                this.f19454v.i();
                return pe.z.f22715a;
        }
    }
}
