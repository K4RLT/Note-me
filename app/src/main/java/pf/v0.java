package pf;
import x.o;
import q.x;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class v0 extends q0 implements g0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public n0 A(long j10, Runnable runnable, te.g gVar) {
        return d0.f22739a.A(j10, runnable, gVar);
    }

    @Override // pf.g0
    public final void K(long j10, l lVar) {
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
            r0 r0Var = new r0(this, j11 + nanoTime, lVar);
            l0(nanoTime, r0Var);
            lVar.v(new i(2, r0Var));
        }
    }

    @Override // pf.v
    public final void W(te.g gVar, Runnable runnable) {
        f0(runnable);
    }

    @Override // pf.q0
    public final long d0() {
        t0 t0Var;
        Runnable runnable;
        long j10;
        c4.s sVar = b0.f22726c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        if (!e0()) {
            g0();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                t0Var = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof uf.m) {
                    uf.m mVar = (uf.m) obj;
                    Object d2 = mVar.d();
                    if (d2 != uf.m.f27230g) {
                        runnable = (Runnable) d2;
                        break;
                    }
                    uf.m c10 = mVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == sVar) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            qe.j jVar = this.f22783y;
            if (jVar == null || jVar.isEmpty()) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof uf.m) {
                        long j11 = uf.m.f27229f.get((uf.m) obj2);
                        if (((int) (1073741823 & j11)) != ((int) ((j11 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == sVar) {
                        return Long.MAX_VALUE;
                    }
                }
                u0 u0Var = (u0) B.get(this);
                if (u0Var != null) {
                    synchronized (u0Var) {
                        t0[] t0VarArr = u0Var.f27248a;
                        if (t0VarArr != null) {
                            t0Var = t0VarArr[0];
                        }
                    }
                    if (t0Var != null) {
                        long nanoTime = t0Var.f22794u - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void f0(Runnable runnable) {
        g0();
        if (h0(runnable)) {
            Thread i02 = i0();
            if (Thread.currentThread() != i02) {
                LockSupport.unpark(i02);
                return;
            }
            return;
        }
        c0.D.f0(runnable);
    }

    public final void g0() {
        t0 t0Var;
        t0 t0Var2;
        boolean z3;
        u0 u0Var = (u0) B.get(this);
        if (u0Var == null || uf.x.f27247b.get(u0Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.f27248a;
                    t0Var = null;
                    if (t0VarArr != null) {
                        t0Var2 = t0VarArr[0];
                    } else {
                        t0Var2 = null;
                    }
                    if (t0Var2 != null) {
                        if (nanoTime - t0Var2.f22794u >= 0) {
                            z3 = h0(t0Var2);
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            t0Var = u0Var.b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (t0Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = pf.v0.A
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = pf.v0.C
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof uf.m
            if (r4 == 0) goto L47
            r4 = r1
            uf.m r4 = (uf.m) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            uf.m r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            c4.s r4 = pf.b0.f22726c
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            uf.m r3 = new uf.m
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.v0.h0(java.lang.Runnable):boolean");
    }

    public abstract Thread i0();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r0 == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j0() {
        /*
            r7 = this;
            qe.j r0 = r7.f22783y
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = pf.v0.B
            java.lang.Object r0 = r0.get(r7)
            pf.u0 r0 = (pf.u0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = uf.x.f27247b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = pf.v0.A
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof uf.m
            if (r3 == 0) goto L4f
            uf.m r0 = (uf.m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = uf.m.f27229f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            c4.s r3 = pf.b0.f22726c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.v0.j0():boolean");
    }

    public void k0(long j10, t0 t0Var) {
        c0.D.l0(j10, t0Var);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, pf.u0] */
    public final void l0(long j10, t0 t0Var) {
        int c10;
        Thread i02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        t0 t0Var2 = null;
        if (C.get(this) != 0) {
            c10 = 1;
        } else {
            u0 u0Var = (u0) atomicReferenceFieldUpdater.get(this);
            if (u0Var == null) {
                Object obj = new Object();
                obj.f22798c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                obj2.getClass();
                u0Var = (u0) obj2;
            }
            c10 = t0Var.c(j10, u0Var, this);
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    x.o("unexpected result");
                    return;
                }
                return;
            }
            k0(j10, t0Var);
            return;
        }
        u0 u0Var2 = (u0) atomicReferenceFieldUpdater.get(this);
        if (u0Var2 != null) {
            synchronized (u0Var2) {
                t0[] t0VarArr = u0Var2.f27248a;
                if (t0VarArr != null) {
                    t0Var2 = t0VarArr[0];
                }
            }
        }
        if (t0Var2 == t0Var && Thread.currentThread() != (i02 = i0())) {
            LockSupport.unpark(i02);
        }
    }

    @Override // pf.q0
    public void shutdown() {
        t0 t0Var;
        u1.f22799a.set(null);
        C.set(this, 1);
        c4.s sVar = b0.f22726c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, sVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else {
                if (obj instanceof uf.m) {
                    ((uf.m) obj).b();
                    break;
                }
                if (obj != sVar) {
                    uf.m mVar = new uf.m(8, true);
                    mVar.a((Runnable) obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        do {
        } while (d0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            u0 u0Var = (u0) B.get(this);
            if (u0Var != null) {
                synchronized (u0Var) {
                    if (uf.x.f27247b.get(u0Var) > 0) {
                        t0Var = u0Var.b(0);
                    } else {
                        t0Var = null;
                    }
                }
                if (t0Var != null) {
                    k0(nanoTime, t0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}