package z1;

import java.util.Map;

/* loaded from: classes.dex */
public final class w implements r0, t {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t f31901u;

    /* renamed from: v, reason: collision with root package name */
    public final y2.m f31902v;

    public w(t tVar, y2.m mVar) {
        this.f31901u = tVar;
        this.f31902v = mVar;
    }

    @Override // y2.c
    public final long B0(long j10) {
        return this.f31901u.B0(j10);
    }

    @Override // y2.c
    public final float D0(long j10) {
        return this.f31901u.D0(j10);
    }

    @Override // y2.c
    public final long R(float f10) {
        return this.f31901u.R(f10);
    }

    @Override // y2.c
    public final float Y(int i) {
        return this.f31901u.Y(i);
    }

    @Override // y2.c
    public final float a() {
        return this.f31901u.a();
    }

    @Override // y2.c
    public final float a0(float f10) {
        return this.f31901u.a0(f10);
    }

    @Override // z1.t
    public final y2.m getLayoutDirection() {
        return this.f31902v;
    }

    @Override // y2.c
    public final float i0() {
        return this.f31901u.i0();
    }

    @Override // z1.t
    public final boolean j0() {
        return this.f31901u.j0();
    }

    @Override // y2.c
    public final float l0(float f10) {
        return this.f31901u.l0(f10);
    }

    @Override // y2.c
    public final long o(float f10) {
        return this.f31901u.o(f10);
    }

    @Override // y2.c
    public final long p(long j10) {
        return this.f31901u.p(j10);
    }

    @Override // y2.c
    public final int t0(float f10) {
        return this.f31901u.t0(f10);
    }

    @Override // y2.c
    public final float x(long j10) {
        return this.f31901u.x(j10);
    }

    @Override // z1.r0
    public final q0 y(int i, int i10, Map map, df.l lVar, df.l lVar2) {
        int i11;
        int i12;
        if (i < 0) {
            i11 = 0;
        } else {
            i11 = i;
        }
        if (i10 < 0) {
            i12 = 0;
        } else {
            i12 = i10;
        }
        if ((i11 & (-16777216)) != 0 || ((-16777216) & i12) != 0) {
            y1.a.b("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new e(i11, i12, map, lVar, 1);
    }
}
