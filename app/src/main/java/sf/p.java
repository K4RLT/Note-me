package sf;

/* loaded from: classes.dex */
public final class p extends ve.c {
    public long A;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f25221u;

    /* renamed from: v, reason: collision with root package name */
    public int f25222v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f25223w;

    /* renamed from: x, reason: collision with root package name */
    public m f25224x;

    /* renamed from: y, reason: collision with root package name */
    public h f25225y;

    /* renamed from: z, reason: collision with root package name */
    public Throwable f25226z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, te.c cVar) {
        super(cVar);
        this.f25223w = mVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25221u = obj;
        this.f25222v |= Integer.MIN_VALUE;
        return this.f25223w.b(null, this);
    }
}
