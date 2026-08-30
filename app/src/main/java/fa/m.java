package fa;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class m extends ga.a {
    public static final Parcelable.Creator<m> CREATOR = new c9.f(21);

    /* renamed from: u, reason: collision with root package name */
    public final int f16898u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f16899v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f16900w;

    /* renamed from: x, reason: collision with root package name */
    public final int f16901x;

    /* renamed from: y, reason: collision with root package name */
    public final int f16902y;

    public m(int i, int i10, int i11, boolean z3, boolean z9) {
        this.f16898u = i;
        this.f16899v = z3;
        this.f16900w = z9;
        this.f16901x = i10;
        this.f16902y = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f16898u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f16899v ? 1 : 0);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f16900w ? 1 : 0);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f16901x);
        e7.j(parcel, 5, 4);
        parcel.writeInt(this.f16902y);
        e7.l(parcel, k3);
    }
}
