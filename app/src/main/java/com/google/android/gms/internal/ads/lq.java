package com.google.android.gms.internal.ads;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class lq extends a {
    public static final Parcelable.Creator<lq> CREATOR = new bj(7);

    /* renamed from: u, reason: collision with root package name */
    public final int f8101u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8102v;

    /* renamed from: w, reason: collision with root package name */
    public final String f8103w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8104x;

    public lq(String str, int i, int i10, int i11) {
        this.f8101u = i;
        this.f8102v = i10;
        this.f8103w = str;
        this.f8104x = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f8102v);
        e7.e(parcel, 2, this.f8103w);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f8104x);
        e7.j(parcel, AdError.NETWORK_ERROR_CODE, 4);
        parcel.writeInt(this.f8101u);
        e7.l(parcel, k3);
    }
}
