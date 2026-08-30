package b3;
import l.a;
import l.c;
import l.e;

import android.view.View;
import android.view.ViewTreeObserver;
import b2.v1;
import q.x;

/* loaded from: classes.dex */
public final class q extends d1.q implements i1.n, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View I;
    public ViewTreeObserver J;
    public final p K = new p(this, 0);
    public final p L = new p(this, 1);

    @Override // i1.n
    public final void A0(i1.k kVar) {
        kVar.d(false);
        kVar.a(this.K);
        kVar.c(this.L);
    }

    @Override // d1.q
    public final void Q0() {
        ViewTreeObserver viewTreeObserver = b2.l.w(this).getViewTreeObserver();
        this.J = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // d1.q
    public final void R0() {
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.J = null;
        b2.l.w(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.I = null;
    }

    public final i1.s Y0() {
        if (!this.f15688u.H) {
            y1.a.b("visitLocalDescendants called on an unattached node");
        }
        d1.q qVar = this.f15688u;
        if ((qVar.f15691x & 1024) != 0) {
            boolean z3 = false;
            for (d1.q qVar2 = qVar.f15693z; qVar2 != null; qVar2 = qVar2.f15693z) {
                if ((qVar2.f15690w & 1024) != 0) {
                    d1.q qVar3 = qVar2;
                    t0.e eVar = null;
                    while (qVar3 != null) {
                        if (qVar3 instanceof i1.s) {
                            i1.s sVar = (i1.s) qVar3;
                            if (z3) {
                                return sVar;
                            }
                            z3 = true;
                        } else if ((qVar3.f15690w & 1024) != 0 && (qVar3 instanceof b2.k)) {
                            int i = 0;
                            for (d1.q qVar4 = ((b2.k) qVar3).J; qVar4 != null; qVar4 = qVar4.f15693z) {
                                if ((qVar4.f15690w & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        qVar3 = qVar4;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new t0.e(new d1.q[16]);
                                        }
                                        if (qVar3 != null) {
                                            eVar.b(qVar3);
                                            qVar3 = null;
                                        }
                                        eVar.b(qVar4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        qVar3 = b2.e(eVar);
                    }
                }
            }
        }
        x.o("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z3;
        if (b2.l.u(this).H != null) {
            View c10 = c(this);
            i1.i focusOwner = ((c2.x) b2.l.v(this)).getFocusOwner();
            v1 v2 = b2.l.v(this);
            boolean z9 = true;
            if (view != null && !view.equals(v2) && a(c10, view)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (view2 == null || view2.equals(v2) || !a(c10, view2)) {
                z9 = false;
            }
            if (z3 && z9) {
                this.I = view2;
                return;
            }
            if (z9) {
                this.I = view2;
                i1.s Y0 = Y0();
                if (!Y0.a1().a()) {
                    i1.f.v(Y0);
                    return;
                }
                return;
            }
            if (z3) {
                this.I = null;
                if (Y0().a1().b()) {
                    ((i1.j) focusOwner).c(8, false, false);
                    return;
                }
                return;
            }
            this.I = null;
        }
    }
}
