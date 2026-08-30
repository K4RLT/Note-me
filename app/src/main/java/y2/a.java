package y2;
import p.a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f30799a;

    public static long a(long j10, int i, int i10, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i = j(j10);
        }
        if ((i13 & 2) != 0) {
            i10 = h(j10);
        }
        if ((i13 & 4) != 0) {
            i11 = i(j10);
        }
        if ((i13 & 8) != 0) {
            i12 = g(j10);
        }
        if (i10 < i || i12 < i11 || i < 0 || i11 < 0) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.h(i, i10, i11, i12);
    }

    public static final boolean b(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final boolean c(long j10) {
        int i = (int) (3 & j10);
        int i10 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        if ((((int) (j10 >> (i10 + 46))) & ((1 << (18 - i10)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean d(long j10) {
        int i = (int) (3 & j10);
        if ((((int) (j10 >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean e(long j10) {
        int i;
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j10 >> (i11 + 15))) & i12;
        int i14 = ((int) (j10 >> (i11 + 46))) & i12;
        if (i14 == 0) {
            i = Integer.MAX_VALUE;
        } else {
            i = i14 - 1;
        }
        if (i13 == i) {
            return true;
        }
        return false;
    }

    public static final boolean f(long j10) {
        int i;
        int i10 = (int) (3 & j10);
        int i11 = (1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1;
        int i12 = ((int) (j10 >> 2)) & i11;
        int i13 = ((int) (j10 >> 33)) & i11;
        if (i13 == 0) {
            i = Integer.MAX_VALUE;
        } else {
            i = i13 - 1;
        }
        if (i12 == i) {
            return true;
        }
        return false;
    }

    public static final int g(long j10) {
        int i = (int) (3 & j10);
        int i10 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i11 = ((int) (j10 >> (i10 + 46))) & ((1 << (18 - i10)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int h(long j10) {
        int i = (int) (3 & j10);
        int i10 = (int) (j10 >> 33);
        int i11 = i10 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int i(long j10) {
        int i = (int) (3 & j10);
        int i10 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j10 >> (i10 + 15))) & ((1 << (18 - i10)) - 1);
    }

    public static final int j(long j10) {
        int i = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j10) {
        String valueOf;
        int h3 = h(j10);
        String str = "Infinity";
        if (h3 == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(h3);
        }
        int g8 = g(j10);
        if (g8 != Integer.MAX_VALUE) {
            str = String.valueOf(g8);
        }
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(j(j10));
        sb2.append(", maxWidth = ");
        sb2.append(valueOf);
        sb2.append(", minHeight = ");
        sb2.append(i(j10));
        sb2.append(", maxHeight = ");
        return p.a.n(sb2, str, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f30799a != ((a) obj).f30799a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30799a);
    }

    public final String toString() {
        return k(this.f30799a);
    }
}
