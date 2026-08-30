package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class gc0 extends ph implements nq {
    @Override // com.google.android.gms.internal.ads.nq
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.nq
    public final void u(int i) {
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            qh.f(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
