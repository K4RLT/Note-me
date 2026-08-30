package com.google.android.gms.internal.mlkit_vision_digital_ink;
import af.c;
import g3.a;
import g5.q;

import java.util.Locale;

/* loaded from: classes.dex */
public final class wm extends ym {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f15190d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public int f15191f;

    public wm(byte[] bArr, int i, int i10) {
        if (bArr != null) {
            int i11 = i + i10;
            int length = bArr.length;
            if ((i | i10 | (length - i11)) >= 0) {
                this.f15190d = bArr;
                this.f15191f = i;
                this.e = i11;
                return;
            } else {
                Locale locale = Locale.US;
                StringBuilder n10 = a.n("Array range is invalid. Buffer.length=", length, ", offset=", ", length=", i);
                n10.append(i10);
                throw new IllegalArgumentException(n10.toString());
            }
        }
        q.h("buffer");
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void A(long j10) {
        int i;
        int i10 = this.f15191f;
        boolean z3 = ym.f15285c;
        byte[] bArr = this.f15190d;
        int i11 = this.e;
        if (z3 && i11 - i10 >= 10) {
            long j11 = j10;
            while ((j11 & (-128)) != 0) {
                dp.j(bArr, i10, (byte) (((int) j11) | 128));
                j11 >>>= 7;
                i10++;
            }
            i = i10 + 1;
            dp.j(bArr, i10, (byte) j11);
        } else {
            long j12 = j10;
            while ((j12 & (-128)) != 0) {
                i = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j12) | 128);
                    j12 >>>= 7;
                    i10 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new c(i, i11, 1, e, 7);
                }
            }
            i = i10 + 1;
            bArr[i10] = (byte) j12;
        }
        this.f15191f = i;
    }

    public final int B() {
        return this.e - this.f15191f;
    }

    public final void C(byte[] bArr, int i) {
        try {
            System.arraycopy(bArr, 0, this.f15190d, this.f15191f, i);
            this.f15191f += i;
        } catch (IndexOutOfBoundsException e) {
            throw new c(this.f15191f, this.e, i, e, 7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void f(byte b10) {
        int i = this.f15191f;
        try {
            int i10 = i + 1;
            try {
                this.f15190d[i] = b10;
                this.f15191f = i10;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i10;
                throw new c(i, this.e, 1, e, 7);
            }
        } catch (IndexOutOfBoundsException e8) {
            e = e8;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void g(int i, boolean z3) {
        y(i << 3);
        f(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void h(byte[] bArr, int i) {
        y(i);
        C(bArr, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void i(byte[] bArr, int i) {
        C(bArr, i);
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
        y((i << 3) | 5);
        m(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void m(int i) {
        int i10 = this.f15191f;
        try {
            byte[] bArr = this.f15190d;
            bArr[i10] = (byte) i;
            bArr[i10 + 1] = (byte) (i >> 8);
            bArr[i10 + 2] = (byte) (i >> 16);
            bArr[i10 + 3] = (byte) (i >> 24);
            this.f15191f = i10 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new c(i10, this.e, 4, e, 7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void n(int i, long j10) {
        y((i << 3) | 1);
        o(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void o(long j10) {
        int i = this.f15191f;
        try {
            byte[] bArr = this.f15190d;
            bArr[i] = (byte) j10;
            bArr[i + 1] = (byte) (j10 >> 8);
            bArr[i + 2] = (byte) (j10 >> 16);
            bArr[i + 3] = (byte) (j10 >> 24);
            bArr[i + 4] = (byte) (j10 >> 32);
            bArr[i + 5] = (byte) (j10 >> 40);
            bArr[i + 6] = (byte) (j10 >> 48);
            bArr[i + 7] = (byte) (j10 >> 56);
            this.f15191f = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new c(i, this.e, 8, e, 7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void p(int i, int i10) {
        y(i << 3);
        q(i10);
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
        int i = this.f15191f;
        try {
            int c10 = ym.c(str.length() * 3);
            int c11 = ym.c(str.length());
            int i10 = this.e;
            byte[] bArr = this.f15190d;
            if (c11 == c10) {
                int i11 = i + c11;
                this.f15191f = i11;
                int b10 = fp.b(str, bArr, i11, i10 - i11);
                this.f15191f = i;
                y((b10 - i) - c11);
                this.f15191f = b10;
                return;
            }
            y(fp.c(str));
            int i12 = this.f15191f;
            this.f15191f = fp.b(str, bArr, i12, i10 - i12);
        } catch (ep e) {
            this.f15191f = i;
            e(str, e);
        } catch (IndexOutOfBoundsException e8) {
            throw new c(e8);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void w(int i, int i10) {
        y((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void x(int i, int i10) {
        y(i << 3);
        y(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void y(int i) {
        int i10;
        int i11 = this.f15191f;
        while (true) {
            int i12 = i & (-128);
            byte[] bArr = this.f15190d;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i;
                this.f15191f = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i | 128);
                    i >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e) {
                    throw new c(i10, this.e, 1, e, 7);
                }
            }
            throw new c(i10, this.e, 1, e, 7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ym
    public final void z(int i, long j10) {
        y(i << 3);
        A(j10);
    }
}
