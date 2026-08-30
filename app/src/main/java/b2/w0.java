package b2;
import a0.k0;
import a0.o;
import b2.a;
import b2.c1;
import b2.e0;
import b2.g0;
import b2.i0;
import b2.n0;
import b2.w0;
import c2.x;
import j.a;
import j.c;
import q.m;
import q.x;
import t0.e;
import y1.a;
import z1.a1;
import z1.o0;

/* loaded from: classes.dex */
public final class w0 extends a1 implements o0, a, c1 {
    public boolean A;
    public boolean E;
    public boolean F;
    public y2.a G;
    public df.l I;
    public boolean N;
    public Object P;
    public boolean Q;

    /* renamed from: z, reason: collision with root package name */
    public final n0 f1614z;
    public int B = Integer.MAX_VALUE;
    public int C = Integer.MAX_VALUE;
    public g0 D = g0.f1468w;
    public long H = 0;
    public t0 J = t0.f1596w;
    public final j0 K = new j0(this, 1);
    public final e L = new e(new w0[16]);
    public boolean M = true;
    public boolean O = true;

    public w0(n0 n0Var) {
        this.f1614z = n0Var;
        this.P = n0Var.f1558p.K;
    }

    public final void C0(boolean z3) {
        n0 n0Var = this.f1614z;
        if (!z3 || !n0Var.f1547c) {
            if (z3 || n0Var.f1547c) {
                this.J = t0.f1596w;
                e z9 = n0Var.f1545a.z();
                Object[] objArr = z9.f25617u;
                int i = z9.f25619w;
                for (int i10 = 0; i10 < i; i10++) {
                    w0 w0Var = ((i0) objArr[i10]).f1478a0.f1559q;
                    w0Var.getClass();
                    w0Var.C0(true);
                }
            }
        }
    }

