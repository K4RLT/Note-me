package r0;
import x.o;
import q.x;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h1 implements Parcelable.ClassLoaderCreator {
    public static i1 a(Parcel parcel, ClassLoader classLoader) {
        v0 v0Var;
        if (classLoader == null) {
            classLoader = h1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    v0Var = v0.f24419x;
                } else {
                    x.o(g3.a.i("Unsupported MutableState policy ", readInt, " was restored"));
                    return null;
                }
            } else {
                v0Var = v0.f24421z;
            }
        } else {
            v0Var = v0.f24418w;
        }
        return new i1(readValue, v0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new i1[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
