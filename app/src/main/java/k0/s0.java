package k0;
import g0.e1;
import g0.p1;
import g0.r0;
import j1.a;
import j1.b;
import r0.i1;

import g0.g2;

/* loaded from: classes.dex */
public final class s0 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19404a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19406c;

    public s0(j1 j1Var, boolean z3) {
        this.f19406c = j1Var;
        this.f19405b = z3;
    }

    @Override // p1
    public final void a(long j10) {
        q qVar;
        switch (this.f19404a) {
            case 0:
                t0 t0Var = (t0) this.f19406c;
                if (t0Var.d() != null) {
                    r e = t0Var.e();
                    e.getClass();
                    boolean z3 = this.f19405b;
                    if (z3) {
                        qVar = e.f19399a;
                    } else {
                        qVar = e.f19400b;
                    }
                    Object e8 = t0Var.f19413a.f19219c.e(qVar.f19394c);
                    if (e8 != null) {
                        n nVar = (n) e8;
                        z1.x c10 = nVar.c();
                        if (c10 != null) {
                            long a10 = nVar.a(e, z3);
                            if ((9223372034707292159L & a10) != 9205357640488583168L) {
                                t0Var.f19422l.setValue(new b(t0Var.j().d(c10, l0.a(a10))));
                                t0Var.f19423m.setValue(new b(0L));
                                return;
                            }
                            return;
                        }
                        a.d("Current selectable should have layout coordinates.");
                        l4.a.p();
                        return;
                    }
                    a.d("SelectionRegistrar should contain the current selection's selectableIds");
                    l4.a.p();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // p1
    public final void b() {
        switch (this.f19404a) {
            case 0:
                t0 t0Var = (t0) this.f19406c;
                t0Var.f19429s = true;
                t0Var.p();
                t0Var.f19426p.setValue(null);
                t0Var.f19427q.setValue(null);
                return;
            default:
                j1 j1Var = (j1) this.f19406c;
                j1Var.f19333r.setValue(null);
                j1Var.f19334s.setValue(null);
                j1Var.q(true);
                return;
        }
    }

    @Override // p1
    public final void c() {
        b bVar;
        r e;
        q qVar;
        z1.x c10;
        r0 r0Var;
        r0 r0Var2;
        g2 d2;
        switch (this.f19404a) {
            case 0:
                t0 t0Var = (t0) this.f19406c;
                boolean z3 = this.f19405b;
                if (z3) {
                    bVar = (b) t0Var.f19424n.getValue();
                } else {
                    bVar = (b) t0Var.f19425o.getValue();
                }
                if (bVar != null && (e = t0Var.e()) != null) {
                    if (z3) {
                        qVar = e.f19399a;
                    } else {
                        qVar = e.f19400b;
                    }
                    n c11 = t0Var.c(qVar);
                    if (c11 != null && (c10 = c11.c()) != null) {
                        long a10 = c11.a(e, z3);
                        if ((9223372034707292159L & a10) != 9205357640488583168L) {
                            t0Var.f19427q.setValue(new b(t0Var.j().d(c10, l0.a(a10))));
                            if (z3) {
                                r0Var = r0.f17269v;
                            } else {
                                r0Var = r0.f17270w;
                            }
                            t0Var.f19426p.setValue(r0Var);
                            t0Var.f19429s = false;
                            t0Var.p();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                j1 j1Var = (j1) this.f19406c;
                boolean z9 = this.f19405b;
                if (z9) {
                    r0Var2 = r0.f17269v;
                } else {
                    r0Var2 = r0.f17270w;
                }
                j1Var.f19333r.setValue(r0Var2);
                long a11 = l0.a(j1Var.j(z9));
                e1 e1Var = j1Var.f19321d;
                if (e1Var != null && (d2 = e1Var.d()) != null) {
                    long e8 = d2.e(a11);
                    j1Var.f19330o = e8;
                    j1Var.f19334s.setValue(new b(e8));
                    j1Var.f19332q = 0L;
                    j1Var.f19335t = -1;
                    e1 e1Var2 = j1Var.f19321d;
                    if (e1Var2 != null) {
                        e1Var2.f17076q.setValue(Boolean.TRUE);
                    }
                    j1Var.q(false);
                    return;
                }
                return;
        }
    }

    @Override // p1
    public final void d(long j10) {
        switch (this.f19404a) {
            case 0:
                t0 t0Var = (t0) this.f19406c;
                i1 i1Var = t0Var.f19422l;
                i1 i1Var2 = t0Var.f19423m;
                if (t0Var.d() != null) {
                    i1Var2.setValue(new b(b.h(((b) i1Var2.getValue()).f18762a, j10)));
                    long h3 = b.h(((b) i1Var.getValue()).f18762a, ((b) i1Var2.getValue()).f18762a);
                    if (t0Var.o(h3, ((b) i1Var.getValue()).f18762a, this.f19405b, t.f19411g)) {
                        i1Var.setValue(new b(h3));
                        i1Var2.setValue(new b(0L));
                        return;
                    }
                    return;
                }
                return;
            default:
                j1 j1Var = (j1) this.f19406c;
                long h10 = b.h(j1Var.f19332q, j10);
                j1Var.f19332q = h10;
                j1Var.f19334s.setValue(new b(b.h(j1Var.f19330o, h10)));
                r2.x k3 = j1Var.k();
                b g8 = j1Var.g();
                g8.getClass();
                a(j1Var, k3, g8.f18762a, false, this.f19405b, t.f19411g, true);
                j1Var.q(false);
                return;
        }
    }

    @Override // p1
    public final void onCancel() {
        switch (this.f19404a) {
            case 0:
                t0 t0Var = (t0) this.f19406c;
                t0Var.f19429s = true;
                t0Var.p();
                t0Var.f19426p.setValue(null);
                t0Var.f19427q.setValue(null);
                return;
            default:
                return;
        }
    }

    @Override // p1
    public final void onStop() {
        switch (this.f19404a) {
            case 0:
                t0 t0Var = (t0) this.f19406c;
                t0Var.f19429s = true;
                t0Var.p();
                t0Var.f19426p.setValue(null);
                t0Var.f19427q.setValue(null);
                return;
            default:
                j1 j1Var = (j1) this.f19406c;
                j1Var.f19333r.setValue(null);
                j1Var.f19334s.setValue(null);
                j1Var.q(true);
                return;
        }
    }

    public s0(boolean z3, t0 t0Var) {
        this.f19405b = z3;
        this.f19406c = t0Var;
    }

    private final void e() {
    }

    private final void f(long j10) {
    }
}
