package g9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class u2 extends ga.a {
    public static final Parcelable.Creator<u2> CREATOR = new h1(5);

    /* renamed from: u, reason: collision with root package name */
    public final int f17707u;

    /* renamed from: v, reason: collision with root package name */
    public final int f17708v;

    public u2(int i, int i10) {
        this.f17707u = i;
        this.f17708v = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f17707u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f17708v);
        e7.l(parcel, k3);
    }
}
