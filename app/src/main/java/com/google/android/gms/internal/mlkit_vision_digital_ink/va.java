package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;
import p.a;
import w7.i1;

import com.google.android.gms.internal.ads.y81;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class va implements ya {

    /* renamed from: v, reason: collision with root package name */
    public static final va f15125v = new va(null);

    /* renamed from: w, reason: collision with root package name */
    public static final y81 f15126w = new y81(va.class, 1);

    /* renamed from: u, reason: collision with root package name */
    public final Object f15127u;

    public va(Object obj) {
        this.f15127u = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ya
    public final void g(Runnable runnable, Executor executor) {
        if (executor != null) {
            try {
                executor.execute(runnable);
                return;
            } catch (Exception e) {
                f15126w.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", a.l("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
                return;
            }
        }
        q.h("Executor was null.");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f15127u;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return i1.d(super.toString(), "[status=SUCCESS, result=[", String.valueOf(this.f15127u), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f15127u;
    }
}
