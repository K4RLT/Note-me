package i5;

/* loaded from: classes.dex */
public final class n extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public String f18266u;

    /* renamed from: v, reason: collision with root package name */
    public df.l f18267v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f18268w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f18269x;

    /* renamed from: y, reason: collision with root package name */
    public int f18270y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, ve.c cVar) {
        super(cVar);
        this.f18269x = qVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f18268w = obj;
        this.f18270y |= Integer.MIN_VALUE;
        return this.f18269x.c(null, null, this);
    }
}
