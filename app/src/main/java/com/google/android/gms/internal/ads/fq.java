package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class fq extends oh implements gq {
    @Override // com.google.android.gms.internal.ads.gq
    public final void a() {
        v2(g2(), 2);
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void l3(String str) {
        Parcel g22 = g2();
        g22.writeString(str);
        v2(g22, 3);
    }
}
