package com.google.android.gms.internal.ads;
import g9.y1;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class cw extends ph implements dw {
    public cw() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                g9.y1 y1Var = (g9.y1) qh.b(parcel, g9.y1.CREATOR);
                qh.f(parcel);
                r(y1Var);
            } else {
                int readInt = parcel.readInt();
                qh.f(parcel);
                u(readInt);
            }
        } else {
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}
