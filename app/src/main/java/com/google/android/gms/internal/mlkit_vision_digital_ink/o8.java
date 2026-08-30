package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public class o8 {

    /* renamed from: d, reason: collision with root package name */
    public static final l8 f14746d;

    /* renamed from: a, reason: collision with root package name */
    public final k8 f14747a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f14748b;

    /* renamed from: c, reason: collision with root package name */
    public volatile o8 f14749c;

    static {
        new m8("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new m8("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new o8("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new o8("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f14746d = new l8(new k8("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public o8(k8 k8Var, Character ch) {
        this.f14747a = k8Var;
        boolean z3 = true;
        if (ch != null) {
            byte[] bArr = k8Var.f14557f;
            if (bArr.length > 61 && bArr[61] != -1) {
                z3 = false;
            }
        }
        pa.q(z3, "Padding character %s was already in alphabet", ch);
        this.f14748b = ch;
    }

    public int a(byte[] bArr, CharSequence charSequence) {
        int i;
        CharSequence b10 = b(charSequence);
        int length = b10.length();
        k8 k8Var = this.f14747a;
        boolean z3 = k8Var.f14558g[length % k8Var.f14556d];
        int i10 = k8Var.f14555c;
        if (z3) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < b10.length()) {
                long j10 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    i = k8Var.f14556d;
                    if (i13 >= i) {
                        break;
                    }
                    j10 <<= i10;
                    if (i11 + i13 < b10.length()) {
                        j10 |= k8Var.a(b10.charAt(i14 + i11));
                        i14++;
                    }
                    i13++;
                }
                int i15 = k8Var.e;
                int i16 = i14 * i10;
                int i17 = (i15 - 1) * 8;
                while (i17 >= (i15 * 8) - i16) {
                    bArr[i12] = (byte) ((j10 >>> i17) & 255);
                    i17 -= 8;
                    i12++;
                }
                i11 += i;
            }
            return i12;
        }
        throw new IOException(a.g(b10.length(), "Invalid input length "));
    }

    public final CharSequence b(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f14748b == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o8) {
            o8 o8Var = (o8) obj;
            if (this.f14747a.equals(o8Var.f14747a) && Objects.equals(this.f14748b, o8Var.f14748b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14747a.hashCode() ^ Objects.hashCode(this.f14748b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        k8 k8Var = this.f14747a;
        sb2.append(k8Var);
        if (8 % k8Var.f14555c != 0) {
            Character ch = this.f14748b;
            if (ch == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public o8(String str, String str2) {
        this(new k8(str, str2.toCharArray()), (Character) '=');
    }
}
