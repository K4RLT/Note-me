package wf;
import l.e;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.y;

/* loaded from: classes.dex */
public final class a extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public boolean A;
    public final /* synthetic */ c B;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* renamed from: u, reason: collision with root package name */
    public final l f29895u;

    /* renamed from: v, reason: collision with root package name */
    public final y f29896v;

    /* renamed from: w, reason: collision with root package name */
    public b f29897w;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* renamed from: x, reason: collision with root package name */
    public long f29898x;

    /* renamed from: y, reason: collision with root package name */
    public long f29899y;

    /* renamed from: z, reason: collision with root package name */
    public int f29900z;

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.jvm.internal.y] */
    public a(c cVar, int i) {
        this.B = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f29895u = new l();
        this.f29896v = new Object();
        this.f29897w = b.f29904x;
        this.nextParkedWorker = c.E;
        int nanoTime = (int) System.nanoTime();
        this.f29900z = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final h a(boolean z3) {
        h e;
        h e8;
        long j10;
        b bVar = this.f29897w;
        c cVar = this.B;
        h hVar = null;
        boolean z9 = true;
        l lVar = this.f29895u;
        b bVar2 = b.f29901u;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.C;
            do {
                j10 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f29927b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 == null || !hVar2.f29919v) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                break;
                            }
                        }
                        hVar = hVar2;
                    }
                    int i = l.f29929d.get(lVar);
                    int i10 = l.f29928c.get(lVar);
                    while (true) {
                        if (i == i10 || e.get(lVar) == 0) {
                            break;
                        }
                        i10--;
                        h c10 = lVar.c(i10, true);
                        if (c10 != null) {
                            hVar = c10;
                            break;
                        }
                    }
                    if (hVar == null) {
                        h hVar3 = (h) cVar.f29912z.d();
                        if (hVar3 == null) {
                            return i(1);
                        }
                        return hVar3;
                    }
                    return hVar;
                }
            } while (!c.C.compareAndSet(cVar, j10, j10 - 4398046511104L));
            this.f29897w = bVar2;
        }
        if (z3) {
            if (d(cVar.f29907u * 2) != 0) {
                z9 = false;
            }
            if (z9 && (e8 = e()) != null) {
                return e8;
            }
            lVar.getClass();
            h hVar4 = (h) l.f29927b.getAndSet(lVar, null);
            if (hVar4 == null) {
                hVar4 = lVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z9 && (e = e()) != null) {
                return e;
            }
        } else {
            h e10 = e();
            if (e10 != null) {
                return e10;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i10 = this.f29900z;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f29900z = i13;
        int i14 = i - 1;
        if ((i14 & i) == 0) {
            return i13 & i14;
        }
        return (i13 & Integer.MAX_VALUE) % i;
    }

    public final h e() {
        int d2 = d(2);
        c cVar = this.B;
        f fVar = cVar.f29912z;
        f fVar2 = cVar.f29911y;
        if (d2 == 0) {
            h hVar = (h) fVar2.d();
            if (hVar != null) {
                return hVar;
            }
            return (h) fVar.d();
        }
        h hVar2 = (h) fVar.d();
        if (hVar2 != null) {
            return hVar2;
        }
        return (h) fVar2.d();
    }

    public final void f(int i) {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.B.f29910x);
        sb2.append("-worker-");
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        sb2.append(valueOf);
        setName(sb2.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        boolean z3;
        b bVar2 = this.f29897w;
        if (bVar2 == b.f29901u) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            c.C.addAndGet(this.B, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f29897w = bVar;
        }
        return z3;
    }

    public final h i(int i) {
        boolean z3;
        long j10;
        h hVar;
        long j11;
        long j12;
        h hVar2;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.C;
        c cVar = this.B;
        int i11 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        h hVar3 = null;
        if (i11 < 2) {
            return null;
        }
        int d2 = d(i11);
        int i12 = 0;
        long j13 = Long.MAX_VALUE;
        while (i12 < i11) {
            d2++;
            if (d2 > i11) {
                d2 = 1;
            }
            a aVar = (a) cVar.A.b(d2);
            if (aVar != null && aVar != this) {
                l lVar = aVar.f29895u;
                if (i == 3) {
                    hVar = lVar.b();
                    j10 = 0;
                } else {
                    lVar.getClass();
                    int i13 = l.f29929d.get(lVar);
                    int i14 = l.f29928c.get(lVar);
                    if (i == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    while (true) {
                        if (i13 != i14) {
                            j10 = 0;
                            if (!z3 || e.get(lVar) != 0) {
                                int i15 = i13 + 1;
                                hVar = lVar.c(i13, z3);
                                if (hVar != null) {
                                    break;
                                }
                                i13 = i15;
                            } else {
                                break;
                            }
                        } else {
                            j10 = 0;
                            break;
                        }
                    }
                    hVar = hVar3;
                }
                y yVar = this.f29896v;
                if (hVar != null) {
                    yVar.f19787u = hVar;
                    hVar2 = hVar3;
                    j12 = -1;
                    j11 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f29927b;
                        h hVar4 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar4 == null) {
                            j11 = -1;
                            break;
                        }
                        j11 = -1;
                        if (hVar4.f29919v) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        if ((i10 & i) == 0) {
                            break;
                        }
                        j.f29925f.getClass();
                        l lVar2 = lVar;
                        long nanoTime = System.nanoTime() - hVar4.f29918u;
                        long j14 = j.f29922b;
                        if (nanoTime < j14) {
                            j12 = j14 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar2, hVar4, null)) {
                                yVar.f19787u = hVar4;
                                j12 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar2) == hVar4);
                        lVar = lVar2;
                        hVar3 = null;
                    }
                    j12 = -2;
                    hVar2 = hVar3;
                }
                if (j12 == j11) {
                    h hVar5 = (h) yVar.f19787u;
                    yVar.f19787u = hVar2;
                    return hVar5;
                }
                if (j12 > j10) {
                    j13 = Math.min(j13, j12);
                }
            }
            i12++;
            hVar3 = null;
        }
        if (j13 == Long.MAX_VALUE) {
            j13 = 0;
        }
        this.f29899y = j13;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.a.run():void");
    }
}
