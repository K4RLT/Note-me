package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class r61 {

    /* renamed from: d, reason: collision with root package name */
    public static final p61 f10129d = new p61("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final p61 e = new p61("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* renamed from: f, reason: collision with root package name */
    public static final o61 f10130f;

    /* renamed from: a, reason: collision with root package name */
    public final n61 f10131a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f10132b;

    /* renamed from: c, reason: collision with root package name */
    public volatile r61 f10133c;

    static {
        new r61("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new r61("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f10130f = new o61(new n61("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public r61(n61 n61Var, Character ch) {
        this.f10131a = n61Var;
        boolean z3 = true;
        if (ch != null) {
            byte[] bArr = n61Var.f8580g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z3 = false;
            }
        }
        b80.J(z3, "Padding character %s was already in alphabet", ch);
        this.f10132b = ch;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i) {
        int i10 = 0;
        b80.P(0, i, bArr.length);
        while (i10 < i) {
            int i11 = this.f10131a.f8579f;
            d(sb2, bArr, i10, Math.min(i11, i - i10));
            i10 += i11;
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) {
        int i;
        CharSequence e8 = e(charSequence);
        int length = e8.length();
        n61 n61Var = this.f10131a;
        boolean z3 = n61Var.f8581h[length % n61Var.e];
        int i10 = n61Var.f8578d;
        if (z3) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < e8.length()) {
                long j10 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    i = n61Var.e;
                    if (i13 >= i) {
                        break;
                    }
                    j10 <<= i10;
                    if (i11 + i13 < e8.length()) {
                        j10 |= n61Var.a(e8.charAt(i14 + i11));
                        i14++;
                    }
                    i13++;
                }
                int i15 = n61Var.f8579f;
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
        int length2 = e8.length();
        throw new IOException(a5.a.f(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
    }

    public r61 c(n61 n61Var, Character ch) {
        return new r61(n61Var, ch);
    }

    public final void d(StringBuilder sb2, byte[] bArr, int i, int i10) {
        boolean z3;
        b80.P(i, i + i10, bArr.length);
        n61 n61Var = this.f10131a;
        int i11 = n61Var.f8579f;
        int i12 = 0;
        if (i10 <= i11) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        long j10 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            j10 = (j10 | (bArr[i + i13] & 255)) << 8;
        }
        int i14 = (i10 + 1) * 8;
        int i15 = n61Var.f8578d;
        while (i12 < i10 * 8) {
            sb2.append(n61Var.f8576b[n61Var.f8577c & ((int) (j10 >>> ((i14 - i15) - i12)))]);
            i12 += i15;
        }
        if (this.f10132b != null) {
            while (i12 < i11 * 8) {
                sb2.append('=');
                i12 += i15;
            }
        }
    }

    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f10132b == null) {
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
        if (obj instanceof r61) {
            r61 r61Var = (r61) obj;
            if (this.f10131a.equals(r61Var.f10131a) && Objects.equals(this.f10132b, r61Var.f10132b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    public final r61 f() {
        n61 n61Var;
        boolean z3;
        r61 r61Var = this.f10133c;
        if (r61Var == null) {
            n61 n61Var2 = this.f10131a;
            int i = 0;
            while (true) {
                char[] cArr = n61Var2.f8576b;
                int length = cArr.length;
                if (i < length) {
                    if (ed1.H(cArr[i])) {
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                char c10 = cArr[i10];
                                if (c10 >= 'a' && c10 <= 'z') {
                                    z3 = true;
                                    break;
                                }
                                i10++;
                            } else {
                                z3 = false;
                                break;
                            }
                        }
                        b80.L("Cannot call lowerCase() on a mixed-case alphabet", !z3);
                        char[] cArr2 = new char[cArr.length];
                        for (int i11 = 0; i11 < cArr.length; i11++) {
                            char c11 = cArr[i11];
                            if (ed1.H(c11)) {
                                c11 ^= 32;
                            }
                            cArr2[i11] = (char) c11;
                        }
                        n61Var = new n61(n61Var2.f8575a.concat(".lowerCase()"), cArr2);
                        if (n61Var2.i && !n61Var.i) {
                            byte[] bArr = n61Var.f8580g;
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            for (int i12 = 65; i12 <= 90; i12++) {
                                int i13 = i12 | 32;
                                byte b10 = bArr[i12];
                                byte b11 = bArr[i13];
                                if (b10 == -1) {
                                    copyOf[i12] = b11;
                                } else {
                                    char c12 = (char) i12;
                                    char c13 = (char) i13;
                                    if (b11 == -1) {
                                        copyOf[i13] = b10;
                                    } else {
                                        q.x.o(ay0.B("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                                        return null;
                                    }
                                }
                            }
                            n61Var = new n61(n61Var.f8575a.concat(".ignoreCase()"), n61Var.f8576b, copyOf, true);
                        }
                    } else {
                        i++;
                    }
                } else {
                    n61Var = n61Var2;
                    break;
                }
            }
            if (n61Var == n61Var2) {
                r61Var = this;
            } else {
                r61Var = c(n61Var, this.f10132b);
            }
            this.f10133c = r61Var;
        }
        return r61Var;
    }

    public final String g(byte[] bArr, int i) {
        b80.P(0, i, bArr.length);
        n61 n61Var = this.f10131a;
        int i10 = n61Var.f8579f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(n61Var.e * x21.u(i, i10));
        try {
            a(sb2, bArr, i);
            return sb2.toString();
        } catch (IOException e8) {
            g5.q.f(e8);
            return null;
        }
    }

    public final byte[] h(String str) {
        try {
            int length = (int) (((this.f10131a.f8578d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b10 = b(bArr, e(str));
            if (b10 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[b10];
            System.arraycopy(bArr, 0, bArr2, 0, b10);
            return bArr2;
        } catch (q61 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public final int hashCode() {
        return this.f10131a.hashCode() ^ Objects.hashCode(this.f10132b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        n61 n61Var = this.f10131a;
        sb2.append(n61Var);
        if (8 % n61Var.f8578d != 0) {
            Character ch = this.f10132b;
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

    public r61(String str, String str2) {
        this(new n61(str, str2.toCharArray()), (Character) '=');
    }
}
