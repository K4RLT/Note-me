package b2;
import b2.r0;
import b2.s0;
import t0.e;
import z1.a1;
import z1.o0;
import z1.o;
import z1.p0;

import com.google.android.gms.internal.measurement.e4;

/* loaded from: classes.dex */
public final class r extends s0 {
    @Override // r0
    public final int F0(o oVar) {
        int i;
        w0 w0Var = this.I.I.f1478a0.f1559q;
        w0Var.getClass();
        n0 n0Var = w0Var.f1614z;
        e0 e0Var = n0Var.f1548d;
        j0 j0Var = w0Var.K;
        if (e0Var == e0.f1444v) {
            j0Var.f1508d = true;
            if (j0Var.f1506b) {
                n0Var.f1549f = true;
                n0Var.f1550g = true;
            }
        } else {
            j0Var.e = true;
        }
        r rVar = w0Var.g().l0;
        if (rVar != null) {
            rVar.E = true;
        }
        w0Var.P();
        r rVar2 = w0Var.g().l0;
        if (rVar2 != null) {
            rVar2.E = false;
        }
        Integer num = (Integer) j0Var.f1510g.get(oVar);
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MIN_VALUE;
        }
        this.N.h(i, oVar);
        return i;
    }

    @Override // s0
    public final void Y0() {
        w0 w0Var = this.I.I.f1478a0.f1559q;
        w0Var.getClass();
        w0Var.K0();
    }

    @Override // o0
    public final int Z(int i) {
        e4 u9 = this.I.I.u();
        p0 b10 = u9.b();
        i0 i0Var = (i0) u9.f13728v;
        return b10.i((k1) i0Var.Z.f1459y, i0Var.l(), i);
    }

    @Override // o0
    public final int c(int i) {
        e4 u9 = this.I.I.u();
        p0 b10 = u9.b();
        i0 i0Var = (i0) u9.f13728v;
        return b10.f((k1) i0Var.Z.f1459y, i0Var.l(), i);
    }

    @Override // o0
    public final int l(int i) {
        e4 u9 = this.I.I.u();
        p0 b10 = u9.b();
        i0 i0Var = (i0) u9.f13728v;
        return b10.a((k1) i0Var.Z.f1459y, i0Var.l(), i);
    }

    @Override // o0
    public final int n(int i) {
        e4 u9 = this.I.I.u();
        p0 b10 = u9.b();
        i0 i0Var = (i0) u9.f13728v;
        return b10.d((k1) i0Var.Z.f1459y, i0Var.l(), i);
    }

    @Override // o0
    public final a1 z(long j10) {
        A0(j10);
        k1 k1Var = this.I;
        e z3 = k1Var.I.z();
        Object[] objArr = z3.f25617u;
        int i = z3.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            w0 w0Var = ((i0) objArr[i10]).f1478a0.f1559q;
            w0Var.getClass();
            w0Var.D = g0.f1468w;
        }
        i0 i0Var = k1Var.I;
        s0.W0(this, i0Var.Q.g(this, i0Var.l(), j10));
        return this;
    }
}
