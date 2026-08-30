package b0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final int f1187u;

    public g(int i) {
        this.f1187u = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && this.f1187u == ((g) obj).f1187u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1187u);
    }

    public final String toString() {
        return a5.a.i(new StringBuilder("DefaultLazyKey(index="), this.f1187u, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1187u);
    }
}
