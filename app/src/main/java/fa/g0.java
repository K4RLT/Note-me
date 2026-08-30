package fa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class g0 extends ga.a {
    public static final Parcelable.Creator<g0> CREATOR = new c9.f(22);

    /* renamed from: u, reason: collision with root package name */
    public Bundle f16863u;

    /* renamed from: v, reason: collision with root package name */
    public ca.d[] f16864v;

    /* renamed from: w, reason: collision with root package name */
    public int f16865w;

    /* renamed from: x, reason: collision with root package name */
    public f f16866x;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.a(parcel, 1, this.f16863u);
        e7.h(parcel, 2, this.f16864v, i);
        int i10 = this.f16865w;
        e7.j(parcel, 3, 4);
        parcel.writeInt(i10);
        e7.d(parcel, 4, this.f16866x, i);
        e7.l(parcel, k3);
    }
}
