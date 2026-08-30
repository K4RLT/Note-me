package t;

/* loaded from: classes.dex */
public final class b1 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public c1 f25333u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25334v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c1 f25335w;

    /* renamed from: x, reason: collision with root package name */
    public int f25336x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, ve.c cVar) {
        super(cVar);
        this.f25335w = c1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25334v = obj;
        this.f25336x |= Integer.MIN_VALUE;
        return this.f25335w.f(this);
    }
}
