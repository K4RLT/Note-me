package w7;
import a.a;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d1.c;
import d1.o;
import d1.r;
import k1.s;
import r0.a1;
import r0.l;
import r0.m;
import r0.n2;
import r0.v0;
import r0.y;
import v1.d0;
import z.b;
import z1.p0;

import com.daren.scraply.R;

/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements df.q {
    public final /* synthetic */ e3 A;
    public final /* synthetic */ e3 B;
    public final /* synthetic */ e3 C;
    public final /* synthetic */ e3 D;
    public final /* synthetic */ e3 E;
    public final /* synthetic */ e3 F;
    public final /* synthetic */ e3 G;
    public final /* synthetic */ e3 H;
    public final /* synthetic */ e3 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ s K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28283u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n2 f28284v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n2 f28285w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n2 f28286x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e3 f28287y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e3 f28288z;

    public /* synthetic */ g3(n2 n2Var, n2 n2Var2, n2 n2Var3, df.a aVar, e3 e3Var, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, e3 e3Var6, e3 e3Var7, e3 e3Var8, e3 e3Var9, e3 e3Var10, e3 e3Var11, e3 e3Var12, boolean z3, s sVar) {
        this.f28284v = n2Var;
        this.f28285w = n2Var2;
        this.f28286x = n2Var3;
        this.L = aVar;
        this.f28287y = e3Var;
        this.f28288z = e3Var2;
        this.A = e3Var3;
        this.B = e3Var4;
        this.C = e3Var5;
        this.D = e3Var6;
        this.E = e3Var7;
        this.F = e3Var8;
        this.G = e3Var9;
        this.H = e3Var10;
        this.I = e3Var11;
        this.M = e3Var12;
        this.J = z3;
        this.K = sVar;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z3;
        s sVar;
        boolean z9;
        s sVar2;
        int i = this.f28283u;
        pe.z zVar = pe.z.f22715a;
        v0 v0Var = l.f24285a;
        o oVar = o.f15687a;
        s sVar3 = this.K;
        boolean z10 = this.J;
        Object obj4 = this.M;
        Object obj5 = this.L;
        n2 n2Var = this.f28286x;
        n2 n2Var2 = this.f28285w;
        n2 n2Var3 = this.f28284v;
        switch (i) {
            case 0:
                df.a aVar = (df.a) obj5;
                e3 e3Var = (e3) obj4;
                m mVar = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((b) obj).getClass();
                if ((intValue & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    r b10 = d0.b(androidx.compose.foundation.layout.a(androidx.compose.foundation.layout.d.r(androidx.compose.foundation.layout.f(oVar, 64)), 40, Float.NaN), zVar, new i4(aVar, this.f28287y, this.f28288z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, e3Var, 1));
                    boolean f10 = rVar.f(n2Var3) | rVar.f(n2Var2) | rVar.f(n2Var);
                    Object O = rVar.O();
                    if (f10 || O == v0Var) {
                        O = new i3(n2Var3, n2Var2, n2Var, 8);
                        rVar.k0(O);
                    }
                    r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.ui.graphics.a(b10, (df.l) O), 4, 0.0f, 2);
                    p0 d2 = m.d(c.B, false);
                    int hashCode = Long.hashCode(rVar.T);
                    g l10 = rVar.l();
                    r c10 = a.c(m4, rVar);
                    h.f1471d.getClass();
                    b0 b0Var = g.f1462b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(g.e, d2, rVar);
                    y.I(g.f1464d, l10, rVar);
                    f fVar = g.f1465f;
                    if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                        a.t(hashCode, rVar, hashCode, fVar);
                    }
                    y.I(g.f1463c, c10, rVar);
                    String b11 = wa.n7.b(R.string.tool_magic, rVar);
                    float f11 = 52;
                    if (z10) {
                        sVar = null;
                    } else {
                        sVar = sVar3;
                    }
                    a(R.drawable.ic_varita_magica, b11, f11, sVar, null, 0.0f, 0.0f, 0.0f, r.f19520k, rVar, 100663680, 240);
                    rVar.p(true);
                } else {
                    rVar.U();
                }
                return zVar;
            default:
                final a1 a1Var = (a1) obj5;
                final a1 a1Var2 = (a1) obj4;
                m mVar2 = (m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((b) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.R(intValue2 & 1, z9)) {
                    r a10 = androidx.compose.foundation.layout.a(androidx.compose.foundation.layout.d.r(androidx.compose.foundation.layout.f(oVar, 64)), 44, Float.NaN);
                    Object O2 = rVar2.O();
                    if (O2 == v0Var) {
                        O2 = a.r(rVar2);
                    }
                    final e3 e3Var2 = this.f28287y;
                    final e3 e3Var3 = this.f28288z;
                    final e3 e3Var4 = this.A;
                    final e3 e3Var5 = this.B;
                    final e3 e3Var6 = this.C;
                    final e3 e3Var7 = this.D;
                    final e3 e3Var8 = this.E;
                    final e3 e3Var9 = this.F;
                    final e3 e3Var10 = this.G;
                    final e3 e3Var11 = this.H;
                    final e3 e3Var12 = this.I;
                    r e = androidx.compose.foundation.a.e(a10, (v.i) O2, null, false, null, new df.a() { // from class: w7.l3
                        @Override // df.a
                        public final Object invoke() {
                            a1 a1Var3 = a1.this;
                            if (a1Var3 != null) {
                                a1Var3.setValue(Boolean.FALSE);
                            }
                            a1 a1Var4 = a1Var2;
                            if (a1Var4 != null) {
                                a1Var4.setValue(null);
                            }
                            e3 e3Var13 = e3Var2;
                            if (!e3Var13.k()) {
                                e3Var13.z(true);
                                e3Var3.s(false);
                                e3Var4.C(false);
                                e3Var5.v(false);
                                e3Var6.w(false);
                                e3Var7.y(false);
                                e3Var8.x(false);
                                e3Var9.t(false);
                                e3Var10.u(false);
                                e3Var11.B(false);
                                e3Var12.A(false);
                            }
                            return pe.z.f22715a;
                        }
                    }, 28);
                    boolean f12 = rVar2.f(n2Var3) | rVar2.f(n2Var2) | rVar2.f(n2Var);
                    Object O3 = rVar2.O();
                    if (f12 || O3 == v0Var) {
                        O3 = new i3(n2Var3, n2Var2, n2Var, 1);
                        rVar2.k0(O3);
                    }
                    r a11 = androidx.compose.ui.graphics.a(e, (df.l) O3);
                    p0 d10 = m.d(c.B, false);
                    int hashCode2 = Long.hashCode(rVar2.T);
                    g l11 = rVar2.l();
                    r c11 = a.c(a11, rVar2);
                    h.f1471d.getClass();
                    b0 b0Var2 = g.f1462b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(b0Var2);
                    } else {
                        rVar2.n0();
                    }
                    y.I(g.e, d10, rVar2);
                    y.I(g.f1464d, l11, rVar2);
                    f fVar2 = g.f1465f;
                    if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode2))) {
                        a.t(hashCode2, rVar2, hashCode2, fVar2);
                    }
                    y.I(g.f1463c, c11, rVar2);
                    String b12 = wa.n7.b(R.string.tool_scissors, rVar2);
                    float f13 = 52;
                    if (z10) {
                        sVar2 = null;
                    } else {
                        sVar2 = sVar3;
                    }
                    a(R.drawable.ic_tijera, b12, f13, sVar2, null, 0.0f, 0.0f, 0.0f, 0L, rVar2, 384, 496);
                    rVar2.p(true);
                } else {
                    rVar2.U();
                }
                return zVar;
        }
    }

    public /* synthetic */ g3(n2 n2Var, n2 n2Var2, n2 n2Var3, a1 a1Var, a1 a1Var2, e3 e3Var, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, e3 e3Var6, e3 e3Var7, e3 e3Var8, e3 e3Var9, e3 e3Var10, e3 e3Var11, boolean z3, s sVar) {
        this.f28284v = n2Var;
        this.f28285w = n2Var2;
        this.f28286x = n2Var3;
        this.L = a1Var;
        this.M = a1Var2;
        this.f28287y = e3Var;
        this.f28288z = e3Var2;
        this.A = e3Var3;
        this.B = e3Var4;
        this.C = e3Var5;
        this.D = e3Var6;
        this.E = e3Var7;
        this.F = e3Var8;
        this.G = e3Var9;
        this.H = e3Var10;
        this.I = e3Var11;
        this.J = z3;
        this.K = sVar;
    }
}
