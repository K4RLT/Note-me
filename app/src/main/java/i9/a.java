package i9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class a extends ga.a {
    public static final Parcelable.Creator<a> CREATOR = new b(0);

    /* renamed from: u, reason: collision with root package name */
    public final String f18354u;

    /* renamed from: v, reason: collision with root package name */
    public final String f18355v;

    /* renamed from: w, reason: collision with root package name */
    public final String f18356w;

    public a(String str, String str2, String str3) {
        this.f18354u = str;
        this.f18355v = str2;
        this.f18356w = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 1, this.f18354u);
        e7.e(parcel, 2, this.f18355v);
        e7.e(parcel, 3, this.f18356w);
        e7.l(parcel, k3);
    }
}
