package rf;

/* loaded from: classes.dex */
public final class f extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f24778u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f24779v;

    /* renamed from: w, reason: collision with root package name */
    public int f24780w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ve.c cVar) {
        super(cVar);
        this.f24779v = hVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f24778u = obj;
        this.f24780w |= Integer.MIN_VALUE;
        Object C = h.C(this.f24779v, this);
        if (C == ue.a.f27192u) {
            return C;
        }
        return new o(C);
    }
}
