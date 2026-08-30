package g9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class f3 extends ga.a {
    public static final Parcelable.Creator<f3> CREATOR = new h1(12);

    /* renamed from: u, reason: collision with root package name */
    public final int f17635u;

    public f3(int i) {
        this.f17635u = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f17635u);
        e7.l(parcel, k3);
    }
}
