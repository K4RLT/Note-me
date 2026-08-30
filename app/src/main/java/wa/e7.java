package wa;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e7 {
    public static void a(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int k3 = k(parcel, i);
        parcel.writeBundle(bundle);
        l(parcel, k3);
    }

    public static void b(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int k3 = k(parcel, i);
        parcel.writeByteArray(bArr);
        l(parcel, k3);
    }

    public static void c(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int k3 = k(parcel, i);
        parcel.writeStrongBinder(iBinder);
        l(parcel, k3);
    }

    public static void d(Parcel parcel, int i, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int k3 = k(parcel, i);
        parcelable.writeToParcel(parcel, i10);
        l(parcel, k3);
    }

    public static void e(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int k3 = k(parcel, i);
        parcel.writeString(str);
        l(parcel, k3);
    }

    public static void f(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int k3 = k(parcel, i);
        parcel.writeStringArray(strArr);
        l(parcel, k3);
    }

    public static void g(Parcel parcel, List list, int i) {
        if (list == null) {
            return;
        }
        int k3 = k(parcel, i);
        parcel.writeStringList(list);
        l(parcel, k3);
    }

    public static void h(Parcel parcel, int i, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int k3 = k(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        l(parcel, k3);
    }

    public static void i(Parcel parcel, List list, int i) {
        if (list == null) {
            return;
        }
        int k3 = k(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        l(parcel, k3);
    }

    public static void j(Parcel parcel, int i, int i10) {
        parcel.writeInt(i | (i10 << 16));
    }

    public static int k(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void l(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }
}
