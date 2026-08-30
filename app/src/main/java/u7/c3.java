package u7;
import m3.f;

/* loaded from: classes.dex */
public final class c3 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public int f25991u;

    /* renamed from: v, reason: collision with root package name */
    public String f25992v;

    /* renamed from: w, reason: collision with root package name */
    public pf.q f25993w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f25994x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m3 f25995y;

    /* renamed from: z, reason: collision with root package name */
    public int f25996z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(m3 m3Var, ve.c cVar) {
        super(cVar);
        this.f25995y = m3Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25994x = obj;
        this.f25996z |= Integer.MIN_VALUE;
        return f(this.f25995y, 0, this);
    }
}
