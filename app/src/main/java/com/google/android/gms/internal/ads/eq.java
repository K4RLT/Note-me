package com.google.android.gms.internal.ads;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class eq extends a {
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
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 1, this.f5751u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f5752v ? 1 : 0);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f5753w);
        e7.e(parcel, 4, this.f5754x);
        e7.l(parcel, k3);
    }
}
