package x;
import b.a;
import b0.n;

/* loaded from: classes.dex */
public final class t0 extends d1.q implements b2.x {
    public float I;
    public float J;

    @Override // b2.x
    public final int A(b2.r0 r0Var, z1.o0 o0Var, int i) {
        int i10;
        int c10 = o0Var.c(i);
        if (!Float.isNaN(this.J)) {
            i10 = r0Var.t0(this.J);
        } else {
            i10 = 0;
        }
        if (c10 < i10) {
            return i10;
        }
        return c10;
    }

    @Override // b2.x
    public final int J(b2.r0 r0Var, z1.o0 o0Var, int i) {
        int i10;
        int n10 = o0Var.n(i);
        if (!Float.isNaN(this.I)) {
            i10 = r0Var.t0(this.I);
        } else {
            i10 = 0;
        }
        if (n10 < i10) {
            return i10;
        }
        return n10;
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        int j11;
        int i;
        int i10 = 0;
        if (!Float.isNaN(this.I) && y2.a.j(j10) == 0) {
            int t02 = r0Var.t0(this.I);
            j11 = y2.a.h(j10);
            if (t02 < 0) {
                t02 = 0;
            }
            if (t02 <= j11) {
                j11 = t02;
            }
        } else {
            j11 = y2.a.j(j10);
        }
        int h3 = y2.a.h(j10);
        if (!Float.isNaN(this.J) && y2.a.i(j10) == 0) {
            int t03 = r0Var.t0(this.J);
            i = y2.a.g(j10);
            if (t03 >= 0) {
                i10 = t03;
            }
            if (i10 <= i) {
                i = i10;
            }
        } else {
            i = y2.a.i(j10);
        }
        z1.a1 z3 = o0Var.z(y2.a(j11, h3, i, y2.a.g(j10)));
        return r0Var.u0(z3.f31769u, z3.f31770v, qe.t.f24024u, new n(z3, 14));
    }

    @Override // b2.x
    public final int n(b2.r0 r0Var, z1.o0 o0Var, int i) {
        int i10;
        int Z = o0Var.Z(i);
        if (!Float.isNaN(this.J)) {
            i10 = r0Var.t0(this.J);
        } else {
            i10 = 0;
        }
        if (Z < i10) {
            return i10;
        }
        return Z;
    }

    @Override // b2.x
    public final int v(b2.r0 r0Var, z1.o0 o0Var, int i) {
        int i10;
        int l10 = o0Var.l(i);
        if (!Float.isNaN(this.I)) {
            i10 = r0Var.t0(this.I);
        } else {
            i10 = 0;
        }
        if (l10 < i10) {
            return i10;
        }
        return l10;
    }
}
