package x;
import b.a;
import b0.n;

/* loaded from: classes.dex */
public final class w extends d1.q implements b2.x {
    public u I;
    public float J;

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        int j11;
        int h3;
        int g8;
        int i;
        if (y2.a.d(j10) && this.I != u.f30003u) {
            int round = Math.round(y2.a.h(j10) * this.J);
            int j12 = y2.a.j(j10);
            j11 = y2.a.h(j10);
            if (round < j12) {
                round = j12;
            }
            if (round <= j11) {
                j11 = round;
            }
            h3 = j11;
        } else {
            j11 = y2.a.j(j10);
            h3 = y2.a.h(j10);
        }
        if (y2.a.c(j10) && this.I != u.f30004v) {
            int round2 = Math.round(y2.a.g(j10) * this.J);
            int i10 = y2.a.i(j10);
            i = y2.a.g(j10);
            if (round2 < i10) {
                round2 = i10;
            }
            if (round2 <= i) {
                i = round2;
            }
            g8 = i;
        } else {
            int i11 = y2.a.i(j10);
            g8 = y2.a.g(j10);
            i = i11;
        }
        z1.a1 z3 = o0Var.z(y2.a(j11, h3, i, g8));
        return r0Var.u0(z3.f31769u, z3.f31770v, qe.t.f24024u, new n(z3, 11));
    }
}
