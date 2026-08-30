package com.google.android.gms.internal.ads;
import g9.r;
import j6.s;
import k9.a0;
import la.a;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class x70 extends um1 {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public ScheduledFuture E;
    public ScheduledFuture F;

    /* renamed from: w, reason: collision with root package name */
    public final ScheduledExecutorService f12482w;

    /* renamed from: x, reason: collision with root package name */
    public final a f12483x;

    /* renamed from: y, reason: collision with root package name */
    public final be0 f12484y;

    /* renamed from: z, reason: collision with root package name */
    public long f12485z;

    public x70(ScheduledExecutorService scheduledExecutorService, a aVar, be0 be0Var) {
        super(Collections.EMPTY_SET);
        this.f12485z = -1L;
        this.A = -1L;
        this.B = -1L;
        this.C = -1L;
        this.D = false;
        this.f12482w = scheduledExecutorService;
        this.f12483x = aVar;
        this.f12484y = be0Var;
    }

    public final synchronized void E() {
        this.D = false;
        W1(0L);
    }

    public final synchronized void U1(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 20);
        sb2.append("In scheduleRefresh: ");
        sb2.append(i);
        a0.k(sb2.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.D) {
                long j10 = this.B;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.B = millis;
                return;
            }
            this.f12483x.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            nl nlVar = sl.Pe;
            r rVar = r.e;
            boolean booleanValue = ((Boolean) rVar.f17698c.a(nlVar)).booleanValue();
            long j11 = this.f12485z;
            if (booleanValue) {
                if (elapsedRealtime >= j11 || j11 - elapsedRealtime > millis) {
                    W1(millis);
                    if (((Boolean) rVar.f17698c.a(sl.f10863nf)).booleanValue()) {
                        s a10 = this.f12484y.a();
                        a10.k("action", "rtnc");
                        a10.n();
                    }
                }
            } else if (elapsedRealtime > j11 || j11 - elapsedRealtime > millis) {
                W1(millis);
            }
        }
    }

    public final synchronized void V1(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 28);
        sb2.append("In scheduleShowRefreshedAd: ");
        sb2.append(i);
        a0.k(sb2.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.D) {
                long j10 = this.C;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.C = millis;
                return;
            }
            this.f12483x.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean booleanValue = ((Boolean) r.e.f17698c.a(sl.Pe)).booleanValue();
            long j11 = this.A;
            if (booleanValue) {
                if (elapsedRealtime == j11) {
                    a0.k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j12 = this.A;
                if (elapsedRealtime >= j12 || j12 - elapsedRealtime > millis) {
                    X1(millis);
                }
            } else if (elapsedRealtime > j11 || j11 - elapsedRealtime > millis) {
                X1(millis);
            }
        }
    }

    public final synchronized void W1(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.E;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.E.cancel(false);
            }
            this.f12483x.getClass();
            this.f12485z = SystemClock.elapsedRealtime() + j10;
            this.E = this.f12482w.schedule(new w70(this, 0), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void X1(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.F;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.F.cancel(false);
            }
            this.f12483x.getClass();
            this.A = SystemClock.elapsedRealtime() + j10;
            this.F = this.f12482w.schedule(new w70(this, 1), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }
}
