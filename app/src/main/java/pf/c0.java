package pf;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class c0 extends v0 implements Runnable {
    public static final c0 D;
    public static final long E;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.v0, pf.c0, pf.q0] */
    static {
        Long l10;
        v0 v0Var = new v0();
        D = v0Var;
        v0Var.c0(false);
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        E = TimeUnit.MILLISECONDS.toNanos(l10.longValue());
    }

    @Override // pf.v0, pf.g0
    public final n0 A(long j10, Runnable runnable, te.g gVar) {
        long j11 = 0;
        if (j10 > 0) {
            if (j10 >= 9223372036854L) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = 1000000 * j10;
            }
        }
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            s0 s0Var = new s0(runnable, j11 + nanoTime);
            l0(nanoTime, s0Var);
            return s0Var;
        }
        return p1.f22779u;
    }

    @Override // pf.v0
    public final void f0(Runnable runnable) {
        if (debugStatus != 4) {
            super.f0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // pf.v0
    public final Thread i0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(D.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override // pf.v0
    public final void k0(long j10, t0 t0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void m0() {
        boolean z3;
        int i = debugStatus;
        if (i != 2 && i != 3) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            return;
        }
        debugStatus = 3;
        v0.A.set(this, null);
        v0.B.set(this, null);
        notifyAll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        boolean z9;
        boolean j02;
        u1.f22799a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    if (!j02) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long d02 = d0();
                    if (d02 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = E + nanoTime;
                        }
                        long j11 = j10 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            m0();
                            if (!j0()) {
                                i0();
                                return;
                            }
                            return;
                        }
                        if (d02 > j11) {
                            d02 = j11;
                        }
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (d02 > 0) {
                        int i10 = debugStatus;
                        if (i10 != 2 && i10 != 3) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            _thread = null;
                            m0();
                            if (!j0()) {
                                i0();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, d02);
                    }
                }
            }
        } finally {
            _thread = null;
            m0();
            if (!j0()) {
                i0();
            }
        }
    }

    @Override // pf.v0, pf.q0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // pf.v
    public final String toString() {
        return "DefaultExecutor";
    }
}