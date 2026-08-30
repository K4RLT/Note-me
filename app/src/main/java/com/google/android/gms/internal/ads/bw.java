package com.google.android.gms.internal.ads;
import g9.y1;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class bw extends oh implements dw {
    public bw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback", 0);
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final void a() {
        v2(g2(), 1);
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final void r(g9.y1 y1Var) {
        Parcel g22 = g2();
        qh.c(g22, y1Var);
        v2(g22, 3);
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final void u(int i) {
        Parcel g22 = g2();
        g22.writeInt(i);
        v2(g22, 2);
    }
}
