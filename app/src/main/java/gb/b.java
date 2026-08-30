package gb;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class b extends ga.a {
    public static final Parcelable.Creator<b> CREATOR = new c9.f(26);

    /* renamed from: u, reason: collision with root package name */
    public final int f17727u;

    /* renamed from: v, reason: collision with root package name */
    public final int f17728v;

    /* renamed from: w, reason: collision with root package name */
    public final Intent f17729w;

    public b(int i, int i10, Intent intent) {
        this.f17727u = i;
        this.f17728v = i10;
        this.f17729w = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f17727u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f17728v);
        e7.d(parcel, 3, this.f17729w, i);
        e7.l(parcel, k3);
    }
}
