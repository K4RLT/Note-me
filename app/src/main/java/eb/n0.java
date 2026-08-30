package eb;
import d1.d;
import k0.y;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n0 {
    public Long A;
    public Long B;
    public long C;
    public String D;
    public int E;
    public int F;
    public long G;
    public String H;
    public byte[] I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public String P;
    public boolean Q;
    public long R;
    public long S;

    /* renamed from: a, reason: collision with root package name */
    public final d1 f16249a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16250b;

    /* renamed from: c, reason: collision with root package name */
    public String f16251c;

    /* renamed from: d, reason: collision with root package name */
    public String f16252d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public String f16253f;

    /* renamed from: g, reason: collision with root package name */
    public long f16254g;

    /* renamed from: h, reason: collision with root package name */
    public long f16255h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public String f16256j;

    /* renamed from: k, reason: collision with root package name */
    public long f16257k;

    /* renamed from: l, reason: collision with root package name */
    public String f16258l;

    /* renamed from: m, reason: collision with root package name */
    public long f16259m;

    /* renamed from: n, reason: collision with root package name */
    public long f16260n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16261o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16262p;

    /* renamed from: q, reason: collision with root package name */
    public String f16263q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f16264r;

    /* renamed from: s, reason: collision with root package name */
    public long f16265s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f16266t;

    /* renamed from: u, reason: collision with root package name */
    public String f16267u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16268v;

    /* renamed from: w, reason: collision with root package name */
    public long f16269w;

    /* renamed from: x, reason: collision with root package name */
    public long f16270x;

    /* renamed from: y, reason: collision with root package name */
    public int f16271y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f16272z;

    public n0(d1 d1Var, String str) {
        fa.y.h(d1Var);
        fa.y.e(str);
        this.f16249a = d1Var;
        this.f16250b = str;
        y0 y0Var = d1Var.D;
        d(y0Var);
        y0Var.u();
    }

    public final void A(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.M != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.M = j10;
    }

    public final void B(String str) {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        this.Q |= !Objects.equals(this.f16253f, str);
        this.f16253f = str;
    }

    public final void C(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.N != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.N = j10;
    }

    public final void D(String str) {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= !Objects.equals(this.f16252d, str);
        this.f16252d = str;
    }

    public final void E(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.L != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.L = j10;
    }

    public final void F(String str) {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        this.Q |= !Objects.equals(this.P, str);
        this.P = str;
    }

    public final void G(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.K != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.K = j10;
    }

    public final void H(String str) {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        this.Q |= !Objects.equals(this.e, str);
        this.e = str;
    }

    public final void I(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.O != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.O = j10;
    }

    public final void J(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.J != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.J = j10;
    }

    public final void K(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.f16260n != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.f16260n = j10;
    }

    public final void L(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.f16265s != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.f16265s = j10;
    }

    public final void M(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.S != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.S = j10;
    }

    public final void N(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.f16259m != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.f16259m = j10;
    }

    public final long O() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.f16265s;
    }

    public final void P(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.G != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.G = j10;
    }

    public final void Q(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.i != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.i = j10;
    }

    public final void R(long j10) {
        boolean z3;
        boolean z9 = false;
        if (j10 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        fa.y.b(z3);
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z10 = this.Q;
        if (this.f16254g != j10) {
            z9 = true;
        }
        this.Q = z10 | z9;
        this.f16254g = j10;
    }

    public final void S(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.f16255h != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.f16255h = j10;
    }

    public final void T(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.f16270x != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.f16270x = j10;
    }

    public final void U(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.f16269w != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.f16269w = j10;
    }

    public final Boolean V() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.f16264r;
    }

    public final void a(long j10) {
        d1 d1Var = this.f16249a;
        y0 y0Var = d1Var.D;
        k0 k0Var = d1Var.C;
        d(y0Var);
        y0Var.u();
        long j11 = this.f16254g + j10;
        String str = this.f16250b;
        if (j11 > 2147483647L) {
            d(k0Var);
            k0Var.D.f(y(str), "Bundle index overflow. appId");
            j11 = j10 - 1;
        }
        long j12 = this.G + 1;
        if (j12 > 2147483647L) {
            d(k0Var);
            k0Var.D.f(y(str), "Delivery index overflow. appId");
            j12 = 0;
        }
        this.Q = true;
        this.f16254g = j11;
        this.G = j12;
    }

    public final void b(String str) {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= !Objects.equals(this.f16263q, str);
        this.f16263q = str;
    }

    public final void c(List list) {
        ArrayList arrayList;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        if (!Objects.equals(this.f16266t, list)) {
            this.Q = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f16266t = arrayList;
        }
    }

    public final String d() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.f16263q;
    }

    public final String e() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        String str = this.P;
        F(null);
        return str;
    }

    public final String f() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.f16250b;
    }

    public final String g() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.f16251c;
    }

    public final String h() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.f16256j;
    }

    public final String i() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.f16253f;
    }

    public final String j() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.f16252d;
    }

    public final String k() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.H;
    }

    public final String l() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.D;
    }

    public final void m() {
        d1 d1Var = this.f16249a;
        y0 y0Var = d1Var.D;
        d(y0Var);
        y0Var.u();
        long j10 = this.f16254g + 1;
        if (j10 > 2147483647L) {
            k0 k0Var = d1Var.C;
            d(k0Var);
            k0Var.D.f(y(this.f16250b), "Bundle index overflow. appId");
            j10 = 0;
        }
        this.Q = true;
        this.f16254g = j10;
    }

    public final boolean n() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.f16262p;
    }

    public final boolean o() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.Q;
    }

    public final boolean p() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.f16268v;
    }

    public final void q(int i) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.F != i) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.F = i;
    }

    public final void r(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.f16257k != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.f16257k = j10;
    }

    public final void s(String str) {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        this.Q |= !Objects.equals(this.f16251c, str);
        this.f16251c = str;
    }

    public final void t(boolean z3) {
        boolean z9;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z10 = this.Q;
        if (this.f16261o != z3) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.Q = z10 | z9;
        this.f16261o = z3;
    }

    public final void u(int i) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.E != i) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.E = i;
    }

    public final void v(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.C != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.C = j10;
    }

    public final void w(String str) {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        this.Q |= !Objects.equals(this.f16258l, str);
        this.f16258l = str;
    }

    public final void x(long j10) {
        boolean z3;
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        boolean z9 = this.Q;
        if (this.R != j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z9 | z3;
        this.R = j10;
    }

    public final void y(String str) {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        this.Q |= !Objects.equals(this.f16256j, str);
        this.f16256j = str;
    }

    public final long z() {
        y0 y0Var = this.f16249a.D;
        d(y0Var);
        y0Var.u();
        return this.f16257k;
    }
}
