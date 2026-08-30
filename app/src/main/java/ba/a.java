package ba;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class a extends ga.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* renamed from: u, reason: collision with root package name */
    public final Intent f3113u;

    public a(Intent intent) {
        this.f3113u = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.d(parcel, 1, this.f3113u, i);
        e7.l(parcel, k3);
    }
}
