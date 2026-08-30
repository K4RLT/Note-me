package com.google.android.gms.internal.ads;
import g9.y1;

/* loaded from: classes.dex */
public final class ve0 extends yv {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ we0 f11892u;

    public ve0(we0 we0Var) {
        this.f11892u = we0Var;
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void B(int i) {
        we0 we0Var = this.f11892u;
        tf tfVar = we0Var.f12220b;
        long j10 = we0Var.f12219a;
        k60 k60Var = new k60("rewarded");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onRewardedAdFailedToShow";
        k60Var.f7669d = Integer.valueOf(i);
        tfVar.n(k60Var);
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void C1(y1 y1Var) {
        we0 we0Var = this.f11892u;
        tf tfVar = we0Var.f12220b;
        long j10 = we0Var.f12219a;
        int i = y1Var.f17714u;
        k60 k60Var = new k60("rewarded");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onRewardedAdFailedToShow";
        k60Var.f7669d = Integer.valueOf(i);
        tfVar.n(k60Var);
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void K1(sv svVar) {
        we0 we0Var = this.f11892u;
        tf tfVar = we0Var.f12220b;
        long j10 = we0Var.f12219a;
        k60 k60Var = new k60("rewarded");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onUserEarnedReward";
        k60Var.e = svVar.a();
        k60Var.f7670f = Integer.valueOf(svVar.b());
        tfVar.n(k60Var);
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void a() {
        we0 we0Var = this.f11892u;
        tf tfVar = we0Var.f12220b;
        long j10 = we0Var.f12219a;
        k60 k60Var = new k60("rewarded");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onRewardedAdOpened";
        tfVar.n(k60Var);
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void b() {
        we0 we0Var = this.f11892u;
        tf tfVar = we0Var.f12220b;
        long j10 = we0Var.f12219a;
        k60 k60Var = new k60("rewarded");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onRewardedAdClosed";
        tfVar.n(k60Var);
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void f() {
        we0 we0Var = this.f11892u;
        tf tfVar = we0Var.f12220b;
        long j10 = we0Var.f12219a;
        k60 k60Var = new k60("rewarded");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onAdImpression";
        tfVar.n(k60Var);
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void i() {
        we0 we0Var = this.f11892u;
        tf tfVar = we0Var.f12220b;
        long j10 = we0Var.f12219a;
        k60 k60Var = new k60("rewarded");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onAdClicked";
        tfVar.n(k60Var);
    }
}
