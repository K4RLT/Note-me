package n1;
import d.c;

import a0.k0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import j.i0;
import k1.l0;
import k1.p;
import k1.q;
import k1.r;
import k1.s;
import y2.m;
import ya.vd;

/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    public final q f21060b;

    /* renamed from: c, reason: collision with root package name */
    public final m1.b f21061c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f21062d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f21063f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f21064g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21065h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f21066j;

    /* renamed from: k, reason: collision with root package name */
    public float f21067k;

    /* renamed from: l, reason: collision with root package name */
    public float f21068l;

    /* renamed from: m, reason: collision with root package name */
    public float f21069m;

    /* renamed from: n, reason: collision with root package name */
    public float f21070n;

    /* renamed from: o, reason: collision with root package name */
    public float f21071o;

    /* renamed from: p, reason: collision with root package name */
    public long f21072p;

    /* renamed from: q, reason: collision with root package name */
    public long f21073q;

    /* renamed from: r, reason: collision with root package name */
    public float f21074r;

    /* renamed from: s, reason: collision with root package name */
    public float f21075s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21076t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21077u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21078v;

    /* renamed from: w, reason: collision with root package name */
    public int f21079w;

    public g() {
        q qVar = new q();
        m1.b bVar = new m1.b();
        this.f21060b = qVar;
        this.f21061c = bVar;
        RenderNode c10 = k1.c();
        this.f21062d = c10;
        this.e = 0L;
        c10.setClipToBounds(false);
        O(c10, 0);
        this.i = 1.0f;
        this.f21066j = 3;
        this.f21067k = 1.0f;
        this.f21068l = 1.0f;
        long j10 = r.f19513b;
        this.f21072p = j10;
        this.f21073q = j10;
        this.f21075s = 8.0f;
        this.f21079w = 0;
    }

    @Override // n1.d
    public final void A(long j10, int i, int i10) {
        this.f21062d.setPosition(i, i10, ((int) (j10 >> 32)) + i, ((int) (4294967295L & j10)) + i10);
        this.e = vd.c(j10);
    }

    @Override // n1.d
    public final float B() {
        return this.f21069m;
    }

    @Override // n1.d
    public final void C(boolean z3) {
        this.f21076t = z3;
        N();
    }

    @Override // n1.d
    public final float D() {
        return 0.0f;
    }

    @Override // n1.d
    public final void E(int i) {
        this.f21079w = i;
        P();
    }

    @Override // n1.d
    public final void F(float f10) {
        this.f21069m = f10;
        this.f21062d.setTranslationX(f10);
    }

    @Override // n1.d
    public final void G(long j10) {
        this.f21073q = j10;
        this.f21062d.setSpotShadowColor(l0.F(j10));
    }

    @Override // n1.d
    public final Matrix H() {
        Matrix matrix = this.f21064g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f21064g = matrix;
        }
        this.f21062d.getMatrix(matrix);
        return matrix;
    }

    @Override // n1.d
    public final void I(float f10) {
        this.f21075s = f10;
        this.f21062d.setCameraDistance(f10);
    }

    @Override // n1.d
    public final float J() {
        return this.f21071o;
    }

    @Override // n1.d
    public final float K() {
        return this.f21068l;
    }

    @Override // n1.d
    public final void L(y2.c cVar, m mVar, b bVar, k0 k0Var) {
        RecordingCanvas beginRecording;
        m1.b bVar2 = this.f21061c;
        beginRecording = this.f21062d.beginRecording();
        try {
            q qVar = this.f21060b;
            k1.a aVar = qVar.f19512a;
            Canvas canvas = aVar.f19463a;
            aVar.f19463a = beginRecording;
            i0 i0Var = bVar2.f20424v;
            i0Var.G(cVar);
            i0Var.H(mVar);
            i0Var.f18637w = bVar;
            i0Var.I(this.e);
            i0Var.F(aVar);
            k0Var.invoke(bVar2);
            qVar.f19512a.f19463a = canvas;
        } finally {
            this.f21062d.endRecording();
        }
    }

    @Override // n1.d
    public final int M() {
        return this.f21066j;
    }

    public final void N() {
        boolean z3;
        boolean z9 = this.f21076t;
        boolean z10 = false;
        if (z9 && !this.f21065h) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z9 && this.f21065h) {
            z10 = true;
        }
        if (z3 != this.f21077u) {
            this.f21077u = z3;
            this.f21062d.setClipToBounds(z3);
        }
        if (z10 != this.f21078v) {
            this.f21078v = z10;
            this.f21062d.setClipToOutline(z10);
        }
    }

    public final void O(RenderNode renderNode, int i) {
        Paint paint = this.f21063f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.f21079w;
        if (i != 1 && this.f21066j == 3) {
            O(this.f21062d, i);
        } else {
            O(this.f21062d, 1);
        }
    }

    @Override // n1.d
    public final float a() {
        return this.i;
    }

    @Override // n1.d
    public final float b() {
        return this.f21067k;
    }

    @Override // n1.d
    public final void c(float f10) {
        this.f21071o = f10;
        this.f21062d.setElevation(f10);
    }

    @Override // n1.d
    public final void d(p pVar) {
        Canvas canvas = k1.b.f19467a;
        ((k1.a) pVar).f19463a.drawRenderNode(this.f21062d);
    }

    @Override // n1.d
    public final void e(float f10) {
        this.f21074r = f10;
        this.f21062d.setRotationZ(f10);
    }

    @Override // n1.d
    public final void f(float f10) {
        this.f21070n = f10;
        this.f21062d.setTranslationY(f10);
    }

    @Override // n1.d
    public final void g(Outline outline, long j10) {
        boolean z3;
        this.f21062d.setOutline(outline);
        if (outline != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f21065h = z3;
        N();
    }

    @Override // n1.d
    public final void h(int i) {
        this.f21066j = i;
        Paint paint = this.f21063f;
        if (paint == null) {
            paint = new Paint();
            this.f21063f = paint;
        }
        paint.setBlendMode(l0.A(i));
        P();
    }

    @Override // n1.d
    public final void i() {
        this.f21062d.discardDisplayList();
    }

    @Override // n1.d
    public final int j() {
        return this.f21079w;
    }

    @Override // n1.d
    public final s k() {
        return null;
    }

    @Override // n1.d
    public final void l(float f10) {
        this.f21068l = f10;
        this.f21062d.setScaleY(f10);
    }

    @Override // n1.d
    public final float m() {
        return 0.0f;
    }

    @Override // n1.d
    public final boolean n() {
        boolean hasDisplayList;
        hasDisplayList = this.f21062d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // n1.d
    public final float o() {
        return this.f21074r;
    }

    @Override // n1.d
    public final void p(long j10) {
        long j11 = 9223372034707292159L & j10;
        RenderNode renderNode = this.f21062d;
        if (j11 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.f21062d.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }

    @Override // n1.d
    public final long q() {
        return this.f21072p;
    }

    @Override // n1.d
    public final void r() {
        this.f21062d.setRotationX(0.0f);
    }

    @Override // n1.d
    public final void s(float f10) {
        this.i = f10;
        this.f21062d.setAlpha(f10);
    }

    @Override // n1.d
    public final float t() {
        return this.f21070n;
    }

    @Override // n1.d
    public final void u() {
        this.f21062d.setRotationY(0.0f);
    }

    @Override // n1.d
    public final long v() {
        return this.f21073q;
    }

    @Override // n1.d
    public final void w(long j10) {
        this.f21072p = j10;
        this.f21062d.setAmbientShadowColor(l0.F(j10));
    }

    @Override // n1.d
    public final void x() {
        Paint paint = this.f21063f;
        if (paint == null) {
            paint = new Paint();
            this.f21063f = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // n1.d
    public final void y(float f10) {
        this.f21067k = f10;
        this.f21062d.setScaleX(f10);
    }

    @Override // n1.d
    public final float z() {
        return this.f21075s;
    }
}
