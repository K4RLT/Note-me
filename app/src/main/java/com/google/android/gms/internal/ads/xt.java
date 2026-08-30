package com.google.android.gms.internal.ads;
import oa.a;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class xt extends oh implements zt {
    public xt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay", 0);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void D() {
        v2(g2(), 7);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void F0(Bundle bundle) {
        Parcel g22 = g2();
        qh.c(g22, bundle);
        v2(g22, 1);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void Q0() {
        v2(g2(), 9);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void Q1(int i, String[] strArr, int[] iArr) {
        Parcel g22 = g2();
        g22.writeInt(i);
        g22.writeStringArray(strArr);
        g22.writeIntArray(iArr);
        v2(g22, 15);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void W3(int i, int i10, Intent intent) {
        Parcel g22 = g2();
        g22.writeInt(i);
        g22.writeInt(i10);
        qh.c(g22, intent);
        v2(g22, 12);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void Y(a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 13);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void a() {
        v2(g2(), 14);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final boolean b() {
        boolean z3;
        Parcel u22 = u2(g2(), 11);
        ClassLoader classLoader = qh.f9846a;
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void c2(Bundle bundle) {
        Parcel g22 = g2();
        qh.c(g22, bundle);
        Parcel u22 = u2(g22, 6);
        if (u22.readInt() != 0) {
            bundle.readFromParcel(u22);
        }
        u22.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void d() {
        v2(g2(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void f() {
        v2(g2(), 4);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void f0() {
        v2(g2(), 8);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void g() {
        v2(g2(), 3);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void i() {
        v2(g2(), 5);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void k() {
        v2(g2(), 10);
    }
}
