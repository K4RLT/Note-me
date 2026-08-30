package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class db extends ab implements ScheduledExecutorService {

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledExecutorService f14190v;

    public db(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f14190v = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ab, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this != ForkJoinPool.commonPool() && !isTerminated()) {
            shutdown();
            boolean z3 = false;
            boolean z9 = false;
            while (!z3) {
                try {
                    z3 = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z9) {
                        shutdownNow();
                    }
                    z9 = true;
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        hb hbVar = new hb(Executors.callable(runnable, null));
        return new bb(hbVar, this.f14190v.schedule(hbVar, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        cb cbVar = new cb(runnable);
        return new bb(cbVar, this.f14190v.scheduleAtFixedRate(cbVar, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        cb cbVar = new cb(runnable);
        return new bb(cbVar, this.f14190v.scheduleWithFixedDelay(cbVar, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        hb hbVar = new hb(callable);
        return new bb(hbVar, this.f14190v.schedule(hbVar, j10, timeUnit));
    }
}
