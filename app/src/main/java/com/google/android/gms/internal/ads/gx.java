package com.google.android.gms.internal.ads;
import oa.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class gx extends oh implements ix {
    public final fx u4(oa.b bVar, tr trVar) {
        fx dxVar;
        Parcel g22 = g2();
        qh.e(g22, bVar);
        qh.e(g22, trVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 2);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            dxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof fx) {
                dxVar = (fx) queryLocalInterface;
            } else {
                dxVar = new dx(readStrongBinder);
            }
        }
        u22.recycle();
        return dxVar;
    }
}
