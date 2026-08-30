package mf;
import k.b;
import m.d;
import m.g;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import q.x;
import qe.s;
import ya.x0;

/* loaded from: classes.dex */
public abstract class f extends m {
    public static String A(String str) {
        if (str.endsWith(".png")) {
            return str.substring(0, str.length() - 4);
        }
        return str;
    }

    public static final List B(CharSequence charSequence, String str) {
        int q10 = q(charSequence, str, 0, false);
        if (q10 != -1) {
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(charSequence.subSequence(i, q10).toString());
                i = str.length() + q10;
                q10 = q(charSequence, str, i, false);
            } while (q10 != -1);
            arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
            return arrayList;
        }
        return qe.g(charSequence.toString());
    }

    public static List C(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return B(charSequence, str);
            }
        }
        List asList = Arrays.asList(strArr);
        asList.getClass();
        cg.g gVar = new cg.g(1, new af.j(charSequence, new a1.a(6, asList)));
        ArrayList arrayList = new ArrayList(qe.d(gVar, 10));
        Iterator it = gVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                jf.d dVar = (jf.d) bVar.next();
                dVar.getClass();
                arrayList.add(charSequence.subSequence(dVar.f19189u, dVar.f19190v + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static List D(String str, char[] cArr) {
        if (cArr.length == 1) {
            return B(str, String.valueOf(cArr[0]));
        }
        cg.g gVar = new cg.g(1, new af.j(str, new a1.a(7, cArr)));
        ArrayList arrayList = new ArrayList(qe.d(gVar, 10));
        Iterator it = gVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                jf.d dVar = (jf.d) bVar.next();
                dVar.getClass();
                arrayList.add(str.subSequence(dVar.f19189u, dVar.f19190v + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static String E(char c10, String str, String str2) {
        str.getClass();
        int r8 = r(str, c10, 0, 6);
        if (r8 == -1) {
            return str2;
        }
        return str.substring(r8 + 1, str.length());
    }

    public static String F(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int s10 = s(str, str2, 0, 6);
        if (s10 == -1) {
            return str3;
        }
        return str.substring(str2.length() + s10, str.length());
    }

    public static String G(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int v2 = v(str, 6, str2);
        if (v2 == -1) {
            return str3;
        }
        return str.substring(str2.length() + v2, str.length());
    }

    public static String H(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        x.j(g3.a.i("Requested character count ", i, " is less than zero."));
        return null;
    }

    public static CharSequence I(CharSequence charSequence) {
        int i;
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z3 = false;
        while (i10 <= length) {
            if (!z3) {
                i = i10;
            } else {
                i = length;
            }
            boolean c10 = x0.c(charSequence.charAt(i));
            if (!z3) {
                if (!c10) {
                    z3 = true;
                } else {
                    i10++;
                }
            } else {
                if (!c10) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static CharSequence J(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!x0.c(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i >= 0) {
                length = i;
            } else {
                return "";
            }
        }
    }

    public static String K(String str, char... cArr) {
        CharSequence charSequence;
        str.getClass();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!qe.b(cArr, str.charAt(i))) {
                    charSequence = str.subSequence(i, str.length());
                    break;
                }
                i++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    public static boolean m(CharSequence charSequence, char c10) {
        charSequence.getClass();
        if (r(charSequence, c10, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean n(CharSequence charSequence, String str) {
        charSequence.getClass();
        if (s(charSequence, str, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean o(CharSequence charSequence, char c10) {
        charSequence.getClass();
        if (charSequence.length() <= 0 || !x0.b(charSequence.charAt(charSequence.length() - 1), c10, false)) {
            return false;
        }
        return true;
    }

    public static int p(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static final int q(CharSequence charSequence, String str, int i, boolean z3) {
        int i10;
        boolean regionMatches;
        charSequence.getClass();
        str.getClass();
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i10 = 0;
        } else {
            i10 = i;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        jf.b bVar = new jf.b(i10, length, 1);
        boolean z9 = charSequence instanceof String;
        int i11 = bVar.f19191w;
        int i12 = bVar.f19190v;
        int i13 = bVar.f19189u;
        if (z9 && (str instanceof String)) {
            if ((i11 <= 0 || i13 > i12) && (i11 >= 0 || i12 > i13)) {
                return -1;
            }
            int i14 = i13;
            while (true) {
                String str2 = (String) charSequence;
                int length3 = str.length();
                if (!z3) {
                    regionMatches = str.regionMatches(0, str2, i14, length3);
                } else {
                    regionMatches = str.regionMatches(z3, 0, str2, i14, length3);
                }
                if (regionMatches) {
                    return i14;
                }
                if (i14 == i12) {
                    return -1;
                }
                i14 += i11;
            }
        } else {
            if ((i11 <= 0 || i13 > i12) && (i11 >= 0 || i12 > i13)) {
                return -1;
            }
            while (!y(str, 0, charSequence, i13, str.length(), z3)) {
                if (i13 == i12) {
                    return -1;
                }
                i13 += i11;
            }
            return i13;
        }
    }

    public static int r(CharSequence charSequence, char c10, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            return t(charSequence, new char[]{c10}, i, false);
        }
        return ((String) charSequence).indexOf(c10, i);
    }

    public static /* synthetic */ int s(CharSequence charSequence, String str, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        return q(charSequence, str, i, false);
    }

    public static final int t(CharSequence charSequence, char[] cArr, int i, boolean z3) {
        charSequence.getClass();
        if (!z3 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length != 0) {
                if (length == 1) {
                    return ((String) charSequence).indexOf(cArr[0], i);
                }
                x.n("Array has more than one element.");
                return 0;
            }
            l4.a.h("Array is empty.");
            return 0;
        }
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length() - 1;
        if (i > length2) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c10 : cArr) {
                if (x0.b(c10, charAt, z3)) {
                    return i;
                }
            }
            if (i != length2) {
                i++;
            } else {
                return -1;
            }
        }
    }

    public static boolean u(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!x0.c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int v(String str, int i, String str2) {
        int i10;
        if ((i & 2) != 0) {
            i10 = p(str);
        } else {
            i10 = 0;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, i10);
    }

    public static List w(String str) {
        d dVar = new d(str);
        if (!dVar.hasNext()) {
            return s.f24023u;
        }
        Object next = dVar.next();
        if (!dVar.hasNext()) {
            return qe.g(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (dVar.hasNext()) {
            arrayList.add(dVar.next());
        }
        return arrayList;
    }

    public static String x(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i);
                int length = i - str.length();
                int i10 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
                sb2.append((CharSequence) str);
                charSequence = sb2;
            }
            return charSequence.toString();
        }
        x.n(g3.a.i("Desired length ", i, " is less than zero."));
        return null;
    }

    public static final boolean y(CharSequence charSequence, int i, CharSequence charSequence2, int i10, int i11, boolean z3) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i10 < 0 || i < 0 || i > charSequence.length() - i11 || i10 > charSequence2.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!x0.b(charSequence.charAt(i + i12), charSequence2.charAt(i10 + i12), z3)) {
                return false;
            }
        }
        return true;
    }

    public static String z(String str, String str2) {
        str.getClass();
        if (str.startsWith(str2)) {
            return str.substring(str2.length());
        }
        return str;
    }
}
