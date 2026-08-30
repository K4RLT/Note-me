package l6;

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
import ya.j0;

/* loaded from: classes.dex */
public abstract class h implements ac.b {
    public static final Object A;

    /* renamed from: x, reason: collision with root package name */
    public static final boolean f19959x = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f19960y = Logger.getLogger(h.class.getName());

    /* renamed from: z, reason: collision with root package name */
    public static final j0 f19961z;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f19962u;

    /* renamed from: v, reason: collision with root package name */
    public volatile c f19963v;

    /* renamed from: w, reason: collision with root package name */
    public volatile g f19964w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [ya.j0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        Object r32;
        try {
            th = null;
            r32 = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "w"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "v"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "u"));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        f19961z = r32;
        if (th != null) {
            f19960y.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        A = new Object();
    }

    public static void c(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f19964w;
            if (f19961z.c(hVar, gVar, g.f19956c)) {
                while (gVar != null) {
                    Thread thread = gVar.f19957a;
                    if (thread != null) {
                        gVar.f19957a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f19958b;
                }
                do {
                    cVar = hVar.f19963v;
                } while (!f19961z.a(hVar, cVar, c.f19946d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f19949c;
                    cVar3.f19949c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f19949c;
                    Runnable runnable = cVar2.f19947a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f19954u;
                        if (hVar.f19962u == eVar) {
                            if (f19961z.b(hVar, eVar, f(eVar.f19955v))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.f19948b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f19960y.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof b)) {
                if (obj == A) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((b) obj).f19945a);
        }
        Throwable th = ((a) obj).f19943b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object f(ac.b bVar) {
        Object obj;
        if (bVar instanceof h) {
            Object obj2 = ((h) bVar).f19962u;
            if (obj2 instanceof a) {
                a aVar = (a) obj2;
                if (aVar.f19942a) {
                    if (aVar.f19943b != null) {
                        return new a(aVar.f19943b, false);
                    }
                    return a.f19941d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = bVar.isCancelled();
        boolean z3 = true;
        if ((!f19959x) & isCancelled) {
            return a.f19941d;
        }
        boolean z9 = false;
        while (true) {
            try {
                try {
                    obj = bVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z9 = z3;
                } catch (Throwable th) {
                    if (z9) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e) {
                if (!isCancelled) {
                    return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e));
                }
                return new a(e, false);
            } catch (ExecutionException e8) {
                return new b(e8.getCause());
            } catch (Throwable th2) {
                return new b(th2);
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return A;
        }
        return obj;
    }

    @Override // ac.b
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f19963v;
        c cVar2 = c.f19946d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f19949c = cVar;
                if (f19961z.a(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f19963v;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
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

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        boolean z9;
        a aVar;
        boolean z10;
        Object obj = this.f19962u;
        if (obj == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!(z9 | (obj instanceof e))) {
            return false;
        }
        if (f19959x) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z3);
        } else if (z3) {
            aVar = a.f19940c;
        } else {
            aVar = a.f19941d;
        }
        h hVar = this;
        boolean z11 = false;
        while (true) {
            if (f19961z.b(hVar, obj, aVar)) {
                c(hVar);
                if (!(obj instanceof e)) {
                    break;
                }
                ac.b bVar = ((e) obj).f19955v;
                if (bVar instanceof h) {
                    hVar = (h) bVar;
                    obj = hVar.f19962u;
                    if (obj == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && !(obj instanceof e)) {
                        break;
                    }
                    z11 = true;
                } else {
                    bVar.cancel(z3);
                    break;
                }
            } else {
                obj = hVar.f19962u;
                if (!(obj instanceof e)) {
                    return z11;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        boolean z3;
        long j11;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        g gVar = g.f19956c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f19962u;
            if (obj != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 & (!(obj instanceof e))) {
                return e(obj);
            }
            if (nanos > 0) {
                j11 = System.nanoTime() + nanos;
            } else {
                j11 = 0;
            }
            if (nanos >= 1000) {
                g gVar2 = this.f19964w;
                if (gVar2 != gVar) {
                    g gVar3 = new g();
                    z9 = true;
                    do {
                        j0 j0Var = f19961z;
                        j0Var.d(gVar3, gVar2);
                        if (j0Var.c(this, gVar2, gVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f19962u;
                                    if (obj2 != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12 & (!(obj2 instanceof e))) {
                                        return e(obj2);
                                    }
                                    nanos = j11 - System.nanoTime();
                                } else {
                                    i(gVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(gVar3);
                        } else {
                            gVar2 = this.f19964w;
                        }
                    } while (gVar2 != gVar);
                }
                return e(this.f19962u);
            }
            z9 = true;
            while (nanos > 0) {
                Object obj3 = this.f19962u;
                if (obj3 != null) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
                if (z11 & (!(obj3 instanceof e))) {
                    return e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j11 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String hVar = toString();
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
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z10) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z10) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(wd0.n(str, " for ", hVar));
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        String valueOf;
        Object obj = this.f19962u;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ac.b bVar = ((e) obj).f19955v;
            if (bVar == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(bVar);
            }
            return a5.a.k(sb2, valueOf, "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void i(g gVar) {
        gVar.f19957a = null;
        while (true) {
            g gVar2 = this.f19964w;
            if (gVar2 != g.f19956c) {
                g gVar3 = null;
                while (gVar2 != null) {
                    g gVar4 = gVar2.f19958b;
                    if (gVar2.f19957a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f19958b = gVar4;
                        if (gVar3.f19957a == null) {
                            break;
                        }
                    } else if (!f19961z.c(this, gVar2, gVar4)) {
                        break;
                    }
                    gVar2 = gVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19962u instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z3;
        if (this.f19962u != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        return (!(r0 instanceof e)) & z3;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f19962u instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = h();
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

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        g gVar = g.f19956c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f19962u;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return e(obj2);
            }
            g gVar2 = this.f19964w;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    j0 j0Var = f19961z;
                    j0Var.d(gVar3, gVar2);
                    if (j0Var.c(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f19962u;
                            } else {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return e(obj);
                    }
                    gVar2 = this.f19964w;
                } while (gVar2 != gVar);
            }
            return e(this.f19962u);
        }
        throw new InterruptedException();
    }
}