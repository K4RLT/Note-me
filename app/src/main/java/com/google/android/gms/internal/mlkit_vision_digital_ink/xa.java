package com.google.android.gms.internal.mlkit_vision_digital_ink;
import p.a;

import com.google.android.gms.internal.ads.wd0;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class xa extends AtomicReference implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final w1 f15235u = new w1(1);

    /* renamed from: v, reason: collision with root package name */
    public static final w1 f15236v = new w1(1);

    public abstract Object a();

    public abstract String b();

    public final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        wa waVar = null;
        boolean z3 = false;
        int i = 0;
        while (true) {
            boolean z9 = runnable instanceof wa;
            w1 w1Var = f15236v;
            if (!z9) {
                if (runnable != w1Var) {
                    break;
                }
            } else {
                waVar = (wa) runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == w1Var || compareAndSet(runnable, w1Var)) {
                    if (Thread.interrupted() || z3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    LockSupport.park(waVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z3) {
            thread.interrupt();
        }
    }

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean f();

    public final void g() {
        w1 w1Var = f15236v;
        w1 w1Var2 = f15235u;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            wa waVar = new wa(this);
            waVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, waVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(w1Var2)) == w1Var) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(w1Var2)) == w1Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean f10 = f();
            w1 w1Var = f15235u;
            if (!f10) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, w1Var)) {
                            c(currentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, w1Var)) {
                            c(currentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, w1Var)) {
                c(currentThread);
            }
            if (!f10) {
                e(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f15235u) {
            str = "running=[DONE]";
        } else if (runnable instanceof wa) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = p.a.k("running=[RUNNING ON ", ((Thread) runnable).getName(), "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return wd0.n(str, ", ", b());
    }
}
