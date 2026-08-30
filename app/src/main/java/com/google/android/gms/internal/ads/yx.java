package com.google.android.gms.internal.ads;
import ac.b;
import f9.k;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class yx implements ac.b {

    /* renamed from: u, reason: collision with root package name */
    public final d91 f12998u = new Object();

    @Override // ac.b
    public final void a(Runnable runnable, Executor executor) {
        this.f12998u.a(runnable, executor);
    }

    public final boolean b(Object obj) {
        boolean d2 = this.f12998u.d(obj);
        if (!d2) {
            f9.k.C.f16817h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return d2;
    }

    public final void c(Throwable th) {
        if (!this.f12998u.e(th)) {
            f9.k.C.f16817h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        return this.f12998u.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f12998u.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12998u.f13105u instanceof k71;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12998u.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f12998u.get(j10, timeUnit);
    }
}
