package nf;
import f.a;
import f.c;

import com.facebook.ads.AdError;
import kotlin.jvm.internal.l;
import q.x;
import wa.b9;

/* loaded from: classes.dex */
public final class b implements Comparable {

    /* renamed from: v, reason: collision with root package name */
    public static final a f21330v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static final long f21331w = c(4611686018427387903L);

    /* renamed from: x, reason: collision with root package name */
    public static final long f21332x = c(-4611686018427387903L);

    /* renamed from: y, reason: collision with root package name */
    public static final long f21333y = 9223372036854759646L;

    /* renamed from: u, reason: collision with root package name */
    public final long f21334u;

    public /* synthetic */ b(long j10) {
        this.f21334u = j10;
    }

    public static final long a(long j10, long j11) {
        long j12 = 1000000;
        long j13 = j11 / j12;
        long a10 = a(j10, j13);
        if (-4611686018426L <= a10 && a10 < 4611686018427L) {
            long j14 = ((a10 * j12) + (j11 - (j13 * j12))) << 1;
            int i = c.f21335a;
            return j14;
        }
        return c(a10);
    }

    public static final void b(StringBuilder sb2, int i, int i10, int i11, String str, boolean z3) {
        sb2.append(i);
        if (i10 != 0) {
            sb2.append('.');
            String x9 = mf.f.x(i11, String.valueOf(i10));
            int i12 = -1;
            int length = x9.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (x9.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (!z3 && i14 < 3) {
                sb2.append((CharSequence) x9, 0, i14);
            } else {
                sb2.append((CharSequence) x9, 0, ((i12 + 3) / 3) * 3);
            }
        }
        sb2.append(str);
    }

    public static int c(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i = (((int) j10) & 1) - (((int) j11) & 1);
            if (j10 < 0) {
                return -i;
            }
            return i;
        }
        return l.c(j10, j11);
    }

    public static final int d(long j10) {
        long j11;
        if (e(j10)) {
            return 0;
        }
        if ((((int) j10) & 1) == 1) {
            j11 = ((j10 >> 1) % AdError.NETWORK_ERROR_CODE) * 1000000;
        } else {
            j11 = (j10 >> 1) % 1000000000;
        }
        return (int) j11;
    }

    public static final boolean e(long j10) {
        if (j10 != f21331w && j10 != f21332x) {
            return false;
        }
        return true;
    }

    public static final long f(long j10, long j11) {
        int i = ((int) j10) & 1;
        if (i == (((int) j11) & 1)) {
            if (i == 0) {
                long j12 = (j10 >> 1) + (j11 >> 1);
                if (-4611686018426999999L <= j12 && j12 < 4611686018427000000L) {
                    long j13 = j12 << 1;
                    int i10 = c.f21335a;
                    return j13;
                }
                return c(j12 / 1000000);
            }
            long a10 = a(j10 >> 1, j11 >> 1);
            if (a10 != 9223372036854759646L) {
                if (a10 != 4611686018427387903L && a10 != -4611686018427387903L) {
                    if (-4611686018426L <= a10 && a10 < 4611686018427L) {
                        long j14 = (a10 * 1000000) << 1;
                        int i11 = c.f21335a;
                        return j14;
                    }
                    return c(b9.f(a10, -4611686018427387903L, 4611686018427387903L));
                }
                return c(a10);
            }
            x.n("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (i == 1) {
            return a(j10 >> 1, j11 >> 1);
        }
        return a(j11 >> 1, j10 >> 1);
    }

    public static final long g(long j10, d dVar) {
        d dVar2;
        if (j10 == f21331w) {
            return Long.MAX_VALUE;
        }
        if (j10 == f21332x) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        if ((((int) j10) & 1) == 0) {
            dVar2 = d.NANOSECONDS;
        } else {
            dVar2 = d.MILLISECONDS;
        }
        return dVar.f21341u.convert(j11, dVar2.f21341u);
    }

    public static final long h(long j10) {
        long j11 = ((-(j10 >> 1)) << 1) + (((int) j10) & 1);
        int i = c.f21335a;
        return j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f21334u, ((b) obj).f21334u);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (this.f21334u != ((b) obj).f21334u) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21334u);
    }

    public final String toString() {
        boolean z3;
        int g8;
        long j10;
        int g10;
        int g11;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        long j11 = this.f21334u;
        if (j11 == 0) {
            return "0s";
        }
        if (j11 == f21331w) {
            return "Infinity";
        }
        if (j11 == f21332x) {
            return "-Infinity";
        }
        int i = 0;
        if (j11 < 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z3) {
            sb2.append('-');
        }
        if (j11 < 0) {
            j11 = h(j11);
        }
        long g12 = g(j11, d.DAYS);
        if (e(j11)) {
            g8 = 0;
        } else {
            g8 = (int) (g(j11, d.HOURS) % 24);
        }
        if (e(j11)) {
            j10 = 0;
            g10 = 0;
        } else {
            j10 = 0;
            g10 = (int) (g(j11, d.MINUTES) % 60);
        }
        if (e(j11)) {
            g11 = 0;
        } else {
            g11 = (int) (g(j11, d.SECONDS) % 60);
        }
        int d2 = d(j11);
        if (g12 != j10) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (g8 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g11 == 0 && d2 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z9) {
            sb2.append(g12);
            sb2.append('d');
            i = 1;
        }
        if (z10 || (z9 && (z11 || z12))) {
            int i10 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            sb2.append(g8);
            sb2.append('h');
            i = i10;
        }
        if (z11 || (z12 && (z10 || z9))) {
            int i11 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            sb2.append(g10);
            sb2.append('m');
            i = i11;
        }
        if (z12) {
            int i12 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            if (g11 == 0 && !z9 && !z10 && !z11) {
                if (d2 >= 1000000) {
                    b(sb2, d2 / 1000000, d2 % 1000000, 6, "ms", false);
                } else if (d2 >= 1000) {
                    b(sb2, d2 / AdError.NETWORK_ERROR_CODE, d2 % AdError.NETWORK_ERROR_CODE, 3, "us", false);
                } else {
                    sb2.append(d2);
                    sb2.append("ns");
                }
            } else {
                b(sb2, g11, d2, 9, "s", false);
            }
            i = i12;
        }
        if (z3 && i > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }
}
