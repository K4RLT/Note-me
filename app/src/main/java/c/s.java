package c;

import android.os.Build;
import android.view.View;
import android.view.Window;
import q3.r0;
import ya.da;

/* loaded from: classes.dex */
public class s extends wa.g {
    @Override // wa.g
    public void b(k0 k0Var, k0 k0Var2, Window window, View view, boolean z3, boolean z9) {
        int i;
        int i10;
        r0 r0Var;
        k0Var.getClass();
        k0Var2.getClass();
        window.getClass();
        view.getClass();
        da.a(window, false);
        if (z3) {
            i = k0Var.f3249b;
        } else {
            i = k0Var.f3248a;
        }
        window.setStatusBarColor(i);
        if (z9) {
            i10 = k0Var2.f3249b;
        } else {
            i10 = k0Var2.f3248a;
        }
        window.setNavigationBarColor(i10);
        k6.i iVar = new k6.i(view);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            r0Var = new r0(window, iVar, 1);
        } else if (i11 >= 30) {
            r0Var = new r0(window, iVar, 1);
        } else if (i11 >= 26) {
            r0Var = new r0(window, iVar, 0);
        } else {
            r0Var = new r0(window, iVar, 0);
        }
        r0Var.d(!z3);
        r0Var.b(!z9);
    }
}
