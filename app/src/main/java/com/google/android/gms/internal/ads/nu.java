package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class nu extends ga.a {
    public static final Parcelable.Creator<nu> CREATOR = new bj(9);

    /* renamed from: u, reason: collision with root package name */
    public final View f8865u;

    /* renamed from: v, reason: collision with root package name */
    public final Map f8866v;

    public nu(IBinder iBinder, IBinder iBinder2) {
        this.f8865u = (View) oa.b.z1(oa.b.v1(iBinder));
        this.f8866v = (Map) oa.b.z1(oa.b.v1(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.c(parcel, 1, new oa.b(this.f8865u));
        wa.e7.c(parcel, 2, new oa.b(this.f8866v));
        wa.e7.l(parcel, k3);
    }
}
