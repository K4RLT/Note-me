package qe;
import b0.d;
import g.a;
import m.g;
import x.b;

import b8.b7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ya.qa;

/* loaded from: classes.dex */
public abstract class k extends qa {
    public static boolean b(char[] cArr, char c10) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (c10 == cArr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    public static void c(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i10, iArr2, i, i11 - i10);
    }

    public static void d(int i, int i10, int i11, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i10, objArr2, i, i11 - i10);
    }

    public static void e(long[] jArr, long[] jArr2, int i, int i10, int i11) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i10, jArr2, i, i11 - i10);
    }

    public static /* synthetic */ void f(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        if ((i11 & 2) != 0) {
            i = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        c(i, 0, i10, iArr, iArr2);
    }

    public static /* synthetic */ void g(int i, int i10, int i11, Object[] objArr, Object[] objArr2) {
        if ((i11 & 4) != 0) {
            i = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        d(0, i, i10, objArr, objArr2);
    }

    public static void h(float[] fArr, float[] fArr2, int i) {
        int i10;
        if ((i & 8) != 0) {
            i10 = fArr.length;
        } else {
            i10 = 6;
        }
        fArr.getClass();
        System.arraycopy(fArr, 0, fArr2, 0, i10);
    }

    public static Object[] i(Object[] objArr, int i, int i10) {
        objArr.getClass();
        qa.a(i10, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i10);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static void j(int i, int i10, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i10, obj);
    }

    public static void k(long j10, long[] jArr) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j10);
    }

    public static ArrayList l(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jf.b, jf.d] */
    public static jf.d m(int[] iArr) {
        return new jf.b(0, iArr.length - 1, 1);
    }

    public static int n(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Object o(Object[] objArr, int i) {
        objArr.getClass();
        if (i >= 0 && i < objArr.length) {
            return objArr[i];
        }
        return null;
    }

    public static int p(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String q(Object[] objArr, b7 b7Var, int i) {
        String str;
        String str2;
        if ((i & 1) != 0) {
            str = ", ";
        } else {
            str = "\n";
        }
        String str3 = "";
        if ((i & 2) != 0) {
            str2 = "";
        } else {
            str2 = "innermostOf(";
        }
        if ((i & 4) == 0) {
            str3 = ")";
        }
        if ((i & 32) != 0) {
            b7Var = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            mf.a(sb2, obj, b7Var);
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static float[] r(float[] fArr, jf.d dVar) {
        dVar.getClass();
        if (dVar.isEmpty()) {
            return new float[0];
        }
        int i = dVar.f19189u;
        int i10 = dVar.f19190v + 1;
        qa.a(i10, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i10);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static void s(Object[] objArr, Comparator comparator, int i, int i10) {
        objArr.getClass();
        comparator.getClass();
        Arrays.sort(objArr, i, i10, comparator);
    }

    public static List t(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new i(objArr, false));
            }
            return g(objArr[0]);
        }
        return s.f24023u;
    }

    public static Set u(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(b(objArr.length));
                for (Object obj : objArr) {
                    linkedHashSet.add(obj);
                }
                return linkedHashSet;
            }
            return d(objArr[0]);
        }
        return u.f24025u;
    }
}
