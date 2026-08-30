package c0;

/* loaded from: classes.dex */
public final class n0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public o0 f3380u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3381v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o0 f3382w;

    /* renamed from: x, reason: collision with root package name */
    public int f3383x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, ve.c cVar) {
        super(cVar);
        this.f3382w = o0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f3381v = obj;
        this.f3383x |= Integer.MIN_VALUE;
        return this.f3382w.a(null, 0.0f, this);
    }
}
