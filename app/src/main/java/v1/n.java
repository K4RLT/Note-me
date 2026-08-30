package v1;

import c2.l0;
import c2.p1;

/* loaded from: classes.dex */
public final class n extends g {
    @Override // v1.g
    public final void Z0(p pVar) {
        q qVar = (q) b2.l.h(this, p1.f3618u);
        if (qVar != null) {
            c2.t tVar = (c2.t) qVar;
            if (pVar == null) {
                p.f27336a.getClass();
                pVar = r.f27337a;
            }
            l0.f3568a.a(tVar.f3642b, pVar);
        }
    }

    @Override // v1.g
    public final boolean b1(int i) {
        if (i == 3 || i == 4) {
            return false;
        }
        return true;
    }

    @Override // b2.j2
    public final /* bridge */ /* synthetic */ Object j() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
