package n1;
import j.a;
import k.a;
import k.b;
import l.c;

import a0.k0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import c2.x;
import j.i0;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.l0;
import k1.p;
import k1.q;
import k1.r;
import k1.s;
import y2.m;
import ya.vd;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicBoolean f21037z = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final q f21038b;

    /* renamed from: c, reason: collision with root package name */
    public final m1.b f21039c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f21040d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f21041f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f21042g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21043h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f21044j;

    /* renamed from: k, reason: collision with root package name */
    public int f21045k;

    /* renamed from: l, reason: collision with root package name */
    public float f21046l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21047m;

    /* renamed from: n, reason: collision with root package name */
    public float f21048n;

    /* renamed from: o, reason: collision with root package name */
    public float f21049o;

    /* renamed from: p, reason: collision with root package name */
    public float f21050p;

    /* renamed from: q, reason: collision with root package name */
    public float f21051q;

    /* renamed from: r, reason: collision with root package name */
    public float f21052r;

    /* renamed from: s, reason: collision with root package name */
    public long f21053s;

    /* renamed from: t, reason: collision with root package name */
    public long f21054t;

    /* renamed from: u, reason: collision with root package name */
    public float f21055u;

    /* renamed from: v, reason: collision with root package name */
    public float f21056v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21057w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21058x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f21059y;

    public e(x xVar, q qVar, m1.b bVar) {
        this.f21038b = qVar;
        this.f21039c = bVar;
        RenderNode create = RenderNode.create("Compose", xVar);
        this.f21040d = create;
        this.e = 0L;
        this.i = 0L;
        if (f21037z.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                k.c(create, a(create));
                k.d(create, b(create));
            }
            a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        O(0);
        this.f21044j = 0;
        this.f21045k = 3;
        this.f21046l = 1.0f;
        this.f21048n = 1.0f;
        this.f21049o = 1.0f;
        long j10 = r.f19513b;
        this.f21053s = j10;
        this.f21054t = j10;
        this.f21056v = 8.0f;
    }

    @Override // n1.d
    public final void A(long j10, int i, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (4294967295L & j10);
        this.f21040d.setLeftTopRightBottom(i, i10, i + i11, i10 + i12);
        if (!y2.c(this.e, j10)) {
            if (this.f21047m) {
                this.f21040d.setPivotX(i11 / 2.0f);
                this.f21040d.setPivotY(i12 / 2.0f);
            }
            this.e = j10;
        }
    }

    @Override // n1.d
    public final float B() {
        return this.f21050p;
    }

    @Override // n1.d
    public final void C(boolean z3) {
        this.f21057w = z3;
        N();
    }

    @Override // n1.d
    public final float D() {
        return 0.0f;
    }

    @Override // n1.d
    public final void E(int i) {
        this.f21044j = i;
        P();
    }

    @Override // n1.d
    public final void F(float f10) {
        this.f21050p = f10;
        this.f21040d.setTranslationX(f10);
    }

    @Override // n1.d
    public final void G(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f21054t = j10;
            k.d(this.f21040d, l0.F(j10));
        }
    }

    @Override // n1.d
    public final Matrix H() {
        Matrix matrix = this.f21042g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f21042g = matrix;
        }
        this.f21040d.getMatrix(matrix);
        return matrix;
    }

    @Override // n1.d
    public final void I(float f10) {
        this.f21056v = f10;
        this.f21040d.setCameraDistance(-f10);
    }

    @Override // n1.d
    public final float J() {
        return this.f21052r;
    }

    @Override // n1.d
    public final float K() {
        return this.f21049o;
    }

    @Override // n1.d
    public final void L(y2.c cVar, m mVar, b bVar, k0 k0Var) {
        Canvas start = this.f21040d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            k1.a aVar = this.f21038b.f19512a;
            Canvas canvas = aVar.f19463a;
            aVar.f19463a = start;
            m1.b bVar2 = this.f21039c;
            i0 i0Var = bVar2.f20424v;
            long c10 = vd.c(this.e);
            y2.c l10 = i0Var.l();
            m o10 = i0Var.o();
            p j10 = i0Var.j();
            long r8 = i0Var.r();
            b bVar3 = (b) i0Var.f18637w;
            i0Var.G(cVar);
            i0Var.H(mVar);
            i0Var.F(aVar);
            i0Var.I(c10);
            i0Var.f18637w = bVar;
            aVar.l();
            try {
                k0Var.invoke(bVar2);
                aVar.s();
                i0Var.G(l10);
                i0Var.H(o10);
                i0Var.F(j10);
                i0Var.I(r8);
                i0Var.f18637w = bVar3;
                aVar.f19463a = canvas;
                this.f21040d.end(start);
            } catch (Throwable th) {
                aVar.s();
                i0 i0Var2 = bVar2.f20424v;
                i0Var2.G(l10);
                i0Var2.H(o10);
                i0Var2.F(j10);
                i0Var2.I(r8);
                i0Var2.f18637w = bVar3;
                throw th;
            }
        } catch (Throwable th2) {
            this.f21040d.end(start);
            throw th2;
        }
    }

    @Override // n1.d
    public final int M() {
        return this.f21045k;
    }

    public final void N() {
        boolean z3;
        boolean z9 = this.f21057w;
        boolean z10 = false;
        if (z9 && !this.f21043h) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z9 && this.f21043h) {
            z10 = true;
        }
        if (z3 != this.f21058x) {
            this.f21058x = z3;
            this.f21040d.setClipToBounds(z3);
        }
        if (z10 != this.f21059y) {
            this.f21059y = z10;
            this.f21040d.setClipToOutline(z10);
        }
    }

    public final void O(int i) {
        RenderNode renderNode = this.f21040d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f21041f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f21041f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f21041f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.f21044j;
        if (i != 1 && this.f21045k == 3) {
            O(i);
        } else {
            O(1);
        }
    }

    @Override // n1.d
    public final float a() {
        return this.f21046l;
    }

    @Override // n1.d
    public final float b() {
        return this.f21048n;
    }

    @Override // n1.d
    public final void c(float f10) {
        this.f21052r = f10;
        this.f21040d.setElevation(f10);
    }

    @Override // n1.d
    public final void d(p pVar) {
        Canvas canvas = k1.b.f19467a;
        DisplayListCanvas displayListCanvas = ((k1.a) pVar).f19463a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.f21040d);
    }

    @Override // n1.d
    public final void e(float f10) {
        this.f21055u = f10;
        this.f21040d.setRotation(f10);
    }

    @Override // n1.d
    public final void f(float f10) {
        this.f21051q = f10;
        this.f21040d.setTranslationY(f10);
    }

    @Override // n1.d
    public final void g(Outline outline, long j10) {
        boolean z3;
        this.i = j10;
        this.f21040d.setOutline(outline);
        if (outline != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f21043h = z3;
        N();
    }

    @Override // n1.d
    public final void h(int i) {
        if (this.f21045k == i) {
            return;
        }
        this.f21045k = i;
        Paint paint = this.f21041f;
        if (paint == null) {
            paint = new Paint();
            this.f21041f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(l0.J(i)));
        P();
    }

    @Override // n1.d
    public final void i() {
        a(this.f21040d);
    }

    @Override // n1.d
    public final int j() {
        return this.f21044j;
    }

    @Override // n1.d
    public final s k() {
        return null;
    }

    @Override // n1.d
    public final void l(float f10) {
        this.f21049o = f10;
        this.f21040d.setScaleY(f10);
    }

    @Override // n1.d
    public final float m() {
        return 0.0f;
    }

    @Override // n1.d
    public final boolean n() {
        return this.f21040d.isValid();
    }

    @Override // n1.d
    public final float o() {
        return this.f21055u;
    }

    @Override // n1.d
    public final void p(long j10) {
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            this.f21047m = true;
            this.f21040d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.f21040d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.f21047m = false;
            this.f21040d.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.f21040d.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }

    @Override // n1.d
    public final long q() {
        return this.f21053s;
    }

    @Override // n1.d
    public final void r() {
        this.f21040d.setRotationX(0.0f);
    }

    @Override // n1.d
    public final void s(float f10) {
        this.f21046l = f10;
        this.f21040d.setAlpha(f10);
    }

    @Override // n1.d
    public final float t() {
        return this.f21051q;
    }

    @Override // n1.d
    public final void u() {
        this.f21040d.setRotationY(0.0f);
    }

    @Override // n1.d
    public final long v() {
        return this.f21054t;
    }

    @Override // n1.d
    public final void w(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f21053s = j10;
            k.c(this.f21040d, l0.F(j10));
        }
    }

    @Override // n1.d
    public final void x() {
        P();
    }

    @Override // n1.d
    public final void y(float f10) {
        this.f21048n = f10;
        this.f21040d.setScaleX(f10);
    }

    @Override // n1.d
    public final float z() {
        return this.f21056v;
    }
}
