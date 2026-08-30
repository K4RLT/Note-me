package com.google.android.gms.internal.play_billing;
import i1.c;
import q.x;
import x2.e;

import java.util.Locale;

/* loaded from: classes.dex */
public final class i1 {
    public static final boolean e = e;

    /* renamed from: a, reason: collision with root package name */
    public d2 f15445a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15446b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15447c;

    /* renamed from: d, reason: collision with root package name */
    public int f15448d;

    public i1(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.f15446b = bArr;
            this.f15448d = 0;
            this.f15447c = i;
        } else {
            Locale locale = Locale.US;
            x.n(w7.c("Array range is invalid. Buffer.length=", length, i, ", offset=0, length="));
            throw null;
        }
    }

    public static int o(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int p(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void a(byte b10) {
        int i = this.f15448d;
        try {
            int i10 = i + 1;
            try {
                this.f15446b[i] = b10;
                this.f15448d = i10;
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
                i = i10;
                throw new af.c(i, this.f15447c, 1, e, 8);
            }
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
        }
    }

    public final void b(byte[] bArr, int i, int i10) {
        try {
            System.arraycopy(bArr, i, this.f15446b, this.f15448d, i10);
            this.f15448d += i10;
        } catch (IndexOutOfBoundsException e8) {
            throw new af.c(this.f15448d, this.f15447c, i10, e8, 8);
        }
    }

    public final void c(int i, g1 g1Var) {
        l((i << 3) | 2);
        l(g1Var.g());
        g1Var.n(this);
    }

    public final void d(int i, int i10) {
        l((i << 3) | 5);
        e(i10);
    }

    public final void e(int i) {
        int i10 = this.f15448d;
        try {
            byte[] bArr = this.f15446b;
            bArr[i10] = (byte) i;
            bArr[i10 + 1] = (byte) (i >> 8);
            bArr[i10 + 2] = (byte) (i >> 16);
            bArr[i10 + 3] = (byte) (i >> 24);
            this.f15448d = i10 + 4;
        } catch (IndexOutOfBoundsException e8) {
            throw new af.c(i10, this.f15447c, 4, e8, 8);
        }
    }

    public final void f(int i, long j10) {
        l((i << 3) | 1);
        g(j10);
    }

    public final void g(long j10) {
        int i = this.f15448d;
        try {
            byte[] bArr = this.f15446b;
            bArr[i] = (byte) j10;
            bArr[i + 1] = (byte) (j10 >> 8);
            bArr[i + 2] = (byte) (j10 >> 16);
            bArr[i + 3] = (byte) (j10 >> 24);
            bArr[i + 4] = (byte) (j10 >> 32);
            bArr[i + 5] = (byte) (j10 >> 40);
            bArr[i + 6] = (byte) (j10 >> 48);
            bArr[i + 7] = (byte) (j10 >> 56);
            this.f15448d = i + 8;
        } catch (IndexOutOfBoundsException e8) {
            throw new af.c(i, this.f15447c, 8, e8, 8);
        }
    }

    public final void h(int i, int i10) {
        l(i << 3);
        i(i10);
    }

    public final void i(int i) {
        if (i >= 0) {
            l(i);
        } else {
            n(i);
        }
    }

    public final void j(int i, int i10) {
        l((i << 3) | i10);
    }

    public final void k(int i, int i10) {
        l(i << 3);
        l(i10);
    }

    public final void l(int i) {
        int i10;
        int i11 = this.f15448d;
        while (true) {
            int i12 = i & (-128);
            byte[] bArr = this.f15446b;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i;
                this.f15448d = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i | 128);
                    i >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e8) {
                    throw new af.c(i10, this.f15447c, 1, e8, 8);
                }
            }
            throw new af.c(i10, this.f15447c, 1, e8, 8);
        }
    }

    public final void m(int i, long j10) {
        l(i << 3);
        n(j10);
    }

    public final void n(long j10) {
        int i;
        int i10 = this.f15448d;
        boolean z3 = e;
        byte[] bArr = this.f15446b;
        int i11 = this.f15447c;
        if (z3 && i11 - i10 >= 10) {
            long j11 = j10;
            while ((j11 & (-128)) != 0) {
                x2.f15547c.d(bArr, x2.f15549f + i10, (byte) (((int) j11) | 128));
                j11 >>>= 7;
                i10++;
            }
            i = i10 + 1;
            x2.f15547c.d(bArr, x2.f15549f + i10, (byte) j11);
        } else {
            long j12 = j10;
            while ((j12 & (-128)) != 0) {
                i = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j12) | 128);
                    j12 >>>= 7;
                    i10 = i;
                } catch (IndexOutOfBoundsException e8) {
                    throw new af.c(i, i11, 1, e8, 8);
                }
            }
            i = i10 + 1;
            bArr[i10] = (byte) j12;
        }
        this.f15448d = i;
    }
}
