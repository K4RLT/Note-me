package x3;

import android.os.Parcel;
import android.os.Parcelable;
import b1.u;
import q.x;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: u, reason: collision with root package name */
    public final Parcelable f30079u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f30078v = new b();
    public static final Parcelable.Creator<b> CREATOR = new u(2);

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f30079u = parcelable == f30078v ? null : parcelable;
        } else {
            x.n("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f30079u, i);
    }

    public b() {
        this.f30079u = null;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f30079u = readParcelable == null ? f30078v : readParcelable;
    }
}
