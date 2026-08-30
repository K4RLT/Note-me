package ya;
import i1.c;
import x.l;
import x.n;
import g3.a;
import q.x;
import w7.i1;

/* loaded from: classes.dex */
public abstract class od {
    public static final void a(int i, int i10) {
        if (i >= 0 && i < i10) {
            return;
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
    }

    public static final void b(int i, int i10) {
        if (i >= 0 && i <= i10) {
            return;
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
    }

    public static final void c(int i, int i10, int i11) {
        if (i >= 0 && i10 <= i11) {
            if (i <= i10) {
                return;
            }
            x.n(i1.c("fromIndex: ", i, i10, " > toIndex: "));
            return;
        }
        a.d(i11, a.n("fromIndex: ", i, ", toIndex: ", ", size: ", i10));
    }
}
