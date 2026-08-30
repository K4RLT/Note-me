package com.google.android.gms.internal.mlkit_vision_digital_ink;
import af.c;
import g5.q;
import q.x;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class xm extends ym {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f15240d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public int f15241f;

    /* renamed from: g, reason: collision with root package name */
    public final OutputStream f15242g;

    public xm(OutputStream outputStream, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.f15240d = new byte[max];
            this.e = max;
            if (outputStream != null) {
                this.f15242g = outputStream;
                return;
            } else {
                q.h("out");
                throw null;
            }
        }
        x.n("bufferSize must be >= 0");
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void A(long j10) {
        C(10);
        G(j10);
    }

    public final void B() {
        this.f15242g.write(this.f15240d, 0, this.f15241f);
        this.f15241f = 0;
    }

    public final void C(int i) {
        if (this.e - this.f15241f < i) {
            B();
        }
    }

    public final void D(int i) {
        int i10 = this.f15241f;
        byte[] bArr = this.f15240d;
        bArr[i10] = (byte) i;
        bArr[i10 + 1] = (byte) (i >> 8);
        bArr[i10 + 2] = (byte) (i >> 16);
        bArr[i10 + 3] = (byte) (i >> 24);
        this.f15241f = i10 + 4;
    }

    public final void E(long j10) {
        int i = this.f15241f;
        byte[] bArr = this.f15240d;
        bArr[i] = (byte) j10;
        bArr[i + 1] = (byte) (j10 >> 8);
        bArr[i + 2] = (byte) (j10 >> 16);
        bArr[i + 3] = (byte) (j10 >> 24);
        bArr[i + 4] = (byte) (j10 >> 32);
        bArr[i + 5] = (byte) (j10 >> 40);
        bArr[i + 6] = (byte) (j10 >> 48);
        bArr[i + 7] = (byte) (j10 >> 56);
        this.f15241f = i + 8;
    }

    public final void F(int i) {
        boolean z3 = ym.f15285c;
        byte[] bArr = this.f15240d;
        if (z3) {
            while (true) {
                int i10 = i & (-128);
                int i11 = this.f15241f;
                if (i10 == 0) {
                    this.f15241f = i11 + 1;
                    dp.j(bArr, i11, (byte) i);
                    return;
                } else {
                    this.f15241f = i11 + 1;
                    dp.j(bArr, i11, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i12 = i & (-128);
                int i13 = this.f15241f;
                if (i12 == 0) {
                    this.f15241f = i13 + 1;
                    bArr[i13] = (byte) i;
                    return;
                } else {
                    this.f15241f = i13 + 1;
                    bArr[i13] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void G(long j10) {
        boolean z3 = ym.f15285c;
        byte[] bArr = this.f15240d;
        if (z3) {
            while (true) {
                long j11 = j10 & (-128);
                int i = (int) j10;
                int i10 = this.f15241f;
                if (j11 == 0) {
                    this.f15241f = i10 + 1;
                    dp.j(bArr, i10, (byte) i);
                    return;
                } else {
                    this.f15241f = i10 + 1;
                    dp.j(bArr, i10, (byte) (i | 128));
                    j10 >>>= 7;
                }
            }
        } else {
            while (true) {
                long j12 = j10 & (-128);
                int i11 = (int) j10;
                int i12 = this.f15241f;
                if (j12 == 0) {
                    this.f15241f = i12 + 1;
                    bArr[i12] = (byte) i11;
                    return;
                } else {
                    this.f15241f = i12 + 1;
                    bArr[i12] = (byte) (i11 | 128);
                    j10 >>>= 7;
                }
            }
        }
    }

    public final void H(byte[] bArr, int i) {
        int i10 = this.f15241f;
        int i11 = this.e;
        int i12 = i11 - i10;
        byte[] bArr2 = this.f15240d;
        if (i12 >= i) {
            System.arraycopy(bArr, 0, bArr2, i10, i);
            this.f15241f += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i10, i12);
        this.f15241f = i11;
        B();
        int i13 = i - i12;
        if (i13 <= i11) {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f15241f = i13;
        } else {
            this.f15242g.write(bArr, i12, i13);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void f(byte b10) {
        if (this.f15241f == this.e) {
            B();
        }
        int i = this.f15241f;
        this.f15240d[i] = b10;
        this.f15241f = i + 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void g(int i, boolean z3) {
        C(11);
        F(i << 3);
        int i10 = this.f15241f;
        this.f15240d[i10] = z3 ? (byte) 1 : (byte) 0;
        this.f15241f = i10 + 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void h(byte[] bArr, int i) {
        y(i);
        H(bArr, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void i(byte[] bArr, int i) {
        H(bArr, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void j(int i, tm tmVar) {
        y((i << 3) | 2);
        k(tmVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void k(tm tmVar) {
        y(tmVar.d());
        sm smVar = (sm) tmVar;
        i(smVar.f14978w, smVar.d());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void l(int i, int i10) {
        C(14);
        F((i << 3) | 5);
        D(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void m(int i) {
        C(4);
        D(i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void n(int i, long j10) {
        C(18);
        F((i << 3) | 1);
        E(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void o(long j10) {
        C(8);
        E(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void p(int i, int i10) {
        C(20);
        F(i << 3);
        if (i10 >= 0) {
            F(i10);
        } else {
            G(i10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void q(int i) {
        if (i >= 0) {
            y(i);
        } else {
            A(i);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void r(km kmVar) {
        nn nnVar = (nn) kmVar;
        y(nnVar.e());
        nnVar.p(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void s(int i, km kmVar) {
        y(11);
        x(2, i);
        y(26);
        r(kmVar);
        y(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void t(int i, tm tmVar) {
        y(11);
        x(2, i);
        j(3, tmVar);
        y(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void u(int i, String str) {
        y((i << 3) | 2);
        v(str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void v(String str) {
        try {
            int length = str.length() * 3;
            int c10 = ym.c(length);
            int i = c10 + length;
            int i10 = this.e;
            if (i > i10) {
                byte[] bArr = new byte[length];
                int b10 = fp.b(str, bArr, 0, length);
                y(b10);
                H(bArr, b10);
                return;
            }
            if (i > i10 - this.f15241f) {
                B();
            }
            int c11 = ym.c(str.length());
            int i11 = this.f15241f;
            byte[] bArr2 = this.f15240d;
            try {
                if (c11 == c10) {
                    int i12 = i11 + c11;
                    this.f15241f = i12;
                    int b11 = fp.b(str, bArr2, i12, i10 - i12);
                    this.f15241f = i11;
                    F((b11 - i11) - c11);
                    this.f15241f = b11;
                } else {
                    int c12 = fp.c(str);
                    F(c12);
                    this.f15241f = fp.b(str, bArr2, this.f15241f, c12);
                }
            } catch (ep e) {
                this.f15241f = i11;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e8) {
                throw new c(e8);
            }
        } catch (ep e10) {
            e(str, e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void w(int i, int i10) {
        y((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void x(int i, int i10) {
        C(20);
        F(i << 3);
        F(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void y(int i) {
        C(5);
        F(i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void z(int i, long j10) {
        C(20);
        F(i << 3);
        G(j10);
    }
}
