package com.google.android.gms.internal.ads;
import g3.a;
import g9.x1;
import g9.z1;
import oa.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class fs extends oh implements gs {
    public fs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper", 0);
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final void A0() {
        v2(g2(), 19);
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final boolean H1() {
        boolean z3;
        Parcel u22 = u2(g2(), 18);
        ClassLoader classLoader = qh.f9846a;
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final float L() {
        Parcel u22 = u2(g2(), 24);
        float readFloat = u22.readFloat();
        u22.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final Bundle L3() {
        Parcel u22 = u2(g2(), 16);
        Bundle bundle = (Bundle) qh.b(u22, Bundle.CREATOR);
        u22.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final boolean M() {
        boolean z3;
        Parcel u22 = u2(g2(), 17);
        ClassLoader classLoader = qh.f9846a;
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final void V(oa.a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 20);
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final void V2(oa.a aVar, oa.a aVar2, oa.a aVar3) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.e(g22, aVar2);
        qh.e(g22, aVar3);
        v2(g22, 21);
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final String a() {
        Parcel u22 = u2(g2(), 2);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final void a3() {
        v2(g2(), 26);
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final List b() {
        Parcel u22 = u2(g2(), 3);
        ArrayList readArrayList = u22.readArrayList(qh.f9846a);
        u22.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final zn d() {
        Parcel u22 = u2(g2(), 5);
        zn v4 = pn.v4(u22.readStrongBinder());
        u22.recycle();
        return v4;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final float d0() {
        Parcel u22 = u2(g2(), 25);
        float readFloat = u22.readFloat();
        u22.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final String e() {
        Parcel u22 = u2(g2(), 4);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final String f() {
        Parcel u22 = u2(g2(), 7);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final String g() {
        Parcel u22 = u2(g2(), 6);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final String h() {
        Parcel u22 = u2(g2(), 9);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final double i() {
        Parcel u22 = u2(g2(), 8);
        double readDouble = u22.readDouble();
        u22.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final oa.a j() {
        return g3.a.q(u2(g2(), 14));
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final String m() {
        Parcel u22 = u2(g2(), 10);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final g9.z1 n() {
        Parcel u22 = u2(g2(), 11);
        g9.z1 v4 = g9.x1.v4(u22.readStrongBinder());
        u22.recycle();
        return v4;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final un p() {
        Parcel u22 = u2(g2(), 12);
        un v4 = tn.v4(u22.readStrongBinder());
        u22.recycle();
        return v4;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final void p1(oa.a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 22);
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final oa.a q() {
        return g3.a.q(u2(g2(), 13));
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final float s() {
        Parcel u22 = u2(g2(), 23);
        float readFloat = u22.readFloat();
        u22.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final oa.a v() {
        return g3.a.q(u2(g2(), 15));
    }
}
