package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a1 extends ga.a {
    public static final Parcelable.Creator<a1> CREATOR = new Object();
    public final Bundle A;
    public final String B;

    /* renamed from: u, reason: collision with root package name */
    public final long f13623u;

    /* renamed from: v, reason: collision with root package name */
    public final long f13624v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f13625w;

    /* renamed from: x, reason: collision with root package name */
    public final String f13626x;

    /* renamed from: y, reason: collision with root package name */
    public final String f13627y;

    /* renamed from: z, reason: collision with root package name */
    public final String f13628z;

    public a1(long j10, long j11, boolean z3, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f13623u = j10;
        this.f13624v = j11;
        this.f13625w = z3;
        this.f13626x = str;
        this.f13627y = str2;
        this.f13628z = str3;
        this.A = bundle;
        this.B = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.j(parcel, 1, 8);
        parcel.writeLong(this.f13623u);
        wa.e7.j(parcel, 2, 8);
        parcel.writeLong(this.f13624v);
        wa.e7.j(parcel, 3, 4);
        parcel.writeInt(this.f13625w ? 1 : 0);
        wa.e7.e(parcel, 4, this.f13626x);
        wa.e7.e(parcel, 5, this.f13627y);
        wa.e7.e(parcel, 6, this.f13628z);
        wa.e7.a(parcel, 7, this.A);
        wa.e7.e(parcel, 8, this.B);
        wa.e7.l(parcel, k3);
    }
}
