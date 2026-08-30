package b2;
import a.a;
import x.e;
import x.o;
import a0.k0;
import a2.c;
import b0.e0;
import b0.e1;
import b2.k1;
import b2.w1;
import c1.d;
import c2.n0;
import c2.x;
import c2.y1;
import d1.l;
import d1.p;
import d1.q;
import d1.r;
import j2.j;
import j2.k;
import j2.s;
import k1.m0;
import n1.b;
import q.m;
import r0.a0;
import r0.i1;
import r0.y;
import r0.z;
import z0.g;
import z1.j0;
import z1.p0;

import c2.r2;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import java.util.Arrays;
import java.util.List;
import r0.o2;

/* loaded from: classes.dex */
public final class i0 implements j, w1, h {
    public static final d0 l0 = new f0("Undefined intrinsics block and it is required");
    public static final c0 m0 = new Object();

    /* renamed from: n0, reason: collision with root package name */
    public static final e0 f1477n0 = new e0(1);
    public boolean A;
    public i0 B;
    public int C;
    public final gw D;
    public e E;
    public boolean F;
    public i0 G;
    public v1 H;
    public b3.s I;
    public int J;
    public boolean K;
    public boolean L;
    public j M;
    public boolean N;
    public final e O;
    public boolean P;
    public p0 Q;
    public e4 R;
    public y2.c S;
    public y2.m T;
    public r2 U;
    public a0 V;
    public g0 W;
    public g0 X;
    public boolean Y;
    public final f1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final n0 f1478a0;

    /* renamed from: b0, reason: collision with root package name */
    public j0 f1479b0;

    /* renamed from: c0, reason: collision with root package name */
    public k1 f1480c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1481d0;

    /* renamed from: e0, reason: collision with root package name */
    public r f1482e0;

    /* renamed from: f0, reason: collision with root package name */
    public r f1483f0;

    /* renamed from: g0, reason: collision with root package name */
    public b3.d f1484g0;

    /* renamed from: h0, reason: collision with root package name */
    public b3.e f1485h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1486i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f1487j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f1488k0;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1489u;

    /* renamed from: v, reason: collision with root package name */
    public int f1490v;

    /* renamed from: w, reason: collision with root package name */
    public long f1491w;

    /* renamed from: x, reason: collision with root package name */
    public long f1492x;

    /* renamed from: y, reason: collision with root package name */
    public long f1493y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1494z;

    public i0(int i, boolean z3) {
        this.f1489u = z3;
        this.f1490v = i;
        this.f1491w = 9223372034707292159L;
        this.f1492x = 0L;
        this.f1493y = 9223372034707292159L;
        this.f1494z = true;
        int i10 = 1;
        this.D = new gw(new e(new i0[16]), i10, new c(i10, this));
        this.O = new e(new i0[16]);
        this.P = true;
        this.Q = l0;
        this.S = m0.f1540a;
        this.T = y2.m.f30814u;
        this.U = m0;
        a0.f24177s.getClass();
        this.V = z.f24443b;
        g0 g0Var = g0.f1468w;
        this.W = g0Var;
        this.X = g0Var;
        this.Z = new f1(this);
        this.f1478a0 = new n0(this);
        this.f1481d0 = true;
        this.f1482e0 = o.f15687a;
    }

