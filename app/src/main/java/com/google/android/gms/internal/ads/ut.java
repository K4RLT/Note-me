package com.google.android.gms.internal.ads;
import oa.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class ut extends oh implements wt {
    public final tt u4(oa.b bVar, tr trVar) {
        tt stVar;
        Parcel g22 = g2();
        qh.e(g22, bVar);
        qh.e(g22, trVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 1);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            stVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof tt) {
                stVar = (tt) queryLocalInterface;
            } else {
                stVar = new st(readStrongBinder);
            }
        }
        u22.recycle();
        return stVar;
    }
}
