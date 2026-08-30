package p;
import b.b;
import b0.x;
import d1.j;
import d1.q;
import l.c;
import q.d;
import q.m1;
import q.r0;
import r0.i1;
import r0.y;

/* loaded from: classes.dex */
public final class r1 extends u0 {
    public r0 I;
    public j J;
    public boolean M;
    public long K = androidx.compose.animation.b.f424a;
    public long L = y2.b(0, 0, 15);
    public final i1 N = y.B(null);

    public r1(r0 r0Var, j jVar) {
        this.I = r0Var;
        this.J = jVar;
    }

    @Override // q
    public final void Q0() {
        this.K = androidx.compose.animation.b.f424a;
        this.M = false;
    }

    @Override // q
    public final void S0() {
        this.N.setValue(null);
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        long j11;
        z1.a1 z3;
        long j12;
        char c10;
        long j13;
        o1 o1Var;
        long d2;
        o1 o1Var2;
        boolean z9 = true;
        if (r0Var.j0()) {
            this.L = j10;
            this.M = true;
            z3 = o0Var.z(j10);
        } else {
            if (this.M) {
                j11 = this.L;
            } else {
                j11 = j10;
            }
            z3 = o0Var.z(j11);
        }
        z1.a1 a1Var = z3;
        long j14 = (a1Var.f31770v & 4294967295L) | (a1Var.f31769u << 32);
        if (r0Var.j0()) {
            this.K = j14;
            c10 = ' ';
            d2 = j14;
            j13 = d2;
        } else {
            if (!y2.c(this.K, androidx.compose.animation.b.f424a)) {
                j12 = this.K;
            } else {
                j12 = j14;
            }
            i1 i1Var = this.N;
            o1 o1Var3 = (o1) i1Var.getValue();
            if (o1Var3 != null) {
                d dVar = o1Var3.f22218a;
                c10 = ' ';
                j13 = j14;
                if (y2.c(j12, ((y2.l) dVar.e()).f30813a) || dVar.f()) {
                    z9 = false;
                }
                if (y2.c(j12, ((y2.l) dVar.e.getValue()).f30813a) && !z9) {
                    o1Var2 = o1Var3;
                } else {
                    o1Var3.f22219b = ((y2.l) dVar.e()).f30813a;
                    o1Var2 = o1Var3;
                    pf.x(M0(), null, new p1(o1Var2, j12, this, null), 3);
                }
                o1Var = o1Var2;
            } else {
                c10 = ' ';
                j13 = j14;
                long j15 = 1;
                o1Var = new o1(new d(new y2.l(j12), m1.f22954h, new y2.l((j15 << 32) | (j15 & 4294967295L)), 8), j12);
            }
            i1Var.setValue(o1Var);
            d2 = y2.b.d(j10, ((y2.l) o1Var.f22218a.e()).f30813a);
        }
        int i = (int) (d2 >> c10);
        int i10 = (int) (d2 & 4294967295L);
        return r0Var.u0(i, i10, qe.t.f24024u, new q1(this, j13, i, i10, r0Var, a1Var));
    }
}
