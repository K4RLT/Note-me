package ya;
import i1.c;
import x.n;
import g3.a;
import q.x;
import w7.i1;

/* loaded from: classes.dex */
public abstract class pa {
    public static void a(int i, int i10, int i11) {
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
