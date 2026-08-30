package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class f01 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5876a;

    /* renamed from: b, reason: collision with root package name */
    public final tr1 f5877b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1 f5878c;

    /* renamed from: d, reason: collision with root package name */
    public final tr1 f5879d;
    public final rr1 e;

    public f01(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2, rr1 rr1Var2) {
        this.f5876a = 1;
        this.f5877b = tr1Var;
        this.f5878c = rr1Var;
        this.f5879d = tr1Var2;
        this.e = rr1Var2;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f5876a) {
            case 0:
                return new e01((Context) this.f5877b.f11431a, (h21) this.f5878c.zzb(), (hz0) this.e.zzb(), (rx0) this.f5879d.f11431a);
            case 1:
                return new a21((Context) this.f5877b.f11431a, (h21) this.f5878c.zzb(), (rx0) this.f5879d.f11431a, (wx) this.e.zzb());
            default:
                return new a21((Context) this.f5877b.f11431a, (h21) this.f5878c.zzb(), (wx) this.e.zzb(), (rx0) this.f5879d.f11431a);
        }
    }

    public /* synthetic */ f01(int i, rr1 rr1Var, rr1 rr1Var2, tr1 tr1Var, tr1 tr1Var2) {
        this.f5876a = i;
        this.f5877b = tr1Var;
        this.f5878c = rr1Var;
        this.e = rr1Var2;
        this.f5879d = tr1Var2;
    }
}
