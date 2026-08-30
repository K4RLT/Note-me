package c9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class a extends ga.a {
    public static final Parcelable.Creator<a> CREATOR = new f(0);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f4006u;

    public a(boolean z3) {
        this.f4006u = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f4006u ? 1 : 0);
        e7.l(parcel, k3);
    }
}
