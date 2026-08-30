package com.google.android.gms.internal.ads;
import oa.a;
import oa.b;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ov extends ph implements pv {
    public ov() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a v12 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                c0(v12);
                break;
            case 2:
                b.v1(parcel.readStrongBinder());
                parcel.readInt();
                qh.f(parcel);
                x3();
                break;
            case 3:
                a v13 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                U1(v13);
                break;
            case 4:
                a v14 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                Q(v14);
                break;
            case 5:
                a v15 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                J0(v15);
                break;
            case 6:
                a v16 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                g4(v16);
                break;
            case 7:
                a v17 = b.v1(parcel.readStrongBinder());
                qv qvVar = (qv) qh.b(parcel, qv.CREATOR);
                qh.f(parcel);
                C3(v17, qvVar);
                break;
            case 8:
                a v18 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                h3(v18);
                break;
            case 9:
                a v19 = b.v1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                qh.f(parcel);
                T2(v19, readInt);
                break;
            case 10:
                b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                a2();
                break;
            case 11:
                a v110 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                B1(v110);
                break;
            case 12:
                qh.f(parcel);
                break;
            case 13:
                a v111 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                a1(v111);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