    public final void F0() {
        t0 t0Var = this.J;
        n0 n0Var = this.f1614z;
        boolean z3 = n0Var.f1547c;
        i0 i0Var = n0Var.f1545a;
        t0 t0Var2 = t0.f1594u;
        if (z3) {
            this.J = t0.f1595v;
        } else {
            this.J = t0Var2;
        }
        if (t0Var != t0Var2 && n0Var.e) {
            i0.T(i0Var, true, 6);
        }
        e z9 = i0Var.z();
        Object[] objArr = z9.f25617u;
        int i = z9.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var2 = (i0) objArr[i10];
            w0 w0Var = i0Var2.f1478a0.f1559q;
            if (w0Var != null) {
                if (w0Var.C != Integer.MAX_VALUE) {
                    w0Var.F0();
                    i0.W(i0Var2);
                }
            } else {
                x.n("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
        }
    }

    public final void G0() {
        n0 n0Var = this.f1614z;
        if (n0Var.f1557o > 0) {
            e z3 = n0Var.f1545a.z();
            Object[] objArr = z3.f25617u;
            int i = z3.f25619w;
            for (int i10 = 0; i10 < i; i10++) {
                i0 i0Var = (i0) objArr[i10];
                n0 n0Var2 = i0Var.f1478a0;
                if ((n0Var2.f1555m || n0Var2.f1556n) && !n0Var2.f1549f) {
                    i0Var.S(false);
                }
                w0 w0Var = n0Var2.f1559q;
                if (w0Var != null) {
                    w0Var.G0();
                }
            }
        }
    }

    @Override // a1, o0
    public final Object H() {
        return this.P;
    }

    public final void H0() {
        g0 g0Var;
        n0 n0Var = this.f1614z;
        i0.T(n0Var.f1545a, false, 7);
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

    public final void K0() {
        e0 e0Var;
        this.Q = true;
        n0 n0Var = this.f1614z;
        i0 v2 = n0Var.f1545a.v();
        t0 t0Var = this.J;
        if ((t0Var != t0.f1594u && !n0Var.f1547c) || (t0Var != t0.f1595v && n0Var.f1547c)) {
            F0();
            if (this.A && v2 != null) {
                v2.S(false);
            }
        }
        if (v2 != null) {
            n0 n0Var2 = v2.f1478a0;
            if (!this.A && ((e0Var = n0Var2.f1548d) == e0.f1445w || e0Var == e0.f1446x)) {
                if (this.C != Integer.MAX_VALUE) {
                    a.b("Place was called on a node which was placed already");
                }
                int i = n0Var2.f1551h;
                this.C = i;
                n0Var2.f1551h = i + 1;
            }
        } else {
            this.C = 0;
        }
        P();
    }

    public final void L0(long j10, df.l lVar) {
        e0 e0Var;
        n0 n0Var = this.f1614z;
        i0 i0Var = n0Var.f1545a;
        i0 i0Var2 = n0Var.f1545a;
        try {
            i0 v2 = i0Var.v();
            if (v2 != null) {
                e0Var = v2.f1478a0.f1548d;
            } else {
                e0Var = null;
            }
            e0 e0Var2 = e0.f1446x;
            if (e0Var == e0Var2) {
                n0Var.f1547c = false;
            }
            if (i0Var2.f1488k0) {
                a.a("place is called on a deactivated node");
            }
            n0Var.f1548d = e0Var2;
            this.E = true;
            this.Q = false;
            if (!y2.a(j10, this.H)) {
                if (n0Var.f1556n || n0Var.f1555m) {
                    n0Var.f1549f = true;
                }
                G0();
            }
            v1 a10 = m0.a(i0Var2);
            if (!n0Var.f1549f && Q()) {
                s0 f12 = n0Var.a().f1();
                f12.getClass();
                f12.Z0(y2.c(j10, f12.f31773y));
                K0();
            } else {
                n0Var.h(false);
                this.K.e = false;
                x1 snapshotObserver = ((x) a10).getSnapshotObserver();
                v0 v0Var = new v0(this, a10, j10);
                snapshotObserver.getClass();
                if (i0Var2.B != null) {
                    snapshotObserver.a(i0Var2, snapshotObserver.f1623g, v0Var);
                } else {
                    snapshotObserver.a(i0Var2, snapshotObserver.f1622f, v0Var);
                }
            }
            this.H = j10;
            this.I = lVar;
            n0Var.f1548d = e0.f1447y;
        } catch (Throwable th) {
            i0Var.Y(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean M0(long r13) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.w0.M0(long):boolean");
    }

    @Override // c1
    public final void O(boolean z3) {
        Boolean bool;
        s0 f12;
        n0 n0Var = this.f1614z;
        s0 f13 = n0Var.a().f1();
        if (f13 != null) {
            bool = Boolean.valueOf(f13.C);
        } else {
            bool = null;
        }
        if (!Boolean.valueOf(z3).equals(bool) && (f12 = n0Var.a().f1()) != null) {
            f12.C = z3;
        }
    }

    @Override // a
    public final void P() {
        y2.a aVar;
        this.N = true;
        j0 j0Var = this.K;
        j0Var.h();
        n0 n0Var = this.f1614z;
        boolean z3 = n0Var.f1549f;
        i0 i0Var = n0Var.f1545a;
        if (z3) {
            e z9 = i0Var.z();
            Object[] objArr = z9.f25617u;
            int i = z9.f25619w;
            for (int i10 = 0; i10 < i; i10++) {
                i0 i0Var2 = (i0) objArr[i10];
                n0 n0Var2 = i0Var2.f1478a0;
                if (n0Var2.e && i0Var2.t() == g0.f1466u) {
                    w0 w0Var = n0Var2.f1559q;
                    w0Var.getClass();
                    w0 w0Var2 = n0Var2.f1559q;
                    if (w0Var2 != null) {
                        aVar = w0Var2.G;
                    } else {
                        aVar = null;
                    }
                    aVar.getClass();
                    if (w0Var.M0(aVar.f30799a)) {
                        i0.T(i0Var, false, 7);
                    }
                }
            }
        }
        r rVar = g().l0;
        rVar.getClass();
        if (n0Var.f1550g || (!rVar.E && n0Var.f1549f)) {
            n0Var.f1549f = false;
            e0 e0Var = n0Var.f1548d;
            n0Var.f1548d = e0.f1446x;
            v1 a10 = m0.a(i0Var);
            n0Var.i(false);
            x1 snapshotObserver = ((x) a10).getSnapshotObserver();
            o oVar = new o(this, 4, rVar);
            snapshotObserver.getClass();
            if (i0Var.B != null) {
                snapshotObserver.a(i0Var, snapshotObserver.f1624h, oVar);
            } else {
                snapshotObserver.a(i0Var, snapshotObserver.e, oVar);
            }
            n0Var.f1548d = e0Var;
            if (n0Var.f1555m && rVar.E) {
                requestLayout();
            }
            n0Var.f1550g = false;
        }
        if (j0Var.f1506b && j0Var.e()) {
            j0Var.g();
        }
        this.N = false;
    }

    @Override // a
    public final boolean Q() {
        if (this.J != t0.f1596w) {
            return true;
        }
        return false;
    }

    @Override // a
    public final void X() {
        i0.T(this.f1614z.f1545a, false, 7);
    }

    @Override // o0
    public final int Z(int i) {
        H0();
        s0 f12 = this.f1614z.a().f1();
        f12.getClass();
        return f12.Z(i);
    }

    @Override // a
    public final j0 b() {
        return this.K;
    }

    @Override // o0
    public final int c(int i) {
        H0();
        s0 f12 = this.f1614z.a().f1();
        f12.getClass();
        return f12.c(i);
    }

    @Override // a
    public final s g() {
        return (s) this.f1614z.f1545a.Z.f1458x;
    }

    @Override // a
    public final a h() {
        n0 n0Var;
        i0 v2 = this.f1614z.f1545a.v();
        if (v2 != null && (n0Var = v2.f1478a0) != null) {
            return n0Var.f1559q;
        }
        return null;
    }

    @Override // o0
    public final int l(int i) {
        H0();
        s0 f12 = this.f1614z.a().f1();
        f12.getClass();
        return f12.l(i);
    }

    @Override // a
    public final void m(k0 k0Var) {
        e z3 = this.f1614z.f1545a.z();
        Object[] objArr = z3.f25617u;
        int i = z3.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            w0 w0Var = ((i0) objArr[i10]).f1478a0.f1559q;
            w0Var.getClass();
            k0Var.invoke(w0Var);
        }
    }

    @Override // o0
    public final int n(int i) {
        H0();
        s0 f12 = this.f1614z.a().f1();
        f12.getClass();
        return f12.n(i);
    }

    @Override // a1
    public final void r0(long j10, float f10, df.l lVar) {
        L0(j10, lVar);
    }

    @Override // a
    public final void requestLayout() {
        this.f1614z.f1545a.S(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r3 == e0.f1446x) goto L13;
     */
    @Override // o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a1 z(long r6) {
        /*
            r5 = this;
            n0 r0 = r5.f1614z
            i0 r1 = r0.f1545a
            i0 r2 = r0.f1545a
            i0 r1 = r1.v()
            r3 = 0
            if (r1 == 0) goto L12
            n0 r1 = r1.f1478a0
            e0 r1 = r1.f1548d
            goto L13
        L12:
            r1 = r3
        L13:
            e0 r4 = e0.f1444v
            if (r1 == r4) goto L25
            i0 r1 = r2.v()
            if (r1 == 0) goto L21
            n0 r1 = r1.f1478a0
            e0 r3 = r1.f1548d
        L21:
            e0 r1 = e0.f1446x
            if (r3 != r1) goto L28
        L25:
            r1 = 0
            r0.f1546b = r1
        L28:
            i0 r0 = r2.v()
            g0 r1 = g0.f1468w
            if (r0 == 0) goto L63
            n0 r0 = r0.f1478a0
            g0 r3 = r5.D
            if (r3 == r1) goto L40
            boolean r3 = r2.Y
            if (r3 == 0) goto L3b
            goto L40
        L3b:
            java.lang.String r3 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            a.b(r3)
        L40:
            e0 r3 = r0.f1548d
            int r3 = r3.ordinal()
            if (r3 == 0) goto L5e
            r4 = 1
            if (r3 == r4) goto L5e
            r4 = 2
            if (r3 == r4) goto L5b
            r4 = 3
            if (r3 != r4) goto L52
            goto L5b
        L52:
            java.lang.String r6 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            e0 r7 = r0.f1548d
            g5.m(r7, r6)
            r6 = 0
            return r6
        L5b:
            g0 r0 = g0.f1467v
            goto L60
        L5e:
            g0 r0 = g0.f1466u
        L60:
            r5.D = r0
            goto L65
        L63:
            r5.D = r1
        L65:
            g0 r0 = r2.W
            if (r0 != r1) goto L6c
            r2.e()
        L6c:
            r5.M0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.w0.z(long):a1");
    }
}
