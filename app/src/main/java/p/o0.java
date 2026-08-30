package p;
import b.b;
import b0.n;
import d1.c;
import d1.e;
import d1.q;
import q.b1;
import q.c1;
import q.g1;

/* loaded from: classes.dex */
public final class o0 extends u0 {
    public g1 I;
    public c1 J;
    public c1 K;
    public c1 L;
    public p0 M;
    public q0 N;
    public h0 O;
    public long P = androidx.compose.animation.b.f424a;
    public e Q;
    public final n0 R;
    public final n0 S;

    public o0(g1 g1Var, c1 c1Var, c1 c1Var2, c1 c1Var3, p0 p0Var, q0 q0Var, h0 h0Var) {
        this.I = g1Var;
        this.J = c1Var;
        this.K = c1Var2;
        this.L = c1Var3;
        this.M = p0Var;
        this.N = q0Var;
        this.O = h0Var;
        y2.b(0, 0, 15);
        this.R = new n0(this, 0);
        this.S = new n0(this, 1);
    }

    @Override // q
    public final void Q0() {
        this.P = androidx.compose.animation.b.f424a;
    }

    public final e Y0() {
        e eVar;
        e eVar2;
        if (this.I.f().b(g0.f22152u, g0.f22153v)) {
            b0 b0Var = this.M.f22224a.f22280c;
            if (b0Var != null && (eVar2 = b0Var.f22102a) != null) {
                return eVar2;
            }
            b0 b0Var2 = this.N.f22233a.f22280c;
            if (b0Var2 != null) {
                return b0Var2.f22102a;
            }
            return null;
        }
        b0 b0Var3 = this.N.f22233a.f22280c;
        if (b0Var3 != null && (eVar = b0Var3.f22102a) != null) {
            return eVar;
        }
        b0 b0Var4 = this.M.f22224a.f22280c;
        if (b0Var4 != null) {
            return b0Var4.f22102a;
        }
        return null;
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        b1 b1Var;
        b1 b1Var2;
        k1.t0 t0Var;
        b1 b1Var3;
        long j11;
        b1 b1Var4;
        long j12;
        long j13;
        long j14;
        if (this.I.c() == this.I.f22905d.getValue()) {
            this.Q = null;
        } else if (this.Q == null) {
            e Y0 = Y0();
            if (Y0 == null) {
                Y0 = c.f15670u;
            }
            this.Q = Y0;
        }
        boolean j02 = r0Var.j0();
        qe.t tVar = qe.t.f24024u;
        if (j02) {
            z1.a1 z3 = o0Var.z(j10);
            long j15 = (z3.f31769u << 32) | (z3.f31770v & 4294967295L);
            this.P = j15;
            return r0Var.u0((int) (j15 >> 32), (int) (4294967295L & j15), tVar, new n(z3, 7));
        }
        if (Boolean.TRUE.booleanValue()) {
            h0 h0Var = this.O;
            c1 c1Var = h0Var.f22162a;
            c1 c1Var2 = h0Var.f22163b;
            g1 g1Var = h0Var.f22164c;
            p0 p0Var = h0Var.f22165d;
            v1 v1Var = p0Var.f22224a;
            q0 q0Var = h0Var.e;
            c1 c1Var3 = h0Var.f22166f;
            if (c1Var != null) {
                b1Var = c1Var.a(new i0(p0Var, q0Var, 0), new i0(p0Var, q0Var, 1));
            } else {
                b1Var = null;
            }
            if (c1Var2 != null) {
                b1Var2 = c1Var2.a(new i0(p0Var, q0Var, 2), new i0(p0Var, q0Var, 3));
            } else {
                b1Var2 = null;
            }
            if (g1Var.c() == g0.f22152u) {
                v0 v0Var = v1Var.f22281d;
                if (v0Var != null) {
                    t0Var = new k1.t0(v0Var.f22276b);
                } else {
                    v0 v0Var2 = q0Var.f22233a.f22281d;
                    if (v0Var2 != null) {
                        t0Var = new k1.t0(v0Var2.f22276b);
                    }
                    t0Var = null;
                }
            } else {
                v0 v0Var3 = q0Var.f22233a.f22281d;
                if (v0Var3 != null) {
                    t0Var = new k1.t0(v0Var3.f22276b);
                } else {
                    v0 v0Var4 = v1Var.f22281d;
                    if (v0Var4 != null) {
                        t0Var = new k1.t0(v0Var4.f22276b);
                    }
                    t0Var = null;
                }
            }
            if (c1Var3 != null) {
                b1Var3 = c1Var3.a(d.C, new b2.k0(15, t0Var, p0Var, q0Var));
            } else {
                b1Var3 = null;
            }
            b2.k0 k0Var = new b2.k0(14, b1Var, b1Var2, b1Var3);
            z1.a1 z9 = o0Var.z(j10);
            long j16 = (z9.f31769u << 32) | (z9.f31770v & 4294967295L);
            if (!y2.c(this.P, androidx.compose.animation.b.f424a)) {
                j11 = this.P;
            } else {
                j11 = j16;
            }
            c1 c1Var4 = this.J;
            if (c1Var4 != null) {
                b1Var4 = c1Var4.a(this.R, new m0(this, j11, 0));
            } else {
                b1Var4 = null;
            }
            if (b1Var4 != null) {
                j16 = ((y2.l) b1Var4.getValue()).f30813a;
            }
            long d2 = y2.b.d(j10, j16);
            c1 c1Var5 = this.K;
            long j17 = 0;
            if (c1Var5 != null) {
                j12 = ((y2.j) c1Var5.a(d.F, new m0(this, j11, 1)).getValue()).f30808a;
            } else {
                j12 = 0;
            }
            c1 c1Var6 = this.L;
            if (c1Var6 != null) {
                j13 = 4294967295L;
                j14 = ((y2.j) c1Var6.a(this.S, new m0(this, j11, 2)).getValue()).f30808a;
            } else {
                j13 = 4294967295L;
                j14 = 0;
            }
            e eVar = this.Q;
            if (eVar != null) {
                j17 = eVar.a(j11, d2, y2.m.f30814u);
            }
            return r0Var.u0((int) (d2 >> 32), (int) (d2 & j13), tVar, new l0(z9, y2.c(j17, j14), j12, k0Var, 0));
        }
        z1.a1 z10 = o0Var.z(j10);
        return r0Var.u0(z10.f31769u, z10.f31770v, tVar, new n(z10, 8));
    }
}
