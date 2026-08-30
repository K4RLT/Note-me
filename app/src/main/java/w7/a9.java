package w7;

/* loaded from: classes.dex */
public final /* synthetic */ class a9 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27899u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f27900v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27901w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f27902x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u7.c f27903y;

    public /* synthetic */ a9(u7.c cVar, u7.m3 m3Var, int i, int i10) {
        this.f27899u = 3;
        this.f27903y = cVar;
        this.f27900v = m3Var;
        this.f27901w = i;
        this.f27902x = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        Float f10;
        switch (this.f27899u) {
            case 0:
                Float f11 = (Float) obj;
                f11.getClass();
                n4.J0(this.f27900v, this.f27901w, this.f27902x, this.f27903y, null, null, null, f11, 880);
                break;
            case 1:
                Float f12 = (Float) obj;
                f12.getClass();
                n4.J0(this.f27900v, this.f27901w, this.f27902x, this.f27903y, null, null, f12, null, 944);
                break;
            case 2:
                Integer num = (Integer) obj;
                num.getClass();
                n4.J0(this.f27900v, this.f27901w, this.f27902x, this.f27903y, num, null, null, null, 2016);
                break;
            default:
                Integer num2 = (Integer) obj;
                num2.getClass();
                u7.c cVar = this.f27903y;
                if (cVar.e <= 0.0f) {
                    f10 = Float.valueOf(0.006f);
                } else {
                    f10 = null;
                }
                n4.J0(this.f27900v, this.f27901w, this.f27902x, cVar, null, num2, f10, null, 1936);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ a9(int i, int i10, int i11, u7.c cVar, u7.m3 m3Var) {
        this.f27899u = i11;
        this.f27900v = m3Var;
        this.f27901w = i;
        this.f27902x = i10;
        this.f27903y = cVar;
    }
}
