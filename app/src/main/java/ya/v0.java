package ya;
import g5.q;

/* loaded from: classes.dex */
public abstract class v0 {
    public static void a(Object obj) {
        if (obj != null) {
            return;
        }
        q.h("Cannot return null from a non-@Nullable @Provides method");
    }
}
