package ia;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class b extends ga.a {
    public static final Parcelable.Creator<b> CREATOR = new i9.b(2);

    /* renamed from: u, reason: collision with root package name */
    public final PendingIntent f18360u;

    public b(PendingIntent pendingIntent) {
        this.f18360u = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.d(parcel, 1, this.f18360u, i);
        e7.l(parcel, k3);
    }
}
