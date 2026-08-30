package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class aj extends ga.a {
    public static final Parcelable.Creator<aj> CREATOR = new bj(0);

    /* renamed from: u, reason: collision with root package name */
    public ParcelFileDescriptor f4517u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f4518v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f4519w;

    /* renamed from: x, reason: collision with root package name */
    public final long f4520x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f4521y;

    public aj(ParcelFileDescriptor parcelFileDescriptor, boolean z3, boolean z9, long j10, boolean z10) {
        this.f4517u = parcelFileDescriptor;
        this.f4518v = z3;
        this.f4519w = z9;
        this.f4520x = j10;
        this.f4521y = z10;
    }

    public final synchronized boolean a() {
        return this.f4517u != null;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream b() {
        if (this.f4517u == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f4517u);
        this.f4517u = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean d() {
        return this.f4519w;
    }

    public final synchronized boolean g() {
        return this.f4521y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z3;
        long j10;
        int k3 = wa.e7.k(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f4517u;
        }
        wa.e7.d(parcel, 2, parcelFileDescriptor, i);
        synchronized (this) {
            z3 = this.f4518v;
        }
        wa.e7.j(parcel, 3, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean d2 = d();
        wa.e7.j(parcel, 4, 4);
        parcel.writeInt(d2 ? 1 : 0);
        synchronized (this) {
            j10 = this.f4520x;
        }
        wa.e7.j(parcel, 5, 8);
        parcel.writeLong(j10);
        boolean g8 = g();
        wa.e7.j(parcel, 6, 4);
        parcel.writeInt(g8 ? 1 : 0);
        wa.e7.l(parcel, k3);
    }

    public aj() {
        this(null, false, false, 0L, false);
    }
}
