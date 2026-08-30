package b8;

/* loaded from: classes.dex */
public final class o6 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2482u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p6 f2483v;

    /* renamed from: w, reason: collision with root package name */
    public int f2484w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(p6 p6Var, ve.c cVar) {
        super(cVar);
        this.f2483v = p6Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f2482u = obj;
        this.f2484w |= Integer.MIN_VALUE;
        Object g8 = this.f2483v.g(null, null, this);
        if (g8 == ue.a.f27192u) {
            return g8;
        }
        return new pe.l(g8);
    }
}
