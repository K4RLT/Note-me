package n1;
import l.c;

import a0.k0;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import k1.l0;
import k1.p;
import k1.q;
import k1.r;
import k1.s;
import y2.m;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: z, reason: collision with root package name */
    public static final h f21080z = new Canvas();

    /* renamed from: b, reason: collision with root package name */
    public final o1.a f21081b;

    /* renamed from: c, reason: collision with root package name */
    public final q f21082c;

    /* renamed from: d, reason: collision with root package name */
    public final l f21083d;
    public final Resources e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f21084f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f21085g;

    /* renamed from: h, reason: collision with root package name */
    public int f21086h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f21087j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21088k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21089l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21090m;

    /* renamed from: n, reason: collision with root package name */
    public int f21091n;

    /* renamed from: o, reason: collision with root package name */
    public int f21092o;

    /* renamed from: p, reason: collision with root package name */
    public float f21093p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21094q;

    /* renamed from: r, reason: collision with root package name */
    public float f21095r;

    /* renamed from: s, reason: collision with root package name */
    public float f21096s;

    /* renamed from: t, reason: collision with root package name */
    public float f21097t;

    /* renamed from: u, reason: collision with root package name */
    public float f21098u;

    /* renamed from: v, reason: collision with root package name */
    public float f21099v;

    /* renamed from: w, reason: collision with root package name */
    public long f21100w;

    /* renamed from: x, reason: collision with root package name */
    public long f21101x;

    /* renamed from: y, reason: collision with root package name */
    public float f21102y;

    public i(o1.a aVar) {
        q qVar = new q();
        m1.b bVar = new m1.b();
        this.f21081b = aVar;
        this.f21082c = qVar;
        l lVar = new l(aVar, qVar, bVar);
        this.f21083d = lVar;
        this.e = aVar.getResources();
        this.f21084f = new Rect();
        aVar.addView(lVar);
        lVar.setClipBounds(null);
        this.f21087j = 0L;
        View.generateViewId();
        this.f21091n = 3;
        this.f21092o = 0;
        this.f21093p = 1.0f;
        this.f21095r = 1.0f;
        this.f21096s = 1.0f;
        long j10 = r.f19513b;
        this.f21100w = j10;
        this.f21101x = j10;
    }

    @Override // n1.d
    public final void A(long j10, int i, int i10) {
        boolean c10 = y2.c(this.f21087j, j10);
        l lVar = this.f21083d;
        if (!c10) {
            if (this.f21090m || lVar.getClipToOutline()) {
                this.f21088k = true;
            }
            int i11 = (int) (j10 >> 32);
            int i12 = (int) (4294967295L & j10);
            lVar.layout(i, i10, i + i11, i10 + i12);
            this.f21087j = j10;
            if (this.f21094q) {
                lVar.setPivotX(i11 / 2.0f);
                lVar.setPivotY(i12 / 2.0f);
            }
        } else {
            int i13 = this.f21086h;
            if (i13 != i) {
                lVar.offsetLeftAndRight(i - i13);
            }
            int i14 = this.i;
            if (i14 != i10) {
                lVar.offsetTopAndBottom(i10 - i14);
            }
        }
        this.f21086h = i;
        this.i = i10;
    }

    @Override // n1.d
    public final float B() {
        return this.f21097t;
    }

    @Override // n1.d
    public final void C(boolean z3) {
        boolean z9;
        boolean z10 = false;
        if (z3 && !this.f21089l) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f21090m = z9;
        this.f21088k = true;
        if (z3 && this.f21089l) {
            z10 = true;
        }
        this.f21083d.setClipToOutline(z10);
    }

    @Override // n1.d
    public final float D() {
        return 0.0f;
    }

    @Override // n1.d
    public final void E(int i) {
        this.f21092o = i;
        O();
    }

    @Override // n1.d
    public final void F(float f10) {
        this.f21097t = f10;
        this.f21083d.setTranslationX(f10);
    }

    @Override // n1.d
    public final void G(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f21101x = j10;
            this.f21083d.setOutlineSpotShadowColor(l0.F(j10));
        }
    }

    @Override // n1.d
    public final Matrix H() {
        return this.f21083d.getMatrix();
    }

    @Override // n1.d
    public final void I(float f10) {
        this.f21083d.setCameraDistance(f10 * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // n1.d
    public final float J() {
        return this.f21099v;
    }

    @Override // n1.d
    public final float K() {
        return this.f21096s;
    }

    @Override // n1.d
    public final void L(y2.c cVar, m mVar, b bVar, k0 k0Var) {
        l lVar = this.f21083d;
        ViewParent parent = lVar.getParent();
        o1.a aVar = this.f21081b;
        if (parent == null) {
            aVar.addView(lVar);
        }
        lVar.A = cVar;
        lVar.B = mVar;
        lVar.C = k0Var;
        lVar.D = bVar;
        if (lVar.isAttachedToWindow()) {
            lVar.setVisibility(4);
            lVar.setVisibility(0);
            try {
                q qVar = this.f21082c;
                h hVar = f21080z;
                k1.a aVar2 = qVar.f19512a;
                Canvas canvas = aVar2.f19463a;
                aVar2.f19463a = hVar;
                aVar.a(aVar2, lVar, lVar.getDrawingTime());
                qVar.f19512a.f19463a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // n1.d
    public final int M() {
        return this.f21091n;
    }

    public final void N(int i) {
        l lVar = this.f21083d;
        boolean z3 = true;
        if (i == 1) {
            lVar.setLayerType(2, this.f21085g);
        } else {
            Paint paint = this.f21085g;
            if (i == 2) {
                lVar.setLayerType(0, paint);
                z3 = false;
            } else {
                lVar.setLayerType(0, paint);
            }
        }
        lVar.setCanUseCompositingLayer$ui_graphics_release(z3);
    }

    public final void O() {
        int i = this.f21092o;
        if (i != 1 && this.f21091n == 3) {
            N(i);
        } else {
            N(1);
        }
    }

    @Override // n1.d
    public final float a() {
        return this.f21093p;
    }

    @Override // n1.d
    public final float b() {
        return this.f21095r;
    }

    @Override // n1.d
    public final void c(float f10) {
        this.f21099v = f10;
        this.f21083d.setElevation(f10);
    }

    @Override // n1.d
    public final void d(p pVar) {
        Rect rect;
        boolean z3 = this.f21088k;
        l lVar = this.f21083d;
        if (z3) {
            if ((this.f21090m || lVar.getClipToOutline()) && !this.f21089l) {
                rect = this.f21084f;
                rect.left = 0;
                rect.top = 0;
                rect.right = lVar.getWidth();
                rect.bottom = lVar.getHeight();
            } else {
                rect = null;
            }
            lVar.setClipBounds(rect);
        }
        Canvas canvas = k1.b.f19467a;
        if (((k1.a) pVar).f19463a.isHardwareAccelerated()) {
            this.f21081b.a(pVar, lVar, lVar.getDrawingTime());
        }
    }

    @Override // n1.d
    public final void e(float f10) {
        this.f21102y = f10;
        this.f21083d.setRotation(f10);
    }

    @Override // n1.d
    public final void f(float f10) {
        this.f21098u = f10;
        this.f21083d.setTranslationY(f10);
    }

    @Override // n1.d
    public final void g(Outline outline, long j10) {
        l lVar = this.f21083d;
        lVar.f21107y = outline;
        lVar.invalidateOutline();
        boolean z3 = false;
        if ((this.f21090m || lVar.getClipToOutline()) && outline != null) {
            lVar.setClipToOutline(true);
            if (this.f21090m) {
                this.f21090m = false;
                this.f21088k = true;
            }
        }
        if (outline != null) {
            z3 = true;
        }
        this.f21089l = z3;
    }

    @Override // n1.d
    public final void h(int i) {
        this.f21091n = i;
        Paint paint = this.f21085g;
        if (paint == null) {
            paint = new Paint();
            this.f21085g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(l0.J(i)));
        O();
    }

    @Override // n1.d
    public final void i() {
        this.f21081b.removeViewInLayout(this.f21083d);
    }

    @Override // n1.d
    public final int j() {
        return this.f21092o;
    }

    @Override // n1.d
    public final s k() {
        return null;
    }

    @Override // n1.d
    public final void l(float f10) {
        this.f21096s = f10;
        this.f21083d.setScaleY(f10);
    }

    @Override // n1.d
    public final float m() {
        return 0.0f;
    }

    @Override // n1.d
    public final float o() {
        return this.f21102y;
    }

    @Override // n1.d
    public final void p(long j10) {
        long j11 = 9223372034707292159L & j10;
        l lVar = this.f21083d;
        if (j11 == 9205357640488583168L) {
            if (Build.VERSION.SDK_INT >= 28) {
                lVar.resetPivot();
                return;
            }
            this.f21094q = true;
            lVar.setPivotX(((int) (this.f21087j >> 32)) / 2.0f);
            lVar.setPivotY(((int) (this.f21087j & 4294967295L)) / 2.0f);
            return;
        }
        this.f21094q = false;
        lVar.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
        lVar.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    @Override // n1.d
    public final long q() {
        return this.f21100w;
    }

    @Override // n1.d
    public final void r() {
        this.f21083d.setRotationX(0.0f);
    }

    @Override // n1.d
    public final void s(float f10) {
        this.f21093p = f10;
        this.f21083d.setAlpha(f10);
    }

    @Override // n1.d
    public final float t() {
        return this.f21098u;
    }

    @Override // n1.d
    public final void u() {
        this.f21083d.setRotationY(0.0f);
    }

    @Override // n1.d
    public final long v() {
        return this.f21101x;
    }

    @Override // n1.d
    public final void w(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f21100w = j10;
            this.f21083d.setOutlineAmbientShadowColor(l0.F(j10));
        }
    }

    @Override // n1.d
    public final void x() {
        Paint paint = this.f21085g;
        if (paint == null) {
            paint = new Paint();
            this.f21085g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    @Override // n1.d
    public final void y(float f10) {
        this.f21095r = f10;
        this.f21083d.setScaleX(f10);
    }

    @Override // n1.d
    public final float z() {
        return this.f21083d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }
}
