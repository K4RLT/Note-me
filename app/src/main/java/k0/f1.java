package k0;
import g0.b;
import g0.e1;
import g0.p1;
import g0.r0;
import g0.s0;
import j1.a;
import j1.b;
import j1.c;
import p0.a;
import p0.b;
import r0.i1;
import t.e;
import x.a;

import g0.g2;

/* loaded from: classes.dex */
public final class f1 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f19282b;

    public /* synthetic */ f1(j1 j1Var, int i) {
        this.f19281a = i;
        this.f19282b = j1Var;
    }

    @Override // p1
    public final void a(long j10) {
        g2 d2;
        j1 j1Var;
        long j11;
        g2 d10;
        g2 d11;
        switch (this.f19281a) {
            case 0:
                j1 j1Var2 = this.f19282b;
                long a10 = l0.a(j1Var2.j(true));
                e1 e1Var = j1Var2.f19321d;
                if (e1Var != null && (d2 = e1Var.d()) != null) {
                    long e = d2.e(a10);
                    j1Var2.f19330o = e;
                    j1Var2.f19334s.setValue(new b(e));
                    j1Var2.f19332q = 0L;
                    j1Var2.f19333r.setValue(r0.f17268u);
                    j1Var2.q(false);
                    return;
                }
                return;
            default:
                j1 j1Var3 = this.f19282b;
                i1 i1Var = j1Var3.f19333r;
                if (j1Var3.i() && ((r0) i1Var.getValue()) == null) {
                    i1Var.setValue(r0.f17270w);
                    j1Var3.f19335t = -1;
                    j1Var3.l();
                    e1 e1Var2 = j1Var3.f19321d;
                    if (e1Var2 != null && (d11 = e1Var2.d()) != null && d11.c(j10)) {
                        if (j1Var3.k().f24515a.f20477v.length() != 0) {
                            j1Var3.f(false);
                            j1Var = j1Var3;
                            j11 = j10;
                            j1Var.f19331p = Integer.valueOf((int) (a(j1Var3, r2.a(j1Var3.k(), null, m2.p0.f20544b, 5), j10, true, false, e, true) >> 32));
                        } else {
                            return;
                        }
                    } else {
                        j1Var = j1Var3;
                        j11 = j10;
                        e1 e1Var3 = j1Var.f19321d;
                        if (e1Var3 != null && (d10 = e1Var3.d()) != null) {
                            int c10 = j1Var.f19319b.c(d10.b(j11, true));
                            r2.x c11 = c(j1Var.k().f24515a, m2.b(c10, c10));
                            j1Var.f(false);
                            r1.a aVar = j1Var.f19326k;
                            if (aVar != null) {
                                aVar.a(9);
                            }
                            j1Var.f19320c.invoke(c11);
                        }
                    }
                    j1Var.o(s0.f17275u);
                    j1Var.f19330o = j11;
                    j1Var.f19334s.setValue(new b(j11));
                    j1Var.f19332q = 0L;
                    return;
                }
                return;
        }
    }

    @Override // p1
    public final void b() {
        switch (this.f19281a) {
            case 0:
                j1 j1Var = this.f19282b;
                j1Var.f19333r.setValue(null);
                j1Var.f19334s.setValue(null);
                return;
            default:
                return;
        }
    }

    @Override // p1
    public final void c() {
        int i = this.f19281a;
    }

    @Override // p1
    public final void d(long j10) {
        g2 d2;
        r1.a aVar;
        g2 d10;
        int b10;
        switch (this.f19281a) {
            case 0:
                j1 j1Var = this.f19282b;
                j1Var.f19332q = b.h(j1Var.f19332q, j10);
                e1 e1Var = j1Var.f19321d;
                if (e1Var != null && (d2 = e1Var.d()) != null) {
                    j1Var.f19334s.setValue(new b(b.h(j1Var.f19330o, j1Var.f19332q)));
                    r2.q qVar = j1Var.f19319b;
                    b g8 = j1Var.g();
                    g8.getClass();
                    int c10 = qVar.c(d2.b(g8.f18762a, true));
                    long b11 = m2.b(c10, c10);
                    if (!m2.a(b11, j1Var.k().f24516b)) {
                        e1 e1Var2 = j1Var.f19321d;
                        if ((e1Var2 == null || ((Boolean) e1Var2.f17076q.getValue()).booleanValue()) && (aVar = j1Var.f19326k) != null) {
                            aVar.a(9);
                        }
                        j1Var.f19320c.invoke(c(j1Var.k().f24515a, b11));
                        return;
                    }
                    return;
                }
                return;
            default:
                s sVar = e;
                j1 j1Var2 = this.f19282b;
                if (j1Var2.i() && j1Var2.k().f24515a.f20477v.length() != 0) {
                    j1Var2.f19332q = b.h(j1Var2.f19332q, j10);
                    e1 e1Var3 = j1Var2.f19321d;
                    if (e1Var3 != null && (d10 = e1Var3.d()) != null) {
                        j1Var2.f19334s.setValue(new b(b.h(j1Var2.f19330o, j1Var2.f19332q)));
                        if (j1Var2.f19331p == null) {
                            b g10 = j1Var2.g();
                            g10.getClass();
                            if (!d10.c(g10.f18762a)) {
                                int c11 = j1Var2.f19319b.c(d10.b(j1Var2.f19330o, true));
                                r2.q qVar2 = j1Var2.f19319b;
                                b g11 = j1Var2.g();
                                g11.getClass();
                                if (c11 == qVar2.c(d10.b(g11.f18762a, true))) {
                                    sVar = t.f19409d;
                                }
                                r2.x k3 = j1Var2.k();
                                b g12 = j1Var2.g();
                                g12.getClass();
                                a(j1Var2, k3, g12.f18762a, false, false, sVar, true);
                                int i = m2.p0.f20545c;
                            }
                        }
                        Integer num = j1Var2.f19331p;
                        if (num != null) {
                            b10 = num.intValue();
                        } else {
                            b10 = d10.b(j1Var2.f19330o, false);
                        }
                        b g13 = j1Var2.g();
                        g13.getClass();
                        int b12 = d10.b(g13.f18762a, false);
                        if (j1Var2.f19331p != null || b10 != b12) {
                            r2.x k4 = j1Var2.k();
                            b g14 = j1Var2.g();
                            g14.getClass();
                            a(j1Var2, k4, g14.f18762a, false, false, sVar, true);
                            int i10 = m2.p0.f20545c;
                        } else {
                            return;
                        }
                    }
                    j1Var2.q(false);
                    return;
                }
                return;
        }
    }

    public void h() {
        s0 s0Var;
        boolean z3;
        boolean z9;
        j1 j1Var = this.f19282b;
        j1Var.f19333r.setValue(null);
        j1Var.f19334s.setValue(null);
        boolean z10 = true;
        j1Var.q(true);
        j1Var.f19331p = null;
        boolean b10 = m2.b(j1Var.k().f24516b);
        if (b10) {
            s0Var = s0.f17277w;
        } else {
            s0Var = s0.f17276v;
        }
        j1Var.o(s0Var);
        e1 e1Var = j1Var.f19321d;
        if (e1Var != null) {
            if (!b10 && v0.w(j1Var, true)) {
                z9 = true;
            } else {
                z9 = false;
            }
            e1Var.f17072m.setValue(Boolean.valueOf(z9));
        }
        e1 e1Var2 = j1Var.f19321d;
        if (e1Var2 != null) {
            if (!b10 && v0.w(j1Var, false)) {
                z3 = true;
            } else {
                z3 = false;
            }
            e1Var2.f17073n.setValue(Boolean.valueOf(z3));
        }
        e1 e1Var3 = j1Var.f19321d;
        if (e1Var3 == null) {
            return;
        }
        if (!b10 || !v0.w(j1Var, true)) {
            z10 = false;
        }
        e1Var3.f17074o.setValue(Boolean.valueOf(z10));
    }

    @Override // p1
    public final void onCancel() {
        switch (this.f19281a) {
            case 0:
                return;
            default:
                h();
                return;
        }
    }

    @Override // p1
    public final void onStop() {
        switch (this.f19281a) {
            case 0:
                j1 j1Var = this.f19282b;
                j1Var.f19333r.setValue(null);
                j1Var.f19334s.setValue(null);
                return;
            default:
                h();
                return;
        }
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void i() {
    }
}
