package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class d5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f13686a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f13687b;

    static {
        Charset.forName("US-ASCII");
        f13686a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f13687b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length >= 0) {
                int i = (0 - 0) + length;
                if (i >= 0) {
                    if (i <= Integer.MAX_VALUE) {
                        return;
                    } else {
                        throw h5.d();
                    }
                }
                throw h5.c();
            }
            throw h5.b();
        } catch (h5 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
