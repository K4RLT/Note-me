package y3;

/* loaded from: classes.dex */
public final class o extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f30843u;

    /* renamed from: v, reason: collision with root package name */
    public int f30844v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m7.j f30845w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m7.j jVar, te.c cVar) {
        super(cVar);
        this.f30845w = jVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30843u = obj;
        this.f30844v |= Integer.MIN_VALUE;
        return this.f30845w.e(null, this);
    }
}
