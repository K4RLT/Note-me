package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.util.Log;
import com.google.android.gms.internal.ads.pu1;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class wl implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public final ab f15186u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f15187v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public int f15188w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayDeque f15189x = new ArrayDeque();

    public wl(ab abVar) {
        this.f15186u = abVar;
    }

    public static void a(wl wlVar) {
        synchronized (wlVar.f15187v) {
            try {
                Runnable runnable = (Runnable) wlVar.f15189x.poll();
                if (runnable == null) {
                    wlVar.f15188w--;
                    return;
                }
                try {
                    wlVar.f15186u.execute(new pu1(wlVar, runnable));
                } catch (RejectedExecutionException e) {
                    Log.e("ThrottlingExecutor", String.format("Task submission failed: %s", runnable), e);
                    synchronized (wlVar.f15187v) {
                        wlVar.f15188w--;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f15187v) {
            try {
                int i = this.f15188w;
                if (i >= 2) {
                    this.f15189x.add(runnable);
                    return;
                }
                this.f15188w = i + 1;
                try {
                    this.f15186u.execute(new pu1(this, runnable));
                } catch (Throwable th) {
                    synchronized (this.f15187v) {
                        this.f15188w--;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
