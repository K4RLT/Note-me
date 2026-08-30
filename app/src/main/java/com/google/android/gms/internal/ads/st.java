package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class st extends oh implements tt {
    public st(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils", 0);
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void I1(oa.a aVar, i9.a aVar2) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, aVar2);
        v2(g22, 6);
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void Q(oa.a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 4);
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void X3(String[] strArr, int[] iArr, oa.a aVar) {
        Parcel g22 = g2();
        g22.writeStringArray(strArr);
        g22.writeIntArray(iArr);
        qh.e(g22, aVar);
        v2(g22, 5);
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void e() {
        v2(g2(), 3);
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void s0(Intent intent) {
        Parcel g22 = g2();
        qh.c(g22, intent);
        v2(g22, 1);
    }
}
