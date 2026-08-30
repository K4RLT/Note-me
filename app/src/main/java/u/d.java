package u;

/* loaded from: classes.dex */
public final class d extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public df.l f25765u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25766v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f25767w;

    /* renamed from: x, reason: collision with root package name */
    public int f25768x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, ve.c cVar) {
        super(cVar);
        this.f25767w = hVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25766v = obj;
        this.f25768x |= Integer.MIN_VALUE;
        return this.f25767w.c(null, 0.0f, null, this);
    }
}
