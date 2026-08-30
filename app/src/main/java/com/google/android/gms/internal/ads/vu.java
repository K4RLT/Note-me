package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class vu extends oh implements wu {
    @Override // com.google.android.gms.internal.ads.wu
    public final void R2(dv dvVar, av avVar) {
        Parcel g22 = g2();
        qh.c(g22, dvVar);
        qh.e(g22, avVar);
        v2(g22, 6);
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final void X1(dv dvVar, av avVar) {
        Parcel g22 = g2();
        qh.c(g22, dvVar);
        qh.e(g22, avVar);
        v2(g22, 4);
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final void s3(dv dvVar, av avVar) {
        Parcel g22 = g2();
        qh.c(g22, dvVar);
        qh.e(g22, avVar);
        v2(g22, 5);
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final void y0(String str) {
        Parcel g22 = g2();
        g22.writeString(str);
        v2(g22, 9);
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final void z2(String str, av avVar) {
        Parcel g22 = g2();
        g22.writeString(str);
        qh.e(g22, avVar);
        v2(g22, 7);
    }
}
