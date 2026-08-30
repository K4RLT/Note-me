package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class w10 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final o10 f12092a;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f12093b;

    public w10(o10 o10Var, rr1 rr1Var) {
        this.f12092a = o10Var;
        this.f12093b = rr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a8 zzb() {
        Context a10 = this.f12092a.a();
        vr0 vr0Var = (vr0) this.f12093b.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        f9.k kVar = f9.k.C;
        jr b10 = kVar.f16826r.b(a10, l9.a.a(), vr0Var);
        fp fpVar = ct.f5155w;
        b10.getClass();
        return new a8(a10, kVar.f16826r.b(a10, l9.a.a(), vr0Var).a("google.afma.sdkConstants.getSdkConstants", fpVar, fpVar), l9.a.a(), wxVar);
    }
}
