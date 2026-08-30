package g5;

/* loaded from: classes.dex */
public final class k extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f17470u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ pd.c f17471v;

    /* renamed from: w, reason: collision with root package name */
    public int f17472w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pd.c cVar, ve.c cVar2) {
        super(cVar2);
        this.f17471v = cVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f17470u = obj;
        this.f17472w |= Integer.MIN_VALUE;
        this.f17471v.j(null, this);
        return ue.a.f27192u;
    }
}
