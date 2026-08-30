package b2;
import c2.x;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f1545a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1546b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1547c;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1549f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1550g;

    /* renamed from: h, reason: collision with root package name */
    public int f1551h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1552j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1553k;

    /* renamed from: l, reason: collision with root package name */
    public int f1554l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1555m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1556n;

    /* renamed from: o, reason: collision with root package name */
    public int f1557o;

    /* renamed from: q, reason: collision with root package name */
    public w0 f1559q;

    /* renamed from: d, reason: collision with root package name */
    public e0 f1548d = e0.f1447y;

    /* renamed from: p, reason: collision with root package name */
    public final a1 f1558p = new a1(this);

    public n0(i0 i0Var) {
        this.f1545a = i0Var;
    }

    public final k1 a() {
        return (k1) this.f1545a.Z.f1459y;
    }

    public final void b() {
        e0 e0Var = this.f1545a.f1478a0.f1548d;
        e0 e0Var2 = e0.f1445w;
        e0 e0Var3 = e0.f1446x;
        if (e0Var == e0Var2 || e0Var == e0Var3) {
            if (this.f1558p.T) {
                g(true);
            } else {
                f(true);
            }
        }
        if (e0Var == e0Var3) {
            w0 w0Var = this.f1559q;
            if (w0Var != null && w0Var.N) {
                i(true);
            } else {
                h(true);
            }
        }
    }

    public final void c(long j10) {
        w0 w0Var = this.f1559q;
        if (w0Var != null) {
            n0 n0Var = w0Var.f1614z;
            n0Var.f1548d = e0.f1444v;
            i0 i0Var = n0Var.f1545a;
            n0Var.e = false;
            x1 snapshotObserver = ((x) m0.a(i0Var)).getSnapshotObserver();
            u0 u0Var = new u0(w0Var, j10);
            snapshotObserver.getClass();
            if (i0Var.B != null) {
                snapshotObserver.a(i0Var, snapshotObserver.f1619b, u0Var);
            } else {
                snapshotObserver.a(i0Var, snapshotObserver.f1620c, u0Var);
            }
            n0Var.f1549f = true;
            n0Var.f1550g = true;
            boolean p10 = l.p(i0Var);
            a1 a1Var = n0Var.f1558p;
            if (p10) {
                a1Var.O = true;
                a1Var.P = true;
            } else {
                a1Var.N = true;
            }
            n0Var.f1548d = e0.f1447y;
        }
    }

    public final void d(int i) {
        boolean z3;
        n0 n0Var;
        int i10 = this.f1554l;
        this.f1554l = i;
        boolean z9 = false;
        if (i10 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i == 0) {
            z9 = true;
        }
        if (z3 != z9) {
            i0 v2 = this.f1545a.v();
            if (v2 != null) {
                n0Var = v2.f1478a0;
            } else {
                n0Var = null;
            }
            if (n0Var != null) {
                int i11 = n0Var.f1554l;
                if (i == 0) {
                    n0Var.d(i11 - 1);
                } else {
                    n0Var.d(i11 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        boolean z3;
        n0 n0Var;
        int i10 = this.f1557o;
        this.f1557o = i;
        boolean z9 = false;
        if (i10 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i == 0) {
            z9 = true;
        }
        if (z3 != z9) {
            i0 v2 = this.f1545a.v();
            if (v2 != null) {
                n0Var = v2.f1478a0;
            } else {
                n0Var = null;
            }
            if (n0Var != null) {
                int i11 = n0Var.f1557o;
                if (i == 0) {
                    n0Var.e(i11 - 1);
                } else {
                    n0Var.e(i11 + 1);
                }
            }
        }
    }

    public final void f(boolean z3) {
        if (this.f1553k != z3) {
            this.f1553k = z3;
            if (z3 && !this.f1552j) {
                d(this.f1554l + 1);
            } else if (!z3 && !this.f1552j) {
                d(this.f1554l - 1);
            }
        }
    }

    public final void g(boolean z3) {
        if (this.f1552j != z3) {
            this.f1552j = z3;
            if (z3 && !this.f1553k) {
                d(this.f1554l + 1);
            } else if (!z3 && !this.f1553k) {
                d(this.f1554l - 1);
            }
        }
    }

    public final void h(boolean z3) {
        if (this.f1556n != z3) {
            this.f1556n = z3;
            if (z3 && !this.f1555m) {
                e(this.f1557o + 1);
            } else if (!z3 && !this.f1555m) {
                e(this.f1557o - 1);
            }
        }
    }

    public final void i(boolean z3) {
        if (this.f1555m != z3) {
            this.f1555m = z3;
            if (z3 && !this.f1556n) {
                e(this.f1557o + 1);
            } else if (!z3 && !this.f1556n) {
                e(this.f1557o - 1);
            }
        }
    }

    public final void j() {
        a1 a1Var = this.f1558p;
        n0 n0Var = a1Var.f1420z;
        Object obj = a1Var.K;
        i0 i0Var = this.f1545a;
        if ((obj != null || n0Var.a().H() != null) && a1Var.J) {
            a1Var.J = false;
            a1Var.K = n0Var.a().H();
            i0 v2 = i0Var.v();
            if (v2 != null) {
                i0.V(v2, false, 7);
            }
        }
        w0 w0Var = this.f1559q;
        if (w0Var != null) {
            n0 n0Var2 = w0Var.f1614z;
            if (w0Var.P == null) {
                s0 f12 = n0Var2.a().f1();
                f12.getClass();
                if (f12.I.H() == null) {
                    return;
                }
            }
            if (w0Var.O) {
                w0Var.O = false;
                s0 f13 = n0Var2.a().f1();
                f13.getClass();
                w0Var.P = f13.I.H();
                if (l.p(i0Var)) {
                    i0 v4 = i0Var.v();
                    if (v4 != null) {
                        i0.V(v4, false, 7);
                        return;
                    }
                    return;
                }
                i0 v10 = i0Var.v();
                if (v10 != null) {
                    i0.T(v10, false, 7);
                }
            }
        }
    }
}
