package sf;

/* loaded from: classes.dex */
public final class y extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f25257u;

    /* renamed from: v, reason: collision with root package name */
    public int f25258v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m7.j f25259w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m7.j jVar, te.c cVar) {
        super(cVar);
        this.f25259w = jVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25257u = obj;
        this.f25258v |= Integer.MIN_VALUE;
        return this.f25259w.e(null, this);
    }
}
