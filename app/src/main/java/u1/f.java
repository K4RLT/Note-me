package u1;

/* loaded from: classes.dex */
public final class f extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public long f25818u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25819v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f25820w;

    /* renamed from: x, reason: collision with root package name */
    public int f25821x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ve.c cVar) {
        super(cVar);
        this.f25820w = gVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25819v = obj;
        this.f25821x |= Integer.MIN_VALUE;
        return this.f25820w.i(0L, this);
    }
}
