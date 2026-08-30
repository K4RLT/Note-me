package eb;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class b3 extends ga.a {
    public static final Parcelable.Creator<b3> CREATOR = new c9.f(11);

    /* renamed from: u, reason: collision with root package name */
    public final String f16070u;

    /* renamed from: v, reason: collision with root package name */
    public final long f16071v;

    /* renamed from: w, reason: collision with root package name */
    public final int f16072w;

    public b3(String str, long j10, int i) {
        this.f16070u = str;
        this.f16071v = j10;
        this.f16072w = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 1, this.f16070u);
        e7.j(parcel, 2, 8);
        parcel.writeLong(this.f16071v);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f16072w);
        e7.l(parcel, k3);
    }
}
