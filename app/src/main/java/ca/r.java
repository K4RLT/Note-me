package ca;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;
import wa.u;
import wa.v;

/* loaded from: classes.dex */
public final class r extends ga.a {
    public static final Parcelable.Creator<r> CREATOR = new c9.f(4);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f4061u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4062v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4063w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4064x;

    /* renamed from: y, reason: collision with root package name */
    public final long f4065y;

    public r(boolean z3, String str, int i, int i10, long j10) {
        this.f4061u = z3;
        this.f4062v = str;
        this.f4063w = v.a(i) - 1;
        this.f4064x = u.a(i10) - 1;
        this.f4065y = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f4061u ? 1 : 0);
        e7.e(parcel, 2, this.f4062v);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f4063w);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f4064x);
        e7.j(parcel, 5, 8);
        parcel.writeLong(this.f4065y);
        e7.l(parcel, k3);
    }
}
