package b8;

/* loaded from: classes.dex */
public final class w3 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2917u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z3 f2918v;

    /* renamed from: w, reason: collision with root package name */
    public int f2919w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(z3 z3Var, ve.c cVar) {
        super(cVar);
        this.f2918v = z3Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f2917u = obj;
        this.f2919w |= Integer.MIN_VALUE;
        Object f10 = this.f2918v.f(null, this);
        if (f10 == ue.a.f27192u) {
            return f10;
        }
        return new pe.l(f10);
    }
}
