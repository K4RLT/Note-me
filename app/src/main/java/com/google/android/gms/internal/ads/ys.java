package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ys extends oh implements zs {
    @Override // com.google.android.gms.internal.ads.zs
    public final void C0(String str, String str2, g9.z2 z2Var, oa.a aVar, xs xsVar, as asVar) {
        Parcel g22 = g2();
        g22.writeString(str);
        g22.writeString(str2);
        qh.c(g22, z2Var);
        qh.e(g22, aVar);
        qh.e(g22, xsVar);
        qh.e(g22, asVar);
        v2(g22, 20);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void F2(String str, String str2, g9.z2 z2Var, oa.a aVar, xs xsVar, as asVar) {
        Parcel g22 = g2();
        g22.writeString(str);
        g22.writeString(str2);
        qh.c(g22, z2Var);
        qh.e(g22, aVar);
        qh.e(g22, xsVar);
        qh.e(g22, asVar);
        v2(g22, 16);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final boolean H3(oa.a aVar) {
        boolean z3;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        Parcel u22 = u2(g22, 15);
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void N0(oa.a aVar, String str, Bundle bundle, Bundle bundle2, g9.c3 c3Var, bt btVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        g22.writeString(str);
        qh.c(g22, bundle);
        qh.c(g22, bundle2);
        qh.c(g22, c3Var);
        qh.e(g22, btVar);
        v2(g22, 1);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void Q2(String str, String str2, g9.z2 z2Var, oa.a aVar, ts tsVar, as asVar) {
        Parcel g22 = g2();
        g22.writeString(str);
        g22.writeString(str2);
        qh.c(g22, z2Var);
        qh.e(g22, aVar);
        qh.e(g22, tsVar);
        qh.e(g22, asVar);
        v2(g22, 14);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void U0(String str, String str2, g9.z2 z2Var, oa.a aVar, rs rsVar, as asVar, g9.c3 c3Var) {
        Parcel g22 = g2();
        g22.writeString(str);
        g22.writeString(str2);
        qh.c(g22, z2Var);
        qh.e(g22, aVar);
        qh.e(g22, rsVar);
        qh.e(g22, asVar);
        qh.c(g22, c3Var);
        v2(g22, 13);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final boolean Y(oa.a aVar) {
        boolean z3;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        Parcel u22 = u2(g22, 17);
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void Z2(String str) {
        Parcel g22 = g2();
        g22.writeString(str);
        v2(g22, 19);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final ft b() {
        Parcel u22 = u2(g2(), 2);
        ft ftVar = (ft) qh.b(u22, ft.CREATOR);
        u22.recycle();
        return ftVar;
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final g9.z1 d() {
        Parcel u22 = u2(g2(), 5);
        g9.z1 v4 = g9.x1.v4(u22.readStrongBinder());
        u22.recycle();
        return v4;
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final ft e() {
        Parcel u22 = u2(g2(), 3);
        ft ftVar = (ft) qh.b(u22, ft.CREATOR);
        u22.recycle();
        return ftVar;
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void j4(String str, String str2, g9.z2 z2Var, oa.b bVar, hj0 hj0Var, as asVar) {
        Parcel g22 = g2();
        g22.writeString(str);
        g22.writeString(str2);
        qh.c(g22, z2Var);
        qh.e(g22, bVar);
        qh.e(g22, hj0Var);
        qh.e(g22, asVar);
        v2(g22, 18);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void m2(String str, String str2, g9.z2 z2Var, oa.a aVar, rs rsVar, as asVar, g9.c3 c3Var) {
        Parcel g22 = g2();
        g22.writeString(str);
        g22.writeString(str2);
        qh.c(g22, z2Var);
        qh.e(g22, aVar);
        qh.e(g22, rsVar);
        qh.e(g22, asVar);
        qh.c(g22, c3Var);
        v2(g22, 21);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final boolean n0(oa.a aVar) {
        boolean z3;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        Parcel u22 = u2(g22, 24);
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void p4(String str, String str2, g9.z2 z2Var, oa.a aVar, vs vsVar, as asVar, rn rnVar) {
        Parcel g22 = g2();
        g22.writeString(str);
        g22.writeString(str2);
        qh.c(g22, z2Var);
        qh.e(g22, aVar);
        qh.e(g22, vsVar);
        qh.e(g22, asVar);
        qh.c(g22, rnVar);
        v2(g22, 22);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void q3(String str, String str2, g9.z2 z2Var, oa.a aVar, ps psVar, as asVar) {
        Parcel g22 = g2();
        g22.writeString(str);
        g22.writeString(str2);
        qh.c(g22, z2Var);
        qh.e(g22, aVar);
        qh.e(g22, psVar);
        qh.e(g22, asVar);
        v2(g22, 23);
    }
}
