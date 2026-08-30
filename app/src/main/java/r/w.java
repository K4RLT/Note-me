package r;
import a0.j0;
import b0.x;
import d1.q;
import k1.r;
import m1.b;
import m1.d;
import v.i;

/* loaded from: classes.dex */
public final class w extends q implements b2.n {
    public final i I;
    public boolean J;
    public boolean K;
    public boolean L;

    public w(i iVar) {
        this.I = iVar;
    }

    @Override // q
    public final void Q0() {
        pf.x(M0(), null, new j0(this, null, 14), 3);
    }

    @Override // b2.n
    public final void e0(b2.l0 l0Var) {
        l0Var.b();
        b bVar = l0Var.f1533u;
        if (this.J) {
            d.t(l0Var, r.c(r.f19513b, 0.3f), 0L, bVar.e(), 0.0f, null, 122);
        } else {
            if (!this.K && !this.L) {
                return;
            }
            d.t(l0Var, r.c(r.f19513b, 0.1f), 0L, bVar.e(), 0.0f, null, 122);
        }
    }
}
