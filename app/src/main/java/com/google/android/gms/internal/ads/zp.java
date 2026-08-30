package com.google.android.gms.internal.ads;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zp extends a {
    public static final Parcelable.Creator<zp> CREATOR = new bj(3);

    /* renamed from: u, reason: collision with root package name */
    public final String f13223u;

    /* renamed from: v, reason: collision with root package name */
    public final String[] f13224v;

    /* renamed from: w, reason: collision with root package name */
    public final String[] f13225w;

    public zp(String str, String[] strArr, String[] strArr2) {
        this.f13223u = str;
        this.f13224v = strArr;
        this.f13225w = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 1, this.f13223u);
        e7.f(parcel, 2, this.f13224v);
        e7.f(parcel, 3, this.f13225w);
        e7.l(parcel, k3);
    }
}
