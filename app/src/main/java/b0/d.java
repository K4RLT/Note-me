package b0;

/* loaded from: classes.dex */
public final class d extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public pf.l f1169u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f1170v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f1171w;

    /* renamed from: x, reason: collision with root package name */
    public int f1172x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ve.c cVar) {
        super(cVar);
        this.f1171w = eVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f1170v = obj;
        this.f1172x |= Integer.MIN_VALUE;
        return this.f1171w.f(this);
    }
}
