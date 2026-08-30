package g3;

import android.os.Parcel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ int a(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int b(int i) {
        int i10 = 1;
        if (i != 1) {
            i10 = 2;
            if (i != 2) {
                i10 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i10;
    }

    public static float c(float f10, float f11, float f12, float f13) {
        return (f10 * f11 * f12) + f13;
    }

    public static int d(int i, int i10) {
        return String.valueOf(i).length() + i10;
    }

    public static int e(String str, int i, int i10) {
        return (str.hashCode() + i) * i10;
    }

    public static String f(int i, int i10, String str, String str2, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i10);
        return sb2.toString();
    }

    public static String g(int i, String str) {
        return str + i;
    }

    public static String h(long j10, String str) {
        return str + j10;
    }

    public static String i(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String j(String str, int i, String str2, String str3, int i10) {
        return str + i + str2 + i10 + str3;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(String str, StringBuilder sb2) {
        return str + ((Object) sb2);
    }

    public static StringBuilder m(String str, int i, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder n(String str, int i, String str2, String str3, int i10) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap o(Class cls, cd.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map p(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static oa.a q(Parcel parcel) {
        oa.a v12 = oa.b.v1(parcel.readStrongBinder());
        parcel.recycle();
        return v12;
    }

    public static void r(int i, int i10, String str, String str2, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i10);
    }

    public static void s(StringBuilder sb2, String str, long j10, String str2) {
        sb2.append(str);
        sb2.append(j10);
        sb2.append(str2);
    }

    public static void t(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static float u(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 * f11)) / f13;
    }

    public static int v(String str, int i, int i10) {
        return str.length() + i + i10;
    }

    public static float w(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 * f11)) * f13;
    }

    public static float x(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static float y(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) + f12) * f13;
    }
}
