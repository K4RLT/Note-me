package v7;
import c.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import java.io.File;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f27404a = Color.argb(255, 24, 24, 27);

    /* renamed from: b, reason: collision with root package name */
    public static final int f27405b = Color.argb(255, 63, 63, 66);

    public static final Bitmap a(Context context, int i) {
        Resources resources = context.getResources();
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        options.inJustDecodeBounds = true;
        options.inScaled = false;
        BitmapFactory.decodeResource(resources, i, options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            return null;
        }
        while (true) {
            if (options.outWidth / i10 <= 1280 && options.outHeight / i10 <= 1280) {
                try {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = i10;
                    options2.inScaled = false;
                    return BitmapFactory.decodeResource(resources, i, options2);
                } catch (OutOfMemoryError unused) {
                    return null;
                }
            }
            i10 *= 2;
        }
    }

    public static final File b(Context context) {
        context.getClass();
        File file = new File(context.getFilesDir(), "covers");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ec A[Catch: Exception -> 0x01dd, TRY_LEAVE, TryCatch #17 {Exception -> 0x01dd, blocks: (B:84:0x01c7, B:86:0x01d8, B:76:0x01e4, B:78:0x01ec), top: B:83:0x01c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final v7.d c(android.content.Context r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.c.c(android.content.Context, java.lang.String):v7.d");
    }
}
