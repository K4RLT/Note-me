package c2;

/* loaded from: classes.dex */
public final class h2 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: v, reason: collision with root package name */
    public static final h2 f3549v;

    /* renamed from: w, reason: collision with root package name */
    public static final h2 f3550w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3551u;

    static {
        int i = 0;
        f3549v = new h2(i, 0);
        f3550w = new h2(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(int i, int i10) {
        super(i);
        this.f3551u = i10;
    }

    @Override // df.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f3551u) {
            case 0:
                return null;
            default:
                return Boolean.FALSE;
        }
    }
}
