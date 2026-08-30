package p;
import d1.q;
import q.b1;
import q.c1;
import r0.a1;

/* loaded from: classes.dex */
public final class o extends u0 {
    public c1 I;
    public a1 J;
    public p K;
    public long L;

    @Override // q
    public final void S0() {
        this.L = androidx.compose.animation.a.f422a;
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        long j11;
        z1.a1 z3 = o0Var.z(j10);
        if (r0Var.j0()) {
            j11 = (z3.f31769u << 32) | (z3.f31770v & 4294967295L);
        } else {
            c1 c1Var = this.I;
            int i = z3.f31769u;
            if (c1Var == null) {
                j11 = (i << 32) | (z3.f31770v & 4294967295L);
                this.L = j11;
            } else {
                long j12 = (z3.f31770v & 4294967295L) | (i << 32);
                b1 a10 = c1Var.a(new n(this, j12, 0), new n(this, j12, 1));
                this.K.getClass();
                j11 = ((y2.l) a10.getValue()).f30813a;
                this.L = ((y2.l) a10.getValue()).f30813a;
            }
        }
        return r0Var.u0((int) (j11 >> 32), (int) (4294967295L & j11), qe.t.f24024u, new m(this, z3, j11));
    }
}
