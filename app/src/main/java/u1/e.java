package u1;

/* loaded from: classes.dex */
public final class e extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public long f25813u;

    /* renamed from: v, reason: collision with root package name */
    public long f25814v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25815w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f25816x;

    /* renamed from: y, reason: collision with root package name */
    public int f25817y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, ve.c cVar) {
        super(cVar);
        this.f25816x = gVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25815w = obj;
        this.f25817y |= Integer.MIN_VALUE;
        return this.f25816x.G0(0L, 0L, this);
    }
}
