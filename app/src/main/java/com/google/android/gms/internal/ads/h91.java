package com.google.android.gms.internal.ads;
import p.a;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
public final class h91 extends p81 implements RunnableFuture {
    public volatile x81 B;

    public h91(Callable callable) {
        this.B = new g91(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final void f() {
        x81 x81Var;
        if (n() && (x81Var = this.B) != null) {
            x81Var.g();
        }
        this.B = null;
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final String h() {
        x81 x81Var = this.B;
        if (x81Var != null) {
            String x81Var2 = x81Var.toString();
            return a.o(new StringBuilder(x81Var2.length() + 7), "task=[", x81Var2, "]");
        }
        return super.h();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        x81 x81Var = this.B;
        if (x81Var != null) {
            x81Var.run();
        }
        this.B = null;
    }
}
