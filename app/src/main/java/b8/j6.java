package b8;

/* loaded from: classes.dex */
public final class j6 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2257u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p6 f2258v;

    /* renamed from: w, reason: collision with root package name */
    public int f2259w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(p6 p6Var, ve.c cVar) {
        super(cVar);
        this.f2258v = p6Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f2257u = obj;
        this.f2259w |= Integer.MIN_VALUE;
        Object a10 = this.f2258v.a(this);
        if (a10 == ue.a.f27192u) {
            return a10;
        }
        return new pe.l(a10);
    }
}
