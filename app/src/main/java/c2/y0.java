package c2;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y0 extends pf.v {
    public static final pe.n G = new pe.n(o0.A);
    public static final a7.k H = new a7.k(4);
    public boolean C;
    public boolean D;
    public final a1 F;

    /* renamed from: w, reason: collision with root package name */
    public final Choreographer f3723w;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f3724x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f3725y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public final qe.j f3726z = new qe.j();
    public ArrayList A = new ArrayList();
    public ArrayList B = new ArrayList();
    public final x0 E = new x0(this);

    public y0(Choreographer choreographer, Handler handler) {
        this.f3723w = choreographer;
        this.f3724x = handler;
        this.F = new a1(choreographer, this);
    }

    public static final void a0(y0 y0Var) {
        Runnable runnable;
        boolean z3;
        do {
            synchronized (y0Var.f3725y) {
                runnable = (Runnable) y0Var.f3726z.t();
            }
            while (runnable != null) {
                runnable.run();
                synchronized (y0Var.f3725y) {
                    runnable = (Runnable) y0Var.f3726z.t();
                }
            }
            synchronized (y0Var.f3725y) {
                if (y0Var.f3726z.isEmpty()) {
                    z3 = false;
                    y0Var.C = false;
                } else {
                    z3 = true;
                }
            }
        } while (z3);
    }

    @Override // pf.v
    public final void W(te.g gVar, Runnable runnable) {
        synchronized (this.f3725y) {
            this.f3726z.addLast(runnable);
            if (!this.C) {
                this.C = true;
                this.f3724x.post(this.E);
                if (!this.D) {
                    this.D = true;
                    this.f3723w.postFrameCallback(this.E);
                }
            }
        }
    }
}
