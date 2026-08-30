package com.google.android.gms.internal.measurement;
import e6.e;
import g6.a;

import com.google.android.gms.internal.ads.wd0;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class t4 {
    public static final Logger e = Logger.getLogger(t4.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f13915f = e6.e;

    /* renamed from: a, reason: collision with root package name */
    public o5 f13916a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13918c;

    /* renamed from: d, reason: collision with root package name */
    public int f13919d;

    public t4(byte[] bArr, int i) {
        if (((bArr.length - i) | i) >= 0) {
            this.f13917b = bArr;
            this.f13919d = 0;
            this.f13918c = i;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
    }

    public static int g(int i, m4 m4Var, a6 a6Var) {
        return m4Var.a(a6Var) + (t(i << 3) << 1);
    }

    public static int h(String str) {
        int length;
        try {
            length = g6.a(str);
        } catch (h6 unused) {
            length = str.getBytes(d5.f13686a).length;
        }
        return t(length) + length;
    }

    public static int m(int i, s4 s4Var) {
        int t3 = t(i << 3);
        int k3 = s4Var.k();
        return wd0.t(k3, k3, t3);
    }

    public static int r(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int s(int i) {
        return t(i << 3);
    }

    public static int t(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void a(byte b10) {
        try {
            byte[] bArr = this.f13917b;
            int i = this.f13919d;
            this.f13919d = i + 1;
            bArr[i] = b10;
        } catch (IndexOutOfBoundsException e8) {
            throw new af.c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13919d), Integer.valueOf(this.f13918c), 1), e8);
        }
    }

    public final void b(int i) {
        try {
            byte[] bArr = this.f13917b;
            int i10 = this.f13919d;
            int i11 = i10 + 1;
            this.f13919d = i11;
            bArr[i10] = (byte) i;
            int i12 = i10 + 2;
            this.f13919d = i12;
            bArr[i11] = (byte) (i >> 8);
            int i13 = i10 + 3;
            this.f13919d = i13;
            bArr[i12] = (byte) (i >> 16);
            this.f13919d = i10 + 4;
            bArr[i13] = (byte) (i >>> 24);
        } catch (IndexOutOfBoundsException e8) {
            throw new af.c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13919d), Integer.valueOf(this.f13918c), 1), e8);
        }
    }

    public final void c(int i, int i10) {
        o(i, 5);
        b(i10);
    }

    public final void d(int i, long j10) {
        o(i, 1);
        e(j10);
    }

    public final void e(long j10) {
        try {
            byte[] bArr = this.f13917b;
            int i = this.f13919d;
            int i10 = i + 1;
            this.f13919d = i10;
            bArr[i] = (byte) j10;
            int i11 = i + 2;
            this.f13919d = i11;
            bArr[i10] = (byte) (j10 >> 8);
            int i12 = i + 3;
            this.f13919d = i12;
            bArr[i11] = (byte) (j10 >> 16);
            int i13 = i + 4;
            this.f13919d = i13;
            bArr[i12] = (byte) (j10 >> 24);
            int i14 = i + 5;
            this.f13919d = i14;
            bArr[i13] = (byte) (j10 >> 32);
            int i15 = i + 6;
            this.f13919d = i15;
            bArr[i14] = (byte) (j10 >> 40);
            int i16 = i + 7;
            this.f13919d = i16;
            bArr[i15] = (byte) (j10 >> 48);
            this.f13919d = i + 8;
            bArr[i16] = (byte) (j10 >> 56);
        } catch (IndexOutOfBoundsException e8) {
            throw new af.c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13919d), Integer.valueOf(this.f13918c), 1), e8);
        }
    }

    public final int f() {
        return this.f13918c - this.f13919d;
    }

    public final void i(int i) {
        if (i >= 0) {
            n(i);
        } else {
            l(i);
        }
    }

    public final void j(int i, int i10) {
        o(i, 0);
        i(i10);
    }

    public final void k(int i, long j10) {
        o(i, 0);
        l(j10);
    }

    public final void l(long j10) {
        boolean z3 = f13915f;
        byte[] bArr = this.f13917b;
        if (!z3 || f() < 10) {
            while (true) {
                long j11 = j10 & (-128);
                int i = this.f13919d;
                if (j11 == 0) {
                    this.f13919d = i + 1;
                    bArr[i] = (byte) j10;
                    return;
                } else {
                    try {
                        this.f13919d = i + 1;
                        bArr[i] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                    } catch (IndexOutOfBoundsException e8) {
                        throw new af.c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13919d), Integer.valueOf(this.f13918c), 1), e8);
                    }
                }
                throw new af.c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13919d), Integer.valueOf(this.f13918c), 1), e8);
            }
        }
        while (true) {
            long j12 = j10 & (-128);
            int i10 = this.f13919d;
            if (j12 == 0) {
                this.f13919d = i10 + 1;
                e6.f13735c.d(bArr, e6.f13737f + i10, (byte) j10);
                return;
            }
            this.f13919d = i10 + 1;
            e6.f13735c.d(bArr, e6.f13737f + i10, (byte) (((int) j10) | 128));
            j10 >>>= 7;
        }
    }

    public final void n(int i) {
        while (true) {
            int i10 = i & (-128);
            int i11 = this.f13919d;
            byte[] bArr = this.f13917b;
            if (i10 == 0) {
                this.f13919d = i11 + 1;
                bArr[i11] = (byte) i;
                return;
            } else {
                try {
                    this.f13919d = i11 + 1;
                    bArr[i11] = (byte) (i | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new af.c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13919d), Integer.valueOf(this.f13918c), 1), e8);
                }
            }
            throw new af.c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13919d), Integer.valueOf(this.f13918c), 1), e8);
        }
    }

    public final void o(int i, int i10) {
        n((i << 3) | i10);
    }

    public final void p(byte[] bArr, int i, int i10) {
        try {
            System.arraycopy(bArr, i, this.f13917b, this.f13919d, i10);
            this.f13919d += i10;
        } catch (IndexOutOfBoundsException e8) {
            throw new af.c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13919d), Integer.valueOf(this.f13918c), Integer.valueOf(i10)), e8);
        }
    }

    public final void q(int i, int i10) {
        o(i, 0);
        n(i10);
    }
}
