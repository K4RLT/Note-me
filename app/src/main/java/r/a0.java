package r;
import d1.q;
import j1.c;
import t0.e;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 extends q implements b2.o {
    public Rect I;

    @Override // q
    public final void R0() {
        Y0(null);
    }

    public final void Y0(Rect rect) {
        List systemGestureExclusionRects;
        e eVar = new e(new Rect[16]);
        systemGestureExclusionRects = b2.l.w(this).getSystemGestureExclusionRects();
        eVar.c(eVar.f25619w, systemGestureExclusionRects);
        Rect rect2 = this.I;
        if (rect2 != null) {
            eVar.m(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            eVar.b(rect);
        }
        b2.l.w(this).setSystemGestureExclusionRects(eVar.i());
        this.I = rect;
    }

    @Override // b2.o
    public final void h0(b2.k1 k1Var) {
        c u9 = z1.h1.i(k1Var).u(k1Var, true);
        Y0(new Rect(ff.a.b(u9.f18763a), ff.a.b(u9.f18764b), ff.a.b(u9.f18765c), ff.a.b(u9.f18766d)));
    }
}
