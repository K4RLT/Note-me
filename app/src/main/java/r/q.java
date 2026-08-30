package r;
import b0.i;
import p.c0;
import r.d;
import t.c1;

import android.view.KeyEvent;
import t.k2;

/* loaded from: classes.dex */
public class q extends d {
    @Override // d
    public final Object c1(v1.w wVar, te.c cVar) {
        p pVar = new p(this, null, 0);
        c0 c0Var = new c0(7, this);
        s6.r rVar = k2.f25444a;
        Object i = pf.i(new b8.a1(wVar, pVar, c0Var, new c1(wVar), (te.c) null), cVar);
        pe.z zVar = pe.z.f22715a;
        ue.a aVar = ue.a.f27192u;
        if (i != aVar) {
            i = zVar;
        }
        if (i == aVar) {
            return i;
        }
        return zVar;
    }

    @Override // d
    public final boolean g1(KeyEvent keyEvent) {
        return false;
    }

    @Override // d
    public final void h1(KeyEvent keyEvent) {
        this.P.invoke();
    }
}
