package b0;
import x.o;
import d1.q;
import q.x;
import t.z0;

/* loaded from: classes.dex */
public final class o extends q implements a2.e, b2.x {
    public static final l L = new Object();
    public p I;
    public pd.c J;
    public z0 K;

    public final boolean Y0(k kVar, int i) {
        if (i == 5 || i == 6) {
            if (this.K == z0.f25598v) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.K == z0.f25597u) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            x.o("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (Z0(i)) {
            if (kVar.f1223b >= this.I.a() - 1) {
                return false;
            }
        } else if (kVar.f1222a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean Z0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int ordinal = b2.l.u(this).T.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            l4.a.o();
            return false;
        }
        if (i == 4) {
            int ordinal2 = b2.l.u(this).T.ordinal();
            if (ordinal2 == 0) {
                return true;
            }
            if (ordinal2 == 1) {
                return false;
            }
            l4.a.o();
            return false;
        }
        x.o("Lazy list does not support beyond bounds layout for the specified direction");
        return false;
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        z1.a1 z3 = o0Var.z(j10);
        return r0Var.u0(z3.f31769u, z3.f31770v, qe.t.f24024u, new n(z3, 0));
    }

    @Override // a2.e
    public final bc.b f0() {
        a2.g gVar = z1.k.f31836a;
        a2.h hVar = new a2.h(gVar);
        hVar.c(gVar, this);
        return hVar;
    }
}
