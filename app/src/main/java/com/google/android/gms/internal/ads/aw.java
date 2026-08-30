package com.google.android.gms.internal.ads;
import oa.b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class aw extends oh {
    public final IBinder u4(oa.b bVar, String str, tr trVar) {
        Parcel g22 = g2();
        qh.e(g22, bVar);
        g22.writeString(str);
        qh.e(g22, trVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 1);
        IBinder readStrongBinder = u22.readStrongBinder();
        u22.recycle();
        return readStrongBinder;
    }
}
