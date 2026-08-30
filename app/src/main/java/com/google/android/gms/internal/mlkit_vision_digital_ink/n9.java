package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;
import p.a;
import q.h;
import r6.d;

import com.google.android.gms.internal.ads.wd0;
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

/* loaded from: classes.dex */
public abstract class n9 extends s9 {
    public static Object h(ya yaVar) {
        Object obj;
        Throwable c10;
        if (yaVar instanceof l9) {
            Object obj2 = ((n9) yaVar).f14968u;
            if (obj2 instanceof h9) {
                h9 h9Var = (h9) obj2;
                if (h9Var.f14401a) {
                    Throwable th = h9Var.f14402b;
                    obj2 = th != null ? new h9(th, false) : h9.f14400d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((yaVar instanceof s9) && (c10 = ((s9) yaVar).c()) != null) {
            return new j9(c10);
        }
        boolean isCancelled = yaVar.isCancelled();
        boolean z3 = true;
        if ((!s9.f14967z) & isCancelled) {
            h9 h9Var2 = h9.f14400d;
            Objects.requireNonNull(h9Var2);
            return h9Var2;
        }
        boolean z9 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = yaVar.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new j9(e);
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
                return new j9(e);
            } catch (CancellationException e10) {
                if (!isCancelled) {
                    return new j9(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(yaVar)), e10));
                }
                return new h9(e10, false);
            } catch (ExecutionException e11) {
                if (isCancelled) {
                    return new h9(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(yaVar)), e11), false);
                }
                return new j9(e11.getCause());
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        if (isCancelled) {
            return new h9(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(yaVar))), false);
        }
        if (obj == null) {
            return s9.f14965x;
        }
        return obj;
    }

    public static Object i(Object obj) {
        if (!(obj instanceof h9)) {
            if (!(obj instanceof j9)) {
                if (obj == s9.f14965x) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((j9) obj).f14508a);
        }
        Throwable th = ((h9) obj).f14402b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static boolean m(Object obj) {
        return !(obj instanceof i9);
    }

    public static void r(n9 n9Var, boolean z3) {
        k9 k9Var = null;
        while (true) {
            for (r9 k3 = s9.A.k(n9Var); k3 != null; k3 = k3.f14896b) {
                Thread thread = k3.f14895a;
                if (thread != null) {
                    k3.f14895a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z3) {
                n9Var.j();
            }
            n9Var.e();
            k9 k9Var2 = k9Var;
            k9 b10 = s9.A.b(n9Var);
            k9 k9Var3 = k9Var2;
            while (b10 != null) {
                k9 k9Var4 = b10.f14563c;
                b10.f14563c = k9Var3;
                k9Var3 = b10;
                b10 = k9Var4;
            }
            while (k9Var3 != null) {
                Runnable runnable = k9Var3.f14561a;
                k9Var = k9Var3.f14563c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof i9) {
                    i9 i9Var = (i9) runnable;
                    n9Var = i9Var.f14471u;
                    if (n9Var.f14968u == i9Var) {
                        if (s9.A.y(n9Var, i9Var, h(i9Var.f14472v))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = k9Var3.f14562b;
                    Objects.requireNonNull(executor);
                    s(runnable, executor);
                }
                k9Var3 = k9Var;
            }
            return;
            z3 = false;
        }
    }

    public static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            s9.f14966y.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", p.a.l("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.s9
    public final Throwable c() {
        if (this instanceof l9) {
            Object obj = this.f14968u;
            if (obj instanceof j9) {
                return ((j9) obj).f14508a;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
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
            java.lang.Object r0 = r7.f14968u
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.i9
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L60
            boolean r1 = com.google.android.gms.internal.mlkit_vision_digital_ink.s9.f14967z
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.mlkit_vision_digital_ink.h9 r1 = new com.google.android.gms.internal.mlkit_vision_digital_ink.h9
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r4, r8)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.mlkit_vision_digital_ink.h9 r1 = com.google.android.gms.internal.mlkit_vision_digital_ink.h9.f14399c
            goto L26
        L24:
            com.google.android.gms.internal.mlkit_vision_digital_ink.h9 r1 = com.google.android.gms.internal.mlkit_vision_digital_ink.h9.f14400d
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.mlkit_vision_digital_ink.tl r6 = com.google.android.gms.internal.mlkit_vision_digital_ink.s9.A
            boolean r6 = r6.y(r4, r0, r1)
            if (r6 == 0) goto L57
            r(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.i9
            if (r4 == 0) goto L56
            com.google.android.gms.internal.mlkit_vision_digital_ink.i9 r0 = (com.google.android.gms.internal.mlkit_vision_digital_ink.i9) r0
            com.google.android.gms.internal.mlkit_vision_digital_ink.ya r0 = r0.f14472v
            boolean r4 = r0 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.l9
            if (r4 == 0) goto L53
            r4 = r0
            com.google.android.gms.internal.mlkit_vision_digital_ink.n9 r4 = (com.google.android.gms.internal.mlkit_vision_digital_ink.n9) r4
            java.lang.Object r0 = r4.f14968u
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.i9
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = r3
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            return r3
        L57:
            java.lang.Object r0 = r4.f14968u
            boolean r6 = m(r0)
            if (r6 == 0) goto L2b
            return r5
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.n9.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String d() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public void e() {
    }

    public boolean f(ya yaVar) {
        j9 j9Var;
        yaVar.getClass();
        Object obj = this.f14968u;
        if (obj == null) {
            if (yaVar.isDone()) {
                if (s9.A.y(this, null, h(yaVar))) {
                    r(this, false);
                    return true;
                }
                return false;
            }
            i9 i9Var = new i9(this, yaVar);
            if (s9.A.y(this, null, i9Var)) {
                try {
                    yaVar.g(i9Var, ia.f14473u);
                    return true;
                } catch (Throwable th) {
                    try {
                        j9Var = new j9(th);
                    } catch (Error | Exception unused) {
                        j9Var = j9.f14507b;
                    }
                    s9.A.y(this, i9Var, j9Var);
                    return true;
                }
            }
            obj = this.f14968u;
        }
        if (obj instanceof h9) {
            yaVar.cancel(((h9) obj).f14401a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ya
    public void g(Runnable runnable, Executor executor) {
        k9 k9Var;
        k9 k9Var2 = k9.f14560d;
        if (executor != null) {
            if (!isDone() && (k9Var = this.f14969v) != k9Var2) {
                k9 k9Var3 = new k9(runnable, executor);
                do {
                    k9Var3.f14563c = k9Var;
                    if (!s9.A.w(this, k9Var, k9Var3)) {
                        k9Var = this.f14969v;
                    } else {
                        return;
                    }
                } while (k9Var != k9Var2);
            }
            s(runnable, executor);
            return;
        }
        g5.q.h("Executor was null.");
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        boolean z3;
        long j11;
        long j12;
        boolean z9;
        boolean z10;
        boolean z11;
        r9 r9Var = r9.f14894c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f14968u;
            if (obj != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 & m(obj)) {
                return i(obj);
            }
            long j13 = 0;
            if (nanos > 0) {
                j11 = System.nanoTime() + nanos;
            } else {
                j11 = 0;
            }
            if (nanos >= 1000) {
                r9 r9Var2 = this.f14970w;
                if (r9Var2 != r9Var) {
                    r9 r9Var3 = new r9();
                    while (true) {
                        tl tlVar = s9.A;
                        tlVar.r(r9Var3, r9Var2);
                        if (tlVar.z(this, r9Var2, r9Var3)) {
                            j12 = j13;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f14968u;
                                    if (obj2 != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11 & m(obj2)) {
                                        return i(obj2);
                                    }
                                    nanos = j11 - System.nanoTime();
                                } else {
                                    b(r9Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(r9Var3);
                        } else {
                            long j14 = j13;
                            r9Var2 = this.f14970w;
                            if (r9Var2 == r9Var) {
                                break;
                            }
                            j13 = j14;
                        }
                    }
                }
                Object obj3 = this.f14968u;
                Objects.requireNonNull(obj3);
                return i(obj3);
            }
            j12 = 0;
            while (nanos > j12) {
                Object obj4 = this.f14968u;
                if (obj4 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 & m(obj4)) {
                    return i(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j11 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String n9Var = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j12) {
                String concat = str.concat(" (plus ");
                long j15 = -nanos;
                long convert = timeUnit.convert(j15, TimeUnit.NANOSECONDS);
                long nanos2 = j15 - timeUnit.toNanos(convert);
                if (convert == j12 || nanos2 > 1000) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (convert > j12) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z9) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z9) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(wd0.n(str, " for ", n9Var));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f14968u instanceof h9;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f14968u;
        return (obj != null) & m(obj);
    }

    public void j() {
    }

    public final void l(Future future) {
        boolean z3;
        if (future != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 & isCancelled()) {
            future.cancel(p());
        }
    }

    public boolean n(Object obj) {
        if (obj == null) {
            obj = s9.f14965x;
        }
        if (!s9.A.y(this, null, obj)) {
            return false;
        }
        r(this, false);
        return true;
    }

    public final boolean o(Throwable th) {
        th.getClass();
        if (!s9.A.y(this, null, new j9(th))) {
            return false;
        }
        r(this, false);
        return true;
    }

    public final boolean p() {
        Object obj = this.f14968u;
        if ((obj instanceof h9) && ((h9) obj).f14401a) {
            return true;
        }
        return false;
    }

    public final void q(StringBuilder sb2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r3.isEmpty() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Le2
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.q(r0)
            goto Le2
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f14968u
            boolean r4 = r3 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.i9
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L9d
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.android.gms.internal.mlkit_vision_digital_ink.i9 r3 = (com.google.android.gms.internal.mlkit_vision_digital_ink.i9) r3
            com.google.android.gms.internal.mlkit_vision_digital_ink.ya r3 = r3.f14472v
            if (r3 != r6) goto L7f
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L99
        L7d:
            r3 = move-exception
            goto L83
        L7f:
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L99
        L83:
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto L8f
            boolean r4 = r3 instanceof java.lang.StackOverflowError
            if (r4 == 0) goto L8c
            goto L8f
        L8c:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        L8f:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L99:
            r0.append(r2)
            goto Ld2
        L9d:
            java.lang.String r3 = r6.d()     // Catch: java.lang.Throwable -> Lac
            r4 = 0
            if (r3 == 0) goto Laa
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lac
            if (r5 == 0) goto Lc5
        Laa:
            r3 = r4
            goto Lc5
        Lac:
            r3 = move-exception
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto Lb9
            boolean r4 = r3 instanceof java.lang.StackOverflowError
            if (r4 == 0) goto Lb6
            goto Lb9
        Lb6:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        Lb9:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
        Lc5:
            if (r3 == 0) goto Ld2
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Ld2:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Le2
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.q(r0)
        Le2:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.n9.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        r9 r9Var = r9.f14894c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f14968u;
            if ((obj2 != null) & m(obj2)) {
                return i(obj2);
            }
            r9 r9Var2 = this.f14970w;
            if (r9Var2 != r9Var) {
                r9 r9Var3 = new r9();
                do {
                    tl tlVar = s9.A;
                    tlVar.r(r9Var3, r9Var2);
                    if (tlVar.z(this, r9Var2, r9Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f14968u;
                            } else {
                                b(r9Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & m(obj)));
                        return i(obj);
                    }
                    r9Var2 = this.f14970w;
                } while (r9Var2 != r9Var);
            }
            Object obj3 = this.f14968u;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        throw new InterruptedException();
    }
}
