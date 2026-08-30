package yf;

import b8.e8;
import c4.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pe.z;
import pf.b2;
import pf.k;
import q.x;
import uf.r;

/* loaded from: classes.dex */
public class g {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* renamed from: u, reason: collision with root package name */
    public final int f31649u;

    /* renamed from: v, reason: collision with root package name */
    public final e8 f31650v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31645w = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f31646x = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31647y = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f31648z = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");

    public g(int i, int i10) {
        this.f31649u = i;
        if (i > 0) {
            if (i10 >= 0 && i10 <= i) {
                j jVar = new j(0L, null, 2);
                this.head$volatile = jVar;
                this.tail$volatile = jVar;
                this._availablePermits$volatile = i - i10;
                this.f31650v = new e8(6, this);
                return;
            }
            x.j(g3.a.g(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        x.j(g3.a.g(i, "Semaphore should have at least 1 permit, but had "));
        throw null;
    }

    public final boolean a(b2 b2Var) {
        Object b10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31647y;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f31648z.getAndIncrement(this);
        e eVar = e.f31643u;
        long j10 = andIncrement / i.f31655f;
        loop0: while (true) {
            b10 = uf.a.b(jVar, j10, eVar);
            if (!uf.a.e(b10)) {
                r c10 = uf.a.c(b10);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f27239w >= c10.f27239w) {
                        break loop0;
                    }
                    if (!c10.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (c10.f()) {
                                c10.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        j jVar2 = (j) uf.a.c(b10);
        AtomicReferenceArray atomicReferenceArray = jVar2.f31656y;
        int i = (int) (andIncrement % i.f31655f);
        while (!atomicReferenceArray.compareAndSet(i, null, b2Var)) {
            if (atomicReferenceArray.get(i) != null) {
                s sVar = i.f31652b;
                s sVar2 = i.f31653c;
                while (!atomicReferenceArray.compareAndSet(i, sVar, sVar2)) {
                    if (atomicReferenceArray.get(i) != sVar) {
                        return false;
                    }
                }
                ((k) b2Var).h(z.f22715a, this.f31650v);
                return true;
            }
        }
        b2Var.a(jVar2, i);
        return true;
    }

    public final void b() {
        int i;
        Object b10;
        boolean z3;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f31649u;
            if (andIncrement < i10) {
                if (andIncrement < 0) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31645w;
                    j jVar = (j) atomicReferenceFieldUpdater.get(this);
                    long andIncrement2 = f31646x.getAndIncrement(this);
                    long j10 = andIncrement2 / i.f31655f;
                    f fVar = f.f31644u;
                    while (true) {
                        b10 = uf.a.b(jVar, j10, fVar);
                        if (uf.a.e(b10)) {
                            break;
                        }
                        r c10 = uf.a.c(b10);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f27239w >= c10.f27239w) {
                                break;
                            }
                            if (!c10.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c10)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (c10.f()) {
                                        c10.e();
                                    }
                                }
                            }
                            if (rVar.f()) {
                                rVar.e();
                            }
                        }
                    }
                    j jVar2 = (j) uf.a.c(b10);
                    AtomicReferenceArray atomicReferenceArray = jVar2.f31656y;
                    jVar2.a();
                    z3 = false;
                    if (jVar2.f27239w <= j10) {
                        int i11 = (int) (andIncrement2 % i.f31655f);
                        Object andSet = atomicReferenceArray.getAndSet(i11, i.f31652b);
                        if (andSet == null) {
                            int i12 = i.f31651a;
                            for (int i13 = 0; i13 < i12; i13++) {
                                if (atomicReferenceArray.get(i11) == i.f31653c) {
                                    z3 = true;
                                    break;
                                }
                            }
                            s sVar = i.f31652b;
                            s sVar2 = i.f31654d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i11, sVar, sVar2)) {
                                    z3 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i11) != sVar) {
                                    break;
                                }
                            }
                            z3 = !z3;
                        } else if (andSet != i.e) {
                            boolean z9 = andSet instanceof k;
                            z zVar = z.f22715a;
                            if (z9) {
                                k kVar = (k) andSet;
                                s g8 = kVar.g(zVar, this.f31650v);
                                if (g8 != null) {
                                    kVar.n(g8);
                                    z3 = true;
                                    break;
                                    break;
                                }
                            } else {
                                if (andSet instanceof xf.e) {
                                    if (((xf.e) andSet).g(this, zVar) != 0) {
                                    }
                                    z3 = true;
                                    break;
                                    break;
                                }
                                l4.a.n(andSet, "unexpected: ");
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
        } while (!z3);
    }
}
