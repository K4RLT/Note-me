package pb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new i9.b(9);

    /* renamed from: u, reason: collision with root package name */
    public final String f22637u;

    /* renamed from: v, reason: collision with root package name */
    public final String f22638v;

    /* renamed from: w, reason: collision with root package name */
    public final IBinder f22639w;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f22640x;

    public /* synthetic */ a(Parcel parcel) {
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        this.f22637u = readString;
        String readString2 = parcel.readString();
        Objects.requireNonNull(readString2);
        this.f22638v = readString2;
        if (parcel.readByte() != 0) {
            this.f22639w = parcel.readStrongBinder();
        } else {
            this.f22639w = null;
        }
        Bundle readBundle = parcel.readBundle(a.class.getClassLoader());
        this.f22640x = readBundle == null ? Bundle.EMPTY : readBundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22637u);
        parcel.writeString(this.f22638v);
        IBinder iBinder = this.f22639w;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.f22640x);
    }

    public a(String str, String str2, IBinder iBinder) {
        this.f22637u = str;
        Objects.requireNonNull(str2, "url cannot be null");
        this.f22638v = str2;
        this.f22639w = iBinder;
        this.f22640x = Bundle.EMPTY;
    }
}
