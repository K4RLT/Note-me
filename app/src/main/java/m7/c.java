package m7;

/* loaded from: classes.dex */
public final class c extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public String f20629u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f20630v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j6.n f20631w;

    /* renamed from: x, reason: collision with root package name */
    public int f20632x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j6.n nVar, ve.c cVar) {
        super(cVar);
        this.f20631w = nVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f20630v = obj;
        this.f20632x |= Integer.MIN_VALUE;
        return this.f20631w.c(null, this);
    }
}
