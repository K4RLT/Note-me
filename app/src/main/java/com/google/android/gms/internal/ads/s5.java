package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
public final class s5 implements y5 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f10521a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f10522b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10523c;

    public s5(long j10, long[] jArr, long[] jArr2) {
        this.f10521a = jArr;
        this.f10522b = jArr2;
        this.f10523c = j10 == -9223372036854775807L ? bq0.u(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair b(long j10, long[] jArr, long[] jArr2) {
        double d2;
        int s10 = bq0.s(jArr, j10, true);
        long j11 = jArr[s10];
        long j12 = jArr2[s10];
        int i = s10 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i];
        long j14 = jArr2[i];
        if (j13 == j11) {
            d2 = 0.0d;
        } else {
            d2 = (j10 - j11) / (j13 - j11);
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) (d2 * (j14 - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        String str = bq0.f4860a;
        Pair b10 = b(bq0.t(Math.max(0L, Math.min(j10, this.f10523c))), this.f10522b, this.f10521a);
        b3 b3Var = new b3(bq0.u(((Long) b10.first).longValue()), ((Long) b10.second).longValue());
        return new z2(b3Var, b3Var);
    }

    @Override // com.google.android.gms.internal.ads.y5
    public final int d() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.y5
    public final long e() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.y5
    public final long g(long j10) {
        return bq0.u(((Long) b(j10, this.f10521a, this.f10522b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f10523c;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
