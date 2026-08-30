package p;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f22195u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(boolean z3) {
        super(1);
        this.f22195u = z3;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean z3;
        k1.m0 m0Var = (k1.m0) obj;
        if (!this.f22195u && Boolean.TRUE.booleanValue()) {
            z3 = true;
        } else {
            z3 = false;
        }
        m0Var.f(z3);
        return pe.z.f22715a;
    }
}
