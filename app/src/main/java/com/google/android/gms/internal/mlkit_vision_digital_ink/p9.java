package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class p9 extends tl {
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final k9 b(n9 n9Var) {
        k9 k9Var;
        k9 k9Var2 = k9.f14560d;
        synchronized (n9Var) {
            try {
                k9Var = n9Var.f14969v;
                if (k9Var != k9Var2) {
                    n9Var.f14969v = k9Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k9Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final r9 k(n9 n9Var) {
        r9 r9Var;
        r9 r9Var2 = r9.f14894c;
        synchronized (n9Var) {
            try {
                r9Var = n9Var.f14970w;
                if (r9Var != r9Var2) {
                    n9Var.f14970w = r9Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r9Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final void r(r9 r9Var, r9 r9Var2) {
        r9Var.f14896b = r9Var2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final void u(r9 r9Var, Thread thread) {
        r9Var.f14895a = thread;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean w(n9 n9Var, k9 k9Var, k9 k9Var2) {
        synchronized (n9Var) {
            try {
                if (n9Var.f14969v == k9Var) {
                    n9Var.f14969v = k9Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean y(s9 s9Var, Object obj, Object obj2) {
        synchronized (s9Var) {
            try {
                if (s9Var.f14968u == obj) {
                    s9Var.f14968u = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean z(s9 s9Var, r9 r9Var, r9 r9Var2) {
        synchronized (s9Var) {
            try {
                if (s9Var.f14970w == r9Var) {
                    s9Var.f14970w = r9Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
