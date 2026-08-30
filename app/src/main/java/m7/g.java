package m7;

/* loaded from: classes.dex */
public final class g extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f20646u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j6.n f20647v;

    /* renamed from: w, reason: collision with root package name */
    public int f20648w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j6.n nVar, ve.c cVar) {
        super(cVar);
        this.f20647v = nVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f20646u = obj;
        this.f20648w |= Integer.MIN_VALUE;
        return this.f20647v.k(null, this);
    }
}
