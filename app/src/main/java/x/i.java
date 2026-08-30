package x;
import b0.n;
import l.c;

/* loaded from: classes.dex */
public final class i extends d1.q implements b2.x {
    public float I;

    @Override // b2.x
    public final int A(b2.r0 r0Var, z1.o0 o0Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.I);
        }
        return o0Var.c(i);
    }

    @Override // b2.x
    public final int J(b2.r0 r0Var, z1.o0 o0Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.I);
        }
        return o0Var.n(i);
    }

    public final long Y0(long j10, boolean z3) {
        int round;
        int g8 = y2.a.g(j10);
        if (g8 != Integer.MAX_VALUE && (round = Math.round(g8 * this.I)) > 0) {
            if (!z3 || androidx.compose.foundation.layout.a.f(j10, round, g8)) {
                return (round << 32) | (g8 & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long Z0(long j10, boolean z3) {
        int round;
        int h3 = y2.a.h(j10);
        if (h3 != Integer.MAX_VALUE && (round = Math.round(h3 / this.I)) > 0) {
            if (!z3 || androidx.compose.foundation.layout.a.f(j10, h3, round)) {
                return (h3 << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long a1(long j10, boolean z3) {
        int i = y2.a.i(j10);
        int round = Math.round(i * this.I);
        if (round > 0) {
            if (!z3 || androidx.compose.foundation.layout.a.f(j10, round, i)) {
                return (round << 32) | (i & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long b1(long j10, boolean z3) {
        int j11 = y2.a.j(j10);
        int round = Math.round(j11 / this.I);
        if (round > 0) {
            if (!z3 || androidx.compose.foundation.layout.a.f(j10, j11, round)) {
                return (j11 << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        boolean z3;
        boolean z9 = true;
        long Z0 = Z0(j10, true);
        if (y2.c(Z0, 0L)) {
            Z0 = Y0(j10, true);
            if (y2.c(Z0, 0L)) {
                Z0 = b1(j10, true);
                if (y2.c(Z0, 0L)) {
                    Z0 = a1(j10, true);
                    if (y2.c(Z0, 0L)) {
                        Z0 = Z0(j10, false);
                        if (y2.c(Z0, 0L)) {
                            Z0 = Y0(j10, false);
                            if (y2.c(Z0, 0L)) {
                                Z0 = b1(j10, false);
                                if (y2.c(Z0, 0L)) {
                                    Z0 = a1(j10, false);
                                    if (y2.c(Z0, 0L)) {
                                        Z0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!y2.c(Z0, 0L)) {
            int i = (int) (Z0 >> 32);
            int i10 = (int) (Z0 & 4294967295L);
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i10 < 0) {
                z9 = false;
            }
            if (!(z9 & z3)) {
                y2.i.a("width and height must be >= 0");
            }
            j10 = y2.b.h(i, i, i10, i10);
        }
        z1.a1 z10 = o0Var.z(j10);
        return r0Var.u0(z10.f31769u, z10.f31770v, qe.t.f24024u, new n(z10, 10));
    }

    @Override // b2.x
    public final int n(b2.r0 r0Var, z1.o0 o0Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.I);
        }
        return o0Var.Z(i);
    }

    @Override // b2.x
    public final int v(b2.r0 r0Var, z1.o0 o0Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.I);
        }
        return o0Var.l(i);
    }
}
