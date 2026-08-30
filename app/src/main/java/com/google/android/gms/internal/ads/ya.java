package com.google.android.gms.internal.ads;
import mb.a;
import eb.a;
import mb.c;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes.dex */
public final class ya extends Thread {
    public static final boolean A = mb.f8298a;

    /* renamed from: u, reason: collision with root package name */
    public final BlockingQueue f12823u;

    /* renamed from: v, reason: collision with root package name */
    public final BlockingQueue f12824v;

    /* renamed from: w, reason: collision with root package name */
    public final rb f12825w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f12826x = false;

    /* renamed from: y, reason: collision with root package name */
    public final tw f12827y;

    /* renamed from: z, reason: collision with root package name */
    public final lx0 f12828z;

    public ya(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, rb rbVar, lx0 lx0Var) {
        this.f12823u = priorityBlockingQueue;
        this.f12824v = priorityBlockingQueue2;
        this.f12825w = rbVar;
        this.f12828z = lx0Var;
        this.f12827y = new tw(this, priorityBlockingQueue2, lx0Var);
    }

    public final void a() {
        boolean z3;
        gb gbVar = (gb) this.f12823u.take();
        gbVar.a("cache-queue-take");
        gbVar.c();
        try {
            synchronized (gbVar.f6357y) {
            }
            rb rbVar = this.f12825w;
            xa a10 = rbVar.a(gbVar.d());
            if (a10 == null) {
                gbVar.a("cache-miss");
                if (!this.f12827y.n(gbVar)) {
                    this.f12824v.put(gbVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z9 = false;
                if (a10.e < currentTimeMillis) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    gbVar.a("cache-hit-expired");
                    gbVar.D = a10;
                    if (!this.f12827y.n(gbVar)) {
                        this.f12824v.put(gbVar);
                    }
                } else {
                    gbVar.a("cache-hit");
                    byte[] bArr = a10.f12527a;
                    Map map = a10.f12532g;
                    d h3 = gbVar.h(new eb(200, bArr, map, eb.a(map), false));
                    gbVar.a("cache-hit-parsed");
                    if (((jb) h3.f5232x) == null) {
                        z9 = true;
                    }
                    if (!z9) {
                        gbVar.a("cache-parsing-failed");
                        String d2 = gbVar.d();
                        synchronized (rbVar) {
                            xa a11 = rbVar.a(d2);
                            if (a11 != null) {
                                a11.f12531f = 0L;
                                a11.e = 0L;
                                rbVar.c(d2, a11);
                            }
                        }
                        gbVar.D = null;
                        if (!this.f12827y.n(gbVar)) {
                            this.f12824v.put(gbVar);
                        }
                    } else if (a10.f12531f < currentTimeMillis) {
                        gbVar.a("cache-hit-refresh-needed");
                        gbVar.D = a10;
                        h3.f5229u = true;
                        boolean n10 = this.f12827y.n(gbVar);
                        lx0 lx0Var = this.f12828z;
                        if (!n10) {
                            lx0Var.j(gbVar, h3, new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(5, this, gbVar, false));
                        } else {
                            lx0Var.j(gbVar, h3, null);
                        }
                    } else {
                        this.f12828z.j(gbVar, h3, null);
                    }
                }
            }
            gbVar.c();
        } catch (Throwable th) {
            gbVar.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (A) {
            mb.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f12825w.d();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f12826x) {
                    Thread.currentThread().interrupt();
                    return;
                }
                mb.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
