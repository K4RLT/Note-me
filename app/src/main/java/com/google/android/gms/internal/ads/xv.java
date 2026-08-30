package com.google.android.gms.internal.ads;
import g9.y1;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class xv extends oh implements zv {
    @Override // com.google.android.gms.internal.ads.zv
    public final void B(int i) {
        Parcel g22 = g2();
        g22.writeInt(i);
        v2(g22, 4);
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void C1(y1 y1Var) {
        Parcel g22 = g2();
        qh.c(g22, y1Var);
        v2(g22, 5);
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void K1(sv svVar) {
        Parcel g22 = g2();
        qh.e(g22, svVar);
        v2(g22, 3);
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void a() {
        v2(g2(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void b() {
        v2(g2(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void f() {
        v2(g2(), 6);
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void i() {
        v2(g2(), 7);
    }
}
