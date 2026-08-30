package ya;

import android.view.View;
import android.view.ViewParent;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public abstract class jc {
    public static final ViewParent a(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }
}
