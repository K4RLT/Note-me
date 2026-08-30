package wf;

import c4.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import pf.b0;
import q.x;
import uf.p;
import w7.i1;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater B = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater C = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final s E = new s("NOT_IN_STACK", 8);
    public final p A;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: u, reason: collision with root package name */
    public final int f29907u;

    /* renamed from: v, reason: collision with root package name */
    public final int f29908v;

    /* renamed from: w, reason: collision with root package name */
    public final long f29909w;

    /* renamed from: x, reason: collision with root package name */
    public final String f29910x;

    /* renamed from: y, reason: collision with root package name */
    public final f f29911y;

    /* renamed from: z, reason: collision with root package name */
    public final f f29912z;

    /* JADX WARN: Type inference failed for: r4v6, types: [wf.f, uf.k] */
    /* JADX WARN: Type inference failed for: r4v7, types: [wf.f, uf.k] */
    public c(int i, int i10, long j10, String str) {
        this.f29907u = i;
        this.f29908v = i10;
        this.f29909w = j10;
        this.f29910x = str;
        if (i >= 1) {
            if (i10 >= i) {
                if (i10 <= 2097150) {
                    if (j10 > 0) {
                        this.f29911y = new uf.k();
                        this.f29912z = new uf.k();
                        this.A = new p((i + 1) * 2);
                        this.controlState$volatile = i << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                x.j(g3.a.i("Max pool size ", i10, " should not exceed maximal supported number of threads 2097150"));
                throw null;
            }
            x.j(i1.c("Max pool size ", i10, i, " should be greater than or equals to core pool size "));
            throw null;
        }
        x.j(g3.a.i("Core pool size ", i, " should be at least 1"));
        throw null;
    }

    public static /* synthetic */ void k(c cVar, Runnable runnable, int i) {
        boolean z3;
        if ((i & 4) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        cVar.j(runnable, false, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = wf.c.D
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof wf.a
            r3 = 0
            if (r1 == 0) goto L17
            wf.a r0 = (wf.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            wf.c r1 = r0.B
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            uf.p r1 = r8.A
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = wf.c.C     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            uf.p r5 = r8.A
            java.lang.Object r5 = r5.b(r1)
            r5.getClass()
            wf.a r5 = (wf.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            wf.l r5 = r5.f29895u
            wf.f r6 = r8.f29912z
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = wf.l.f29927b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            wf.h r7 = (wf.h) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            wf.h r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            wf.f r1 = r8.f29912z
            r1.b()
            wf.f r1 = r8.f29911y
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            wf.h r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            wf.f r1 = r8.f29911y
            java.lang.Object r1 = r1.d()
            wf.h r1 = (wf.h) r1
            if (r1 != 0) goto Lb2
            wf.f r1 = r8.f29912z
            java.lang.Object r1 = r1.d()
            wf.h r1 = (wf.h) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            wf.b r1 = wf.b.f29905y
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = wf.c.B
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = wf.c.C
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.c.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        k(this, runnable, 6);
    }

    public final int f() {
        boolean z3;
        synchronized (this.A) {
            try {
                if (D.get(this) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = C;
                long j10 = atomicLongFieldUpdater.get(this);
                int i = (int) (j10 & 2097151);
                int i10 = i - ((int) ((j10 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f29907u) {
                    return 0;
                }
                if (i >= this.f29908v) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 > 0 && this.A.b(i11) == null) {
                    a aVar = new a(this, i11);
                    this.A.c(i11, aVar);
                    if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i12 = i10 + 1;
                        aVar.start();
                        return i12;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Runnable runnable, boolean z3, boolean z9) {
        h iVar;
        long j10;
        a aVar;
        boolean a10;
        b bVar;
        j.f29925f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f29918u = nanoTime;
            iVar.f29919v = z3;
        } else {
            iVar = new i(runnable, nanoTime, z3);
        }
        boolean z10 = iVar.f29919v;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C;
        if (z10) {
            j10 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j10 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !aVar.B.equals(this)) {
            aVar = null;
        }
        boolean z11 = true;
        if (aVar != null && (bVar = aVar.f29897w) != b.f29905y && (iVar.f29919v || bVar != b.f29902v)) {
            aVar.A = true;
            l lVar = aVar.f29895u;
            if (z9) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f29927b.getAndSet(lVar, iVar);
                if (hVar == null) {
                    iVar = null;
                } else {
                    iVar = lVar.a(hVar);
                }
            }
        }
        if (iVar != null) {
            if (iVar.f29919v) {
                a10 = this.f29912z.a(iVar);
            } else {
                a10 = this.f29911y.a(iVar);
            }
            if (!a10) {
                throw new RejectedExecutionException(a5.a.k(new StringBuilder(), this.f29910x, " was terminated"));
            }
        }
        if (!z9 || aVar == null) {
            z11 = false;
        }
        if (z10) {
            if (!z11 && !p() && !o(j10)) {
                p();
                return;
            }
            return;
        }
        if (z11 || p() || o(atomicLongFieldUpdater.get(this))) {
            return;
        }
        p();
    }

    public final void m(a aVar, int i, int i10) {
        while (true) {
            long j10 = B.get(this);
            int i11 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i11 == i) {
                if (i10 == 0) {
                    Object c10 = aVar.c();
                    while (true) {
                        if (c10 == E) {
                            i11 = -1;
                            break;
                        }
                        if (c10 == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) c10;
                        int b10 = aVar2.b();
                        if (b10 != 0) {
                            i11 = b10;
                            break;
                        }
                        c10 = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (B.compareAndSet(this, j10, i11 | j11)) {
                    return;
                }
            }
        }
    }

    public final boolean o(long j10) {
        int i = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i10 = this.f29907u;
        if (i < i10) {
            int f10 = f();
            if (f10 == 1 && i10 > 1) {
                f();
            }
            if (f10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        s sVar;
        int i;
        while (true) {
            long j10 = B.get(this);
            a aVar = (a) this.A.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object c10 = aVar.c();
                while (true) {
                    sVar = E;
                    if (c10 == sVar) {
                        i = -1;
                        break;
                    }
                    if (c10 == null) {
                        i = 0;
                        break;
                    }
                    a aVar2 = (a) c10;
                    i = aVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c10 = aVar2.c();
                }
                if (i >= 0) {
                    if (B.compareAndSet(this, j10, i | j11)) {
                        aVar.g(sVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.C.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        int i;
        ArrayList arrayList = new ArrayList();
        p pVar = this.A;
        int a10 = pVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            a aVar = (a) pVar.b(i15);
            if (aVar != null) {
                l lVar = aVar.f29895u;
                lVar.getClass();
                if (l.f29927b.get(lVar) != null) {
                    i = (l.f29928c.get(lVar) - l.f29929d.get(lVar)) + 1;
                } else {
                    i = l.f29928c.get(lVar) - l.f29929d.get(lVar);
                }
                int ordinal = aVar.f29897w.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i14++;
                                } else {
                                    l4.a.o();
                                    return null;
                                }
                            } else {
                                i13++;
                                if (i > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(i);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        i11++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i10++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                }
            }
        }
        long j10 = C.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f29910x);
        sb5.append('@');
        sb5.append(b0.o(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f29907u;
        sb5.append(i16);
        sb5.append(", max = ");
        a5.a.n(this.f29908v, i10, "}, Worker States {CPU = ", ", blocking = ", sb5);
        a5.a.n(i11, i12, ", parked = ", ", dormant = ", sb5);
        a5.a.n(i13, i14, ", terminated = ", "}, running workers queues = ", sb5);
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f29911y.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f29912z.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
