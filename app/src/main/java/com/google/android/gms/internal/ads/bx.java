package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class bx extends oh implements cx {
    @Override // com.google.android.gms.internal.ads.cx
    public final void m0(String str, Bundle bundle, String str2) {
        Parcel g22 = g2();
        g22.writeString(str);
        g22.writeString(str2);
        qh.c(g22, bundle);
        v2(g22, 3);
    }

    @Override // com.google.android.gms.internal.ads.cx
    public final void o(String str) {
        Parcel g22 = g2();
        g22.writeString(str);
        v2(g22, 2);
    }
}
