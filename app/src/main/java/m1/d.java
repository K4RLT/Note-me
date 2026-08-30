package m1;

import java.util.ArrayList;
import k1.i;
import k1.i0;
import k1.n;
import k1.n0;
import k1.s;
import wa.u8;
import y2.m;

/* loaded from: classes.dex */
public interface d extends y2.c {
    static /* synthetic */ void C(d dVar, n0 n0Var, long j10, long j11, h hVar, int i) {
        e eVar = hVar;
        if ((i & 16) != 0) {
            eVar = g.f20429a;
        }
        dVar.s(n0Var, j10, j11, eVar);
    }

    static /* synthetic */ void D(d dVar, long j10, float f10, long j11, h hVar, int i) {
        int i10;
        if ((i & 4) != 0) {
            j11 = dVar.w0();
        }
        long j12 = j11;
        e eVar = hVar;
        if ((i & 16) != 0) {
            eVar = g.f20429a;
        }
        e eVar2 = eVar;
        if ((i & 64) != 0) {
            i10 = 3;
        } else {
            i10 = 12;
        }
        dVar.K(j10, f10, j12, eVar2, i10);
    }

    static /* synthetic */ void F(d dVar, k1.f fVar, long j10, float f10, s sVar, int i) {
        if ((i & 2) != 0) {
            j10 = 0;
        }
        long j11 = j10;
        if ((i & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i & 16) != 0) {
            sVar = null;
        }
        dVar.E0(fVar, j11, f11, sVar);
    }

