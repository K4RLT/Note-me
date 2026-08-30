package u7;
import m3.g;

/* loaded from: classes.dex */
public final class e3 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public pf.q f26127u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f26128v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f26129w;

    /* renamed from: x, reason: collision with root package name */
    public int f26130x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(m3 m3Var, ve.c cVar) {
        super(cVar);
        this.f26129w = m3Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f26128v = obj;
        this.f26130x |= Integer.MIN_VALUE;
        return g(this.f26129w, 0, this);
    }
}
