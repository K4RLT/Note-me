package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class ui extends oh implements vi {
    @Override // com.google.android.gms.internal.ads.vi
    public final void F(g9.y1 y1Var) {
        Parcel g22 = g2();
        qh.c(g22, y1Var);
        v2(g22, 3);
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final void W0(ti tiVar) {
        Parcel g22 = g2();
        qh.e(g22, tiVar);
        v2(g22, 1);
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final void w(int i) {
        Parcel g22 = g2();
        g22.writeInt(i);
        v2(g22, 2);
    }
}
