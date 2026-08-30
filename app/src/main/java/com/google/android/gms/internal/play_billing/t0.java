package com.google.android.gms.internal.play_billing;
import p.a;
import q.h;

import com.google.android.gms.internal.ads.wd0;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class t0 extends k0 implements r0 {
    public r0 B;
    public ScheduledFuture C;

    public static Object d(Object obj) {
        if (!(obj instanceof c0)) {
            if (!(obj instanceof e0)) {
                if (obj == k0.f15470x) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((e0) obj).f15411a);
        }
        Throwable th = ((c0) obj).f15393b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static boolean f(Object obj) {
        if (!(obj instanceof d0)) {
            return true;
        }
        return false;
    }

    public static Object h(r0 r0Var) {
        Object obj;
        Throwable c10;
        if (r0Var instanceof t0) {
            Object obj2 = ((t0) r0Var).f15473u;
            if (obj2 instanceof c0) {
                c0 c0Var = (c0) obj2;
                if (c0Var.f15392a) {
                    Throwable th = c0Var.f15393b;
                    obj2 = th != null ? new c0(th, false) : c0.f15391d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((r0Var instanceof k0) && (c10 = ((k0) r0Var).c()) != null) {
            return new e0(c10);
        }
        boolean isCancelled = r0Var.isCancelled();
        boolean z3 = true;
        if ((!k0.f15472z) & isCancelled) {
            c0 c0Var2 = c0.f15391d;
            Objects.requireNonNull(c0Var2);
            return c0Var2;
        }
        boolean z9 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = r0Var.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new e0(e);
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
                return new e0(e);
            } catch (CancellationException e10) {
                if (!isCancelled) {
                    return new e0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(r0Var)), e10));
                }
                return new c0(e10, false);
            } catch (ExecutionException e11) {
                if (isCancelled) {
                    return new c0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(r0Var)), e11), false);
                }
                return new e0(e11.getCause());
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        if (isCancelled) {
            return new c0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(r0Var))), false);
        }
        if (obj == null) {
            return k0.f15470x;
        }
        return obj;
    }

    public static void j(t0 t0Var) {
        boolean z3;
        f0 f0Var;
        f0 f0Var2 = null;
        while (true) {
            t0Var.getClass();
            for (j0 b10 = k0.A.b(t0Var); b10 != null; b10 = b10.f15459b) {
                Thread thread = b10.f15458a;
                if (thread != null) {
                    b10.f15458a = null;
                    LockSupport.unpark(thread);
                }
            }
            r0 r0Var = t0Var.B;
            boolean z9 = t0Var.f15473u instanceof c0;
            boolean z10 = true;
            if (r0Var != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z9 & z3) {
                Object obj = t0Var.f15473u;
                if (!(obj instanceof c0) || !((c0) obj).f15392a) {
                    z10 = false;
                }
                r0Var.cancel(z10);
            }
            ScheduledFuture scheduledFuture = t0Var.C;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            t0Var.B = null;
            t0Var.C = null;
            f0 f0Var3 = f0Var2;
            f0 a10 = k0.A.a(t0Var);
            f0 f0Var4 = f0Var3;
            while (a10 != null) {
                f0 f0Var5 = a10.f15419c;
                a10.f15419c = f0Var4;
                f0Var4 = a10;
                a10 = f0Var5;
            }
            while (f0Var4 != null) {
                Runnable runnable = f0Var4.f15417a;
                f0Var = f0Var4.f15419c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof d0) {
                    d0 d0Var = (d0) runnable;
                    t0Var = d0Var.f15400u;
                    if (t0Var.f15473u == d0Var) {
                        if (k0.A.f(t0Var, d0Var, h(d0Var.f15401v))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = f0Var4.f15418b;
                    Objects.requireNonNull(executor);
                    l(runnable, executor);
                }
                f0Var4 = f0Var;
            }
            return;
            f0Var2 = f0Var;
        }
    }

    public static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            k0.f15471y.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", a.l("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.k0
    public final Throwable c() {
        if (this instanceof t0) {
            Object obj = this.f15473u;
            if (obj instanceof e0) {
                return ((e0) obj).f15411a;
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
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f15473u
            boolean r1 = r0 instanceof com.google.android.gms.internal.play_billing.d0
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
            boolean r1 = com.google.android.gms.internal.play_billing.k0.f15472z
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.play_billing.c0 r1 = new com.google.android.gms.internal.play_billing.c0
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r4, r8)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.play_billing.c0 r1 = com.google.android.gms.internal.play_billing.c0.f15390c
            goto L26
        L24:
            com.google.android.gms.internal.play_billing.c0 r1 = com.google.android.gms.internal.play_billing.c0.f15391d
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            wa.e0 r6 = com.google.android.gms.internal.play_billing.k0.A
            boolean r6 = r6.f(r4, r0, r1)
            if (r6 == 0) goto L57
            j(r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.play_billing.d0
            if (r4 == 0) goto L56
            com.google.android.gms.internal.play_billing.d0 r0 = (com.google.android.gms.internal.play_billing.d0) r0
            com.google.android.gms.internal.play_billing.r0 r0 = r0.f15401v
            boolean r4 = r0 instanceof com.google.android.gms.internal.play_billing.t0
            if (r4 == 0) goto L53
            r4 = r0
            com.google.android.gms.internal.play_billing.t0 r4 = (com.google.android.gms.internal.play_billing.t0) r4
            java.lang.Object r0 = r4.f15473u
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.play_billing.d0
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = r3
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            return r3
        L57:
            java.lang.Object r0 = r4.f15473u
            boolean r6 = f(r0)
            if (r6 == 0) goto L2b
            return r5
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.t0.cancel(boolean):boolean");
    }

    public final String e() {
        r0 r0Var = this.B;
        ScheduledFuture scheduledFuture = this.C;
        if (r0Var != null) {
            String k3 = a.k("inputFuture=[", r0Var.toString(), "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return k3 + ", remaining delay=[" + delay + " ms]";
                }
                return k3;
            }
            return k3;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        boolean z3;
        long j11;
        long j12;
        boolean z9;
        boolean z10;
        boolean z11;
        j0 j0Var = j0.f15457c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f15473u;
            if (obj != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 & f(obj)) {
                return d(obj);
            }
            long j13 = 0;
            if (nanos > 0) {
                j11 = System.nanoTime() + nanos;
            } else {
                j11 = 0;
            }
            if (nanos >= 1000) {
                j0 j0Var2 = this.f15475w;
                if (j0Var2 != j0Var) {
                    j0 j0Var3 = new j0();
                    while (true) {
                        wa.e0 e0Var = k0.A;
                        e0Var.c(j0Var3, j0Var2);
                        if (e0Var.g(this, j0Var2, j0Var3)) {
                            j12 = j13;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f15473u;
                                    if (obj2 != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11 & f(obj2)) {
                                        return d(obj2);
                                    }
                                    nanos = j11 - System.nanoTime();
                                } else {
                                    b(j0Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(j0Var3);
                        } else {
                            long j14 = j13;
                            j0Var2 = this.f15475w;
                            if (j0Var2 == j0Var) {
                                break;
                            }
                            j13 = j14;
                        }
                    }
                }
                Object obj3 = this.f15473u;
                Objects.requireNonNull(obj3);
                return d(obj3);
            }
            j12 = 0;
            while (nanos > j12) {
                Object obj4 = this.f15473u;
                if (obj4 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 & f(obj4)) {
                    return d(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j11 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String t0Var = toString();
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
            throw new TimeoutException(wd0.n(str, " for ", t0Var));
        }
        throw new InterruptedException();
    }

    public final void i(StringBuilder sb2) {
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15473u instanceof c0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z3;
        Object obj = this.f15473u;
        boolean f10 = f(obj);
        if (obj != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        return z3 & f10;
    }

    @Override // com.google.android.gms.internal.play_billing.r0
    public final void k(Runnable runnable, Executor executor) {
        f0 f0Var;
        f0 f0Var2 = f0.f15416d;
        if (executor != null) {
            if (!isDone() && (f0Var = this.f15474v) != f0Var2) {
                f0 f0Var3 = new f0(runnable, executor);
                do {
                    f0Var3.f15419c = f0Var;
                    if (!k0.A.e(this, f0Var, f0Var3)) {
                        f0Var = this.f15474v;
                    } else {
                        return;
                    }
                } while (f0Var != f0Var2);
            }
            l(runnable, executor);
            return;
        }
        g5.h("Executor was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
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
            java.lang.Object r1 = r6.f15473u
            boolean r1 = r1 instanceof com.google.android.gms.internal.play_billing.c0
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Le8
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.i(r0)
            goto Le8
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f15473u
            boolean r4 = r3 instanceof com.google.android.gms.internal.play_billing.d0
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L9d
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.android.gms.internal.play_billing.d0 r3 = (com.google.android.gms.internal.play_billing.d0) r3
            com.google.android.gms.internal.play_billing.r0 r3 = r3.f15401v
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
            goto Ld8
        L9d:
            java.lang.String r3 = r6.e()     // Catch: java.lang.Throwable -> Lac
            if (r3 == 0) goto Lae
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lac
            if (r4 == 0) goto Laa
            goto Lae
        Laa:
            r4 = 0
            goto Laf
        Lac:
            r3 = move-exception
            goto Lb3
        Lae:
            r4 = 1
        Laf:
            if (r4 == 0) goto Lcb
            r3 = 0
            goto Lcb
        Lb3:
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto Lbf
            boolean r4 = r3 instanceof java.lang.StackOverflowError
            if (r4 == 0) goto Lbc
            goto Lbf
        Lbc:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        Lbf:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
        Lcb:
            if (r3 == 0) goto Ld8
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Ld8:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Le8
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.i(r0)
        Le8:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.t0.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        j0 j0Var = j0.f15457c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f15473u;
            if ((obj2 != null) & f(obj2)) {
                return d(obj2);
            }
            j0 j0Var2 = this.f15475w;
            if (j0Var2 != j0Var) {
                j0 j0Var3 = new j0();
                do {
                    wa.e0 e0Var = k0.A;
                    e0Var.c(j0Var3, j0Var2);
                    if (e0Var.g(this, j0Var2, j0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15473u;
                            } else {
                                b(j0Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & f(obj)));
                        return d(obj);
                    }
                    j0Var2 = this.f15475w;
                } while (j0Var2 != j0Var);
            }
            Object obj3 = this.f15473u;
            Objects.requireNonNull(obj3);
            return d(obj3);
        }
        throw new InterruptedException();
    }
}
