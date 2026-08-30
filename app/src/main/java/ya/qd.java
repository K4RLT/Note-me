package ya;
import b.a;
import y2.b;

/* loaded from: classes.dex */
public abstract class qd {
    public static long a(int i, int i10, int i11, int i12) {
        int min;
        int i13;
        int i14 = 262142;
        int min2 = Math.min(i11, 262142);
        int i15 = Integer.MAX_VALUE;
        if (i12 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i12, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i13 = min2;
        } else {
            i13 = min;
        }
        if (i13 >= 8191) {
            if (i13 < 32767) {
                i14 = 65534;
            } else if (i13 < 65535) {
                i14 = 32766;
            } else if (i13 < 262143) {
                i14 = 8190;
            } else {
                b.l(i13);
                a.p();
                return 0L;
            }
        }
        if (i10 != Integer.MAX_VALUE) {
            i15 = Math.min(i14, i10);
        }
        return b.a(Math.min(i14, i), i15, min2, min);
    }

    public static long b(int i, int i10, int i11, int i12) {
        int min;
        int i13;
        int i14 = 262142;
        int min2 = Math.min(i, 262142);
        int i15 = Integer.MAX_VALUE;
        if (i10 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i10, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i13 = min2;
        } else {
            i13 = min;
        }
        if (i13 >= 8191) {
            if (i13 < 32767) {
                i14 = 65534;
            } else if (i13 < 65535) {
                i14 = 32766;
            } else if (i13 < 262143) {
                i14 = 8190;
            } else {
                b.l(i13);
                a.p();
                return 0L;
            }
        }
        if (i12 != Integer.MAX_VALUE) {
            i15 = Math.min(i14, i12);
        }
        return b.a(min2, min, Math.min(i14, i11), i15);
    }
}
