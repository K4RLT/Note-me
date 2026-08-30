package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class co extends ph implements eo {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f5136u = 0;

    public co() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        xn ohVar;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                A1(v12, readString);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                qh.f(parcel);
                oa.a t3 = t(readString2);
                parcel2.writeNoException();
                qh.e(parcel2, t3);
                return true;
            case 3:
                oa.a v13 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                U3(v13);
                parcel2.writeNoException();
                return true;
            case 4:
                k();
                parcel2.writeNoException();
                return true;
            case 5:
                oa.b.v1(parcel.readStrongBinder());
                parcel.readInt();
                qh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                oa.a v14 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                m3(v14);
                parcel2.writeNoException();
                return true;
            case 7:
                oa.a v15 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                n2(v15);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ohVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    if (queryLocalInterface instanceof xn) {
                        ohVar = (xn) queryLocalInterface;
                    } else {
                        ohVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent", 0);
                    }
                }
                qh.f(parcel);
                j3(ohVar);
                parcel2.writeNoException();
                return true;
            case 9:
                oa.a v16 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                M2(v16);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
