package y9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class c extends ga.a {
    public static final Parcelable.Creator<c> CREATOR = new i9.b(12);

    /* renamed from: u, reason: collision with root package name */
    public final String f31000u;

    /* renamed from: v, reason: collision with root package name */
    public final int f31001v;

    public c(String str, int i) {
        this.f31000u = str;
        this.f31001v = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 1, this.f31000u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f31001v);
        e7.l(parcel, k3);
    }
}
