package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class si extends oh implements ti {
    @Override // com.google.android.gms.internal.ads.ti
    public final g9.v1 e() {
        Parcel u22 = u2(g2(), 5);
        g9.v1 v4 = p60.v4(u22.readStrongBinder());
        u22.recycle();
        return v4;
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final void g3(oa.a aVar, yi yiVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.e(g22, yiVar);
        v2(g22, 4);
    }
}
