package q3;
import c.c;
import o0.a;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class l0 extends k0 {

    /* renamed from: r, reason: collision with root package name */
    public static final q0 f23412r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f23412r = c(windowInsets, null);
    }

    public l0(q0 q0Var, WindowInsets windowInsets) {
        super(q0Var, windowInsets);
    }

    @Override // q3.h0, q3.n0
    public j3.c g(int i) {
        Insets insets;
        insets = this.f23400c.getInsets(a(i));
        return j3.c(insets);
    }

    @Override // q3.h0, q3.n0
    public j3.c h(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f23400c.getInsetsIgnoringVisibility(a(i));
        return j3.c(insetsIgnoringVisibility);
    }

    @Override // q3.h0, q3.n0
    public boolean q(int i) {
        boolean isVisible;
        isVisible = this.f23400c.isVisible(a(i));
        return isVisible;
    }

    public l0(q0 q0Var, l0 l0Var) {
        super(q0Var, l0Var);
    }

    @Override // q3.h0, q3.n0
    public final void d(View view) {
    }
}
