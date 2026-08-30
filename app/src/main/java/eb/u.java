package eb;
import p.a;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class u extends ga.a {
    public static final Parcelable.Creator<u> CREATOR = new c9.f(10);

    /* renamed from: u, reason: collision with root package name */
    public final String f16380u;

    /* renamed from: v, reason: collision with root package name */
    public final t f16381v;

    /* renamed from: w, reason: collision with root package name */
    public final String f16382w;

    /* renamed from: x, reason: collision with root package name */
    public final long f16383x;

    public u(u uVar, long j10) {
        fa.y.h(uVar);
        this.f16380u = uVar.f16380u;
        this.f16381v = uVar.f16381v;
        this.f16382w = uVar.f16382w;
        this.f16383x = j10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16381v);
        StringBuilder q10 = a.q("origin=", this.f16382w, ",name=", this.f16380u, ",params=");
        q10.append(valueOf);
        return q10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 2, this.f16380u);
        e7.d(parcel, 3, this.f16381v, i);
        e7.e(parcel, 4, this.f16382w);
        e7.j(parcel, 5, 8);
        parcel.writeLong(this.f16383x);
        e7.l(parcel, k3);
    }

    public u(String str, t tVar, String str2, long j10) {
        this.f16380u = str;
        this.f16381v = tVar;
        this.f16382w = str2;
        this.f16383x = j10;
    }
}
