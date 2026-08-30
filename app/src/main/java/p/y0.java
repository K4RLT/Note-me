package p;
import x.n;
import b1.a;
import d1.q;
import j1.c;
import n1.b;
import q.x;

import wa.s8;
import ya.vd;

/* loaded from: classes.dex */
public final class y0 extends q implements b2.n, a2.e, b2.x {
    public b1 I;
    public b J;
    public final a2.h K;

    public y0(b1 b1Var) {
        this.I = b1Var;
        this.J = (b) b1Var.G.getValue();
        a2.g gVar = z0.f22298a;
        a2.h hVar = new a2.h(gVar);
        hVar.c(gVar, b1Var);
        this.K = hVar;
    }

    public static final void Y0(y0 y0Var, z1.x xVar) {
        a1 e = y0Var.I.e();
        z1.x xVar2 = y0Var.I.e().f22094b.A;
        if (xVar2 != null) {
            long d2 = xVar2.d(xVar, 0L);
            float k3 = (int) (xVar.k() >> 32);
            float k4 = (int) (xVar.k() & 4294967295L);
            e.e.setValue(s8.a(d2, (Float.floatToRawIntBits(k3) << 32) | (Float.floatToRawIntBits(k4) & 4294967295L)));
            return;
        }
        kotlin.jvm.internal.l.h("root");
        throw null;
    }

    @Override // q
    public final void Q0() {
        a2.g gVar = z0.f22298a;
        u(gVar, this.I);
        this.I.F = (b1) b(gVar);
        b1(((c2.x) b2.l.v(this)).getGraphicsContext().b());
        this.I.E = new x0(this, 0);
    }

    @Override // q
    public final void R0() {
        b1(null);
        b1 b1Var = this.I;
        b1Var.F = null;
        b1Var.E = j0.f22183w;
    }

    @Override // q
    public final void S0() {
        b bVar = this.J;
        if (bVar != null) {
            ((c2.x) b2.l.v(this)).getGraphicsContext().a(bVar);
        }
        b1(((c2.x) b2.l.v(this)).getGraphicsContext().b());
    }

    public final z1.q0 Z0(z1.g gVar, z1.o0 o0Var, long j10) {
        boolean z3;
        if (this.I.e().b()) {
            c c10 = this.I.c().c();
            if (c10 == null) {
                c10 = this.I.e().a();
            }
            if (c10 != null) {
                long b10 = vd.b(c10.c());
                int i = (int) (b10 >> 32);
                int i10 = (int) (b10 & 4294967295L);
                if (i != Integer.MAX_VALUE && i10 != Integer.MAX_VALUE) {
                    boolean z9 = false;
                    if (i < 0) {
                        i = 0;
                    }
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    if (i >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i10 >= 0) {
                        z9 = true;
                    }
                    if (!(z9 & z3)) {
                        y2.i.a("width and height must be >= 0");
                    }
                    j10 = y2.b.h(i, i, i10, i10);
                } else {
                    StringBuilder sb2 = new StringBuilder("Error: Infinite width/height is invalid. animated bounds: ");
                    sb2.append(this.I.c().c());
                    l4.a.l(sb2, ", current bounds: ", this.I.e().a());
                    return null;
                }
            }
        }
        z1.a1 z10 = o0Var.z(j10);
        boolean b11 = this.I.e().b();
        qe.t tVar = qe.t.f24024u;
        if (!b11) {
            return gVar.u0(z10.f31769u, z10.f31770v, tVar, new w0(this, z10, 0));
        }
        e1 e1Var = (e1) this.I.f22111z.getValue();
        long k3 = a1().k();
        e1Var.a(k3, (z10.f31769u << 32) | (z10.f31770v & 4294967295L));
        return gVar.u0((int) (k3 >> 32), (int) (k3 & 4294967295L), tVar, new w0(this, z10, 1));
    }

    public final z1.x a1() {
        j1 j1Var = this.I.e().f22094b;
        return j1Var.f22189v.b(b2.l.t(this));
    }

    public final void b1(b bVar) {
        if (bVar == null) {
            b bVar2 = this.J;
            if (bVar2 != null) {
                ((c2.x) b2.l.v(this)).getGraphicsContext().a(bVar2);
            }
        } else {
            this.I.G.setValue(bVar);
        }
        this.J = bVar;
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        z1.a1 z3 = o0Var.z(j10);
        float f10 = z3.f31769u;
        float f11 = z3.f31770v;
        return r0Var.u0(z3.f31769u, z3.f31770v, qe.t.f24024u, new m(z3, this, (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)));
    }

    @Override // b2.n
    public final void e0(b2.l0 l0Var) {
        f1 f1Var;
        b1 b1Var = this.I;
        b1Var.f22106u = true;
        l1 l1Var = (l1) b1Var.B.getValue();
        f1 f1Var2 = (f1) this.I.C.getValue();
        this.I.e().a().getClass();
        l0Var.getLayoutDirection();
        y2.c cVar = b2.l.u(this).S;
        l1Var.getClass();
        b1 b1Var2 = (b1) f1Var2.f22145b.getValue();
        if (b1Var2 != null) {
            b1 b1Var3 = b1Var2.F;
            k1.i0 i0Var = null;
            if (b1Var3 != null) {
                f1Var = (f1) b1Var3.C.getValue();
            } else {
                f1Var = null;
            }
            if (f1Var != null) {
                b1 b1Var4 = (b1) f1Var.f22145b.getValue();
                if (b1Var4 != null) {
                    i0Var = b1Var4.D;
                } else {
                    x.n("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
                    return;
                }
            }
            b1Var.D = i0Var;
            b bVar = (b) this.I.G.getValue();
            if (bVar != null) {
                c0 c0Var = new c0(2, l0Var);
                long e = l0Var.f1533u.e();
                bVar.e(l0Var, l0Var.getLayoutDirection(), (((int) Float.intBitsToFloat((int) (e >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (e & 4294967295L))) & 4294967295L), new b2.k0(0, l0Var, l0Var.f1534v, c0Var));
                b1 b1Var5 = this.I;
                if (b1Var5.e().b() && (b1Var5.g() || !b1Var5.f())) {
                    return;
                }
                ya.a(l0Var, bVar);
                return;
            }
            StringBuilder sb2 = new StringBuilder("Error: Layer is null when accessed for shared bounds/element : ");
            sb2.append((Object) this.I.e().f22093a);
            boolean b10 = this.I.c().b();
            boolean z3 = this.H;
            sb2.append(",target: ");
            sb2.append(b10);
            sb2.append(", is attached: ");
            sb2.append(z3);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        x.n("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
    }

    @Override // a2.e
    public final bc.b f0() {
        return this.K;
    }
}
