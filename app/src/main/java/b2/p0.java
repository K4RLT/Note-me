package b2;

/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r0 f1571u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f1572v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f1573w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z1 f1574x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r0 r0Var, long j10, long j11, z1 z1Var) {
        super(0);
        this.f1571u = r0Var;
        this.f1572v = j10;
        this.f1573w = j11;
        this.f1574x = z1Var;
    }

    @Override // df.a
    public final Object invoke() {
        r0 r0Var = this.f1571u;
        r0Var.S0().f1561u = false;
        r0Var.S0().f1562v = this.f1572v;
        r0Var.S0().f1563w = this.f1573w;
        df.l c10 = this.f1574x.f1637u.c();
        if (c10 != null) {
            c10.invoke(r0Var.S0());
        }
        return pe.z.f22715a;
    }
}
