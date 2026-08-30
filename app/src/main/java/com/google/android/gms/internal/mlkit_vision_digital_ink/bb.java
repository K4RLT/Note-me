package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class bb extends pa implements ScheduledFuture {

    /* renamed from: y, reason: collision with root package name */
    public final ScheduledFuture f14094y;

    public bb(n9 n9Var, ScheduledFuture scheduledFuture) {
        super(n9Var);
        this.f14094y = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.pa, java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        boolean cancel = super.cancel(z3);
        if (cancel) {
            this.f14094y.cancel(z3);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f14094y.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f14094y.getDelay(timeUnit);
    }
}
