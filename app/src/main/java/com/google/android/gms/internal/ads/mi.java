package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class mi extends um1 {

    /* renamed from: w, reason: collision with root package name */
    public MessageDigest f8345w;

    public final byte[] U1(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int n10 = xy.n(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(n10);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i10 = 0; i10 < split.length; i10++) {
                    int n11 = xy.n(split[i10]);
                    int i11 = (n11 >> 16) ^ ((char) n11);
                    byte b10 = (byte) i11;
                    byte b11 = (byte) (i11 >> 8);
                    int i12 = i10 + i10;
                    bArr[i12] = new byte[]{b10, b11}[0];
                    bArr[i12 + 1] = b11;
                }
            } else {
                bArr = new byte[length];
                for (int i13 = 0; i13 < split.length; i13++) {
                    int n12 = xy.n(split[i13]);
                    bArr[i13] = (byte) ((n12 >> 24) ^ (((n12 & 255) ^ ((n12 >> 8) & 255)) ^ ((n12 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.f8345w = Z();
        synchronized (this.f11688u) {
            try {
                MessageDigest messageDigest = this.f8345w;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f8345w.update(bArr2);
                byte[] digest = this.f8345w.digest();
                int length2 = digest.length;
                if (length2 <= 4) {
                    i = length2;
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(digest, 0, bArr3, 0, i);
                return bArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
