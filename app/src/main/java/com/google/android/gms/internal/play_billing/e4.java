package com.google.android.gms.internal.play_billing;
import b4.c;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e4 implements r0 {

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f15414u;

    /* renamed from: v, reason: collision with root package name */
    public final d4 f15415v = new d4(this);

    public e4(c4 c4Var) {
        this.f15414u = new WeakReference(c4Var);
    }

    public final void b(Throwable th) {
        u1 u1Var = new u1(th);
        wa.g0 g0Var = b4.f15386z;
        d4 d4Var = this.f15415v;
        if (g0Var.d(d4Var, null, u1Var)) {
            b4.c(d4Var);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        c4 c4Var = (c4) this.f15414u.get();
        boolean cancel = this.f15415v.cancel(z3);
        if (cancel && c4Var != null) {
            c4Var.f15395a = null;
            c4Var.f15396b = null;
            c4Var.f15397c.i(null);
            return true;
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f15415v.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15415v.f15387u instanceof y0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15415v.isDone();
    }

    @Override // com.google.android.gms.internal.play_billing.r0
    public final void k(Runnable runnable, Executor executor) {
        this.f15415v.k(runnable, executor);
    }

    public final String toString() {
        return this.f15415v.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f15415v.get(j10, timeUnit);
    }
}
