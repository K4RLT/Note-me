package com.google.android.gms.internal.ads;
import i0.m;

/* loaded from: classes.dex */
public final class wy1 implements sy1 {

    /* renamed from: a, reason: collision with root package name */
    public final sy1 f12370a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12371b;

    public wy1(sy1 sy1Var, long j10) {
        this.f12370a = sy1Var;
        this.f12371b = j10;
    }

    @Override // com.google.android.gms.internal.ads.sy1
    public final int a(long j10) {
        return this.f12370a.a(j10 - this.f12371b);
    }

    @Override // com.google.android.gms.internal.ads.sy1
    public final int b(i0.m mVar, es1 es1Var, int i) {
        int b10 = this.f12370a.b(mVar, es1Var, i);
        if (b10 == -4) {
            es1Var.e += this.f12371b;
            return -4;
        }
        return b10;
    }

    @Override // com.google.android.gms.internal.ads.sy1
    public final boolean zza() {
        return this.f12370a.zza();
    }

    @Override // com.google.android.gms.internal.ads.sy1
    public final void zzb() {
        this.f12370a.zzb();
    }
}
