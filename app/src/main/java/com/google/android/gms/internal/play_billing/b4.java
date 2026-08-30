package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.wd0;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class b4 implements r0 {
    public static final Object A;

    /* renamed from: x, reason: collision with root package name */
    public static final boolean f15384x = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f15385y = Logger.getLogger(b4.class.getName());

    /* renamed from: z, reason: collision with root package name */
    public static final wa.g0 f15386z;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f15387u;

    /* renamed from: v, reason: collision with root package name */
    public volatile g2 f15388v;

    /* renamed from: w, reason: collision with root package name */
    public volatile a4 f15389w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [wa.g0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    static {
        ?? r32;
        try {
            th = null;
            r32 = new d3(AtomicReferenceFieldUpdater.newUpdater(a4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(a4.class, a4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b4.class, a4.class, "w"), AtomicReferenceFieldUpdater.newUpdater(b4.class, g2.class, "v"), AtomicReferenceFieldUpdater.newUpdater(b4.class, Object.class, "u"));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        Throwable th2 = th;
        f15386z = r32;
        if (th2 != null) {
            f15385y.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        A = new Object();
    }

    public static void c(b4 b4Var) {
        a4 a4Var;
        wa.g0 g0Var;
        g2 g2Var;
        g2 g2Var2;
        g2 g2Var3;
        do {
            a4Var = b4Var.f15389w;
            g0Var = f15386z;
        } while (!g0Var.e(b4Var, a4Var, a4.f15378c));
        while (true) {
            g2Var = null;
            if (a4Var == null) {
                break;
            }
            Thread thread = a4Var.f15379a;
            if (thread != null) {
                a4Var.f15379a = null;
                LockSupport.unpark(thread);
            }
            a4Var = a4Var.f15380b;
        }
        do {
            g2Var2 = b4Var.f15388v;
        } while (!g0Var.c(b4Var, g2Var2, g2.f15431d));
        while (true) {
            g2Var3 = g2Var;
            g2Var = g2Var2;
            if (g2Var == null) {
                break;
            }
            g2Var2 = g2Var.f15434c;
            g2Var.f15434c = g2Var3;
        }
        while (g2Var3 != null) {
            Runnable runnable = g2Var3.f15432a;
            g2 g2Var4 = g2Var3.f15434c;
            e(runnable, g2Var3.f15433b);
            g2Var3 = g2Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f15385y.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", p.a.l("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public static final Object h(Object obj) {
        if (!(obj instanceof y0)) {
            if (!(obj instanceof u1)) {
                if (obj == A) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((u1) obj).f15534a);
        }
        Throwable th = ((y0) obj).f15555a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        y0 y0Var;
        Object obj = this.f15387u;
        if (obj == null) {
            if (f15384x) {
                y0Var = new y0(new CancellationException("Future.cancel() was called."));
            } else if (z3) {
                y0Var = y0.f15553b;
            } else {
                y0Var = y0.f15554c;
            }
            if (f15386z.d(this, obj, y0Var)) {
                c(this);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void d(StringBuilder sb2) {
        Object obj;
        String valueOf;
        boolean z3 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                } catch (Throwable th) {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e8) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e8.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb2.append(valueOf);
        sb2.append("]");
    }

    public final void f(a4 a4Var) {
        a4Var.f15379a = null;
        while (true) {
            a4 a4Var2 = this.f15389w;
            if (a4Var2 != a4.f15378c) {
                a4 a4Var3 = null;
                while (a4Var2 != null) {
                    a4 a4Var4 = a4Var2.f15380b;
                    if (a4Var2.f15379a != null) {
                        a4Var3 = a4Var2;
                    } else if (a4Var3 != null) {
                        a4Var3.f15380b = a4Var4;
                        if (a4Var3.f15379a == null) {
                            break;
                        }
                    } else if (!f15386z.e(this, a4Var2, a4Var4)) {
                        break;
                    }
                    a4Var2 = a4Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        long j11;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f15387u;
            if (obj != null) {
                return h(obj);
            }
            if (nanos > 0) {
                j11 = System.nanoTime() + nanos;
            } else {
                j11 = 0;
            }
            if (nanos >= 1000) {
                a4 a4Var = this.f15389w;
                a4 a4Var2 = a4.f15378c;
                if (a4Var != a4Var2) {
                    a4 a4Var3 = new a4();
                    do {
                        wa.g0 g0Var = f15386z;
                        g0Var.a(a4Var3, a4Var);
                        if (g0Var.e(this, a4Var, a4Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f15387u;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = j11 - System.nanoTime();
                                } else {
                                    f(a4Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(a4Var3);
                        } else {
                            a4Var = this.f15389w;
                        }
                    } while (a4Var != a4Var2);
                }
                return h(this.f15387u);
            }
            while (nanos > 0) {
                Object obj3 = this.f15387u;
                if (obj3 != null) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j11 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String b4Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j12 = -nanos;
                long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit.toNanos(convert);
                boolean z3 = true;
                if (convert != 0 && nanos2 <= 1000) {
                    z3 = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z3) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z3) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(wd0.n(str, " for ", b4Var));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15387u instanceof y0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15387u != null;
    }

    @Override // com.google.android.gms.internal.play_billing.r0
    public final void k(Runnable runnable, Executor executor) {
        executor.getClass();
        g2 g2Var = this.f15388v;
        g2 g2Var2 = g2.f15431d;
        if (g2Var != g2Var2) {
            g2 g2Var3 = new g2(runnable, executor);
            do {
                g2Var3.f15434c = g2Var;
                if (f15386z.c(this, g2Var, g2Var3)) {
                    return;
                } else {
                    g2Var = this.f15388v;
                }
            } while (g2Var != g2Var2);
        }
        e(runnable, executor);
    }

    public final String toString() {
        String concat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f15387u instanceof y0) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            d(sb2);
        } else {
            try {
                concat = b();
            } catch (RuntimeException e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(concat);
                sb2.append("]");
            } else if (isDone()) {
                d(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f15387u;
            if (obj2 != null) {
                return h(obj2);
            }
            a4 a4Var = this.f15389w;
            a4 a4Var2 = a4.f15378c;
            if (a4Var != a4Var2) {
                a4 a4Var3 = new a4();
                do {
                    wa.g0 g0Var = f15386z;
                    g0Var.a(a4Var3, a4Var);
                    if (g0Var.e(this, a4Var, a4Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15387u;
                            } else {
                                f(a4Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    a4Var = this.f15389w;
                } while (a4Var != a4Var2);
            }
            return h(this.f15387u);
        }
        throw new InterruptedException();
    }
}
