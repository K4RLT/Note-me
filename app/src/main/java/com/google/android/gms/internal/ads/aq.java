package com.google.android.gms.internal.ads;
import e7.b;
import e7.e;
import e7.j;
import e7.k;
import e7.l;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class aq extends ga.a {
    public static final Parcelable.Creator<aq> CREATOR = new bj(4);
    public final boolean A;
    public final long B;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f4572u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4573v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4574w;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f4575x;

    /* renamed from: y, reason: collision with root package name */
    public final String[] f4576y;

    /* renamed from: z, reason: collision with root package name */
    public final String[] f4577z;

    public aq(boolean z3, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z9, long j10) {
        this.f4572u = z3;
        this.f4573v = str;
        this.f4574w = i;
        this.f4575x = bArr;
        this.f4576y = strArr;
        this.f4577z = strArr2;
        this.A = z9;
        this.B = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.j(parcel, 1, 4);
        parcel.writeInt(this.f4572u ? 1 : 0);
        wa.e7.e(parcel, 2, this.f4573v);
        wa.e7.j(parcel, 3, 4);
        parcel.writeInt(this.f4574w);
        wa.e7.b(parcel, 4, this.f4575x);
        wa.e7.f(parcel, 5, this.f4576y);
        wa.e7.f(parcel, 6, this.f4577z);
        wa.e7.j(parcel, 7, 4);
        parcel.writeInt(this.A ? 1 : 0);
        wa.e7.j(parcel, 8, 8);
        parcel.writeLong(this.B);
        wa.e7.l(parcel, k3);
    }
}
