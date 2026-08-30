package y3;

/* loaded from: classes.dex */
public final class u extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public z f30872u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f30873v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f30874w;

    /* renamed from: x, reason: collision with root package name */
    public int f30875x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, ve.c cVar) {
        super(cVar);
        this.f30874w = zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30873v = obj;
        this.f30875x |= Integer.MIN_VALUE;
        return this.f30874w.f(this);
    }
}
