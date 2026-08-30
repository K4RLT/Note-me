package com.google.android.gms.internal.ads;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class uu extends a {
    public static final Parcelable.Creator<uu> CREATOR = new bj(12);

    /* renamed from: u, reason: collision with root package name */
    public final String f11721u;

    public uu(String str) {
        this.f11721u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 1, this.f11721u);
        e7.l(parcel, k3);
    }
}
