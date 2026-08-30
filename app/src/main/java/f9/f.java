package f9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class f extends ga.a {
    public static final Parcelable.Creator<f> CREATOR = new c9.f(16);
    public final boolean A;
    public final boolean B;
    public final boolean C;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f16798u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f16799v;

    /* renamed from: w, reason: collision with root package name */
    public final String f16800w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f16801x;

    /* renamed from: y, reason: collision with root package name */
    public final float f16802y;

    /* renamed from: z, reason: collision with root package name */
    public final int f16803z;

    public f(boolean z3, boolean z9, String str, boolean z10, float f10, int i, boolean z11, boolean z12, boolean z13) {
        this.f16798u = z3;
        this.f16799v = z9;
        this.f16800w = str;
        this.f16801x = z10;
        this.f16802y = f10;
        this.f16803z = i;
        this.A = z11;
        this.B = z12;
        this.C = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f16798u ? 1 : 0);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f16799v ? 1 : 0);
        e7.e(parcel, 4, this.f16800w);
        e7.j(parcel, 5, 4);
        parcel.writeInt(this.f16801x ? 1 : 0);
        e7.j(parcel, 6, 4);
        parcel.writeFloat(this.f16802y);
        e7.j(parcel, 7, 4);
        parcel.writeInt(this.f16803z);
        e7.j(parcel, 8, 4);
        parcel.writeInt(this.A ? 1 : 0);
        e7.j(parcel, 9, 4);
        parcel.writeInt(this.B ? 1 : 0);
        e7.j(parcel, 10, 4);
        parcel.writeInt(this.C ? 1 : 0);
        e7.l(parcel, k3);
    }

    public f(boolean z3, boolean z9, boolean z10, float f10, boolean z11, boolean z12, boolean z13) {
        this(z3, z9, null, z10, f10, -1, z11, z12, z13);
    }
}
