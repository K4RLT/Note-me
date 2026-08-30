package com.google.android.gms.internal.ads;
import f9.k;

import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class fr0 implements ii {

    /* renamed from: u, reason: collision with root package name */
    public final ScheduledExecutorService f6153u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f6154v;

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f6155w = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public boolean f6156x = false;

    public fr0(ScheduledExecutorService scheduledExecutorService, wx wxVar) {
        this.f6153u = scheduledExecutorService;
        this.f6154v = wxVar;
    }

    public final synchronized void a(Runnable runnable, long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (!this.f6156x) {
                    k.C.f16816g.g(this);
                    this.f6156x = true;
                }
                k.C.f16819k.getClass();
                er0 er0Var = new er0(this, runnable, System.currentTimeMillis() + j10);
                ScheduledFuture<?> schedule = this.f6153u.schedule(new e40(27, er0Var), j10, timeUnit);
                er0Var.f5762c = schedule;
                this.f6155w.put(schedule, er0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ii
    public final void g0(boolean z3) {
        if (z3) {
            this.f6154v.execute(new e40(28, this));
        }
    }
}
