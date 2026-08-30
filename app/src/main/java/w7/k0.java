package w7;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28547u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e3 f28548v;

    public /* synthetic */ k0(e3 e3Var, int i) {
        this.f28547u = i;
        this.f28548v = e3Var;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f28547u) {
            case 0:
                this.f28548v.E(false);
                break;
            case 1:
                this.f28548v.G.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f28548v.K.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f28548v.K.setValue(Boolean.TRUE);
                break;
            case 4:
                this.f28548v.L.setValue(null);
                break;
            default:
                this.f28548v.w(true);
                break;
        }
        return pe.z.f22715a;
    }
}
