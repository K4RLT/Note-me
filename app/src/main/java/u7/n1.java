package u7;

/* loaded from: classes.dex */
public final class n1 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public int f26590u;

    /* renamed from: v, reason: collision with root package name */
    public int f26591v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f26592w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o1 f26593x;

    /* renamed from: y, reason: collision with root package name */
    public int f26594y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o1 o1Var, ve.c cVar) {
        super(cVar);
        this.f26593x = o1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f26592w = obj;
        this.f26594y |= Integer.MIN_VALUE;
        return this.f26593x.p(0, this);
    }
}
