package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class oi extends um1 {

    /* renamed from: w, reason: collision with root package name */
    public MessageDigest f9125w;

    /* renamed from: x, reason: collision with root package name */
    public final int f9126x;

    /* renamed from: y, reason: collision with root package name */
    public final int f9127y;

    public oi(int i) {
        super(3);
        int i10 = i >> 3;
        this.f9126x = (i & 7) > 0 ? i10 + 1 : i10;
        this.f9127y = i;
    }

    public final byte[] U1(String str) {
        synchronized (this.f11688u) {
            try {
                MessageDigest Z = Z();
                this.f9125w = Z;
                if (Z == null) {
                    return new byte[0];
                }
                Z.reset();
                this.f9125w.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] digest = this.f9125w.digest();
                int length = digest.length;
                int i = this.f9126x;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                int i10 = this.f9127y & 7;
                if (i10 > 0) {
                    long j10 = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 > 0) {
                            j10 <<= 8;
                        }
                        j10 += bArr[i11] & 255;
                    }
                    long j11 = j10 >>> (8 - i10);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j11);
                        j11 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
