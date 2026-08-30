package w7;
import j4.b;
import r0.a1;
import r0.i1;

/* loaded from: classes.dex */
public final /* synthetic */ class h4 implements df.l {
    public final /* synthetic */ e3 A;
    public final /* synthetic */ e3 B;
    public final /* synthetic */ e3 C;
    public final /* synthetic */ e3 D;
    public final /* synthetic */ e3 E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ e3 G;
    public final /* synthetic */ e3 H;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28348u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.a f28349v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e3 f28350w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e3 f28351x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e3 f28352y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e3 f28353z;

    public /* synthetic */ h4(df.a aVar, e3 e3Var, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, e3 e3Var6, e3 e3Var7, e3 e3Var8, e3 e3Var9, a1 a1Var, e3 e3Var10, e3 e3Var11) {
        this.f28348u = 1;
        this.f28349v = aVar;
        this.f28350w = e3Var;
        this.f28351x = e3Var2;
        this.f28352y = e3Var3;
        this.f28353z = e3Var4;
        this.A = e3Var5;
        this.B = e3Var6;
        this.C = e3Var7;
        this.D = e3Var8;
        this.E = e3Var9;
        this.F = a1Var;
        this.G = e3Var10;
        this.H = e3Var11;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean z3;
        boolean z9;
        boolean z10;
        int i = this.f28348u;
        pe.z zVar = pe.z.f22715a;
        Object obj2 = this.F;
        e3 e3Var = this.H;
        e3 e3Var2 = this.G;
        e3 e3Var3 = this.E;
        e3 e3Var4 = this.D;
        e3 e3Var5 = this.C;
        e3 e3Var6 = this.B;
        e3 e3Var7 = this.A;
        e3 e3Var8 = this.f28353z;
        e3 e3Var9 = this.f28352y;
        e3 e3Var10 = this.f28351x;
        e3 e3Var11 = this.f28350w;
        df.a aVar = this.f28349v;
        switch (i) {
            case 0:
                a1 a1Var = (a1) obj2;
                float f10 = j4.f28501a;
                e3Var11.s(true);
                e3Var10.C(false);
                e3Var9.v(false);
                e3Var8.w(false);
                e3Var7.z(false);
                e3Var6.y(false);
                e3Var5.x(false);
                e3Var4.t(false);
                e3Var3.u(false);
                e3Var2.A(false);
                e3Var.B(false);
                if (!((Boolean) aVar.invoke()).booleanValue() && !((Boolean) a1Var.getValue()).booleanValue()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                a1Var.setValue(Boolean.valueOf(z3));
                return zVar;
            case 1:
                float f11 = j4.f28501a;
                boolean a10 = e3Var11.a();
                e3Var11.s(true);
                e3Var10.C(false);
                e3Var9.v(false);
                e3Var8.w(false);
                e3Var7.z(false);
                e3Var6.y(false);
                e3Var5.x(false);
                e3Var4.t(false);
                e3Var3.u(false);
                ((a1) obj2).setValue(Boolean.FALSE);
                if (a10 && !((Boolean) aVar.invoke()).booleanValue() && !b(e3Var2)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                e3Var2.B(z9);
                e3Var.A(false);
                return zVar;
            default:
                i1 i1Var = e3Var2.G;
                e3 e3Var12 = (e3) obj2;
                float f12 = j4.f28501a;
                boolean e = e3Var11.e();
                e3Var11.v(true);
                e3Var10.s(false);
                e3Var9.C(false);
                e3Var8.w(false);
                e3Var7.z(false);
                e3Var6.y(false);
                e3Var5.x(false);
                e3Var4.t(false);
                e3Var3.u(false);
                if (e && !((Boolean) aVar.invoke()).booleanValue() && !((Boolean) i1Var.getValue()).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i1Var.setValue(Boolean.valueOf(z10));
                e3Var.B(false);
                e3Var12.A(false);
                return zVar;
        }
    }

    public /* synthetic */ h4(df.a aVar, e3 e3Var, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, e3 e3Var6, e3 e3Var7, e3 e3Var8, e3 e3Var9, e3 e3Var10, e3 e3Var11, Object obj, int i) {
        this.f28348u = i;
        this.f28349v = aVar;
        this.f28350w = e3Var;
        this.f28351x = e3Var2;
        this.f28352y = e3Var3;
        this.f28353z = e3Var4;
        this.A = e3Var5;
        this.B = e3Var6;
        this.C = e3Var7;
        this.D = e3Var8;
        this.E = e3Var9;
        this.G = e3Var10;
        this.H = e3Var11;
        this.F = obj;
    }
}
