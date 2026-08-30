package a7;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Matrix f341a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public static final k f342b = new k(0);

    /* renamed from: c, reason: collision with root package name */
    public static final k f343c = new k(1);

    /* renamed from: d, reason: collision with root package name */
    public static final k f344d = new k(2);
    public static final k e = new k(3);

    /* renamed from: f, reason: collision with root package name */
    public static final float f345f = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f10, float f11, float f12) {
        PathMeasure pathMeasure = (PathMeasure) f342b.get();
        Path path2 = (Path) f343c.get();
        Path path3 = (Path) f344d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if ((f10 != 1.0f || f11 != 0.0f) && length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float min = Math.min(f13, f14) + f15;
            float max = Math.max(f13, f14) + f15;
            if (min >= length && max >= length) {
                min = g.d(min, length);
                max = g.d(max, length);
            }
            if (min < 0.0f) {
                min = g.d(min, length);
            }
            if (max < 0.0f) {
                max = g.d(max, length);
            }
            if (min == max) {
                path.reset();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e8) {
            throw e8;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap, int i, int i10) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i10, true);
        bitmap.recycle();
        return createScaledBitmap;
    }
}
