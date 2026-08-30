package t;

/* loaded from: classes.dex */
public final class l2 extends ve.c {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public m2 f25460u;

    /* renamed from: v, reason: collision with root package name */
    public pe.d f25461v;

    /* renamed from: w, reason: collision with root package name */
    public df.a f25462w;

    /* renamed from: x, reason: collision with root package name */
    public float f25463x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f25464y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m2 f25465z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, ve.c cVar) {
        super(cVar);
        this.f25465z = m2Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25464y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f25465z.a(null, null, this);
    }
}
