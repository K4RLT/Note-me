package fa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import wa.e7;

/* loaded from: classes.dex */
public final class n extends ga.a {
    public static final Parcelable.Creator<n> CREATOR = new c9.f(17);

    /* renamed from: u, reason: collision with root package name */
    public final int f16903u;

    /* renamed from: v, reason: collision with root package name */
    public List f16904v;

    public n(int i, List list) {
        this.f16903u = i;
        this.f16904v = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f16903u);
        e7.i(parcel, this.f16904v, 2);
        e7.l(parcel, k3);
    }
}
