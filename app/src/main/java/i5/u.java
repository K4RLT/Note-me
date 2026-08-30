package i5;

/* loaded from: classes.dex */
public final class u extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public long f18291u;

    /* renamed from: v, reason: collision with root package name */
    public df.a f18292v;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.y f18293w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f18294x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v f18295y;

    /* renamed from: z, reason: collision with root package name */
    public int f18296z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, ve.c cVar) {
        super(cVar);
        this.f18295y = vVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f18294x = obj;
        this.f18296z |= Integer.MIN_VALUE;
        return this.f18295y.b(0L, null, this);
    }
}
