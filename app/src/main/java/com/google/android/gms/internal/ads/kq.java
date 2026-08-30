package com.google.android.gms.internal.ads;
import ga.a;
import e7.a;
import e7.e;
import e7.k;
import e7.l;
import wa.e7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class kq extends ga.a {
    public static final Parcelable.Creator<kq> CREATOR = new bj(6);

    /* renamed from: u, reason: collision with root package name */
    public final String f7841u;

    /* renamed from: v, reason: collision with root package name */
    public final Bundle f7842v;

    public kq(String str, Bundle bundle) {
        this.f7841u = str;
        this.f7842v = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.e(parcel, 1, this.f7841u);
        wa.e7.a(parcel, 2, this.f7842v);
        wa.e7.l(parcel, k3);
    }
}
