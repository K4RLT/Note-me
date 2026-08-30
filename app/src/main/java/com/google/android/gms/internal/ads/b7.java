package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class b7 implements a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f4728a;

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        c7 c7Var = this.f4728a;
        BigInteger valueOf = BigInteger.valueOf((c7Var.f5021x.i * j10) / 1000000);
        long j11 = c7Var.f5020w;
        long j12 = c7Var.f5019v;
        long longValue = valueOf.multiply(BigInteger.valueOf(j11 - j12)).divide(BigInteger.valueOf(c7Var.f5023z)).longValue() + j12;
        String str = bq0.f4860a;
        b3 b3Var = new b3(j10, Math.max(j12, Math.min(longValue - 30000, j11 - 1)));
        return new z2(b3Var, b3Var);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        c7 c7Var = this.f4728a;
        j7 j7Var = c7Var.f5021x;
        return (c7Var.f5023z * 1000000) / j7Var.i;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
