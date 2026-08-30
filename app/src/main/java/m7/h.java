package m7;

/* loaded from: classes.dex */
public final class h extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f20649u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j6.n f20650v;

    /* renamed from: w, reason: collision with root package name */
    public int f20651w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j6.n nVar, ve.c cVar) {
        super(cVar);
        this.f20650v = nVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f20649u = obj;
        this.f20651w |= Integer.MIN_VALUE;
        return this.f20650v.l(0, null, this);
    }
}
