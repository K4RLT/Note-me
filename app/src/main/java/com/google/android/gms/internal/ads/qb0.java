package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class qb0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9800a;

    public final synchronized boolean a() {
        if (this.f9800a) {
            return false;
        }
        this.f9800a = true;
        notifyAll();
        return true;
    }

    public final synchronized void b() {
        boolean z3 = false;
        while (!this.f9800a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z3 = true;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j10) {
        if (j10 > 0) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = j10 + elapsedRealtime;
                if (j11 < elapsedRealtime) {
                    b();
                } else {
                    boolean z3 = false;
                    while (!this.f9800a && elapsedRealtime < j11) {
                        try {
                            wait(j11 - elapsedRealtime);
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f9800a;
    }
}
