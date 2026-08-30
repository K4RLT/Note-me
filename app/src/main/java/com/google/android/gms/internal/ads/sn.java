package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sn extends oh implements un {
    public sn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo", 0);
    }

    @Override // com.google.android.gms.internal.ads.un
    public final String zza() {
        Parcel u22 = u2(g2(), 2);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.un
    public final ArrayList zzb() {
        Parcel u22 = u2(g2(), 3);
        ArrayList readArrayList = u22.readArrayList(qh.f9846a);
        u22.recycle();
        return readArrayList;
    }
}
