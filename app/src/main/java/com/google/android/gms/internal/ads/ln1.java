package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class ln1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f8074a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f8075b;

    static {
        byte[] bArr = new byte[0];
        f8074a = bArr;
        f8075b = ByteBuffer.wrap(bArr);
        rm1.k(bArr, 0, 0);
    }

    public static void a() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i, int i10, int i11, byte[] bArr) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i = (i * 31) + bArr[i12];
        }
        return i;
    }
}
