package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class z50 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13081a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f13082b;

    /* renamed from: c, reason: collision with root package name */
    public final o60 f13083c;

    /* renamed from: d, reason: collision with root package name */
    public final rr1 f13084d;

    public z50(rr1 rr1Var, o60 o60Var, rr1 rr1Var2) {
        this.f13082b = rr1Var;
        this.f13083c = o60Var;
        this.f13084d = rr1Var2;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f13081a) {
            case 0:
                return new y50(0, (Context) this.f13084d.zzb(), ((u10) this.f13082b).a(), this.f13083c.a());
            default:
                return new gf0((nf0) this.f13082b.zzb(), this.f13083c.a(), (String) this.f13084d.zzb());
        }
    }

    public z50(rr1 rr1Var, wr1 wr1Var, o60 o60Var) {
        this.f13084d = rr1Var;
        this.f13082b = wr1Var;
        this.f13083c = o60Var;
    }
}
