package u7;

/* loaded from: classes.dex */
public final class i1 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public int f26301u;

    /* renamed from: v, reason: collision with root package name */
    public int f26302v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f26303w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o1 f26304x;

    /* renamed from: y, reason: collision with root package name */
    public int f26305y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(o1 o1Var, ve.c cVar) {
        super(cVar);
        this.f26304x = o1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f26303w = obj;
        this.f26305y |= Integer.MIN_VALUE;
        return this.f26304x.d(0, 0, this);
    }
}
