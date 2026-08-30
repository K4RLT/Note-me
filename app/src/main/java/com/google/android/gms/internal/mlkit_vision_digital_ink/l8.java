package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l8 extends o8 {
    public final char[] e;

    public l8(k8 k8Var) {
        super(k8Var, (Character) null);
        boolean z3;
        this.e = new char[512];
        char[] cArr = k8Var.f14554b;
        if (cArr.length == 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        pa.p(z3);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.o8
    public final int a(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i10 = 0;
            while (i < charSequence.length()) {
                char charAt = charSequence.charAt(i);
                k8 k8Var = this.f14747a;
                bArr[i10] = (byte) ((k8Var.a(charAt) << 4) | k8Var.a(charSequence.charAt(i + 1)));
                i += 2;
                i10++;
            }
            return i10;
        }
        throw new IOException(g3.a.g(charSequence.length(), "Invalid input length "));
    }
}
