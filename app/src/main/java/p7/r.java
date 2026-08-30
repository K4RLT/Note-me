package p7;
import v.b;
import v.e;
import v.f;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import android.media.ImageReader;
import android.util.Log;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements ImageReader.OnImageAvailableListener {
    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Bitmap bitmap;
        boolean z3 = v.f22585a;
        imageReader.getClass();
        u uVar = v.f22595m;
        if (uVar == null) {
            try {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                if (acquireLatestImage != null) {
                    acquireLatestImage.close();
                    return;
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        v.f22597o = null;
        Rect rect = v.f22596n;
        if (rect == null) {
            rect = new Rect(0, 0, v.f22592j, v.f22593k);
        }
        try {
            bitmap = b(imageReader, rect);
        } catch (Throwable th) {
            Log.w("HwStrokeBaker", "lectura falló: " + th);
            bitmap = null;
        }
        v.f22595m = null;
        v.f22596n = null;
        if (bitmap == null) {
            f("lectura del buffer falló");
        }
        uVar.f22580d.b(bitmap, Integer.valueOf(rect.left), Integer.valueOf(rect.top));
        e();
    }
}
