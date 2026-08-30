package b8;

/* loaded from: classes.dex */
public final class l6 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2368u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p6 f2369v;

    /* renamed from: w, reason: collision with root package name */
    public int f2370w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(p6 p6Var, ve.c cVar) {
        super(cVar);
        this.f2369v = p6Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f2368u = obj;
        this.f2370w |= Integer.MIN_VALUE;
        Object e = this.f2369v.e(null, this);
        if (e == ue.a.f27192u) {
            return e;
        }
        return new pe.l(e);
    }
}
