package com.google.android.gms.internal.consent_sdk;
import g5.q;
import q.h;
import q.x;
import x.n;
import x6.e;
import z6.a;
import z6.b;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class i5 extends f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f13440g = Logger.getLogger(i5.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f13441h = x6.e;

    /* renamed from: b, reason: collision with root package name */
    public a6 f13442b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f13443c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13444d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final OutputStream f13445f;

    public i5(OutputStream outputStream, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.f13443c = new byte[max];
            this.f13444d = max;
            if (outputStream != null) {
                this.f13445f = outputStream;
                return;
            } else {
                g5.q.h("out");
                throw null;
            }
        }
        q.x.n("bufferSize must be >= 0");
        throw null;
    }

    public static int g(String str) {
        int length;
        try {
            length = z6.b(str);
        } catch (y6 unused) {
            length = str.getBytes(u5.f13575a).length;
        }
        return h(length) + length;
    }

    public static int h(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int i(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void A(int i, long j10) {
        k(20);
        n(i << 3);
        o(j10);
    }

    public final void B(long j10) {
        k(10);
        o(j10);
    }

    public final void C(byte[] bArr, int i) {
        int i10 = this.e;
        int i11 = this.f13444d;
        int i12 = i11 - i10;
        byte[] bArr2 = this.f13443c;
        if (i12 >= i) {
            System.arraycopy(bArr, 0, bArr2, i10, i);
            this.e += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i10, i12);
        this.e = i11;
        j();
        int i13 = i - i12;
        if (i13 <= i11) {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.e = i13;
        } else {
            this.f13445f.write(bArr, i12, i13);
        }
    }

    public final void j() {
        this.f13445f.write(this.f13443c, 0, this.e);
        this.e = 0;
    }

    public final void k(int i) {
        if (this.f13444d - this.e < i) {
            j();
        }
    }

    public final void l(int i) {
        int i10 = this.e;
        byte[] bArr = this.f13443c;
        bArr[i10] = (byte) i;
        bArr[i10 + 1] = (byte) (i >> 8);
        bArr[i10 + 2] = (byte) (i >> 16);
        bArr[i10 + 3] = (byte) (i >> 24);
        this.e = i10 + 4;
    }

    public final void m(long j10) {
        int i = this.e;
        byte[] bArr = this.f13443c;
        bArr[i] = (byte) j10;
        bArr[i + 1] = (byte) (j10 >> 8);
        bArr[i + 2] = (byte) (j10 >> 16);
        bArr[i + 3] = (byte) (j10 >> 24);
        bArr[i + 4] = (byte) (j10 >> 32);
        bArr[i + 5] = (byte) (j10 >> 40);
        bArr[i + 6] = (byte) (j10 >> 48);
        bArr[i + 7] = (byte) (j10 >> 56);
        this.e = i + 8;
    }

    public final void n(int i) {
        boolean z3 = f13441h;
        byte[] bArr = this.f13443c;
        if (z3) {
            while (true) {
                int i10 = i & (-128);
                int i11 = this.e;
                if (i10 == 0) {
                    this.e = i11 + 1;
                    x6.f13603c.d(bArr, x6.f13605f + i11, (byte) i);
                    return;
                }
                this.e = i11 + 1;
                x6.f13603c.d(bArr, x6.f13605f + i11, (byte) (i | 128));
                i >>>= 7;
            }
        } else {
            while (true) {
                int i12 = i & (-128);
                int i13 = this.e;
                if (i12 == 0) {
                    this.e = i13 + 1;
                    bArr[i13] = (byte) i;
                    return;
                } else {
                    this.e = i13 + 1;
                    bArr[i13] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void o(long j10) {
        boolean z3 = f13441h;
        byte[] bArr = this.f13443c;
        if (z3) {
            while (true) {
                long j11 = j10 & (-128);
                int i = (int) j10;
                int i10 = this.e;
                if (j11 == 0) {
                    this.e = i10 + 1;
                    x6.f13603c.d(bArr, x6.f13605f + i10, (byte) i);
                    return;
                }
                this.e = i10 + 1;
                x6.f13603c.d(bArr, x6.f13605f + i10, (byte) (i | 128));
                j10 >>>= 7;
            }
        } else {
            while (true) {
                long j12 = j10 & (-128);
                int i11 = (int) j10;
                int i12 = this.e;
                if (j12 == 0) {
                    this.e = i12 + 1;
                    bArr[i12] = (byte) i11;
                    return;
                } else {
                    this.e = i12 + 1;
                    bArr[i12] = (byte) (i11 | 128);
                    j10 >>>= 7;
                }
            }
        }
    }

    public final void p(h5 h5Var) {
        z(h5Var.d());
        C(h5Var.f13432v, h5Var.d());
    }

    public final void q(int i, int i10) {
        k(14);
        n((i << 3) | 5);
        l(i10);
    }

    public final void r(int i) {
        k(4);
        l(i);
    }

    public final void s(int i, long j10) {
        k(18);
        n((i << 3) | 1);
        m(j10);
    }

    public final void t(long j10) {
        k(8);
        m(j10);
    }

    public final void u(int i, int i10) {
        k(20);
        n(i << 3);
        if (i10 >= 0) {
            n(i10);
        } else {
            o(i10);
        }
    }

    public final void v(int i) {
        if (i >= 0) {
            z(i);
        } else {
            B(i);
        }
    }

    public final void w(String str) {
        try {
            int length = str.length() * 3;
            int h3 = h(length);
            int i = h3 + length;
            int i10 = this.f13444d;
            if (i > i10) {
                byte[] bArr = new byte[length];
                int a10 = z6.a(str, bArr, 0, length);
                z(a10);
                C(bArr, a10);
                return;
            }
            if (i > i10 - this.e) {
                j();
            }
            int h10 = h(str.length());
            int i11 = this.e;
            byte[] bArr2 = this.f13443c;
            try {
                if (h10 == h3) {
                    int i12 = i11 + h10;
                    this.e = i12;
                    int a11 = z6.a(str, bArr2, i12, i10 - i12);
                    this.e = i11;
                    n((a11 - i11) - h10);
                    this.e = a11;
                } else {
                    int b10 = z6.b(str);
                    n(b10);
                    this.e = z6.a(str, bArr2, this.e, b10);
                }
            } catch (y6 e) {
                this.e = i11;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e8) {
                throw new af.c(e8);
            }
        } catch (y6 e10) {
            f13440g.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(u5.f13575a);
            try {
                int length2 = bytes.length;
                z(length2);
                C(bytes, length2);
            } catch (IndexOutOfBoundsException e11) {
                throw new af.c(e11);
            }
        }
    }

    public final void x(int i, int i10) {
        z((i << 3) | i10);
    }

    public final void y(int i, int i10) {
        k(20);
        n(i << 3);
        n(i10);
    }

    public final void z(int i) {
        k(5);
        n(i);
    }
}
