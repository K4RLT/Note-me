package c0;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3307u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f3308v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(d dVar, int i) {
        super(0);
        this.f3307u = i;
        this.f3308v = dVar;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f3307u) {
            case 0:
                return Integer.valueOf(this.f3308v.m());
            default:
                return Integer.valueOf(this.f3308v.m());
        }
    }
}
