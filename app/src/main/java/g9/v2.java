package g9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class v2 extends ga.a {
    public static final Parcelable.Creator<v2> CREATOR = new h1(6);

    /* renamed from: u, reason: collision with root package name */
    public final String f17709u;

    public v2(String str) {
        this.f17709u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 15, this.f17709u);
        e7.l(parcel, k3);
    }
}
