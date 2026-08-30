package gb;

import android.os.Parcel;
import android.os.Parcelable;
import fa.s;
import wa.e7;

/* loaded from: classes.dex */
public final class f extends ga.a {
    public static final Parcelable.Creator<f> CREATOR = new c9.f(29);

    /* renamed from: u, reason: collision with root package name */
    public final int f17734u;

    /* renamed from: v, reason: collision with root package name */
    public final ca.b f17735v;

    /* renamed from: w, reason: collision with root package name */
    public final s f17736w;

    public f(int i, ca.b bVar, s sVar) {
        this.f17734u = i;
        this.f17735v = bVar;
        this.f17736w = sVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f17734u);
        e7.d(parcel, 2, this.f17735v, i);
        e7.d(parcel, 3, this.f17736w, i);
        e7.l(parcel, k3);
    }
}
