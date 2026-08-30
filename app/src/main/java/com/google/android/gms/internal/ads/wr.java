package com.google.android.gms.internal.ads;
import g3.a;
import g9.c3;
import g9.x1;
import g9.z1;
import g9.z2;
import oa.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class wr extends oh implements xr {
    @Override // com.google.android.gms.internal.ads.xr
    public final void G0(a aVar, gq gqVar, ArrayList arrayList) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.e(g22, gqVar);
        g22.writeTypedList(arrayList);
        v2(g22, 31);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final boolean I() {
        boolean z3;
        Parcel u22 = u2(g2(), 22);
        ClassLoader classLoader = qh.f9846a;
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final gs J() {
        gs fsVar;
        Parcel u22 = u2(g2(), 27);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            fsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof gs) {
                fsVar = (gs) queryLocalInterface;
            } else {
                fsVar = new fs(readStrongBinder);
            }
        }
        u22.recycle();
        return fsVar;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void L0(a aVar, c3 c3Var, z2 z2Var, String str, String str2, as asVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, c3Var);
        qh.c(g22, z2Var);
        g22.writeString(str);
        g22.writeString(str2);
        qh.e(g22, asVar);
        v2(g22, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.xr
    public final ds P() {
        ds ohVar;
        Parcel u22 = u2(g2(), 15);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            ohVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof ds) {
                ohVar = (ds) queryLocalInterface;
            } else {
                ohVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper", 0);
            }
        }
        u22.recycle();
        return ohVar;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void P2(a aVar, z2 z2Var, String str, as asVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, z2Var);
        g22.writeString(str);
        qh.e(g22, asVar);
        v2(g22, 38);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void R3(a aVar, pv pvVar, List list) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.e(g22, pvVar);
        g22.writeStringList(list);
        v2(g22, 23);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void S1(a aVar, c3 c3Var, z2 z2Var, String str, String str2, as asVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, c3Var);
        qh.c(g22, z2Var);
        g22.writeString(str);
        g22.writeString(str2);
        qh.e(g22, asVar);
        v2(g22, 35);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void V(a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 21);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void V1(a aVar, z2 z2Var, String str, as asVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, z2Var);
        g22.writeString(str);
        qh.e(g22, asVar);
        v2(g22, 32);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void W2(z2 z2Var, String str) {
        Parcel g22 = g2();
        qh.c(g22, z2Var);
        g22.writeString(str);
        v2(g22, 11);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void Y1(a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 30);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void Z1(a aVar, z2 z2Var, String str, String str2, as asVar, rn rnVar, ArrayList arrayList) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, z2Var);
        g22.writeString(str);
        g22.writeString(str2);
        qh.e(g22, asVar);
        qh.c(g22, rnVar);
        g22.writeStringList(arrayList);
        v2(g22, 14);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void Z3(a aVar, z2 z2Var, String str, String str2, as asVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, z2Var);
        g22.writeString(str);
        g22.writeString(str2);
        qh.e(g22, asVar);
        v2(g22, 7);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final a b() {
        return a.q(u2(g2(), 2));
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final ft c4() {
        Parcel u22 = u2(g2(), 34);
        ft ftVar = (ft) qh.b(u22, ft.CREATOR);
        u22.recycle();
        return ftVar;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void d() {
        v2(g2(), 4);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final z1 d0() {
        Parcel u22 = u2(g2(), 26);
        z1 v4 = x1.v4(u22.readStrongBinder());
        u22.recycle();
        return v4;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void d1(a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 39);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void f0() {
        v2(g2(), 12);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void g() {
        v2(g2(), 5);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void h() {
        v2(g2(), 8);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final bs h0() {
        bs bsVar;
        Parcel u22 = u2(g2(), 36);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            bsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            if (queryLocalInterface instanceof bs) {
                bsVar = (bs) queryLocalInterface;
            } else {
                bsVar = new bs(readStrongBinder);
            }
        }
        u22.recycle();
        return bsVar;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final boolean j() {
        boolean z3;
        Parcel u22 = u2(g2(), 13);
        ClassLoader classLoader = qh.f9846a;
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.xr
    public final es j0() {
        es ohVar;
        Parcel u22 = u2(g2(), 16);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            ohVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof es) {
                ohVar = (es) queryLocalInterface;
            } else {
                ohVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper", 0);
            }
        }
        u22.recycle();
        return ohVar;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void k2(a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 37);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final ft l0() {
        Parcel u22 = u2(g2(), 33);
        ft ftVar = (ft) qh.b(u22, ft.CREATOR);
        u22.recycle();
        return ftVar;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void t2(boolean z3) {
        Parcel g22 = g2();
        ClassLoader classLoader = qh.f9846a;
        g22.writeInt(z3 ? 1 : 0);
        v2(g22, 25);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void t3() {
        v2(g2(), 9);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void w2(a aVar, z2 z2Var, pv pvVar, String str) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, z2Var);
        g22.writeString(null);
        qh.e(g22, pvVar);
        g22.writeString(str);
        v2(g22, 10);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void y3(a aVar, z2 z2Var, String str, as asVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, z2Var);
        g22.writeString(str);
        qh.e(g22, asVar);
        v2(g22, 28);
    }
}
