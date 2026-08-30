package sf;

/* loaded from: classes.dex */
public final class l extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f25197u;

    /* renamed from: v, reason: collision with root package name */
    public int f25198v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f25199w;

    /* renamed from: x, reason: collision with root package name */
    public m f25200x;

    /* renamed from: y, reason: collision with root package name */
    public h f25201y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, te.c cVar) {
        super(cVar);
        this.f25199w = mVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25197u = obj;
        this.f25198v |= Integer.MIN_VALUE;
        return this.f25199w.b(null, this);
    }
}
