package com.google.android.gms.internal.ads;
import g9.y1;

import android.content.Context;

/* loaded from: classes.dex */
public final class mr0 implements w80, z60, y80 {

    /* renamed from: u, reason: collision with root package name */
    public final ur0 f8401u;

    /* renamed from: v, reason: collision with root package name */
    public final rr0 f8402v;

    public mr0(Context context, ur0 ur0Var) {
        this.f8401u = ur0Var;
        this.f8402v = rr0.d(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void d() {
        if (((Boolean) rm.f10241d.p()).booleanValue()) {
            this.f8402v.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.y80
    public final void l() {
        if (((Boolean) rm.f10241d.p()).booleanValue()) {
            rr0 rr0Var = this.f8402v;
            rr0Var.a(true);
            this.f8401u.a(rr0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void o(g9.y1 y1Var) {
        if (((Boolean) rm.f10241d.p()).booleanValue()) {
            String aVar = y1Var.a().toString();
            rr0 rr0Var = this.f8402v;
            rr0Var.R(aVar);
            rr0Var.a(false);
            this.f8401u.a(rr0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.y80
    public final void y() {
    }
}
