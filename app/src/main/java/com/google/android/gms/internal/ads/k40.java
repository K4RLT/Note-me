package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class k40 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7645a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f7646b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f7647c;

    /* renamed from: d, reason: collision with root package name */
    public final g50 f7648d;
    public final wr1 e;

    public k40(tw twVar, rr1 rr1Var, u10 u10Var, g50 g50Var, o60 o60Var) {
        this.f7646b = rr1Var;
        this.f7647c = u10Var;
        this.f7648d = g50Var;
        this.e = o60Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f7645a) {
            case 0:
                return new c90(new i40((Context) this.f7646b.zzb(), ((u10) this.f7647c).a(), this.f7648d.a(), ((o60) this.e).a(), 0), xx.f12657h);
            default:
                return new c90(new i40((Context) this.f7646b.zzb(), ((u10) this.f7647c).a(), this.f7648d.a(), ((o60) this.e).a(), 1), xx.f12657h);
        }
    }

    public k40(rr1 rr1Var, u10 u10Var, g50 g50Var, o60 o60Var) {
        this.f7646b = rr1Var;
        this.f7647c = u10Var;
        this.f7648d = g50Var;
        this.e = o60Var;
    }
}
