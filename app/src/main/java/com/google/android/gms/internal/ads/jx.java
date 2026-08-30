package com.google.android.gms.internal.ads;
import g9.c3;
import g9.z2;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class jx extends a {
    public static final Parcelable.Creator<jx> CREATOR = new bj(18);

    /* renamed from: u, reason: collision with root package name */
    public final String f7557u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7558v;

    /* renamed from: w, reason: collision with root package name */
    public final c3 f7559w;

    /* renamed from: x, reason: collision with root package name */
    public final z2 f7560x;

    public jx(String str, String str2, c3 c3Var, z2 z2Var) {
        this.f7557u = str;
        this.f7558v = str2;
        this.f7559w = c3Var;
        this.f7560x = z2Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 1, this.f7557u);
        e7.e(parcel, 2, this.f7558v);
        e7.d(parcel, 3, this.f7559w, i);
        e7.d(parcel, 4, this.f7560x, i);
        e7.l(parcel, k3);
    }
}
