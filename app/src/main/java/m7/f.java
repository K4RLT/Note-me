package m7;

/* loaded from: classes.dex */
public final class f extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f20643u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j6.n f20644v;

    /* renamed from: w, reason: collision with root package name */
    public int f20645w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j6.n nVar, ve.c cVar) {
        super(cVar);
        this.f20644v = nVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f20643u = obj;
        this.f20645w |= Integer.MIN_VALUE;
        return this.f20644v.g(this);
    }
}
