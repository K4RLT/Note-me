package i5;

/* loaded from: classes.dex */
public final class z extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public boolean f18313u;

    /* renamed from: v, reason: collision with root package name */
    public h f18314v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f18315w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c0 f18316x;

    /* renamed from: y, reason: collision with root package name */
    public int f18317y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, ve.c cVar) {
        super(cVar);
        this.f18316x = c0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f18315w = obj;
        this.f18317y |= Integer.MIN_VALUE;
        return this.f18316x.f(false, this);
    }
}
