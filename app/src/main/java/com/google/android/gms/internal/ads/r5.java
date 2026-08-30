package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class r5 implements y5, a3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f10086a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10087b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10088c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10089d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10090f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10091g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10092h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10093j;

    /* renamed from: k, reason: collision with root package name */
    public final long f10094k;

    public r5(long j10, long j11, int i, int i10, boolean z3) {
        int i11;
        long max;
        this.f10086a = j10;
        this.f10087b = j11;
        if (i10 == -1) {
            i11 = 1;
        } else {
            i11 = i10;
        }
        this.f10088c = i11;
        this.e = i;
        this.f10091g = z3;
        if (j10 == -1) {
            this.f10089d = -1L;
            max = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.f10089d = j12;
            max = (Math.max(0L, j12) * 8000000) / i;
        }
        this.f10090f = max;
        this.f10092h = j11;
        this.i = i;
        this.f10093j = i10;
        this.f10094k = j10 == -1 ? -1L : j10;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        long j11 = this.f10089d;
        long j12 = this.f10087b;
        if (j11 != -1) {
            int i = this.e;
            long j13 = this.f10088c;
            long j14 = (((i * j10) / 8000000) / j13) * j13;
            if (j11 != -1) {
                j14 = Math.min(j14, j11 - j13);
            }
            long max = Math.max(j14, 0L) + j12;
            long max2 = (Math.max(0L, max - j12) * 8000000) / i;
            b3 b3Var = new b3(max2, max);
            if (j11 != -1 && max2 < j10) {
                long j15 = max + j13;
                if (j15 < this.f10086a) {
                    return new z2(b3Var, new b3((Math.max(0L, j15 - j12) * 8000000) / i, j15));
                }
            }
            return new z2(b3Var, b3Var);
        }
        b3 b3Var2 = new b3(0L, j12);
        return new z2(b3Var2, b3Var2);
    }

    @Override // com.google.android.gms.internal.ads.y5
    public final int d() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.y5
    public final long e() {
        return this.f10094k;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean f() {
        return this.f10091g;
    }

    @Override // com.google.android.gms.internal.ads.y5
    public final long g(long j10) {
        return (Math.max(0L, j10 - this.f10087b) * 8000000) / this.e;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f10090f;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        if (this.f10089d == -1) {
            return false;
        }
        return true;
    }
}
