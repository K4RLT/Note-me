package com.google.android.gms.internal.ads;
import a5.a;

import java.io.IOException;

/* loaded from: classes.dex */
public final class p61 extends r61 {
    public p61(String str, String str2) {
        this(new n61(str, str2.toCharArray()), (Character) '=');
    }

    @Override // com.google.android.gms.internal.ads.r61
    public final void a(StringBuilder sb2, byte[] bArr, int i) {
        int i10 = 0;
        b80.P(0, i, bArr.length);
        for (int i11 = i; i11 >= 3; i11 -= 3) {
            int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16) | (bArr[i10 + 2] & 255);
            char[] cArr = this.f10131a.f8576b;
            sb2.append(cArr[i12 >>> 18]);
            sb2.append(cArr[(i12 >>> 12) & 63]);
            sb2.append(cArr[(i12 >>> 6) & 63]);
            sb2.append(cArr[i12 & 63]);
            i10 += 3;
        }
        if (i10 < i) {
            d(sb2, bArr, i10, i - i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.r61
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence e = e(charSequence);
        int length = e.length();
        n61 n61Var = this.f10131a;
        if (n61Var.f8581h[length % n61Var.e]) {
            int i = 0;
            int i10 = 0;
            while (i < e.length()) {
                int i11 = i10 + 1;
                int a10 = (n61Var.a(e.charAt(i + 1)) << 12) | (n61Var.a(e.charAt(i)) << 18);
                bArr[i10] = (byte) (a10 >>> 16);
                int i12 = i + 2;
                if (i12 < e.length()) {
                    int i13 = i + 3;
                    int a11 = a10 | (n61Var.a(e.charAt(i12)) << 6);
                    int i14 = i10 + 2;
                    bArr[i11] = (byte) ((a11 >>> 8) & 255);
                    if (i13 < e.length()) {
                        i += 4;
                        i10 += 3;
                        bArr[i14] = (byte) ((a11 | n61Var.a(e.charAt(i13))) & 255);
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
        int length2 = e.length();
        throw new IOException(a5.a.f(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
    }

    @Override // com.google.android.gms.internal.ads.r61
    public final r61 c(n61 n61Var, Character ch) {
        return new p61(n61Var, ch);
    }

    public p61(n61 n61Var, Character ch) {
        super(n61Var, ch);
        b80.l(n61Var.f8576b.length == 64);
    }
}
