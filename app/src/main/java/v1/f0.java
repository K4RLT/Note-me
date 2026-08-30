package v1;

/* loaded from: classes.dex */
public final class f0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f27305u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g0 f27306v;

    /* renamed from: w, reason: collision with root package name */
    public int f27307w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, ve.a aVar) {
        super(aVar);
        this.f27306v = g0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f27305u = obj;
        this.f27307w |= Integer.MIN_VALUE;
        return this.f27306v.j(0L, null, this);
    }
}
