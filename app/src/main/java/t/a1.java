package t;

/* loaded from: classes.dex */
public final class a1 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public c1 f25318u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25319v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c1 f25320w;

    /* renamed from: x, reason: collision with root package name */
    public int f25321x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, ve.c cVar) {
        super(cVar);
        this.f25320w = c1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25319v = obj;
        this.f25321x |= Integer.MIN_VALUE;
        return this.f25320w.d(this);
    }
}
