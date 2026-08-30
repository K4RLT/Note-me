package ya;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class sf extends a {
    public static final Parcelable.Creator<sf> CREATOR = new uf(0);

    /* renamed from: u, reason: collision with root package name */
    public final int f31495u;

    /* renamed from: v, reason: collision with root package name */
    public final int f31496v;

    /* renamed from: w, reason: collision with root package name */
    public final int f31497w;

    /* renamed from: x, reason: collision with root package name */
    public final int f31498x;

    /* renamed from: y, reason: collision with root package name */
    public final long f31499y;

    public sf(long j10, int i, int i10, int i11, int i12) {
        this.f31495u = i;
        this.f31496v = i10;
        this.f31497w = i11;
        this.f31498x = i12;
        this.f31499y = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f31495u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f31496v);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f31497w);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f31498x);
        e7.j(parcel, 5, 8);
        parcel.writeLong(this.f31499y);
        e7.l(parcel, k3);
    }
}
