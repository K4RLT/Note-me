package com.google.android.gms.internal.ads;
import e7.g;
import e7.j;
import e7.k;
import e7.l;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class tu extends ga.a {
    public static final Parcelable.Creator<tu> CREATOR = new bj(11);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f11447u;

    /* renamed from: v, reason: collision with root package name */
    public final List f11448v;

    public tu(List list, boolean z3) {
        this.f11447u = z3;
        this.f11448v = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.j(parcel, 2, 4);
        parcel.writeInt(this.f11447u ? 1 : 0);
        wa.e7.g(parcel, this.f11448v, 3);
        wa.e7.l(parcel, k3);
    }
}
