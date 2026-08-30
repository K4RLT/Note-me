package b2;
import a.a;
import z0.i;
import a0.k0;
import b.b;
import b2.a1;
import b2.c1;
import b2.i0;
import b2.j0;
import b2.k1;
import b2.l;
import b2.m0;
import b2.n0;
import b2.t0;
import b2.v1;
import b2.w0;
import c2.x;
import d1.q;
import j.c;
import l.e;
import l1.g;
import q.m;
import z1.o0;
import z1.z0;

import java.util.List;

/* loaded from: classes.dex */
public final class a1 extends z1.a1 implements o0, a, c1 {
    public boolean A;
    public boolean D;
    public boolean E;
    public df.l H;
    public float I;
    public Object K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean T;
    public float X;
    public boolean Y;
    public df.l Z;

    /* renamed from: b0, reason: collision with root package name */
    public float f1417b0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1419d0;

    /* renamed from: z, reason: collision with root package name */
    public final n0 f1420z;
    public int B = Integer.MAX_VALUE;
    public int C = Integer.MAX_VALUE;
    public g0 F = g0.f1468w;
    public long G = 0;
    public boolean J = true;
    public final j0 Q = new j0(this, 0);
    public final e R = new e(new a1[16]);
    public boolean S = true;
    public long U = y2.b(0, 0, 15);
    public final z0 V = new z0(this, 1);
    public final z0 W = new z0(this, 0);

    /* renamed from: a0, reason: collision with root package name */
    public long f1416a0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final z0 f1418c0 = new z0(this, 2);

    public a1(n0 n0Var) {
        this.f1420z = n0Var;
    }

