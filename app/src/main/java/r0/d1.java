package r0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d1 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24206a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f24206a) {
            case 0:
                return new e1(parcel.readFloat());
            case 1:
                return new f1(parcel.readInt());
            default:
                return new g1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f24206a) {
            case 0:
                return new e1[i];
            case 1:
                return new f1[i];
            default:
                return new g1[i];
        }
    }
}
