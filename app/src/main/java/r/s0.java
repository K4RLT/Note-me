package r;
import a0.j0;
import b0.x;
import d1.q;
import j1.b;
import l.b;
import r0.g0;
import r0.i1;
import r0.v0;
import r0.y;

import android.view.View;
import b2.e2;
import b2.q1;
import ya.jb;
import ya.vd;

/* loaded from: classes.dex */
public final class s0 extends q implements b2.o, b2.n, e2, q1 {
    public kotlin.jvm.internal.m I;
    public kotlin.jvm.internal.m J;
    public c1 K;
    public View L;
    public y2.c M;
    public b1 N;
    public g0 P;
    public y2.l R;
    public rf.h S;
    public final i1 O = new i1(null, v0.f24418w);
    public long Q = 9205357640488583168L;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(df.l lVar, df.l lVar2, c1 c1Var) {
        this.I = (kotlin.jvm.internal.m) lVar;
        this.J = (kotlin.jvm.internal.m) lVar2;
        this.K = c1Var;
    }

    @Override // b2.e2
    public final void F0(j2.j jVar) {
        jVar.k(t0.f24145a, new r0(this, 1));
    }

    @Override // q
    public final void Q0() {
        r0();
        this.S = jb.a(0, 7, null);
        pf.x(M0(), null, new j0(this, null, 16), 1);
    }

    @Override // q
    public final void R0() {
        b1 b1Var = this.N;
        if (b1Var != null) {
            ((d1) b1Var).b();
        }
        this.N = null;
    }

    public final long Y0() {
        if (this.P == null) {
            this.P = y.r(new r0(this, 0));
        }
        g0 g0Var = this.P;
        if (g0Var != null) {
            return ((b) g0Var.getValue()).f18762a;
        }
        return 9205357640488583168L;
    }

    public final void Z0() {
        b1 b1Var = this.N;
        if (b1Var != null) {
            ((d1) b1Var).b();
        }
        View view = this.L;
        if (view == null) {
            view = b2.l.w(this);
        }
        this.L = view;
        y2.c cVar = this.M;
        if (cVar == null) {
            cVar = b2.l.u(this).S;
        }
        this.M = cVar;
        this.N = this.K.b(view, cVar);
        b1();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.m, df.l] */
    public final void a1() {
        y2.c cVar = this.M;
        if (cVar == null) {
            cVar = b2.l.u(this).S;
            this.M = cVar;
        }
        long j10 = ((b) this.I.invoke(cVar)).f18762a;
        if ((j10 & 9223372034707292159L) != 9205357640488583168L && (9223372034707292159L & Y0()) != 9205357640488583168L) {
            this.Q = b.h(Y0(), j10);
            if (this.N == null) {
                Z0();
            }
            b1 b1Var = this.N;
            if (b1Var != null) {
                b1Var.a(this.Q, 9205357640488583168L);
            }
            b1();
            return;
        }
        this.Q = 9205357640488583168L;
        b1 b1Var2 = this.N;
        if (b1Var2 != null) {
            ((d1) b1Var2).b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.m, df.l] */
    public final void b1() {
        y2.c cVar;
        b1 b1Var = this.N;
        if (b1Var != null && (cVar = this.M) != null) {
            d1 d1Var = (d1) b1Var;
            if (!y2.b(d1Var.c(), this.R)) {
                this.J.invoke(new y2.h(cVar.p(vd.c(d1Var.c()))));
                this.R = new y2.l(d1Var.c());
            }
        }
    }

    @Override // b2.n
    public final void e0(b2.l0 l0Var) {
        l0Var.b();
        rf.h hVar = this.S;
        if (hVar != null) {
            hVar.e(pe.z.f22715a);
        }
    }

    @Override // b2.o
    public final void h0(b2.k1 k1Var) {
        this.O.setValue(k1Var);
    }

    @Override // b2.q1
    public final void r0() {
        b2.l.q(this, new r0(this, 2));
    }
}
