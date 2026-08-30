package g9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class d3 extends ga.a {
    public static final Parcelable.Creator<d3> CREATOR = new h1(10);

    /* renamed from: u, reason: collision with root package name */
    public final int f17608u;

    /* renamed from: v, reason: collision with root package name */
    public final int f17609v;

    /* renamed from: w, reason: collision with root package name */
    public final String f17610w;

    /* renamed from: x, reason: collision with root package name */
    public final long f17611x;

    public d3(int i, int i10, long j10, String str) {
        this.f17608u = i;
        this.f17609v = i10;
        this.f17610w = str;
        this.f17611x = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f17608u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f17609v);
        e7.e(parcel, 3, this.f17610w);
        e7.j(parcel, 4, 8);
        parcel.writeLong(this.f17611x);
        e7.l(parcel, k3);
    }
}
