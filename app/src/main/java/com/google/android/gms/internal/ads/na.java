package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class na implements a3 {

    /* renamed from: a, reason: collision with root package name */
    public final ma f8610a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8611b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8612c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8613d;
    public final long e;

    public na(ma maVar, int i, long j10, long j11) {
        this.f8610a = maVar;
        this.f8611b = i;
        this.f8612c = j10;
        long j12 = (j11 - j10) / maVar.f8287c;
        this.f8613d = j12;
        this.e = b(j12);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        long j11 = this.f8611b;
        ma maVar = this.f8610a;
        long j12 = (maVar.f8286b * j10) / (j11 * 1000000);
        String str = bq0.f4860a;
        long j13 = this.f8613d - 1;
        long max = Math.max(0L, Math.min(j12, j13));
        long j14 = maVar.f8287c;
        long b10 = b(max);
        long j15 = this.f8612c;
        b3 b3Var = new b3(b10, (max * j14) + j15);
        if (b10 < j10 && max != j13) {
            long j16 = max + 1;
            return new z2(b3Var, new b3(b(j16), (j14 * j16) + j15));
        }
        return new z2(b3Var, b3Var);
    }

    public final long b(long j10) {
        return bq0.w(j10 * this.f8611b, 1000000L, this.f8610a.f8286b, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
