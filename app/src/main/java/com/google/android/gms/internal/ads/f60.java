package com.google.android.gms.internal.ads;
import la.a;

import android.content.Context;

/* loaded from: classes.dex */
public final class f60 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5943a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f5944b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f5945c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f5946d;
    public final g50 e;

    /* renamed from: f, reason: collision with root package name */
    public final g50 f5947f;

    /* renamed from: g, reason: collision with root package name */
    public final wr1 f5948g;

    /* renamed from: h, reason: collision with root package name */
    public final sr1 f5949h;

    public f60(o10 o10Var, rr1 rr1Var, rr1 rr1Var2, g50 g50Var, g50 g50Var2, rr1 rr1Var3, sr1 sr1Var) {
        this.f5944b = o10Var;
        this.f5945c = rr1Var;
        this.f5946d = rr1Var2;
        this.e = g50Var;
        this.f5947f = g50Var2;
        this.f5948g = rr1Var3;
        this.f5949h = sr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f5943a) {
            case 0:
                return new e60((Context) this.f5944b.zzb(), this.f5947f.a(), (h00) this.f5949h.zzb(), this.e.b(), (a) this.f5945c.zzb(), (be0) this.f5946d.zzb(), (b60) this.f5948g.zzb());
            default:
                return new ud0(((o10) this.f5944b).a(), (gq0) this.f5945c.zzb(), (be0) this.f5946d.zzb(), this.e.b(), this.f5947f.a(), (rh0) this.f5948g.zzb(), (String) this.f5949h.zzb());
        }
    }

    public f60(rr1 rr1Var, g50 g50Var, sr1 sr1Var, g50 g50Var2, rr1 rr1Var2, rr1 rr1Var3, wr1 wr1Var) {
        this.f5944b = rr1Var;
        this.f5947f = g50Var;
        this.f5949h = sr1Var;
        this.e = g50Var2;
        this.f5945c = rr1Var2;
        this.f5946d = rr1Var3;
        this.f5948g = wr1Var;
    }
}
