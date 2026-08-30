package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class tn extends ph implements un {
    public static un v4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof un) {
            return (un) queryLocalInterface;
        }
        return new sn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeList(((nn) this).f8778w);
            return true;
        }
        parcel2.writeNoException();
        parcel2.writeString(((nn) this).f8776u);
        return true;
    }
}
