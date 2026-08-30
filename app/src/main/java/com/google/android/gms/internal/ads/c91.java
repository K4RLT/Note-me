package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c91 extends wx implements ScheduledExecutorService {

    /* renamed from: w, reason: collision with root package name */
    public final ScheduledExecutorService f5051w;

    public c91(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.f5051w = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        h91 h91Var = new h91(Executors.callable(runnable, null));
        return new a91(h91Var, this.f5051w.schedule(h91Var, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        b91 b91Var = new b91(runnable);
        return new a91(b91Var, this.f5051w.scheduleAtFixedRate(b91Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        b91 b91Var = new b91(runnable);
        return new a91(b91Var, this.f5051w.scheduleWithFixedDelay(b91Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        h91 h91Var = new h91(callable);
        return new a91(h91Var, this.f5051w.schedule(h91Var, j10, timeUnit));
    }
}
