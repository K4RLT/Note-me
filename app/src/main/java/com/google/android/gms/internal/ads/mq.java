package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class mq extends oh implements nq {
    @Override // com.google.android.gms.internal.ads.nq
    public final void a() {
        v2(g2(), 1);
    }

    @Override // com.google.android.gms.internal.ads.nq
    public final void u(int i) {
        Parcel g22 = g2();
        g22.writeInt(i);
        v2(g22, 2);
    }
}
