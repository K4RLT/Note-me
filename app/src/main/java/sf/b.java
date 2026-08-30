package sf;

/* loaded from: classes.dex */
public final class b extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public rf.t f25141u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25142v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f25143w;

    /* renamed from: x, reason: collision with root package name */
    public int f25144x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ve.c cVar2) {
        super(cVar2);
        this.f25143w = cVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25142v = obj;
        this.f25144x |= Integer.MIN_VALUE;
        return this.f25143w.c(null, this);
    }
}
