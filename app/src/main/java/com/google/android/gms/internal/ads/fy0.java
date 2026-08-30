package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fy0 implements dy0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6208a;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f6209b = new PriorityQueue();

    public fy0(Executor executor) {
        this.f6208a = executor;
    }

    @Override // com.google.android.gms.internal.ads.dy0
    public final void a(Runnable runnable, long j10) {
        if (j10 <= 0) {
            this.f6208a.execute(runnable);
            return;
        }
        gy0 gy0Var = new gy0(runnable, System.currentTimeMillis() + j10);
        PriorityQueue priorityQueue = this.f6209b;
        synchronized (priorityQueue) {
            priorityQueue.add(gy0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.dy0
    public final void zzb() {
        PriorityQueue priorityQueue = this.f6209b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long currentTimeMillis = System.currentTimeMillis();
                for (gy0 gy0Var = (gy0) priorityQueue.peek(); gy0Var != null && gy0Var.f6505v <= currentTimeMillis; gy0Var = (gy0) priorityQueue.peek()) {
                    priorityQueue2.add(gy0Var);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.f6208a.execute(((gy0) it.next()).f6504u);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
