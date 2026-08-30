package j0;
import l.a;
import m.g;

import b2.e2;
import b2.r0;
import b2.x;
import g0.a1;
import j2.s;
import j2.v;
import java.util.List;
import java.util.Map;
import k1.u;
import m2.q0;
import z1.o0;

/* loaded from: classes.dex */
public final class o extends d1.q implements x, b2.n, e2 {
    public m2.g I;
    public q0 J;
    public q2.h K;
    public df.l L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public List Q;
    public df.l R;
    public j S;
    public u T;
    public g0.i U;
    public df.l V;
    public Map W;
    public e X;
    public n Y;
    public m Z;

    public o(m2.g gVar, q0 q0Var, q2.h hVar, df.l lVar, int i, boolean z3, int i10, int i11, List list, df.l lVar2, j jVar, u uVar, g0.i iVar, df.l lVar3) {
        this.I = gVar;
        this.J = q0Var;
        this.K = hVar;
        this.L = lVar;
        this.M = i;
        this.N = z3;
        this.O = i10;
        this.P = i11;
        this.Q = list;
        this.R = lVar2;
        this.S = jVar;
        this.T = uVar;
        this.U = iVar;
        this.V = lVar3;
    }

    @Override // b2.x
    public final int A(r0 r0Var, o0 o0Var, int i) {
        return a1(r0Var).a(i, r0Var.getLayoutDirection());
    }

    @Override // b2.e2
    public final void F0(j2.j jVar) {
        n nVar = this.Y;
        if (nVar == null) {
            nVar = new n(this, 0);
            this.Y = nVar;
        }
        m2.g gVar = this.I;
        kf.g[] gVarArr = j2.u.f18865a;
        jVar.k(s.A, qe.g(gVar));
        m mVar = this.Z;
        if (mVar != null) {
            m2.g gVar2 = mVar.f18747b;
            v vVar = s.B;
            kf.g[] gVarArr2 = j2.u.f18865a;
            kf.g gVar3 = gVarArr2[15];
            jVar.k(vVar, gVar2);
            boolean z3 = mVar.f18748c;
            v vVar2 = s.C;
            kf.g gVar4 = gVarArr2[16];
            jVar.k(vVar2, Boolean.valueOf(z3));
        }
        jVar.k(j2.i.f18797k, new j2.a(null, new n(this, 1)));
        jVar.k(j2.i.f18798l, new j2.a(null, new n(this, 2)));
        jVar.k(j2.i.f18799m, new j2.a(null, new a2.c(18, this)));
        j2.u.a(jVar, nVar);
    }

    @Override // b2.x
    public final int J(r0 r0Var, o0 o0Var, int i) {
        return a1.q(a1(r0Var).d(r0Var.getLayoutDirection()).d());
    }

    @Override // d1.q
    public final boolean N0() {
        return false;
    }

    public final void Y0(boolean z3, boolean z9, boolean z10, boolean z11) {
        if (z9 || z10 || z11) {
            e Z0 = Z0();
            m2.g gVar = this.I;
            q0 q0Var = this.J;
            q2.h hVar = this.K;
            int i = this.M;
            boolean z12 = this.N;
            int i10 = this.O;
            int i11 = this.P;
            List list = this.Q;
            g0.i iVar = this.U;
            Z0.f18698a = gVar;
            Z0.e(q0Var);
            Z0.f18699b = hVar;
            Z0.f18700c = i;
            Z0.f18701d = z12;
            Z0.e = i10;
            Z0.f18702f = i11;
            Z0.f18703g = list;
            Z0.f18704h = iVar;
            Z0.f18708m = null;
            Z0.f18710o = null;
            Z0.f18712q = -1;
            Z0.f18711p = -1;
            Z0.f18713r = null;
        }
        if (this.H) {
            if (z9 || (z3 && this.Y != null)) {
                b2.l.m(this);
            }
            if (z9 || z10 || z11) {
                b2.l.l(this);
                b2.l.k(this);
            }
            if (z3) {
                b2.l.k(this);
            }
        }
    }

    public final e Z0() {
        if (this.X == null) {
            this.X = new e(this.I, this.J, this.K, this.M, this.N, this.O, this.P, this.Q, this.U);
        }
        e eVar = this.X;
        eVar.getClass();
        return eVar;
    }

    public final e a1(y2.c cVar) {
        e eVar;
        m mVar = this.Z;
        if (mVar != null && mVar.f18748c && (eVar = mVar.f18749d) != null) {
            eVar.c(cVar);
            return eVar;
        }
        e Z0 = Z0();
        Z0.c(cVar);
        return Z0;
    }

    public final boolean b1(df.l lVar, df.l lVar2, j jVar, df.l lVar3) {
        boolean z3;
        if (this.L != lVar) {
            this.L = lVar;
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.R != lVar2) {
            this.R = lVar2;
            z3 = true;
        }
        if (!kotlin.jvm.internal.a(this.S, jVar)) {
            this.S = jVar;
            z3 = true;
        }
        if (this.V != lVar3) {
            this.V = lVar3;
            return true;
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020e  */
    @Override // b2.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z1.q0 c(z1.r0 r35, z1.o0 r36, long r37) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.o.c(z1.r0, z1.o0, long):z1.q0");
    }

    public final boolean c1(q0 q0Var, List list, int i, int i10, boolean z3, q2.h hVar, int i11, g0.i iVar) {
        boolean z9 = !this.J.c(q0Var);
        this.J = q0Var;
        if (!kotlin.jvm.internal.a(this.Q, list)) {
            this.Q = list;
            z9 = true;
        }
        if (this.P != i) {
            this.P = i;
            z9 = true;
        }
        if (this.O != i10) {
            this.O = i10;
            z9 = true;
        }
        if (this.N != z3) {
            this.N = z3;
            z9 = true;
        }
        if (!kotlin.jvm.internal.a(this.K, hVar)) {
            this.K = hVar;
            z9 = true;
        }
        if (this.M != i11) {
            this.M = i11;
            z9 = true;
        }
        if (!kotlin.jvm.internal.a(this.U, iVar)) {
            this.U = iVar;
            return true;
        }
        return z9;
    }

    public final boolean d1(m2.g gVar) {
        boolean z3;
        boolean a10 = kotlin.jvm.internal.a(this.I.f20477v, gVar.f20477v);
        boolean a11 = kotlin.jvm.internal.a(this.I.f20476u, gVar.f20476u);
        if (a10 && a11) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            this.I = gVar;
        }
        if (!a10) {
            this.Z = null;
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [k1.p] */
    /* JADX WARN: Type inference failed for: r18v6 */
    @Override // b2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(b2.l0 r27) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.o.e0(b2.l0):void");
    }

    @Override // b2.x
    public final int n(r0 r0Var, o0 o0Var, int i) {
        return a1(r0Var).a(i, r0Var.getLayoutDirection());
    }

    @Override // b2.x
    public final int v(r0 r0Var, o0 o0Var, int i) {
        return a1.q(a1(r0Var).d(r0Var.getLayoutDirection()).c());
    }
}
