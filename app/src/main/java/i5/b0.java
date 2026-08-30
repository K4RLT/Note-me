package i5;

/* loaded from: classes.dex */
public final class b0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public String f18215u;

    /* renamed from: v, reason: collision with root package name */
    public df.l f18216v;

    /* renamed from: w, reason: collision with root package name */
    public h f18217w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f18218x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c0 f18219y;

    /* renamed from: z, reason: collision with root package name */
    public int f18220z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, ve.c cVar) {
        super(cVar);
        this.f18219y = c0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f18218x = obj;
        this.f18220z |= Integer.MIN_VALUE;
        return this.f18219y.c(null, null, this);
    }
}
