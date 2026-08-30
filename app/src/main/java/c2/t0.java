package c2;

/* loaded from: classes.dex */
public final class t0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3643u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u0 f3644v;

    /* renamed from: w, reason: collision with root package name */
    public int f3645w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, ve.c cVar) {
        super(cVar);
        this.f3644v = u0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f3643u = obj;
        this.f3645w |= Integer.MIN_VALUE;
        this.f3644v.a(null, this);
        return ue.a.f27192u;
    }
}
