package w7;
import r0.a1;

/* loaded from: classes.dex */
public final class j1 extends ve.i implements df.p {
    public final /* synthetic */ e3 A;
    public final /* synthetic */ e3 B;
    public final /* synthetic */ a1 C;
    public final /* synthetic */ a1 D;
    public final /* synthetic */ a1 E;
    public final /* synthetic */ a1 F;
    public final /* synthetic */ a1 G;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b1.v f28487u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e3 f28488v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e3 f28489w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e3 f28490x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e3 f28491y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e3 f28492z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(b1.v vVar, e3 e3Var, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, e3 e3Var6, e3 e3Var7, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, te.c cVar) {
        super(2, cVar);
        this.f28487u = vVar;
        this.f28488v = e3Var;
        this.f28489w = e3Var2;
        this.f28490x = e3Var3;
        this.f28491y = e3Var4;
        this.f28492z = e3Var5;
        this.A = e3Var6;
        this.B = e3Var7;
        this.C = a1Var;
        this.D = a1Var2;
        this.E = a1Var3;
        this.F = a1Var4;
        this.G = a1Var5;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new j1(this.f28487u, this.f28488v, this.f28489w, this.f28490x, this.f28491y, this.f28492z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        j1 j1Var = (j1) create((pf.z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        j1Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        e3 e3Var = this.f28488v;
        boolean j10 = e3Var.j();
        e3 e3Var2 = this.B;
        e3 e3Var3 = this.A;
        e3 e3Var4 = this.f28492z;
        e3 e3Var5 = this.f28491y;
        e3 e3Var6 = this.f28490x;
        e3 e3Var7 = this.f28489w;
        a1 a1Var = this.C;
        if (j10 || e3Var7.c() || e3Var6.a() || e3Var5.k() || e3Var4.i() || e3Var3.b() || e3Var2.r() || ((Boolean) a1Var.getValue()).booleanValue()) {
            a1 a1Var2 = this.D;
            if (((String) a1Var2.getValue()) != null) {
                a1Var2.setValue(null);
            }
            a1 a1Var3 = this.E;
            if (((String) a1Var3.getValue()) != null) {
                a1Var3.setValue(null);
            }
            b1.v vVar = this.f28487u;
            if (!vVar.isEmpty()) {
                vVar.clear();
            }
            this.F.setValue(null);
        }
        if ((e3Var.j() || e3Var7.c() || e3Var6.a() || e3Var5.k() || e3Var4.i() || e3Var3.b() || e3Var2.r()) && ((Boolean) a1Var.getValue()).booleanValue()) {
            a1Var.setValue(Boolean.FALSE);
            this.G.setValue(null);
        }
        return pe.z.f22715a;
    }
}