    public final List C0() {
        n0 n0Var = this.f1420z;
        n0Var.f1545a.f0();
        boolean z3 = this.S;
        e eVar = this.R;
        if (!z3) {
            return eVar.i();
        }
        i0 i0Var = n0Var.f1545a;
        e z9 = i0Var.z();
        Object[] objArr = z9.f25617u;
        int i = z9.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var2 = (i0) objArr[i10];
            if (eVar.f25619w <= i10) {
                eVar.b(i0Var2.f1478a0.f1558p);
            } else {
                a1 a1Var = i0Var2.f1478a0.f1558p;
                Object[] objArr2 = eVar.f25617u;
                Object obj = objArr2[i10];
                objArr2[i10] = a1Var;
            }
        }
        eVar.o(((b) i0Var.n()).f25611u.f25619w, eVar.f25619w);
        this.S = false;
        return eVar.i();
    }

    public final void F0() {
        boolean z3 = this.L;
        this.L = true;
        i0 i0Var = this.f1420z.f1545a;
        f1 f1Var = i0Var.Z;
        if (!z3) {
            ((s) f1Var.f1458x).t1();
            if (i0Var.q()) {
                i0.V(i0Var, true, 6);
            } else if (i0Var.f1478a0.e) {
                i0.T(i0Var, true, 6);
            }
        }
        k1 k1Var = ((s) f1Var.f1458x).L;
        for (k1 k1Var2 = (k1) f1Var.f1459y; !kotlin.jvm.internal.a(k1Var2, k1Var) && k1Var2 != null; k1Var2 = k1Var2.L) {
            if (k1Var2.f1530d0) {
                k1Var2.o1();
            }
        }
        e z9 = i0Var.z();
        Object[] objArr = z9.f25617u;
        int i = z9.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var2 = (i0) objArr[i10];
            if (i0Var2.w() != Integer.MAX_VALUE) {
                i0Var2.f1478a0.f1558p.F0();
                i0.W(i0Var2);
            }
        }
    }

    public final void G0() {
        if (this.L) {
            this.L = false;
            n0 n0Var = this.f1420z;
            f1 f1Var = n0Var.f1545a.Z;
            k1 k1Var = ((s) f1Var.f1458x).L;
            for (k1 k1Var2 = (k1) f1Var.f1459y; !kotlin.jvm.internal.a(k1Var2, k1Var) && k1Var2 != null; k1Var2 = k1Var2.L) {
                q j12 = k1Var2.j1(g(1048576));
                if (j12 != null && (j12.f15688u.f15691x & 1048576) != 0) {
                    boolean g8 = g(1048576);
                    q h12 = k1Var2.h1();
                    if (g8 || (h12 = h12.f15692y) != null) {
                        for (q j13 = k1Var2.j1(g8); j13 != null && (j13.f15691x & 1048576) != 0; j13 = j13.f15693z) {
                            if ((j13.f15690w & 1048576) != 0) {
                                q qVar = j13;
                                e eVar = null;
                                while (qVar != null) {
                                    if ((qVar.f15690w & 1048576) != 0 && (qVar instanceof k)) {
                                        int i = 0;
                                        for (q qVar2 = ((k) qVar).J; qVar2 != null; qVar2 = qVar2.f15693z) {
                                            if ((qVar2.f15690w & 1048576) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    qVar = qVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new e(new q[16]);
                                                    }
                                                    if (qVar != null) {
                                                        eVar.b(qVar);
                                                        qVar = null;
                                                    }
                                                    eVar.b(qVar2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    qVar = e(eVar);
                                }
                            }
                            if (j13 != h12) {
                            }
                        }
                    }
                }
                k1Var2.y1();
            }
            e z3 = n0Var.f1545a.z();
            Object[] objArr = z3.f25617u;
            int i10 = z3.f25619w;
            for (int i11 = 0; i11 < i10; i11++) {
                ((i0) objArr[i11]).f1478a0.f1558p.G0();
            }
        }
    }

    @Override // z1.a1, o0
    public final Object H() {
        return this.K;
    }

    public final void H0() {
        n0 n0Var = this.f1420z;
        if (n0Var.f1554l > 0) {
            e z3 = n0Var.f1545a.z();
            Object[] objArr = z3.f25617u;
            int i = z3.f25619w;
            for (int i10 = 0; i10 < i; i10++) {
                i0 i0Var = (i0) objArr[i10];
                n0 n0Var2 = i0Var.f1478a0;
                boolean z9 = n0Var2.f1552j;
                a1 a1Var = n0Var2.f1558p;
                if ((z9 || n0Var2.f1553k) && !a1Var.O) {
                    i0Var.U(false);
                }
                a1Var.H0();
            }
        }
    }

    public final void K0() {
        g0 g0Var;
        n0 n0Var = this.f1420z;
        i0.V(n0Var.f1545a, false, 7);
        i0 i0Var = n0Var.f1545a;
        i0 v2 = i0Var.v();
        if (v2 != null && i0Var.W == g0.f1468w) {
            int ordinal = v2.f1478a0.f1548d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    g0Var = v2.W;
                } else {
                    g0Var = g0.f1467v;
                }
            } else {
                g0Var = g0.f1466u;
            }
            i0Var.W = g0Var;
        }
    }

    public final void L0() {
        this.Y = true;
        n0 n0Var = this.f1420z;
        i0 v2 = n0Var.f1545a.v();
        float f10 = g().W;
        i0 i0Var = n0Var.f1545a;
        f1 f1Var = i0Var.Z;
        k1 k1Var = (k1) f1Var.f1459y;
        s sVar = (s) f1Var.f1458x;
        while (k1Var != sVar) {
            k1Var.getClass();
            a0 a0Var = (a0) k1Var;
            f10 += a0Var.W;
            k1Var = a0Var.L;
        }
        if (f10 != this.X) {
            this.X = f10;
            if (v2 != null) {
                v2.O();
            }
            if (v2 != null) {
                v2.C();
            }
        }
        if (!this.L) {
            if (v2 != null) {
                v2.C();
            }
            F0();
            if (this.A && v2 != null) {
                v2.U(false);
            }
        } else {
            ((s) i0Var.Z.f1458x).t1();
        }
        if (v2 != null) {
            n0 n0Var2 = v2.f1478a0;
            if (!this.A && n0Var2.f1548d == e0.f1445w) {
                if (this.C != Integer.MAX_VALUE) {
                    a.b("Place was called on a node which was placed already");
                }
                int i = n0Var2.i;
                this.C = i;
                n0Var2.i = i + 1;
            }
        } else {
            this.C = 0;
        }
        P();
    }

    public final void M0(long j10) {
        n0 n0Var = this.f1420z;
        e0 e0Var = n0Var.f1548d;
        i0 i0Var = n0Var.f1545a;
        e0 e0Var2 = e0.f1447y;
        if (e0Var != e0Var2) {
            a.b("layout state is not idle before measure starts");
        }
        this.U = j10;
        e0 e0Var3 = e0.f1443u;
        n0Var.f1548d = e0Var3;
        this.N = false;
        x1 snapshotObserver = ((x) m0.a(i0Var)).getSnapshotObserver();
        snapshotObserver.a(i0Var, snapshotObserver.f1620c, this.V);
        if (n0Var.f1548d == e0Var3) {
            this.O = true;
            this.P = true;
            n0Var.f1548d = e0Var2;
        }
    }

    public final void N0(long j10, float f10, df.l lVar) {
        n0 n0Var = this.f1420z;
        i0 i0Var = n0Var.f1545a;
        i0 i0Var2 = n0Var.f1545a;
        if (i0Var.f1488k0) {
            a.a("place is called on a deactivated node");
        }
        n0Var.f1548d = e0.f1445w;
        this.G = j10;
        this.I = f10;
        this.H = lVar;
        this.Y = false;
        v1 a10 = m0.a(i0Var2);
        if (!this.O && this.L) {
            k1 a11 = n0Var.a();
            a11.w1(y2.c(j10, a11.f31773y), f10, lVar);
            L0();
        } else {
            this.Q.e = false;
            n0Var.f(false);
            this.Z = lVar;
            this.f1416a0 = j10;
            this.f1417b0 = f10;
            x1 snapshotObserver = ((x) a10).getSnapshotObserver();
            snapshotObserver.a(i0Var2, snapshotObserver.f1622f, this.f1418c0);
        }
        n0Var.f1548d = e0.f1447y;
        this.E = true;
    }

    @Override // c1
    public final void O(boolean z3) {
        n0 n0Var = this.f1420z;
        if (z3 != n0Var.a().C) {
            n0Var.a().C = z3;
            this.f1419d0 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0064, B:27:0x007e, B:29:0x0088, B:33:0x0094), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean O0(long r9) {
        /*
            r8 = this;
            n0 r0 = r8.f1420z
            i0 r1 = r0.f1545a
            i0 r2 = r0.f1545a
            boolean r3 = r1.f1488k0     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L13
            java.lang.String r3 = "measure is called on a deactivated node"
            a.a(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r9 = move-exception
            goto Lb0
        L13:
            v1 r3 = m0.a(r2)     // Catch: java.lang.Throwable -> L10
            i0 r4 = r2.v()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r2.Y     // Catch: java.lang.Throwable -> L10
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L2a
            if (r4 == 0) goto L28
            boolean r4 = r4.Y     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r4 = r7
            goto L2b
        L2a:
            r4 = r6
        L2b:
            r2.Y = r4     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.q()     // Catch: java.lang.Throwable -> L10
            if (r4 != 0) goto L45
            long r4 = r8.f31772x     // Catch: java.lang.Throwable -> L10
            boolean r4 = y2.a.b(r4, r9)     // Catch: java.lang.Throwable -> L10
            if (r4 != 0) goto L3c
            goto L45
        L3c:
            x r3 = (x) r3     // Catch: java.lang.Throwable -> L10
            r3.j(r2, r7)     // Catch: java.lang.Throwable -> L10
            r2.X()     // Catch: java.lang.Throwable -> L10
            return r7
        L45:
            j0 r3 = r8.Q     // Catch: java.lang.Throwable -> L10
            r3.f1508d = r7     // Catch: java.lang.Throwable -> L10
            e r2 = r2.z()     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r3 = r2.f25617u     // Catch: java.lang.Throwable -> L10
            int r2 = r2.f25619w     // Catch: java.lang.Throwable -> L10
            r4 = r7
        L52:
            if (r4 >= r2) goto L64
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L10
            i0 r5 = (i0) r5     // Catch: java.lang.Throwable -> L10
            n0 r5 = r5.f1478a0     // Catch: java.lang.Throwable -> L10
            b2.a1 r5 = r5.f1558p     // Catch: java.lang.Throwable -> L10
            j0 r5 = r5.Q     // Catch: java.lang.Throwable -> L10
            r5.getClass()     // Catch: java.lang.Throwable -> L10
            int r4 = r4 + 1
            goto L52
        L64:
            r8.D = r6     // Catch: java.lang.Throwable -> L10
            k1 r2 = a()     // Catch: java.lang.Throwable -> L10
            long r2 = r2.f31771w     // Catch: java.lang.Throwable -> L10
            r8.A0(r9)     // Catch: java.lang.Throwable -> L10
            r8.M0(r9)     // Catch: java.lang.Throwable -> L10
            k1 r9 = a()     // Catch: java.lang.Throwable -> L10
            long r9 = r9.f31771w     // Catch: java.lang.Throwable -> L10
            boolean r9 = y2.c(r9, r2)     // Catch: java.lang.Throwable -> L10
            if (r9 == 0) goto L94
            k1 r9 = a()     // Catch: java.lang.Throwable -> L10
            int r9 = r9.f31769u     // Catch: java.lang.Throwable -> L10
            int r10 = r8.f31769u     // Catch: java.lang.Throwable -> L10
            if (r9 != r10) goto L94
            k1 r9 = a()     // Catch: java.lang.Throwable -> L10
            int r9 = r9.f31770v     // Catch: java.lang.Throwable -> L10
            int r10 = r8.f31770v     // Catch: java.lang.Throwable -> L10
            if (r9 == r10) goto L93
            goto L94
        L93:
            r6 = r7
        L94:
            k1 r9 = a()     // Catch: java.lang.Throwable -> L10
            int r9 = r9.f31769u     // Catch: java.lang.Throwable -> L10
            k1 r10 = a()     // Catch: java.lang.Throwable -> L10
            int r10 = r10.f31770v     // Catch: java.lang.Throwable -> L10
            long r2 = (long) r9     // Catch: java.lang.Throwable -> L10
            r9 = 32
            long r2 = r2 << r9
            long r9 = (long) r10     // Catch: java.lang.Throwable -> L10
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r4
            long r9 = r9 | r2
            r8.x0(r9)     // Catch: java.lang.Throwable -> L10
            return r6
        Lb0:
            r1.Y(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a1.O0(long):boolean");
    }

    @Override // a
    public final void P() {
        y2.a aVar;
        boolean z3;
        this.T = true;
        j0 j0Var = this.Q;
        j0Var.h();
        boolean z9 = this.O;
        n0 n0Var = this.f1420z;
        if (z9) {
            e z10 = n0Var.f1545a.z();
            Object[] objArr = z10.f25617u;
            int i = z10.f25619w;
            for (int i10 = 0; i10 < i; i10++) {
                i0 i0Var = (i0) objArr[i10];
                boolean q10 = i0Var.q();
                n0 n0Var2 = i0Var.f1478a0;
                if (q10 && i0Var.s() == g0.f1466u) {
                    a1 a1Var = n0Var2.f1558p;
                    if (a1Var.D) {
                        aVar = new y2.a(a1Var.f31772x);
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        if (i0Var.W == g0.f1468w) {
                            i0Var.e();
                        }
                        z3 = n0Var2.f1558p.O0(aVar.f30799a);
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i0.V(n0Var.f1545a, false, 7);
                    }
                }
            }
        }
        if (this.P || (!g().E && this.O)) {
            this.O = false;
            e0 e0Var = n0Var.f1548d;
            n0Var.f1548d = e0.f1445w;
            n0Var.g(false);
            i0 i0Var2 = n0Var.f1545a;
            x1 snapshotObserver = ((x) m0.a(i0Var2)).getSnapshotObserver();
            snapshotObserver.a(i0Var2, snapshotObserver.e, this.W);
            n0Var.f1548d = e0Var;
            if (g().E && n0Var.f1552j) {
                requestLayout();
            }
            this.P = false;
        }
        if (j0Var.f1506b && j0Var.e()) {
            j0Var.g();
        }
        this.T = false;
    }

    @Override // a
    public final boolean Q() {
        return this.L;
    }

    @Override // a
    public final void X() {
        i0.V(this.f1420z.f1545a, false, 7);
    }

    @Override // o0
    public final int Z(int i) {
        n0 n0Var = this.f1420z;
        if (l.p(n0Var.f1545a)) {
            w0 w0Var = n0Var.f1559q;
            w0Var.getClass();
            return w0Var.Z(i);
        }
        K0();
        return n0Var.a().Z(i);
    }

    @Override // a
    public final j0 b() {
        return this.Q;
    }

    @Override // o0
    public final int c(int i) {
        n0 n0Var = this.f1420z;
        if (l.p(n0Var.f1545a)) {
            w0 w0Var = n0Var.f1559q;
            w0Var.getClass();
            return w0Var.c(i);
        }
        K0();
        return n0Var.a().c(i);
    }

    @Override // z1.a1
    public final int e0() {
        return this.f1420z.a().e0();
    }

    @Override // z1.a1
    public final int f0() {
        return this.f1420z.a().f0();
    }

    @Override // a
    public final s g() {
        return (s) this.f1420z.f1545a.Z.f1458x;
    }

    @Override // a
    public final a h() {
        n0 n0Var;
        i0 v2 = this.f1420z.f1545a.v();
        if (v2 != null && (n0Var = v2.f1478a0) != null) {
            return n0Var.f1558p;
        }
        return null;
    }

    @Override // o0
    public final int l(int i) {
        n0 n0Var = this.f1420z;
        if (l.p(n0Var.f1545a)) {
            w0 w0Var = n0Var.f1559q;
            w0Var.getClass();
            return w0Var.l(i);
        }
        K0();
        return n0Var.a().l(i);
    }

    @Override // a
    public final void m(k0 k0Var) {
        e z3 = this.f1420z.f1545a.z();
        Object[] objArr = z3.f25617u;
        int i = z3.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            k0Var.invoke(((i0) objArr[i10]).f1478a0.f1558p);
        }
    }

    @Override // o0
    public final int n(int i) {
        n0 n0Var = this.f1420z;
        if (l.p(n0Var.f1545a)) {
            w0 w0Var = n0Var.f1559q;
            w0Var.getClass();
            return w0Var.n(i);
        }
        K0();
        return n0Var.a().n(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002d, B:10:0x0031, B:14:0x004d, B:16:0x0055, B:18:0x0063, B:20:0x006e, B:21:0x0072, B:22:0x0059, B:23:0x003d, B:25:0x0043, B:27:0x0047, B:28:0x0049, B:29:0x0086, B:31:0x008a, B:35:0x0092, B:36:0x0097, B:41:0x001a, B:43:0x001e, B:45:0x0022, B:47:0x002a, B:48:0x0026), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002d, B:10:0x0031, B:14:0x004d, B:16:0x0055, B:18:0x0063, B:20:0x006e, B:21:0x0072, B:22:0x0059, B:23:0x003d, B:25:0x0043, B:27:0x0047, B:28:0x0049, B:29:0x0086, B:31:0x008a, B:35:0x0092, B:36:0x0097, B:41:0x001a, B:43:0x001e, B:45:0x0022, B:47:0x002a, B:48:0x0026), top: B:2:0x0007 }] */
    @Override // z1.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0(long r10, float r12, df.l r13) {
        /*
            r9 = this;
            n0 r0 = r9.f1420z
            i0 r1 = r0.f1545a
            i0 r2 = r0.f1545a
            r3 = 1
            r9.M = r3     // Catch: java.lang.Throwable -> L17
            long r4 = r9.G     // Catch: java.lang.Throwable -> L17
            boolean r4 = y2.a(r10, r4)     // Catch: java.lang.Throwable -> L17
            r5 = 0
            if (r4 == 0) goto L1a
            boolean r4 = r9.f1419d0     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L2d
            goto L1a
        L17:
            r10 = move-exception
            goto L9b
        L1a:
            boolean r4 = r0.f1553k     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L26
            boolean r4 = r0.f1552j     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L26
            boolean r4 = r9.f1419d0     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L2a
        L26:
            r9.O = r3     // Catch: java.lang.Throwable -> L17
            r9.f1419d0 = r5     // Catch: java.lang.Throwable -> L17
        L2a:
            r9.H0()     // Catch: java.lang.Throwable -> L17
        L2d:
            w0 r4 = r0.f1559q     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L86
            n0 r6 = r4.f1614z     // Catch: java.lang.Throwable -> L17
            i0 r7 = r6.f1545a     // Catch: java.lang.Throwable -> L17
            boolean r7 = l.p(r7)     // Catch: java.lang.Throwable -> L17
            if (r7 == 0) goto L3d
            r4 = r3
            goto L4b
        L3d:
            t0 r4 = r4.J     // Catch: java.lang.Throwable -> L17
            t0 r7 = t0.f1596w     // Catch: java.lang.Throwable -> L17
            if (r4 != r7) goto L49
            boolean r4 = r6.f1546b     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L49
            r6.f1547c = r3     // Catch: java.lang.Throwable -> L17
        L49:
            boolean r4 = r6.f1547c     // Catch: java.lang.Throwable -> L17
        L4b:
            if (r4 != r3) goto L86
            k1 r4 = a()     // Catch: java.lang.Throwable -> L17
            k1 r4 = r4.M     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L59
            k0 r4 = r4.F     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L63
        L59:
            v1 r4 = m0.a(r2)     // Catch: java.lang.Throwable -> L17
            x r4 = (x) r4     // Catch: java.lang.Throwable -> L17
            z0 r4 = r4.getPlacementScope()     // Catch: java.lang.Throwable -> L17
        L63:
            w0 r6 = r0.f1559q     // Catch: java.lang.Throwable -> L17
            r6.getClass()     // Catch: java.lang.Throwable -> L17
            i0 r2 = r2.v()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L72
            n0 r2 = r2.f1478a0     // Catch: java.lang.Throwable -> L17
            r2.f1551h = r5     // Catch: java.lang.Throwable -> L17
        L72:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r6.C = r2     // Catch: java.lang.Throwable -> L17
            r2 = 32
            long r7 = r10 >> r2
            int r2 = (int) r7     // Catch: java.lang.Throwable -> L17
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r10
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L17
            z0.i(r4, r6, r2, r7)     // Catch: java.lang.Throwable -> L17
        L86:
            w0 r0 = r0.f1559q     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L8f
            boolean r0 = r0.E     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L8f
            goto L90
        L8f:
            r3 = r5
        L90:
            if (r3 == 0) goto L97
            java.lang.String r0 = "Error: Placement happened before lookahead."
            a.b(r0)     // Catch: java.lang.Throwable -> L17
        L97:
            r9.N0(r10, r12, r13)     // Catch: java.lang.Throwable -> L17
            return
        L9b:
            r1.Y(r10)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a1.r0(long, float, df.l):void");
    }

    @Override // a
    public final void requestLayout() {
        this.f1420z.f1545a.U(false);
    }

    @Override // o0
    public final z1.a1 z(long j10) {
        g0 g0Var;
        n0 n0Var = this.f1420z;
        i0 i0Var = n0Var.f1545a;
        i0 i0Var2 = n0Var.f1545a;
        g0 g0Var2 = i0Var.W;
        g0 g0Var3 = g0.f1468w;
        if (g0Var2 == g0Var3) {
            i0Var.e();
        }
        if (l.p(i0Var2)) {
            w0 w0Var = n0Var.f1559q;
            w0Var.getClass();
            w0Var.D = g0Var3;
            w0Var.z(j10);
        }
        i0 v2 = i0Var2.v();
        if (v2 != null) {
            n0 n0Var2 = v2.f1478a0;
            if (this.F != g0Var3 && !i0Var2.Y) {
                a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = n0Var2.f1548d.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    g0Var = g0.f1467v;
                } else {
                    g5.m(n0Var2.f1548d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
            } else {
                g0Var = g0.f1466u;
            }
            this.F = g0Var;
        } else {
            this.F = g0Var3;
        }
        O0(j10);
        return this;
    }
}
