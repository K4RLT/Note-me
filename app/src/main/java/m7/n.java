package m7;

/* loaded from: classes.dex */
public final class n extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public o7.b f20670u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f20671v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j6.n f20672w;

    /* renamed from: x, reason: collision with root package name */
    public int f20673x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j6.n nVar, ve.c cVar) {
        super(cVar);
        this.f20672w = nVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f20671v = obj;
        this.f20673x |= Integer.MIN_VALUE;
        return this.f20672w.p(null, this);
    }
}
