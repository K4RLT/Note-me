package c2;
import a0.o;
import b2.k1;
import d1.q;
import g2.a;
import j1.c;
import k1.l0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class g1 extends q implements a {
    public ViewGroup I;

    @Override // a
    public final Object K0(k1 k1Var, o oVar, ve.c cVar) {
        c cVar2;
        long W = k1Var.W(0L);
        c cVar3 = (c) oVar.invoke();
        if (cVar3 != null) {
            cVar2 = cVar3.i(W);
        } else {
            cVar2 = null;
        }
        if (cVar2 != null) {
            this.I.requestRectangleOnScreen(l0.B(cVar2), false);
        }
        return pe.z.f22715a;
    }
}
