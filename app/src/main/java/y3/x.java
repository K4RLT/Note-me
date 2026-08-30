package y3;

/* loaded from: classes.dex */
public final class x extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public z f30886u;

    /* renamed from: v, reason: collision with root package name */
    public Object f30887v;

    /* renamed from: w, reason: collision with root package name */
    public Object f30888w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f30889x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f30890y;

    /* renamed from: z, reason: collision with root package name */
    public int f30891z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, ve.c cVar) {
        super(cVar);
        this.f30890y = zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30889x = obj;
        this.f30891z |= Integer.MIN_VALUE;
        return this.f30890y.i(null, null, this);
    }
}
