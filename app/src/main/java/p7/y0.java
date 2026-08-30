package p7;
import l.a;
import n0.b;
import w.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.ink.brush.Brush;
import androidx.ink.brush.InputToolType;
import androidx.ink.rendering.android.canvas.CanvasStrokeRenderer;
import androidx.ink.strokes.MutableStrokeInputBatch;
import androidx.ink.strokes.Stroke;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import wa.b9;

/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f22611a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f22612b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final Matrix f22613c = new Matrix();

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.w] */
    public static void a(Bitmap bitmap, List list) {
        Bitmap bitmap2;
        Stroke b10;
        boolean z3;
        Bitmap bitmap3;
        if (!list.isEmpty() && a()) {
            Object obj = f22611a.get();
            obj.getClass();
            CanvasStrokeRenderer canvasStrokeRenderer = (CanvasStrokeRenderer) obj;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                v7.n nVar = (v7.n) it.next();
                boolean z9 = false;
                Stroke b11 = b(nVar, width, height, false);
                if (b11 != null) {
                    boolean z10 = v.f22585a;
                    Matrix matrix = f22613c;
                    matrix.getClass();
                    if (Build.VERSION.SDK_INT < 34 || !v.f22585a || kotlin.jvm.internal.a(Looper.myLooper(), Looper.getMainLooper())) {
                        bitmap2 = bitmap;
                    } else {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        Object obj2 = new Object();
                        Object obj3 = new Object();
                        Object obj4 = new Object();
                        bitmap2 = bitmap;
                        ((Handler) v.f22588d.getValue()).post(new e7.i(bitmap2, b11, new Matrix(matrix), (kotlin.jvm.internal.y) obj2, (kotlin.jvm.internal.w) obj3, (kotlin.jvm.internal.w) obj4, countDownLatch));
                        try {
                            z3 = countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                            z3 = false;
                        }
                        if (z3 && (bitmap3 = (Bitmap) obj2.f19787u) != null) {
                            int i = obj3.f19785u;
                            int i10 = obj4.f19785u;
                            if (!bitmap2.isRecycled()) {
                                try {
                                    new Canvas(bitmap2).drawBitmap(bitmap3, i, i10, (Paint) null);
                                    z9 = true;
                                } catch (Throwable unused2) {
                                }
                            }
                            bitmap3.recycle();
                        }
                    }
                    if (!z9 && (b10 = b(nVar, width, height, true)) != null) {
                        canvasStrokeRenderer.draw(new Canvas(bitmap2), b10, f22613c);
                    }
                }
            }
        }
    }

    public static Stroke b(v7.n nVar, float f10, float f11, boolean z3) {
        w0 w0Var = new w0(nVar, (int) f10, z3);
        ConcurrentHashMap concurrentHashMap = f22612b;
        Stroke stroke = (Stroke) concurrentHashMap.get(w0Var);
        if (stroke != null) {
            return stroke;
        }
        if (concurrentHashMap.size() >= 1500) {
            concurrentHashMap.clear();
        }
        Stroke h3 = h(nVar, f10, f11, z3);
        if (h3 == null) {
            return null;
        }
        concurrentHashMap.put(w0Var, h3);
        return h3;
    }

    public static void c(Canvas canvas, List list, float f10, float f11) {
        canvas.getClass();
        if (!list.isEmpty() && a()) {
            Object obj = f22611a.get();
            obj.getClass();
            CanvasStrokeRenderer canvasStrokeRenderer = (CanvasStrokeRenderer) obj;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Stroke b10 = b((v7.n) it.next(), f10, f11, false);
                if (b10 != null) {
                    canvasStrokeRenderer.draw(canvas, b10, f22613c);
                }
            }
        }
    }

    public static void d(Canvas canvas, v7.n nVar, float f10, float f11) {
        CanvasStrokeRenderer canvasStrokeRenderer;
        Stroke h3;
        canvas.getClass();
        if (!a() || (canvasStrokeRenderer = (CanvasStrokeRenderer) f22611a.get()) == null || (h3 = h(nVar, f10, f11, false)) == null) {
            return;
        }
        canvasStrokeRenderer.draw(canvas, h3, f22613c);
    }

    public static void e(Canvas canvas, List list, float f10, float f11) {
        if (!list.isEmpty() && a()) {
            Object obj = f22611a.get();
            obj.getClass();
            CanvasStrokeRenderer canvasStrokeRenderer = (CanvasStrokeRenderer) obj;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Stroke b10 = b((v7.n) it.next(), f10, f11, true);
                if (b10 != null) {
                    canvasStrokeRenderer.draw(canvas, b10, f22613c);
                }
            }
        }
    }

    public static boolean f() {
        return a();
    }

    public static void g(List list, float f10, float f11) {
        if (!list.isEmpty() && a()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b((v7.n) it.next(), f10, f11, false);
            }
        }
    }

    public static Stroke h(v7.n nVar, float f10, float f11, boolean z3) {
        InputToolType inputToolType;
        long j10;
        try {
            a aVar = nVar.f27464b;
            float[] fArr = nVar.f27467f;
            boolean z9 = nVar.e;
            int i = nVar.f27465c;
            float f12 = nVar.f27466d * f10;
            if (f12 < 0.5f) {
                f12 = 0.5f;
            }
            Brush e = m0.e(aVar, i, f12);
            if (z3) {
                e = Brush.copy$default(e, b(e.getFamily()), 0.0f, 0.0f, 6, null);
            }
            if (z9) {
                inputToolType = InputToolType.STYLUS;
            } else {
                inputToolType = InputToolType.TOUCH;
            }
            InputToolType inputToolType2 = inputToolType;
            MutableStrokeInputBatch mutableStrokeInputBatch = new MutableStrokeInputBatch();
            int length = fArr.length;
            long j11 = -1;
            int i10 = 0;
            while (i10 < length) {
                long j12 = nVar.f27469h[i10];
                long j13 = j11 + 1;
                if (j12 < j13) {
                    j10 = j13;
                } else {
                    j10 = j12;
                }
                MutableStrokeInputBatch.add$default(mutableStrokeInputBatch, inputToolType2, fArr[i10] * f10, nVar.f27468g[i10] * f11, j10, 0.0f, b9.d(nVar.i[i10], 0.05f, 1.0f), 0.0f, 0.0f, 192, null);
                i10++;
                j11 = j10;
            }
            if (mutableStrokeInputBatch.getSize() != 0) {
                return new Stroke(e, mutableStrokeInputBatch);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}