package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class z5 implements y5 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f13077a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f13078b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13079c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13080d;
    public final int e;

    public z5(long[] jArr, long[] jArr2, long j10, long j11, int i) {
        this.f13077a = jArr;
        this.f13078b = jArr2;
        this.f13079c = j10;
        this.f13080d = j11;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        long[] jArr = this.f13077a;
        int s10 = bq0.s(jArr, j10, true);
        long j11 = jArr[s10];
        long[] jArr2 = this.f13078b;
        b3 b3Var = new b3(j11, jArr2[s10]);
        if (j11 < j10 && s10 != jArr.length - 1) {
            int i = s10 + 1;
            return new z2(b3Var, new b3(jArr[i], jArr2[i]));
        }
        return new z2(b3Var, b3Var);
    }

    @Override // com.google.android.gms.internal.ads.y5
    public final int d() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.y5
    public final long e() {
        return this.f13080d;
    }

    @Override // com.google.android.gms.internal.ads.y5
    public final long g(long j10) {
        return this.f13077a[bq0.s(this.f13078b, j10, true)];
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f13079c;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
