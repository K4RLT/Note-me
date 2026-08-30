package t;

/* loaded from: classes.dex */
public final class k0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public r1 f25435u;

    /* renamed from: v, reason: collision with root package name */
    public p f25436v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25437w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r1 f25438x;

    /* renamed from: y, reason: collision with root package name */
    public int f25439y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(r1 r1Var, ve.c cVar) {
        super(cVar);
        this.f25438x = r1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25437w = obj;
        this.f25439y |= Integer.MIN_VALUE;
        return r1.d1(this.f25438x, null, this);
    }
}
