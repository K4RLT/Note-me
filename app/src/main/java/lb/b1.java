package lb;

/* loaded from: classes.dex */
public final class b1 implements mb.f {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20092u;

    /* renamed from: v, reason: collision with root package name */
    public final mb.e f20093v;

    public /* synthetic */ b1(mb.e eVar, int i) {
        this.f20092u = i;
        this.f20093v = eVar;
    }

    @Override // mb.f
    public final /* bridge */ /* synthetic */ Object b() {
        switch (this.f20092u) {
            case 0:
                return new a1((v) this.f20093v.b());
            default:
                return new p1((v) this.f20093v.b());
        }
    }
}
