package ya;
import a5.a;
import g5.q;

/* loaded from: classes.dex */
public abstract class oc {
    public static void a(Object[] objArr, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            if (objArr[i10] == null) {
                q.h(a.f(i10, "at index ", new StringBuilder(String.valueOf(i10).length() + 9)));
                return;
            }
        }
    }
}
