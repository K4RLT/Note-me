package com.google.android.gms.internal.ads;
import g9.y1;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class us extends oh implements vs {
    public us(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback", 0);
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void k1(gs gsVar) {
        Parcel g22 = g2();
        qh.e(g22, gsVar);
        v2(g22, 1);
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void r(g9.y1 y1Var) {
        Parcel g22 = g2();
        qh.c(g22, y1Var);
        v2(g22, 3);
    }
}
