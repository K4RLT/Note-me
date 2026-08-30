package mf;
import l.b;

import ya.x0;

/* loaded from: classes.dex */
public abstract class m extends l {
    public static final void g(String str) {
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static String h(int i, String str) {
        str.getClass();
        if (i >= 0) {
            if (i != 0) {
                int i10 = 1;
                if (i != 1) {
                    int length = str.length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb2 = new StringBuilder(str.length() * i);
                            if (1 <= i) {
                                while (true) {
                                    sb2.append((CharSequence) str);
                                    if (i10 == i) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            return sb2.toString();
                        }
                        char charAt = str.charAt(0);
                        char[] cArr = new char[i];
                        for (int i11 = 0; i11 < i; i11++) {
                            cArr[i11] = charAt;
                        }
                        return new String(cArr);
                    }
                    return "";
                }
                return str.toString();
            }
            return "";
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
    }

    public static String i(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int q10 = f.q(str, str2, 0, false);
        if (q10 < 0) {
            return str;
        }
        int length = str2.length();
        int i = 1;
        if (length >= 1) {
            i = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            int i10 = 0;
            do {
                sb2.append((CharSequence) str, i10, q10);
                sb2.append(str3);
                i10 = q10 + length;
                if (q10 >= str.length()) {
                    break;
                }
                q10 = f.q(str, str2, q10 + i, false);
            } while (q10 > 0);
            sb2.append((CharSequence) str, i10, str.length());
            return sb2.toString();
        }
        throw new OutOfMemoryError();
    }

    public static boolean j(String str, String str2) {
        str.getClass();
        return str.startsWith(str2);
    }

    public static Integer k(int i, String str) {
        boolean z3;
        int i10;
        int i11;
        str.getClass();
        x0.a(i);
        int length = str.length();
        if (length != 0) {
            int i12 = 0;
            char charAt = str.charAt(0);
            int i13 = -2147483647;
            if (kotlin.jvm.internal.b(charAt, 48) < 0) {
                i10 = 1;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            i13 = Integer.MIN_VALUE;
                            z3 = true;
                        } else {
                            return null;
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    return null;
                }
            } else {
                z3 = false;
                i10 = 0;
            }
            int i14 = -59652323;
            while (i10 < length) {
                int digit = Character.digit((int) str.charAt(i10), i);
                if (digit >= 0) {
                    if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / i))) || (i11 = i12 * i) < i13 + digit) {
                        return null;
                    }
                    i12 = i11 - digit;
                    i10++;
                } else {
                    return null;
                }
            }
            if (z3) {
                return Integer.valueOf(i12);
            }
            return Integer.valueOf(-i12);
        }
        return null;
    }

    public static Long l(String str) {
        boolean z3;
        str.getClass();
        x0.a(10);
        int length = str.length();
        if (length != 0) {
            int i = 0;
            char charAt = str.charAt(0);
            long j10 = -9223372036854775807L;
            if (kotlin.jvm.internal.b(charAt, 48) < 0) {
                z3 = true;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            j10 = Long.MIN_VALUE;
                            i = 1;
                        } else {
                            return null;
                        }
                    } else {
                        z3 = false;
                        i = 1;
                    }
                } else {
                    return null;
                }
            } else {
                z3 = false;
            }
            long j11 = 0;
            long j12 = -256204778801521550L;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0) {
                    if (j11 < j12) {
                        if (j12 == -256204778801521550L) {
                            j12 = j10 / 10;
                            if (j11 < j12) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    long j13 = j11 * 10;
                    long j14 = digit;
                    if (j13 < j10 + j14) {
                        return null;
                    }
                    j11 = j13 - j14;
                    i++;
                } else {
                    return null;
                }
            }
            if (z3) {
                return Long.valueOf(j11);
            }
            return Long.valueOf(-j11);
        }
        return null;
    }
}
