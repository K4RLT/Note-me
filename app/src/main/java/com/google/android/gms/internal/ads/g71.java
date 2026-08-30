package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class g71 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f6324a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i10 = 0; i10 < 26; i10++) {
            byte b10 = (byte) (i10 + 10);
            bArr[i10 + 65] = b10;
            bArr[i10 + 97] = b10;
        }
        f6324a = bArr;
    }
}
