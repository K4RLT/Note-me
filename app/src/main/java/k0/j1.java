package k0;
import b0.x;
import g0.b;
import g0.e1;
import g0.s0;
import i1.o;
import j1.b;
import l.a;
import p0.a;
import p0.b;
import p0.d;
import p0.f;
import r0.i1;
import r0.y;
import x.a;

import android.view.ActionMode;
import b8.c7;
import c2.o2;
import c2.p2;
import g0.g2;
import g0.k2;
import g0.l2;
import pf.r1;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final k2 f19318a;

    /* renamed from: d, reason: collision with root package name */
    public e1 f19321d;

    /* renamed from: g, reason: collision with root package name */
    public kotlin.jvm.internal.m f19323g;

    /* renamed from: h, reason: collision with root package name */
    public c2.k1 f19324h;
    public pf.z i;

    /* renamed from: j, reason: collision with root package name */
    public o2 f19325j;

    /* renamed from: k, reason: collision with root package name */
    public r1.a f19326k;

    /* renamed from: l, reason: collision with root package name */
    public o f19327l;

    /* renamed from: m, reason: collision with root package name */
    public final i1 f19328m;

    /* renamed from: n, reason: collision with root package name */
    public final i1 f19329n;

    /* renamed from: o, reason: collision with root package name */
    public long f19330o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f19331p;

    /* renamed from: q, reason: collision with root package name */
    public long f19332q;

    /* renamed from: r, reason: collision with root package name */
    public final i1 f19333r;

    /* renamed from: s, reason: collision with root package name */
    public final i1 f19334s;

    /* renamed from: t, reason: collision with root package name */
    public int f19335t;

    /* renamed from: u, reason: collision with root package name */
    public r2.x f19336u;

    /* renamed from: v, reason: collision with root package name */
    public d1 f19337v;

    /* renamed from: w, reason: collision with root package name */
    public final f1 f19338w;

    /* renamed from: x, reason: collision with root package name */
    public final z5.h f19339x;

    /* renamed from: b, reason: collision with root package name */
    public r2.q f19319b = l2.f17199a;

    /* renamed from: c, reason: collision with root package name */
    public df.l f19320c = o0.f19379y;
    public final i1 e = y.B(new r2.x((String) null, 0, 7));

    /* renamed from: f, reason: collision with root package name */
    public r2.e0 f19322f = r2.d0.f24485u;

    public j1(k2 k2Var) {
        this.f19318a = k2Var;
        Boolean bool = Boolean.TRUE;
        this.f19328m = y.B(bool);
        this.f19329n = y.B(bool);
        this.f19330o = 0L;
        this.f19332q = 0L;
        this.f19333r = y.B(null);
        this.f19334s = y.B(null);
        this.f19335t = -1;
        this.f19336u = new r2.x((String) null, 0L, 7);
        this.f19338w = new f1(this, 1);
        this.f19339x = new z5.h(29, this);
    }

    public static final long a(j1 j1Var, r2.x xVar, long j10, boolean z3, boolean z9, s sVar, boolean z10) {
        g2 d2;
        int i;
        int i10;
        int i11;
        long j11;
        long j12;
        r rVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        r1.a aVar;
        int i12;
        e1 e1Var = j1Var.f19321d;
        if (e1Var != null && (d2 = e1Var.d()) != null) {
            r2.q qVar = j1Var.f19319b;
            long j13 = xVar.f24516b;
            m2.g gVar = xVar.f24515a;
            int i13 = m2.p0.f20545c;
            long b10 = m2.b(qVar.g((int) (j13 >> 32)), j1Var.f19319b.g((int) (j13 & 4294967295L)));
            int b11 = d2.b(j10, false);
            if (!z9 && !z3) {
                i = (int) (b10 >> 32);
            } else {
                i = b11;
            }
            if (z9 && !z3) {
                i10 = (int) (b10 & 4294967295L);
            } else {
                i10 = b11;
            }
            d1 d1Var = j1Var.f19337v;
            if (!z3 && d1Var != null && (i12 = j1Var.f19335t) != -1) {
                i11 = i12;
            } else {
                i11 = -1;
            }
            m2.m0 m0Var = d2.f17113a;
            if (z3) {
                j12 = j13;
                j11 = 4294967295L;
                rVar = null;
            } else {
                j11 = 4294967295L;
                int i14 = (int) (b10 >> 32);
                j12 = j13;
                q qVar2 = new q(v0.u(m0Var, i14), i14, 1L);
                int i15 = (int) (b10 & 4294967295L);
                rVar = new r(qVar2, new q(v0.u(m0Var, i15), i15, 1L), m2.f(b10));
            }
            d1 d1Var2 = new d1(z9, 1, 1, rVar, new p(1L, 1, i, i10, i11, m0Var));
            if (!d1Var2.f(d1Var)) {
                return j12;
            }
            j1Var.f19337v = d1Var2;
            j1Var.f19335t = b11;
            r a10 = sVar.a(d1Var2);
            long b12 = m2.b(j1Var.f19319b.c(a10.f19399a.f19393b), j1Var.f19319b.c(a10.f19400b.f19393b));
            long j14 = j12;
            if (m2.a(b12, j14)) {
                return j14;
            }
            boolean z16 = true;
            if (m2.f(b12) != m2.f(j14) && m2.a(m2.b((int) (b12 & j11), (int) (b12 >> 32)), j14)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m2.b(b12) && m2.b(j14)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 && gVar.f20477v.length() > 0 && !z11 && !z12 && (aVar = j1Var.f19326k) != null) {
                aVar.a(9);
            }
            j1Var.f19320c.invoke(c(gVar, b12));
            if (!z10) {
                j1Var.q(!m2.b(b12));
            }
            e1 e1Var2 = j1Var.f19321d;
            if (e1Var2 != null) {
                e1Var2.f17076q.setValue(Boolean.valueOf(z10));
            }
            e1 e1Var3 = j1Var.f19321d;
            if (e1Var3 != null) {
                if (!m2.b(b12) && v0.w(j1Var, true)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                e1Var3.f17072m.setValue(Boolean.valueOf(z15));
            }
            e1 e1Var4 = j1Var.f19321d;
            if (e1Var4 == null) {
                z13 = false;
            } else {
                if (!m2.b(b12)) {
                    z13 = false;
                    if (v0.w(j1Var, false)) {
                        z14 = true;
                        e1Var4.f17073n.setValue(Boolean.valueOf(z14));
                    }
                } else {
                    z13 = false;
                }
                z14 = z13;
                e1Var4.f17073n.setValue(Boolean.valueOf(z14));
            }
            e1 e1Var5 = j1Var.f19321d;
            if (e1Var5 == null) {
                return b12;
            }
            if (!m2.b(b12) || !v0.w(j1Var, true)) {
                z16 = z13;
            }
            e1Var5.f17074o.setValue(Boolean.valueOf(z16));
            return b12;
        }
        return m2.p0.f20544b;
    }

    public static r2.x c(m2.g gVar, long j10) {
        return new r2.x(gVar, j10, (m2.p0) null);
    }

    public final r1 b(boolean z3) {
        pf.z zVar = this.i;
        if (zVar == null) {
            return null;
        }
        return pf.x(zVar, null, new c7(this, z3, null), 1);
    }

    public final void d() {
        pf.z zVar = this.i;
        if (zVar != null) {
            pf.x(zVar, null, new g1(this, null, 0), 1);
        }
    }

    public final void e(b bVar) {
        s0 s0Var;
        g2 g2Var;
        int d2;
        if (!m2.b(k().f24516b)) {
            e1 e1Var = this.f19321d;
            if (e1Var != null) {
                g2Var = e1Var.d();
            } else {
                g2Var = null;
            }
            if (bVar != null && g2Var != null) {
                d2 = this.f19319b.c(g2Var.b(bVar.f18762a, true));
            } else {
                d2 = m2.d(k().f24516b);
            }
            this.f19320c.invoke(r2.a(k(), null, m2.b(d2, d2), 5));
        }
        if (bVar != null && k().f24515a.f20477v.length() > 0) {
            s0Var = s0.f17277w;
        } else {
            s0Var = s0.f17275u;
        }
        o(s0Var);
        q(false);
    }

    public final void f(boolean z3) {
        o oVar;
        e1 e1Var = this.f19321d;
        if (e1Var != null && !e1Var.b() && (oVar = this.f19327l) != null) {
            o.b(oVar);
        }
        this.f19336u = k();
        q(z3);
        o(s0.f17276v);
    }

    public final b g() {
        return (b) this.f19334s.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.f19328m.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.f19329n.getValue()).booleanValue();
    }

    public final long j(boolean z3) {
        g2 d2;
        m2.g gVar;
        long j10;
        e1 e1Var = this.f19321d;
        if (e1Var != null && (d2 = e1Var.d()) != null) {
            m2.m0 m0Var = d2.f17113a;
            e1 e1Var2 = this.f19321d;
            if (e1Var2 != null) {
                gVar = e1Var2.f17062a.f17232a;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                if (kotlin.jvm.internal.a(gVar.f20477v, m0Var.f20524a.f20514a.f20477v)) {
                    r2.x k3 = k();
                    if (z3) {
                        long j11 = k3.f24516b;
                        int i = m2.p0.f20545c;
                        j10 = j11 >> 32;
                    } else {
                        long j12 = k3.f24516b;
                        int i10 = m2.p0.f20545c;
                        j10 = j12 & 4294967295L;
                    }
                    return v0.t(m0Var, this.f19319b.g((int) j10), z3, m2.f(k().f24516b));
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    public final r2.x k() {
        return (r2.x) this.e.getValue();
    }

    public final void l() {
        p2 p2Var;
        o2 o2Var = this.f19325j;
        if (o2Var != null) {
            p2Var = ((c2.v0) o2Var).f3666d;
        } else {
            p2Var = null;
        }
        if (p2Var == p2.f3621u && o2Var != null) {
            c2.v0 v0Var = (c2.v0) o2Var;
            v0Var.f3666d = p2.f3622v;
            ActionMode actionMode = v0Var.f3664b;
            if (actionMode != null) {
                actionMode.finish();
            }
            v0Var.f3664b = null;
        }
    }

    public final void m() {
        pf.z zVar = this.i;
        if (zVar != null) {
            pf.x(zVar, null, new g1(this, null, 1), 1);
        }
    }

    public final void n() {
        r2.x c10 = c(k().f24515a, m2.b(0, k().f24515a.f20477v.length()));
        this.f19320c.invoke(c10);
        this.f19336u = r2.a(this.f19336u, null, c10.f24516b, 5);
        f(true);
    }

    public final void o(s0 s0Var) {
        e1 e1Var = this.f19321d;
        if (e1Var != null) {
            if (e1Var.a() == s0Var) {
                e1Var = null;
            }
            if (e1Var != null) {
                e1Var.f17070k.setValue(s0Var);
            }
        }
    }

    public final void p() {
        pf.z zVar = this.i;
        if (zVar != null) {
            pf.x(zVar, null, new a6.f(this, (te.c) null, 19), 1);
        }
    }

    public final void q(boolean z3) {
        e1 e1Var = this.f19321d;
        if (e1Var != null) {
            e1Var.f17071l.setValue(Boolean.valueOf(z3));
        }
        if (z3) {
            p();
        } else {
            l();
        }
    }
}
