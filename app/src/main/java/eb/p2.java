package eb;

/* loaded from: classes.dex */
public final class p2 extends l {
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n2 f16313f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(n2 n2Var, d1 d1Var, int i) {
        super(d1Var);
        this.e = i;
        this.f16313f = n2Var;
    }

    @Override // eb.l
    public final void c() {
        switch (this.e) {
            case 0:
                n2 n2Var = this.f16313f;
                n2Var.u();
                if (n2Var.I()) {
                    n2Var.f().I.g("Inactivity, disconnecting from the service");
                    n2Var.H();
                    return;
                }
                return;
            default:
                this.f16313f.f().D.g("Tasks have been queued for a long time");
                return;
        }
    }
}
