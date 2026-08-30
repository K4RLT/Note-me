package y2;

/* loaded from: classes.dex */
public abstract class b {
    public static final long a(int i, int i10, int i11, int i12) {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (i10 >= i) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i12 >= i11) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z12 = z3 & z9;
        if (i >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = z12 & z10;
        if (i11 >= 0) {
            z11 = true;
        }
        if (!(z11 & z13)) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i, i10, i11, i12);
    }

    public static /* synthetic */ long b(int i, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(0, i, 0, i10);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        if (i < 262143) {
            return 18;
        }
        return 255;
    }

    public static final long d(long j10, long j11) {
        int i = (int) (j11 >> 32);
        int j12 = a.j(j10);
        int h3 = a.h(j10);
        if (i < j12) {
            i = j12;
        }
        if (i <= h3) {
            h3 = i;
        }
        int i10 = (int) (j11 & 4294967295L);
        int i11 = a.i(j10);
        int g8 = a.g(j10);
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 <= g8) {
            g8 = i10;
        }
        return (h3 << 32) | (g8 & 4294967295L);
    }

    public static final long e(long j10, long j11) {
        int j12 = a.j(j10);
        int h3 = a.h(j10);
        int i = a.i(j10);
        int g8 = a.g(j10);
        int j13 = a.j(j11);
        if (j13 < j12) {
            j13 = j12;
        }
        if (j13 > h3) {
            j13 = h3;
        }
        int h10 = a.h(j11);
        if (h10 >= j12) {
            j12 = h10;
        }
        if (j12 <= h3) {
            h3 = j12;
        }
        int i10 = a.i(j11);
        if (i10 < i) {
            i10 = i;
        }
        if (i10 > g8) {
            i10 = g8;
        }
        int g10 = a.g(j11);
        if (g10 >= i) {
            i = g10;
        }
        if (i <= g8) {
            g8 = i;
        }
        return a(j13, h3, i10, g8);
    }

    public static final int f(int i, long j10) {
        int i10 = a.i(j10);
        int g8 = a.g(j10);
        if (i < i10) {
            i = i10;
        }
        if (i > g8) {
            return g8;
        }
        return i;
    }

    public static final int g(int i, long j10) {
        int j11 = a.j(j10);
        int h3 = a.h(j10);
        if (i < j11) {
            i = j11;
        }
        if (i > h3) {
            return h3;
        }
        return i;
    }

    public static final long h(int i, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (i12 == Integer.MAX_VALUE) {
            i13 = i11;
        } else {
            i13 = i12;
        }
        int c10 = c(i13);
        if (i10 == Integer.MAX_VALUE) {
            i14 = i;
        } else {
            i14 = i10;
        }
        int c11 = c(i14);
        if (c10 + c11 > 31) {
            k(i14, i13);
        }
        int i15 = i10 + 1;
        int i16 = i12 + 1;
        int i17 = c11 - 13;
        return ((i15 & (~(i15 >> 31))) << 33) | ((i17 >> 1) + (i17 & 1)) | (i << 2) | (i11 << (c11 + 2)) | ((i16 & (~(i16 >> 31))) << (c11 + 33));
    }

    public static final long i(long j10, int i, int i10) {
        int j11 = a.j(j10) + i;
        int i11 = 0;
        if (j11 < 0) {
            j11 = 0;
        }
        int h3 = a.h(j10);
        if (h3 != Integer.MAX_VALUE && (h3 = h3 + i) < 0) {
            h3 = 0;
        }
        int i12 = a.i(j10) + i10;
        if (i12 < 0) {
            i12 = 0;
        }
        int g8 = a.g(j10);
        if (g8 == Integer.MAX_VALUE || (g8 = g8 + i10) >= 0) {
            i11 = g8;
        }
        return a(j11, h3, i12, i11);
    }

    public static /* synthetic */ long j(int i, int i10, int i11, long j10) {
        if ((i11 & 1) != 0) {
            i = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return i(j10, i, i10);
    }

    public static final void k(int i, int i10) {
        throw new IllegalArgumentException(g3.a.j("Can't represent a width of ", i, " and height of ", " in Constraints", i10));
    }

    public static final Void l(int i) {
        throw new IllegalArgumentException(g3.a.i("Can't represent a size of ", i, " in Constraints"));
    }
}
