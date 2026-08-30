package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n20 implements t20 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f8519a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f8520b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f8521c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f8522d;
    public double e;

    /* renamed from: f, reason: collision with root package name */
    public double f8523f;

    /* renamed from: g, reason: collision with root package name */
    public double f8524g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f30 f8525h;

    public n20(f30 f30Var) {
        this.f8525h = f30Var;
        int i = f30Var.f5907h;
        this.f8519a = new float[i];
        int i10 = i * f30Var.f5902b;
        this.f8520b = new float[i10];
        this.f8521c = new float[i10];
        this.f8522d = new float[i10];
    }

    public final int a(float[] fArr, int i, int i10, int i11) {
        int i12 = 255;
        int i13 = 0;
        double d2 = 0.0d;
        double d10 = 1.0d;
        int i14 = i10;
        while (true) {
            double d11 = i12;
            double d12 = i13;
            if (i14 <= i11) {
                int i15 = 0;
                double d13 = 0.0d;
                while (i15 < i14) {
                    int i16 = this.f8525h.f5902b * i;
                    d13 += Math.abs(fArr[i16 + i15] - fArr[(i16 + i14) + i15]);
                    i15++;
                    i12 = i12;
                }
                int i17 = i12;
                double d14 = d12 * d13;
                double d15 = i14;
                double d16 = d10 * d15;
                if (d14 < d16) {
                    d10 = d13;
                }
                if (d14 < d16) {
                    i13 = i14;
                }
                double d17 = d11 * d13;
                double d18 = d15 * d2;
                if (d17 > d18) {
                    d2 = d13;
                }
                if (d17 > d18) {
                    i12 = i14;
                } else {
                    i12 = i17;
                }
                i14++;
            } else {
                this.e = d10 / d12;
                this.f8523f = d2 / d11;
                return i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void b(int i) {
        this.f8520b = p(this.f8525h.f5908j, i, this.f8520b);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final boolean c() {
        double d2 = this.e;
        if (d2 == 0.0d || this.f8525h.f5914p == 0 || this.f8523f > d2 * 3.0d || d2 + d2 <= this.f8524g * 3.0d) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final int d(int i, int i10, int i11) {
        return a(this.f8520b, i, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void e() {
        this.f8524g = 0.0d;
        this.e = 0.0d;
        this.f8523f = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void f(int i) {
        this.f8522d = p(this.f8525h.f5910l, i, this.f8522d);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void g() {
        this.f8524g = this.e;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void h(int i, int i10, int i11, int i12, int i13) {
        float[] fArr = this.f8521c;
        float[] fArr2 = this.f8520b;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i12 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i11 * i10) + i14;
            for (int i18 = 0; i18 < i; i18++) {
                fArr[i17] = ((fArr2[i16] * i18) + (fArr2[i15] * (i - i18))) / i;
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
            f30 f30Var = this.f8525h;
            int i11 = f30Var.f5902b;
            if (i10 < i11) {
                float[] fArr = this.f8521c;
                int i12 = f30Var.f5909k;
                float[] fArr2 = this.f8522d;
                int i13 = (i * i11) + i10;
                float f10 = fArr2[i13];
                float f11 = fArr2[i13 + i11];
                long j12 = f30Var.f5912n * j10;
                long j13 = (r1 + 1) * j11;
                long j14 = j13 - j12;
                long j15 = j13 - (f30Var.f5911m * j11);
                fArr[(i12 * i11) + i10] = ((((float) j14) * f10) + (((float) (j15 - j14)) * f11)) / ((float) j15);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final /* synthetic */ Object j() {
        return this.f8521c;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void k(int i, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            f30 f30Var = this.f8525h;
            if (i12 < f30Var.f5907h / i10) {
                double d2 = 0.0d;
                int i13 = 0;
                while (true) {
                    i11 = f30Var.f5902b * i10;
                    if (i13 < i11) {
                        d2 += this.f8520b[(i11 * i12) + (r6 * i) + i13];
                        i13++;
                    }
                }
                this.f8519a[i12] = (float) (d2 / i11);
                i12++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void l(int i, ByteBuffer byteBuffer) {
        f30 f30Var = this.f8525h;
        byteBuffer.asFloatBuffer().get(this.f8520b, f30Var.f5908j * f30Var.f5902b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void m(int i, int i10) {
        for (int i11 = 0; i11 < this.f8525h.f5902b * i10; i11++) {
            this.f8520b[i + i11] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final int n(int i, int i10) {
        return a(this.f8519a, 0, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void o(int i, ByteBuffer byteBuffer) {
        f30 f30Var = this.f8525h;
        byteBuffer.asFloatBuffer().put(this.f8521c, 0, f30Var.f5902b * i);
        byteBuffer.position((i * 4 * f30Var.f5902b) + byteBuffer.position());
    }

    public final float[] p(int i, int i10, float[] fArr) {
        int length = fArr.length;
        int i11 = this.f8525h.f5902b;
        int i12 = length / i11;
        if (i + i10 <= i12) {
            return fArr;
        }
        return Arrays.copyOf(fArr, (((i12 * 3) / 2) + i10) * i11);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final /* synthetic */ Object q() {
        return this.f8522d;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final void s(int i) {
        this.f8521c = p(this.f8525h.f5909k, i, this.f8521c);
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final /* synthetic */ Object v() {
        return this.f8520b;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final int zza() {
        return 4;
    }
}
