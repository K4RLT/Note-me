package com.google.android.gms.internal.ads;

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
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                c0(v12);
                break;
            case 2:
                oa.b.v1(parcel.readStrongBinder());
                parcel.readInt();
                qh.f(parcel);
                x3();
                break;
            case 3:
                oa.a v13 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                U1(v13);
                break;
            case 4:
                oa.a v14 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                Q(v14);
                break;
            case 5:
                oa.a v15 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                J0(v15);
                break;
            case 6:
                oa.a v16 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                g4(v16);
                break;
            case 7:
                oa.a v17 = oa.b.v1(parcel.readStrongBinder());
                qv qvVar = (qv) qh.b(parcel, qv.CREATOR);
                qh.f(parcel);
                C3(v17, qvVar);
                break;
            case 8:
                oa.a v18 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                h3(v18);
                break;
            case 9:
                oa.a v19 = oa.b.v1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                qh.f(parcel);
                T2(v19, readInt);
                break;
            case 10:
                oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                a2();
                break;
            case 11:
                oa.a v110 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                B1(v110);
                break;
            case 12:
                qh.f(parcel);
                break;
            case 13:
                oa.a v111 = oa.b.v1(parcel.readStrongBinder());
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
