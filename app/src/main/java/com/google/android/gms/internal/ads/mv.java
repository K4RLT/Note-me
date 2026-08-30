package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class mv extends ga.a {
    public static final Parcelable.Creator<mv> CREATOR = new bj(14);

    /* renamed from: u, reason: collision with root package name */
    public final g9.z2 f8435u;

    /* renamed from: v, reason: collision with root package name */
    public final String f8436v;

    public mv(g9.z2 z2Var, String str) {
        this.f8435u = z2Var;
        this.f8436v = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.d(parcel, 2, this.f8435u, i);
        wa.e7.e(parcel, 3, this.f8436v);
        wa.e7.l(parcel, k3);
    }
}
