package b8;

/* loaded from: classes.dex */
public final class b1 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f1867u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d1 f1868v;

    /* renamed from: w, reason: collision with root package name */
    public int f1869w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(d1 d1Var, ve.c cVar) {
        super(cVar);
        this.f1868v = d1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f1867u = obj;
        this.f1869w |= Integer.MIN_VALUE;
        Object c10 = this.f1868v.c(null, null, null, this);
        if (c10 == ue.a.f27192u) {
            return c10;
        }
        return new pe.l(c10);
    }
}
