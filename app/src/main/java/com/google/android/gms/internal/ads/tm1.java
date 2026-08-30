package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class tm1 extends um1 {

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f11392w;

    /* renamed from: x, reason: collision with root package name */
    public final int f11393x;

    /* renamed from: y, reason: collision with root package name */
    public int f11394y;

    /* renamed from: z, reason: collision with root package name */
    public final OutputStream f11395z;

    public tm1(OutputStream outputStream, int i) {
        this.f11395z = outputStream;
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.f11392w = new byte[max];
            this.f11393x = max;
            return;
        }
        q.x.n("bufferSize must be >= 0");
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void B1(int i, String str) {
        M1((i << 3) | 2);
        S1(str);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void C1(int i, om1 om1Var) {
        M1((i << 3) | 2);
        D1(om1Var);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void D1(om1 om1Var) {
        M1(om1Var.k());
        om1Var.r(this);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void F1(byte[] bArr, int i) {
        M1(i);
        X1(bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void H1(cm1 cm1Var) {
        M1(((dn1) cm1Var).d(null));
        ((dn1) cm1Var).u(this);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void I1(byte b10) {
        if (this.f11394y == this.f11393x) {
            Z1();
        }
        int i = this.f11394y;
        this.f11392w[i] = b10;
        this.f11394y = i + 1;
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void K1(int i) {
        if (i >= 0) {
            M1(i);
        } else {
            Q1(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void M1(int i) {
        Y1(5);
        a2(i);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void O1(int i) {
        Y1(4);
        V1(i);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void Q1(long j10) {
        Y1(10);
        U1(j10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void R1(long j10) {
        Y1(8);
        W1(j10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void S1(String str) {
        int length = str.length() * 3;
        int T = um1.T(length);
        int i = T + length;
        int i10 = this.f11393x;
        if (i > i10) {
            byte[] bArr = new byte[length];
            int b10 = cp1.b(str, bArr, 0, length);
            M1(b10);
            X1(bArr, 0, b10);
            return;
        }
        if (i > i10 - this.f11394y) {
            Z1();
        }
        int T2 = um1.T(str.length());
        int i11 = this.f11394y;
        byte[] bArr2 = this.f11392w;
        try {
            if (T2 == T) {
                int i12 = i11 + T2;
                this.f11394y = i12;
                int b11 = cp1.b(str, bArr2, i12, i10 - i12);
                this.f11394y = i11;
                a2((b11 - i11) - T2);
                this.f11394y = b11;
            } else {
                int i13 = cp1.f5140a;
                int d2 = rc1.d(str);
                a2(d2);
                this.f11394y = cp1.b(str, bArr2, this.f11394y, d2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new af.c(e);
        }
    }

    public final void U1(long j10) {
        int i = this.f11394y;
        int i10 = i + 1;
        long j11 = j10 & (-128);
        int i11 = (int) j10;
        byte[] bArr = this.f11392w;
        if (j11 == 0) {
            bArr[i] = (byte) i11;
            this.f11394y = i10;
            return;
        }
        int i12 = i + 2;
        bArr[i] = (byte) (i11 | 128);
        long j12 = j10 >>> 7;
        long j13 = j12 & (-128);
        int i13 = (int) j12;
        if (j13 == 0) {
            bArr[i10] = (byte) i13;
            this.f11394y = i12;
            return;
        }
        int i14 = i + 3;
        bArr[i10] = (byte) (i13 | 128);
        long j14 = j10 >>> 14;
        long j15 = j14 & (-128);
        int i15 = (int) j14;
        if (j15 == 0) {
            bArr[i12] = (byte) i15;
            this.f11394y = i14;
            return;
        }
        int i16 = i + 4;
        bArr[i12] = (byte) (i15 | 128);
        long j16 = j10 >>> 21;
        long j17 = j16 & (-128);
        int i17 = (int) j16;
        if (j17 == 0) {
            bArr[i14] = (byte) i17;
            this.f11394y = i16;
            return;
        }
        int i18 = i + 5;
        bArr[i14] = (byte) (i17 | 128);
        long j18 = j10 >>> 28;
        long j19 = j18 & (-128);
        int i19 = (int) j18;
        if (j19 == 0) {
            bArr[i16] = (byte) i19;
            this.f11394y = i18;
            return;
        }
        int i20 = i + 6;
        bArr[i16] = (byte) (i19 | 128);
        long j20 = j10 >>> 35;
        long j21 = j20 & (-128);
        int i21 = (int) j20;
        if (j21 == 0) {
            bArr[i18] = (byte) i21;
            this.f11394y = i20;
            return;
        }
        int i22 = i + 7;
        bArr[i18] = (byte) (i21 | 128);
        long j22 = j10 >>> 42;
        long j23 = j22 & (-128);
        int i23 = (int) j22;
        if (j23 == 0) {
            bArr[i20] = (byte) i23;
            this.f11394y = i22;
            return;
        }
        int i24 = i + 8;
        bArr[i20] = (byte) (i23 | 128);
        long j24 = j10 >>> 49;
        long j25 = j24 & (-128);
        int i25 = (int) j24;
        if (j25 == 0) {
            bArr[i22] = (byte) i25;
            this.f11394y = i24;
            return;
        }
        int i26 = i + 9;
        bArr[i22] = (byte) (i25 | 128);
        long j26 = j10 >>> 56;
        int i27 = (int) j26;
        if ((j26 & (-128)) == 0) {
            bArr[i24] = (byte) i27;
            this.f11394y = i26;
        } else {
            bArr[i24] = (byte) (i27 | 128);
            bArr[i26] = (byte) (j10 >>> 63);
            this.f11394y = i + 10;
        }
    }

    public final void V1(int i) {
        int i10 = this.f11394y;
        byte[] bArr = this.f11392w;
        bArr[i10] = (byte) i;
        bArr[i10 + 1] = (byte) (i >> 8);
        bArr[i10 + 2] = (byte) (i >> 16);
        bArr[i10 + 3] = (byte) (i >> 24);
        this.f11394y = i10 + 4;
    }

    public final void W1(long j10) {
        int i = this.f11394y;
        byte[] bArr = this.f11392w;
        bArr[i] = (byte) j10;
        bArr[i + 1] = (byte) (j10 >> 8);
        bArr[i + 2] = (byte) (j10 >> 16);
        bArr[i + 3] = (byte) (j10 >> 24);
        bArr[i + 4] = (byte) (j10 >> 32);
        bArr[i + 5] = (byte) (j10 >> 40);
        bArr[i + 6] = (byte) (j10 >> 48);
        bArr[i + 7] = (byte) (j10 >> 56);
        this.f11394y = i + 8;
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void X(byte[] bArr, int i, int i10) {
        X1(bArr, i, i10);
    }

    public final void X1(byte[] bArr, int i, int i10) {
        int i11 = this.f11394y;
        int i12 = this.f11393x;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f11392w;
        if (i13 >= i10) {
            System.arraycopy(bArr, i, bArr2, i11, i10);
            this.f11394y += i10;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i11, i13);
        int i14 = i + i13;
        this.f11394y = i12;
        Z1();
        int i15 = i10 - i13;
        if (i15 <= i12) {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f11394y = i15;
        } else {
            this.f11395z.write(bArr, i14, i15);
        }
    }

    public final void Y1(int i) {
        if (this.f11393x - this.f11394y < i) {
            Z1();
        }
    }

    public final void Z1() {
        this.f11395z.write(this.f11392w, 0, this.f11394y);
        this.f11394y = 0;
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void a0(int i, int i10) {
        M1((i << 3) | i10);
    }

    public final void a2(int i) {
        int i10 = this.f11394y;
        int i11 = i10 + 1;
        int i12 = i & (-128);
        byte[] bArr = this.f11392w;
        if (i12 == 0) {
            bArr[i10] = (byte) i;
            this.f11394y = i11;
            return;
        }
        int i13 = i10 + 2;
        bArr[i10] = (byte) (i | 128);
        int i14 = i >>> 7;
        if ((i14 & (-128)) == 0) {
            bArr[i11] = (byte) i14;
            this.f11394y = i13;
            return;
        }
        int i15 = i10 + 3;
        bArr[i11] = (byte) (i14 | 128);
        int i16 = i >>> 14;
        if ((i16 & (-128)) == 0) {
            bArr[i13] = (byte) i16;
            this.f11394y = i15;
            return;
        }
        int i17 = i10 + 4;
        bArr[i13] = (byte) (i16 | 128);
        int i18 = i >>> 21;
        if ((i18 & (-128)) == 0) {
            bArr[i15] = (byte) i18;
            this.f11394y = i17;
        } else {
            bArr[i15] = (byte) (i18 | 128);
            bArr[i17] = (byte) (i >>> 28);
            this.f11394y = i10 + 5;
        }
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void d0(int i, int i10) {
        Y1(20);
        a2(i << 3);
        if (i10 >= 0) {
            a2(i10);
        } else {
            U1(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void f0(int i, int i10) {
        Y1(20);
        a2(i << 3);
        a2(i10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final int q0() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void s1(int i, int i10) {
        Y1(14);
        a2((i << 3) | 5);
        V1(i10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void u1(int i, long j10) {
        Y1(20);
        a2(i << 3);
        U1(j10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void w1(int i, long j10) {
        Y1(18);
        a2((i << 3) | 1);
        W1(j10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void y1(int i, boolean z3) {
        Y1(11);
        a2(i << 3);
        int i10 = this.f11394y;
        this.f11392w[i10] = z3 ? (byte) 1 : (byte) 0;
        this.f11394y = i10 + 1;
    }
}
