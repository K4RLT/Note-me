package b8;

/* loaded from: classes.dex */
public final /* synthetic */ class i8 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2212u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f2213v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2214w;

    public /* synthetic */ i8(int i, int i10, df.l lVar) {
        this.f2212u = i10;
        this.f2213v = lVar;
        this.f2214w = i;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f2212u) {
            case 0:
                this.f2213v.invoke(Integer.valueOf(this.f2214w));
                break;
            default:
                this.f2213v.invoke(Integer.valueOf(this.f2214w));
                break;
        }
        return pe.z.f22715a;
    }
}
