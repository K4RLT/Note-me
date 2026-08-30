package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c30 implements t20 {

    /* renamed from: a, reason: collision with root package name */
    public final short[] f4979a;

    /* renamed from: b, reason: collision with root package name */
    public short[] f4980b;

    /* renamed from: c, reason: collision with root package name */
    public short[] f4981c;

    /* renamed from: d, reason: collision with root package name */
    public short[] f4982d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f4983f;

    /* renamed from: g, reason: collision with root package name */
    public int f4984g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f30 f4985h;

    public c30(f30 f30Var) {
        this.f4985h = f30Var;
        int i = f30Var.f5907h;
        this.f4979a = new short[i];
        int i10 = i * f30Var.f5902b;
        this.f4980b = new short[i10];
        this.f4981c = new short[i10];
        this.f4982d = new short[i10];
    }

    public final int a(short[] sArr, int i, int i10, int i11) {
        int i12 = 1;
        int i13 = 255;
        int i14 = 0;
        int i15 = 0;
        while (i10 <= i11) {
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = this.f4985h.f5902b * i;
                i16 += Math.abs(sArr[i18 + i17] - sArr[(i18 + i10) + i17]);
            }
            int i19 = i16 * i14;
            int i20 = i12 * i10;
            if (i19 < i20) {
                i12 = i16;
            }
            if (i19 < i20) {
                i14 = i10;
            }
            int i21 = i16 * i13;
            int i22 = i15 * i10;
            if (i21 > i22) {
                i15 = i16;
            }
            if (i21 > i22) {
                i13 = i10;
            }
            i10++;
        }
        this.e = i12 / i14;
        this.f4983f = i15 / i13;
        return i14;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void b(int i) {
        this.f4980b = p(this.f4980b, this.f4985h.f5908j, i);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final boolean c() {
        int i = this.e;
        if (i == 0 || this.f4985h.f5914p == 0 || this.f4983f > i * 3 || i + i <= this.f4984g * 3) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final int d(int i, int i10, int i11) {
        return a(this.f4980b, i, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void e() {
        this.f4984g = 0;
        this.e = 0;
        this.f4983f = 0;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void f(int i) {
        this.f4982d = p(this.f4982d, this.f4985h.f5910l, i);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void g() {
        this.f4984g = this.e;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void h(int i, int i10, int i11, int i12, int i13) {
        short[] sArr = this.f4981c;
        short[] sArr2 = this.f4980b;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i12 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i11 * i10) + i14;
            for (int i18 = 0; i18 < i; i18++) {
                sArr[i17] = (short) (((sArr2[i16] * i18) + ((i - i18) * sArr2[i15])) / i);
                i17 += i10;
                i15 += i10;
                i16 += i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void i(long j10, int i, long j11) {
        int i10 = 0;
        while (true) {
            f30 f30Var = this.f4985h;
            int i11 = f30Var.f5902b;
            if (i10 < i11) {
                short[] sArr = this.f4981c;
                int i12 = f30Var.f5909k;
                short[] sArr2 = this.f4982d;
                int i13 = (i * i11) + i10;
                short s10 = sArr2[i13];
                short s11 = sArr2[i13 + i11];
                long j12 = f30Var.f5912n * j10;
                long j13 = f30Var.f5911m * j11;
                long j14 = (r2 + 1) * j11;
                int i14 = i10;
                long j15 = j14 - j13;
                long j16 = j14 - j12;
                sArr[(i12 * i11) + i14] = (short) ((((j15 - j16) * s11) + (j16 * s10)) / j15);
                i10 = i14 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final /* synthetic */ Object j() {
        return this.f4981c;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void k(int i, int i10) {
        int i11;
        short[] sArr = this.f4980b;
        int i12 = 0;
        while (true) {
            f30 f30Var = this.f4985h;
            if (i12 < f30Var.f5907h / i10) {
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int i15 = f30Var.f5902b;
                    i11 = i15 * i10;
                    if (i13 < i11) {
                        i14 += sArr[(i11 * i12) + (i15 * i) + i13];
                        i13++;
                    }
                }
                this.f4979a[i12] = (short) (i14 / i11);
                i12++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void l(int i, ByteBuffer byteBuffer) {
        f30 f30Var = this.f4985h;
        byteBuffer.asShortBuffer().get(this.f4980b, f30Var.f5908j * f30Var.f5902b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void m(int i, int i10) {
        for (int i11 = 0; i11 < this.f4985h.f5902b * i10; i11++) {
            this.f4980b[i + i11] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final int n(int i, int i10) {
        return a(this.f4979a, 0, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void o(int i, ByteBuffer byteBuffer) {
        f30 f30Var = this.f4985h;
        byteBuffer.asShortBuffer().put(this.f4981c, 0, f30Var.f5902b * i);
        byteBuffer.position(((i + i) * f30Var.f5902b) + byteBuffer.position());
    }

    public final short[] p(short[] sArr, int i, int i10) {
        int length = sArr.length;
        int i11 = this.f4985h.f5902b;
        int i12 = length / i11;
        if (i + i10 <= i12) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final /* synthetic */ Object q() {
        return this.f4982d;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void s(int i) {
        this.f4981c = p(this.f4981c, this.f4985h.f5909k, i);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final /* synthetic */ Object v() {
        return this.f4980b;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final int zza() {
        return 2;
    }
}
