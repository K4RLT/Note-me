package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class yn extends oh implements zn {
    public yn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage", 0);
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final int a() {
        Parcel u22 = u2(g2(), 5);
        int readInt = u22.readInt();
        u22.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final Map b() {
        Parcel u22 = u2(g2(), 6);
        HashMap readHashMap = u22.readHashMap(qh.f9846a);
        u22.recycle();
        return readHashMap;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final double c() {
        Parcel u22 = u2(g2(), 3);
        double readDouble = u22.readDouble();
        u22.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final int k() {
        Parcel u22 = u2(g2(), 4);
        int readInt = u22.readInt();
        u22.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final oa.a zza() {
        return g3.a.q(u2(g2(), 1));
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final Uri zzb() {
        Parcel u22 = u2(g2(), 2);
        Uri uri = (Uri) qh.b(u22, Uri.CREATOR);
        u22.recycle();
        return uri;
    }
}
