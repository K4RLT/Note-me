package fa;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class k extends ga.a {
    public static final Parcelable.Creator<k> CREATOR = new c9.f(18);
    public final String A;
    public final int B;
    public final int C;

    /* renamed from: u, reason: collision with root package name */
    public final int f16880u;

    /* renamed from: v, reason: collision with root package name */
    public final int f16881v;

    /* renamed from: w, reason: collision with root package name */
    public final int f16882w;

    /* renamed from: x, reason: collision with root package name */
    public final long f16883x;

    /* renamed from: y, reason: collision with root package name */
    public final long f16884y;

    /* renamed from: z, reason: collision with root package name */
    public final String f16885z;

    public k(int i, int i10, int i11, long j10, long j11, String str, String str2, int i12, int i13) {
        this.f16880u = i;
        this.f16881v = i10;
        this.f16882w = i11;
        this.f16883x = j10;
        this.f16884y = j11;
        this.f16885z = str;
        this.A = str2;
        this.B = i12;
        this.C = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f16880u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f16881v);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f16882w);
        e7.j(parcel, 4, 8);
        parcel.writeLong(this.f16883x);
        e7.j(parcel, 5, 8);
        parcel.writeLong(this.f16884y);
        e7.e(parcel, 6, this.f16885z);
        e7.e(parcel, 7, this.A);
        e7.j(parcel, 8, 4);
        parcel.writeInt(this.B);
        e7.j(parcel, 9, 4);
        parcel.writeInt(this.C);
        e7.l(parcel, k3);
    }
}
