package b8;

/* loaded from: classes.dex */
public final class p3 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2514u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u3 f2515v;

    /* renamed from: w, reason: collision with root package name */
    public int f2516w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(u3 u3Var, ve.c cVar) {
        super(cVar);
        this.f2515v = u3Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f2514u = obj;
        this.f2516w |= Integer.MIN_VALUE;
        Object c10 = this.f2515v.c(null, null, null, this);
        if (c10 == ue.a.f27192u) {
            return c10;
        }
        return new pe.l(c10);
    }
}
