package g9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class w2 extends ga.a {
    public static final Parcelable.Creator<w2> CREATOR = new h1(7);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f17710u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f17711v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f17712w;

    public w2(z8.t tVar) {
        this(tVar.f32005a, tVar.f32006b, tVar.f32007c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f17710u ? 1 : 0);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f17711v ? 1 : 0);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f17712w ? 1 : 0);
        e7.l(parcel, k3);
    }

    public w2(boolean z3, boolean z9, boolean z10) {
        this.f17710u = z3;
        this.f17711v = z9;
        this.f17712w = z10;
    }
}
