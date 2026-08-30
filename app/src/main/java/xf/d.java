package xf;

/* loaded from: classes.dex */
public final class d extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public e f30775u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f30776v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f30777w;

    /* renamed from: x, reason: collision with root package name */
    public int f30778x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ve.c cVar) {
        super(cVar);
        this.f30777w = eVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30776v = obj;
        this.f30778x |= Integer.MIN_VALUE;
        return this.f30777w.d(this);
    }
}
