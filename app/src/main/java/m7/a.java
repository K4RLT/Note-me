package m7;

/* loaded from: classes.dex */
public final class a extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public o7.b f20617u;

    /* renamed from: v, reason: collision with root package name */
    public k7.f f20618v;

    /* renamed from: w, reason: collision with root package name */
    public long f20619w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f20620x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j6.n f20621y;

    /* renamed from: z, reason: collision with root package name */
    public int f20622z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j6.n nVar, ve.c cVar) {
        super(cVar);
        this.f20621y = nVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f20620x = obj;
        this.f20622z |= Integer.MIN_VALUE;
        return this.f20621y.a(null, null, this);
    }
}
