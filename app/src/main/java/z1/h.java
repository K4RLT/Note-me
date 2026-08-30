package z1;
import p.y0;

import java.util.Map;

/* loaded from: classes.dex */
public final class h implements g, r0, m0 {

    /* renamed from: u, reason: collision with root package name */
    public final b2.a0 f31817u;

    /* renamed from: v, reason: collision with root package name */
    public y0 f31818v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31819w;

    public h(b2.a0 a0Var, y0 y0Var) {
        this.f31817u = a0Var;
        this.f31818v = y0Var;
    }

    @Override // y2.c
    public final long B0(long j10) {
        return this.f31817u.B0(j10);
    }

    @Override // y2.c
    public final float D0(long j10) {
        return this.f31817u.D0(j10);
    }

    @Override // y2.c
    public final long R(float f10) {
        return this.f31817u.R(f10);
    }

    @Override // y2.c
    public final float Y(int i) {
        return this.f31817u.Y(i);
    }

    @Override // y2.c
    public final float a() {
        return this.f31817u.a();
    }

    @Override // y2.c
    public final float a0(float f10) {
        return f10 / this.f31817u.a();
    }

    @Override // z1.m0
    public final x b(b2.k1 k1Var) {
        l0 l0Var;
        b2.s0 f12 = k1Var.f1();
        if (f12 != null && (l0Var = f12.L) != null) {
            return l0Var;
        }
        return k1Var;
    }

    @Override // z1.t
    public final y2.m getLayoutDirection() {
        return this.f31817u.I.T;
    }

    @Override // y2.c
    public final float i0() {
        return this.f31817u.i0();
    }

    @Override // z1.t
    public final boolean j0() {
        return false;
    }

    @Override // y2.c
    public final float l0(float f10) {
        return this.f31817u.a() * f10;
    }

    @Override // y2.c
    public final long o(float f10) {
        return this.f31817u.o(f10);
    }

    @Override // y2.c
    public final long p(long j10) {
        return this.f31817u.p(j10);
    }

    @Override // y2.c
    public final int t0(float f10) {
        return this.f31817u.t0(f10);
    }

    @Override // z1.r0
    public final q0 u0(int i, int i10, Map map, df.l lVar) {
        return this.f31817u.y(i, i10, map, null, lVar);
    }

    @Override // y2.c
    public final float x(long j10) {
        return this.f31817u.x(j10);
    }

    @Override // z1.r0
    public final q0 y(int i, int i10, Map map, df.l lVar, df.l lVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            y1.a.b("Size(" + i + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new b2.q0(i, i10, map, lVar, lVar2, this, 1);
    }
}
