package o0;
import b2.i;
import b2.l;
import b2.x;
import d1.q;
import z1.a1;
import z1.o0;
import z1.q0;
import z1.r0;

/* loaded from: classes.dex */
public final class g0 extends q implements i, x {
    @Override // x
    public final q0 c(r0 r0Var, o0 o0Var, long j10) {
        boolean z3;
        float f10 = ((y2.f) l.h(this, z.f21756a)).f30805u;
        int i = 0;
        float f11 = 0;
        if (f10 < f11) {
            f10 = f11;
        }
        a1 z9 = o0Var.z(j10);
        if (this.H && !Float.isNaN(f10) && Float.compare(f10, f11) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!Float.isNaN(f10)) {
            i = r0Var.t0(f10);
        }
        int i10 = z9.f31769u;
        if (z3) {
            i10 = Math.max(i10, i);
        }
        int i11 = z9.f31770v;
        if (z3) {
            i11 = Math.max(i11, i);
        }
        return r0Var.u0(i10, i11, qe.t.f24024u, new f0(i10, z9, i11));
    }
}
