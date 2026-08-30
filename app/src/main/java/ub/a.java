package ub;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new i9.b(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b bVar = (b) this;
        parcel.writeParcelable(bVar.f27146u, 0);
        parcel.writeInt(bVar.f27147v ? 1 : 0);
    }
}
