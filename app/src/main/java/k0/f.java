package k0;
import d1.r;
import r0.m;
import r0.y;
import v0.e;
import v0.g;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19271u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f19272v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f19273w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f19274x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f19275y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, r rVar, df.a aVar, boolean z3) {
        super(2);
        this.f19274x = rVar;
        this.f19275y = aVar;
        this.f19272v = z3;
        this.f19273w = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19271u;
        m mVar = (m) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                e(y.L(this.f19273w | 1), (r) this.f19274x, (df.a) this.f19275y, mVar, this.f19272v);
                return pe.z.f22715a;
            default:
                g(this.f19272v, (x2.j) this.f19274x, (j1) this.f19275y, mVar, y.L(this.f19273w | 1));
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z3, x2.j jVar, j1 j1Var, int i) {
        super(2);
        this.f19272v = z3;
        this.f19274x = jVar;
        this.f19275y = j1Var;
        this.f19273w = i;
    }
}
