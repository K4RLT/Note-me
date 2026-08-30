package u;

/* loaded from: classes.dex */
public final class f extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f25772u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f25773v;

    /* renamed from: w, reason: collision with root package name */
    public int f25774w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ve.c cVar) {
        super(cVar);
        this.f25773v = hVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25772u = obj;
        this.f25774w |= Integer.MIN_VALUE;
        return this.f25773v.d(null, 0.0f, null, this);
    }
}
