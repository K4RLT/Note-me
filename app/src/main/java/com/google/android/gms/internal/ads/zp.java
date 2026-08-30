package com.google.android.gms.internal.ads;
import e7.e;
import e7.k;
import e7.l;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zp extends ga.a {
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
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.e(parcel, 1, this.f13223u);
        wa.e7.f(parcel, 2, this.f13224v);
        wa.e7.f(parcel, 3, this.f13225w);
        wa.e7.l(parcel, k3);
    }
}
