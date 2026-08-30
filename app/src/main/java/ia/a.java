package ia;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class a extends ga.a {
    public static final Parcelable.Creator<a> CREATOR = new i9.b(1);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f18358u;

    /* renamed from: v, reason: collision with root package name */
    public final int f18359v;

    public a(int i, boolean z3) {
        this.f18358u = z3;
        this.f18359v = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f18358u ? 1 : 0);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f18359v);
        e7.l(parcel, k3);
    }
}
