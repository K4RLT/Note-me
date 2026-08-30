package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class a6 implements y5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f4364a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4365b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4366c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4367d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4368f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f4369g;

    public a6(long j10, int i, long j11, int i10, long j12, long[] jArr) {
        this.f4364a = j10;
        this.f4365b = i;
        this.f4366c = j11;
        this.f4367d = i10;
        this.e = j12;
        this.f4369g = jArr;
        this.f4368f = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        double d2;
        double d10;
        boolean zzb = zzb();
        int i = this.f4365b;
        long j11 = this.f4364a;
        if (!zzb) {
            b3 b3Var = new b3(0L, j11 + i);
            return new z2(b3Var, b3Var);
        }
        String str = bq0.f4860a;
        long j12 = this.f4366c;
        long max = Math.max(0L, Math.min(j10, j12));
        double d11 = (max * 100.0d) / j12;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d2 = 256.0d;
        } else if (d11 >= 100.0d) {
            d2 = 256.0d;
            d12 = 256.0d;
        } else {
            int i10 = (int) d11;
            long[] jArr = this.f4369g;
            jArr.getClass();
            double d13 = jArr[i10];
            if (i10 == 99) {
                d2 = 256.0d;
                d10 = 256.0d;
            } else {
                d2 = 256.0d;
                d10 = jArr[i10 + 1];
            }
            d12 = ((d10 - d13) * (d11 - i10)) + d13;
        }
        long j13 = this.e;
        b3 b3Var2 = new b3(max, j11 + Math.max(i, Math.min(Math.round((d12 / d2) * j13), j13 - 1)));
        return new z2(b3Var2, b3Var2);
    }

    @Override // com.google.android.gms.internal.ads.y5
    public final int d() {
        return this.f4367d;
    }

    @Override // com.google.android.gms.internal.ads.y5
    public final long e() {
        return this.f4368f;
    }

    @Override // com.google.android.gms.internal.ads.y5
    public final long g(long j10) {
        long j11;
        double d2;
        if (zzb()) {
            long j12 = j10 - this.f4364a;
            if (j12 > this.f4365b) {
                long[] jArr = this.f4369g;
                jArr.getClass();
                double d10 = (j12 * 256.0d) / this.e;
                int s10 = bq0.s(jArr, (long) d10, true);
                long j13 = this.f4366c;
                long j14 = (s10 * j13) / 100;
                long j15 = jArr[s10];
                int i = s10 + 1;
                long j16 = (j13 * i) / 100;
                if (s10 == 99) {
                    j11 = 256;
                } else {
                    j11 = jArr[i];
                }
                if (j15 == j11) {
                    d2 = 0.0d;
                } else {
                    d2 = (d10 - j15) / (j11 - j15);
                }
                return Math.round(d2 * (j16 - j14)) + j14;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f4366c;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return this.f4369g != null;
    }
}
