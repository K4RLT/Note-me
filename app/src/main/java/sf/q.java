package sf;

/* loaded from: classes.dex */
public final class q extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public i5.j f25227u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25228v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25229w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i5.j f25230x;

    /* renamed from: y, reason: collision with root package name */
    public int f25231y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(i5.j jVar, te.c cVar) {
        super(cVar);
        this.f25230x = jVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25229w = obj;
        this.f25231y |= Integer.MIN_VALUE;
        return this.f25230x.e(null, this);
    }
}
