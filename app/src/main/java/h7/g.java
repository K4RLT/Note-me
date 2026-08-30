package h7;

/* loaded from: classes.dex */
public final class g extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f17885u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f17886v;

    /* renamed from: w, reason: collision with root package name */
    public int f17887w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, ve.c cVar) {
        super(cVar);
        this.f17886v = jVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f17885u = obj;
        this.f17887w |= Integer.MIN_VALUE;
        Object c10 = this.f17886v.c(null, null, null, null, null, null, this);
        if (c10 == ue.a.f27192u) {
            return c10;
        }
        return new pe.l(c10);
    }
}
