package h1;
import a.a;
import b.b;

import b2.l0;
import b2.n;
import b2.r0;
import b2.x;
import d1.q;
import k1.s;
import qe.t;
import z1.a1;
import z1.h1;
import z1.o0;
import z1.q0;
import z1.u0;

/* loaded from: classes.dex */
public final class h extends q implements x, n {
    public p1.b I;
    public boolean J;
    public d1.e K;
    public u0 L;
    public float M;
    public s N;

    public static boolean Z0(long j10) {
        if (!j1.e.a(j10, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    public static boolean a1(long j10) {
        if (!j1.e.a(j10, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    @Override // b2.x
    public final int A(r0 r0Var, o0 o0Var, int i) {
        if (Y0()) {
            long b12 = b1(y2.b(i, 0, 13));
            return Math.max(y2.a.i(b12), o0Var.c(i));
        }
        return o0Var.c(i);
    }

    @Override // b2.x
    public final int J(r0 r0Var, o0 o0Var, int i) {
        if (Y0()) {
            long b12 = b1(y2.b(0, i, 7));
            return Math.max(y2.a.j(b12), o0Var.n(i));
        }
        return o0Var.n(i);
    }

    @Override // d1.q
    public final boolean N0() {
        return false;
    }

    public final boolean Y0() {
        if (this.J && this.I.d() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    public final long b1(long j10) {
        boolean z3;
        int j11;
        int i;
        float intBitsToFloat;
        float intBitsToFloat2;
        boolean z9 = false;
        if (y2.a.d(j10) && y2.a.c(j10)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (y2.a.f(j10) && y2.a.e(j10)) {
            z9 = true;
        }
        if ((!Y0() && z3) || z9) {
            return y2.a(j10, y2.a.h(j10), 0, y2.a.g(j10), 0, 10);
        }
        long d2 = this.I.d();
        if (a1(d2)) {
            j11 = Math.round(Float.intBitsToFloat((int) (d2 >> 32)));
        } else {
            j11 = y2.a.j(j10);
        }
        if (Z0(d2)) {
            i = Math.round(Float.intBitsToFloat((int) (d2 & 4294967295L)));
        } else {
            i = y2.a.i(j10);
        }
        int g8 = y2.b.g(j11, j10);
        float f10 = y2.b.f(i, j10);
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(g8) << 32);
        if (Y0()) {
            if (!a1(this.I.d())) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (this.I.d() >> 32));
            }
            if (!Z0(this.I.d())) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            } else {
                intBitsToFloat2 = Float.intBitsToFloat((int) (this.I.d() & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
            if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) {
                floatToRawIntBits = 0;
            } else {
                floatToRawIntBits = h1.k(floatToRawIntBits2, this.L.b(floatToRawIntBits2, floatToRawIntBits));
            }
        }
        return y2.a(j10, y2.b.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j10), 0, y2.b.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j10), 0, 10);
    }

    @Override // b2.x
    public final q0 c(z1.r0 r0Var, o0 o0Var, long j10) {
        a1 z3 = o0Var.z(b1(j10));
        return r0Var.u0(z3.f31769u, z3.f31770v, t.f24024u, new b0.n(z3, 3));
    }

    @Override // b2.n
    public final void e0(l0 l0Var) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j10;
        m1.b bVar = l0Var.f1533u;
        long d2 = this.I.d();
        if (a1(d2)) {
            intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (bVar.e() >> 32));
        }
        if (Z0(d2)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        } else {
            intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.e() & 4294967295L));
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        if (Float.intBitsToFloat((int) (bVar.e() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.e() & 4294967295L)) == 0.0f) {
            j10 = 0;
        } else {
            j10 = h1.k(floatToRawIntBits, this.L.b(floatToRawIntBits, bVar.e()));
        }
        long a10 = this.K.a((Math.round(Float.intBitsToFloat((int) (j10 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (bVar.e() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bVar.e() & 4294967295L))) & 4294967295L), l0Var.getLayoutDirection());
        float f10 = (int) (a10 >> 32);
        float f11 = (int) (a10 & 4294967295L);
        ((ic.c) bVar.f20424v.f18636v).D(f10, f11);
        try {
            this.I.c(l0Var, j10, this.M, this.N);
            ((ic.c) bVar.f20424v.f18636v).D(-f10, -f11);
            l0Var.b();
        } catch (Throwable th) {
            ((ic.c) bVar.f20424v.f18636v).D(-f10, -f11);
            throw th;
        }
    }

    @Override // b2.x
    public final int n(r0 r0Var, o0 o0Var, int i) {
        if (Y0()) {
            long b12 = b1(y2.b(i, 0, 13));
            return Math.max(y2.a.i(b12), o0Var.Z(i));
        }
        return o0Var.Z(i);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.I + ", sizeToIntrinsics=" + this.J + ", alignment=" + this.K + ", alpha=" + this.M + ", colorFilter=" + this.N + ')';
    }

    @Override // b2.x
    public final int v(r0 r0Var, o0 o0Var, int i) {
        if (Y0()) {
            long b12 = b1(y2.b(0, i, 7));
            return Math.max(y2.a.j(b12), o0Var.l(i));
        }
        return o0Var.l(i);
    }
}
