package r;
import a.a;
import b1.i;
import b1.w;
import d1.q;
import r0.f1;
import t.z0;

import b2.e2;
import ya.ua;

/* loaded from: classes.dex */
public final class i1 extends q implements b2.x, e2 {
    public l1 I;
    public boolean J;

    @Override // b2.x
    public final int A(b2.r0 r0Var, z1.o0 o0Var, int i) {
        if (!this.J) {
            i = Integer.MAX_VALUE;
        }
        return o0Var.c(i);
    }

    @Override // b2.e2
    public final void F0(j2.j jVar) {
        kf.g[] gVarArr = j2.u.f18865a;
        j2.v vVar = j2.s.f18849m;
        kf.g[] gVarArr2 = j2.u.f18865a;
        kf.g gVar = gVarArr2[6];
        jVar.k(vVar, Boolean.TRUE);
        j2.h hVar = new j2.h(new g1(this, 0), new g1(this, 1));
        if (this.J) {
            j2.v vVar2 = j2.s.f18857u;
            kf.g gVar2 = gVarArr2[12];
            jVar.k(vVar2, hVar);
        } else {
            j2.v vVar3 = j2.s.f18856t;
            kf.g gVar3 = gVarArr2[11];
            jVar.k(vVar3, hVar);
        }
    }

    @Override // b2.x
    public final int J(b2.r0 r0Var, z1.o0 o0Var, int i) {
        if (this.J) {
            i = Integer.MAX_VALUE;
        }
        return o0Var.n(i);
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        z0 z0Var;
        int g8;
        df.l lVar;
        int i;
        if (this.J) {
            z0Var = z0.f25597u;
        } else {
            z0Var = z0.f25598v;
        }
        ua.a(j10, z0Var);
        int i10 = Integer.MAX_VALUE;
        if (this.J) {
            g8 = Integer.MAX_VALUE;
        } else {
            g8 = y2.a.g(j10);
        }
        if (this.J) {
            i10 = y2.a.h(j10);
        }
        z1.a1 z3 = o0Var.z(y2.a(j10, 0, i10, 0, g8, 5));
        int i11 = z3.f31769u;
        int h3 = y2.a.h(j10);
        if (i11 > h3) {
            i11 = h3;
        }
        int i12 = z3.f31770v;
        int g10 = y2.a.g(j10);
        if (i12 > g10) {
            i12 = g10;
        }
        int i13 = z3.f31770v - i12;
        int i14 = z3.f31769u - i11;
        if (!this.J) {
            i13 = i14;
        }
        l1 l1Var = this.I;
        f1 f1Var = l1Var.f24117d;
        f1 f1Var2 = l1Var.f24114a;
        f1Var.i(i13);
        i d2 = w.d();
        if (d2 != null) {
            lVar = d2.e();
        } else {
            lVar = null;
        }
        i g11 = w.g(d2);
        try {
            if (f1Var2.h() > i13) {
                f1Var2.i(i13);
            }
            w.j(d2, g11, lVar);
            l1 l1Var2 = this.I;
            if (this.J) {
                i = i12;
            } else {
                i = i11;
            }
            l1Var2.f24115b.i(i);
            return r0Var.u0(i11, i12, qe.t.f24024u, new h1(this, i13, z3));
        } catch (Throwable th) {
            w.j(d2, g11, lVar);
            throw th;
        }
    }

    @Override // b2.x
    public final int n(b2.r0 r0Var, z1.o0 o0Var, int i) {
        if (!this.J) {
            i = Integer.MAX_VALUE;
        }
        return o0Var.Z(i);
    }

    @Override // b2.x
    public final int v(b2.r0 r0Var, z1.o0 o0Var, int i) {
        if (this.J) {
            i = Integer.MAX_VALUE;
        }
        return o0Var.l(i);
    }
}
