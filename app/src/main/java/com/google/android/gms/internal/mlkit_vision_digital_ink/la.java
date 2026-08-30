package com.google.android.gms.internal.mlkit_vision_digital_ink;
import j6.c;
import ra.e;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class la extends AtomicReference implements Executor, Runnable {

    /* renamed from: u, reason: collision with root package name */
    public c f14599u;

    /* renamed from: v, reason: collision with root package name */
    public Executor f14600v;

    /* renamed from: w, reason: collision with root package name */
    public Runnable f14601w;

    /* renamed from: x, reason: collision with root package name */
    public Thread f14602x;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == ka.f14565v) {
            this.f14600v = null;
            this.f14599u = null;
            return;
        }
        this.f14602x = Thread.currentThread();
        try {
            c cVar = this.f14599u;
            Objects.requireNonNull(cVar);
            e eVar = (e) cVar.f18915w;
            if (((Thread) eVar.f24675v) == this.f14602x) {
                this.f14599u = null;
                if (((Runnable) eVar.f24676w) == null) {
                    eVar.f24676w = runnable;
                    Executor executor = this.f14600v;
                    Objects.requireNonNull(executor);
                    eVar.f24677x = executor;
                    this.f14600v = null;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                Executor executor2 = this.f14600v;
                Objects.requireNonNull(executor2);
                this.f14600v = null;
                this.f14601w = runnable;
                executor2.execute(this);
            }
            this.f14602x = null;
        } catch (Throwable th) {
            this.f14602x = null;
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.f14602x) {
            Runnable runnable = this.f14601w;
            Objects.requireNonNull(runnable);
            this.f14601w = null;
            runnable.run();
            return;
        }
        e eVar = new e(17, false);
        eVar.f24675v = currentThread;
        c cVar = this.f14599u;
        Objects.requireNonNull(cVar);
        cVar.f18915w = eVar;
        this.f14599u = null;
        try {
            Runnable runnable2 = this.f14601w;
            Objects.requireNonNull(runnable2);
            this.f14601w = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) eVar.f24676w;
                if (runnable3 == null || (executor = (Executor) eVar.f24677x) == null) {
                    break;
                }
                eVar.f24676w = null;
                eVar.f24677x = null;
                executor.execute(runnable3);
            }
        } finally {
            eVar.f24675v = null;
        }
    }
}
