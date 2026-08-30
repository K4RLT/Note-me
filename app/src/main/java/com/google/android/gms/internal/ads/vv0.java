package com.google.android.gms.internal.ads;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vv0 extends a {
    public static final Parcelable.Creator<vv0> CREATOR = new bj(23);

    /* renamed from: u, reason: collision with root package name */
    public final int f12024u;

    /* renamed from: v, reason: collision with root package name */
    public final int f12025v;

    /* renamed from: w, reason: collision with root package name */
    public final String f12026w;

    /* renamed from: x, reason: collision with root package name */
    public final String f12027x;

    /* renamed from: y, reason: collision with root package name */
    public final int f12028y;

    public vv0(int i, int i10, int i11, String str, String str2) {
        this.f12024u = i;
        this.f12025v = i10;
        this.f12026w = str;
        this.f12027x = str2;
        this.f12028y = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f12024u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f12025v);
        e7.e(parcel, 3, this.f12026w);
        e7.e(parcel, 4, this.f12027x);
        e7.j(parcel, 5, 4);
        parcel.writeInt(this.f12028y);
        e7.l(parcel, k3);
    }
}
