package b8;

/* loaded from: classes.dex */
public final class y3 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3029u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z3 f3030v;

    /* renamed from: w, reason: collision with root package name */
    public int f3031w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(z3 z3Var, ve.c cVar) {
        super(cVar);
        this.f3030v = z3Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f3029u = obj;
        this.f3031w |= Integer.MIN_VALUE;
        Object c10 = this.f3030v.c(null, null, null, this);
        if (c10 == ue.a.f27192u) {
            return c10;
        }
        return new pe.l(c10);
    }
}