    public static void T(i0 i0Var, boolean z3, int i) {
        boolean z9;
        i0 v2;
        boolean z10 = false;
        if ((i & 1) != 0) {
            z3 = false;
        }
        if ((i & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((i & 4) != 0) {
            z10 = true;
        }
        if (i0Var.B == null) {
            a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        i0Var.f1494z = true;
        v1 v1Var = i0Var.H;
        if (v1Var != null && !i0Var.K && !i0Var.f1489u) {
            ((x) v1Var).z(i0Var, true, z3, z9);
            if (z10) {
                w0 w0Var = i0Var.f1478a0.f1559q;
                w0Var.getClass();
                n0 n0Var = w0Var.f1614z;
                i0 v4 = n0Var.f1545a.v();
                g0 g0Var = n0Var.f1545a.W;
                if (v4 != null && g0Var != g0.f1468w) {
                    while (v4.W == g0Var && (v2 = v4.v()) != null) {
                        v4 = v2;
                    }
                    int ordinal = g0Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            if (v4.B != null) {
                                v4.S(z3);
                                return;
                            } else {
                                v4.U(z3);
                                return;
                            }
                        }
                        x.o("Intrinsics isn't used by the parent");
                        return;
                    }
                    if (v4.B != null) {
                        T(v4, z3, 6);
                    } else {
                        V(v4, z3, 6);
                    }
                }
            }
        }
    }

    public static void V(i0 i0Var, boolean z3, int i) {
        boolean z9;
        boolean z10;
        v1 v1Var;
        i0 v2;
        if ((i & 1) != 0) {
            z3 = false;
        }
        if ((i & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((i & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0Var.f1494z = true;
        if (!i0Var.K && !i0Var.f1489u && (v1Var = i0Var.H) != null) {
            ((x) v1Var).z(i0Var, false, z3, z9);
            if (z10) {
                n0 n0Var = i0Var.f1478a0.f1558p.f1420z;
                i0 v4 = n0Var.f1545a.v();
                g0 g0Var = n0Var.f1545a.W;
                if (v4 != null && g0Var != g0.f1468w) {
                    while (v4.W == g0Var && (v2 = v4.v()) != null) {
                        v4 = v2;
                    }
                    int ordinal = g0Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            v4.U(z3);
                            return;
                        } else {
                            x.o("Intrinsics isn't used by the parent");
                            return;
                        }
                    }
                    V(v4, z3, 6);
                }
            }
        }
    }

    public static void W(i0 i0Var) {
        int i = h0.f1472a[i0Var.f1478a0.f1548d.ordinal()];
        n0 n0Var = i0Var.f1478a0;
        if (i == 1) {
            if (n0Var.e) {
                T(i0Var, true, 6);
                return;
            }
            if (n0Var.f1549f) {
                i0Var.S(true);
            }
            if (i0Var.q()) {
                V(i0Var, true, 6);
                return;
            } else {
                if (i0Var.p()) {
                    i0Var.U(true);
                    return;
                }
                return;
            }
        }
        g5.m(n0Var.f1548d, "Unexpected state ");
    }

    private final String j(i0 i0Var) {
        String str;
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(i0Var);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(g(0));
        sb2.append(" Other tree: ");
        i0 i0Var2 = i0Var.G;
        if (i0Var2 != null) {
            str = i0Var2.g(0);
        } else {
            str = null;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final void A(long j10, q qVar, int i, boolean z3) {
        f1 f1Var = this.Z;
        k1 k1Var = (k1) f1Var.f1459y;
        m0 m0Var = k1.f1522f0;
        ((k1) f1Var.f1459y).m1(k1.f1525i0, k1Var.e1(j10), qVar, i, z3);
    }

    public final void B(int i, i0 i0Var) {
        if (i0Var.G != null && i0Var.H != null) {
            a.b(j(i0Var));
        }
        i0Var.G = this;
        gw gwVar = this.D;
        ((e) gwVar.f14386v).a(i, i0Var);
        ((c) gwVar.f14387w).invoke();
        O();
        if (i0Var.f1489u) {
            this.C++;
        }
        H();
        v1 v1Var = this.H;
        if (v1Var != null) {
            i0Var.d(v1Var);
        }
        if (i0Var.f1478a0.f1554l > 0) {
            n0 n0Var = this.f1478a0;
            n0Var.d(n0Var.f1554l + 1);
        }
        if (i0Var.f1487j0 > 0) {
            a0(this.f1487j0 + 1);
        }
    }

    public final void C() {
        u1 u1Var;
        if (this.f1481d0) {
            f1 f1Var = this.Z;
            k1 k1Var = (s) f1Var.f1458x;
            k1 k1Var2 = ((k1) f1Var.f1459y).M;
            this.f1480c0 = null;
            while (true) {
                if (kotlin.jvm.internal.a(k1Var, k1Var2)) {
                    break;
                }
                if (k1Var != null) {
                    u1Var = k1Var.f1531e0;
                } else {
                    u1Var = null;
                }
                if (u1Var != null) {
                    this.f1480c0 = k1Var;
                    break;
                } else if (k1Var != null) {
                    k1Var = k1Var.M;
                } else {
                    k1Var = null;
                }
            }
        }
        k1 k1Var3 = this.f1480c0;
        if (k1Var3 != null && k1Var3.f1531e0 == null) {
            throw wd0.m("layer was not set");
        }
        if (k1Var3 != null) {
            k1Var3.o1();
            return;
        }
        i0 v2 = v();
        if (v2 != null) {
            v2.C();
        }
    }

    public final void D() {
        f1 f1Var = this.Z;
        k1 k1Var = (k1) f1Var.f1459y;
        s sVar = (s) f1Var.f1458x;
        while (k1Var != sVar) {
            k1Var.getClass();
            a0 a0Var = (a0) k1Var;
            u1 u1Var = a0Var.f1531e0;
            if (u1Var != null) {
                ((y1) u1Var).c();
            }
            k1Var = a0Var.L;
        }
        u1 u1Var2 = ((s) f1Var.f1458x).f1531e0;
        if (u1Var2 != null) {
            ((y1) u1Var2).c();
        }
    }

    public final void E() {
        if (this.f1489u) {
            i0 v2 = v();
            if (v2 != null) {
                v2.E();
                return;
            }
            return;
        }
        if (this.B != null) {
            T(this, false, 7);
        } else {
            V(this, false, 7);
        }
    }

    public final void F() {
        if (!y2.a(this.f1491w, 9223372034707292159L)) {
            this.f1491w = 9223372034707292159L;
            e z3 = z();
            Object[] objArr = z3.f25617u;
            int i = z3.f25619w;
            for (int i10 = 0; i10 < i; i10++) {
                ((i0) objArr[i10]).F();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.internal.y] */
    public final void G() {
        if (this.N) {
            return;
        }
        if (((e1) this.Z.f1457w).f15693z != null || this.f1483f0 != null) {
            this.L = true;
            return;
        }
        j jVar = this.M;
        this.N = true;
        Object obj = new Object();
        obj.f19787u = new j();
        x1 snapshotObserver = ((x) m0.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f1621d, new o(this, 3, (Object) obj));
        this.N = false;
        this.M = (j) obj.f19787u;
        this.L = false;
        x xVar = (x) m0.a(this);
        xVar.getSemanticsOwner().b(this, jVar);
        xVar.B();
    }

    public final void H() {
        i0 i0Var;
        if (this.C > 0) {
            this.F = true;
        }
        if (this.f1489u && (i0Var = this.G) != null) {
            i0Var.H();
        }
    }

    public final boolean I() {
        if (this.H != null) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        return this.f1478a0.f1558p.L;
    }

    public final Boolean K() {
        w0 w0Var = this.f1478a0.f1559q;
        if (w0Var != null) {
            return Boolean.valueOf(w0Var.Q());
        }
        return null;
    }

    public final void L() {
        i0 v2;
        if (this.W == g0.f1468w) {
            f();
        }
        w0 w0Var = this.f1478a0.f1559q;
        w0Var.getClass();
        try {
            w0Var.A = true;
            if (!w0Var.E) {
                a.b("replace() called on item that was not placed");
            }
            w0Var.Q = false;
            boolean Q = w0Var.Q();
            w0Var.L0(w0Var.H, w0Var.I);
            if (Q && !w0Var.Q && (v2 = w0Var.f1614z.f1545a.v()) != null) {
                v2.S(false);
            }
            w0Var.A = false;
        } catch (Throwable th) {
            w0Var.A = false;
            throw th;
        }
    }

    public final void M(int i, int i10, int i11) {
        int i12;
        if (i == i10) {
            return;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            if (i > i10) {
                i12 = i + i13;
            } else {
                i12 = i;
            }
            int i14 = i > i10 ? i10 + i13 : (i10 + i11) - 2;
            gw gwVar = this.D;
            e eVar = (e) gwVar.f14386v;
            c cVar = (c) gwVar.f14387w;
            Object n10 = eVar.n(i12);
            cVar.invoke();
            ((e) gwVar.f14386v).a(i14, (i0) n10);
            cVar.invoke();
        }
        O();
        H();
        E();
    }

    public final void N(i0 i0Var) {
        if (i0Var.f1478a0.f1554l > 0) {
            this.f1478a0.d(r0.f1554l - 1);
        }
        if (this.H != null) {
            i0Var.h();
        }
        i0Var.G = null;
        if (i0Var.f1487j0 > 0) {
            a0(this.f1487j0 - 1);
        }
        ((k1) i0Var.Z.f1459y).M = null;
        if (i0Var.f1489u) {
            this.C--;
            e eVar = (e) i0Var.D.f14386v;
            Object[] objArr = eVar.f25617u;
            int i = eVar.f25619w;
            for (int i10 = 0; i10 < i; i10++) {
                ((k1) ((i0) objArr[i10]).Z.f1459y).M = null;
            }
        }
        H();
        O();
    }

    public final void O() {
        if (this.f1489u) {
            i0 v2 = v();
            if (v2 != null) {
                v2.O();
                return;
            }
            return;
        }
        this.P = true;
    }

    public final void P() {
        gw gwVar = this.D;
        int i = ((e) gwVar.f14386v).f25619w;
        while (true) {
            i--;
            e eVar = (e) gwVar.f14386v;
            if (-1 < i) {
                N((i0) eVar.f25617u[i]);
            } else {
                eVar.j();
                ((c) gwVar.f14387w).invoke();
                return;
            }
        }
    }

    public final void Q(int i, int i10) {
        if (i10 < 0) {
            a.a("count (" + i10 + ") must be greater than 0");
        }
        int i11 = (i10 + i) - 1;
        if (i > i11) {
            return;
        }
        while (true) {
            gw gwVar = this.D;
            N((i0) ((e) gwVar.f14386v).f25617u[i11]);
            Object n10 = ((e) gwVar.f14386v).n(i11);
            ((c) gwVar.f14387w).invoke();
            if (i11 != i) {
                i11--;
            } else {
                return;
            }
        }
    }

    public final void R() {
        i0 v2;
        if (this.W == g0.f1468w) {
            f();
        }
        a1 a1Var = this.f1478a0.f1558p;
        n0 n0Var = a1Var.f1420z;
        try {
            a1Var.A = true;
            if (!a1Var.E) {
                a.b("replace called on unplaced item");
            }
            boolean z3 = a1Var.L;
            a1Var.N0(a1Var.G, a1Var.I, a1Var.H);
            if (z3 && !a1Var.Y && (v2 = n0Var.f1545a.v()) != null) {
                v2.U(false);
            }
        } finally {
        }
    }

    public final void S(boolean z3) {
        v1 v1Var;
        this.f1494z = true;
        if (!this.f1489u && (v1Var = this.H) != null) {
            ((x) v1Var).A(this, true, z3);
        }
    }

    public final void U(boolean z3) {
        v1 v1Var;
        this.f1494z = true;
        if (!this.f1489u && (v1Var = this.H) != null) {
            ((x) v1Var).A(this, false, z3);
        }
    }

    public final void X() {
        e z3 = z();
        Object[] objArr = z3.f25617u;
        int i = z3.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var = (i0) objArr[i10];
            g0 g0Var = i0Var.X;
            i0Var.W = g0Var;
            if (g0Var != g0.f1468w) {
                i0Var.X();
            }
        }
    }

    public final void Y(Throwable th) {
        a0 a0Var = this.V;
        o2 o2Var = d.f3447a;
        g gVar = (g) a0Var;
        gVar.getClass();
        c cVar = (c) y.E(gVar, o2Var);
        if (cVar != null) {
            wa.a(th, new androidx.ink.brush.b(cVar, 5, this));
            throw th;
        }
        throw th;
    }

    public final void Z(y2.c cVar) {
        if (!kotlin.jvm.internal.a(this.S, cVar)) {
            this.S = cVar;
            E();
            i0 v2 = v();
            if (v2 != null) {
                v2.C();
            }
            D();
            for (q qVar = (q) this.Z.A; qVar != null; qVar = qVar.f15693z) {
                qVar.d();
            }
        }
    }

    @Override // j
    public final void a() {
        b3.s sVar = this.I;
        if (sVar != null) {
            sVar.a();
        }
        j0 j0Var = this.f1479b0;
        if (j0Var != null) {
            j0Var.a();
        }
        f1 f1Var = this.Z;
        k1 k1Var = ((s) f1Var.f1458x).L;
        for (k1 k1Var2 = (k1) f1Var.f1459y; !kotlin.jvm.internal.a(k1Var2, k1Var) && k1Var2 != null; k1Var2 = k1Var2.L) {
            k1Var2.N = true;
            k1Var2.f1529c0.invoke();
            k1Var2.y1();
        }
    }

    public final void a0(int i) {
        i0 v2;
        i0 v4;
        int i10 = this.f1487j0;
        if (i10 != i) {
            if (i > 0 && i10 == 0 && (v4 = v()) != null) {
                v4.a0(v4.f1487j0 + 1);
            }
            if (i == 0 && this.f1487j0 > 0 && (v2 = v()) != null) {
                v2.a0(v2.f1487j0 - 1);
            }
            this.f1487j0 = i;
        }
    }

    @Override // j
    public final void b() {
        c cVar;
        b3.s sVar = this.I;
        if (sVar != null) {
            sVar.b();
        }
        j0 j0Var = this.f1479b0;
        if (j0Var != null) {
            j0Var.e(true);
        }
        this.f1488k0 = true;
        q qVar = (g2) this.Z.f1460z;
        for (q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.f15692y) {
            if (qVar2.H) {
                qVar2.T0();
            }
        }
        for (q qVar3 = qVar; qVar3 != null; qVar3 = qVar3.f15692y) {
            if (qVar3.H) {
                qVar3.V0();
            }
        }
        while (qVar != null) {
            if (qVar.H) {
                qVar.P0();
            }
            qVar = qVar.f15692y;
        }
        if (I()) {
            this.M = null;
            this.L = false;
        }
        v1 v1Var = this.H;
        if (v1Var != null) {
            x xVar = (x) v1Var;
            xVar.getRectManager().i(this);
            if (x.e() && (cVar = xVar.f3690c0) != null && cVar.f15881h.e(this.f1490v)) {
                cVar.f15875a.o(cVar.f15877c, this.f1490v, false);
            }
        }
    }

    public final void b0(i0 i0Var) {
        if (!kotlin.jvm.internal.a(i0Var, this.B)) {
            this.B = i0Var;
            n0 n0Var = this.f1478a0;
            if (i0Var != null) {
                if (n0Var.f1559q == null) {
                    n0Var.f1559q = new w0(n0Var);
                }
                f1 f1Var = this.Z;
                k1 k1Var = ((s) f1Var.f1458x).L;
                for (k1 k1Var2 = (k1) f1Var.f1459y; !kotlin.jvm.internal.a(k1Var2, k1Var) && k1Var2 != null; k1Var2 = k1Var2.L) {
                    k1Var2.c1();
                }
            } else {
                n0Var.f1559q = null;
                n0Var.f1549f = false;
                n0Var.e = false;
            }
            E();
        }
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [k1, q] */
    public final void c(r rVar) {
        int i;
        Object r72;
        e eVar;
        boolean z3;
        f1 f1Var;
        e1 e1Var;
        e eVar2;
        boolean z9;
        s sVar;
        boolean z10;
        boolean z11;
        f1 f1Var2;
        boolean z12;
        boolean z13;
        k0 k0Var;
        f1 f1Var3 = this.Z;
        boolean n10 = f1Var3.n(16);
        q qVar = (g2) f1Var3.f1460z;
        boolean n11 = f1Var3.n(1024);
        this.f1482e0 = rVar;
        s sVar2 = (s) f1Var3.f1458x;
        i0 i0Var = (i0) f1Var3.f1456v;
        q qVar2 = (q) f1Var3.A;
        e1 e1Var2 = (e1) f1Var3.f1457w;
        if (qVar2 == e1Var2) {
            a.b("padChain called on already padded chain");
        }
        q qVar3 = (q) f1Var3.A;
        qVar3.f15692y = e1Var2;
        e1Var2.f15693z = qVar3;
        e eVar3 = (e) f1Var3.B;
        if (eVar3 != null) {
            i = eVar3.f25619w;
        } else {
            i = 0;
        }
        e eVar4 = (e) f1Var3.C;
        if (eVar4 == null) {
            eVar4 = new e(new p[16]);
        }
        e eVar5 = (e) f1Var3.D;
        eVar5.b(rVar);
        k0 k0Var2 = null;
        while (true) {
            int i10 = eVar5.f25619w;
            if (i10 == 0) {
                break;
            }
            r rVar2 = (r) eVar5.n(i10 - 1);
            if (rVar2 instanceof l) {
                l lVar = (l) rVar2;
                eVar5.b(lVar.f15684b);
                eVar5.b(lVar.f15683a);
            } else if (rVar2 instanceof p) {
                eVar4.b(rVar2);
            } else {
                if (k0Var2 == null) {
                    k0Var = new k0(6, eVar4);
                    k0Var2 = k0Var;
                } else {
                    k0Var = k0Var2;
                }
                rVar2.a(k0Var);
            }
        }
        int i11 = eVar4.f25619w;
        if (i11 == i) {
            q qVar4 = e1Var2.f15693z;
            f1 f1Var4 = f1Var3;
            int i12 = 0;
            while (qVar4 != null && i12 < i) {
                if (eVar3 != null) {
                    p pVar = (p) eVar3.f25617u[i12];
                    p pVar2 = (p) eVar4.f25617u[i12];
                    if (kotlin.jvm.internal.a(pVar, pVar2)) {
                        f1Var2 = f1Var4;
                        z13 = 2;
                    } else {
                        f1Var2 = f1Var4;
                        if (pVar.getClass() == pVar2.getClass()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    if (z13) {
                        if (z13) {
                            f1.t(pVar, pVar2, qVar4);
                        }
                        qVar4 = qVar4.f15693z;
                        i12++;
                        f1Var4 = f1Var2;
                    } else {
                        qVar4 = qVar4.f15692y;
                        break;
                    }
                } else {
                    throw wd0.m("expected prior modifier list to be non-empty");
                }
            }
            f1Var2 = f1Var4;
            if (i12 < i) {
                if (eVar3 != null) {
                    if (qVar4 != null) {
                        if (i0Var.f1483f0 != null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        eVar = eVar3;
                        eVar2 = eVar4;
                        z11 = false;
                        q qVar5 = qVar4;
                        f1Var = f1Var2;
                        f1Var.r(i12, eVar, eVar2, qVar5, !z12);
                        e1Var = e1Var2;
                        z9 = true;
                        r72 = z11;
                    } else {
                        throw wd0.m("structuralUpdate requires a non-null tail");
                    }
                } else {
                    throw wd0.m("expected prior modifier list to be non-empty");
                }
            } else {
                f1Var3 = f1Var2;
                z10 = false;
                f1Var = f1Var3;
                eVar = eVar3;
                e1Var = e1Var2;
                eVar2 = eVar4;
                z9 = false;
                r72 = z10;
            }
        } else {
            r72 = 0;
            z11 = false;
            z10 = false;
            r rVar3 = i0Var.f1483f0;
            if (rVar3 != null && i == 0) {
                q qVar6 = e1Var2;
                for (int i13 = 0; i13 < eVar4.f25619w; i13++) {
                    qVar6 = f1.i((p) eVar4.f25617u[i13], qVar6);
                }
                int i14 = 0;
                for (q qVar7 = qVar.f15692y; qVar7 != null && qVar7 != e1Var2; qVar7 = qVar7.f15692y) {
                    i14 |= qVar7.f15690w;
                    qVar7.f15691x = i14;
                }
                f1Var = f1Var3;
                eVar = eVar3;
                e1Var = e1Var2;
                eVar2 = eVar4;
                z9 = true;
                r72 = z11;
            } else if (i11 == 0) {
                if (eVar3 != null) {
                    q qVar8 = e1Var2.f15693z;
                    for (int i15 = 0; qVar8 != null && i15 < eVar3.f25619w; i15++) {
                        qVar8 = f1.j(qVar8).f15693z;
                    }
                    i0 v2 = i0Var.v();
                    if (v2 != null) {
                        sVar = (s) v2.Z.f1458x;
                    } else {
                        sVar = null;
                    }
                    sVar2.M = sVar;
                    f1Var3.f1459y = sVar2;
                    f1Var = f1Var3;
                    eVar = eVar3;
                    e1Var = e1Var2;
                    eVar2 = eVar4;
                    z9 = false;
                    r72 = z10;
                } else {
                    throw wd0.m("expected prior modifier list to be non-empty");
                }
            } else {
                if (eVar3 == null) {
                    eVar3 = new e(new p[16]);
                }
                eVar = eVar3;
                if (rVar3 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                f1Var = f1Var3;
                e1Var = e1Var2;
                eVar2 = eVar4;
                f1Var.r(0, eVar, eVar2, e1Var, !z3);
                z9 = true;
            }
        }
        f1Var.B = eVar2;
        if (eVar != null) {
            eVar.j();
        } else {
            eVar = r72;
        }
        f1Var.C = eVar;
        q qVar9 = e1Var.f15693z;
        if (qVar9 != null) {
            qVar = qVar9;
        }
        qVar.f15692y = r72;
        e1Var.f15693z = r72;
        e1Var.f15691x = -1;
        e1Var.B = r72;
        if (qVar == e1Var) {
            a.b("trimChain did not update the head");
        }
        f1Var.A = qVar;
        if (z9) {
            f1Var.s();
        }
        boolean n12 = f1Var.n(16);
        boolean n13 = f1Var.n(1024);
        this.f1478a0.j();
        if (this.B == null && f1Var.n(512)) {
            b0(this);
        }
        if (n10 != n12 || n11 != n13) {
            a rectManager = ((x) m0.a(this)).getRectManager();
            rectManager.getClass();
            if (I()) {
                e1 e1Var3 = rectManager.f19536a;
                int i16 = this.f1490v & 67108863;
                long[] jArr = (long[]) e1Var3.f1180c;
                int i17 = e1Var3.f1179b;
                for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
                    int i19 = i18 + 2;
                    long j10 = jArr[i19];
                    if ((((int) j10) & 67108863) == i16) {
                        jArr[i19] = ((n12 ? 1L : 0L) * Long.MIN_VALUE) | (4611686018427387903L & j10) | ((n13 ? 1L : 0L) * 4611686018427387904L);
                        return;
                    }
                }
            }
        }
    }

    public final void c0(p0 p0Var) {
        if (!kotlin.jvm.internal.a(this.Q, p0Var)) {
            this.Q = p0Var;
            e4 e4Var = this.R;
            if (e4Var != null) {
                ((i1) e4Var.f13729w).setValue(p0Var);
            }
            E();
        }
    }

    public final void d(v1 v1Var) {
        s sVar;
        int i;
        i0 i0Var;
        c cVar;
        j x9;
        v1 v1Var2;
        String str;
        if (this.H != null) {
            a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        i0 i0Var2 = this.G;
        if (i0Var2 != null && !kotlin.jvm.internal.a(i0Var2.H, v1Var)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(v1Var);
            sb2.append(") than the parent's owner(");
            i0 v2 = v();
            if (v2 != null) {
                v1Var2 = v2.H;
            } else {
                v1Var2 = null;
            }
            sb2.append(v1Var2);
            sb2.append("). This tree: ");
            sb2.append(g(0));
            sb2.append(" Parent tree: ");
            i0 i0Var3 = this.G;
            if (i0Var3 != null) {
                str = i0Var3.g(0);
            } else {
                str = null;
            }
            sb2.append(str);
            a.b(sb2.toString());
        }
        i0 v4 = v();
        n0 n0Var = this.f1478a0;
        if (v4 == null) {
            n0Var.f1558p.L = true;
            w0 w0Var = n0Var.f1559q;
            if (w0Var != null) {
                w0Var.J = t0.f1594u;
            }
        }
        f1 f1Var = this.Z;
        k1 k1Var = (k1) f1Var.f1459y;
        if (v4 != null) {
            sVar = (s) v4.Z.f1458x;
        } else {
            sVar = null;
        }
        k1Var.M = sVar;
        this.H = v1Var;
        if (v4 != null) {
            i = v4.J;
        } else {
            i = -1;
        }
        this.J = i + 1;
        r rVar = this.f1483f0;
        if (rVar != null) {
            c(rVar);
        }
        this.f1483f0 = null;
        x xVar = (x) v1Var;
        xVar.getLayoutNodes().i(this.f1490v, this);
        if (this.A) {
            b0(this);
        } else {
            i0 i0Var4 = this.G;
            if (i0Var4 == null || (i0Var = i0Var4.B) == null) {
                i0Var = this.B;
            }
            b0(i0Var);
            if (this.B == null && f1Var.n(512)) {
                b0(this);
            }
        }
        if (!this.f1488k0) {
            for (q qVar = (q) f1Var.A; qVar != null; qVar = qVar.f15693z) {
                qVar.O0();
            }
        }
        e eVar = (e) this.D.f14386v;
        Object[] objArr = eVar.f25617u;
        int i10 = eVar.f25619w;
        for (int i11 = 0; i11 < i10; i11++) {
            ((i0) objArr[i11]).d(v1Var);
        }
        if (!this.f1488k0) {
            f1Var.p();
        }
        E();
        if (v4 != null) {
            v4.E();
        }
        b3.d dVar = this.f1484g0;
        if (dVar != null) {
            dVar.invoke(v1Var);
        }
        n0Var.j();
        if (!this.f1488k0 && f1Var.n(8)) {
            G();
        }
        xVar.getClass();
        if (x.e() && (cVar = xVar.f3690c0) != null && (x9 = x()) != null && x9.f18813u.b(s.f18853q)) {
            cVar.f15881h.a(this.f1490v);
            cVar.f15875a.o(cVar.f15877c, this.f1490v, true);
        }
    }

    public final void d0(r rVar) {
        if (this.f1489u && this.f1482e0 != o.f15687a) {
            a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f1488k0) {
            a.a("modifier is updated when deactivated");
        }
        if (I()) {
            c(rVar);
            if (this.L) {
                G();
                return;
            }
            return;
        }
        this.f1483f0 = rVar;
    }

    public final void e() {
        this.X = this.W;
        g0 g0Var = g0.f1468w;
        this.W = g0Var;
        e z3 = z();
        Object[] objArr = z3.f25617u;
        int i = z3.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var = (i0) objArr[i10];
            if (i0Var.W != g0Var) {
                i0Var.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [q] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [q] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void e0(r2 r2Var) {
        if (!kotlin.jvm.internal.a(this.U, r2Var)) {
            this.U = r2Var;
            q qVar = (q) this.Z.A;
            if ((qVar.f15691x & 16) != 0) {
                while (qVar != null) {
                    if ((qVar.f15690w & 16) != 0) {
                        k kVar = qVar;
                        Object r32 = 0;
                        while (kVar != 0) {
                            if (kVar instanceof a2) {
                                ((a2) kVar).C0();
                            } else if ((kVar.f15690w & 16) != 0 && (kVar instanceof k)) {
                                q qVar2 = kVar.J;
                                int i = 0;
                                kVar = kVar;
                                r32 = r32;
                                while (qVar2 != null) {
                                    if ((qVar2.f15690w & 16) != 0) {
                                        i++;
                                        r32 = r32;
                                        if (i == 1) {
                                            kVar = qVar2;
                                        } else {
                                            if (r32 == 0) {
                                                r32 = new e(new q[16]);
                                            }
                                            if (kVar != 0) {
                                                r32.b(kVar);
                                                kVar = 0;
                                            }
                                            r32.b(qVar2);
                                        }
                                    }
                                    qVar2 = qVar2.f15693z;
                                    kVar = kVar;
                                    r32 = r32;
                                }
                                if (i == 1) {
                                }
                            }
                            kVar = e(r32);
                        }
                    }
                    if ((qVar.f15691x & 16) != 0) {
                        qVar = qVar.f15693z;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void f() {
        this.X = this.W;
        this.W = g0.f1468w;
        e z3 = z();
        Object[] objArr = z3.f25617u;
        int i = z3.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var = (i0) objArr[i10];
            if (i0Var.W == g0.f1467v) {
                i0Var.f();
            }
        }
    }

    public final void f0() {
        if (this.C > 0 && this.F) {
            this.F = false;
            e eVar = this.E;
            if (eVar == null) {
                eVar = new e(new i0[16]);
                this.E = eVar;
            }
            eVar.j();
            e eVar2 = (e) this.D.f14386v;
            Object[] objArr = eVar2.f25617u;
            int i = eVar2.f25619w;
            for (int i10 = 0; i10 < i; i10++) {
                i0 i0Var = (i0) objArr[i10];
                if (i0Var.f1489u) {
                    eVar.d(eVar.f25619w, i0Var.z());
                } else {
                    eVar.b(i0Var);
                }
            }
            n0 n0Var = this.f1478a0;
            n0Var.f1558p.S = true;
            w0 w0Var = n0Var.f1559q;
            if (w0Var != null) {
                w0Var.M = true;
            }
        }
    }

    public final String g(int i) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < i; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        e z3 = z();
        Object[] objArr = z3.f25617u;
        int i11 = z3.f25619w;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(((i0) objArr[i12]).g(i + 1));
        }
        String sb3 = sb2.toString();
        if (i == 0) {
            return sb3.substring(0, sb3.length() - 1);
        }
        return sb3;
    }

    public final void h() {
        c cVar;
        j0 j0Var;
        v1 v1Var = this.H;
        String str = null;
        if (v1Var == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            i0 v2 = v();
            if (v2 != null) {
                str = v2.g(0);
            }
            sb2.append(str);
            a.c(sb2.toString());
            l4.a.p();
            return;
        }
        i0 v4 = v();
        n0 n0Var = this.f1478a0;
        if (v4 != null) {
            v4.C();
            v4.E();
            a1 a1Var = n0Var.f1558p;
            g0 g0Var = g0.f1468w;
            a1Var.F = g0Var;
            w0 w0Var = n0Var.f1559q;
            if (w0Var != null) {
                w0Var.D = g0Var;
            }
        }
        j0 j0Var2 = n0Var.f1558p.Q;
        j0Var2.f1506b = true;
        j0Var2.f1507c = false;
        j0Var2.f1508d = false;
        j0Var2.e = false;
        j0Var2.f1509f = null;
        w0 w0Var2 = n0Var.f1559q;
        if (w0Var2 != null && (j0Var = w0Var2.K) != null) {
            j0Var.f1506b = true;
            j0Var.f1507c = false;
            j0Var.f1508d = false;
            j0Var.e = false;
            j0Var.f1509f = null;
        }
        f1 f1Var = this.Z;
        q qVar = (g2) f1Var.f1460z;
        k1 k1Var = ((s) f1Var.f1458x).L;
        for (k1 k1Var2 = (k1) f1Var.f1459y; !kotlin.jvm.internal.a(k1Var2, k1Var) && k1Var2 != null; k1Var2 = k1Var2.L) {
            k1Var2.y1();
        }
        b3.e eVar = this.f1485h0;
        if (eVar != null) {
            eVar.invoke(v1Var);
        }
        for (q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.f15692y) {
            if (qVar2.H) {
                qVar2.V0();
            }
        }
        this.K = true;
        e eVar2 = (e) this.D.f14386v;
        Object[] objArr = eVar2.f25617u;
        int i = eVar2.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            ((i0) objArr[i10]).h();
        }
        this.K = false;
        while (qVar != null) {
            if (qVar.H) {
                qVar.P0();
            }
            qVar = qVar.f15692y;
        }
        x xVar = (x) v1Var;
        xVar.getLayoutNodes().g(this.f1490v);
        y0 y0Var = xVar.l0;
        ra.e eVar3 = y0Var.f1626b;
        ((z5.h) eVar3.f24675v).n(this);
        ((z5.h) eVar3.f24676w).n(this);
        ((z5.h) eVar3.f24677x).n(this);
        ((e) y0Var.e.f14489v).m(this);
        xVar.f3691d0 = true;
        xVar.getRectManager().i(this);
        if (x.e() && (cVar = xVar.f3690c0) != null && cVar.f15881h.e(this.f1490v)) {
            cVar.f15875a.o(cVar.f15877c, this.f1490v, false);
        }
        this.H = null;
        this.f1491w = 9223372034707292159L;
        b0(null);
        this.J = 0;
        a1 a1Var2 = n0Var.f1558p;
        a1Var2.C = Integer.MAX_VALUE;
        a1Var2.B = Integer.MAX_VALUE;
        a1Var2.L = false;
        w0 w0Var3 = n0Var.f1559q;
        if (w0Var3 != null) {
            w0Var3.C = Integer.MAX_VALUE;
            w0Var3.B = Integer.MAX_VALUE;
            w0Var3.J = t0.f1596w;
        }
        if (f1Var.n(8)) {
            j jVar = this.M;
            this.M = null;
            this.L = false;
            xVar.getSemanticsOwner().b(this, jVar);
            xVar.B();
        }
    }

    public final void i(p pVar, b bVar) {
        try {
            ((k1) this.Z.f1459y).a1(pVar, bVar);
        } catch (Throwable th) {
            Y(th);
            throw null;
        }
    }

    public final void k() {
        y2.a aVar;
        if (this.B != null) {
            T(this, false, 5);
        } else {
            V(this, false, 5);
        }
        a1 a1Var = this.f1478a0.f1558p;
        if (a1Var.D) {
            aVar = new y2.a(a1Var.f31772x);
        } else {
            aVar = null;
        }
        v1 v1Var = this.H;
        if (aVar != null) {
            if (v1Var != null) {
                ((x) v1Var).w(this, aVar.f30799a);
                return;
            }
            return;
        }
        if (v1Var != null) {
            ((x) v1Var).v(true);
        }
    }

    public final List l() {
        w0 w0Var = this.f1478a0.f1559q;
        w0Var.getClass();
        e eVar = w0Var.L;
        n0 n0Var = w0Var.f1614z;
        n0Var.f1545a.n();
        if (!w0Var.M) {
            return eVar.i();
        }
        i0 i0Var = n0Var.f1545a;
        e z3 = i0Var.z();
        Object[] objArr = z3.f25617u;
        int i = z3.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var2 = (i0) objArr[i10];
            if (eVar.f25619w <= i10) {
                w0 w0Var2 = i0Var2.f1478a0.f1559q;
                w0Var2.getClass();
                eVar.b(w0Var2);
            } else {
                w0 w0Var3 = i0Var2.f1478a0.f1559q;
                w0Var3.getClass();
                Object[] objArr2 = eVar.f25617u;
                Object obj = objArr2[i10];
                objArr2[i10] = w0Var3;
            }
        }
        eVar.o(((b) i0Var.n()).f25611u.f25619w, eVar.f25619w);
        w0Var.M = false;
        return eVar.i();
    }

    public final List m() {
        return this.f1478a0.f1558p.C0();
    }

    public final List n() {
        return z().i();
    }

    public final List o() {
        return ((e) this.D.f14386v).i();
    }

    public final boolean p() {
        return this.f1478a0.f1558p.O;
    }

    public final boolean q() {
        return this.f1478a0.f1558p.N;
    }

    @Override // w1
    public final boolean r() {
        return I();
    }

    public final g0 s() {
        return this.f1478a0.f1558p.F;
    }

    public final g0 t() {
        g0 g0Var;
        w0 w0Var = this.f1478a0.f1559q;
        if (w0Var != null && (g0Var = w0Var.D) != null) {
            return g0Var;
        }
        return g0.f1468w;
    }

    public final String toString() {
        return n0.t(this) + " children: " + ((b) n()).f25611u.f25619w + " measurePolicy: " + this.Q + " deactivated: " + this.f1488k0;
    }

    public final e4 u() {
        e4 e4Var = this.R;
        if (e4Var == null) {
            e4 e4Var2 = new e4(this, this.Q);
            this.R = e4Var2;
            return e4Var2;
        }
        return e4Var;
    }

    public final i0 v() {
        i0 i0Var = this.G;
        while (i0Var != null && i0Var.f1489u) {
            i0Var = i0Var.G;
        }
        return i0Var;
    }

    public final int w() {
        return this.f1478a0.f1558p.C;
    }

    public final j x() {
        if (I() && !this.f1488k0 && this.Z.n(8)) {
            return this.M;
        }
        return null;
    }

    public final e y() {
        boolean z3 = this.P;
        e eVar = this.O;
        if (z3) {
            eVar.j();
            eVar.d(eVar.f25619w, z());
            Arrays.sort(eVar.f25617u, 0, eVar.f25619w, f1477n0);
            this.P = false;
        }
        return eVar;
    }

    public final e z() {
        f0();
        if (this.C == 0) {
            return (e) this.D.f14386v;
        }
        e eVar = this.E;
        eVar.getClass();
        return eVar;
    }

    public i0(int i) {
        this(k.f18817a.addAndGet(1), (i & 1) == 0);
    }
}