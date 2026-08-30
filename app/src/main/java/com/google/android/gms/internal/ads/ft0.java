package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ft0 {

    /* renamed from: a, reason: collision with root package name */
    public final at0 f6160a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f6161b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public volatile ScheduledFuture f6162c;

    /* renamed from: d, reason: collision with root package name */
    public final dt0 f6163d;

    public ft0(at0 at0Var, ScheduledExecutorService scheduledExecutorService, long j10, dt0 dt0Var) {
        this.f6163d = dt0Var;
        this.f6160a = at0Var;
        if (j10 > 0) {
            this.f6162c = scheduledExecutorService.schedule(new r1(9, this, at0Var, dt0Var), j10, TimeUnit.MILLISECONDS);
        }
    }

    public final void a() {
        if (this.f6161b.compareAndSet(false, true)) {
            if (this.f6162c != null) {
                this.f6162c.cancel(false);
            }
            this.f6160a.b(this.f6163d, false);
        }
    }
}
