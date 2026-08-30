package vd;

/* loaded from: classes.dex */
public final class p extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public Object f27627u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f27628v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o0 f27629w;

    /* renamed from: x, reason: collision with root package name */
    public int f27630x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o0 o0Var, ve.c cVar) {
        super(cVar);
        this.f27629w = o0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f27628v = obj;
        this.f27630x |= Integer.MIN_VALUE;
        return this.f27629w.a(null, this);
    }
}
