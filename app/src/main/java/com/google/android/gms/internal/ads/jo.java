package com.google.android.gms.internal.ads;
import g3.a;
import oa.a;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class jo extends oh implements ko {
    public jo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd", 0);
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final a b0() {
        return a.q(u2(g2(), 9));
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final String d() {
        Parcel u22 = u2(g2(), 4);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final boolean h2(a aVar) {
        boolean z3;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        Parcel u22 = u2(g22, 10);
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final boolean n0(a aVar) {
        boolean z3;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        Parcel u22 = u2(g22, 17);
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }
}
