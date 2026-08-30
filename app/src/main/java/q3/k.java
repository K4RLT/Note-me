package q3;
import q0.c;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class k {
    public static q0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        q0 c10 = c(rootWindowInsets, null);
        n0 n0Var = c10.f23423a;
        n0Var.t(c10);
        n0Var.d(view.getRootView());
        return c10;
    }
}
