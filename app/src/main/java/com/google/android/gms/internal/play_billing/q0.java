package com.google.android.gms.internal.play_billing;
import i1.d;
import p.a;
import q.h;

import com.google.android.gms.internal.ads.y81;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class q0 implements r0 {

    /* renamed from: v, reason: collision with root package name */
    public static final y81 f15513v = new y81(q0.class, 2);

    /* renamed from: u, reason: collision with root package name */
    public final Object f15514u;

    public q0(Object obj) {
        this.f15514u = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f15514u;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.r0
    public final void k(Runnable runnable, Executor executor) {
        if (executor != null) {
            try {
                executor.execute(runnable);
                return;
            } catch (Exception e) {
                f15513v.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", a.l("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
                return;
            }
        }
        g5.h("Executor was null.");
    }

    public final String toString() {
        return w7.d(super.toString(), "[status=SUCCESS, result=[", this.f15514u.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f15514u;
    }
}
