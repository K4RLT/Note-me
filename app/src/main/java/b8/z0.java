package b8;

/* loaded from: classes.dex */
public final class z0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3056u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d1 f3057v;

    /* renamed from: w, reason: collision with root package name */
    public int f3058w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(d1 d1Var, ve.c cVar) {
        super(cVar);
        this.f3057v = d1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f3056u = obj;
        this.f3058w |= Integer.MIN_VALUE;
        Object f10 = this.f3057v.f(null, this);
        if (f10 == ue.a.f27192u) {
            return f10;
        }
        return new pe.l(f10);
    }
}
