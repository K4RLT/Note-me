package y3;

/* loaded from: classes.dex */
public final class r extends ve.c {
    public final /* synthetic */ s A;
    public int B;

    /* renamed from: u, reason: collision with root package name */
    public Object f30858u;

    /* renamed from: v, reason: collision with root package name */
    public Object f30859v;

    /* renamed from: w, reason: collision with root package name */
    public Object f30860w;

    /* renamed from: x, reason: collision with root package name */
    public kotlin.jvm.internal.y f30861x;

    /* renamed from: y, reason: collision with root package name */
    public z f30862y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f30863z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, ve.c cVar) {
        super(cVar);
        this.A = sVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30863z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, this);
    }
}
