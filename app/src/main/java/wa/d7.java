package wa;
import a5.a;
import ga.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class d7 {
    public static Bundle a(Parcel parcel, int i) {
        int n10 = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + n10);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i) {
        int n10 = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + n10);
        return createByteArray;
    }

    public static Parcelable c(Parcel parcel, int i, Parcelable.Creator creator) {
        int n10 = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + n10);
        return parcelable;
    }

    public static String d(Parcel parcel, int i) {
        int n10 = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + n10);
        return readString;
    }

    public static String[] e(Parcel parcel, int i) {
        int n10 = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + n10);
        return createStringArray;
    }

    public static ArrayList f(Parcel parcel, int i) {
        int n10 = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + n10);
        return createStringArrayList;
    }

    public static Object[] g(Parcel parcel, int i, Parcelable.Creator creator) {
        int n10 = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + n10);
        return createTypedArray;
    }

    public static ArrayList h(Parcel parcel, int i, Parcelable.Creator creator) {
        int n10 = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + n10);
        return createTypedArrayList;
    }

    public static void i(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
        } else {
            throw new b(a.f(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static boolean j(Parcel parcel, int i) {
        q(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static IBinder k(Parcel parcel, int i) {
        int n10 = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + n10);
        return readStrongBinder;
    }

    public static int l(Parcel parcel, int i) {
        q(parcel, i, 4);
        return parcel.readInt();
    }

    public static long m(Parcel parcel, int i) {
        q(parcel, i, 8);
        return parcel.readLong();
    }

    public static int n(Parcel parcel, int i) {
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static void o(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + n(parcel, i));
    }

    public static int p(Parcel parcel) {
        int readInt = parcel.readInt();
        int n10 = n(parcel, readInt);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 == 20293) {
            int i = n10 + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new b(a.f(dataPosition, i, "Size read is invalid start=", " end=", new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length())), parcel);
        }
        throw new b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void q(Parcel parcel, int i, int i10) {
        int n10 = n(parcel, i);
        if (n10 == i10) {
            return;
        }
        String hexString = Integer.toHexString(n10);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(n10).length() + 4 + 1);
        a.r(i10, n10, "Expected size ", " got ", sb2);
        throw new b(a.o(sb2, " (0x", hexString, ")"), parcel);
    }

    public static void r(Parcel parcel, int i, int i10) {
        if (i == i10) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        a.r(i10, i, "Expected size ", " got ", sb2);
        throw new b(a.o(sb2, " (0x", hexString, ")"), parcel);
    }
}
