package com.google.android.filament.android;

import android.graphics.Bitmap;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import q.x;
import y8.a;

/* loaded from: classes.dex */
public abstract class TextureHelper {
    public static void a(Engine engine, Texture texture, Bitmap bitmap) {
        int i;
        int k3 = texture.k();
        int j10 = texture.j();
        int i10 = a.f30990a[bitmap.getConfig().ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 == 6) {
                            i = 5;
                        }
                    } else {
                        i11 = 4;
                    }
                } else {
                    i = 2;
                }
                if (i == 2 && i != 5) {
                    nSetBitmap(texture.getNativeObject(), engine.getNativeObject(), 0, 0, 0, k3, j10, bitmap, i);
                    return;
                } else {
                    x.n("Unsupported config: ARGB_4444 or HARDWARE");
                }
            }
        } else {
            i11 = 0;
        }
        i = i11;
        if (i == 2) {
        }
        x.n("Unsupported config: ARGB_4444 or HARDWARE");
    }

    private static native void nSetBitmap(long j10, long j11, int i, int i10, int i11, int i12, int i13, Bitmap bitmap, int i14);
}
