package d0;

import a0.o;
import b2.k1;
import b2.l;
import b2.w;
import c0.h;
import d1.q;
import pe.z;
import pf.b0;
import t.i;
import z1.x;

/* loaded from: classes.dex */
public final class f extends q implements g2.a, w {
    public i I;
    public boolean J;

    public static final j1.c Y0(f fVar, k1 k1Var, o oVar) {
        j1.c cVar;
        if (fVar.H && fVar.J) {
            k1 t3 = l.t(fVar);
            if (!k1Var.h1().H) {
                k1Var = null;
            }
            if (k1Var != null && (cVar = (j1.c) oVar.invoke()) != null) {
                return cVar.i(t3.u(k1Var, false).d());
            }
        }
        return null;
    }

    @Override // g2.a
    public final Object K0(k1 k1Var, o oVar, ve.c cVar) {
        Object i = b0.i(new e(this, k1Var, oVar, new h(2, this, k1Var, oVar), null, 0), cVar);
        if (i == ue.a.f27192u) {
            return i;
        }
        return z.f22715a;
    }

    @Override // d1.q
    public final boolean N0() {
        return false;
    }

    @Override // b2.w
    public final void f(x xVar) {
        this.J = true;
    }
}
