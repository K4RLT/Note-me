package ia;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class c extends ga.a {
    public static final Parcelable.Creator<c> CREATOR = new i9.b(3);

    /* renamed from: u, reason: collision with root package name */
    public final int f18361u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f18362v;

    public c(int i, boolean z3) {
        this.f18361u = i;
        this.f18362v = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f18361u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f18362v ? 1 : 0);
        e7.l(parcel, k3);
    }
}
