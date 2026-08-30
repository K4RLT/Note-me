package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class s50 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10524a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final o10 f10525b;

    /* renamed from: c, reason: collision with root package name */
    public final u10 f10526c;

    /* renamed from: d, reason: collision with root package name */
    public final rr1 f10527d;

    public s50(o10 o10Var, u10 u10Var, rr1 rr1Var) {
        this.f10525b = o10Var;
        this.f10526c = u10Var;
        this.f10527d = rr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f10524a) {
            case 0:
                Context a10 = this.f10525b.a();
                vr0 vr0Var = (vr0) this.f10527d.zzb();
                l9.a a11 = this.f10526c.a();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new r50(a10, vr0Var, a11, wxVar);
            default:
                jr i = new tw(7).i(this.f10525b.a(), this.f10526c.a(), (vr0) this.f10527d.zzb());
                lo1.b(i);
                return i;
        }
    }

    public s50(o10 o10Var, rr1 rr1Var, u10 u10Var) {
        this.f10525b = o10Var;
        this.f10527d = rr1Var;
        this.f10526c = u10Var;
    }
}
