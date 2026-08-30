package com.google.android.gms.internal.mlkit_vision_digital_ink;

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
public class em implements ya {
    public static final Object A;

    /* renamed from: x, reason: collision with root package name */
    public static final boolean f14255x = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f14256y = Logger.getLogger(em.class.getName());

    /* renamed from: z, reason: collision with root package name */
    public static final tl f14257z;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f14258u;

    /* renamed from: v, reason: collision with root package name */
    public volatile am f14259v;

    /* renamed from: w, reason: collision with root package name */
    public volatile dm f14260w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.tl] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    static {
        ?? r32;
        try {
            th = null;
            r32 = new bm(AtomicReferenceFieldUpdater.newUpdater(dm.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(dm.class, dm.class, "b"), AtomicReferenceFieldUpdater.newUpdater(em.class, dm.class, "w"), AtomicReferenceFieldUpdater.newUpdater(em.class, am.class, "v"), AtomicReferenceFieldUpdater.newUpdater(em.class, Object.class, "u"));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        Throwable th2 = th;
        f14257z = r32;
        if (th2 != null) {
            f14256y.logp(Level.SEVERE, "com.google.mlkit.shared.mdd.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        A = new Object();
    }

    public static void c(em emVar) {
        dm dmVar;
        tl tlVar;
        am amVar;
        am amVar2;
        am amVar3;
        do {
            dmVar = emVar.f14260w;
            tlVar = f14257z;
        } while (!tlVar.x(emVar, dmVar, dm.f14191c));
        while (true) {
            amVar = null;
            if (dmVar == null) {
                break;
            }
            Thread thread = dmVar.f14192a;
            if (thread != null) {
                dmVar.f14192a = null;
                LockSupport.unpark(thread);
            }
            dmVar = dmVar.f14193b;
        }
        do {
            amVar2 = emVar.f14259v;
        } while (!tlVar.s(emVar, amVar2, am.f14020d));
        while (true) {
            amVar3 = amVar;
            amVar = amVar2;
            if (amVar == null) {
                break;
            }
            amVar2 = amVar.f14023c;
            amVar.f14023c = amVar3;
        }
        while (amVar3 != null) {
            Runnable runnable = amVar3.f14021a;
            am amVar4 = amVar3.f14023c;
            e(runnable, amVar3.f14022b);
            amVar3 = amVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f14256y.logp(Level.SEVERE, "com.google.mlkit.shared.mdd.concurrent.AbstractResolvableFuture", "executeListener", p.a.l("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public static final Object h(Object obj) {
        if (!(obj instanceof xl)) {
            if (!(obj instanceof zl)) {
                if (obj == A) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((zl) obj).f15349a);
        }
        Throwable th = ((xl) obj).f15239a;
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
        xl xlVar;
        Object obj = this.f14258u;
        if (obj == null) {
            if (f14255x) {
                xlVar = new xl(new CancellationException("Future.cancel() was called."));
            } else if (z3) {
                xlVar = xl.f15237b;
            } else {
                xlVar = xl.f15238c;
            }
            if (f14257z.v(this, obj, xlVar)) {
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

    public final void f(dm dmVar) {
        dmVar.f14192a = null;
        while (true) {
            dm dmVar2 = this.f14260w;
            if (dmVar2 != dm.f14191c) {
                dm dmVar3 = null;
                while (dmVar2 != null) {
                    dm dmVar4 = dmVar2.f14193b;
                    if (dmVar2.f14192a != null) {
                        dmVar3 = dmVar2;
                    } else if (dmVar3 != null) {
                        dmVar3.f14193b = dmVar4;
                        if (dmVar3.f14192a == null) {
                            break;
                        }
                    } else if (!f14257z.x(this, dmVar2, dmVar4)) {
                        break;
                    }
                    dmVar2 = dmVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ya
    public final void g(Runnable runnable, Executor executor) {
        executor.getClass();
        am amVar = this.f14259v;
        am amVar2 = am.f14020d;
        if (amVar != amVar2) {
            am amVar3 = new am(runnable, executor);
            do {
                amVar3.f14023c = amVar;
                if (f14257z.s(this, amVar, amVar3)) {
                    return;
                } else {
                    amVar = this.f14259v;
                }
            } while (amVar != amVar2);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        long j11;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f14258u;
            if (obj != null) {
                return h(obj);
            }
            if (nanos > 0) {
                j11 = System.nanoTime() + nanos;
            } else {
                j11 = 0;
            }
            if (nanos >= 1000) {
                dm dmVar = this.f14260w;
                dm dmVar2 = dm.f14191c;
                if (dmVar != dmVar2) {
                    dm dmVar3 = new dm();
                    do {
                        tl tlVar = f14257z;
                        tlVar.g(dmVar3, dmVar);
                        if (tlVar.x(this, dmVar, dmVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f14258u;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = j11 - System.nanoTime();
                                } else {
                                    f(dmVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(dmVar3);
                        } else {
                            dmVar = this.f14260w;
                        }
                    } while (dmVar != dmVar2);
                }
                return h(this.f14258u);
            }
            while (nanos > 0) {
                Object obj3 = this.f14258u;
                if (obj3 != null) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j11 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String emVar = toString();
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
            throw new TimeoutException(wd0.n(str, " for ", emVar));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14258u instanceof xl;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14258u != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f14258u instanceof xl) {
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
            Object obj2 = this.f14258u;
            if (obj2 != null) {
                return h(obj2);
            }
            dm dmVar = this.f14260w;
            dm dmVar2 = dm.f14191c;
            if (dmVar != dmVar2) {
                dm dmVar3 = new dm();
                do {
                    tl tlVar = f14257z;
                    tlVar.g(dmVar3, dmVar);
                    if (tlVar.x(this, dmVar, dmVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f14258u;
                            } else {
                                f(dmVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    dmVar = this.f14260w;
                } while (dmVar != dmVar2);
            }
            return h(this.f14258u);
        }
        throw new InterruptedException();
    }
}
