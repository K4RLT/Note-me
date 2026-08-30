package ya;
import l.b;
import pe.s;
import pe.u;
import x0.a;

/* loaded from: classes.dex */
public abstract class y0 {
    public static final s a(String str) {
        int i;
        a(10);
        int length = str.length();
        if (length != 0) {
            int i10 = 0;
            char charAt = str.charAt(0);
            if (kotlin.jvm.internal.b(charAt, 48) < 0) {
                i = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            } else {
                i = 0;
            }
            int i11 = 119304647;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0) {
                    int i12 = i10 ^ Integer.MIN_VALUE;
                    if (Integer.compare(i12, i11 ^ Integer.MIN_VALUE) > 0) {
                        if (i11 == 119304647) {
                            i11 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                            if (Integer.compare(i12, i11 ^ Integer.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    int i13 = i10 * 10;
                    int i14 = digit + i13;
                    if (Integer.compare(i14 ^ Integer.MIN_VALUE, i13 ^ Integer.MIN_VALUE) < 0) {
                        return null;
                    }
                    i++;
                    i10 = i14;
                } else {
                    return null;
                }
            }
            return new s(i10);
        }
        return null;
    }

    public static final u b(String str) {
        int i;
        long j10;
        int i10;
        str.getClass();
        int i11 = 10;
        a(10);
        int length = str.length();
        if (length != 0) {
            char charAt = str.charAt(0);
            int i12 = 1;
            if (kotlin.jvm.internal.b(charAt, 48) < 0) {
                if (length != 1 && charAt == '+') {
                    i = 1;
                } else {
                    return null;
                }
            } else {
                i = 0;
            }
            long j11 = 10;
            long j12 = 0;
            long j13 = 512409557603043100L;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), i11);
                if (digit >= 0) {
                    int i13 = length;
                    long j14 = j12 ^ Long.MIN_VALUE;
                    int i14 = i;
                    if (Long.compare(j14, j13 ^ Long.MIN_VALUE) > 0) {
                        if (j13 == 512409557603043100L) {
                            if (j11 < 0) {
                                if (Long.MAX_VALUE < (j11 ^ Long.MIN_VALUE)) {
                                    j10 = j11;
                                    j13 = 0;
                                } else {
                                    j13 = 1;
                                    j10 = j11;
                                }
                            } else {
                                long j15 = (Long.MAX_VALUE / j11) << i12;
                                if ((((-1) - (j15 * j11)) ^ Long.MIN_VALUE) >= (j11 ^ Long.MIN_VALUE)) {
                                    i10 = i12;
                                } else {
                                    i10 = 0;
                                }
                                j10 = j11;
                                j13 = j15 + i10;
                            }
                            if (Long.compare(j14, j13 ^ Long.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    } else {
                        j10 = j11;
                    }
                    long j16 = j12 * j10;
                    long j17 = (digit & 4294967295L) + j16;
                    if (Long.compare(j17 ^ Long.MIN_VALUE, j16 ^ Long.MIN_VALUE) < 0) {
                        return null;
                    }
                    i = i14 + 1;
                    j12 = j17;
                    length = i13;
                    j11 = j10;
                    i11 = 10;
                    i12 = 1;
                } else {
                    return null;
                }
            }
            return new u(j12);
        }
        return null;
    }
}
