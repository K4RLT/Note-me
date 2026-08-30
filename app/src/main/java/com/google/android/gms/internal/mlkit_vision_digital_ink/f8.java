package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;
import x.o;

/* loaded from: classes.dex */
public abstract class f8 {

    /* renamed from: u, reason: collision with root package name */
    public static final char[] f14304u = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z3;
        boolean z9;
        if (obj instanceof f8) {
            byte[] bArr = ((e8) this).f14248v;
            int length = bArr.length * 8;
            byte[] bArr2 = ((e8) ((f8) obj)).f14248v;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z3 = true;
                    for (int i = 0; i < bArr.length; i++) {
                        if (bArr[i] == bArr2[i]) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z3 &= z9;
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((e8) this).f14248v;
        if (bArr.length * 8 >= 32) {
            int length = bArr.length;
            if (length >= 4) {
                int i = bArr[0] & 255;
                int i10 = bArr[1] & 255;
                int i11 = bArr[2] & 255;
                return ((bArr[3] & 255) << 24) | i | (i10 << 8) | (i11 << 16);
            }
            q.x.o(tl.e("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
            return 0;
        }
        int i12 = bArr[0] & 255;
        for (int i13 = 1; i13 < bArr.length; i13++) {
            i12 |= (bArr[i13] & 255) << (i13 * 8);
        }
        return i12;
    }

    public final String toString() {
        byte[] bArr = ((e8) this).f14248v;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            char[] cArr = f14304u;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
