package q3;
import c.b;
import k.a;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f23422b;

    /* renamed from: a, reason: collision with root package name */
    public final n0 f23423a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f23422b = m0.f23413s;
        } else if (i >= 30) {
            f23422b = l0.f23412r;
        } else {
            f23422b = n0.f23414b;
        }
    }

    public q0(q0 q0Var) {
        if (q0Var != null) {
            n0 n0Var = q0Var.f23423a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 34 && (n0Var instanceof m0)) {
                this.f23423a = new m0(this, (m0) n0Var);
            } else if (i >= 30 && (n0Var instanceof l0)) {
                this.f23423a = new l0(this, (l0) n0Var);
            } else if (i >= 29 && (n0Var instanceof k0)) {
                this.f23423a = new k0(this, (k0) n0Var);
            } else if (i >= 28 && (n0Var instanceof j0)) {
                this.f23423a = new j0(this, (j0) n0Var);
            } else if (n0Var instanceof i0) {
                this.f23423a = new i0(this, (i0) n0Var);
            } else if (n0Var instanceof h0) {
                this.f23423a = new h0(this, (h0) n0Var);
            } else {
                this.f23423a = new n0(this);
            }
            n0Var.e(this);
            return;
        }
        this.f23423a = new n0(this);
    }

    public static j3.c a(j3.c cVar, int i, int i10, int i11, int i12) {
        int max = Math.max(0, cVar.f18874a - i);
        int max2 = Math.max(0, cVar.f18875b - i10);
        int max3 = Math.max(0, cVar.f18876c - i11);
        int max4 = Math.max(0, cVar.f18877d - i12);
        if (max == i && max2 == i10 && max3 == i11 && max4 == i12) {
            return cVar;
        }
        return j3.b(max, max2, max3, max4);
    }

    public static q0 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        q0 q0Var = new q0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            boolean z3 = p.f23420a;
            q0 a10 = a(view);
            n0 n0Var = q0Var.f23423a;
            n0Var.t(a10);
            n0Var.d(view.getRootView());
            n0Var.v(view.getWindowSystemUiVisibility());
        }
        return q0Var;
    }

    public final WindowInsets b() {
        n0 n0Var = this.f23423a;
        if (n0Var instanceof h0) {
            return ((h0) n0Var).f23400c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        return Objects.equals(this.f23423a, ((q0) obj).f23423a);
    }

    public final int hashCode() {
        n0 n0Var = this.f23423a;
        if (n0Var == null) {
            return 0;
        }
        return n0Var.hashCode();
    }

    public q0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f23423a = new m0(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f23423a = new l0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f23423a = new k0(this, windowInsets);
        } else if (i >= 28) {
            this.f23423a = new j0(this, windowInsets);
        } else {
            this.f23423a = new i0(this, windowInsets);
        }
    }
}
