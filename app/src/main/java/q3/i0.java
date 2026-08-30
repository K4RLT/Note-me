package q3;
import c.b;
import q0.c;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class i0 extends h0 {

    /* renamed from: n, reason: collision with root package name */
    public j3.c f23408n;

    public i0(q0 q0Var, i0 i0Var) {
        super(q0Var, i0Var);
        this.f23408n = null;
        this.f23408n = i0Var.f23408n;
    }

    @Override // q3.n0
    public q0 b() {
        return c(this.f23400c.consumeStableInsets(), null);
    }

    @Override // q3.n0
    public q0 c() {
        return c(this.f23400c.consumeSystemWindowInsets(), null);
    }

    @Override // q3.n0
    public final j3.c j() {
        if (this.f23408n == null) {
            WindowInsets windowInsets = this.f23400c;
            this.f23408n = j3.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f23408n;
    }

    @Override // q3.n0
    public boolean o() {
        return this.f23400c.isConsumed();
    }

    @Override // q3.n0
    public void u(j3.c cVar) {
        this.f23408n = cVar;
    }

    public i0(q0 q0Var, WindowInsets windowInsets) {
        super(q0Var, windowInsets);
        this.f23408n = null;
    }
}
