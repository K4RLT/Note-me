package com.google.android.gms.internal.ads;
import f9.k;
import la.a;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class z30 implements ii {

    /* renamed from: u, reason: collision with root package name */
    public final ScheduledExecutorService f13056u;

    /* renamed from: v, reason: collision with root package name */
    public final la.a f13057v;

    /* renamed from: w, reason: collision with root package name */
    public ScheduledFuture f13058w;

    /* renamed from: x, reason: collision with root package name */
    public long f13059x = -1;

    /* renamed from: y, reason: collision with root package name */
    public long f13060y = -1;

    /* renamed from: z, reason: collision with root package name */
    public mo0 f13061z = null;
    public boolean A = false;

    public z30(ScheduledExecutorService scheduledExecutorService, la.a aVar) {
        this.f13056u = scheduledExecutorService;
        this.f13057v = aVar;
        f9.k.C.f16816g.g(this);
    }

    @Override // com.google.android.gms.internal.ads.ii
    public final void g0(boolean z3) {
        ScheduledFuture scheduledFuture;
        if (z3) {
            synchronized (this) {
                try {
                    if (this.A) {
                        if (this.f13060y > 0 && (scheduledFuture = this.f13058w) != null && scheduledFuture.isCancelled()) {
                            this.f13058w = this.f13056u.schedule(this.f13061z, this.f13060y, TimeUnit.MILLISECONDS);
                        }
                        this.A = false;
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        synchronized (this) {
            try {
                if (!this.A) {
                    ScheduledFuture scheduledFuture2 = this.f13058w;
                    if (scheduledFuture2 != null && !scheduledFuture2.isDone()) {
                        this.f13058w.cancel(true);
                        long j10 = this.f13059x;
                        this.f13057v.getClass();
                        this.f13060y = j10 - SystemClock.elapsedRealtime();
                    } else {
                        this.f13060y = -1L;
                    }
                    this.A = true;
                }
            } finally {
            }
        }
    }
}
