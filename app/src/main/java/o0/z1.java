package o0;
import a0.j0;
import b0.t0;
import b0.x;
import b2.x;
import d1.q;
import q.d;
import q0.l;
import v.i;
import z1.a1;
import z1.o0;
import z1.q0;
import z1.r0;

/* loaded from: classes.dex */
public final class z1 extends q implements x {
    public i I;
    public boolean J;
    public boolean K;
    public d L;
    public d M;
    public float N;
    public float O;

    @Override // q
    public final boolean N0() {
        return false;
    }

    @Override // q
    public final void Q0() {
        pf.x(M0(), null, new j0(this, null, 11), 3);
    }

    @Override // x
    public final q0 c(r0 r0Var, o0 o0Var, long j10) {
        boolean z3;
        float f10;
        float f11;
        boolean z9;
        Float f12;
        Float f13;
        boolean z10 = false;
        if (o0Var.c(y2.a.h(j10)) != 0 && o0Var.n(y2.a.g(j10)) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.K) {
            f10 = l.f23145a;
        } else if (!z3 && !this.J) {
            f10 = androidx.compose.material3.a.f591b;
        } else {
            f10 = androidx.compose.material3.a.f590a;
        }
        float l0 = r0Var.l0(f10);
        d dVar = this.M;
        if (dVar != null) {
            f11 = ((Number) dVar.e()).floatValue();
        } else {
            f11 = l0;
        }
        int i = (int) f11;
        if (i >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i >= 0) {
            z10 = true;
        }
        if (!(z9 & z10)) {
            y2.i.a("width and height must be >= 0");
        }
        a1 z11 = o0Var.z(y2.b.h(i, i, i, i));
        float l02 = r0Var.l0((androidx.compose.material3.a.f593d - r0Var.a0(l0)) / 2.0f);
        float l03 = r0Var.l0((androidx.compose.material3.a.f592c - androidx.compose.material3.a.f590a) - androidx.compose.material3.a.e);
        boolean z12 = this.K;
        if (z12 && this.J) {
            l02 = l03 - r0Var.l0(l.e);
        } else if (z12 && !this.J) {
            l02 = r0Var.l0(l.e);
        } else if (this.J) {
            l02 = l03;
        }
        d dVar2 = this.M;
        te.c cVar = null;
        if (dVar2 != null) {
            f12 = (Float) dVar2.e.getValue();
        } else {
            f12 = null;
        }
        if (f12 == null || f12.floatValue() != l0) {
            pf.x(M0(), null, new y1(this, l0, cVar, 0), 3);
        }
        d dVar3 = this.L;
        if (dVar3 != null) {
            f13 = (Float) dVar3.e.getValue();
        } else {
            f13 = null;
        }
        if (f13 == null || f13.floatValue() != l02) {
            pf.x(M0(), null, new y1(this, l02, cVar, 1), 3);
        }
        if (Float.isNaN(this.O) && Float.isNaN(this.N)) {
            this.O = l0;
            this.N = l02;
        }
        return r0Var.u0(i, i, qe.t.f24024u, new t0(z11, this, l02));
    }
}
