package ya;
import m2.g0;
import m2.p0;

/* loaded from: classes.dex */
public abstract class db {
    public static final long a(long j10, long j11) {
        boolean z3;
        boolean z9;
        int c10;
        boolean z10;
        boolean z11;
        boolean z12;
        int e = p0.e(j10);
        int d2 = p0.d(j10);
        boolean z13 = false;
        if (p0.e(j11) < p0.d(j10)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (p0.e(j10) < p0.d(j11)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z3 & z9) {
            if (p0.e(j11) <= p0.e(j10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (p0.d(j10) <= p0.d(j11)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 & z11) {
                e = p0.e(j11);
                d2 = e;
            } else {
                if (p0.e(j10) <= p0.e(j11)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (p0.d(j11) <= p0.d(j10)) {
                    z13 = true;
                }
                if (z12 & z13) {
                    c10 = p0.c(j11);
                } else {
                    int e8 = p0.e(j11);
                    if (e < p0.d(j11) && e8 <= e) {
                        e = p0.e(j11);
                        c10 = p0.c(j11);
                    } else {
                        d2 = p0.e(j11);
                    }
                }
                d2 -= c10;
            }
        } else if (d2 > p0.e(j11)) {
            e -= p0.c(j11);
            c10 = p0.c(j11);
            d2 -= c10;
        }
        return g0.b(e, d2);
    }
}
