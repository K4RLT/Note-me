package com.google.android.gms.internal.ads;
import q.x;

import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public abstract class fg {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f6059a = "0123456789abcdef".toCharArray();

    public static byte[] a(String str) {
        int length = str.length();
        if ((length & 1) == 0) {
            byte[] bArr = new byte[length >> 1];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
            }
            return bArr;
        }
        q.x.n("String must be of even-length");
        return null;
    }

    public static long b(double d2, DisplayMetrics displayMetrics) {
        return Math.round(d2 / displayMetrics.density);
    }
}
