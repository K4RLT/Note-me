package x;
import b.a;

import wa.b9;

/* loaded from: classes.dex */
public final class b1 extends d1.q implements b2.x {
    public u I;
    public kotlin.jvm.internal.m J;

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        int j11;
        int i = 0;
        if (this.I != u.f30003u) {
            j11 = 0;
        } else {
            j11 = y2.a.j(j10);
        }
        if (this.I == u.f30004v) {
            i = y2.a.i(j10);
        }
        z1.a1 z3 = o0Var.z(y2.a(j11, y2.a.h(j10), i, y2.a.g(j10)));
        int e = b9.e(z3.f31769u, y2.a.j(j10), y2.a.h(j10));
        int e8 = b9.e(z3.f31770v, y2.a.i(j10), y2.a.g(j10));
        return r0Var.u0(e, e8, qe.t.f24024u, new a1(this, e, z3, e8, r0Var));
    }
}
