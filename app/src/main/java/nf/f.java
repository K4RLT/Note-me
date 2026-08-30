package nf;
import f.e;

import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.mu;
import df.l;
import java.util.concurrent.TimeUnit;
import wa.b9;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f21346a = {1, 10, 100, AdError.NETWORK_ERROR_CODE, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f21347b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f21348c = {3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f21349d = {1, 2, 4, 5, 7, 8};

    public static final long a(long j10, long j11) {
        if (j10 != 4611686018427387903L && j10 != -4611686018427387903L) {
            if (j11 != 4611686018427387903L && j11 != -4611686018427387903L) {
                return b9.f(j10 + j11, -4611686018427387903L, 4611686018427387903L);
            }
            return j11;
        }
        if (-4611686018427387903L < j11 && j11 < 4611686018427387903L) {
            return j10;
        }
        if ((j11 ^ j10) >= 0) {
            return j10;
        }
        return 9223372036854759646L;
    }

    public static final long b(long j10, d dVar) {
        long j11;
        int ordinal = dVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal == 6) {
                            j11 = 86400000;
                        } else {
                            l4.a.n(dVar, "Wrong unit for millisMultiplier: ");
                            return 0L;
                        }
                    } else {
                        j11 = 3600000;
                    }
                } else {
                    j11 = 60000;
                }
            } else {
                j11 = 1000;
            }
        } else {
            j11 = 1;
        }
        if (j10 == 0) {
            return 0L;
        }
        if (j10 == 1) {
            if (j11 <= 4611686018427387903L) {
                return j11;
            }
        } else if (j11 == 1) {
            if (j10 <= 4611686018427387903L) {
                return j10;
            }
        } else {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j10)) - Long.numberOfLeadingZeros(j11);
            if (numberOfLeadingZeros < 63) {
                return j10 * j11;
            }
            if (numberOfLeadingZeros <= 63) {
                long j12 = j10 * j11;
                if (j12 <= 4611686018427387903L) {
                    return j12;
                }
            }
        }
        return 4611686018427387903L;
    }

    public static final long c(long j10) {
        long j11 = (j10 << 1) + 1;
        b.f21330v.getClass();
        int i = c.f21335a;
        return j11;
    }

    public static final void d(StringBuilder sb2, StringBuilder sb3, int i) {
        if (i < 10) {
            sb2.append('0');
        }
        sb3.append(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bc, code lost:
    
        if (r8 == r24.length()) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c4, code lost:
    
        if (r24.charAt(r8) != 'S') goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c6, code lost:
    
        r2 = (1000000000 * r13) + r14;
        r13 = r10;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d7, code lost:
    
        switch(r4.ordinal()) {
            case 0: goto L132;
            case 1: goto L131;
            case 2: goto L130;
            case 3: goto L129;
            case 4: goto L128;
            case 5: goto L127;
            case 6: goto L126;
            default: goto L125;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01da, code lost:
    
        l4.a.n(r4, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0211, code lost:
    
        r13 = r2 * r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e2, code lost:
    
        r20 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020b, code lost:
    
        r2 = ff.a.c(r2 * r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e8, code lost:
    
        r20 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ee, code lost:
    
        r20 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f4, code lost:
    
        r20 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01fa, code lost:
    
        r20 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0200, code lost:
    
        r20 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0206, code lost:
    
        r20 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00f1, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        if (r8 >= r24.length()) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        r4 = r24.charAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        if ('0' > r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        if (r4 >= ':') goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (r8 == r24.length()) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        if (r3 == '+') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
    
        if (r3 == '-') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ef, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f5, code lost:
    
        if (r8 == (r21 + r3)) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f7, code lost:
    
        r6 = r7.f21350a;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a A[LOOP:5: B:75:0x0158->B:76:0x015a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197 A[LOOP:7: B:87:0x0195->B:88:0x0197, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long e(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.e(java.lang.String):long");
    }

    public static final mu f(String str, String str2, int i, l lVar) {
        char charAt = str.charAt(i);
        if (((Boolean) lVar.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return g(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i);
    }

    public static final mu g(String str, String str2) {
        return new mu(str2 + " when parsing an Instant from \"" + k(64, str) + '\"', 18, str);
    }

    public static final int h(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    public static final long i(int i, d dVar) {
        if (dVar.compareTo(d.SECONDS) <= 0) {
            long convert = TimeUnit.NANOSECONDS.convert(i, dVar.f21341u);
            a aVar = b.f21330v;
            long j10 = convert << 1;
            int i10 = c.f21335a;
            return j10;
        }
        return j(i, dVar);
    }

    public static final long j(long j10, d dVar) {
        TimeUnit timeUnit = dVar.f21341u;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j10 && j10 <= convert) {
            long convert2 = timeUnit2.convert(j10, timeUnit);
            a aVar = b.f21330v;
            long j11 = convert2 << 1;
            int i = c.f21335a;
            return j11;
        }
        if (dVar.compareTo(d.MILLISECONDS) >= 0) {
            long signum = Long.signum(j10);
            if (j10 < -9223372036854775807L) {
                j10 = -9223372036854775807L;
            }
            return c(b(Math.abs(j10), dVar) * signum);
        }
        return c(b9.f(TimeUnit.MILLISECONDS.convert(j10, timeUnit), -4611686018427387903L, 4611686018427387903L));
    }

    public static final String k(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }
}
