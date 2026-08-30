package com.google.android.gms.internal.ads;
import p.a;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class x81 extends AtomicReference implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final af f12490u;

    /* renamed from: v, reason: collision with root package name */
    public static final af f12491v;

    static {
        int i = 9;
        f12490u = new af(i);
        f12491v = new af(i);
    }

    public abstract Object a();

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        w81 w81Var = null;
        boolean z3 = false;
        int i = 0;
        while (true) {
            boolean z9 = runnable instanceof w81;
            af afVar = f12491v;
            if (!z9) {
                if (runnable != afVar) {
                    break;
                }
            } else {
                w81Var = (w81) runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == afVar || compareAndSet(runnable, afVar)) {
                    if (Thread.interrupted() || z3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    LockSupport.park(w81Var);
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

    public abstract String c();

    public abstract boolean d();

    public abstract void e(Object obj);

    public abstract void f(Throwable th);

    public final void g() {
        af afVar = f12491v;
        af afVar2 = f12490u;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            w81 w81Var = new w81(this);
            w81Var.a(Thread.currentThread());
            if (compareAndSet(runnable, w81Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(afVar2)) == afVar) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(afVar2)) == afVar) {
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
            boolean d2 = d();
            af afVar = f12490u;
            if (!d2) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, afVar)) {
                            b(currentThread);
                        }
                        f(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, afVar)) {
                            b(currentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, afVar)) {
                b(currentThread);
            }
            if (!d2) {
                e(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f12490u) {
            str = "running=[DONE]";
        } else if (runnable instanceof w81) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = p.a.o(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String c10 = c();
        return p.a.o(new StringBuilder(str.length() + 2 + String.valueOf(c10).length()), str, ", ", c10);
    }
}
