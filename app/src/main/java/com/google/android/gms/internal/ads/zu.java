package com.google.android.gms.internal.ads;
import k9.m;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract class zu extends ph implements av {
    public zu() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) qh.b(parcel, ParcelFileDescriptor.CREATOR);
                dv dvVar = (dv) qh.b(parcel, dv.CREATOR);
                qh.f(parcel);
                e2(parcelFileDescriptor, dvVar);
            } else {
                k9.m mVar = (k9.m) qh.b(parcel, k9.m.CREATOR);
                qh.f(parcel);
                b3(mVar);
            }
        } else {
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) qh.b(parcel, ParcelFileDescriptor.CREATOR);
            qh.f(parcel);
            e3(parcelFileDescriptor2);
        }
        parcel2.writeNoException();
        return true;
    }
}
