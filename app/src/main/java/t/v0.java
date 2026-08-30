package t;

/* loaded from: classes.dex */
public final class v0 extends ve.c {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public f5.a f25542u;

    /* renamed from: v, reason: collision with root package name */
    public z1 f25543v;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.v f25544w;

    /* renamed from: x, reason: collision with root package name */
    public float f25545x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f25546y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f5.a f25547z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(f5.a aVar, ve.c cVar) {
        super(cVar);
        this.f25547z = aVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25546y = obj;
        this.A |= Integer.MIN_VALUE;
        return f5.a.b(this.f25547z, null, null, 0.0f, 0.0f, this);
    }
}
