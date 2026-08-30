package com.google.android.gms.internal.ads;
import oa.b;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class yt extends ph implements zt {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f12962u = 0;

    public yt() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                F0(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                d();
                parcel2.writeNoException();
                return true;
            case 3:
                g();
                parcel2.writeNoException();
                return true;
            case 4:
                f();
                parcel2.writeNoException();
                return true;
            case 5:
                i();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                c2(bundle2);
                parcel2.writeNoException();
                qh.d(parcel2, bundle2);
                return true;
            case 7:
                D();
                parcel2.writeNoException();
                return true;
            case 8:
                f0();
                parcel2.writeNoException();
                return true;
            case 9:
                Q0();
                parcel2.writeNoException();
                return true;
            case 10:
                k();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean b10 = b();
                parcel2.writeNoException();
                ClassLoader classLoader = qh.f9846a;
                parcel2.writeInt(b10 ? 1 : 0);
                return true;
            case 12:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                Intent intent = (Intent) qh.b(parcel, Intent.CREATOR);
                qh.f(parcel);
                W3(readInt, readInt2, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 14:
                a();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                qh.f(parcel);
                Q1(readInt3, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
