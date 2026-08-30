package i0;

import b2.k1;
import g0.e1;
import k0.j1;
import r0.i1;
import r0.y;

/* loaded from: classes.dex */
public final class n extends d1.q implements b2.i, b2.o {
    public c I;
    public e1 J;
    public j1 K;
    public final i1 L = y.B(null);

    public n(c cVar, e1 e1Var, j1 j1Var) {
        this.I = cVar;
        this.J = e1Var;
        this.K = j1Var;
    }

    @Override // d1.q
    public final void Q0() {
        c cVar = this.I;
        if (cVar.f18036a != null) {
            w.a.c("Expected textInputModifierNode to be null");
        }
        cVar.f18036a = this;
    }

    @Override // d1.q
    public final void R0() {
        this.I.k(this);
    }

    @Override // b2.o
    public final void h0(k1 k1Var) {
        this.L.setValue(k1Var);
    }
}
