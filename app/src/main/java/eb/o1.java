package eb;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f16283c = new o1(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f16284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16285b;

    public o1(Boolean bool, Boolean bool2, int i) {
        m1 m1Var;
        EnumMap enumMap = new EnumMap(n1.class);
        this.f16284a = enumMap;
        m1 m1Var2 = m1.DENIED;
        m1 m1Var3 = m1.GRANTED;
        m1 m1Var4 = m1.UNINITIALIZED;
        if (bool == null) {
            m1Var = m1Var4;
        } else if (bool.booleanValue()) {
            m1Var = m1Var3;
        } else {
            m1Var = m1Var2;
        }
        enumMap.put((EnumMap) n1.AD_STORAGE, (n1) m1Var);
        if (bool2 == null) {
            m1Var2 = m1Var4;
        } else if (bool2.booleanValue()) {
            m1Var2 = m1Var3;
        }
        enumMap.put((EnumMap) n1.ANALYTICS_STORAGE, (n1) m1Var2);
        this.f16285b = i;
    }

    public static char a(m1 m1Var) {
        if (m1Var != null) {
            int ordinal = m1Var.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return '1';
                    }
                    return '-';
                }
                return '0';
            }
            return '+';
        }
        return '-';
    }

    public static m1 b(char c10) {
        if (c10 != '+') {
            if (c10 != '0') {
                if (c10 != '1') {
                    return m1.UNINITIALIZED;
                }
                return m1.GRANTED;
            }
            return m1.DENIED;
        }
        return m1.POLICY;
    }

    public static m1 c(String str) {
        m1 m1Var = m1.UNINITIALIZED;
        if (str == null) {
            return m1Var;
        }
        if (str.equals("granted")) {
            return m1.GRANTED;
        }
        if (str.equals("denied")) {
            return m1.DENIED;
        }
        return m1Var;
    }

    public static o1 d(int i, Bundle bundle) {
        if (bundle == null) {
            return new o1(null, null, i);
        }
        EnumMap enumMap = new EnumMap(n1.class);
        for (n1 n1Var : p1.STORAGE.f16312u) {
            enumMap.put((EnumMap) n1Var, (n1) c(bundle.getString(n1Var.f16278u)));
        }
        return new o1(enumMap, i);
    }

    public static o1 e(int i, String str) {
        EnumMap enumMap = new EnumMap(n1.class);
        if (str == null) {
            str = "";
        }
        n1[] n1VarArr = p1.STORAGE.f16312u;
        for (int i10 = 0; i10 < n1VarArr.length; i10++) {
            n1 n1Var = n1VarArr[i10];
            int i11 = i10 + 2;
            if (i11 < str.length()) {
                enumMap.put((EnumMap) n1Var, (n1) b(str.charAt(i11)));
            } else {
                enumMap.put((EnumMap) n1Var, (n1) m1.UNINITIALIZED);
            }
        }
        return new o1(enumMap, i);
    }

    public static String g(int i) {
        if (i != -30) {
            if (i != -20) {
                if (i != -10) {
                    if (i != 0) {
                        if (i != 30) {
                            if (i != 90) {
                                if (i != 100) {
                                    return "OTHER";
                                }
                                return "UNKNOWN";
                            }
                            return "REMOTE_CONFIG";
                        }
                        return "1P_INIT";
                    }
                    return "1P_API";
                }
                return "MANIFEST";
            }
            return "API";
        }
        return "TCF";
    }

    public static boolean h(int i, int i10) {
        if (i != -20 || i10 != -30) {
            if ((i == -30 && i10 == -20) || i == i10 || i < i10) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            n1[] n1VarArr = p1.STORAGE.f16312u;
            int length = n1VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    n1 n1Var = n1VarArr[i];
                    if (this.f16284a.get(n1Var) != o1Var.f16284a.get(n1Var)) {
                        break;
                    }
                    i++;
                } else if (this.f16285b == o1Var.f16285b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final eb.o1 f(eb.o1 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<eb.n1> r1 = eb.n1.class
            r0.<init>(r1)
            eb.p1 r1 = eb.p1.STORAGE
            eb.n1[] r1 = r1.f16312u
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f16284a
            java.lang.Object r5 = r5.get(r4)
            eb.m1 r5 = (eb.m1) r5
            java.util.EnumMap r6 = r9.f16284a
            java.lang.Object r6 = r6.get(r4)
            eb.m1 r6 = (eb.m1) r6
            if (r5 != 0) goto L24
            goto L33
        L24:
            if (r6 != 0) goto L27
            goto L43
        L27:
            eb.m1 r7 = eb.m1.UNINITIALIZED
            if (r5 != r7) goto L2c
            goto L33
        L2c:
            if (r6 != r7) goto L2f
            goto L43
        L2f:
            eb.m1 r7 = eb.m1.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L43
        L35:
            if (r6 != r7) goto L38
            goto L43
        L38:
            eb.m1 r7 = eb.m1.DENIED
            if (r5 == r7) goto L42
            if (r6 != r7) goto L3f
            goto L42
        L3f:
            eb.m1 r5 = eb.m1.GRANTED
            goto L43
        L42:
            r5 = r7
        L43:
            if (r5 == 0) goto L48
            r0.put(r4, r5)
        L48:
            int r3 = r3 + 1
            goto Ld
        L4b:
            eb.o1 r9 = new eb.o1
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.o1.f(eb.o1):eb.o1");
    }

    public final int hashCode() {
        int i = this.f16285b * 17;
        Iterator it = this.f16284a.values().iterator();
        while (it.hasNext()) {
            i = (i * 31) + ((m1) it.next()).hashCode();
        }
        return i;
    }

    public final boolean i(n1 n1Var) {
        if (((m1) this.f16284a.get(n1Var)) == m1.DENIED) {
            return false;
        }
        return true;
    }

    public final o1 j(o1 o1Var) {
        EnumMap enumMap = new EnumMap(n1.class);
        for (n1 n1Var : p1.STORAGE.f16312u) {
            m1 m1Var = (m1) this.f16284a.get(n1Var);
            if (m1Var == m1.UNINITIALIZED) {
                m1Var = (m1) o1Var.f16284a.get(n1Var);
            }
            if (m1Var != null) {
                enumMap.put((EnumMap) n1Var, (n1) m1Var);
            }
        }
        return new o1(enumMap, this.f16285b);
    }

    public final boolean k(o1 o1Var, n1... n1VarArr) {
        for (n1 n1Var : n1VarArr) {
            m1 m1Var = (m1) this.f16284a.get(n1Var);
            m1 m1Var2 = (m1) o1Var.f16284a.get(n1Var);
            m1 m1Var3 = m1.DENIED;
            if (m1Var == m1Var3 && m1Var2 != m1Var3) {
                return true;
            }
        }
        return false;
    }

    public final Boolean l() {
        m1 m1Var = (m1) this.f16284a.get(n1.AD_STORAGE);
        if (m1Var != null) {
            int ordinal = m1Var.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                } else {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
        return null;
    }

    public final Boolean m() {
        m1 m1Var = (m1) this.f16284a.get(n1.ANALYTICS_STORAGE);
        if (m1Var != null) {
            int ordinal = m1Var.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                } else {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
        return null;
    }

    public final String n() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (n1 n1Var : p1.STORAGE.f16312u) {
            m1 m1Var = (m1) this.f16284a.get(n1Var);
            char c10 = '-';
            if (m1Var != null && (ordinal = m1Var.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        c10 = '0';
                    }
                }
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String o() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (n1 n1Var : p1.STORAGE.f16312u) {
            sb2.append(a((m1) this.f16284a.get(n1Var)));
        }
        return sb2.toString();
    }

    public final boolean p() {
        return i(n1.ANALYTICS_STORAGE);
    }

    public final boolean q() {
        Iterator it = this.f16284a.values().iterator();
        while (it.hasNext()) {
            if (((m1) it.next()) != m1.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(g(this.f16285b));
        for (n1 n1Var : p1.STORAGE.f16312u) {
            sb2.append(",");
            sb2.append(n1Var.f16278u);
            sb2.append("=");
            m1 m1Var = (m1) this.f16284a.get(n1Var);
            if (m1Var == null) {
                m1Var = m1.UNINITIALIZED;
            }
            sb2.append(m1Var);
        }
        return sb2.toString();
    }

    public o1(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(n1.class);
        this.f16284a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f16285b = i;
    }
}
