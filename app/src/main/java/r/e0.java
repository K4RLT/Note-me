package r;
import c0.e;
import j.i0;
import k1.a;
import k1.b;
import k1.p;
import l.c;
import t.z0;
import x.j0;
import z.f;
import z.g;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class e0 extends b2.k implements b2.n {
    public final /* synthetic */ int K = 1;
    public final f L;
    public final z M;
    public Object N;

    public e0(v1.h0 h0Var, f fVar, z zVar, j0 j0Var) {
        this.L = fVar;
        this.M = zVar;
        this.N = j0Var;
        Y0(h0Var);
    }

    public static boolean b1(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f10);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean c1(float f10, long j10, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f10);
        canvas.translate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode d1() {
        RenderNode renderNode = (RenderNode) this.N;
        if (renderNode == null) {
            RenderNode e = q3.e();
            this.N = e;
            return e;
        }
        return renderNode;
    }

    @Override // b2.n
    public final void e0(b2.l0 l0Var) {
        boolean z3;
        char c10;
        long j10;
        boolean z9;
        boolean z10;
        RecordingCanvas beginRecording;
        float f10;
        boolean z11;
        boolean z12;
        f fVar;
        RecordingCanvas recordingCanvas;
        char c11;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z13;
        float f15;
        boolean z14;
        float f16;
        boolean z15;
        float f17;
        float f18;
        switch (this.K) {
            case 0:
                j0 j0Var = (j0) this.N;
                b bVar = l0Var.f1533u;
                long e = bVar.e();
                f fVar2 = this.L;
                fVar2.i(e);
                if (e.e(bVar.e())) {
                    l0Var.b();
                    return;
                }
                l0Var.b();
                fVar2.f24067d.getValue();
                Canvas a10 = b.a(bVar.f20424v.j());
                z zVar = this.M;
                boolean z16 = false;
                if (f(zVar.f24170f)) {
                    EdgeEffect c12 = zVar.c();
                    float f19 = -Float.intBitsToFloat((int) (bVar.e() & 4294967295L));
                    float l0 = l0Var.l0(j0Var.b(l0Var.getLayoutDirection()));
                    z3 = c1(270.0f, (Float.floatToRawIntBits(l0) & 4294967295L) | (Float.floatToRawIntBits(f19) << 32), c12, a10);
                } else {
                    z3 = false;
                }
                if (f(zVar.f24169d)) {
                    EdgeEffect e8 = zVar.e();
                    float l02 = l0Var.l0(j0Var.d());
                    c10 = ' ';
                    j10 = 4294967295L;
                    if (!c1(0.0f, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(l02) & 4294967295L), e8, a10) && !z3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else {
                    c10 = ' ';
                    j10 = 4294967295L;
                }
                if (f(zVar.f24171g)) {
                    EdgeEffect d2 = zVar.d();
                    float l03 = l0Var.l0(j0Var.a(l0Var.getLayoutDirection())) + (-ff.a.b(Float.intBitsToFloat((int) (bVar.e() >> c10))));
                    if (!c1(90.0f, (Float.floatToRawIntBits(l03) & j10) | (Float.floatToRawIntBits(0.0f) << c10), d2, a10) && !z3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                }
                if (f(zVar.e)) {
                    EdgeEffect b10 = zVar.b();
                    float l04 = l0Var.l0(j0Var.c());
                    float f20 = -Float.intBitsToFloat((int) (bVar.e() >> c10));
                    float f21 = (-Float.intBitsToFloat((int) (bVar.e() & j10))) + l04;
                    if (c1(180.0f, (Float.floatToRawIntBits(f21) & j10) | (Float.floatToRawIntBits(f20) << c10), b10, a10) || z3) {
                        z16 = true;
                    }
                    z3 = z16;
                }
                if (z3) {
                    fVar2.d();
                    return;
                }
                return;
            default:
                b bVar2 = l0Var.f1533u;
                long e10 = bVar2.e();
                f fVar3 = this.L;
                fVar3.i(e10);
                Canvas a11 = b.a(bVar2.f20424v.j());
                fVar3.f24067d.getValue();
                if (e.e(bVar2.e())) {
                    l0Var.b();
                    return;
                }
                boolean isHardwareAccelerated = a11.isHardwareAccelerated();
                z zVar2 = this.M;
                if (!isHardwareAccelerated) {
                    EdgeEffect edgeEffect = zVar2.f24169d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = zVar2.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = zVar2.f24170f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = zVar2.f24171g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = zVar2.f24172h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = zVar2.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = zVar2.f24173j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = zVar2.f24174k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    l0Var.b();
                    return;
                }
                float l05 = l0Var.l0(s.f24144a);
                if (!f(zVar2.f24169d) && !g(zVar2.f24172h) && !f(zVar2.e) && !g(zVar2.i)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (!f(zVar2.f24170f) && !g(zVar2.f24173j) && !f(zVar2.f24171g) && !g(zVar2.f24174k)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z9 && z10) {
                    d1().setPosition(0, 0, a11.getWidth(), a11.getHeight());
                } else if (z9) {
                    d1().setPosition(0, 0, (ff.a.b(l05) * 2) + a11.getWidth(), a11.getHeight());
                } else if (z10) {
                    d1().setPosition(0, 0, a11.getWidth(), (ff.a.b(l05) * 2) + a11.getHeight());
                } else {
                    l0Var.b();
                    return;
                }
                beginRecording = d1().beginRecording();
                boolean g8 = g(zVar2.f24173j);
                z0 z0Var = z0.f25598v;
                if (g8) {
                    EdgeEffect edgeEffect9 = zVar2.f24173j;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = zVar2.a(z0Var);
                        zVar2.f24173j = edgeEffect9;
                    }
                    b1(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (f(zVar2.f24170f)) {
                    EdgeEffect c13 = zVar2.c();
                    z12 = b1(270.0f, c13, beginRecording);
                    if (g(zVar2.f24170f)) {
                        z11 = z10;
                        float intBitsToFloat = Float.intBitsToFloat((int) (fVar3.c() & 4294967295L));
                        EdgeEffect edgeEffect10 = zVar2.f24173j;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = zVar2.a(z0Var);
                            zVar2.f24173j = edgeEffect10;
                        }
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            f18 = f3.b(c13);
                        } else {
                            f18 = 0.0f;
                        }
                        f10 = l05;
                        float f22 = 1 - intBitsToFloat;
                        if (i >= 31) {
                            f3.c(edgeEffect10, f18, f22);
                        } else {
                            edgeEffect10.onPull(f18, f22);
                        }
                    } else {
                        f10 = l05;
                        z11 = z10;
                    }
                } else {
                    f10 = l05;
                    z11 = z10;
                    z12 = false;
                }
                boolean g10 = g(zVar2.f24172h);
                z0 z0Var2 = z0.f25597u;
                if (g10) {
                    EdgeEffect edgeEffect11 = zVar2.f24172h;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = zVar2.a(z0Var2);
                        zVar2.f24172h = edgeEffect11;
                    }
                    b1(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (f(zVar2.f24169d)) {
                    EdgeEffect e11 = zVar2.e();
                    if (!b1(0.0f, e11, beginRecording) && !z12) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (g(zVar2.f24169d)) {
                        recordingCanvas = beginRecording;
                        c11 = ' ';
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (fVar3.c() >> 32));
                        EdgeEffect edgeEffect12 = zVar2.f24172h;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = zVar2.a(z0Var2);
                            zVar2.f24172h = edgeEffect12;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            fVar = fVar3;
                            f17 = f3.b(e11);
                        } else {
                            fVar = fVar3;
                            f17 = 0.0f;
                        }
                        if (i10 >= 31) {
                            f3.c(edgeEffect12, f17, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(f17, intBitsToFloat2);
                        }
                    } else {
                        fVar = fVar3;
                        recordingCanvas = beginRecording;
                        c11 = ' ';
                    }
                    z12 = z15;
                } else {
                    fVar = fVar3;
                    recordingCanvas = beginRecording;
                    c11 = ' ';
                }
                if (g(zVar2.f24174k)) {
                    EdgeEffect edgeEffect13 = zVar2.f24174k;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = zVar2.a(z0Var);
                        zVar2.f24174k = edgeEffect13;
                    }
                    b1(270.0f, edgeEffect13, recordingCanvas);
                    edgeEffect13.finish();
                }
                if (f(zVar2.f24171g)) {
                    EdgeEffect d10 = zVar2.d();
                    if (!b1(90.0f, d10, recordingCanvas) && !z12) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (g(zVar2.f24171g)) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (fVar.c() & 4294967295L));
                        EdgeEffect edgeEffect14 = zVar2.f24174k;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = zVar2.a(z0Var);
                            zVar2.f24174k = edgeEffect14;
                        }
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 31) {
                            f16 = f3.b(d10);
                        } else {
                            f16 = 0.0f;
                        }
                        if (i11 >= 31) {
                            f3.c(edgeEffect14, f16, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(f16, intBitsToFloat3);
                        }
                    }
                    z12 = z14;
                }
                if (g(zVar2.i)) {
                    EdgeEffect edgeEffect15 = zVar2.i;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = zVar2.a(z0Var2);
                        zVar2.i = edgeEffect15;
                    }
                    f11 = 0.0f;
                    b1(0.0f, edgeEffect15, recordingCanvas);
                    edgeEffect15.finish();
                } else {
                    f11 = 0.0f;
                }
                if (f(zVar2.e)) {
                    EdgeEffect b11 = zVar2.b();
                    if (!b1(180.0f, b11, recordingCanvas) && !z12) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (g(zVar2.e)) {
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (fVar.c() >> c11));
                        EdgeEffect edgeEffect16 = zVar2.i;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = zVar2.a(z0Var2);
                            zVar2.i = edgeEffect16;
                        }
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 31) {
                            f15 = f3.b(b11);
                        } else {
                            f15 = f11;
                        }
                        float f23 = 1 - intBitsToFloat4;
                        if (i12 >= 31) {
                            f3.c(edgeEffect16, f15, f23);
                        } else {
                            edgeEffect16.onPull(f15, f23);
                        }
                    }
                    z12 = z13;
                }
                if (z12) {
                    fVar.d();
                }
                if (z11) {
                    f12 = f11;
                } else {
                    f12 = f10;
                }
                if (!z9) {
                    f11 = f10;
                }
                y2.m layoutDirection = l0Var.getLayoutDirection();
                a aVar = new a();
                aVar.f19463a = recordingCanvas;
                long e12 = bVar2.e();
                y2.c l10 = bVar2.f20424v.l();
                y2.m o10 = bVar2.f20424v.o();
                p j11 = bVar2.f20424v.j();
                long r8 = bVar2.f20424v.r();
                i0 i0Var = bVar2.f20424v;
                b bVar3 = (b) i0Var.f18637w;
                i0Var.G(l0Var);
                i0Var.H(layoutDirection);
                i0Var.F(aVar);
                i0Var.I(e12);
                i0Var.f18637w = null;
                aVar.l();
                try {
                    ((ic.c) bVar2.f20424v.f18636v).D(f12, f11);
                    try {
                        l0Var.b();
                        aVar.s();
                        i0 i0Var2 = bVar2.f20424v;
                        i0Var2.G(l10);
                        i0Var2.H(o10);
                        i0Var2.F(j11);
                        i0Var2.I(r8);
                        i0Var2.f18637w = bVar3;
                        d1().endRecording();
                        int save = a11.save();
                        a11.translate(f13, f14);
                        a11.drawRenderNode(d1());
                        a11.restoreToCount(save);
                        return;
                    } finally {
                        ((ic.c) bVar2.f20424v.f18636v).D(-f12, -f11);
                    }
                } catch (Throwable th) {
                    aVar.s();
                    i0 i0Var3 = bVar2.f20424v;
                    i0Var3.G(l10);
                    i0Var3.H(o10);
                    i0Var3.F(j11);
                    i0Var3.I(r8);
                    i0Var3.f18637w = bVar3;
                    throw th;
                }
        }
    }

    public e0(v1.h0 h0Var, f fVar, z zVar) {
        this.L = fVar;
        this.M = zVar;
        Y0(h0Var);
    }
}
