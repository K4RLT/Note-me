package com.google.android.gms.internal.ads;
import e7.e;
import e7.j;
import e7.k;
import e7.l;
import ga.a;
import wa.e7;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class qq0 extends ga.a {
    public static final Parcelable.Creator<qq0> CREATOR = new bj(19);
    public final String A;
    public final int B;
    public final int C;
    public final int D;

    /* renamed from: u, reason: collision with root package name */
    public final Context f9972u;

    /* renamed from: v, reason: collision with root package name */
    public final int f9973v;

    /* renamed from: w, reason: collision with root package name */
    public final pq0 f9974w;

    /* renamed from: x, reason: collision with root package name */
    public final int f9975x;

    /* renamed from: y, reason: collision with root package name */
    public final int f9976y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9977z;

    public qq0(Context context, pq0 pq0Var, int i, int i10, int i11, String str, String str2) {
        int i12;
        pq0.values();
        this.f9972u = context;
        this.f9973v = pq0Var.ordinal();
        this.f9974w = pq0Var;
        this.f9975x = i;
        this.f9976y = i10;
        this.f9977z = i11;
        this.A = str;
        if ("oldest".equals(str2)) {
            i12 = 1;
        } else if ("lru".equals(str2) || !"lfu".equals(str2)) {
            i12 = 2;
        } else {
            i12 = 3;
        }
        this.D = i12;
        this.B = i12 - 1;
        this.C = 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.j(parcel, 1, 4);
        parcel.writeInt(this.f9973v);
        wa.e7.j(parcel, 2, 4);
        parcel.writeInt(this.f9975x);
        wa.e7.j(parcel, 3, 4);
        parcel.writeInt(this.f9976y);
        wa.e7.j(parcel, 4, 4);
        parcel.writeInt(this.f9977z);
        wa.e7.e(parcel, 5, this.A);
        wa.e7.j(parcel, 6, 4);
        parcel.writeInt(this.B);
        wa.e7.j(parcel, 7, 4);
        parcel.writeInt(this.C);
        wa.e7.l(parcel, k3);
    }

    public qq0(int i, int i10, int i11, int i12, String str, int i13, int i14) {
        pq0[] values = pq0.values();
        this.f9972u = null;
        this.f9973v = i;
        this.f9974w = values[i];
        this.f9975x = i10;
        this.f9976y = i11;
        this.f9977z = i12;
        this.A = str;
        this.B = i13;
        this.D = new int[]{1, 2, 3}[i13];
        this.C = i14;
        int i15 = new int[]{1}[i14];
    }
}
