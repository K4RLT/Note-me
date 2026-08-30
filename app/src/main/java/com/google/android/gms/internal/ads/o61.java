package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o61 extends r61 {

    /* renamed from: g, reason: collision with root package name */
    public final char[] f8994g;

    public o61(n61 n61Var) {
        super(n61Var, (Character) null);
        boolean z3;
        this.f8994g = new char[512];
        if (n61Var.f8576b.length == 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.f8994g;
            char[] cArr2 = n61Var.f8576b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // com.google.android.gms.internal.ads.r61
    public final void a(StringBuilder sb2, byte[] bArr, int i) {
        b80.P(0, i, bArr.length);
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.f8994g;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.r61
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i10 = 0;
            while (i < charSequence.length()) {
                char charAt = charSequence.charAt(i);
                n61 n61Var = this.f10131a;
                bArr[i10] = (byte) ((n61Var.a(charAt) << 4) | n61Var.a(charSequence.charAt(i + 1)));
                i += 2;
                i10++;
            }
            return i10;
        }
        int length = charSequence.length();
        throw new IOException(a5.a.f(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
    }

    @Override // com.google.android.gms.internal.ads.r61
    public final r61 c(n61 n61Var, Character ch) {
        return new o61(n61Var);
    }
}
