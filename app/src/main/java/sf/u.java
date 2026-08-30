package sf;

/* loaded from: classes.dex */
public final class u extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public f6.i f25239u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25240v;

    /* renamed from: w, reason: collision with root package name */
    public int f25241w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f6.i f25242x;

    /* renamed from: y, reason: collision with root package name */
    public Object f25243y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(f6.i iVar, te.c cVar) {
        super(cVar);
        this.f25242x = iVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25240v = obj;
        this.f25241w |= Integer.MIN_VALUE;
        return this.f25242x.e(null, this);
    }
}
