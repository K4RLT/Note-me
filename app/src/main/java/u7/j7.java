package u7;

import com.daren.scraply.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j7 {

    /* renamed from: a, reason: collision with root package name */
    public static final i7 f26385a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f26386b;

    static {
        i7 i7Var = new i7("plain", R.string.paper_plain, null, null, 124);
        f26385a = i7Var;
        f26386b = qe.m.h(i7Var, new i7("ruled", R.string.paper_ruled, null, qe.m.g(new d7(8.0f, 0, 0.0f, 0.0f, 62)), 116), new i7("ruled_narrow", R.string.paper_ruled_narrow, null, qe.m.g(new d7(6.0f, 0, 0.0f, 0.0f, 62)), 116), new i7("ruled_margin", R.string.paper_ruled_margin, null, qe.m.h(new d7(8.0f, 0, 0.0f, 0.0f, 62), new e7(22.0f)), 116), new i7("grid", R.string.paper_grid, null, qe.m.h(new d7(5.0f, 859790988, 0.0f, 0.0f, 60), new b7(859790988, 5.0f, 0.0f, 12)), 116), new i7("grid_fine", R.string.paper_grid_fine, null, qe.m.h(new d7(3.5f, 776624750, 0.0f, 0.0f, 60), new b7(776624750, 3.5f, 0.0f, 12)), 116), new i7("graph", R.string.paper_graph, null, qe.m.h(new d7(2.0f, 776624750, 0.12f, 0.0f, 56), new b7(776624750, 2.0f, 0.12f, 8), new d7(10.0f, 1430936174, 0.2f, 0.0f, 56), new b7(1430936174, 10.0f, 0.2f, 8)), 116), new i7("dots", R.string.paper_dots, null, qe.m.g(new c7(6, 5.0f)), 116), new i7("dots_wide", R.string.paper_dots_wide, null, qe.m.g(new c7(2, 8.0f)), 116), new i7("cornell", R.string.paper_cornell, null, qe.m.h(new g7(12, 22.0f), new e7(1073741824, 45.0f, 0.25f), new g7(4, 32.0f), new d7(8.0f, 859790988, 0.0f, 16.0f, 52)), 116), new i7("staff", R.string.paper_staff, null, qe.m.g(new d7(2.2f, 1998595112, 0.18f, 0.0f, 8)), 116), new i7("legal", R.string.paper_legal, -330816, qe.m.h(new d7(7.0f, 0, 0.0f, 0.0f, 62), new e7(20.0f)), 112), new i7("kraft", R.string.paper_kraft, -3692161, null, 120), new i7("midnight", R.string.paper_midnight, -14934234, qe.m.g(new c7(872415231, 5.0f, 0.6f)), 112), new i7("blueprint", R.string.paper_blueprint, -14992529, qe.m.h(new d7(4.0f, 654311423, 0.12f, 0.0f, 56), new b7(654311423, 4.0f, 0.12f, 8), new a7(1090519039, 0.4f)), 112), new i7("vintage", R.string.paper_vintage, -924471, qe.m.h(new a7(980113462, 0.5f), new a7(711678006, 0.25f, 2.5f)), 112), new i7("hearts", R.string.paper_hearts, null, qe.m.g(new f7(21.0f, 5.2f, null, 28)), 116), new i7("hearts_fine", R.string.paper_hearts_fine, null, qe.m.g(new f7(12.0f, 2.6f, null, 20)), 116), new i7("kisses", R.string.paper_kisses, null, qe.m.g(new f7(24.0f, 5.5f, w6.KISS, 24)), 116), new i7("love_letter", R.string.paper_love_letter, -134420, qe.m.h(new d7(8.5f, 868509310, 0.15f, 12.0f, 48), new a7(1438934654, 0.4f, 1.5f)), 112), new i7("blush", R.string.paper_blush, -400413, null, 120));
    }

    public static i7 a(String str) {
        Object obj;
        Iterator it = f26386b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((i7) obj).f26339a.equals(str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        i7 i7Var = (i7) obj;
        if (i7Var == null) {
            return f26385a;
        }
        return i7Var;
    }
}
