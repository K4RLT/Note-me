package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class tv extends oh implements wv {
    public tv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd", 0);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final void B2(zv zvVar) {
        Parcel g22 = g2();
        qh.e(g22, zvVar);
        v2(g22, 2);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final void Y0(oa.a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 5);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final void Y3(g9.z2 z2Var, dw dwVar) {
        Parcel g22 = g2();
        qh.c(g22, z2Var);
        qh.e(g22, dwVar);
        v2(g22, 14);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final void f4(g9.q1 q1Var) {
        Parcel g22 = g2();
        qh.e(g22, q1Var);
        v2(g22, 13);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final g9.v1 h() {
        Parcel u22 = u2(g2(), 12);
        g9.v1 v4 = p60.v4(u22.readStrongBinder());
        u22.recycle();
        return v4;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final void w0(g9.z2 z2Var, dw dwVar) {
        Parcel g22 = g2();
        qh.c(g22, z2Var);
        qh.e(g22, dwVar);
        v2(g22, 1);
    }
}
