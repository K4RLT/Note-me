package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.os.Handler;
import android.os.Looper;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class x1 implements Runnable, Closeable {

    /* renamed from: u, reason: collision with root package name */
    public e2 f15221u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f15222v = n5.h(Thread.currentThread());

    /* renamed from: w, reason: collision with root package name */
    public boolean f15223w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15224x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f15225y;

    public x1(e2 e2Var, boolean z3) {
        this.f15225y = false;
        this.f15221u = e2Var;
        this.f15225y = z3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e2 e2Var = this.f15221u;
        try {
            this.f15221u = null;
            boolean z3 = this.f15224x;
            if (!z3) {
                if (!this.f15223w) {
                    this.f15223w = true;
                    if (this.f15222v && !z3) {
                        n5.h(Thread.currentThread());
                    }
                } else {
                    throw new IllegalStateException("Span was already closed!");
                }
            }
            if (e2Var != null) {
                ((l1) e2Var).close();
            }
            if (this.f15225y) {
                q1.c(q1.a(), v1.A);
            }
        } catch (Throwable th) {
            if (e2Var != null) {
                try {
                    ((l1) e2Var).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void f(n9 n9Var) {
        if (!this.f15223w) {
            if (!this.f15224x) {
                this.f15224x = true;
                n9Var.g(this, ia.f14473u);
                return;
            } else {
                q.x.o("Signal is already attached to future");
                return;
            }
        }
        q.x.o("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        if (!this.f15223w && (z3 = this.f15224x)) {
            this.f15223w = true;
            if (this.f15222v && !z3) {
                n5.h(Thread.currentThread());
                return;
            }
            return;
        }
        w1 w1Var = new w1(0);
        if (n5.f14697c == null) {
            synchronized (n5.f14695a) {
                try {
                    if (n5.f14697c == null) {
                        n5.f14697c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        n5.f14697c.post(w1Var);
    }
}
