package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class j40 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7314a;

    /* renamed from: b, reason: collision with root package name */
    public final tw f7315b;

    public /* synthetic */ j40(tw twVar, int i) {
        this.f7314a = i;
        this.f7315b = twVar;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f7314a) {
            case 0:
                View view = (View) this.f7315b.f11471w;
                lo1.b(view);
                return view;
            case 1:
                rp0 rp0Var = (rp0) this.f7315b.f11472x;
                lo1.b(rp0Var);
                return rp0Var;
            case 2:
                return (y40) this.f7315b.f11470v;
            default:
                return (h00) this.f7315b.f11473y;
        }
    }
}
