package com.google.android.gms.internal.ads;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class pv0 extends a {
    public static final Parcelable.Creator<pv0> CREATOR = new bj(20);

    /* renamed from: u, reason: collision with root package name */
    public final int f9617u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f9618v;

    public pv0(byte[] bArr, int i) {
        this.f9617u = i;
        this.f9618v = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f9617u);
        e7.b(parcel, 2, this.f9618v);
        e7.l(parcel, k3);
    }
}
