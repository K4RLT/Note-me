package ya;
import g5.q;
import n0.g;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a1 {
    public static final g a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof g) {
                return (g) childAt;
            }
        }
        g gVar = new g(viewGroup.getContext());
        viewGroup.addView(gVar);
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup b(View view) {
        while (!(view instanceof ViewGroup)) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = parent;
            } else {
                q.j("Couldn't find a valid parent for ", view, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                return null;
            }
        }
        return (ViewGroup) view;
    }
}