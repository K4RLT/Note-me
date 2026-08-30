package r;
import d1.q;
import l.a;
import t.d;
import t.n0;
import t.z0;
import v.i;

import b2.q1;
import t.r1;
import t.s1;

/* loaded from: classes.dex */
public final class n1 extends b2.k implements b2.i, q1 {
    public s1 K;
    public z0 L;
    public boolean M;
    public n0 N;
    public i O;
    public d P;
    public boolean Q;
    public f R;
    public r1 S;
    public b2.j T;
    public g U;
    public f V;
    public boolean W;

    @Override // q
    public final boolean N0() {
        return false;
    }

    @Override // q
    public final void Q0() {
        f fVar;
        this.W = c1();
        b1();
        if (this.S == null) {
            s1 s1Var = this.K;
            if (this.Q) {
                fVar = this.V;
            } else {
                fVar = this.R;
            }
            f fVar2 = fVar;
            n0 n0Var = this.N;
            z0 z0Var = this.L;
            boolean z3 = this.M;
            boolean z9 = this.W;
            r1 r1Var = new r1(fVar2, this.P, n0Var, z0Var, s1Var, this.O, z3, z9);
            Y0(r1Var);
            this.S = r1Var;
        }
    }

    @Override // q
    public final void R0() {
        b2.j jVar = this.T;
        if (jVar != null) {
            Z0(jVar);
        }
    }

    @Override // b2.j
    public final void Z() {
        f fVar;
        boolean c12 = c1();
        if (this.W != c12) {
            this.W = c12;
            s1 s1Var = this.K;
            z0 z0Var = this.L;
            boolean z3 = this.Q;
            if (z3) {
                fVar = this.V;
            } else {
                fVar = this.R;
            }
            f fVar2 = fVar;
            boolean z9 = this.M;
            d1(fVar2, this.P, this.N, z0Var, s1Var, this.O, z3, z9);
        }
    }

    public final void b1() {
        f fVar;
        b2.j jVar = this.T;
        if (jVar == null) {
            if (this.Q) {
                b2.l.q(this, new m1(0, this));
            }
            if (this.Q) {
                fVar = this.V;
            } else {
                fVar = this.R;
            }
            if (fVar != null) {
                b2.k kVar = fVar.i;
                if (!kVar.f15688u.H) {
                    Y0(kVar);
                    this.T = kVar;
                    return;
                }
                return;
            }
            return;
        }
        if (!((q) jVar).f15688u.H) {
            Y0(jVar);
        }
    }

    public final boolean c1() {
        y2.m mVar;
        if (this.H) {
            mVar = b2.l.u(this).T;
        } else {
            mVar = y2.m.f30814u;
        }
        z0 z0Var = this.L;
        if (mVar == y2.m.f30815v && z0Var != z0.f25597u) {
            return false;
        }
        return true;
    }

    public final void d1(f fVar, d dVar, n0 n0Var, z0 z0Var, s1 s1Var, i iVar, boolean z3, boolean z9) {
        boolean z10;
        f fVar2;
        this.K = s1Var;
        this.L = z0Var;
        boolean z11 = true;
        if (this.Q != z3) {
            this.Q = z3;
            z10 = true;
        } else {
            z10 = false;
        }
        if (!kotlin.jvm.internal.a(this.R, fVar)) {
            this.R = fVar;
        } else {
            z11 = false;
        }
        if (z10 || (z11 && !z3)) {
            b2.j jVar = this.T;
            if (jVar != null) {
                Z0(jVar);
            }
            this.T = null;
            b1();
        }
        this.M = z9;
        this.N = n0Var;
        this.O = iVar;
        this.P = dVar;
        boolean c12 = c1();
        this.W = c12;
        r1 r1Var = this.S;
        if (r1Var != null) {
            if (this.Q) {
                fVar2 = this.V;
            } else {
                fVar2 = this.R;
            }
            r1Var.f1(fVar2, dVar, n0Var, z0Var, s1Var, iVar, z9, c12);
        }
    }

    @Override // b2.q1
    public final void r0() {
        f fVar;
        g gVar = (g) b2.l.h(this, a1.f24045a);
        if (!kotlin.jvm.internal.a(gVar, this.U)) {
            this.U = gVar;
            this.V = null;
            b2.j jVar = this.T;
            if (jVar != null) {
                Z0(jVar);
            }
            this.T = null;
            b1();
            r1 r1Var = this.S;
            if (r1Var != null) {
                s1 s1Var = this.K;
                z0 z0Var = this.L;
                if (this.Q) {
                    fVar = this.V;
                } else {
                    fVar = this.R;
                }
                f fVar2 = fVar;
                boolean z3 = this.M;
                boolean z9 = this.W;
                r1Var.f1(fVar2, this.P, this.N, z0Var, s1Var, this.O, z3, z9);
            }
        }
    }
}
