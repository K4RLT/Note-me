package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c2 implements a3 {

    /* renamed from: a, reason: collision with root package name */
    public final e2 f4954a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4955b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4956c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4957d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4958f;

    public c2(e2 e2Var, long j10, long j11, long j12, long j13, long j14) {
        this.f4954a = e2Var;
        this.f4955b = j10;
        this.f4956c = j11;
        this.f4957d = j12;
        this.e = j13;
        this.f4958f = j14;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        b3 b3Var = new b3(j10, d2.a(this.f4954a.d(j10), 0L, this.f4956c, this.f4957d, this.e, this.f4958f));
        return new z2(b3Var, b3Var);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f4955b;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
