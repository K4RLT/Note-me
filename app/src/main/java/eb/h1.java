package eb;

/* loaded from: classes.dex */
public final class h1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16162u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o3 f16163v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f1 f16164w;

    public /* synthetic */ h1(f1 f1Var, o3 o3Var, int i) {
        this.f16162u = i;
        this.f16163v = o3Var;
        this.f16164w = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16162u) {
            case 0:
                h3 h3Var = this.f16164w.f16128u;
                h3Var.Z();
                h3Var.N(this.f16163v);
                return;
            default:
                h3 h3Var2 = this.f16164w.f16128u;
                h3Var2.Z();
                h3Var2.P(this.f16163v);
                return;
        }
    }
}
