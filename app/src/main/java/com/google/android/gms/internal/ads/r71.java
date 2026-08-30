package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class r71 extends z71 {
    public static Object i(ac.b bVar) {
        Object obj;
        Throwable c10;
        if (bVar instanceof p71) {
            Object obj2 = ((r71) bVar).f13105u;
            if (obj2 instanceof k71) {
                k71 k71Var = (k71) obj2;
                if (k71Var.f7679a) {
                    Throwable th = k71Var.f7680b;
                    obj2 = th != null ? new k71(th, false) : k71.f7678d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((bVar instanceof z71) && (c10 = ((z71) bVar).c()) != null) {
            return new n71(c10);
        }
        boolean isCancelled = bVar.isCancelled();
        boolean z3 = true;
        if ((!z71.f13104z) & isCancelled) {
            k71 k71Var2 = k71.f7678d;
            Objects.requireNonNull(k71Var2);
            return k71Var2;
        }
        boolean z9 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = bVar.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new n71(e);
                    }
                } catch (InterruptedException unused) {
                    z9 = z3;
                } catch (Throwable th2) {
                    if (z9) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e8) {
                e = e8;
                return new n71(e);
            } catch (CancellationException e10) {
                if (!isCancelled) {
                    return new n71(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(bVar)), e10));
                }
                return new k71(e10, false);
            } catch (ExecutionException e11) {
                if (isCancelled) {
                    return new k71(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(bVar)), e11), false);
                }
                return new n71(e11.getCause());
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        if (isCancelled) {
            String valueOf = String.valueOf(bVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 84);
            sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb2.append(valueOf);
            return new k71(new IllegalArgumentException(sb2.toString()), false);
        }
        if (obj == null) {
            return z71.f13102x;
        }
        return obj;
    }

    public static Object j(Object obj) {
        if (!(obj instanceof k71)) {
            if (!(obj instanceof n71)) {
                if (obj == z71.f13102x) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((n71) obj).f8584a);
        }
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(((k71) obj).f7680b);
        throw cancellationException;
    }

    public static boolean l(Object obj) {
        return !(obj instanceof l71);
    }

    public static void q(r71 r71Var, boolean z3) {
        o71 o71Var = null;
        while (true) {
            for (y71 H = z71.A.H(r71Var); H != null; H = H.f12808b) {
                Thread thread = H.f12807a;
                if (thread != null) {
                    H.f12807a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z3) {
                r71Var.m();
            }
            r71Var.f();
            o71 o71Var2 = o71Var;
            o71 N = z71.A.N(r71Var);
            o71 o71Var3 = o71Var2;
            while (N != null) {
                o71 o71Var4 = N.f8999c;
                N.f8999c = o71Var3;
                o71Var3 = N;
                N = o71Var4;
            }
            while (o71Var3 != null) {
                Runnable runnable = o71Var3.f8997a;
                o71Var = o71Var3.f8999c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof l71) {
                    l71 l71Var = (l71) runnable;
                    r71Var = l71Var.f7966u;
                    if (r71Var.f13105u == l71Var) {
                        if (z71.A.T(r71Var, l71Var, i(l71Var.f7967v))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = o71Var3.f8998b;
                    Objects.requireNonNull(executor);
                    s(runnable, executor);
                }
                o71Var3 = o71Var;
            }
            return;
            z3 = false;
        }
    }

    public static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger a10 = z71.f13103y.a();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            a10.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", a5.a.l(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e);
        }
    }

    @Override // ac.b
    public void a(Runnable runnable, Executor executor) {
        o71 o71Var;
        o71 o71Var2 = o71.f8996d;
        b80.M(runnable, "Runnable was null.");
        b80.M(executor, "Executor was null.");
        if (!isDone() && (o71Var = this.f13106v) != o71Var2) {
            o71 o71Var3 = new o71(runnable, executor);
            do {
                o71Var3.f8999c = o71Var;
                if (!z71.A.D(this, o71Var, o71Var3)) {
                    o71Var = this.f13106v;
                } else {
                    return;
                }
            } while (o71Var != o71Var2);
        }
        s(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final Throwable c() {
        if (this instanceof p71) {
            Object obj = this.f13105u;
            if (obj instanceof n71) {
                return ((n71) obj).f8584a;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f13105u
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.l71
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L61
            boolean r1 = com.google.android.gms.internal.ads.z71.f13104z
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.k71 r1 = new com.google.android.gms.internal.ads.k71
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r4, r8)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.k71 r1 = com.google.android.gms.internal.ads.k71.f7677c
            goto L26
        L24:
            com.google.android.gms.internal.ads.k71 r1 = com.google.android.gms.internal.ads.k71.f7678d
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.ay0 r6 = com.google.android.gms.internal.ads.z71.A
            boolean r6 = r6.T(r4, r0, r1)
            if (r6 == 0) goto L58
            q(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.l71
            if (r4 == 0) goto L57
            com.google.android.gms.internal.ads.l71 r0 = (com.google.android.gms.internal.ads.l71) r0
            ac.b r0 = r0.f7967v
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.p71
            if (r4 == 0) goto L54
            r4 = r0
            com.google.android.gms.internal.ads.r71 r4 = (com.google.android.gms.internal.ads.r71) r4
            java.lang.Object r0 = r4.f13105u
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.l71
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r3
            goto L2b
        L53:
            return r3
        L54:
            r0.cancel(r8)
        L57:
            return r3
        L58:
            java.lang.Object r0 = r4.f13105u
            boolean r6 = l(r0)
            if (r6 == 0) goto L2b
            return r5
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r71.cancel(boolean):boolean");
    }

    public boolean d(Object obj) {
        if (obj == null) {
            obj = z71.f13102x;
        }
        if (!z71.A.T(this, null, obj)) {
            return false;
        }
        q(this, false);
        return true;
    }

    public boolean e(Throwable th) {
        if (!z71.A.T(this, null, new n71(th))) {
            return false;
        }
        q(this, false);
        return true;
    }

    public void f() {
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        boolean z3;
        long j11;
        long j12;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        y71 y71Var = y71.f12806c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f13105u;
            if (obj != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 & l(obj)) {
                return j(obj);
            }
            long j13 = 0;
            if (nanos > 0) {
                j11 = System.nanoTime() + nanos;
            } else {
                j11 = 0;
            }
            if (nanos >= 1000) {
                y71 y71Var2 = this.f13107w;
                if (y71Var2 != y71Var) {
                    y71 y71Var3 = new y71();
                    z9 = true;
                    while (true) {
                        ay0 ay0Var = z71.A;
                        ay0Var.q(y71Var3, y71Var2);
                        if (ay0Var.x(this, y71Var2, y71Var3)) {
                            j12 = j13;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f13105u;
                                    if (obj2 != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12 & l(obj2)) {
                                        return j(obj2);
                                    }
                                    nanos = j11 - System.nanoTime();
                                } else {
                                    b(y71Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(y71Var3);
                        } else {
                            long j14 = j13;
                            y71Var2 = this.f13107w;
                            if (y71Var2 == y71Var) {
                                break;
                            }
                            j13 = j14;
                        }
                    }
                }
                Object obj3 = this.f13105u;
                Objects.requireNonNull(obj3);
                return j(obj3);
            }
            j12 = 0;
            z9 = true;
            while (nanos > j12) {
                Object obj4 = this.f13105u;
                if (obj4 != null) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
                if (z11 & l(obj4)) {
                    return j(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j11 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String r71Var = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 8 + String.valueOf(lowerCase2).length());
            g3.a.s(sb2, "Waited ", j10, " ");
            sb2.append(lowerCase2);
            String sb3 = sb2.toString();
            if (nanos + 1000 < j12) {
                String concat = sb3.concat(" (plus ");
                long j15 = -nanos;
                long convert = timeUnit.convert(j15, TimeUnit.NANOSECONDS);
                long nanos2 = j15 - timeUnit.toNanos(convert);
                if (convert == j12 || nanos2 > 1000) {
                    z10 = z9;
                } else {
                    z10 = false;
                }
                if (convert > j12) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(convert).length() + concat.length() + 1 + String.valueOf(lowerCase).length());
                    g3.a.s(sb4, concat, convert, " ");
                    sb4.append(lowerCase);
                    String sb5 = sb4.toString();
                    if (z10) {
                        sb5 = sb5.concat(",");
                    }
                    concat = sb5.concat(" ");
                }
                if (z10) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(nanos2).length() + concat.length() + 13);
                    sb6.append(concat);
                    sb6.append(nanos2);
                    sb6.append(" nanoseconds ");
                    concat = sb6.toString();
                }
                sb3 = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(sb3.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(p.a.o(new StringBuilder(sb3.length() + 5 + String.valueOf(r71Var).length()), sb3, " for ", r71Var));
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + 21);
            sb2.append("remaining delay=[");
            sb2.append(delay);
            sb2.append(" ms]");
            return sb2.toString();
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f13105u instanceof k71;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f13105u;
        return (obj != null) & l(obj);
    }

    public void m() {
    }

    public final boolean n() {
        Object obj = this.f13105u;
        if ((obj instanceof k71) && ((k71) obj).f7679a) {
            return true;
        }
        return false;
    }

    public final void o(ac.b bVar) {
        n71 n71Var;
        bVar.getClass();
        Object obj = this.f13105u;
        if (obj == null) {
            if (bVar.isDone()) {
                if (z71.A.T(this, null, i(bVar))) {
                    q(this, false);
                    return;
                }
                return;
            }
            l71 l71Var = new l71(this, bVar);
            if (z71.A.T(this, null, l71Var)) {
                try {
                    bVar.a(l71Var, o81.f9033u);
                    return;
                } catch (Throwable th) {
                    try {
                        n71Var = new n71(th);
                    } catch (Error | Exception unused) {
                        n71Var = n71.f8583b;
                    }
                    z71.A.T(this, l71Var, n71Var);
                    return;
                }
            }
            obj = this.f13105u;
        }
        if (obj instanceof k71) {
            bVar.cancel(((k71) obj).f7679a);
        }
    }

    public final void p(Future future) {
        boolean z3;
        if (future != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 & (this.f13105u instanceof k71)) {
            future.cancel(n());
        }
    }

    public final void r(StringBuilder sb2) {
        Object obj;
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
            } catch (ExecutionException e) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e.getCause());
                sb2.append("]");
                return;
            } catch (Exception e8) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e8.getClass());
                sb2.append(" thrown from get()]");
                return;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        if (obj == null) {
            sb2.append("null");
        } else if (obj == this) {
            sb2.append("this future");
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb2.append("]");
    }

    public String toString() {
        String concat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            r(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f13105u;
            if (obj instanceof l71) {
                sb2.append(", setFuture=[");
                ac.b bVar = ((l71) obj).f7967v;
                try {
                    if (bVar == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(bVar);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    concat = h();
                    if (xy.y(concat)) {
                        concat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    sb2.append(", info=[");
                    sb2.append(concat);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                r(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        y71 y71Var = y71.f12806c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f13105u;
            if ((obj2 != null) & l(obj2)) {
                return j(obj2);
            }
            y71 y71Var2 = this.f13107w;
            if (y71Var2 != y71Var) {
                y71 y71Var3 = new y71();
                do {
                    ay0 ay0Var = z71.A;
                    ay0Var.q(y71Var3, y71Var2);
                    if (ay0Var.x(this, y71Var2, y71Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f13105u;
                            } else {
                                b(y71Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & l(obj)));
                        return j(obj);
                    }
                    y71Var2 = this.f13107w;
                } while (y71Var2 != y71Var);
            }
            Object obj3 = this.f13105u;
            Objects.requireNonNull(obj3);
            return j(obj3);
        }
        throw new InterruptedException();
    }
}
