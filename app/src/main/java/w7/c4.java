package w7;
import j4.b;
import r0.a1;

/* loaded from: classes.dex */
public final /* synthetic */ class c4 implements df.l {
    public final /* synthetic */ e3 A;
    public final /* synthetic */ e3 B;
    public final /* synthetic */ e3 C;
    public final /* synthetic */ e3 D;
    public final /* synthetic */ e3 E;
    public final /* synthetic */ e3 F;
    public final /* synthetic */ e3 G;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28024u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28025v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e3 f28026w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e3 f28027x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e3 f28028y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e3 f28029z;

    public /* synthetic */ c4(Object obj, e3 e3Var, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, e3 e3Var6, e3 e3Var7, e3 e3Var8, e3 e3Var9, e3 e3Var10, e3 e3Var11, int i) {
        this.f28024u = i;
        this.f28025v = obj;
        this.f28026w = e3Var;
        this.f28027x = e3Var2;
        this.f28028y = e3Var3;
        this.f28029z = e3Var4;
        this.A = e3Var5;
        this.B = e3Var6;
        this.C = e3Var7;
        this.D = e3Var8;
        this.E = e3Var9;
        this.F = e3Var10;
        this.G = e3Var11;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean z3;
        boolean z9;
        boolean z10;
        int i = this.f28024u;
        pe.z zVar = pe.z.f22715a;
        boolean z11 = false;
        e3 e3Var = this.G;
        e3 e3Var2 = this.F;
        e3 e3Var3 = this.E;
        e3 e3Var4 = this.D;
        e3 e3Var5 = this.C;
        e3 e3Var6 = this.B;
        e3 e3Var7 = this.A;
        e3 e3Var8 = this.f28029z;
        e3 e3Var9 = this.f28028y;
        e3 e3Var10 = this.f28027x;
        e3 e3Var11 = this.f28026w;
        Object obj2 = this.f28025v;
        switch (i) {
            case 0:
                df.a aVar = (df.a) obj2;
                float f10 = j4.f28501a;
                boolean n10 = e3Var11.n();
                e3Var11.C(true);
                e3Var10.s(false);
                e3Var9.v(false);
                e3Var8.w(false);
                e3Var7.z(false);
                e3Var6.y(false);
                e3Var5.x(false);
                e3Var4.t(false);
                e3Var3.u(false);
                if (n10 && !((Boolean) aVar.invoke()).booleanValue() && !b(e3Var2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                e3Var2.B(z3);
                e3Var.A(false);
                return zVar;
            case 1:
                df.a aVar2 = (df.a) obj2;
                float f11 = j4.f28501a;
                if (!e3Var11.j() && !e3Var10.c() && !e3Var9.a() && !e3Var8.h() && !e3Var7.k() && !e3Var6.i() && !e3Var5.b()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                e3Var9.s(false);
                e3Var4.C(false);
                e3Var3.v(false);
                e3Var8.w(false);
                e3Var7.z(false);
                e3Var11.y(false);
                e3Var6.x(false);
                e3Var5.t(false);
                e3Var10.u(false);
                e3Var2.A(false);
                if (z9 && !((Boolean) aVar2.invoke()).booleanValue() && !b(e3Var)) {
                    z11 = true;
                }
                e3Var.B(z11);
                return zVar;
            case 2:
                df.a aVar3 = (df.a) obj2;
                float f12 = j4.f28501a;
                if (e3Var11.c() && !e3Var10.a() && !e3Var9.h() && !e3Var8.k() && !e3Var7.i() && !e3Var6.b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e3Var10.s(false);
                e3Var5.C(false);
                e3Var4.v(false);
                e3Var9.w(false);
                e3Var8.z(false);
                e3Var3.y(false);
                e3Var7.x(false);
                e3Var6.t(false);
                e3Var11.u(true);
                e3Var2.A(false);
                if (z10 && !((Boolean) aVar3.invoke()).booleanValue() && !b(e3Var)) {
                    z11 = true;
                }
                e3Var.B(z11);
                return zVar;
            default:
                a1 a1Var = (a1) obj2;
                if (a1Var != null) {
                    a1Var.setValue(null);
                }
                float f13 = j4.f28501a;
                e3Var11.s(false);
                e3Var10.C(false);
                e3Var9.v(false);
                e3Var8.w(false);
                e3Var7.z(false);
                e3Var6.y(true);
                e3Var5.x(false);
                e3Var4.t(false);
                e3Var3.u(false);
                e3Var2.B(false);
                e3Var.A(true ^ e3Var.m());
                return zVar;
        }
    }
}
