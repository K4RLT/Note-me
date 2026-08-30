package b8;

/* loaded from: classes.dex */
public final class k3 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2304u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u3 f2305v;

    /* renamed from: w, reason: collision with root package name */
    public int f2306w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(u3 u3Var, ve.c cVar) {
        super(cVar);
        this.f2305v = u3Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f2304u = obj;
        this.f2306w |= Integer.MIN_VALUE;
        Object f10 = this.f2305v.f(null, this);
        if (f10 == ue.a.f27192u) {
            return f10;
        }
        return new pe.l(f10);
    }
}
