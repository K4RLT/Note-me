package eb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class g extends ga.a {
    public static final Parcelable.Creator<g> CREATOR = new c9.f(8);

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f16137u;

    public g(Bundle bundle) {
        this.f16137u = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.a(parcel, 1, this.f16137u);
        e7.l(parcel, k3);
    }
}
