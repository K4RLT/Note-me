package g9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class l2 extends ga.a {
    public static final Parcelable.Creator<l2> CREATOR = new h1(3);

    /* renamed from: u, reason: collision with root package name */
    public final int f17670u;

    /* renamed from: v, reason: collision with root package name */
    public final int f17671v;

    /* renamed from: w, reason: collision with root package name */
    public final String f17672w;

    public l2(String str, int i, int i10) {
        this.f17670u = i;
        this.f17671v = i10;
        this.f17672w = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f17670u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f17671v);
        e7.e(parcel, 3, this.f17672w);
        e7.l(parcel, k3);
    }
}
