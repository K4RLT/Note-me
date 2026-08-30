package b2;
import c2.x;
import d1.q;
import j.i0;
import k1.f;
import k1.i0;
import k1.i;
import k1.n0;
import k1.n;
import k1.p;
import k1.s;
import l.e;
import m1.b;
import m1.d;
import m1.e;
import n1.b;
import t0.e;

import com.google.android.gms.internal.ads.wd0;
import java.util.ArrayList;
import ya.vd;

/* loaded from: classes.dex */
public final class l0 implements d {

    /* renamed from: u, reason: collision with root package name */
    public final b f1533u = new b();

    /* renamed from: v, reason: collision with root package name */
    public n f1534v;

    @Override // d
    public final void B(n nVar, long j10, long j11, long j12, float f10, e eVar) {
        this.f1533u.B(nVar, j10, j11, j12, f10, eVar);
    }

    @Override // y2.c
    public final long B0(long j10) {
        return this.f1533u.B0(j10);
    }

    @Override // y2.c
    public final float D0(long j10) {
        return this.f1533u.D0(j10);
    }

    @Override // d
    public final void E0(f fVar, long j10, float f10, s sVar) {
        this.f1533u.E0(fVar, j10, f10, sVar);
    }

    @Override // d
    public final void G(long j10, long j11, long j12, long j13, e eVar) {
        this.f1533u.G(j10, j11, j12, j13, eVar);
    }

    @Override // d
    public final void I(n nVar, long j10, long j11, float f10, int i, float f11, int i10) {
        this.f1533u.I(nVar, j10, j11, f10, i, f11, i10);
    }

    @Override // d
    public final void J0(i0 i0Var, long j10, e eVar) {
        this.f1533u.J0(i0Var, j10, eVar);
    }

    @Override // d
    public final void K(long j10, float f10, long j11, e eVar, int i) {
        this.f1533u.K(j10, f10, j11, eVar, i);
    }

    @Override // d
    public final void M(i0 i0Var, n nVar, float f10, e eVar, int i) {
        this.f1533u.M(i0Var, nVar, f10, eVar, i);
    }

    @Override // d
    public final void N(long j10, float f10, float f11, long j11, long j12, e eVar) {
        this.f1533u.N(j10, f10, f11, j11, j12, eVar);
    }

    @Override // y2.c
    public final long R(float f10) {
        return this.f1533u.R(f10);
    }

    @Override // d
    public final void S(n nVar, long j10, long j11, float f10, e eVar, int i) {
        this.f1533u.S(nVar, j10, j11, f10, eVar, i);
    }

    @Override // d
    public final void T(long j10, long j11, long j12, float f10, int i, i iVar) {
        this.f1533u.T(j10, j11, j12, f10, i, iVar);
    }

    @Override // y2.c
    public final float Y(int i) {
        return this.f1533u.Y(i);
    }

    @Override // y2.c
    public final float a() {
        return this.f1533u.a();
    }

    @Override // y2.c
    public final float a0(float f10) {
        return f10 / this.f1533u.a();
    }

