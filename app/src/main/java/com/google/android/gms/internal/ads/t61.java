package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class t61 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11261a = 0;

    static {
        new s61(0);
    }

    public static byte[] a(InputStream inputStream) {
        int i;
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        int i10 = 0;
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = inputStream.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return b(arrayDeque, i10);
                }
                i11 += read;
                i10 += read;
            }
            if (min < 4096) {
                i = 4;
            } else {
                i = 2;
            }
            min = ct.m(min * i);
        }
        if (inputStream.read() == -1) {
            return b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static byte[] b(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i);
        int i10 = i - length;
        while (i10 > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(i10, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - i10, min);
            i10 -= min;
        }
        return copyOf;
    }
}
