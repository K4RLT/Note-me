package z1;
import b0.n;
import d1.q;

import b2.j2;

/* loaded from: classes.dex */
public final class f1 extends q implements b2.x, j2 {
    public s I;
    public final e1 J;

    public f1(s sVar) {
        this.I = sVar;
        this.J = new e1(this, sVar);
    }

    @Override // b2.x
    public final q0 c(r0 r0Var, o0 o0Var, long j10) {
        a1 z3 = o0Var.z(j10);
        return r0Var.y(z3.f31769u, z3.f31770v, qe.t.f24024u, this.J, new n(z3, 16));
    }

    @Override // b2.j2
    public final Object j() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
