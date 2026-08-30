package s7;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24990u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s6.g f24991v;

    public /* synthetic */ a(s6.g gVar, int i) {
        this.f24990u = i;
        this.f24991v = gVar;
    }

    @Override // df.a
    public final Object invoke() {
        float floatValue;
        switch (this.f24990u) {
            case 0:
                floatValue = ((Number) this.f24991v.getValue()).floatValue();
                break;
            default:
                floatValue = ((Number) this.f24991v.getValue()).floatValue();
                break;
        }
        return Float.valueOf(floatValue);
    }
}
