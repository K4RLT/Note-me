package g0;
import a.a;
import d1.o;
import d1.r;
import k0.j1;
import k0.n1;
import r0.l;
import r0.m;
import r0.v0;

/* loaded from: classes.dex */
public final class v1 extends kotlin.jvm.internal.m implements df.q {
    public final /* synthetic */ k2 A;
    public final /* synthetic */ df.l B;
    public final /* synthetic */ int C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e1 f17314u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j1 f17315v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r2.x f17316w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f17317x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f17318y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r2.q f17319z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(e1 e1Var, j1 j1Var, r2.x xVar, boolean z3, boolean z9, r2.q qVar, k2 k2Var, df.l lVar, int i) {
        super(3);
        this.f17314u = e1Var;
        this.f17315v = j1Var;
        this.f17316w = xVar;
        this.f17317x = z3;
        this.f17318y = z9;
        this.f17319z = qVar;
        this.A = k2Var;
        this.B = lVar;
        this.C = i;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        r rVar = (r) ((m) obj2);
        rVar.a0(851809892);
        Object O = rVar.O();
        v0 v0Var = l.f24285a;
        if (O == v0Var) {
            O = new Object();
            rVar.k0(O);
        }
        n1 n1Var = (n1) O;
        Object O2 = rVar.O();
        if (O2 == v0Var) {
            O2 = new Object();
            rVar.k0(O2);
        }
        df.l lVar = this.B;
        int i = this.C;
        t1 t1Var = new t1(this.f17314u, this.f17315v, this.f17316w, this.f17317x, this.f17318y, n1Var, this.f17319z, this.A, (q0) O2, lVar, i);
        boolean h3 = rVar.h(t1Var);
        Object O3 = rVar.O();
        if (h3 || O3 == v0Var) {
            u1 u1Var = new u1(1, t1Var, t1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0);
            rVar.k0(u1Var);
            O3 = u1Var;
        }
        r a10 = androidx.compose.ui.input.key.a(o.f15687a, (df.l) ((kf.d) O3));
        rVar.p(false);
        return a10;
    }
}
