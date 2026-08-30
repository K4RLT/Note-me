package rf;

/* loaded from: classes.dex */
public final class g extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f24781u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f24782v;

    /* renamed from: w, reason: collision with root package name */
    public int f24783w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ve.c cVar) {
        super(cVar);
        this.f24782v = hVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f24781u = obj;
        this.f24783w |= Integer.MIN_VALUE;
        Object D = this.f24782v.D(null, 0, 0L, this);
        if (D == ue.a.f27192u) {
            return D;
        }
        return new o(D);
    }
}
