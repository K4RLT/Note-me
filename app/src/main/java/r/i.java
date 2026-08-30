package r;
import a0.o;
import d1.q;
import j1.c;
import j1.d;
import j1.e;
import k1.e0;
import k1.f0;
import k1.g0;
import k1.i0;
import k1.l0;
import k1.n;
import k1.p0;
import k1.r;
import l.a;
import m1.b;
import m1.d;
import m1.g;
import u.a;

import b2.q1;

/* loaded from: classes.dex */
public final class i extends q implements b2.n, q1 {
    public long I;
    public n J;
    public float K;
    public p0 L;
    public long M;
    public y2.m N;
    public l0 O;
    public p0 P;
    public l0 Q;

    @Override // b2.n
    public final void e0(b2.l0 l0Var) {
        l0 l0Var2;
        n nVar;
        i0 i0Var;
        b bVar = l0Var.f1533u;
        if (this.L == l0.f19495a) {
            if (!pe.a(this.I, r.f19521l)) {
                d.t(l0Var, this.I, 0L, 0L, 0.0f, null, 126);
            }
            n nVar2 = this.J;
            if (nVar2 != null) {
                d.q(l0Var, nVar2, 0L, 0L, this.K, null, 0, 118);
            }
        } else {
            if (e.a(bVar.e(), this.M) && l0Var.getLayoutDirection() == this.N && kotlin.jvm.internal.a(this.P, this.L)) {
                l0Var2 = this.O;
                l0Var2.getClass();
            } else {
                b2.l.q(this, new o(this, 19, l0Var));
                l0Var2 = this.Q;
                this.Q = null;
            }
            this.O = l0Var2;
            this.M = bVar.e();
            this.N = l0Var.getLayoutDirection();
            this.P = this.L;
            l0Var2.getClass();
            if (!pe.a(this.I, r.f19521l)) {
                l0.p(l0Var, l0Var2, this.I);
            }
            n nVar3 = this.J;
            if (nVar3 != null) {
                float f10 = this.K;
                boolean z3 = l0Var2 instanceof f0;
                g gVar = g.f20429a;
                if (z3) {
                    c cVar = ((f0) l0Var2).e;
                    float f11 = cVar.f18763a;
                    float f12 = cVar.f18764b;
                    l0Var.S(nVar3, (4294967295L & Float.floatToRawIntBits(f12)) | (Float.floatToRawIntBits(f11) << 32), l0.z(cVar), f10, gVar, 3);
                } else {
                    if (l0Var2 instanceof g0) {
                        g0 g0Var = (g0) l0Var2;
                        nVar = nVar3;
                        i0Var = g0Var.f19480f;
                        if (i0Var == null) {
                            d dVar = g0Var.e;
                            float f13 = dVar.f18768b;
                            float f14 = dVar.f18767a;
                            float intBitsToFloat = Float.intBitsToFloat((int) (dVar.f18773h >> 32));
                            float f15 = dVar.f18769c - f14;
                            float f16 = dVar.f18770d - f13;
                            l0Var.B(nVar, (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f16) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), f10, gVar);
                        }
                    } else if (l0Var2 instanceof e0) {
                        i0 i0Var2 = ((e0) l0Var2).e;
                        nVar = nVar3;
                        i0Var = i0Var2;
                    } else {
                        l4.a.o();
                        return;
                    }
                    l0Var.M(i0Var, nVar, f10, gVar, 3);
                }
            }
        }
        l0Var.b();
    }

    @Override // b2.q1
    public final void r0() {
        this.M = 9205357640488583168L;
        this.N = null;
        this.O = null;
        this.P = null;
        b2.l.k(this);
    }
}
