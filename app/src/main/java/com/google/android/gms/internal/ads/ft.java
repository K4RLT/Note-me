package com.google.android.gms.internal.ads;
import a5.a;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ft extends a {
    public static final Parcelable.Creator<ft> CREATOR = new bj(8);

    /* renamed from: u, reason: collision with root package name */
    public final int f6157u;

    /* renamed from: v, reason: collision with root package name */
    public final int f6158v;

    /* renamed from: w, reason: collision with root package name */
    public final int f6159w;

    public ft(int i, int i10, int i11) {
        this.f6157u = i;
        this.f6158v = i10;
        this.f6159w = i11;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ft)) {
            ft ftVar = (ft) obj;
            if (ftVar.f6159w == this.f6159w && ftVar.f6158v == this.f6158v && ftVar.f6157u == this.f6157u) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f6157u, this.f6158v, this.f6159w});
    }

    public final String toString() {
        int i = this.f6157u;
        int length = String.valueOf(i).length();
        int i10 = this.f6158v;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f6159w;
        StringBuilder sb2 = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i11).length());
        a.n(i, i10, ".", ".", sb2);
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f6157u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f6158v);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f6159w);
        e7.l(parcel, k3);
    }
}
