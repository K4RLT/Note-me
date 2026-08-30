package x;
import o0.f0;
import y.a;

/* loaded from: classes.dex */
public final class l0 extends d1.q implements b2.x {
    public j0 I;

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        boolean z3;
        boolean z9;
        boolean z10;
        float b10 = this.I.b(r0Var.getLayoutDirection());
        float d2 = this.I.d();
        float a10 = this.I.a(r0Var.getLayoutDirection());
        float c10 = this.I.c();
        boolean z11 = false;
        float f10 = 0;
        if (Float.compare(b10, f10) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (Float.compare(d2, f10) >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z12 = z3 & z9;
        if (Float.compare(a10, f10) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = z12 & z10;
        if (Float.compare(c10, f10) >= 0) {
            z11 = true;
        }
        if (!(z11 & z13)) {
            a.a("Padding must be non-negative");
        }
        int t02 = r0Var.t0(b10);
        int t03 = r0Var.t0(a10) + t02;
        int t04 = r0Var.t0(d2);
        int t05 = r0Var.t0(c10) + t04;
        z1.a1 z14 = o0Var.z(y2.b.i(j10, -t03, -t05));
        return r0Var.u0(y2.b.g(z14.f31769u + t03, j10), y2.b.f(z14.f31770v + t05, j10), qe.t.f24024u, new f0(z14, t02, t04, 3));
    }
}
