package vd;

/* loaded from: classes.dex */
public final class y extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f27646u;

    /* renamed from: v, reason: collision with root package name */
    public int f27647v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m7.j f27648w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m7.j jVar, te.c cVar) {
        super(cVar);
        this.f27648w = jVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f27646u = obj;
        this.f27647v |= Integer.MIN_VALUE;
        return this.f27648w.e(null, this);
    }
}
