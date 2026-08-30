package wa;
import g0.a1;
import y2.a;

import ya.qd;

/* loaded from: classes.dex */
public abstract class l8 {
    public static final long a(long j10, boolean z3, int i, float f10) {
        int h3;
        if ((z3 || i == 2 || i == 4 || i == 5) && a.d(j10)) {
            h3 = a.h(j10);
        } else {
            h3 = Integer.MAX_VALUE;
        }
        if (a.j(j10) != h3) {
            h3 = b9.e(a1.q(f10), a.j(j10), h3);
        }
        return qd.b(0, h3, 0, a.g(j10));
    }
}
