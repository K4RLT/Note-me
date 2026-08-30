package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class yr extends oh implements as {
    public yr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener", 0);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void B3(ko koVar, String str) {
        Parcel g22 = g2();
        qh.e(g22, koVar);
        g22.writeString(str);
        v2(g22, 10);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void D() {
        v2(g2(), 13);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void K2(g9.y1 y1Var) {
        Parcel g22 = g2();
        qh.c(g22, y1Var);
        v2(g22, 23);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void N3(qv qvVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void O3(String str, String str2) {
        Parcel g22 = g2();
        g22.writeString(str);
        g22.writeString(str2);
        v2(g22, 9);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void S(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void T(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void a() {
        v2(g2(), 1);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void b() {
        v2(g2(), 2);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void c3(g9.y1 y1Var) {
        Parcel g22 = g2();
        qh.c(g22, y1Var);
        v2(g22, 24);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void d() {
        v2(g2(), 4);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void d4() {
        v2(g2(), 18);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void f() {
        v2(g2(), 6);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void g() {
        v2(g2(), 5);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void i() {
        v2(g2(), 8);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void j() {
        v2(g2(), 15);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void n() {
        v2(g2(), 11);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void o0(int i) {
        Parcel g22 = g2();
        g22.writeInt(i);
        v2(g22, 3);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void o4(int i, String str) {
        Parcel g22 = g2();
        g22.writeInt(i);
        g22.writeString(str);
        v2(g22, 22);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void s() {
        v2(g2(), 25);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void x() {
        v2(g2(), 20);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void z0(sv svVar) {
        Parcel g22 = g2();
        qh.e(g22, svVar);
        v2(g22, 16);
    }
}
