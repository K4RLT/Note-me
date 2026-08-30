package k0;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: v, reason: collision with root package name */
    public static final c0 f19242v;

    /* renamed from: w, reason: collision with root package name */
    public static final c0 f19243w;

    /* renamed from: x, reason: collision with root package name */
    public static final c0 f19244x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19245u;

    static {
        int i = 0;
        f19242v = new c0(i, 0);
        f19243w = new c0(i, 1);
        f19244x = new c0(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, int i10) {
        super(i);
        this.f19245u = i10;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f19245u) {
            case 0:
                return new a1(1L);
            case 1:
                return null;
            default:
                return p1.f19391b;
        }
    }
}
