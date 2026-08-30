package q3;
import c.c;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class k0 extends j0 {

    /* renamed from: o, reason: collision with root package name */
    public j3.c f23409o;

    /* renamed from: p, reason: collision with root package name */
    public j3.c f23410p;

    /* renamed from: q, reason: collision with root package name */
    public j3.c f23411q;

    public k0(q0 q0Var, WindowInsets windowInsets) {
        super(q0Var, windowInsets);
        this.f23409o = null;
        this.f23410p = null;
        this.f23411q = null;
    }

    @Override // q3.n0
    public j3.c i() {
        Insets mandatorySystemGestureInsets;
        if (this.f23410p == null) {
            mandatorySystemGestureInsets = this.f23400c.getMandatorySystemGestureInsets();
            this.f23410p = j3.c(mandatorySystemGestureInsets);
        }
        return this.f23410p;
    }

    @Override // q3.n0
    public j3.c k() {
        Insets systemGestureInsets;
        if (this.f23409o == null) {
            systemGestureInsets = this.f23400c.getSystemGestureInsets();
            this.f23409o = j3.c(systemGestureInsets);
        }
        return this.f23409o;
    }

    @Override // q3.n0
    public j3.c m() {
        Insets tappableElementInsets;
        if (this.f23411q == null) {
            tappableElementInsets = this.f23400c.getTappableElementInsets();
            this.f23411q = j3.c(tappableElementInsets);
        }
        return this.f23411q;
    }

    @Override // q3.h0, q3.n0
    public q0 n(int i, int i10, int i11, int i12) {
        WindowInsets inset;
        inset = this.f23400c.inset(i, i10, i11, i12);
        return c(inset, null);
    }

    public k0(q0 q0Var, k0 k0Var) {
        super(q0Var, k0Var);
        this.f23409o = null;
        this.f23410p = null;
        this.f23411q = null;
    }

    @Override // q3.i0, q3.n0
    public void u(j3.c cVar) {
    }
}
