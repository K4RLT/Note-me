package com.google.android.gms.internal.ads;
import g9.y1;

/* loaded from: classes.dex */
public final class ue0 extends cw {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ we0 f11633u;

    public ue0(we0 we0Var) {
        this.f11633u = we0Var;
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final void a() {
        we0 we0Var = this.f11633u;
        tf tfVar = we0Var.f12220b;
        long j10 = we0Var.f12219a;
        k60 k60Var = new k60("rewarded");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onRewardedAdLoaded";
        tfVar.n(k60Var);
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final void r(g9.y1 y1Var) {
        we0 we0Var = this.f11633u;
        tf tfVar = we0Var.f12220b;
        long j10 = we0Var.f12219a;
        int i = y1Var.f17714u;
        k60 k60Var = new k60("rewarded");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onRewardedAdFailedToLoad";
        k60Var.f7669d = Integer.valueOf(i);
        tfVar.n(k60Var);
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final void u(int i) {
        we0 we0Var = this.f11633u;
        tf tfVar = we0Var.f12220b;
        long j10 = we0Var.f12219a;
        k60 k60Var = new k60("rewarded");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "onRewardedAdFailedToLoad";
        k60Var.f7669d = Integer.valueOf(i);
        tfVar.n(k60Var);
    }
}
