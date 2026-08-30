package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import c9.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import fa.y;
import ga.a;
import wa.e7;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new f(5);

    /* renamed from: u, reason: collision with root package name */
    public final int f4281u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4282v;

    public Scope(int i, String str) {
        y.f(str, "scopeUri must not be null or empty");
        this.f4281u = i;
        this.f4282v = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f4282v.equals(((Scope) obj).f4282v);
    }

    public final int hashCode() {
        return this.f4282v.hashCode();
    }

    public final String toString() {
        return this.f4282v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f4281u);
        e7.e(parcel, 2, this.f4282v);
        e7.l(parcel, k3);
    }
}
