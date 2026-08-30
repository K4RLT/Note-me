package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class hw extends ga.a {
    public static final Parcelable.Creator<hw> CREATOR = new bj(16);

    /* renamed from: u, reason: collision with root package name */
    public final String f6903u;

    /* renamed from: v, reason: collision with root package name */
    public final String f6904v;

    public hw(String str, String str2) {
        this.f6903u = str;
        this.f6904v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.e(parcel, 1, this.f6903u);
        wa.e7.e(parcel, 2, this.f6904v);
        wa.e7.l(parcel, k3);
    }
}
