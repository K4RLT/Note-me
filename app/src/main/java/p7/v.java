package p7;
import f.c;
import f.h;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.ink.geometry.Box;
import androidx.ink.rendering.android.canvas.CanvasStrokeRenderer;
import androidx.ink.strokes.Stroke;
import com.google.android.gms.internal.ads.uv1;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import wa.b9;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f22585a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile SharedPreferences f22586b;

    /* renamed from: c, reason: collision with root package name */
    public static final pe.n f22587c;

    /* renamed from: d, reason: collision with root package name */
    public static final pe.n f22588d;
    public static final Handler e;

    /* renamed from: f, reason: collision with root package name */
    public static final pe.n f22589f;

    /* renamed from: g, reason: collision with root package name */
    public static ImageReader f22590g;

    /* renamed from: h, reason: collision with root package name */
    public static HardwareRenderer f22591h;
    public static RenderNode i;

    /* renamed from: j, reason: collision with root package name */
    public static int f22592j;

    /* renamed from: k, reason: collision with root package name */
    public static int f22593k;

    /* renamed from: l, reason: collision with root package name */
    public static final ArrayDeque f22594l;

    /* renamed from: m, reason: collision with root package name */
    public static u f22595m;

    /* renamed from: n, reason: collision with root package name */
    public static Rect f22596n;

    /* renamed from: o, reason: collision with root package name */
    public static Object f22597o;

    static {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 34) {
            z3 = true;
        } else {
            z3 = false;
        }
        f22585a = z3;
        f22587c = new pe.n(new fg.o(15));
        f22588d = new pe.n(new fg.o(16));
        e = new Handler(Looper.getMainLooper());
        f22589f = new pe.n(new fg.o(17));
        f22594l = new ArrayDeque();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, android.media.ImageReader$OnImageAvailableListener] */
    public static boolean a(int i10, int i11) {
        ImageReader newInstance;
        if (!f22585a) {
            return false;
        }
        if (f22590g != null && f22591h != null && i != null && f22592j == i10 && f22593k == i11) {
            return true;
        }
        try {
            c();
            f22592j = i10;
            f22593k = i11;
            newInstance = ImageReader.newInstance(i10, i11, 1, 3, 515L);
            newInstance.getClass();
            newInstance.setOnImageAvailableListener(new Object(), (Handler) f22588d.getValue());
            a7.h.g();
            RenderNode c10 = n1.c();
            c10.setPosition(0, 0, i10, i11);
            n1.h();
            HardwareRenderer e8 = uv1.e();
            e8.setSurface(newInstance.getSurface());
            e8.setContentRoot(c10);
            e8.setLightSourceGeometry(i10 / 2.0f, 0.0f, 600.0f, 800.0f);
            e8.setLightSourceAlpha(0.0f, 0.0f);
            f22590g = newInstance;
            f22591h = e8;
            i = c10;
            return true;
        } catch (Throwable th) {
            Log.w("HwStrokeBaker", "montaje falló: " + th);
            f("montaje de ImageReader/HardwareRenderer falló");
            c();
            return false;
        }
    }

    public static Bitmap b(ImageReader imageReader, Rect rect) {
        Image.Plane plane;
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage == null) {
            return null;
        }
        try {
            Image.Plane[] planes = acquireLatestImage.getPlanes();
            planes.getClass();
            if (planes.length == 0) {
                plane = null;
            } else {
                plane = planes[0];
            }
            if (plane == null) {
                acquireLatestImage.close();
                return null;
            }
            ByteBuffer buffer = plane.getBuffer();
            buffer.getClass();
            int rowStride = plane.getRowStride();
            if (plane.getPixelStride() != 4) {
                acquireLatestImage.close();
                return null;
            }
            int width = rect.width();
            int height = rect.height();
            int i10 = width * 4;
            ByteBuffer wrap = ByteBuffer.wrap(new byte[i10 * height]);
            ByteBuffer duplicate = buffer.duplicate();
            for (int i11 = 0; i11 < height; i11++) {
                int i12 = (rect.left * 4) + ((rect.top + i11) * rowStride);
                duplicate.limit(i12 + i10);
                duplicate.position(i12);
                wrap.put(duplicate);
            }
            wrap.rewind();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            createBitmap.copyPixelsFromBuffer(wrap);
            acquireLatestImage.close();
            return createBitmap;
        } catch (Throwable th) {
            acquireLatestImage.close();
            throw th;
        }
    }

    public static void c() {
        try {
            HardwareRenderer hardwareRenderer = f22591h;
            if (hardwareRenderer != null) {
                hardwareRenderer.destroy();
            }
        } catch (Throwable unused) {
        }
        try {
            ImageReader imageReader = f22590g;
            if (imageReader != null) {
                imageReader.close();
            }
        } catch (Throwable unused2) {
        }
        try {
            RenderNode renderNode = i;
            if (renderNode != null) {
                renderNode.discardDisplayList();
            }
        } catch (Throwable unused3) {
        }
        f22591h = null;
        f22590g = null;
        i = null;
        f22592j = 0;
        f22593k = 0;
    }

    public static boolean d(u uVar) {
        HardwareRenderer hardwareRenderer;
        RenderNode renderNode;
        RecordingCanvas beginRecording;
        HardwareRenderer.FrameRenderRequest createRenderRequest;
        HardwareRenderer.FrameRenderRequest waitForPresent;
        int syncAndDraw;
        Bitmap bitmap = uVar.f22577a;
        Stroke stroke = uVar.f22578b;
        Matrix matrix = uVar.f22579c;
        if (a(bitmap.getWidth(), bitmap.getHeight()) && (hardwareRenderer = f22591h) != null && (renderNode = i) != null) {
            try {
                Box computeBoundingBox = stroke.getShape().computeBoundingBox();
                if (computeBoundingBox != null) {
                    RectF rectF = new RectF(computeBoundingBox.getXMin(), computeBoundingBox.getYMin(), computeBoundingBox.getXMax(), computeBoundingBox.getYMax());
                    matrix.mapRect(rectF);
                    float f10 = 16;
                    Rect rect = new Rect(b9.e((int) (rectF.left - f10), 0, f22592j), b9.e((int) (rectF.top - f10), 0, f22593k), b9.e((int) (rectF.right + f10), 0, f22592j), b9.e((int) (rectF.bottom + f10), 0, f22593k));
                    if (!rect.isEmpty()) {
                        f22596n = rect;
                        beginRecording = renderNode.beginRecording(f22592j, f22593k);
                        beginRecording.getClass();
                        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
                        beginRecording.drawColor(0, PorterDuff.Mode.CLEAR);
                        beginRecording.save();
                        beginRecording.concat(matrix);
                        ((CanvasStrokeRenderer) f22589f.getValue()).draw(beginRecording, stroke, matrix);
                        beginRecording.restore();
                        renderNode.endRecording();
                        createRenderRequest = hardwareRenderer.createRenderRequest();
                        waitForPresent = createRenderRequest.setWaitForPresent(false);
                        syncAndDraw = waitForPresent.syncAndDraw();
                        if ((syncAndDraw & 14) == 0) {
                            Object obj = new Object();
                            f22597o = obj;
                            ((Handler) f22588d.getValue()).postDelayed(new a6.e(23, obj), 2000L);
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                Log.w("HwStrokeBaker", "startFrame falló: " + th);
                return false;
            }
        }
        return false;
    }

    public static void e() {
        while (true) {
            u uVar = (u) f22594l.poll();
            if (uVar != null) {
                if (f22585a && !uVar.f22577a.isRecycled()) {
                    f22595m = uVar;
                    if (!d(uVar)) {
                        c();
                        if (f22585a && d(uVar)) {
                            return;
                        }
                        f22595m = null;
                        uVar.f22580d.b(null, 0, 0);
                    } else {
                        return;
                    }
                } else {
                    uVar.f22580d.b(null, 0, 0);
                }
            } else {
                return;
            }
        }
    }

    public static void f(String str) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        if (f22585a) {
            f22585a = false;
            Log.w("HwStrokeBaker", "cortacircuitos: " + str + " → camino software en este equipo");
            try {
                SharedPreferences sharedPreferences = f22586b;
                if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putBoolean = edit.putBoolean("disabled", true)) != null) {
                    putBoolean.apply();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
