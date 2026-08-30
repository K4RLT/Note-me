package ya;
import b0.a;
import i0.a;
import k.a;
import b.a;
import p.t;
import a0.f0;
import j.i0;
import k1.b0;
import k1.b;
import k1.e0;
import k1.g0;
import k1.h;
import k1.k;
import k1.l0;
import k1.p;
import k1.s;
import m1.d;
import n.j0;
import n.q0;
import n0.o;
import vd.c;
import y2.m;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes.dex */
public abstract class b1 {
    public static final void a(d dVar, b bVar) {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        Canvas canvas;
        boolean z12;
        float f10;
        p j10 = dVar.p0().j();
        b bVar2 = (b) dVar.p0().f18637w;
        d dVar2 = bVar.f21013a;
        if (!bVar.f21029s) {
            bVar.a();
            if (!dVar2.n()) {
                try {
                    bVar.f21013a.L(bVar.f21014b, bVar.f21015c, bVar, bVar.e);
                } catch (Throwable unused) {
                }
            }
            if (dVar2.J() > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                j10.v();
            }
            Canvas a10 = b.a(j10);
            boolean isHardwareAccelerated = a10.isHardwareAccelerated();
            if (!isHardwareAccelerated) {
                long j11 = bVar.f21030t;
                float f11 = (int) (j11 >> 32);
                float f12 = (int) (j11 & 4294967295L);
                long j12 = bVar.f21031u;
                float f13 = ((int) (j12 >> 32)) + f11;
                float f14 = ((int) (j12 & 4294967295L)) + f12;
                float a11 = dVar2.a();
                s k3 = dVar2.k();
                int M = dVar2.M();
                if (a11 >= 1.0f && M == 3 && k3 == null && dVar2.j() != 1) {
                    a10.save();
                    a10 = a10;
                    f10 = f11;
                } else {
                    f0 f0Var = bVar.f21026p;
                    if (f0Var == null) {
                        f0Var = l0.i();
                        bVar.f21026p = f0Var;
                    }
                    f0Var.F(a11);
                    f0Var.G(M);
                    f0Var.I(k3);
                    a10 = a10;
                    f10 = f11;
                    a10.saveLayer(f10, f12, f13, f14, (Paint) f0Var.f48c);
                }
                a10.translate(f10, f12);
                a10.concat(dVar2.H());
            }
            if (!isHardwareAccelerated && bVar.f21033w) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                j10.l();
                l0 d2 = bVar.d();
                if (d2 instanceof f0) {
                    p.t(j10, ((f0) d2).e);
                } else if (d2 instanceof g0) {
                    h hVar = bVar.f21023m;
                    if (hVar != null) {
                        hVar.f19481a.rewind();
                    } else {
                        hVar = k.a();
                        bVar.f21023m = hVar;
                    }
                    i0.a(hVar, ((g0) d2).e);
                    j10.o(hVar, 1);
                } else if (d2 instanceof e0) {
                    j10.o(((e0) d2).e, 1);
                } else {
                    a.o();
                    return;
                }
            }
            if (bVar2 != null) {
                o oVar = bVar2.f21028r;
                if (!oVar.f21002a) {
                    b0.a("Only add dependencies during a tracking");
                }
                j0 j0Var = (j0) oVar.f21005d;
                if (j0Var != null) {
                    j0Var.a(bVar);
                } else if (((b) oVar.f21003b) != null) {
                    int i = q0.f20928a;
                    j0 j0Var2 = new j0();
                    b bVar3 = (b) oVar.f21003b;
                    bVar3.getClass();
                    j0Var2.a(bVar3);
                    j0Var2.a(bVar);
                    oVar.f21005d = j0Var2;
                    oVar.f21003b = null;
                } else {
                    oVar.f21003b = bVar;
                }
                j0 j0Var3 = (j0) oVar.e;
                if (j0Var3 != null) {
                    z12 = !j0Var3.l(bVar);
                } else if (((b) oVar.f21004c) != bVar) {
                    z12 = true;
                } else {
                    oVar.f21004c = null;
                    z12 = false;
                }
                if (z12) {
                    bVar.f21027q++;
                }
            }
            if (!((a) j10).f19463a.isHardwareAccelerated()) {
                b bVar4 = bVar.f21025o;
                if (bVar4 == null) {
                    bVar4 = new b();
                    bVar.f21025o = bVar4;
                }
                i0 i0Var = bVar4.f20424v;
                c cVar = bVar.f21014b;
                m mVar = bVar.f21015c;
                long c10 = c(bVar.f21031u);
                c l10 = i0Var.l();
                m o10 = i0Var.o();
                p j13 = i0Var.j();
                z11 = z9;
                canvas = a10;
                long r8 = i0Var.r();
                z10 = z3;
                b bVar5 = (b) i0Var.f18637w;
                i0Var.G(cVar);
                i0Var.H(mVar);
                i0Var.F(j10);
                i0Var.I(c10);
                i0Var.f18637w = bVar;
                j10.l();
                try {
                    bVar.c(bVar4);
                } finally {
                    j10.s();
                    i0Var.G(l10);
                    i0Var.H(o10);
                    i0Var.F(j13);
                    i0Var.I(r8);
                    i0Var.f18637w = bVar5;
                }
            } else {
                z10 = z3;
                z11 = z9;
                canvas = a10;
                dVar2.d(j10);
            }
            if (z11) {
                j10.s();
            }
            if (z10) {
                j10.m();
            }
            if (!isHardwareAccelerated) {
                canvas.restore();
            }
        }
    }
}
