package fa;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class f extends ga.a {
    public static final Parcelable.Creator<f> CREATOR = new c9.f(23);

    /* renamed from: u, reason: collision with root package name */
    public final m f16850u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f16851v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f16852w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f16853x;

    /* renamed from: y, reason: collision with root package name */
    public final int f16854y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f16855z;

    public f(m mVar, boolean z3, boolean z9, int[] iArr, int i, int[] iArr2) {
        this.f16850u = mVar;
        this.f16851v = z3;
        this.f16852w = z9;
        this.f16853x = iArr;
        this.f16854y = i;
        this.f16855z = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.d(parcel, 1, this.f16850u, i);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f16851v ? 1 : 0);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f16852w ? 1 : 0);
        int[] iArr = this.f16853x;
        if (iArr != null) {
            int k4 = e7.k(parcel, 4);
            parcel.writeIntArray(iArr);
            e7.l(parcel, k4);
        }
        e7.j(parcel, 5, 4);
        parcel.writeInt(this.f16854y);
        int[] iArr2 = this.f16855z;
        if (iArr2 != null) {
            int k10 = e7.k(parcel, 6);
            parcel.writeIntArray(iArr2);
            e7.l(parcel, k10);
        }
        e7.l(parcel, k3);
    }
}
