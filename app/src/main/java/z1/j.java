package z1;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: v, reason: collision with root package name */
    public static final j f31824v;

    /* renamed from: w, reason: collision with root package name */
    public static final j f31825w;

    /* renamed from: x, reason: collision with root package name */
    public static final j f31826x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31827u;

    static {
        int i = 0;
        f31824v = new j(i, 0);
        f31825w = new j(i, 1);
        f31826x = new j(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, int i10) {
        super(i);
        this.f31827u = i10;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f31827u) {
            case 0:
                return null;
            case 1:
                return new b2.i0(2);
            default:
                return null;
        }
    }
}
