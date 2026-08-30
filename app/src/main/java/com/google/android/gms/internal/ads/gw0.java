package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class gw0 extends ph implements fw0 {
    public gw0() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void B(int i) {
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void E2(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void a0(int i) {
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                oa.b.v1(parcel.readStrongBinder());
                parcel.readString();
                qh.f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                qh.f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                qh.f(parcel);
                break;
            case 6:
                parcel.readInt();
                qh.f(parcel);
                break;
            case 7:
                parcel.readInt();
                qh.f(parcel);
                break;
            case 8:
                oa.b.v1(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                qh.f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void x0() {
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void P3(oa.b bVar, String str) {
    }
}
