package t;

/* loaded from: classes.dex */
public final class u1 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public z1 f25531u;

    /* renamed from: v, reason: collision with root package name */
    public kotlin.jvm.internal.x f25532v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25533w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z1 f25534x;

    /* renamed from: y, reason: collision with root package name */
    public int f25535y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(z1 z1Var, ve.c cVar) {
        super(cVar);
        this.f25534x = z1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25533w = obj;
        this.f25535y |= Integer.MIN_VALUE;
        return this.f25534x.b(0L, this);
    }
}
