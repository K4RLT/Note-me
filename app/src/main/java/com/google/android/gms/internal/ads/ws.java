package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ws extends oh implements xs {
    public ws(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback", 0);
    }

    @Override // com.google.android.gms.internal.ads.xs
    public final void a() {
        v2(g2(), 2);
    }

    @Override // com.google.android.gms.internal.ads.xs
    public final void r(g9.y1 y1Var) {
        Parcel g22 = g2();
        qh.c(g22, y1Var);
        v2(g22, 4);
    }
}
