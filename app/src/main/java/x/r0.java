package x;
import b.a;
import b0.n;
import x.r0;

/* loaded from: classes.dex */
public final class r0 extends d1.q implements b2.x {
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;

    @Override // b2.x
    public final int A(b2.r0 r0Var, z1.o0 o0Var, int i) {
        long Y0 = Y0(r0Var);
        if (y2.a.e(Y0)) {
            return y2.a.g(Y0);
        }
        if (!this.M) {
            i = y2.b.g(i, Y0);
        }
        return y2.b.f(o0Var.c(i), Y0);
    }

    @Override // b2.x
    public final int J(b2.r0 r0Var, z1.o0 o0Var, int i) {
        long Y0 = Y0(r0Var);
        if (y2.a.f(Y0)) {
            return y2.a.h(Y0);
        }
        if (!this.M) {
            i = y2.b.f(i, Y0);
        }
        return y2.b.g(o0Var.n(i), Y0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Y0(z1.r0 r7) {
        /*
            r6 = this;
            float r0 = r6.K
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.K
            int r0 = r7.t0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.L
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.L
            int r3 = r7.t0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.I
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.I
            int r4 = r7.t0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.J
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.J
            int r7 = r7.t0(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = y2.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x.r0.Y0(z1.r0):long");
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        int j11;
        int h3;
        int i;
        int g8;
        long a10;
        long Y0 = Y0(r0Var);
        if (this.M) {
            a10 = y2.b.e(j10, Y0);
        } else {
            if (!Float.isNaN(this.I)) {
                j11 = y2.a.j(Y0);
            } else {
                j11 = y2.a.j(j10);
                int h10 = y2.a.h(Y0);
                if (j11 > h10) {
                    j11 = h10;
                }
            }
            if (!Float.isNaN(this.K)) {
                h3 = y2.a.h(Y0);
            } else {
                h3 = y2.a.h(j10);
                int j12 = y2.a.j(Y0);
                if (h3 < j12) {
                    h3 = j12;
                }
            }
            if (!Float.isNaN(this.J)) {
                i = y2.a.i(Y0);
            } else {
                i = y2.a.i(j10);
                int g10 = y2.a.g(Y0);
                if (i > g10) {
                    i = g10;
                }
            }
            if (!Float.isNaN(this.L)) {
                g8 = y2.a.g(Y0);
            } else {
                g8 = y2.a.g(j10);
                int i10 = y2.a.i(Y0);
                if (g8 < i10) {
                    g8 = i10;
                }
            }
            a10 = y2.a(j11, h3, i, g8);
        }
        z1.a1 z3 = o0Var.z(a10);
        return r0Var.u0(z3.f31769u, z3.f31770v, qe.t.f24024u, new n(z3, 13));
    }

    @Override // b2.x
    public final int n(b2.r0 r0Var, z1.o0 o0Var, int i) {
        long Y0 = Y0(r0Var);
        if (y2.a.e(Y0)) {
            return y2.a.g(Y0);
        }
        if (!this.M) {
            i = y2.b.g(i, Y0);
        }
        return y2.b.f(o0Var.Z(i), Y0);
    }

    @Override // b2.x
    public final int v(b2.r0 r0Var, z1.o0 o0Var, int i) {
        long Y0 = Y0(r0Var);
        if (y2.a.f(Y0)) {
            return y2.a.h(Y0);
        }
        if (!this.M) {
            i = y2.b.f(i, Y0);
        }
        return y2.b.g(o0Var.l(i), Y0);
    }
}
