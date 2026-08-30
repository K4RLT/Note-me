package b8;

/* loaded from: classes.dex */
public final class m6 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2419u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p6 f2420v;

    /* renamed from: w, reason: collision with root package name */
    public int f2421w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(p6 p6Var, ve.c cVar) {
        super(cVar);
        this.f2420v = p6Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f2419u = obj;
        this.f2421w |= Integer.MIN_VALUE;
        Object f10 = this.f2420v.f(null, null, this);
        if (f10 == ue.a.f27192u) {
            return f10;
        }
        return new pe.l(f10);
    }
}
