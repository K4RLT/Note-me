package a7;
import d.a;
import d.b;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import c7.x;
import vd.n;

/* loaded from: classes.dex */
public final class j {
    public static final Matrix B = new Matrix();
    public b A;

    /* renamed from: a, reason: collision with root package name */
    public Canvas f316a;

    /* renamed from: b, reason: collision with root package name */
    public x f317b;

    /* renamed from: c, reason: collision with root package name */
    public int f318c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f319d;
    public RectF e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f320f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f321g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f322h;
    public Rect i;

    /* renamed from: j, reason: collision with root package name */
    public RectF f323j;

    /* renamed from: k, reason: collision with root package name */
    public p6.a f324k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f325l;

    /* renamed from: m, reason: collision with root package name */
    public Canvas f326m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f327n;

    /* renamed from: o, reason: collision with root package name */
    public p6.a f328o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f329p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f330q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f331r;

    /* renamed from: s, reason: collision with root package name */
    public Bitmap f332s;

    /* renamed from: t, reason: collision with root package name */
    public Canvas f333t;

    /* renamed from: u, reason: collision with root package name */
    public Canvas f334u;

    /* renamed from: v, reason: collision with root package name */
    public p6.a f335v;

    /* renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f336w;

    /* renamed from: x, reason: collision with root package name */
    public float f337x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    public RenderNode f338y;

    /* renamed from: z, reason: collision with root package name */
    public RenderNode f339z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap((int) Math.ceil(rectF.width() * 1.05d), (int) Math.ceil(rectF.height() * 1.05d), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        if (bitmap != null && rectF.width() < bitmap.getWidth() && rectF.height() < bitmap.getHeight() && rectF.width() >= bitmap.getWidth() * 0.75f && rectF.height() >= bitmap.getHeight() * 0.75f) {
            return false;
        }
        return true;
    }

    public final RectF b(RectF rectF, b bVar) {
        if (this.e == null) {
            this.e = new RectF();
        }
        if (this.f321g == null) {
            this.f321g = new RectF();
        }
        this.e.set(rectF);
        this.e.offsetTo(rectF.left + bVar.f300b, rectF.top + bVar.f301c);
        RectF rectF2 = this.e;
        float f10 = bVar.f299a;
        rectF2.inset(-f10, -f10);
        this.f321g.set(rectF);
        this.e.union(this.f321g);
        return this.e;
    }

