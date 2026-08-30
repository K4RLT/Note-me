package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class rv0 extends ga.a {
    public static final Parcelable.Creator<rv0> CREATOR = new bj(21);

    /* renamed from: u, reason: collision with root package name */
    public final int f10293u;

    /* renamed from: v, reason: collision with root package name */
    public final String f10294v;

    /* renamed from: w, reason: collision with root package name */
    public final String f10295w;

    public rv0(String str, int i, String str2) {
        this.f10293u = i;
        this.f10294v = str;
        this.f10295w = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.j(parcel, 1, 4);
        parcel.writeInt(this.f10293u);
        wa.e7.e(parcel, 2, this.f10294v);
        wa.e7.e(parcel, 3, this.f10295w);
        wa.e7.l(parcel, k3);
    }
}
