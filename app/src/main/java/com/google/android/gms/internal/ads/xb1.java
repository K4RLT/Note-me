package com.google.android.gms.internal.ads;
import q.x;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class xb1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f12545a = c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            b(iArr, 0, 4, 8, 12);
            b(iArr, 1, 5, 9, 13);
            b(iArr, 2, 6, 10, 14);
            b(iArr, 3, 7, 11, 15);
            b(iArr, 0, 5, 10, 15);
            b(iArr, 1, 6, 11, 12);
            b(iArr, 2, 7, 8, 13);
            b(iArr, 3, 4, 9, 14);
        }
    }

    public static void b(int[] iArr, int i, int i10, int i11, int i12) {
        int i13 = iArr[i] + iArr[i10];
        iArr[i] = i13;
        int i14 = i13 ^ iArr[i12];
        int i15 = (i14 >>> (-16)) | (i14 << 16);
        iArr[i12] = i15;
        int i16 = iArr[i11] + i15;
        iArr[i11] = i16;
        int i17 = iArr[i10] ^ i16;
        int i18 = (i17 >>> (-12)) | (i17 << 12);
        iArr[i10] = i18;
        int i19 = iArr[i] + i18;
        iArr[i] = i19;
        int i20 = iArr[i12] ^ i19;
        int i21 = (i20 >>> (-8)) | (i20 << 8);
        iArr[i12] = i21;
        int i22 = iArr[i11] + i21;
        iArr[i11] = i22;
        int i23 = iArr[i10] ^ i22;
        iArr[i10] = (i23 >>> (-7)) | (i23 << 7);
    }

    public static int[] c(byte[] bArr) {
        if ((bArr.length & 3) == 0) {
            IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
            int[] iArr = new int[asIntBuffer.remaining()];
            asIntBuffer.get(iArr);
            return iArr;
        }
        q.x.n("invalid input length");
        return null;
    }

    public static int[] d(int[] iArr, int[] iArr2) {
        int[] iArr3 = f12545a;
        int length = iArr3.length;
        System.arraycopy(iArr3, 0, r0, 0, length);
        System.arraycopy(iArr, 0, r0, length, 8);
        int[] iArr4 = {0, 0, 0, 0, iArr4[12], iArr4[13], iArr4[14], iArr4[15], 0, 0, 0, 0, iArr2[0], iArr2[1], iArr2[2], iArr2[3]};
        a(iArr4);
        return Arrays.copyOf(iArr4, 8);
    }
}