    public final void c() {
        float f10;
        p6.a aVar;
        float f11;
        RenderEffect createColorFilterEffect;
        RecordingCanvas beginRecording;
        if (this.f316a != null && this.f317b != null && this.f330q != null && this.f319d != null) {
            int b10 = q0.b(this.f318c);
            if (b10 != 0) {
                if (b10 != 1) {
                    float f12 = 1.0f;
                    if (b10 != 2) {
                        if (b10 == 3) {
                            if (this.f338y != null) {
                                int i = Build.VERSION.SDK_INT;
                                if (i >= 29) {
                                    this.f316a.save();
                                    Canvas canvas = this.f316a;
                                    float[] fArr = this.f330q;
                                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                                    this.f338y.endRecording();
                                    if (this.f317b.h()) {
                                        Canvas canvas2 = this.f316a;
                                        b bVar = (b) this.f317b.f4003w;
                                        if (this.f338y != null && this.f339z != null) {
                                            if (i >= 31) {
                                                float[] fArr2 = this.f330q;
                                                if (fArr2 != null) {
                                                    f11 = fArr2[0];
                                                } else {
                                                    f11 = 1.0f;
                                                }
                                                if (fArr2 != null) {
                                                    f12 = fArr2[4];
                                                }
                                                b bVar2 = this.A;
                                                if (bVar2 == null || bVar.f299a != bVar2.f299a || bVar.f300b != bVar2.f300b || bVar.f301c != bVar2.f301c || bVar.f302d != bVar2.f302d) {
                                                    createColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(bVar.f302d, PorterDuff.Mode.SRC_IN));
                                                    float f13 = bVar.f299a;
                                                    if (f13 > 0.0f) {
                                                        float f14 = ((f11 + f12) * f13) / 2.0f;
                                                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                                        createColorFilterEffect = RenderEffect.createBlurEffect(f14, f14, createColorFilterEffect, Shader.TileMode.CLAMP);
                                                    }
                                                    this.f339z.setRenderEffect(createColorFilterEffect);
                                                    this.A = bVar;
                                                }
                                                RectF b11 = b(this.f319d, bVar);
                                                RectF rectF = new RectF(b11.left * f11, b11.top * f12, b11.right * f11, b11.bottom * f12);
                                                this.f339z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                                                beginRecording = this.f339z.beginRecording((int) rectF.width(), (int) rectF.height());
                                                beginRecording.translate((bVar.f300b * f11) + (-rectF.left), (bVar.f301c * f12) + (-rectF.top));
                                                beginRecording.drawRenderNode(this.f338y);
                                                this.f339z.endRecording();
                                                canvas2.save();
                                                canvas2.translate(rectF.left, rectF.top);
                                                canvas2.drawRenderNode(this.f339z);
                                                canvas2.restore();
                                            } else {
                                                n.b("RenderEffect is not supported on API level <31");
                                                return;
                                            }
                                        } else {
                                            q.x.o("Cannot render to render node outside a start()/finish() block");
                                            return;
                                        }
                                    }
                                    this.f316a.drawRenderNode(this.f338y);
                                    this.f316a.restore();
                                } else {
                                    q.x.o("RenderNode not supported but we chose it as render strategy");
                                    return;
                                }
                            } else {
                                q.x.o("RenderNode is not ready; should've been initialized at start() time");
                                return;
                            }
                        }
                    } else if (this.f325l != null) {
                        if (this.f317b.h()) {
                            Canvas canvas3 = this.f316a;
                            b bVar3 = (b) this.f317b.f4003w;
                            RectF rectF2 = this.f319d;
                            if (rectF2 != null && this.f325l != null) {
                                RectF b12 = b(rectF2, bVar3);
                                if (this.f320f == null) {
                                    this.f320f = new Rect();
                                }
                                this.f320f.set((int) Math.floor(b12.left), (int) Math.floor(b12.top), (int) Math.ceil(b12.right), (int) Math.ceil(b12.bottom));
                                float[] fArr3 = this.f330q;
                                if (fArr3 != null) {
                                    f10 = fArr3[0];
                                } else {
                                    f10 = 1.0f;
                                }
                                if (fArr3 != null) {
                                    f12 = fArr3[4];
                                }
                                if (this.f322h == null) {
                                    this.f322h = new RectF();
                                }
                                this.f322h.set(b12.left * f10, b12.top * f12, b12.right * f10, b12.bottom * f12);
                                if (this.i == null) {
                                    this.i = new Rect();
                                }
                                this.i.set(0, 0, Math.round(this.f322h.width()), Math.round(this.f322h.height()));
                                if (d(this.f331r, this.f322h)) {
                                    Bitmap bitmap = this.f331r;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                    }
                                    Bitmap bitmap2 = this.f332s;
                                    if (bitmap2 != null) {
                                        bitmap2.recycle();
                                    }
                                    this.f331r = a(this.f322h, Bitmap.Config.ARGB_8888);
                                    this.f332s = a(this.f322h, Bitmap.Config.ALPHA_8);
                                    this.f333t = new Canvas(this.f331r);
                                    this.f334u = new Canvas(this.f332s);
                                } else {
                                    Canvas canvas4 = this.f333t;
                                    if (canvas4 != null && this.f334u != null && (aVar = this.f328o) != null) {
                                        canvas4.drawRect(this.i, aVar);
                                        this.f334u.drawRect(this.i, this.f328o);
                                    } else {
                                        q.x.o("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                                        return;
                                    }
                                }
                                if (this.f332s != null) {
                                    if (this.f335v == null) {
                                        this.f335v = new p6.a(1, 0);
                                    }
                                    RectF rectF3 = this.f319d;
                                    this.f334u.drawBitmap(this.f325l, Math.round((rectF3.left - b12.left) * f10), Math.round((rectF3.top - b12.top) * f12), (Paint) null);
                                    if (this.f336w == null || this.f337x != bVar3.f299a) {
                                        float f15 = ((f10 + f12) * bVar3.f299a) / 2.0f;
                                        if (f15 > 0.0f) {
                                            this.f336w = new BlurMaskFilter(f15, BlurMaskFilter.Blur.NORMAL);
                                        } else {
                                            this.f336w = null;
                                        }
                                        this.f337x = bVar3.f299a;
                                    }
                                    this.f335v.setColor(bVar3.f302d);
                                    float f16 = bVar3.f299a;
                                    p6.a aVar2 = this.f335v;
                                    if (f16 > 0.0f) {
                                        aVar2.setMaskFilter(this.f336w);
                                    } else {
                                        aVar2.setMaskFilter(null);
                                    }
                                    this.f335v.setFilterBitmap(true);
                                    this.f333t.drawBitmap(this.f332s, Math.round(bVar3.f300b * f10), Math.round(bVar3.f301c * f12), this.f335v);
                                    canvas3.drawBitmap(this.f331r, this.i, this.f320f, this.f324k);
                                } else {
                                    q.x.o("Expected to have allocated a shadow mask bitmap");
                                    return;
                                }
                            } else {
                                q.x.o("Cannot render to bitmap outside a start()/finish() block");
                                return;
                            }
                        }
                        if (this.f327n == null) {
                            this.f327n = new Rect();
                        }
                        this.f327n.set(0, 0, (int) (this.f319d.width() * this.f330q[0]), (int) (this.f319d.height() * this.f330q[4]));
                        this.f316a.drawBitmap(this.f325l, this.f327n, this.f319d, this.f324k);
                    } else {
                        q.x.o("Bitmap is not ready; should've been initialized at start() time");
                        return;
                    }
                } else {
                    this.f316a.restore();
                }
            } else {
                this.f316a.restore();
            }
            this.f316a = null;
            return;
        }
        q.x.o("OffscreenBitmap: finish() call without matching start()");
    }

    public final Canvas e(Canvas canvas, RectF rectF, x xVar) {
        RecordingCanvas beginRecording;
        if (this.f316a == null) {
            if (this.f330q == null) {
                this.f330q = new float[9];
            }
            if (this.f329p == null) {
                this.f329p = new Matrix();
            }
            canvas.getMatrix(this.f329p);
            this.f329p.getValues(this.f330q);
            float[] fArr = this.f330q;
            float f10 = fArr[0];
            int i = 4;
            float f11 = fArr[4];
            if (this.f323j == null) {
                this.f323j = new RectF();
            }
            this.f323j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
            this.f316a = canvas;
            this.f317b = xVar;
            if (xVar.f4002v >= 255 && !xVar.h()) {
                i = 1;
            } else if (!xVar.h()) {
                i = 2;
            } else {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 29 || !canvas.isHardwareAccelerated() || i10 <= 31) {
                    i = 3;
                }
            }
            this.f318c = i;
            if (this.f319d == null) {
                this.f319d = new RectF();
            }
            this.f319d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            if (this.f324k == null) {
                this.f324k = new p6.a();
            }
            this.f324k.reset();
            int b10 = q0.b(this.f318c);
            if (b10 != 0) {
                if (b10 != 1) {
                    Matrix matrix = B;
                    if (b10 != 2) {
                        if (b10 == 3) {
                            if (Build.VERSION.SDK_INT >= 29) {
                                if (this.f338y == null) {
                                    this.f338y = h.e();
                                }
                                if (xVar.h() && this.f339z == null) {
                                    this.f339z = h.z();
                                    this.A = null;
                                }
                                this.f338y.setAlpha(xVar.f4002v / 255.0f);
                                if (xVar.h()) {
                                    RenderNode renderNode = this.f339z;
                                    if (renderNode != null) {
                                        renderNode.setAlpha(xVar.f4002v / 255.0f);
                                    } else {
                                        q.x.o("Must initialize shadowRenderNode when we have shadow");
                                        return null;
                                    }
                                }
                                this.f338y.setHasOverlappingRendering(true);
                                RenderNode renderNode2 = this.f338y;
                                RectF rectF2 = this.f323j;
                                renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                beginRecording = this.f338y.beginRecording((int) this.f323j.width(), (int) this.f323j.height());
                                beginRecording.setMatrix(matrix);
                                beginRecording.scale(f10, f11);
                                beginRecording.translate(-rectF.left, -rectF.top);
                                return beginRecording;
                            }
                            q.x.o("RenderNode not supported but we chose it as render strategy");
                            return null;
                        }
                        n.b("Invalid render strategy for OffscreenLayer");
                        return null;
                    }
                    if (this.f328o == null) {
                        p6.a aVar = new p6.a();
                        this.f328o = aVar;
                        aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    if (d(this.f325l, this.f323j)) {
                        Bitmap bitmap = this.f325l;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        this.f325l = a(this.f323j, Bitmap.Config.ARGB_8888);
                        this.f326m = new Canvas(this.f325l);
                    } else {
                        Canvas canvas2 = this.f326m;
                        if (canvas2 != null) {
                            canvas2.setMatrix(matrix);
                            this.f326m.drawRect(-1.0f, -1.0f, this.f323j.width() + 1.0f, this.f323j.height() + 1.0f, this.f328o);
                        } else {
                            q.x.o("If needNewBitmap() returns true, we should have a canvas ready");
                            return null;
                        }
                    }
                    j3.a(0, this.f324k);
                    this.f324k.setColorFilter(null);
                    this.f324k.setAlpha(xVar.f4002v);
                    Canvas canvas3 = this.f326m;
                    canvas3.scale(f10, f11);
                    canvas3.translate(-rectF.left, -rectF.top);
                    return canvas3;
                }
                this.f324k.setAlpha(xVar.f4002v);
                this.f324k.setColorFilter(null);
                p6.a aVar2 = this.f324k;
                Matrix matrix2 = l.f341a;
                canvas.saveLayer(rectF, aVar2);
                return canvas;
            }
            canvas.save();
            return canvas;
        }
        q.x.o("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        return null;
    }
}
