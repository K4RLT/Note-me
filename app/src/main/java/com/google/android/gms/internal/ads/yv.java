package com.google.android.gms.internal.ads;
import g9.y1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class yv extends ph implements zv {
    public yv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        sv rvVar;
        switch (i) {
            case 1:
                a();
                break;
            case 2:
                b();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    rvVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (queryLocalInterface instanceof sv) {
                        rvVar = (sv) queryLocalInterface;
                    } else {
                        rvVar = new rv(readStrongBinder);
                    }
                }
                qh.f(parcel);
                K1(rvVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                qh.f(parcel);
                B(readInt);
                break;
            case 5:
                y1 y1Var = (y1) qh.b(parcel, y1.CREATOR);
                qh.f(parcel);
                C1(y1Var);
                break;
            case 6:
                f();
                break;
            case 7:
                i();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
