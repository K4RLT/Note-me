package g9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class o0 extends ga.a {
    public static final Parcelable.Creator<o0> CREATOR = new h1(0);

    /* renamed from: u, reason: collision with root package name */
    public final String f17685u;

    /* renamed from: v, reason: collision with root package name */
    public final String f17686v;

    public o0(String str, String str2) {
        this.f17685u = str;
        this.f17686v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 1, this.f17685u);
        e7.e(parcel, 2, this.f17686v);
        e7.l(parcel, k3);
    }
}
