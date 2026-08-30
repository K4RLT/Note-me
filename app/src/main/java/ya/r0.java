package ya;
import jc.a;
import m5.e;

import android.view.View;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public abstract class r0 {
    public static final e a(View view) {
        e eVar;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof e) {
                eVar = (e) tag;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                return eVar;
            }
            Object a10 = a(view);
            if (a10 instanceof View) {
                view = (View) a10;
            } else {
                view = null;
            }
        }
        return null;
    }
}
