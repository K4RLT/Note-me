package ba;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import wa.d7;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3122a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3122a) {
            case 0:
                int p10 = d7.p(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < p10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        d7.o(parcel, readInt);
                    } else {
                        intent = (Intent) d7.c(parcel, readInt, Intent.CREATOR);
                    }
                }
                d7.i(parcel, p10);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f3122a) {
            case 0:
                return new a[i];
            default:
                return new g[i];
        }
    }
}
