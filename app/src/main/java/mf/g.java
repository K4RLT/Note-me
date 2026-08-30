package mf;
import m.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q.x;
import ya.x0;

/* loaded from: classes.dex */
public abstract class g {
    public static void a(StringBuilder sb2, Object obj, df.l lVar) {
        boolean z3;
        if (lVar != null) {
            sb2.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z3 = true;
        } else {
            z3 = obj instanceof CharSequence;
        }
        if (z3) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    public static String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        d dVar = new d(str);
        int i = 0;
        while (dVar.hasNext()) {
            String str2 = (String) dVar.next();
            str2.getClass();
            if (f.u(str2)) {
                if (str2.length() < 4) {
                    str2 = "    ";
                }
            } else {
                str2 = "    ".concat(str2);
            }
            i++;
            if (i > 1) {
                sb2.append((CharSequence) "\n");
            }
            a(sb2, str2, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static String c(String str) {
        Comparable comparable;
        int i;
        String str2;
        List w10 = f.w(str);
        List list = w10;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!f.u((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(qe.d(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (!x0.c(str3.charAt(i12))) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (i12 == -1) {
                i12 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i12));
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length2 = str.length();
        w10.size();
        int size2 = w10.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            int i13 = i10 + 1;
            if (i10 >= 0) {
                String str4 = (String) obj3;
                if ((i10 == 0 || i10 == size2) && f.u(str4)) {
                    str2 = null;
                } else {
                    str4.getClass();
                    if (i >= 0) {
                        int length3 = str4.length();
                        if (i <= length3) {
                            length3 = i;
                        }
                        str2 = str4.substring(length3);
                    } else {
                        x.j(g3.a.i("Requested character count ", i, " is less than zero."));
                        return null;
                    }
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                i10 = i13;
            } else {
                qe.m.l();
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder(length2);
        qe.l.A(arrayList3, sb2, null, 124);
        return sb2.toString();
    }

    public static String d(String str) {
        if (!f.u("|")) {
            List w10 = f.w(str);
            int length = str.length();
            w10.size();
            int size = w10.size() - 1;
            ArrayList arrayList = new ArrayList();
            Iterator it = w10.iterator();
            int i = 0;
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i10 = i + 1;
                    if (i >= 0) {
                        String str3 = (String) next;
                        if ((i != 0 && i != size) || !f.u(str3)) {
                            int length2 = str3.length();
                            int i11 = 0;
                            while (true) {
                                if (i11 < length2) {
                                    if (!x0.c(str3.charAt(i11))) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = -1;
                                    break;
                                }
                            }
                            if (i11 != -1 && str3.startsWith("|", i11)) {
                                str2 = str3.substring("|".length() + i11);
                            }
                            if (str2 == null) {
                                str2 = str3;
                            }
                        }
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                        i = i10;
                    } else {
                        qe.m.l();
                        throw null;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(length);
                    qe.l.A(arrayList, sb2, null, 124);
                    return sb2.toString();
                }
            }
        } else {
            x.n("marginPrefix must be non-blank string.");
            return null;
        }
    }
}
