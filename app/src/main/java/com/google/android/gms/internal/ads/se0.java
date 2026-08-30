package com.google.android.gms.internal.ads;
import g9.w;
import g9.x;
import g9.y1;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class se0 extends g9.w {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ tf f10597u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ te0 f10598v;

    public se0(te0 te0Var, tf tfVar) {
        this.f10597u = tfVar;
        this.f10598v = te0Var;
    }

    @Override // g9.x
    public final void F(g9.y1 y1Var) {
        long j10 = this.f10598v.f11331a;
        int i = y1Var.f17714u;
        k60 k60Var = new k60("interstitial");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onAdFailedToLoad";
        k60Var.f7669d = Integer.valueOf(i);
        this.f10597u.n(k60Var);
    }

    @Override // g9.x
    public final void a() {
        long j10 = this.f10598v.f11331a;
        k60 k60Var = new k60("interstitial");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onAdLoaded";
        this.f10597u.n(k60Var);
    }

    @Override // g9.x
    public final void b() {
        long j10 = this.f10598v.f11331a;
        k60 k60Var = new k60("interstitial");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onAdOpened";
        this.f10597u.n(k60Var);
    }

    @Override // g9.x
    public final void d() {
    }

    @Override // g9.x
    public final void e() {
        long j10 = this.f10598v.f11331a;
        k60 k60Var = new k60("interstitial");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onAdClicked";
        String b10 = k60Var.b();
        yp ypVar = (yp) this.f10597u.f11339v;
        Parcel g22 = ypVar.g2();
        g22.writeString(b10);
        ypVar.v2(g22, 1);
    }

    @Override // g9.x
    public final void g() {
    }

    @Override // g9.x
    public final void k() {
    }

    @Override // g9.x
    public final void l() {
        long j10 = this.f10598v.f11331a;
        k60 k60Var = new k60("interstitial");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onAdClosed";
        this.f10597u.n(k60Var);
    }

    @Override // g9.x
    public final void w(int i) {
        long j10 = this.f10598v.f11331a;
        k60 k60Var = new k60("interstitial");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onAdFailedToLoad";
        k60Var.f7669d = Integer.valueOf(i);
        this.f10597u.n(k60Var);
    }
}
