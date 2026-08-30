package u7;

/* loaded from: classes.dex */
public final class j1 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f26355u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o1 f26356v;

    /* renamed from: w, reason: collision with root package name */
    public int f26357w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(o1 o1Var, ve.c cVar) {
        super(cVar);
        this.f26356v = o1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f26355u = obj;
        this.f26357w |= Integer.MIN_VALUE;
        return this.f26356v.f(this);
    }
}
