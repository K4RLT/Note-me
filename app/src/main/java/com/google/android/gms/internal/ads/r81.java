package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r81 extends q81 {
    public final ac.b B;

    public r81(ac.b bVar) {
        bVar.getClass();
        this.B = bVar;
    }

    @Override // com.google.android.gms.internal.ads.r71, ac.b
    public final void a(Runnable runnable, Executor executor) {
        this.B.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.r71, java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.B.cancel(z3);
    }

    @Override // com.google.android.gms.internal.ads.r71, java.util.concurrent.Future
    public final Object get() {
        return this.B.get();
    }

    @Override // com.google.android.gms.internal.ads.r71, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.B.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.r71, java.util.concurrent.Future
    public final boolean isDone() {
        return this.B.isDone();
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final String toString() {
        return this.B.toString();
    }

    @Override // com.google.android.gms.internal.ads.r71, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.B.get(j10, timeUnit);
    }
}
