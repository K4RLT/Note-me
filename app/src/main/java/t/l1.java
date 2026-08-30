package t;

/* loaded from: classes.dex */
public final class l1 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public long f25456u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25457v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c7.f0 f25458w;

    /* renamed from: x, reason: collision with root package name */
    public int f25459x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(c7.f0 f0Var, ve.c cVar) {
        super(cVar);
        this.f25458w = f0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25457v = obj;
        this.f25459x |= Integer.MIN_VALUE;
        return this.f25458w.G0(0L, 0L, this);
    }
}
