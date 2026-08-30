package m7;

/* loaded from: classes.dex */
public final class i extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f20652u;

    /* renamed from: v, reason: collision with root package name */
    public int f20653v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f20654w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, te.c cVar) {
        super(cVar);
        this.f20654w = jVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f20652u = obj;
        this.f20653v |= Integer.MIN_VALUE;
        return this.f20654w.e(null, this);
    }
}
