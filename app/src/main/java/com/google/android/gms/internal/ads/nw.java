package com.google.android.gms.internal.ads;
import e7.e;
import e7.g;
import e7.j;
import e7.k;
import e7.l;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class nw extends ga.a {
    public static final Parcelable.Creator<nw> CREATOR = new bj(17);
    public final boolean A;
    public final List B;

    /* renamed from: u, reason: collision with root package name */
    public final String f8878u;

    /* renamed from: v, reason: collision with root package name */
    public final String f8879v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f8880w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f8881x;

    /* renamed from: y, reason: collision with root package name */
    public final List f8882y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f8883z;

    public nw(String str, String str2, boolean z3, boolean z9, List list, boolean z10, boolean z11, List list2) {
        this.f8878u = str;
        this.f8879v = str2;
        this.f8880w = z3;
        this.f8881x = z9;
        this.f8882y = list;
        this.f8883z = z10;
        this.A = z11;
        this.B = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.e(parcel, 2, this.f8878u);
        wa.e7.e(parcel, 3, this.f8879v);
        wa.e7.j(parcel, 4, 4);
        parcel.writeInt(this.f8880w ? 1 : 0);
        wa.e7.j(parcel, 5, 4);
        parcel.writeInt(this.f8881x ? 1 : 0);
        wa.e7.g(parcel, this.f8882y, 6);
        wa.e7.j(parcel, 7, 4);
        parcel.writeInt(this.f8883z ? 1 : 0);
        wa.e7.j(parcel, 8, 4);
        parcel.writeInt(this.A ? 1 : 0);
        wa.e7.g(parcel, this.B, 9);
        wa.e7.l(parcel, k3);
    }
}