    public final void b() {
        b bVar = this.f1533u;
        p j10 = bVar.f20424v.j();
        j jVar = this.f1534v;
        if (jVar != null) {
            q qVar = (q) jVar;
            q qVar2 = qVar.f15688u.f15693z;
            if (qVar2 != null && (qVar2.f15691x & 4) != 0) {
                while (qVar2 != null) {
                    int i = qVar2.f15690w;
                    if ((i & 2) != 0) {
                        break;
                    } else if ((i & 4) != 0) {
                        break;
                    } else {
                        qVar2 = qVar2.f15693z;
                    }
                }
            }
            qVar2 = null;
            if (qVar2 != null) {
                e eVar = null;
                while (qVar2 != null) {
                    if (qVar2 instanceof n) {
                        n nVar = (n) qVar2;
                        b bVar2 = (b) bVar.f20424v.f18637w;
                        k1 s10 = l.s(nVar, 4);
                        long c10 = vd.c(s10.f31771w);
                        i0 i0Var = s10.I;
                        i0Var.getClass();
                        ((x) m0.a(i0Var)).getSharedDrawScope().c(j10, c10, s10, nVar, bVar2);
                    } else if ((qVar2.f15690w & 4) != 0 && (qVar2 instanceof k)) {
                        int i10 = 0;
                        for (q qVar3 = ((k) qVar2).J; qVar3 != null; qVar3 = qVar3.f15693z) {
                            if ((qVar3.f15690w & 4) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    qVar2 = qVar3;
                                } else {
                                    if (eVar == null) {
                                        eVar = new e(new q[16]);
                                    }
                                    if (qVar2 != null) {
                                        eVar.b(qVar2);
                                        qVar2 = null;
                                    }
                                    eVar.b(qVar3);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                    qVar2 = e(eVar);
                }
                return;
            }
            k1 s11 = l.s(jVar, 4);
            if (s11.h1() == qVar.f15688u) {
                s11 = s11.L;
                s11.getClass();
            }
            s11.v1(j10, (b) bVar.f20424v.f18637w);
            return;
        }
        throw wd0.m("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
    }

    public final void c(p pVar, long j10, k1 k1Var, n nVar, b bVar) {
        n nVar2 = this.f1534v;
        this.f1534v = nVar;
        y2.m mVar = k1Var.I.T;
        b bVar2 = this.f1533u;
        y2.c l10 = bVar2.f20424v.l();
        i0 i0Var = bVar2.f20424v;
        y2.m o10 = i0Var.o();
        p j11 = i0Var.j();
        long r8 = i0Var.r();
        b bVar3 = (b) i0Var.f18637w;
        i0Var.G(k1Var);
        i0Var.H(mVar);
        i0Var.F(pVar);
        i0Var.I(j10);
        i0Var.f18637w = bVar;
        pVar.l();
        try {
            nVar.e0(this);
            pVar.s();
            i0Var.G(l10);
            i0Var.H(o10);
            i0Var.F(j11);
            i0Var.I(r8);
            i0Var.f18637w = bVar3;
            this.f1534v = nVar2;
        } catch (Throwable th) {
            pVar.s();
            i0Var.G(l10);
            i0Var.H(o10);
            i0Var.F(j11);
            i0Var.I(r8);
            i0Var.f18637w = bVar3;
            throw th;
        }
    }

    @Override // d
    public final void c0(f fVar, long j10, long j11, long j12, long j13, float f10, s sVar, int i) {
        this.f1533u.c0(fVar, j10, j11, j12, j13, f10, sVar, i);
    }

    @Override // d
    public final long e() {
        return this.f1533u.e();
    }

    @Override // d
    public final y2.m getLayoutDirection() {
        return this.f1533u.f20423u.f20420b;
    }

    @Override // y2.c
    public final float i0() {
        return this.f1533u.i0();
    }

    @Override // d
    public final void k0(long j10, long j11, long j12, float f10, e eVar, int i) {
        this.f1533u.k0(j10, j11, j12, f10, eVar, i);
    }

    @Override // y2.c
    public final float l0(float f10) {
        return this.f1533u.a() * f10;
    }

    @Override // d
    public final void m0(float f10, long j10, ArrayList arrayList) {
        this.f1533u.m0(f10, j10, arrayList);
    }

    @Override // y2.c
    public final long o(float f10) {
        return this.f1533u.o(f10);
    }

    @Override // y2.c
    public final long p(long j10) {
        return this.f1533u.p(j10);
    }

    @Override // d
    public final i0 p0() {
        return this.f1533u.f20424v;
    }

    @Override // d
    public final void s(n0 n0Var, long j10, long j11, e eVar) {
        this.f1533u.s(n0Var, j10, j11, eVar);
    }

    @Override // y2.c
    public final int t0(float f10) {
        return this.f1533u.t0(f10);
    }

    @Override // d
    public final void v0(long j10, long j11, long j12, e eVar) {
        this.f1533u.v0(j10, j11, j12, eVar);
    }

    @Override // d
    public final void w(n nVar, float f10, long j10, float f11, e eVar, int i) {
        this.f1533u.w(nVar, f10, j10, f11, eVar, i);
    }

    @Override // d
    public final long w0() {
        return this.f1533u.w0();
    }

    @Override // y2.c
    public final float x(long j10) {
        return this.f1533u.x(j10);
    }
}
