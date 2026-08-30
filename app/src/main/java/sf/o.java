package sf;

/* loaded from: classes.dex */
public final class o extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public e f25216u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25217v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f25218w;

    /* renamed from: x, reason: collision with root package name */
    public int f25219x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e eVar, te.c cVar) {
        super(cVar);
        this.f25218w = eVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25217v = obj;
        this.f25219x |= Integer.MIN_VALUE;
        return this.f25218w.e(null, this);
    }
}
