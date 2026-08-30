package com.google.android.gms.internal.ads;
import e7.b;
import e7.j;
import e7.k;
import e7.l;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class wv0 extends ga.a {
    public static final Parcelable.Creator<wv0> CREATOR = new bj(24);

    /* renamed from: u, reason: collision with root package name */
    public final int f12337u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f12338v;

    /* renamed from: w, reason: collision with root package name */
    public final int f12339w;

    public wv0(byte[] bArr, int i, int i10) {
        byte[] copyOf;
        this.f12337u = i;
        if (bArr == null) {
            copyOf = null;
        } else {
            copyOf = Arrays.copyOf(bArr, bArr.length);
        }
        this.f12338v = copyOf;
        this.f12339w = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.j(parcel, 1, 4);
        parcel.writeInt(this.f12337u);
        wa.e7.b(parcel, 2, this.f12338v);
        wa.e7.j(parcel, 3, 4);
        parcel.writeInt(this.f12339w);
        wa.e7.l(parcel, k3);
    }

    public wv0() {
        this(null, 1, 1);
    }
}