    static void I0(d dVar, k1.f fVar, long j10, long j11, long j12, long j13, float f10, s sVar, int i, int i10) {
        long j14;
        long j15;
        long j16;
        float f11;
        s sVar2;
        int i11;
        if ((i10 & 2) != 0) {
            j14 = 0;
        } else {
            j14 = j10;
        }
        if ((i10 & 8) != 0) {
            j15 = 0;
        } else {
            j15 = j12;
        }
        if ((i10 & 16) != 0) {
            j16 = j11;
        } else {
            j16 = j13;
        }
        if ((i10 & 32) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i10 & 128) != 0) {
            sVar2 = null;
        } else {
            sVar2 = sVar;
        }
        if ((i10 & 512) != 0) {
            i11 = 1;
        } else {
            i11 = i;
        }
        dVar.c0(fVar, j14, j11, j15, j16, f11, sVar2, i11);
    }

    static /* synthetic */ void L(d dVar, n nVar, long j10, long j11, long j12, e eVar, int i) {
        long j13;
        e eVar2;
        if ((i & 2) != 0) {
            j10 = 0;
        }
        long j14 = j10;
        if ((i & 4) != 0) {
            j13 = b0(dVar.e(), j14);
        } else {
            j13 = j11;
        }
        if ((i & 32) != 0) {
            eVar2 = g.f20429a;
        } else {
            eVar2 = eVar;
        }
        dVar.B(nVar, j14, j13, j12, 1.0f, eVar2);
    }

    static long b0(long j10, long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static /* synthetic */ void d0(d dVar, long j10, long j11, long j12, h hVar, int i) {
        e eVar;
        if ((i & 16) != 0) {
            eVar = g.f20429a;
        } else {
            eVar = hVar;
        }
        dVar.v0(j10, j11, j12, eVar);
    }

    static /* synthetic */ void g0(d dVar, i0 i0Var, n nVar, float f10, h hVar, int i) {
        int i10;
        if ((i & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        e eVar = hVar;
        if ((i & 8) != 0) {
            eVar = g.f20429a;
        }
        e eVar2 = eVar;
        if ((i & 32) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        dVar.M(i0Var, nVar, f11, eVar2, i10);
    }

    static /* synthetic */ void n0(d dVar, long j10, long j11, long j12, float f10, int i, i iVar, int i10) {
        int i11;
        i iVar2;
        if ((i10 & 16) != 0) {
            i11 = 0;
        } else {
            i11 = i;
        }
        if ((i10 & 32) != 0) {
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        dVar.T(j10, j11, j12, f10, i11, iVar2);
    }

    static /* synthetic */ void o0(d dVar, k1.h hVar, long j10, h hVar2, int i) {
        e eVar = hVar2;
        if ((i & 8) != 0) {
            eVar = g.f20429a;
        }
        dVar.J0(hVar, j10, eVar);
    }

    static /* synthetic */ void q(d dVar, n nVar, long j10, long j11, float f10, e eVar, int i, int i10) {
        long j12;
        float f11;
        e eVar2;
        int i11;
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j13 = j10;
        if ((i10 & 4) != 0) {
            j12 = b0(dVar.e(), j13);
        } else {
            j12 = j11;
        }
        if ((i10 & 8) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i10 & 16) != 0) {
            eVar2 = g.f20429a;
        } else {
            eVar2 = eVar;
        }
        if ((i10 & 64) != 0) {
            i11 = 3;
        } else {
            i11 = i;
        }
        dVar.S(nVar, j13, j12, f11, eVar2, i11);
    }

    static /* synthetic */ void s0(d dVar, n nVar, long j10, long j11, float f10, float f11, int i) {
        int i10;
        float f12;
        int i11;
        if ((i & 16) != 0) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        int i12 = i10;
        if ((i & 64) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f11;
        }
        if ((i & 256) != 0) {
            i11 = 3;
        } else {
            i11 = 12;
        }
        dVar.I(nVar, j10, j11, f10, i12, f12, i11);
    }

    static /* synthetic */ void t(d dVar, long j10, long j11, long j12, float f10, h hVar, int i) {
        long j13;
        long j14;
        float f11;
        e eVar;
        int i10;
        if ((i & 2) != 0) {
            j13 = 0;
        } else {
            j13 = j11;
        }
        if ((i & 4) != 0) {
            j14 = b0(dVar.e(), j13);
        } else {
            j14 = j12;
        }
        if ((i & 8) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i & 16) != 0) {
            eVar = g.f20429a;
        } else {
            eVar = hVar;
        }
        if ((i & 64) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        dVar.k0(j10, j13, j14, f11, eVar, i10);
    }

    static /* synthetic */ void y0(d dVar, n nVar, float f10, long j10, float f11, h hVar, int i) {
        int i10;
        if ((i & 2) != 0) {
            f10 = j1.e.c(dVar.e()) / 2.0f;
        }
        float f12 = f10;
        if ((i & 4) != 0) {
            j10 = dVar.w0();
        }
        long j11 = j10;
        if ((i & 8) != 0) {
            f11 = 1.0f;
        }
        float f13 = f11;
        e eVar = hVar;
        if ((i & 16) != 0) {
            eVar = g.f20429a;
        }
        e eVar2 = eVar;
        if ((i & 64) != 0) {
            i10 = 3;
        } else {
            i10 = 12;
        }
        dVar.w(nVar, f12, j11, f13, eVar2, i10);
    }

    static /* synthetic */ void z0(d dVar, long j10, long j11, long j12, long j13, e eVar, int i) {
        long j14;
        long j15;
        e eVar2;
        if ((i & 2) != 0) {
            j14 = 0;
        } else {
            j14 = j11;
        }
        if ((i & 4) != 0) {
            j15 = b0(dVar.e(), j14);
        } else {
            j15 = j12;
        }
        if ((i & 16) != 0) {
            eVar2 = g.f20429a;
        } else {
            eVar2 = eVar;
        }
        dVar.G(j10, j14, j15, j13, eVar2);
    }

    void B(n nVar, long j10, long j11, long j12, float f10, e eVar);

    void E0(k1.f fVar, long j10, float f10, s sVar);

    void G(long j10, long j11, long j12, long j13, e eVar);

    void I(n nVar, long j10, long j11, float f10, int i, float f11, int i10);

    void J0(i0 i0Var, long j10, e eVar);

    void K(long j10, float f10, long j11, e eVar, int i);

    void M(i0 i0Var, n nVar, float f10, e eVar, int i);

    void N(long j10, float f10, float f11, long j11, long j12, e eVar);

    void S(n nVar, long j10, long j11, float f10, e eVar, int i);

    void T(long j10, long j11, long j12, float f10, int i, i iVar);

    void c0(k1.f fVar, long j10, long j11, long j12, long j13, float f10, s sVar, int i);

    default long e() {
        return p0().r();
    }

    m getLayoutDirection();

    void k0(long j10, long j11, long j12, float f10, e eVar, int i);

    void m0(float f10, long j10, ArrayList arrayList);

    j.i0 p0();

    void s(n0 n0Var, long j10, long j11, e eVar);

    void v0(long j10, long j11, long j12, e eVar);

    void w(n nVar, float f10, long j10, float f11, e eVar, int i);

    default long w0() {
        return u8.b(p0().r());
    }
}
