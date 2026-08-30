package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i2 implements o2 {
    public int A;

    /* renamed from: v, reason: collision with root package name */
    public final fs1 f6963v;

    /* renamed from: w, reason: collision with root package name */
    public final long f6964w;

    /* renamed from: x, reason: collision with root package name */
    public long f6965x;

    /* renamed from: z, reason: collision with root package name */
    public int f6967z;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f6966y = new byte[65536];

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f6962u = new byte[4096];

    static {
        t5.a("media3.extractor");
    }

    public i2(fs1 fs1Var, long j10, long j11) {
        this.f6963v = fs1Var;
        this.f6965x = j10;
        this.f6964w = j11;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean C(byte[] bArr, int i, int i10, boolean z3) {
        int min;
        int i11 = this.A;
        if (i11 == 0) {
            min = 0;
        } else {
            min = Math.min(i11, i10);
            System.arraycopy(this.f6966y, 0, bArr, i, min);
            i(min);
        }
        int i12 = min;
        while (i12 < i10 && i12 != -1) {
            i12 = j(bArr, i, i10, i12, z3);
        }
        if (i12 != -1) {
            this.f6965x += i12;
        }
        if (i12 == -1) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final int D(byte[] bArr, int i, int i10) {
        i2 i2Var;
        int min;
        g(i10);
        int i11 = this.A;
        int i12 = this.f6967z;
        int i13 = i11 - i12;
        if (i13 == 0) {
            i2Var = this;
            min = i2Var.j(this.f6966y, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            i2Var.A += min;
        } else {
            i2Var = this;
            min = Math.min(i10, i13);
        }
        System.arraycopy(i2Var.f6966y, i2Var.f6967z, bArr, i, min);
        i2Var.f6967z += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean E(byte[] bArr, int i, int i10, boolean z3) {
        if (!d(i10, z3)) {
            return false;
        }
        System.arraycopy(this.f6966y, this.f6967z - i10, bArr, i, i10);
        return true;
    }

    public final boolean d(int i, boolean z3) {
        g(i);
        int i10 = this.A - this.f6967z;
        while (i10 < i) {
            int i11 = i;
            boolean z9 = z3;
            i10 = j(this.f6966y, this.f6967z, i11, i10, z9);
            if (i10 == -1) {
                return false;
            }
            this.A = this.f6967z + i10;
            i = i11;
            z3 = z9;
        }
        this.f6967z += i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int e(byte[] bArr, int i, int i10) {
        i2 i2Var;
        int i11 = this.A;
        int i12 = 0;
        if (i11 != 0) {
            int min = Math.min(i11, i10);
            System.arraycopy(this.f6966y, 0, bArr, i, min);
            i(min);
            i12 = min;
        }
        if (i12 == 0) {
            i2Var = this;
            i12 = i2Var.j(bArr, i, i10, 0, true);
        } else {
            i2Var = this;
        }
        if (i12 != -1) {
            i2Var.f6965x += i12;
        }
        return i12;
    }

    public final void g(int i) {
        int i10 = this.f6967z + i;
        int length = this.f6966y.length;
        if (i10 > length) {
            String str = bq0.f4860a;
            this.f6966y = Arrays.copyOf(this.f6966y, Math.max(65536 + i10, Math.min(length + length, i10 + 524288)));
        }
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void h() {
        this.f6967z = 0;
    }

    public final void i(int i) {
        byte[] bArr;
        int i10 = this.A - i;
        this.A = i10;
        this.f6967z = 0;
        byte[] bArr2 = this.f6966y;
        if (i10 < bArr2.length - 524288) {
            bArr = new byte[65536 + i10];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i10);
        this.f6966y = bArr;
    }

    public final int j(byte[] bArr, int i, int i10, int i11, boolean z3) {
        if (!Thread.interrupted()) {
            int e = this.f6963v.e(bArr, i + i11, i10 - i11);
            if (e == -1) {
                if (i11 == 0 && z3) {
                    return -1;
                }
                throw new EOFException();
            }
            return i11 + e;
        }
        throw new InterruptedIOException();
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final int k() {
        i2 i2Var;
        int min = Math.min(this.A, 1);
        i(min);
        if (min == 0) {
            i2Var = this;
            min = i2Var.j(this.f6962u, 0, Math.min(1, 4096), 0, true);
        } else {
            i2Var = this;
        }
        if (min != -1) {
            i2Var.f6965x += min;
        }
        return min;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long m() {
        return this.f6965x + this.f6967z;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long n() {
        return this.f6965x;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long p() {
        return this.f6964w;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void s(int i) {
        d(i, false);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void u(int i) {
        x(i, false);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void v(byte[] bArr, int i, int i10) {
        C(bArr, i, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean x(int i, boolean z3) {
        int min = Math.min(this.A, i);
        i(min);
        int i10 = min;
        while (i10 < i && i10 != -1) {
            i10 = j(this.f6962u, -i10, Math.min(i, i10 + 4096), i10, z3);
        }
        if (i10 != -1) {
            this.f6965x += i10;
        }
        if (i10 != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void y(byte[] bArr, int i, int i10) {
        E(bArr, i, i10, false);
    }
}
