package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class dx extends oh implements fx {
    public dx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator", 0);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void Q3(oa.a aVar, jx jxVar, cx cxVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, jxVar);
        qh.e(g22, cxVar);
        v2(g22, 1);
    }
}
