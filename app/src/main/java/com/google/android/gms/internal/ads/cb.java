package com.google.android.gms.internal.ads;
import i0.m;
import mb.c;
import mb.d;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes.dex */
public final class cb extends Thread {

    /* renamed from: u, reason: collision with root package name */
    public final BlockingQueue f5064u;

    /* renamed from: v, reason: collision with root package name */
    public final bb f5065v;

    /* renamed from: w, reason: collision with root package name */
    public final rb f5066w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f5067x = false;

    /* renamed from: y, reason: collision with root package name */
    public final lx0 f5068y;

    public cb(PriorityBlockingQueue priorityBlockingQueue, m mVar, rb rbVar, lx0 lx0Var) {
        this.f5064u = priorityBlockingQueue;
        this.f5065v = mVar;
        this.f5066w = rbVar;
        this.f5068y = lx0Var;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.jb, java.lang.Exception] */
    public final void a() {
        lx0 lx0Var = this.f5068y;
        gb gbVar = (gb) this.f5064u.take();
        SystemClock.elapsedRealtime();
        gbVar.c();
        try {
            try {
                gbVar.a("network-queue-take");
                synchronized (gbVar.f6357y) {
                }
                TrafficStats.setThreadStatsTag(gbVar.f6356x);
                eb a10 = this.f5065v.a(gbVar);
                gbVar.a("network-http-complete");
                if (a10.e && gbVar.g()) {
                    gbVar.b("not-modified");
                    gbVar.k();
                } else {
                    d h3 = gbVar.h(a10);
                    gbVar.a("network-parse-complete");
                    xa xaVar = (xa) h3.f5231w;
                    if (xaVar != null) {
                        this.f5066w.c(gbVar.d(), xaVar);
                        gbVar.a("network-cache-written");
                    }
                    synchronized (gbVar.f6357y) {
                        gbVar.C = true;
                    }
                    lx0Var.j(gbVar, h3, null);
                    gbVar.j(h3);
                }
            } catch (jb e) {
                SystemClock.elapsedRealtime();
                lx0Var.getClass();
                gbVar.a("post-error");
                ((k0) lx0Var.f8177v).f7591v.post(new r1(1, gbVar, new d(e), (Object) null));
                gbVar.k();
            } catch (Exception e8) {
                Log.e("Volley", d("Unhandled exception %s", e8.toString()), e8);
                Exception exc = new Exception(e8);
                SystemClock.elapsedRealtime();
                lx0Var.getClass();
                gbVar.a("post-error");
                ((k0) lx0Var.f8177v).f7591v.post(new r1(1, gbVar, new d((jb) exc), (Object) null));
                gbVar.k();
            }
            gbVar.c();
        } catch (Throwable th) {
            gbVar.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f5067x) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}