package eb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import wa.e7;

/* loaded from: classes.dex */
public final class t extends ga.a implements Iterable {
    public static final Parcelable.Creator<t> CREATOR = new c9.f(9);

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f16371u;

    public t(Bundle bundle) {
        this.f16371u = bundle;
    }

    public final Double a() {
        return Double.valueOf(this.f16371u.getDouble("value"));
    }

    public final Bundle b() {
        return new Bundle(this.f16371u);
    }

    public final String d() {
        return this.f16371u.getString("currency");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        s sVar = new s();
        sVar.f16364v = this.f16371u.keySet().iterator();
        return sVar;
    }

    public final String toString() {
        return this.f16371u.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.a(parcel, 2, b());
        e7.l(parcel, k3);
    }
}
