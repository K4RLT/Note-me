package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class z3 extends wa.g0 {
    @Override // wa.g0
    public final void a(a4 a4Var, a4 a4Var2) {
        a4Var.f15380b = a4Var2;
    }

    @Override // wa.g0
    public final void b(a4 a4Var, Thread thread) {
        a4Var.f15379a = thread;
    }

    @Override // wa.g0
    public final boolean c(b4 b4Var, g2 g2Var, g2 g2Var2) {
        synchronized (b4Var) {
            try {
                if (b4Var.f15388v == g2Var) {
                    b4Var.f15388v = g2Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // wa.g0
    public final boolean d(b4 b4Var, Object obj, Object obj2) {
        synchronized (b4Var) {
            try {
                if (b4Var.f15387u == obj) {
                    b4Var.f15387u = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // wa.g0
    public final boolean e(b4 b4Var, a4 a4Var, a4 a4Var2) {
        synchronized (b4Var) {
            try {
                if (b4Var.f15389w == a4Var) {
                    b4Var.f15389w = a4Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
