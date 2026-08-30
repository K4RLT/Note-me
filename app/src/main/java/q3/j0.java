package q3;
import q0.c;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class j0 extends i0 {
    public j0(q0 q0Var, WindowInsets windowInsets) {
        super(q0Var, windowInsets);
    }

    @Override // q3.n0
    public q0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f23400c.consumeDisplayCutout();
        return c(consumeDisplayCutout, null);
    }

    @Override // q3.h0, q3.n0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (Objects.equals(this.f23400c, j0Var.f23400c) && Objects.equals(this.f23403g, j0Var.f23403g) && h0.C(this.f23404h, j0Var.f23404h)) {
            return true;
        }
        return false;
    }

    @Override // q3.n0
    public c f() {
        DisplayCutout displayCutout;
        displayCutout = this.f23400c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new c(displayCutout);
    }

    @Override // q3.n0
    public int hashCode() {
        return this.f23400c.hashCode();
    }

    public j0(q0 q0Var, j0 j0Var) {
        super(q0Var, j0Var);
    }
}
