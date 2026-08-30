package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class xz0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12669a;

    /* renamed from: b, reason: collision with root package name */
    public final tr1 f12670b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f12671c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f12672d;
    public final wr1 e;

    public /* synthetic */ xz0(int i, rr1 rr1Var, rr1 rr1Var2, tr1 tr1Var, tr1 tr1Var2) {
        this.f12669a = i;
        this.f12670b = tr1Var;
        this.f12671c = rr1Var;
        this.f12672d = tr1Var2;
        this.e = rr1Var2;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f12669a) {
            case 0:
                return new wz0((wd) this.f12670b.f11431a, (pz0) this.f12671c.zzb(), (Context) this.f12672d.zzb(), (h21) this.e.zzb(), 0);
            case 1:
                return new yz0((wd) this.f12670b.f11431a, (pz0) this.f12671c.zzb(), (rx0) this.f12672d.zzb(), (h21) this.e.zzb());
            default:
                return new wz0((wd) this.f12670b.f11431a, (pz0) this.f12671c.zzb(), (Context) this.f12672d.zzb(), (h21) this.e.zzb(), 1);
        }
    }
}
