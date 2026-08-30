package r;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: v, reason: collision with root package name */
    public static final n0 f24129v;

    /* renamed from: w, reason: collision with root package name */
    public static final n0 f24130w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24131u;

    static {
        int i = 0;
        f24129v = new n0(i, 0);
        f24130w = new n0(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i, int i10) {
        super(i);
        this.f24131u = i10;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f24131u) {
            case 0:
                return x.f24159a;
            case 1:
                return new y0();
            default:
                return new l1(0);
        }
    }
}
