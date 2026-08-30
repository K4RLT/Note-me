package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class xk0 {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f12577d = {'\r', '\n'};
    public static final char[] e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final j51 f12578f = j51.v(new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE}, 5);

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f12579g = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12580a;

    /* renamed from: b, reason: collision with root package name */
    public int f12581b;

    /* renamed from: c, reason: collision with root package name */
    public int f12582c;

    public xk0(int i) {
        this.f12580a = new byte[i];
        this.f12582c = i;
    }

    public static int u(Charset charset) {
        b80.J(f12578f.contains(charset), "Unsupported charset: %s", charset);
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) {
            return 2;
        }
        return 1;
    }

    public static boolean w(byte b10) {
        return (b10 & 192) == 128;
    }

    public static int x(int i, int i10, int i11, int i12) {
        return ct.y((byte) 0, b80.a(((i & 7) << 2) | ((i10 & 48) >> 4)), b80.a(((i11 & 60) >> 2) | ((i10 & 15) << 4)), b80.a((i12 & 63) | ((i11 & 3) << 6)));
    }

    public final void A(int i) {
        byte[] bArr = this.f12580a;
        if (i > bArr.length) {
            this.f12580a = Arrays.copyOf(bArr, i);
        }
    }

    public final int B() {
        return Math.max(this.f12582c - this.f12581b, 0);
    }

    public final void C(int i) {
        boolean z3 = false;
        if (i >= 0 && i <= this.f12580a.length) {
            z3 = true;
        }
        b80.l(z3);
        this.f12582c = i;
    }

    public final int D() {
        return this.f12581b;
    }

    public final void E(int i) {
        boolean z3 = false;
        if (i >= 0 && i <= this.f12582c) {
            z3 = true;
        }
        b80.l(z3);
        this.f12581b = i;
    }

    public final byte[] F() {
        return this.f12580a;
    }

    public final void G(int i) {
        E(this.f12581b + i);
    }

    public final void H(byte[] bArr, int i, int i10) {
        v(i10);
        System.arraycopy(this.f12580a, this.f12581b, bArr, i, i10);
        this.f12581b += i10;
    }

    public final int I() {
        v(1);
        return this.f12580a[this.f12581b] & 255;
    }

    public final int J() {
        if (B() >= 4) {
            this.f12581b -= 4;
            return b();
        }
        int i = this.f12581b;
        int i10 = this.f12582c;
        q.x.l(g3.a.f(i, i10, "position=", ", limit=", new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i10).length())));
        return 0;
    }

    public final int K() {
        v(1);
        byte[] bArr = this.f12580a;
        int i = this.f12581b;
        this.f12581b = i + 1;
        return bArr[i] & 255;
    }

    public final int L() {
        v(2);
        byte[] bArr = this.f12580a;
        int i = this.f12581b;
        int i10 = i + 1;
        this.f12581b = i10;
        int i11 = bArr[i] & 255;
        this.f12581b = i + 2;
        return (bArr[i10] & 255) | (i11 << 8);
    }

    public final int M() {
        v(2);
        byte[] bArr = this.f12580a;
        int i = this.f12581b;
        int i10 = i + 1;
        this.f12581b = i10;
        int i11 = bArr[i] & 255;
        this.f12581b = i + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final short N() {
        v(2);
        byte[] bArr = this.f12580a;
        int i = this.f12581b;
        int i10 = i + 1;
        this.f12581b = i10;
        int i11 = bArr[i] & 255;
        this.f12581b = i + 2;
        return (short) ((bArr[i10] & 255) | (i11 << 8));
    }

    public final int O() {
        v(3);
        byte[] bArr = this.f12580a;
        int i = this.f12581b;
        int i10 = i + 1;
        this.f12581b = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.f12581b = i12;
        int i13 = bArr[i10] & 255;
        this.f12581b = i + 3;
        return (bArr[i12] & 255) | (i11 << 16) | (i13 << 8);
    }

    public final long P() {
        v(4);
        byte[] bArr = this.f12580a;
        int i = this.f12581b;
        int i10 = i + 1;
        this.f12581b = i10;
        long j10 = bArr[i];
        int i11 = i + 2;
        this.f12581b = i11;
        long j11 = bArr[i10];
        this.f12581b = i + 3;
        long j12 = bArr[i11];
        this.f12581b = i + 4;
        return (bArr[r3] & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public final long a() {
        v(4);
        byte[] bArr = this.f12580a;
        int i = this.f12581b;
        int i10 = i + 1;
        this.f12581b = i10;
        long j10 = bArr[i];
        int i11 = i + 2;
        this.f12581b = i11;
        long j11 = bArr[i10];
        this.f12581b = i + 3;
        long j12 = bArr[i11];
        this.f12581b = i + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j10) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final int b() {
        v(4);
        byte[] bArr = this.f12580a;
        int i = this.f12581b;
        int i10 = i + 1;
        this.f12581b = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.f12581b = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i + 3;
        this.f12581b = i14;
        int i15 = bArr[i12] & 255;
        this.f12581b = i + 4;
        return (bArr[i14] & 255) | (i11 << 24) | (i13 << 16) | (i15 << 8);
    }

    public final int c() {
        v(4);
        byte[] bArr = this.f12580a;
        int i = this.f12581b;
        int i10 = i + 1;
        this.f12581b = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.f12581b = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i + 3;
        this.f12581b = i14;
        int i15 = bArr[i12] & 255;
        this.f12581b = i + 4;
        return ((bArr[i14] & 255) << 24) | (i13 << 8) | i11 | (i15 << 16);
    }

    public final long d() {
        v(8);
        byte[] bArr = this.f12580a;
        int i = this.f12581b;
        int i10 = i + 1;
        this.f12581b = i10;
        long j10 = bArr[i];
        int i11 = i + 2;
        this.f12581b = i11;
        long j11 = bArr[i10];
        int i12 = i + 3;
        this.f12581b = i12;
        long j12 = bArr[i11];
        int i13 = i + 4;
        this.f12581b = i13;
        long j13 = bArr[i12];
        int i14 = i + 5;
        this.f12581b = i14;
        long j14 = bArr[i13];
        int i15 = i + 6;
        this.f12581b = i15;
        long j15 = bArr[i14];
        this.f12581b = i + 7;
        long j16 = bArr[i15];
        this.f12581b = i + 8;
        return ((j16 & 255) << 8) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | (bArr[r4] & 255);
    }

    public final long e() {
        v(8);
        byte[] bArr = this.f12580a;
        int i = this.f12581b;
        int i10 = i + 1;
        this.f12581b = i10;
        long j10 = bArr[i];
        int i11 = i + 2;
        this.f12581b = i11;
        long j11 = bArr[i10];
        int i12 = i + 3;
        this.f12581b = i12;
        long j12 = bArr[i11];
        int i13 = i + 4;
        this.f12581b = i13;
        long j13 = bArr[i12];
        int i14 = i + 5;
        this.f12581b = i14;
        long j14 = bArr[i13];
        int i15 = i + 6;
        this.f12581b = i15;
        long j15 = bArr[i14];
        this.f12581b = i + 7;
        long j16 = bArr[i15];
        this.f12581b = i + 8;
        return ((j16 & 255) << 48) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j15 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public final int f() {
        v(4);
        byte[] bArr = this.f12580a;
        int i = this.f12581b;
        int i10 = i + 1;
        this.f12581b = i10;
        int i11 = bArr[i] & 255;
        this.f12581b = i + 2;
        int i12 = bArr[i10] & 255;
        this.f12581b = i + 4;
        return (i11 << 8) | i12;
    }

    public final int g() {
        return (K() << 21) | (K() << 14) | (K() << 7) | K();
    }

    public final int h() {
        int b10 = b();
        if (b10 >= 0) {
            return b10;
        }
        q.x.o(a5.a.f(b10, "Top bit not zero: ", new StringBuilder(String.valueOf(b10).length() + 18)));
        return 0;
    }

    public final int i() {
        int c10 = c();
        if (c10 >= 0) {
            return c10;
        }
        q.x.o(a5.a.f(c10, "Top bit not zero: ", new StringBuilder(String.valueOf(c10).length() + 18)));
        return 0;
    }

    public final long j() {
        long d2 = d();
        if (d2 >= 0) {
            return d2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(d2).length() + 18);
        sb2.append("Top bit not zero: ");
        sb2.append(d2);
        throw new IllegalStateException(sb2.toString());
    }

    public final String k(int i, Charset charset) {
        v(i);
        byte[] bArr = this.f12580a;
        int i10 = this.f12581b;
        String str = new String(bArr, i10, i, charset);
        this.f12581b = i10 + i;
        return str;
    }

    public final String l(int i) {
        int i10;
        v(i);
        if (i == 0) {
            return "";
        }
        int i11 = this.f12581b;
        int i12 = (i11 + i) - 1;
        if (i12 < this.f12582c && this.f12580a[i12] == 0) {
            i10 = i - 1;
        } else {
            i10 = i;
        }
        byte[] bArr = this.f12580a;
        String str = bq0.f4860a;
        String str2 = new String(bArr, i11, i10, StandardCharsets.UTF_8);
        this.f12581b += i;
        return str2;
    }

    public final String m() {
        if (B() == 0) {
            return null;
        }
        int i = this.f12581b;
        while (i < this.f12582c && this.f12580a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f12580a;
        int i10 = this.f12581b;
        String str = bq0.f4860a;
        String str2 = new String(bArr, i10, i - i10, StandardCharsets.UTF_8);
        this.f12581b = i;
        if (i < this.f12582c) {
            this.f12581b = i + 1;
        }
        return str2;
    }

    public final String n(Charset charset) {
        b80.J(f12578f.contains(charset), "Unsupported charset: %s", charset);
        if (B() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            q();
        }
        int i = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                q.x.n("Unsupported charset: ".concat(String.valueOf(charset)));
                return null;
            }
        }
        int i10 = this.f12581b;
        while (true) {
            int i11 = this.f12582c;
            if (i10 < i11 - (i - 1)) {
                if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                    byte b10 = this.f12580a[i10];
                    String str = bq0.f4860a;
                    if (b10 != 10) {
                        if (b10 == 13) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.f12580a;
                    if (bArr[i10] == 0) {
                        byte b11 = bArr[i10 + 1];
                        String str2 = bq0.f4860a;
                        if (b11 != 10) {
                            if (b11 == 13) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.f12580a;
                    if (bArr2[i10 + 1] == 0) {
                        byte b12 = bArr2[i10];
                        String str3 = bq0.f4860a;
                        if (b12 == 10 || b12 == 13) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i10 += i;
            } else {
                i10 = i11;
                break;
            }
        }
        String k3 = k(i10 - this.f12581b, charset);
        if (this.f12581b != this.f12582c && s(charset, f12577d) == '\r') {
            s(charset, e);
        }
        return k3;
    }

    public final long o() {
        int i;
        v(1);
        long j10 = this.f12580a[this.f12581b];
        int i10 = 7;
        while (true) {
            i = 0;
            if (i10 < 0) {
                break;
            }
            if (((1 << i10) & j10) != 0) {
                i10--;
            } else if (i10 < 6) {
                j10 &= r7 - 1;
                i = 7 - i10;
            } else if (i10 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            v(i);
            for (int i11 = 1; i11 < i; i11++) {
                if ((this.f12580a[this.f12581b + i11] & 192) == 128) {
                    j10 = (j10 << 6) | (r3 & 63);
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 42);
                    sb2.append("Invalid UTF-8 sequence continuation byte: ");
                    sb2.append(j10);
                    throw new NumberFormatException(sb2.toString());
                }
            }
            this.f12581b += i;
            return j10;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 35);
        sb3.append("Invalid UTF-8 sequence first byte: ");
        sb3.append(j10);
        throw new NumberFormatException(sb3.toString());
    }

    public final long p() {
        long j10 = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f12581b != this.f12582c) {
                long K = K();
                j10 |= (127 & K) << (i * 7);
                if ((K & 128) == 0) {
                    return j10;
                }
            } else {
                q.x.o("Attempting to read a byte over the limit.");
                return 0L;
            }
        }
        return j10;
    }

    public final Charset q() {
        if (B() >= 3) {
            byte[] bArr = this.f12580a;
            int i = this.f12581b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f12581b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (B() >= 2) {
            byte[] bArr2 = this.f12580a;
            int i10 = this.f12581b;
            byte b10 = bArr2[i10];
            if (b10 == -2) {
                if (bArr2[i10 + 1] == -1) {
                    this.f12581b = i10 + 2;
                    return StandardCharsets.UTF_16BE;
                }
                return null;
            }
            if (b10 == -1 && bArr2[i10 + 1] == -2) {
                this.f12581b = i10 + 2;
                return StandardCharsets.UTF_16LE;
            }
            return null;
        }
        return null;
    }

    public final char r(int i, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        v(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.f12580a;
        int i10 = this.f12581b;
        if (byteOrder == byteOrder2) {
            int i11 = i10 + i;
            b10 = bArr[i11];
            b11 = bArr[i11 + 1];
        } else {
            int i12 = i10 + i;
            b10 = bArr[i12 + 1];
            b11 = bArr[i12];
        }
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public final char s(Charset charset, char[] cArr) {
        int t3;
        boolean z3;
        if (B() >= u(charset) && (t3 = t(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(r0)) {
                long j10 = r0;
                char c10 = (char) j10;
                if (c10 == j10) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b80.G(j10, "Out of range: %s", z3);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.f12581b = ct.a(t3 & 255) + this.f12581b;
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int t(Charset charset) {
        ByteOrder byteOrder;
        int i;
        int i10;
        int i11;
        b80.J(f12578f.contains(charset), "Unsupported charset: %s", charset);
        if (B() >= u(charset)) {
            int i12 = 1;
            if (charset.equals(StandardCharsets.US_ASCII)) {
                byte b10 = this.f12580a[this.f12581b];
                if ((b10 & 128) == 0) {
                    i = b10 & 255;
                    return (i << 8) | i12;
                }
                return 0;
            }
            if (charset.equals(StandardCharsets.UTF_8)) {
                byte b11 = this.f12580a[this.f12581b];
                if ((b11 & 128) == 0) {
                    i10 = 1;
                } else if ((b11 & 224) == 192 && B() >= 2 && w(this.f12580a[this.f12581b + 1])) {
                    i10 = 2;
                } else {
                    if ((this.f12580a[this.f12581b] & 240) == 224 && B() >= 3) {
                        byte[] bArr = this.f12580a;
                        int i13 = this.f12581b;
                        if (w(bArr[i13 + 1]) && w(bArr[i13 + 2])) {
                            i10 = 3;
                        }
                    }
                    if ((this.f12580a[this.f12581b] & 248) == 240 && B() >= 4) {
                        byte[] bArr2 = this.f12580a;
                        int i14 = this.f12581b;
                        if (w(bArr2[i14 + 1]) && w(bArr2[i14 + 2]) && w(bArr2[i14 + 3])) {
                            i10 = 4;
                        }
                    }
                    i10 = 0;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                byte[] bArr3 = this.f12580a;
                                int i15 = this.f12581b;
                                i11 = x(bArr3[i15], bArr3[i15 + 1], bArr3[i15 + 2], bArr3[i15 + 3]);
                            }
                            return 0;
                        }
                        byte[] bArr4 = this.f12580a;
                        int i16 = this.f12581b;
                        i11 = x(0, bArr4[i16] & 15, bArr4[i16 + 1], bArr4[i16 + 2]);
                    } else {
                        byte[] bArr5 = this.f12580a;
                        int i17 = this.f12581b;
                        i11 = x(0, 0, bArr5[i17], bArr5[i17 + 1]);
                    }
                } else {
                    i11 = this.f12580a[this.f12581b] & 255;
                }
                i12 = i10;
                i = i11;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
                char r8 = r(0, byteOrder);
                if (Character.isHighSurrogate(r8) && B() >= 4) {
                    i = Character.toCodePoint(r8, r(2, byteOrder));
                    i12 = 4;
                } else {
                    i = r8;
                    i12 = 2;
                }
            }
            return (i << 8) | i12;
        }
        int i18 = this.f12581b;
        int i19 = this.f12582c;
        q.x.l(g3.a.f(i18, i19, "position=", ", limit=", new StringBuilder(String.valueOf(i18).length() + 17 + String.valueOf(i19).length())));
        return 0;
    }

    public final void v(int i) {
        if (f12579g.get() && B() < i) {
            int B = B();
            q.x.l(g3.a.f(i, B, "bytesNeeded= ", ", bytesLeft=", new StringBuilder(String.valueOf(i).length() + 25 + String.valueOf(B).length())));
        }
    }

    public final void y(int i) {
        byte[] bArr = this.f12580a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        z(bArr, i);
    }

    public final void z(byte[] bArr, int i) {
        this.f12580a = bArr;
        this.f12582c = i;
        this.f12581b = 0;
    }

    public xk0() {
        this.f12580a = bq0.f4861b;
    }

    public xk0(byte[] bArr, int i) {
        this.f12580a = bArr;
        this.f12582c = i;
    }

    public xk0(byte[] bArr) {
        this.f12580a = bArr;
        this.f12582c = bArr.length;
    }
}
