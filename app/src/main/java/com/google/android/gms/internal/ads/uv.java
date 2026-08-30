package com.google.android.gms.internal.ads;
import g9.o1;
import g9.q1;
import g9.s2;
import g9.v1;
import g9.z2;
import oa.a;
import oa.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class uv extends ph implements wv {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f11728u = 0;

    public uv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        boolean z3 = false;
        dw dwVar = null;
        dw dwVar2 = null;
        o1 o1Var = null;
        ew ewVar = null;
        zv zvVar = null;
        switch (i) {
            case 1:
                z2 z2Var = (z2) qh.b(parcel, z2.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof dw) {
                        dwVar = (dw) queryLocalInterface;
                    } else {
                        dwVar = new bw(readStrongBinder);
                    }
                }
                qh.f(parcel);
                w0(z2Var, dwVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zv) {
                        zvVar = (zv) queryLocalInterface2;
                    } else {
                        zvVar = new oh(readStrongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback", 0);
                    }
                }
                qh.f(parcel);
                B2(zvVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean d2 = d();
                parcel2.writeNoException();
                ClassLoader classLoader = qh.f9846a;
                parcel2.writeInt(d2 ? 1 : 0);
                return true;
            case 4:
                String g8 = g();
                parcel2.writeNoException();
                parcel2.writeString(g8);
                return true;
            case 5:
                a v12 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                Y0(v12);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof ew) {
                        ewVar = (ew) queryLocalInterface3;
                    } else {
                        ewVar = new oh(readStrongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener", 0);
                    }
                }
                qh.f(parcel);
                e1(ewVar);
                parcel2.writeNoException();
                return true;
            case 7:
                hw hwVar = (hw) qh.b(parcel, hw.CREATOR);
                qh.f(parcel);
                J3(hwVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    if (queryLocalInterface4 instanceof o1) {
                        o1Var = (o1) queryLocalInterface4;
                    } else {
                        o1Var = new oh(readStrongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener", 0);
                    }
                }
                qh.f(parcel);
                D1(o1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle b10 = b();
                parcel2.writeNoException();
                qh.d(parcel2, b10);
                return true;
            case 10:
                a v13 = b.v1(parcel.readStrongBinder());
                ClassLoader classLoader2 = qh.f9846a;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                qh.f(parcel);
                L1(v13, z3);
                parcel2.writeNoException();
                return true;
            case 11:
                sv i10 = i();
                parcel2.writeNoException();
                qh.e(parcel2, i10);
                return true;
            case 12:
                v1 h3 = h();
                parcel2.writeNoException();
                qh.e(parcel2, h3);
                return true;
            case 13:
                q1 v4 = s2.v4(parcel.readStrongBinder());
                qh.f(parcel);
                f4(v4);
                parcel2.writeNoException();
                return true;
            case 14:
                z2 z2Var2 = (z2) qh.b(parcel, z2.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface5 instanceof dw) {
                        dwVar2 = (dw) queryLocalInterface5;
                    } else {
                        dwVar2 = new bw(readStrongBinder5);
                    }
                }
                qh.f(parcel);
                Y3(z2Var2, dwVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean a10 = qh.a(parcel);
                qh.f(parcel);
                V3(a10);
                parcel2.writeNoException();
                return true;
            case 16:
                String m4 = m();
                parcel2.writeNoException();
                parcel2.writeString(m4);
                return true;
            case 17:
                long q10 = q();
                parcel2.writeNoException();
                parcel2.writeLong(q10);
                return true;
            case 18:
                long readLong = parcel.readLong();
                qh.f(parcel);
                X(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
