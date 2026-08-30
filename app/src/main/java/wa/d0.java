package wa;
import g3.a;
import g5.q;

/* loaded from: classes.dex */
public abstract class d0 {
    public static void a(Object[] objArr, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            if (objArr[i10] == null) {
                q.h(a.g(i10, "at index "));
                return;
            }
        }
    }
}
