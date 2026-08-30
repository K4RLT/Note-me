package com.google.android.gms.internal.ads;
import k9.m;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class yu extends oh implements av {
    public yu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener", 0);
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void b3(k9.m mVar) {
        Parcel g22 = g2();
        qh.c(g22, mVar);
        v2(g22, 2);
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void e2(ParcelFileDescriptor parcelFileDescriptor, dv dvVar) {
        Parcel g22 = g2();
        qh.c(g22, parcelFileDescriptor);
        qh.c(g22, dvVar);
        v2(g22, 3);
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void e3(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel g22 = g2();
        qh.c(g22, parcelFileDescriptor);
        v2(g22, 1);
    }
}
