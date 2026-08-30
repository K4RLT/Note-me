package com.google.android.gms.internal.ads;
import af.c;
import i1.c;
import q.x;
import w7.i1;

import java.util.Locale;

/* loaded from: classes.dex */
public final class sm1 extends um1 {

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f11066w;

    /* renamed from: x, reason: collision with root package name */
    public final int f11067x;

    /* renamed from: y, reason: collision with root package name */
    public int f11068y;

    public sm1(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.f11066w = bArr;
            this.f11068y = 0;
            this.f11067x = i;
        } else {
            Locale locale = Locale.US;
            q.x.n(w7.i1.c("Array range is invalid. Buffer.length=", length, i, ", offset=0, length="));
            throw null;
        }
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
        U1(bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void H1(cm1 cm1Var) {
        M1(((dn1) cm1Var).d(null));
        ((dn1) cm1Var).u(this);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void I1(byte b10) {
        int i = this.f11068y;
        try {
            int i10 = i + 1;
            try {
                this.f11066w[i] = b10;
                this.f11068y = i10;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i10;
                throw new af.c(i, this.f11067x, 1, e, 2);
            }
        } catch (IndexOutOfBoundsException e8) {
            e = e8;
        }
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void K1(int i) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i >= 0) {
            M1(i);
            return;
        }
        int i10 = this.f11068y;
        try {
            byte[] bArr = this.f11066w;
            long j10 = i;
            int i11 = i10 + 1;
            try {
                bArr[i10] = (byte) (((int) j10) | 128);
                int i12 = i10 + 2;
                try {
                    bArr[i11] = (byte) (((int) (j10 >>> 7)) | 128);
                    int i13 = i10 + 3;
                    bArr[i12] = (byte) (((int) (j10 >>> 14)) | 128);
                    i12 = i10 + 4;
                    bArr[i13] = (byte) (((int) (j10 >>> 21)) | 128);
                    int i14 = i10 + 5;
                    bArr[i12] = (byte) (((int) (j10 >>> 28)) | 128);
                    int i15 = i10 + 6;
                    try {
                        bArr[i14] = -1;
                        int i16 = i10 + 7;
                        bArr[i15] = -1;
                        i15 = i10 + 8;
                        bArr[i16] = -1;
                        i11 = i10 + 9;
                        bArr[i15] = -1;
                        i10 += 10;
                        bArr[i11] = 1;
                        this.f11068y = i10;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i10 = i15;
                        throw new af.c(i10, this.f11067x, 10, indexOutOfBoundsException, 2);
                    }
                } catch (IndexOutOfBoundsException e8) {
                    indexOutOfBoundsException = e8;
                    i10 = i12;
                }
            } catch (IndexOutOfBoundsException e10) {
                i10 = i11;
                indexOutOfBoundsException = e10;
            }
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
        }
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void M1(int i) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10 = this.f11068y;
        int i11 = i & (-128);
        byte[] bArr = this.f11066w;
        try {
            if (i11 == 0) {
                int i12 = i10 + 1;
                bArr[i10] = (byte) i;
                this.f11068y = i12;
                return;
            }
            int i13 = i10 + 1;
            bArr[i10] = (byte) (i | 128);
            int i14 = i >>> 7;
            try {
                if ((i14 & (-128)) == 0) {
                    int i15 = i10 + 2;
                    bArr[i13] = (byte) i14;
                    this.f11068y = i15;
                    return;
                }
                int i16 = i10 + 2;
                try {
                    bArr[i13] = (byte) (i14 | 128);
                    int i17 = i >>> 14;
                    if ((i17 & (-128)) == 0) {
                        int i18 = i10 + 3;
                        bArr[i16] = (byte) i17;
                        this.f11068y = i18;
                        return;
                    }
                    int i19 = i10 + 3;
                    try {
                        bArr[i16] = (byte) (i17 | 128);
                        int i20 = i >>> 21;
                        if ((i20 & (-128)) == 0) {
                            int i21 = i10 + 4;
                            bArr[i19] = (byte) i20;
                            this.f11068y = i21;
                        } else {
                            i16 = i10 + 4;
                            bArr[i19] = (byte) (i20 | 128);
                            int i22 = i10 + 5;
                            bArr[i16] = (byte) (i >>> 28);
                            this.f11068y = i22;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i11 = i19;
                        throw new af.c(i11, this.f11067x, 1, indexOutOfBoundsException, 2);
                    }
                } catch (IndexOutOfBoundsException e8) {
                    indexOutOfBoundsException = e8;
                    i11 = i16;
                }
            } catch (IndexOutOfBoundsException e10) {
                i11 = i;
                indexOutOfBoundsException = e10;
            }
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
        }
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void O1(int i) {
        int i10 = this.f11068y;
        try {
            byte[] bArr = this.f11066w;
            bArr[i10] = (byte) i;
            bArr[i10 + 1] = (byte) (i >> 8);
            bArr[i10 + 2] = (byte) (i >> 16);
            bArr[i10 + 3] = (byte) (i >> 24);
            this.f11068y = i10 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new af.c(i10, this.f11067x, 4, e, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void Q1(long j10) {
        long j11 = j10 & (-128);
        int i = this.f11068y;
        byte[] bArr = this.f11066w;
        try {
            if (j11 == 0) {
                bArr[i] = (byte) j10;
                this.f11068y = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j10) | 128);
            int i10 = i + 1;
            long j12 = j10 >>> 7;
            long j13 = j12 & (-128);
            int i11 = (int) j12;
            if (j13 == 0) {
                bArr[i10] = (byte) i11;
                this.f11068y = i + 2;
                return;
            }
            bArr[i10] = (byte) (i11 | 128);
            int i12 = i + 2;
            long j14 = j10 >>> 14;
            long j15 = j14 & (-128);
            int i13 = (int) j14;
            if (j15 == 0) {
                bArr[i12] = (byte) i13;
                this.f11068y = i + 3;
                return;
            }
            bArr[i12] = (byte) (i13 | 128);
            int i14 = i + 3;
            long j16 = j10 >>> 21;
            long j17 = j16 & (-128);
            int i15 = (int) j16;
            if (j17 == 0) {
                bArr[i14] = (byte) i15;
                this.f11068y = i + 4;
                return;
            }
            bArr[i14] = (byte) (i15 | 128);
            int i16 = i + 4;
            long j18 = j10 >>> 28;
            long j19 = j18 & (-128);
            int i17 = (int) j18;
            if (j19 == 0) {
                bArr[i16] = (byte) i17;
                this.f11068y = i + 5;
                return;
            }
            bArr[i16] = (byte) (i17 | 128);
            int i18 = i + 5;
            long j20 = j10 >>> 35;
            long j21 = j20 & (-128);
            int i19 = (int) j20;
            if (j21 == 0) {
                bArr[i18] = (byte) i19;
                this.f11068y = i + 6;
                return;
            }
            bArr[i18] = (byte) (i19 | 128);
            int i20 = i + 6;
            long j22 = j10 >>> 42;
            long j23 = j22 & (-128);
            int i21 = (int) j22;
            if (j23 == 0) {
                bArr[i20] = (byte) i21;
                this.f11068y = i + 7;
                return;
            }
            bArr[i20] = (byte) (i21 | 128);
            int i22 = i + 7;
            long j24 = j10 >>> 49;
            long j25 = j24 & (-128);
            int i23 = (int) j24;
            if (j25 == 0) {
                bArr[i22] = (byte) i23;
                this.f11068y = i + 8;
                return;
            }
            bArr[i22] = (byte) (i23 | 128);
            int i24 = i + 8;
            long j26 = j10 >>> 56;
            int i25 = (int) j26;
            if (((-128) & j26) == 0) {
                bArr[i24] = (byte) i25;
                this.f11068y = i + 9;
            } else {
                bArr[i24] = (byte) (i25 | 128);
                bArr[i + 9] = (byte) (j10 >>> 63);
                this.f11068y = i + 10;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new af.c(i, this.f11067x, 1, e, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void R1(long j10) {
        int i = this.f11068y;
        try {
            byte[] bArr = this.f11066w;
            bArr[i] = (byte) j10;
            bArr[i + 1] = (byte) (j10 >> 8);
            bArr[i + 2] = (byte) (j10 >> 16);
            bArr[i + 3] = (byte) (j10 >> 24);
            bArr[i + 4] = (byte) (j10 >> 32);
            bArr[i + 5] = (byte) (j10 >> 40);
            bArr[i + 6] = (byte) (j10 >> 48);
            bArr[i + 7] = (byte) (j10 >> 56);
            this.f11068y = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new af.c(i, this.f11067x, 8, e, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void S1(String str) {
        int i = this.f11068y;
        try {
            int T = um1.T(str.length() * 3);
            int T2 = um1.T(str.length());
            byte[] bArr = this.f11066w;
            if (T2 == T) {
                int i10 = i + T2;
                this.f11068y = i10;
                int b10 = cp1.b(str, bArr, i10, bArr.length - i10);
                this.f11068y = i;
                M1((b10 - i) - T2);
                this.f11068y = b10;
                return;
            }
            int i11 = cp1.f5140a;
            M1(rc1.d(str));
            int i12 = this.f11068y;
            this.f11068y = cp1.b(str, bArr, i12, bArr.length - i12);
        } catch (IndexOutOfBoundsException e) {
            throw new af.c(e);
        }
    }

    public final void U1(byte[] bArr, int i, int i10) {
        try {
            System.arraycopy(bArr, i, this.f11066w, this.f11068y, i10);
            this.f11068y += i10;
        } catch (IndexOutOfBoundsException e) {
            throw new af.c(this.f11068y, this.f11067x, i10, e, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void X(byte[] bArr, int i, int i10) {
        U1(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void a0(int i, int i10) {
        M1((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void d0(int i, int i10) {
        M1(i << 3);
        K1(i10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void f0(int i, int i10) {
        M1(i << 3);
        M1(i10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final int q0() {
        return this.f11067x - this.f11068y;
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void s1(int i, int i10) {
        M1((i << 3) | 5);
        O1(i10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void u1(int i, long j10) {
        M1(i << 3);
        Q1(j10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void w1(int i, long j10) {
        M1((i << 3) | 1);
        R1(j10);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void y1(int i, boolean z3) {
        M1(i << 3);
        I1(z3 ? (byte) 1 : (byte) 0);
    }
}
