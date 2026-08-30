package y8;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f30990a;

    static {
        Bitmap.Config config;
        Bitmap.Config config2;
        int[] iArr = new int[Bitmap.Config.values().length];
        f30990a = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f30990a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f30990a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f30990a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            int[] iArr2 = f30990a;
            config2 = Bitmap.Config.RGBA_F16;
            iArr2[config2.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            int[] iArr3 = f30990a;
            config = Bitmap.Config.HARDWARE;
            iArr3[config.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
