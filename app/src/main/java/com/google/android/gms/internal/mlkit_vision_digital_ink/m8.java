package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;

import java.io.IOException;

/* loaded from: classes.dex */
public final class m8 extends o8 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m8(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_digital_ink.k8 r0 = new com.google.android.gms.internal.mlkit_vision_digital_ink.k8
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r2 = 61
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r1.<init>(r0, r2)
            int r2 = r3.length
            r3 = 64
            if (r2 != r3) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            com.google.android.gms.internal.mlkit_vision_digital_ink.pa.p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.m8.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.o8
    public final int a(byte[] bArr, CharSequence charSequence) {
        CharSequence b10 = b(charSequence);
        int length = b10.length();
        k8 k8Var = this.f14747a;
        if (k8Var.f14558g[length % k8Var.f14556d]) {
            int i = 0;
            int i10 = 0;
            while (i < b10.length()) {
                int i11 = i10 + 1;
                int a10 = (k8Var.a(b10.charAt(i + 1)) << 12) | (k8Var.a(b10.charAt(i)) << 18);
                bArr[i10] = (byte) (a10 >>> 16);
                int i12 = i + 2;
                if (i12 < b10.length()) {
                    int i13 = i + 3;
                    int a11 = a10 | (k8Var.a(b10.charAt(i12)) << 6);
                    int i14 = i10 + 2;
                    bArr[i11] = (byte) ((a11 >>> 8) & 255);
                    if (i13 < b10.length()) {
                        i += 4;
                        i10 += 3;
                        bArr[i14] = (byte) ((a11 | k8Var.a(b10.charAt(i13))) & 255);
                    } else {
                        i10 = i14;
                        i = i13;
                    }
                } else {
                    i = i12;
                    i10 = i11;
                }
            }
            return i10;
        }
        throw new IOException(g3.a.g(b10.length(), "Invalid input length "));
    }
}
