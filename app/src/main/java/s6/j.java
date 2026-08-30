package s6;
import b.a;

import b2.x;
import qe.t;
import ya.vd;
import z1.a1;
import z1.o0;
import z1.q0;
import z1.r0;

/* loaded from: classes.dex */
public final class j extends d1.q implements x {
    public int I;
    public int J;

    @Override // b2.x
    public final q0 c(r0 r0Var, o0 o0Var, long j10) {
        long a10;
        o0Var.getClass();
        long d2 = y2.b.d(j10, vd.a(this.I, this.J));
        if (y2.a.g(j10) == Integer.MAX_VALUE && y2.a.h(j10) != Integer.MAX_VALUE) {
            int i = (int) (d2 >> 32);
            int i10 = (this.J * i) / this.I;
            a10 = y2.a(i, i, i10, i10);
        } else if (y2.a.h(j10) == Integer.MAX_VALUE && y2.a.g(j10) != Integer.MAX_VALUE) {
            int i11 = (int) (d2 & 4294967295L);
            int i12 = (this.I * i11) / this.J;
            a10 = y2.a(i12, i12, i11, i11);
        } else {
            int i13 = (int) (d2 >> 32);
            int i14 = (int) (d2 & 4294967295L);
            a10 = y2.a(i13, i13, i14, i14);
        }
        a1 z3 = o0Var.z(a10);
        return r0Var.u0(z3.f31769u, z3.f31770v, t.f24024u, new b0.n(z3, 9));
    }
}
