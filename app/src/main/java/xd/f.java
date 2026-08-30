package xd;

/* loaded from: classes.dex */
public final class f extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public g f30747u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f30748v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f30749w;

    /* renamed from: x, reason: collision with root package name */
    public int f30750x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ve.c cVar) {
        super(cVar);
        this.f30749w = gVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30748v = obj;
        this.f30750x |= Integer.MIN_VALUE;
        return this.f30749w.b(this);
    }
}
