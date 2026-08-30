package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class h0 extends wa.e0 {
    @Override // wa.e0
    public final f0 a(t0 t0Var) {
        f0 f0Var;
        f0 f0Var2 = f0.f15416d;
        synchronized (t0Var) {
            try {
                f0Var = t0Var.f15474v;
                if (f0Var != f0Var2) {
                    t0Var.f15474v = f0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f0Var;
    }

    @Override // wa.e0
    public final j0 b(t0 t0Var) {
        j0 j0Var;
        j0 j0Var2 = j0.f15457c;
        synchronized (t0Var) {
            try {
                j0Var = t0Var.f15475w;
                if (j0Var != j0Var2) {
                    t0Var.f15475w = j0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j0Var;
    }

    @Override // wa.e0
    public final void c(j0 j0Var, j0 j0Var2) {
        j0Var.f15459b = j0Var2;
    }

    @Override // wa.e0
    public final void d(j0 j0Var, Thread thread) {
        j0Var.f15458a = thread;
    }

    @Override // wa.e0
    public final boolean e(t0 t0Var, f0 f0Var, f0 f0Var2) {
        synchronized (t0Var) {
            try {
                if (t0Var.f15474v == f0Var) {
                    t0Var.f15474v = f0Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // wa.e0
    public final boolean f(k0 k0Var, Object obj, Object obj2) {
        synchronized (k0Var) {
            try {
                if (k0Var.f15473u == obj) {
                    k0Var.f15473u = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // wa.e0
    public final boolean g(k0 k0Var, j0 j0Var, j0 j0Var2) {
        synchronized (k0Var) {
            try {
                if (k0Var.f15475w == j0Var) {
                    k0Var.f15475w = j0Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
