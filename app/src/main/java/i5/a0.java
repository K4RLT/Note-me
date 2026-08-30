package i5;

/* loaded from: classes.dex */
public final class a0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public Object f18209u;

    /* renamed from: v, reason: collision with root package name */
    public Throwable f18210v;

    /* renamed from: w, reason: collision with root package name */
    public int f18211w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f18212x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c0 f18213y;

    /* renamed from: z, reason: collision with root package name */
    public int f18214z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, ve.c cVar) {
        super(cVar);
        this.f18213y = c0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f18212x = obj;
        this.f18214z |= Integer.MIN_VALUE;
        return this.f18213y.g(null, null, this);
    }
}
