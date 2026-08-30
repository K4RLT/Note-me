package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a91 extends xy implements ScheduledFuture, ac.b, Future {
    public final r71 P;
    public final ScheduledFuture Q;

    public a91(r71 r71Var, ScheduledFuture scheduledFuture) {
        super(24);
        this.P = r71Var;
        this.Q = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final /* synthetic */ Object F() {
        return this.P;
    }

    @Override // ac.b
    public final void a(Runnable runnable, Executor executor) {
        this.P.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        boolean cancel = this.P.cancel(z3);
        if (cancel) {
            this.Q.cancel(z3);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.Q.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.P.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.Q.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.P.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.P.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.P.get(j10, timeUnit);
    }
}
