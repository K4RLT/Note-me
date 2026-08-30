package com.google.android.gms.internal.ads;
import la.a;

import android.content.Context;

/* loaded from: classes.dex */
public final class ee0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5665a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f5666b;

    /* renamed from: c, reason: collision with root package name */
    public final xr1 f5667c;

    /* renamed from: d, reason: collision with root package name */
    public final rr1 f5668d;

    public ee0(rr1 rr1Var, xr1 xr1Var, rr1 rr1Var2) {
        this.f5668d = rr1Var;
        this.f5667c = xr1Var;
        this.f5666b = rr1Var2;
    }

    public tw a() {
        Context a10 = ((o10) this.f5666b).a();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new tw(a10, wxVar, this.f5667c.zzb(), (ur0) this.f5668d.zzb());
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f5665a) {
            case 0:
                return new de0((zd0) this.f5668d.zzb(), this.f5667c.zzb(), (a) this.f5666b.zzb());
            default:
                return a();
        }
    }

    public ee0(wr1 wr1Var, xr1 xr1Var, rr1 rr1Var) {
        this.f5666b = wr1Var;
        this.f5667c = xr1Var;
        this.f5668d = rr1Var;
    }
}
