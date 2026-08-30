package eb;
import c1.a;
import q.x;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class y0 extends k1 {
    public static final AtomicLong F = new AtomicLong(Long.MIN_VALUE);
    public final LinkedBlockingQueue A;
    public final z0 B;
    public final z0 C;
    public final Object D;
    public final Semaphore E;

    /* renamed from: x, reason: collision with root package name */
    public a1 f16458x;

    /* renamed from: y, reason: collision with root package name */
    public a1 f16459y;

    /* renamed from: z, reason: collision with root package name */
    public final PriorityBlockingQueue f16460z;

    public y0(d1 d1Var) {
        super(d1Var);
        this.D = new Object();
        this.E = new Semaphore(2);
        this.f16460z = new PriorityBlockingQueue();
        this.A = new LinkedBlockingQueue();
        this.B = new z0(this, "Thread death: Uncaught exception on worker thread");
        this.C = new z0(this, "Thread death: Uncaught exception on network thread");
    }

    public final void A(b1 b1Var) {
        synchronized (this.D) {
            try {
                this.f16460z.add(b1Var);
                a1 a1Var = this.f16458x;
                if (a1Var == null) {
                    a1 a1Var2 = new a1(this, "Measurement Worker", this.f16460z);
                    this.f16458x = a1Var2;
                    a1Var2.setUncaughtExceptionHandler(this.B);
                    this.f16458x.start();
                } else {
                    synchronized (a1Var.f16052u) {
                        a1Var.f16052u.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(Runnable runnable) {
        v();
        b1 b1Var = new b1(this, runnable, false, "Task exception on network thread");
        synchronized (this.D) {
            try {
                this.A.add(b1Var);
                a1 a1Var = this.f16459y;
                if (a1Var == null) {
                    a1 a1Var2 = new a1(this, "Measurement Network", this.A);
                    this.f16459y = a1Var2;
                    a1Var2.setUncaughtExceptionHandler(this.C);
                    this.f16459y.start();
                } else {
                    synchronized (a1Var.f16052u) {
                        a1Var.f16052u.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b1 C(Callable callable) {
        v();
        b1 b1Var = new b1(this, callable, true);
        if (Thread.currentThread() == this.f16458x) {
            b1Var.run();
            return b1Var;
        }
        A(b1Var);
        return b1Var;
    }

    public final void D(Runnable runnable) {
        v();
        fa.y.h(runnable);
        A(new b1(this, runnable, false, "Task exception on worker thread"));
    }

    public final void E(Runnable runnable) {
        v();
        A(new b1(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean F() {
        if (Thread.currentThread() == this.f16458x) {
            return true;
        }
        return false;
    }

    public final void G() {
        if (Thread.currentThread() == this.f16459y) {
            return;
        }
        x.o("Call expected from network thread");
    }

    @Override // a
    public final void u() {
        if (Thread.currentThread() == this.f16458x) {
            return;
        }
        x.o("Call expected from worker thread");
    }

    @Override // eb.k1
    public final boolean x() {
        return false;
    }

    public final b1 y(Callable callable) {
        v();
        b1 b1Var = new b1(this, callable, false);
        if (Thread.currentThread() == this.f16458x) {
            if (!this.f16460z.isEmpty()) {
                f().D.g("Callable skipped the worker queue.");
            }
            b1Var.run();
            return b1Var;
        }
        A(b1Var);
        return b1Var;
    }

    public final Object z(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            h().D(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                f().D.g("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            f().D.g("Timed out waiting for ".concat(str));
        }
        return obj;
    }
}
