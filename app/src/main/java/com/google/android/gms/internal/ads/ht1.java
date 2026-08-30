package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public interface ht1 {
    void a(gt1 gt1Var, r[] rVarArr);

    long b();

    void c(tu1 tu1Var);

    boolean d(gt1 gt1Var);

    void e(tu1 tu1Var);

    default boolean f() {
        x21.F("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    void g(tu1 tu1Var);

    boolean h(gt1 gt1Var);

    w i(tu1 tu1Var);
}
