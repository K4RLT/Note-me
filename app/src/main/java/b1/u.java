package b1;
import j.b0;
import q.x;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class u implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1401a;

    public /* synthetic */ u(int i) {
        this.f1401a = i;
    }

    public static v a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = u.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new v();
        }
        v0.e n10 = v0.h.f27281v.n();
        for (int i = 0; i < readInt; i++) {
            n10.add(parcel.readValue(classLoader));
        }
        return new v(n10.g());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1401a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new b0(parcel, null);
            default:
                if (parcel.readParcelable(null) == null) {
                    return x3.b.f30078v;
                }
                x.o("superState must be null");
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1401a) {
            case 0:
                return new v[i];
            case 1:
                return new b0[i];
            default:
                return new x3.b[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1401a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new b0(parcel, classLoader);
            default:
                if (parcel.readParcelable(classLoader) == null) {
                    return x3.b.f30078v;
                }
                x.o("superState must be null");
                return null;
        }
    }
}
