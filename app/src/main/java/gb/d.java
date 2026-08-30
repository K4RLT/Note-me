package gb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import wa.e7;

/* loaded from: classes.dex */
public final class d extends ga.a {
    public static final Parcelable.Creator<d> CREATOR = new c9.f(27);

    /* renamed from: u, reason: collision with root package name */
    public final List f17730u;

    /* renamed from: v, reason: collision with root package name */
    public final String f17731v;

    public d(String str, ArrayList arrayList) {
        this.f17730u = arrayList;
        this.f17731v = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.g(parcel, this.f17730u, 1);
        e7.e(parcel, 2, this.f17731v);
        e7.l(parcel, k3);
    }
}
