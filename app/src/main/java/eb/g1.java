package eb;

/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16141u = 0;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ o3 f16142v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ f1 f16143w;

    public g1(f1 f1Var, o3 o3Var) {
        this.f16142v = o3Var;
        this.f16143w = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16141u) {
            case 0:
                f1 f1Var = this.f16143w;
                o3 o3Var = this.f16142v;
                h3 h3Var = f1Var.f16128u;
                h3Var.Z();
                h3Var.R(o3Var);
                return;
            default:
                h3 h3Var2 = this.f16143w.f16128u;
                h3Var2.Z();
                o3 o3Var2 = this.f16142v;
                h3Var2.h().u();
                h3Var2.a0();
                fa.y.e(o3Var2.f16288u);
                h3Var2.T(o3Var2);
                h3Var2.R(o3Var2);
                return;
        }
    }

    public /* synthetic */ g1() {
    }
}
