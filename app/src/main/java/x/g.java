package x;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: v, reason: collision with root package name */
    public static final g f29959v = new g(2, 0);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29960u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, int i10) {
        super(i);
        this.f29960u = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29960u) {
            case 0:
                float intValue = ((Number) obj).intValue() / 2.0f;
                float f10 = -1.0f;
                if (((y2.m) obj2) != y2.m.f30814u) {
                    f10 = (-1.0f) * (-1);
                }
                return Integer.valueOf(Math.round((1 + f10) * intValue));
            default:
                float intValue2 = (((Number) obj).intValue() + 0) / 2.0f;
                float f11 = 0.0f;
                if (((y2.m) obj2) != y2.m.f30814u) {
                    f11 = 0.0f * (-1);
                }
                return Integer.valueOf(Math.round((1 + f11) * intValue2));
        }
    }
}
