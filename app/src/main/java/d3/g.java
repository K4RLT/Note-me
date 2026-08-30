package d3;

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
import wa.b6;

/* loaded from: classes.dex */
public abstract class g implements ac.b {
    public static final Object A;

    /* renamed from: x, reason: collision with root package name */
    public static final boolean f15712x = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f15713y = Logger.getLogger(g.class.getName());

    /* renamed from: z, reason: collision with root package name */
    public static final b6 f15714z;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f15715u;

    /* renamed from: v, reason: collision with root package name */
    public volatile c f15716v;

    /* renamed from: w, reason: collision with root package name */
    public volatile f f15717w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [wa.b6] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        Object r32;
        try {
            th = null;
            r32 = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "w"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "v"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "u"));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        f15714z = r32;
        if (th != null) {
            f15713y.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        A = new Object();
    }

    public static void d(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f15717w;
        } while (!f15714z.c(gVar, fVar, f.f15709c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f15710a;
            if (thread != null) {
                fVar.f15710a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f15711b;
        }
        gVar.c();
        do {
            cVar2 = gVar.f15716v;
        } while (!f15714z.a(gVar, cVar2, c.f15701d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f15704c;
            cVar.f15704c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f15704c;
            e(cVar3.f15702a, cVar3.f15703b);
            cVar3 = cVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f15713y.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object f(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof b)) {
                if (obj == A) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((b) obj).f15700a);
        }
        Throwable th = ((a) obj).f15699b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object h(g gVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // ac.b
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f15716v;
        c cVar2 = c.f15701d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f15704c = cVar;
                if (f15714z.a(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f15716v;
                }
            } while (cVar != cVar2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        String valueOf;
        try {
            Object h3 = h(this);
            sb2.append("SUCCESS, result=[");
            if (h3 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(h3);
            }
            sb2.append(valueOf);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e8.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        boolean z9;
        a aVar;
        Object obj = this.f15715u;
        if (obj == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (f15712x) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z3);
            } else if (z3) {
                aVar = a.f15696c;
            } else {
                aVar = a.f15697d;
            }
            if (f15714z.b(this, obj, aVar)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        long j11;
        boolean z3;
        f fVar = f.f15709c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f15715u;
            if (obj != null) {
                return f(obj);
            }
            if (nanos > 0) {
                j11 = System.nanoTime() + nanos;
            } else {
                j11 = 0;
            }
            if (nanos >= 1000) {
                f fVar2 = this.f15717w;
                if (fVar2 != fVar) {
                    f fVar3 = new f();
                    do {
                        b6 b6Var = f15714z;
                        b6Var.d(fVar3, fVar2);
                        if (b6Var.c(this, fVar2, fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f15715u;
                                    if (obj2 != null) {
                                        return f(obj2);
                                    }
                                    nanos = j11 - System.nanoTime();
                                } else {
                                    j(fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            j(fVar3);
                        } else {
                            fVar2 = this.f15717w;
                        }
                    } while (fVar2 != fVar);
                }
                return f(this.f15715u);
            }
            while (nanos > 0) {
                Object obj3 = this.f15715u;
                if (obj3 != null) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j11 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String gVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j12 = -nanos;
                long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z3 = false;
                } else {
                    z3 = true;
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
            throw new TimeoutException(wd0.n(str, " for ", gVar));
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15715u instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f15715u != null) {
            return true;
        }
        return false;
    }

    public final void j(f fVar) {
        fVar.f15710a = null;
        while (true) {
            f fVar2 = this.f15717w;
            if (fVar2 != f.f15709c) {
                f fVar3 = null;
                while (fVar2 != null) {
                    f fVar4 = fVar2.f15711b;
                    if (fVar2.f15710a != null) {
                        fVar3 = fVar2;
                    } else if (fVar3 != null) {
                        fVar3.f15711b = fVar4;
                        if (fVar3.f15710a == null) {
                            break;
                        }
                    } else if (!f15714z.c(this, fVar2, fVar4)) {
                        break;
                    }
                    fVar2 = fVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = A;
        }
        if (f15714z.b(this, null, obj)) {
            d(this);
            return true;
        }
        return false;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (f15714z.b(this, null, new b(th))) {
            d(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f15715u instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = i();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        f fVar = f.f15709c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f15715u;
            if (obj2 != null) {
                return f(obj2);
            }
            f fVar2 = this.f15717w;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    b6 b6Var = f15714z;
                    b6Var.d(fVar3, fVar2);
                    if (b6Var.c(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15715u;
                            } else {
                                j(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    fVar2 = this.f15717w;
                } while (fVar2 != fVar);
            }
            return f(this.f15715u);
        }
        throw new InterruptedException();
    }
}