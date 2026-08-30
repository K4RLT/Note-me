package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class bo extends oh implements eo {
    public bo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate", 0);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void A1(oa.a aVar, String str) {
        Parcel g22 = g2();
        g22.writeString(str);
        qh.e(g22, aVar);
        v2(g22, 1);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void M2(oa.a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 9);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void S0(oa.b bVar, int i) {
        Parcel g22 = g2();
        qh.e(g22, bVar);
        g22.writeInt(i);
        v2(g22, 5);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void U3(oa.a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 3);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void j3(xn xnVar) {
        Parcel g22 = g2();
        ClassLoader classLoader = qh.f9846a;
        g22.writeStrongBinder(null);
        v2(g22, 8);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void m3(oa.a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 6);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void n2(oa.a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 7);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final oa.a t(String str) {
        Parcel g22 = g2();
        g22.writeString(str);
        return g3.a.q(u2(g22, 2));
    }
}
