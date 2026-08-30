package g0;

/* loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17131u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p1 f17132v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(p1 p1Var, int i) {
        super(0);
        this.f17131u = i;
        this.f17132v = p1Var;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f17131u) {
            case 0:
                this.f17132v.onStop();
                return pe.z.f22715a;
            default:
                this.f17132v.onCancel();
                return pe.z.f22715a;
        }
    }
}
