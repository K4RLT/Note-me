package t;

/* loaded from: classes.dex */
public final class i0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public r1 f25415u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25416v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r1 f25417w;

    /* renamed from: x, reason: collision with root package name */
    public int f25418x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r1 r1Var, ve.c cVar) {
        super(cVar);
        this.f25417w = r1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25416v = obj;
        this.f25418x |= Integer.MIN_VALUE;
        return r1.b1(this.f25417w, this);
    }
}
