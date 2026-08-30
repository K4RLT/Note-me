package ig;
import q.k;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class n {
    public static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f18535a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18536b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18537c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18538d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final List f18539f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18540g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18541h;

    public n(m mVar) {
        List list;
        this.f18535a = mVar.f18528a;
        String str = mVar.f18529b;
        this.f18536b = g(str, false, 0, str.length());
        String str2 = mVar.f18530c;
        this.f18537c = g(str2, false, 0, str2.length());
        this.f18538d = mVar.f18531d;
        int i10 = mVar.e;
        this.e = i10 == -1 ? b(mVar.f18528a) : i10;
        h(mVar.f18532f, false);
        ArrayList arrayList = mVar.f18533g;
        if (arrayList != null) {
            list = h(arrayList, true);
        } else {
            list = null;
        }
        this.f18539f = list;
        String str3 = mVar.f18534h;
        this.f18540g = str3 != null ? g(str3, false, 0, str3.length()) : null;
        this.f18541h = mVar.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [sg.f] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [sg.f, java.lang.Object] */
    public static String a(String str, int i10, int i11, String str2, boolean z3, boolean z9, boolean z10, boolean z11) {
        String str3;
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z11) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z3 && (!z9 || i(str, i12, i11)))) && (codePointAt != 43 || !z10)))) {
                i12 += Character.charCount(codePointAt);
            } else {
                Object obj = new Object();
                obj.N(str, i10, i12);
                Object r11 = 0;
                while (i12 < i11) {
                    int codePointAt2 = str.codePointAt(i12);
                    if (!z3 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z10) {
                            if (z3) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            obj.N(str3, 0, str3.length());
                        } else if (codePointAt2 >= 32 && codePointAt2 != 127 && ((codePointAt2 < 128 || !z11) && str2.indexOf(codePointAt2) == -1 && (codePointAt2 != 37 || (z3 && (!z9 || i(str, i12, i11)))))) {
                            obj.O(codePointAt2);
                        } else {
                            if (r11 == 0) {
                                r11 = new Object();
                            }
                            r11.O(codePointAt2);
                            while (!r11.j()) {
                                byte readByte = r11.readByte();
                                obj.H(37);
                                char[] cArr = i;
                                obj.H(cArr[((readByte & 255) >> 4) & 15]);
                                obj.H(cArr[readByte & 15]);
                            }
                        }
                    }
                    i12 += Character.charCount(codePointAt2);
                    r11 = r11;
                }
                return obj.r();
            }
        }
        return str.substring(i10, i11);
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [sg.f, java.lang.Object] */
    public static String g(String str, boolean z3, int i10, int i11) {
        int i12;
        int i13 = i10;
        while (i13 < i11) {
            char charAt = str.charAt(i13);
            if (charAt != '%' && (charAt != '+' || !z3)) {
                i13++;
            } else {
                Object obj = new Object();
                obj.N(str, i10, i13);
                while (i13 < i11) {
                    int codePointAt = str.codePointAt(i13);
                    if (codePointAt == 37 && (i12 = i13 + 2) < i11) {
                        int f10 = jg.b.f(str.charAt(i13 + 1));
                        int f11 = jg.b.f(str.charAt(i12));
                        if (f10 != -1 && f11 != -1) {
                            obj.H((f10 << 4) + f11);
                            i13 = i12;
                        }
                        obj.O(codePointAt);
                    } else {
                        if (codePointAt == 43 && z3) {
                            obj.H(32);
                        }
                        obj.O(codePointAt);
                    }
                    i13 += Character.charCount(codePointAt);
                }
                return obj.r();
            }
        }
        return str.substring(i10, i11);
    }

    public static List h(ArrayList arrayList, boolean z3) {
        String str;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = (String) arrayList.get(i10);
            if (str2 != null) {
                str = g(str2, z3, 0, str2.length());
            } else {
                str = null;
            }
            arrayList2.add(str);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean i(String str, int i10, int i11) {
        int i12 = i10 + 2;
        if (i12 < i11 && str.charAt(i10) == '%' && jg.b.f(str.charAt(i10 + 1)) != -1 && jg.b.f(str.charAt(i12)) != -1) {
            return true;
        }
        return false;
    }

    public static ArrayList j(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i10, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i10, indexOf));
                arrayList.add(null);
            }
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    public final String c() {
        if (this.f18537c.isEmpty()) {
            return "";
        }
        int length = this.f18535a.length() + 3;
        String str = this.f18541h;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    public final ArrayList d() {
        int length = this.f18535a.length() + 3;
        String str = this.f18541h;
        int indexOf = str.indexOf(47, length);
        int i10 = jg.b.i(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < i10) {
            int i11 = indexOf + 1;
            int h3 = jg.b.h(str, i11, i10, '/');
            arrayList.add(str.substring(i11, h3));
            indexOf = h3;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f18539f == null) {
            return null;
        }
        String str = this.f18541h;
        int indexOf = str.indexOf(63) + 1;
        return str.substring(indexOf, jg.b.h(str, indexOf, str.length(), '#'));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n) && ((n) obj).f18541h.equals(this.f18541h)) {
            return true;
        }
        return false;
    }

    public final String f() {
        if (this.f18536b.isEmpty()) {
            return "";
        }
        int length = this.f18535a.length() + 3;
        String str = this.f18541h;
        return str.substring(length, jg.b.i(str, length, str.length(), ":@"));
    }

    public final int hashCode() {
        return this.f18541h.hashCode();
    }

    public final URI k() {
        ArrayList arrayList;
        m mVar = new m();
        String str = this.f18535a;
        mVar.f18528a = str;
        mVar.f18529b = f();
        mVar.f18530c = c();
        mVar.f18531d = this.f18538d;
        int b10 = b(str);
        int i10 = this.e;
        if (i10 == b10) {
            i10 = -1;
        }
        mVar.e = i10;
        ArrayList arrayList2 = mVar.f18532f;
        arrayList2.clear();
        arrayList2.addAll(d());
        String e = e();
        String str2 = null;
        if (e != null) {
            arrayList = j(a(e, 0, e.length(), " \"'<>#", true, false, true, true));
        } else {
            arrayList = null;
        }
        mVar.f18533g = arrayList;
        if (this.f18540g != null) {
            String str3 = this.f18541h;
            str2 = str3.substring(str3.indexOf(35) + 1);
        }
        mVar.f18534h = str2;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str4 = (String) arrayList2.get(i11);
            arrayList2.set(i11, a(str4, 0, str4.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList3 = mVar.f18533g;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str5 = (String) mVar.f18533g.get(i12);
                if (str5 != null) {
                    mVar.f18533g.set(i12, a(str5, 0, str5.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str6 = mVar.f18534h;
        if (str6 != null) {
            mVar.f18534h = a(str6, 0, str6.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String mVar2 = mVar.toString();
        try {
            return new URI(mVar2);
        } catch (URISyntaxException e8) {
            try {
                return URI.create(mVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                g5.k(e8);
                return null;
            }
        }
    }

    public final String toString() {
        return this.f18541h;
    }
}