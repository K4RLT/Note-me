package e7;

/* loaded from: classes.dex */
public final class k extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public long f15957u;

    /* renamed from: v, reason: collision with root package name */
    public long f15958v;

    /* renamed from: w, reason: collision with root package name */
    public long f15959w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f15960x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f15961y;

    /* renamed from: z, reason: collision with root package name */
    public int f15962z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, ve.c cVar) {
        super(cVar);
        this.f15961y = oVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f15960x = obj;
        this.f15962z |= Integer.MIN_VALUE;
        return this.f15961y.a(null, 0L, this);
    }
}
