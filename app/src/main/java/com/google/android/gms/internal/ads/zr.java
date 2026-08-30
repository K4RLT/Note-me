package com.google.android.gms.internal.ads;
import a5.a;
import g9.y1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zr extends ph implements as {
    public zr() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static as v4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof as) {
            return (as) queryLocalInterface;
        }
        return new yr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        sv svVar = null;
        switch (i) {
            case 1:
                a();
                break;
            case 2:
                b();
                break;
            case 3:
                int readInt = parcel.readInt();
                qh.f(parcel);
                o0(readInt);
                break;
            case 4:
                d();
                break;
            case 5:
                g();
                break;
            case 6:
                f();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof cs) {
                        a.p(queryLocalInterface);
                        throw null;
                    }
                }
                qh.f(parcel);
                break;
            case 8:
                i();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                qh.f(parcel);
                O3(readString, readString2);
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (queryLocalInterface2 instanceof ko) {
                    }
                }
                parcel.readString();
                qh.f(parcel);
                break;
            case 11:
                n();
                break;
            case 12:
                parcel.readString();
                qh.f(parcel);
                break;
            case 13:
                D();
                break;
            case 14:
                qv qvVar = (qv) qh.b(parcel, qv.CREATOR);
                qh.f(parcel);
                N3(qvVar);
                break;
            case 15:
                j();
                break;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (queryLocalInterface3 instanceof sv) {
                        svVar = (sv) queryLocalInterface3;
                    } else {
                        svVar = new rv(readStrongBinder3);
                    }
                }
                qh.f(parcel);
                z0(svVar);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                qh.f(parcel);
                S(readInt2);
                break;
            case 18:
                d4();
                break;
            case 19:
                qh.f(parcel);
                break;
            case 20:
                x();
                break;
            case gl.zzm /* 21 */:
                String readString3 = parcel.readString();
                qh.f(parcel);
                T(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                qh.f(parcel);
                o4(readInt3, readString4);
                break;
            case 23:
                y1 y1Var = (y1) qh.b(parcel, y1.CREATOR);
                qh.f(parcel);
                K2(y1Var);
                break;
            case 24:
                y1 y1Var2 = (y1) qh.b(parcel, y1.CREATOR);
                qh.f(parcel);
                c3(y1Var2);
                break;
            case 25:
                s();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
