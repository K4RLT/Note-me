package x;

import b2.y1;

/* loaded from: classes.dex */
public final class f0 extends d1.q implements y1 {
    public float I;
    public boolean J;

    @Override // b2.y1
    public final Object k(y2.c cVar, Object obj) {
        n0 n0Var;
        if (obj instanceof n0) {
            n0Var = (n0) obj;
        } else {
            n0Var = null;
        }
        if (n0Var == null) {
            n0Var = new n0();
        }
        n0Var.f29986a = this.I;
        n0Var.f29987b = this.J;
        return n0Var;
    }
}
