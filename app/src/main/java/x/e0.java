package x;
import b0.n;

/* loaded from: classes.dex */
public final class e0 extends d1.q implements b2.x {
    public d0 I;
    public boolean J;

    @Override // b2.x
    public final int A(b2.r0 r0Var, z1.o0 o0Var, int i) {
        return o0Var.c(i);
    }

    @Override // b2.x
    public final int J(b2.r0 r0Var, z1.o0 o0Var, int i) {
        if (this.I == d0.f29952u) {
            return o0Var.l(i);
        }
        return o0Var.n(i);
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        int n10;
        if (this.I == d0.f29952u) {
            n10 = o0Var.l(y2.a.g(j10));
        } else {
            n10 = o0Var.n(y2.a.g(j10));
        }
        if (n10 < 0) {
            n10 = 0;
        }
        if (n10 < 0) {
            y2.i.a("width must be >= 0");
        }
        long h3 = y2.b.h(n10, n10, 0, Integer.MAX_VALUE);
        if (this.J) {
            h3 = y2.b.e(j10, h3);
        }
        z1.a1 z3 = o0Var.z(h3);
        return r0Var.u0(z3.f31769u, z3.f31770v, qe.t.f24024u, new n(z3, 12));
    }

    @Override // b2.x
    public final int n(b2.r0 r0Var, z1.o0 o0Var, int i) {
        return o0Var.Z(i);
    }

    @Override // b2.x
    public final int v(b2.r0 r0Var, z1.o0 o0Var, int i) {
        if (this.I == d0.f29952u) {
            return o0Var.l(i);
        }
        return o0Var.n(i);
    }
}
