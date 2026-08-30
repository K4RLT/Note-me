package z1;
import j.b;
import j.c;
import j1.b;
import j1.c;

import ya.td;

/* loaded from: classes.dex */
public final class l0 implements x {

    /* renamed from: u, reason: collision with root package name */
    public final b2.s0 f31846u;

    public l0(b2.s0 s0Var) {
        this.f31846u = s0Var;
    }

    @Override // z1.x
    public final void A(x xVar, float[] fArr) {
        this.f31846u.I.A(xVar, fArr);
    }

    @Override // z1.x
    public final long E(long j10) {
        return b.h(this.f31846u.I.E(j10), a());
    }

    @Override // z1.x
    public final x J() {
        b2.s0 f12;
        if (!i()) {
            y1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        b2.k1 k1Var = ((b2.k1) this.f31846u.I.I.Z.f1459y).M;
        if (k1Var != null && (f12 = k1Var.f1()) != null) {
            return f12.L;
        }
        return null;
    }

    @Override // z1.x
    public final long U(long j10) {
        return b.h(this.f31846u.I.U(j10), a());
    }

    @Override // z1.x
    public final long W(long j10) {
        return this.f31846u.I.W(b.h(j10, a()));
    }

    public final long a() {
        b2.s0 s0Var = this.f31846u;
        b2.s0 j10 = h1.j(s0Var);
        return b.g(b(j10.L, 0L), s0Var.I.q1(j10.I, 0L));
    }

    public final long b(x xVar, long j10) {
        boolean z3 = xVar instanceof l0;
        b2.s0 s0Var = this.f31846u;
        if (z3) {
            b2.s0 s0Var2 = ((l0) xVar).f31846u;
            b2.k1 k1Var = s0Var2.I;
            k1Var.r1();
            b2.s0 f12 = s0Var.I.d1(k1Var).f1();
            if (f12 != null) {
                long b10 = y2.b(y2.c(s0Var2.a1(f12, false), td.b(j10)), s0Var.a1(f12, false));
                return (Float.floatToRawIntBits((int) (b10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (b10 & 4294967295L)) & 4294967295L);
            }
            b2.s0 j11 = h1.j(s0Var2);
            long c10 = y2.c(y2.c(s0Var2.a1(j11, false), j11.J), td.b(j10));
            b2.s0 j12 = h1.j(s0Var);
            long b11 = y2.b(c10, y2.c(s0Var.a1(j12, false), j12.J));
            long floatToRawIntBits = Float.floatToRawIntBits((int) (b11 >> 32));
            long floatToRawIntBits2 = Float.floatToRawIntBits((int) (b11 & 4294967295L)) & 4294967295L;
            b2.k1 k1Var2 = j12.I.M;
            k1Var2.getClass();
            b2.k1 k1Var3 = j11.I.M;
            k1Var3.getClass();
            return k1Var2.q1(k1Var3, floatToRawIntBits2 | (floatToRawIntBits << 32));
        }
        b2.s0 j13 = h1.j(s0Var);
        b2.k1 k1Var4 = j13.I;
        long b12 = b(j13.L, j10);
        long j14 = j13.J;
        long g8 = b.g(b12, (4294967295L & Float.floatToRawIntBits((int) (j14 & 4294967295L))) | (Float.floatToRawIntBits((int) (j14 >> 32)) << 32));
        if (!k1Var4.h1().H) {
            y1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        k1Var4.r1();
        b2.k1 k1Var5 = k1Var4.M;
        if (k1Var5 != null) {
            k1Var4 = k1Var5;
        }
        return b.h(g8, k1Var4.q1(xVar, 0L));
    }

    @Override // z1.x
    public final long d(x xVar, long j10) {
        return b(xVar, j10);
    }

    @Override // z1.x
    public final long f(long j10) {
        return this.f31846u.I.f(b.h(j10, a()));
    }

    @Override // z1.x
    public final boolean i() {
        return this.f31846u.I.h1().H;
    }

    @Override // z1.x
    public final void j(float[] fArr) {
        this.f31846u.I.j(fArr);
    }

    @Override // z1.x
    public final long k() {
        b2.s0 s0Var = this.f31846u;
        return (s0Var.f31769u << 32) | (s0Var.f31770v & 4294967295L);
    }

    @Override // z1.x
    public final c u(x xVar, boolean z3) {
        return this.f31846u.I.u(xVar, z3);
    }

    @Override // z1.x
    public final long v(long j10) {
        return this.f31846u.I.v(b.h(0L, a()));
    }
}
