package sf;

/* loaded from: classes.dex */
public final class d extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f25157u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f25158v;

    /* renamed from: w, reason: collision with root package name */
    public int f25159w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, te.c cVar) {
        super(cVar);
        this.f25158v = eVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25157u = obj;
        this.f25159w |= Integer.MIN_VALUE;
        return this.f25158v.e(null, this);
    }
}
