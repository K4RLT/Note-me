package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tk0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11365a;

    /* renamed from: b, reason: collision with root package name */
    public int f11366b;

    /* renamed from: c, reason: collision with root package name */
    public int f11367c;

    /* renamed from: d, reason: collision with root package name */
    public int f11368d;

    public tk0(byte[] bArr, int i) {
        this.f11365a = bArr;
        this.f11368d = i;
    }

    public final void a(xk0 xk0Var) {
        byte[] bArr = xk0Var.f12580a;
        int i = xk0Var.f12582c;
        this.f11365a = bArr;
        this.f11366b = 0;
        this.f11367c = 0;
        this.f11368d = i;
        d(xk0Var.f12581b * 8);
    }

    public final int b() {
        return ((this.f11368d - this.f11366b) * 8) - this.f11367c;
    }

    public final int c() {
        boolean z3;
        if (this.f11367c == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        return this.f11366b;
    }

    public final void d(int i) {
        int i10 = i / 8;
        this.f11366b = i10;
        this.f11367c = i - (i10 * 8);
        m();
    }

    public final void e() {
        int i = this.f11367c + 1;
        this.f11367c = i;
        if (i == 8) {
            this.f11367c = 0;
            this.f11366b++;
        }
        m();
    }

    public final void f(int i) {
        int i10 = i / 8;
        int i11 = this.f11366b + i10;
        this.f11366b = i11;
        int i12 = (i - (i10 * 8)) + this.f11367c;
        this.f11367c = i12;
        if (i12 > 7) {
            this.f11366b = i11 + 1;
            this.f11367c = i12 - 8;
        }
        m();
    }

    public final boolean g() {
        int i = this.f11365a[this.f11366b] & (128 >> this.f11367c);
        e();
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final int h(int i) {
        int i10;
        if (i == 0) {
            return 0;
        }
        this.f11367c += i;
        int i11 = 0;
        while (true) {
            i10 = this.f11367c;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f11367c = i12;
            byte[] bArr = this.f11365a;
            int i13 = this.f11366b;
            this.f11366b = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.f11365a;
        int i14 = this.f11366b;
        int i15 = i11 | ((bArr2[i14] & 255) >> (8 - i10));
        int i16 = 32 - i;
        if (i10 == 8) {
            this.f11367c = 0;
            this.f11366b = i14 + 1;
        }
        int i17 = ((-1) >>> i16) & i15;
        m();
        return i17;
    }

    public final long i(int i) {
        if (i <= 32) {
            int h3 = h(i);
            String str = bq0.f4860a;
            return 4294967295L & h3;
        }
        int h10 = h(i - 32);
        int h11 = h(32);
        String str2 = bq0.f4860a;
        return (4294967295L & h11) | ((h10 & 4294967295L) << 32);
    }

    public final void j(byte[] bArr, int i) {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = i >> 3;
            if (i11 >= i10) {
                break;
            }
            byte[] bArr2 = this.f11365a;
            int i12 = this.f11366b;
            int i13 = i12 + 1;
            this.f11366b = i13;
            byte b10 = bArr2[i12];
            int i14 = this.f11367c;
            byte b11 = (byte) (b10 << i14);
            bArr[i11] = b11;
            bArr[i11] = (byte) (((bArr2[i13] & 255) >> (8 - i14)) | b11);
            i11++;
        }
        int i15 = i & 7;
        if (i15 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b12;
        int i16 = this.f11367c;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f11365a;
            int i17 = this.f11366b;
            this.f11366b = i17 + 1;
            b12 = (byte) (b12 | ((bArr3[i17] & 255) << i16));
            bArr[i10] = b12;
            i16 -= 8;
        }
        int i18 = i16 + i15;
        this.f11367c = i18;
        byte[] bArr4 = this.f11365a;
        int i19 = this.f11366b;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | b12);
        if (i18 == 8) {
            this.f11367c = 0;
            this.f11366b = i19 + 1;
        }
        m();
    }

    public final void k() {
        if (this.f11367c == 0) {
            return;
        }
        this.f11367c = 0;
        this.f11366b++;
        m();
    }

    public final void l(int i) {
        boolean z3;
        if (this.f11367c == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        this.f11366b += i;
        m();
    }

    public final void m() {
        int i;
        int i10 = this.f11366b;
        boolean z3 = false;
        if (i10 >= 0 && (i10 < (i = this.f11368d) || (i10 == i && this.f11367c == 0))) {
            z3 = true;
        }
        b80.K(z3);
    }

    public tk0() {
        this.f11365a = bq0.f4861b;
    }
}
