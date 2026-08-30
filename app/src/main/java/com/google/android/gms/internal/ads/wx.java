package com.google.android.gms.internal.ads;
import a5.a;
import ac.b;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class wx extends AbstractExecutorService implements AutoCloseable, ExecutorService {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12362u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f12363v;

    public wx(ExecutorService executorService) {
        executorService.getClass();
        this.f12363v = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        switch (this.f12362u) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f12363v).awaitTermination(j10, timeUnit);
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z3 = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z3) {
                    shutdownNow();
                    z3 = true;
                }
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f12362u) {
            case 0:
                this.f12363v.execute(runnable);
                return;
            default:
                ((ExecutorService) this.f12363v).execute(runnable);
                return;
        }
    }

    public final ac.b f(Runnable runnable) {
        return (ac.b) super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f12362u) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f12363v).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f12362u) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f12363v).isTerminated();
        }
    }

    public final ac.b j(Callable callable) {
        return (ac.b) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new h91(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f12362u) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.f12363v).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f12362u) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f12363v).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (ac.b) super.submit(runnable);
    }

    public String toString() {
        switch (this.f12362u) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.f12363v;
                String obj = super.toString();
                String valueOf = String.valueOf(executorService);
                return a5.a.l(new StringBuilder(String.valueOf(obj).length() + 1 + valueOf.length() + 1), obj, "[", valueOf, "]");
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (ac.b) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (ac.b) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new h91(callable);
    }

    public wx(Executor executor) {
        this.f12363v = executor;
    }
}
