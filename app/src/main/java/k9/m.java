package k9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class m extends ga.a {
    public static final Parcelable.Creator<m> CREATOR = new i9.b(6);

    /* renamed from: u, reason: collision with root package name */
    public final String f19711u;

    /* renamed from: v, reason: collision with root package name */
    public final int f19712v;

    public m(String str, int i) {
        this.f19711u = str == null ? "" : str;
        this.f19712v = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 1, this.f19711u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f19712v);
        e7.l(parcel, k3);
    }
}
