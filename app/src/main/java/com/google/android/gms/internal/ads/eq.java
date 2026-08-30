package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class eq extends ga.a {
    public static final Parcelable.Creator<eq> CREATOR = new bj(5);

    /* renamed from: u, reason: collision with root package name */
    public final String f5751u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f5752v;

    /* renamed from: w, reason: collision with root package name */
    public final int f5753w;

    /* renamed from: x, reason: collision with root package name */
    public final String f5754x;

    public eq(String str, int i, String str2, boolean z3) {
        this.f5751u = str;
        this.f5752v = z3;
        this.f5753w = i;
        this.f5754x = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.e(parcel, 1, this.f5751u);
        wa.e7.j(parcel, 2, 4);
        parcel.writeInt(this.f5752v ? 1 : 0);
        wa.e7.j(parcel, 3, 4);
        parcel.writeInt(this.f5753w);
        wa.e7.e(parcel, 4, this.f5754x);
        wa.e7.l(parcel, k3);
    }
}
