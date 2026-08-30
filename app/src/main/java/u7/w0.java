package u7;

import com.daren.scraply.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f26984a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f26985b;

    static {
        v0 v0Var = new v0("none", R.string.mat_none, null, null, 28);
        f26984a = v0Var;
        f26985b = qe.m.h(v0Var, new v0("leather", R.string.mat_leather, "leather_color.jpg", "leather_normal.jpg", 16), new v0("paper", R.string.mat_paper, null, null, 12), new v0("alfombra", R.string.mat_carpet, "carpet_color.jpg", "carpet_normal.jpg", 16), new v0("fabric", R.string.mat_fabric, "fabric_color.jpg", "fabric_normal.jpg", 16), new v0("leather35", R.string.mat_leather_quilted, "leather35_color.jpg", "leather35_normal.jpg", 16), new v0("mimbre", R.string.mat_wicker, "wicker_color.jpg", "wicker_normal.jpg", 16), new v0("tela64", R.string.mat_panama, "fabric64_color.jpg", "fabric64_normal.jpg", 16), new v0("tela83", R.string.mat_checked, "fabric83_color.jpg", "fabric83_normal.jpg", 16));
    }

    public static v0 a(String str) {
        Object obj;
        Iterator it = f26985b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((v0) obj).f26938a.equals(str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var == null) {
            return f26984a;
        }
        return v0Var;
    }
}
