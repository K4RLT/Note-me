package ya;
import e7.j;
import e7.k;
import e7.l;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class bg extends a {
    public static final Parcelable.Creator<bg> CREATOR = new uf(3);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f31165u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f31166v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f31167w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f31168x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f31169y;

    public bg(boolean z3, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f31165u = z3;
        this.f31166v = z9;
        this.f31167w = z10;
        this.f31168x = z11;
        this.f31169y = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f31165u ? 1 : 0);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f31166v ? 1 : 0);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f31167w ? 1 : 0);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f31168x ? 1 : 0);
        e7.j(parcel, 5, 4);
        parcel.writeInt(this.f31169y ? 1 : 0);
        e7.l(parcel, k3);
    }
}
