package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;
import ja.a;
import ra.e;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class za extends FutureTask implements ya {

    /* renamed from: u, reason: collision with root package name */
    public final ja f15333u;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.ja] */
    public za(Callable callable) {
        super(callable);
        this.f15333u = new Object();
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        ja jaVar = this.f15333u;
        synchronized (jaVar) {
            try {
                if (jaVar.f14511b) {
                    return;
                }
                jaVar.f14511b = true;
                e eVar = jaVar.f14510a;
                e eVar2 = null;
                jaVar.f14510a = null;
                while (eVar != null) {
                    e eVar3 = (e) eVar.f24677x;
                    eVar.f24677x = eVar2;
                    eVar2 = eVar;
                    eVar = eVar3;
                }
                while (eVar2 != null) {
                    a((Runnable) eVar2.f24675v, (Executor) eVar2.f24676w);
                    eVar2 = (e) eVar2.f24677x;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ya
    public final void g(Runnable runnable, Executor executor) {
        ja jaVar = this.f15333u;
        jaVar.getClass();
        if (executor != null) {
            synchronized (jaVar) {
                try {
                    if (!jaVar.f14511b) {
                        jaVar.f14510a = new e(16, runnable, executor, jaVar.f14510a);
                        return;
                    } else {
                        a(runnable, executor);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        q.h("Executor was null.");
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (nanos <= 2147483647999999999L) {
            return super.get(j10, timeUnit);
        }
        return super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
