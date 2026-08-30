package g9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class e3 extends ga.a {
    public static final Parcelable.Creator<e3> CREATOR = new h1(11);
    public final String A;
    public final String B;

    /* renamed from: u, reason: collision with root package name */
    public final String f17627u;

    /* renamed from: v, reason: collision with root package name */
    public long f17628v;

    /* renamed from: w, reason: collision with root package name */
    public y1 f17629w;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f17630x;

    /* renamed from: y, reason: collision with root package name */
    public final String f17631y;

    /* renamed from: z, reason: collision with root package name */
    public final String f17632z;

    public e3(String str, long j10, y1 y1Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f17627u = str;
        this.f17628v = j10;
        this.f17629w = y1Var;
        this.f17630x = bundle;
        this.f17631y = str2;
        this.f17632z = str3;
        this.A = str4;
        this.B = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 1, this.f17627u);
        long j10 = this.f17628v;
        e7.j(parcel, 2, 8);
        parcel.writeLong(j10);
        e7.d(parcel, 3, this.f17629w, i);
        e7.a(parcel, 4, this.f17630x);
        e7.e(parcel, 5, this.f17631y);
        e7.e(parcel, 6, this.f17632z);
        e7.e(parcel, 7, this.A);
        e7.e(parcel, 8, this.B);
        e7.l(parcel, k3);
    }
}
