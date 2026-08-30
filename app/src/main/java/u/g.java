package u;

/* loaded from: classes.dex */
public final class g extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f25775u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f25776v;

    /* renamed from: w, reason: collision with root package name */
    public int f25777w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ve.c cVar) {
        super(cVar);
        this.f25776v = hVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25775u = obj;
        this.f25777w |= Integer.MIN_VALUE;
        return h.b(this.f25776v, null, 0.0f, 0.0f, null, this);
    }
}
