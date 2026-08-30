package g0;
import a1.l;
import a1.p;
import b0.x;
import d0.b;
import i1.r;
import k0.j1;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.m implements df.l {
    public final /* synthetic */ j1 A;
    public final /* synthetic */ pf.z B;
    public final /* synthetic */ b C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e1 f17140u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17141v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r2.y f17142w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r2.x f17143x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r2.j f17144y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r2.q f17145z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(e1 e1Var, boolean z3, r2.y yVar, r2.x xVar, r2.j jVar, r2.q qVar, j1 j1Var, pf.z zVar, b bVar) {
        super(1);
        this.f17140u = e1Var;
        this.f17141v = z3;
        this.f17142w = yVar;
        this.f17143x = xVar;
        this.f17144y = jVar;
        this.f17145z = qVar;
        this.A = j1Var;
        this.B = zVar;
        this.C = bVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        g2 d2;
        r rVar = (r) obj;
        e1 e1Var = this.f17140u;
        if (e1Var.b() != rVar.b()) {
            e1Var.f17066f.setValue(Boolean.valueOf(rVar.b()));
            if (e1Var.b() && this.f17141v) {
                p(this.f17142w, e1Var, this.f17143x, this.f17144y, this.f17145z);
            } else {
                l(e1Var);
            }
            if (rVar.b() && (d2 = e1Var.d()) != null) {
                pf.x(this.B, null, new b8.a1(this.C, this.f17143x, e1Var, d2, this.f17145z, null, 6), 3);
            }
            if (!rVar.b()) {
                this.A.e(null);
            }
        }
        return pe.z.f22715a;
    }
}
