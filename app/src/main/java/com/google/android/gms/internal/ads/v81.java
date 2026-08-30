package com.google.android.gms.internal.ads;
import a5.a;
import ac.b;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class v81 implements ac.b {

    /* renamed from: v, reason: collision with root package name */
    public static final v81 f11836v = new v81(null);

    /* renamed from: w, reason: collision with root package name */
    public static final y81 f11837w = new y81(v81.class, 0);

    /* renamed from: u, reason: collision with root package name */
    public final Object f11838u;

    public v81(Object obj) {
        this.f11838u = obj;
    }

    @Override // ac.b
    public final void a(Runnable runnable, Executor executor) {
        b80.M(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger a10 = f11837w.a();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            a10.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", a5.a.l(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f11838u;
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
        String obj = super.toString();
        String valueOf = String.valueOf(this.f11838u);
        return a5.a.l(new StringBuilder(String.valueOf(obj).length() + 25 + valueOf.length() + 2), obj, "[status=SUCCESS, result=[", valueOf, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f11838u;
    }
}
