package q3;
import c.c;
import p0.a;
import q0.c;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class m0 extends l0 {

    /* renamed from: s, reason: collision with root package name */
    public static final q0 f23413s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f23413s = c(windowInsets, null);
    }

    public m0(q0 q0Var, WindowInsets windowInsets) {
        super(q0Var, windowInsets);
    }

    @Override // q3.l0, q3.h0, q3.n0
    public j3.c g(int i) {
        Insets insets;
        insets = this.f23400c.getInsets(a(i));
        return j3.c(insets);
    }

    @Override // q3.l0, q3.h0, q3.n0
    public j3.c h(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f23400c.getInsetsIgnoringVisibility(a(i));
        return j3.c(insetsIgnoringVisibility);
    }

    @Override // q3.l0, q3.h0, q3.n0
    public boolean q(int i) {
        boolean isVisible;
        isVisible = this.f23400c.isVisible(a(i));
        return isVisible;
    }

    public m0(q0 q0Var, m0 m0Var) {
        super(q0Var, m0Var);
    }
}
