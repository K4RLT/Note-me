package ya;
import c.f;
import c.g;
import f2.c;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class da {
    public static void a(Window window, boolean z3) {
        int i;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            c.g(window, z3);
            return;
        }
        if (i10 >= 30) {
            c.f(window, z3);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z3) {
            i = systemUiVisibility & (-1793);
        } else {
            i = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i);
    }
}
