package com.google.android.gms.internal.ads;
import g3.a;
import g9.v1;
import g9.x1;
import g9.z1;
import oa.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class wo extends oh implements xo {
    @Override // com.google.android.gms.internal.ads.xo
    public final void U2(Bundle bundle) {
        Parcel g22 = g2();
        qh.c(g22, bundle);
        v2(g22, 33);
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final String a() {
        Parcel u22 = u2(g2(), 2);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final List b() {
        Parcel u22 = u2(g2(), 3);
        ArrayList readArrayList = u22.readArrayList(qh.f9846a);
        u22.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final zn d() {
        zn ynVar;
        Parcel u22 = u2(g2(), 5);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            ynVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zn) {
                ynVar = (zn) queryLocalInterface;
            } else {
                ynVar = new yn(readStrongBinder);
            }
        }
        u22.recycle();
        return ynVar;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final String e() {
        Parcel u22 = u2(g2(), 4);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final String f() {
        Parcel u22 = u2(g2(), 7);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final String g() {
        Parcel u22 = u2(g2(), 6);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final String h() {
        Parcel u22 = u2(g2(), 9);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final double i() {
        Parcel u22 = u2(g2(), 8);
        double readDouble = u22.readDouble();
        u22.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final un j() {
        un snVar;
        Parcel u22 = u2(g2(), 14);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            snVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof un) {
                snVar = (un) queryLocalInterface;
            } else {
                snVar = new sn(readStrongBinder);
            }
        }
        u22.recycle();
        return snVar;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final v1 l0() {
        Parcel u22 = u2(g2(), 31);
        v1 v4 = p60.v4(u22.readStrongBinder());
        u22.recycle();
        return v4;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final String m() {
        Parcel u22 = u2(g2(), 10);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final z1 n() {
        Parcel u22 = u2(g2(), 11);
        z1 v4 = x1.v4(u22.readStrongBinder());
        u22.recycle();
        return v4;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final List s() {
        Parcel u22 = u2(g2(), 23);
        ArrayList readArrayList = u22.readArrayList(qh.f9846a);
        u22.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final a x() {
        return a.q(u2(g2(), 18));
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final a z() {
        return a.q(u2(g2(), 19));
    }
}
