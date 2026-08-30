package com.google.android.gms.internal.ads;
import g5.q;
import p.a;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gl1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6427a;

    public gl1(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f6427a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static gl1 a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int length2 = bArr.length;
            if (length > length2) {
                length = length2;
            }
            return new gl1(bArr, length);
        }
        q.h("data must be non-null");
        return null;
    }

    public final byte[] b() {
        byte[] bArr = this.f6427a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gl1)) {
            return false;
        }
        return Arrays.equals(((gl1) obj).f6427a, this.f6427a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6427a);
    }

    public final String toString() {
        byte[] bArr = this.f6427a;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            sb2.append("0123456789abcdef".charAt((b10 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b10 & 15));
        }
        String sb3 = sb2.toString();
        return a.o(new StringBuilder(sb3.length() + 7), "Bytes(", sb3, ")");
    }
}
