package com.google.android.gms.internal.ads;
import j6.s;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* loaded from: classes.dex */
public final class v0 implements w1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f11764b;

    public v0(y0 y0Var) {
        this.f11764b = y0Var;
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final void c() {
        y0 y0Var = this.f11764b;
        if (y0Var.f12692q1 != null) {
            y0Var.w0(0, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final void zza() {
        zs1 zs1Var = this.f11764b.f13296c0;
        if (zs1Var != null) {
            zs1Var.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final void zzb() {
        y0 y0Var = this.f11764b;
        Surface surface = y0Var.f12692q1;
        if (surface != null) {
            s sVar = y0Var.f12676a1;
            Handler handler = (Handler) sVar.f18981v;
            if (handler != null) {
                handler.post(new t1(sVar, surface, SystemClock.elapsedRealtime()));
            }
            y0Var.f12695t1 = true;
        }
    }
}
