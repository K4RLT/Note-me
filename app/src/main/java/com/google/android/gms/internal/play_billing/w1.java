package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f15539a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f15540b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f15540b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(int i, int i10, int i11, byte[] bArr) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i = (i * 31) + bArr[i12];
        }
        return i;
    }
}
