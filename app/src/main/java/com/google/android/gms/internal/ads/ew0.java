package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class ew0 extends oh implements fw0 {
    @Override // com.google.android.gms.internal.ads.fw0
    public final void B(int i) {
        Parcel g22 = g2();
        g22.writeInt(i);
        v2(g22, 6);
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void E2(byte[] bArr) {
        Parcel g22 = g2();
        g22.writeByteArray(bArr);
        v2(g22, 5);
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void P3(oa.b bVar, String str) {
        Parcel g22 = g2();
        qh.e(g22, bVar);
        g22.writeString(str);
        g22.writeString(null);
        v2(g22, 8);
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void a() {
        v2(g2(), 3);
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void a0(int i) {
        Parcel g22 = g2();
        g22.writeInt(i);
        v2(g22, 7);
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void x0() {
        Parcel g22 = g2();
        g22.writeIntArray(null);
        v2(g22, 4);
    }
}
