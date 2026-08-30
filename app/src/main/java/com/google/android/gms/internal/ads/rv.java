package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class rv extends oh implements sv {
    public rv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem", 0);
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final String a() {
        Parcel u22 = u2(g2(), 1);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final int b() {
        Parcel u22 = u2(g2(), 2);
        int readInt = u22.readInt();
        u22.recycle();
        return readInt;
    }
}
