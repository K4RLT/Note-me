package gb;

import android.os.Parcel;
import android.os.Parcelable;
import fa.r;
import wa.e7;

/* loaded from: classes.dex */
public final class e extends ga.a {
    public static final Parcelable.Creator<e> CREATOR = new c9.f(28);

    /* renamed from: u, reason: collision with root package name */
    public final int f17732u;

    /* renamed from: v, reason: collision with root package name */
    public final r f17733v;

    public e(int i, r rVar) {
        this.f17732u = i;
        this.f17733v = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f17732u);
        e7.d(parcel, 2, this.f17733v, i);
        e7.l(parcel, k3);
    }
}
