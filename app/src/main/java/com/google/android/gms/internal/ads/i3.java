package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public interface i3 {
    default void a(int i, xk0 xk0Var) {
        f(xk0Var, i, 0);
    }

    int b(fs1 fs1Var, int i, boolean z3);

    void c(long j10, int i, int i10, int i11, h3 h3Var);

    default int d(fs1 fs1Var, int i, boolean z3) {
        return b(fs1Var, i, z3);
    }

    void e(mw1 mw1Var);

    void f(xk0 xk0Var, int i, int i10);
}
