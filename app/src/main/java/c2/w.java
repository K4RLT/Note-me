package c2;

/* loaded from: classes.dex */
public final class w extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3673u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x f3674v;

    /* renamed from: w, reason: collision with root package name */
    public int f3675w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, ve.c cVar) {
        super(cVar);
        this.f3674v = xVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f3673u = obj;
        this.f3675w |= Integer.MIN_VALUE;
        this.f3674v.J(null, this);
        return ue.a.f27192u;
    }
}
