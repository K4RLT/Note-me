package k1;
import k0.w;

import b2.e2;
import z1.a1;

/* loaded from: classes.dex */
public final class m extends d1.q implements b2.x, e2 {
    public df.l I;

    public m(df.l lVar) {
        this.I = lVar;
    }

    @Override // d1.q
    public final boolean N0() {
        return false;
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        a1 z3 = o0Var.z(j10);
        return r0Var.u0(z3.f31769u, z3.f31770v, qe.t.f24024u, new w(z3, 3, this));
    }

    @Override // b2.e2
    public final boolean g() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.I + ')';
    }

    @Override // b2.e2
    public final void F0(j2.j jVar) {
    }
}
