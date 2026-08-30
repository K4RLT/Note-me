package com.google.android.gms.internal.ads;
import g9.y1;
import oa.a;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class qs extends oh implements rs {
    public qs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback", 0);
    }

    @Override // com.google.android.gms.internal.ads.rs
    public final void c0(a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 1);
    }

    @Override // com.google.android.gms.internal.ads.rs
    public final void r(y1 y1Var) {
        Parcel g22 = g2();
        qh.c(g22, y1Var);
        v2(g22, 3);
    }
}
