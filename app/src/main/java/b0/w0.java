package b0;

/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1274u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z0 f1275v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(z0 z0Var, int i) {
        super(0);
        this.f1274u = i;
        this.f1275v = z0Var;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f1274u) {
            case 0:
                z0 z0Var = this.f1275v;
                return Float.valueOf(z0Var.J.a() - z0Var.J.c());
            case 1:
                return Float.valueOf(this.f1275v.J.b());
            default:
                return Float.valueOf(this.f1275v.J.d());
        }
    }
}
