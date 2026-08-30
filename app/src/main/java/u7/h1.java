package u7;

/* loaded from: classes.dex */
public final class h1 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public int f26262u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f26263v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o1 f26264w;

    /* renamed from: x, reason: collision with root package name */
    public int f26265x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(o1 o1Var, ve.c cVar) {
        super(cVar);
        this.f26264w = o1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f26263v = obj;
        this.f26265x |= Integer.MIN_VALUE;
        return this.f26264w.c(0, this);
    }
}
