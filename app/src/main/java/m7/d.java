package m7;

/* loaded from: classes.dex */
public final class d extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public String f20633u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f20634v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j6.n f20635w;

    /* renamed from: x, reason: collision with root package name */
    public int f20636x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j6.n nVar, ve.c cVar) {
        super(cVar);
        this.f20635w = nVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f20634v = obj;
        this.f20636x |= Integer.MIN_VALUE;
        return this.f20635w.d(null, this);
    }
}
