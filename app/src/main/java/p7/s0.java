package p7;
import r0.a;

import android.graphics.Bitmap;
import androidx.ink.brush.TextureBitmapStore;
import java.util.Random;
import wa.b9;

/* loaded from: classes.dex */
public final class s0 implements TextureBitmapStore {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f22566a = new Object();

    @Override // androidx.ink.brush.TextureBitmapStore
    public final Bitmap get(String str) {
        str.getClass();
        if (str.equals("scraply://texture/pencil-grain-v1")) {
            Bitmap bitmap = r0.f22562a;
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
            Random random = new Random(1975L);
            float[] fArr = new float[65536];
            for (int i = 0; i < 65536; i++) {
                fArr[i] = random.nextFloat();
            }
            float[] a10 = a(a(fArr));
            float[] fArr2 = new float[65536];
            for (int i10 = 0; i10 < 65536; i10++) {
                fArr2[i10] = random.nextFloat();
            }
            float[] a11 = a(fArr2);
            int[] iArr = new int[65536];
            for (int i11 = 0; i11 < 65536; i11++) {
                iArr[i11] = (((int) ((b9.d(((((a11[i11] * 0.45f) + (a10[i11] * 0.55f)) - 0.5f) * 3.0f) + 0.5f, 0.0f, 1.0f) * 237.0f) + 18.0f)) << 24) | 16777215;
            }
            Bitmap createBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, 256, 0, 0, 256, 256);
            r0.f22562a = createBitmap;
            return createBitmap;
        }
        return null;
    }
}
