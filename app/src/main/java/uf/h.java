package uf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import pf.d0;
import pf.g0;
import pf.n0;

/* loaded from: classes.dex */
public final class h extends pf.v implements g0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");
    public final Object A;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0 f27219w;

    /* renamed from: x, reason: collision with root package name */
    public final pf.v f27220x;

    /* renamed from: y, reason: collision with root package name */
    public final int f27221y;

    /* renamed from: z, reason: collision with root package name */
    public final k f27222z;

    /* JADX WARN: Multi-variable type inference failed */
    public h(pf.v vVar, int i) {
        g0 g0Var;
        if (vVar instanceof g0) {
            g0Var = (g0) vVar;
        } else {
            g0Var = null;
        }
        this.f27219w = g0Var == null ? d0.f22739a : g0Var;
        this.f27220x = vVar;
        this.f27221y = i;
        this.f27222z = new k();
        this.A = new Object();
    }

    @Override // pf.g0
    public final n0 A(long j10, Runnable runnable, te.g gVar) {
        return this.f27219w.A(j10, runnable, gVar);
    }

    @Override // pf.g0
    public final void K(long j10, pf.l lVar) {
        this.f27219w.K(j10, lVar);
    }

    @Override // pf.v
    public final void W(te.g gVar, Runnable runnable) {
        Runnable a02;
        this.f27222z.a(runnable);
        if (B.get(this) < this.f27221y && b0() && (a02 = a0()) != null) {
            this.f27220x.W(this, new g(this, a02));
        }
    }

    @Override // pf.v
    public final void X(te.g gVar, Runnable runnable) {
        Runnable a02;
        this.f27222z.a(runnable);
        if (B.get(this) < this.f27221y && b0() && (a02 = a0()) != null) {
            this.f27220x.X(this, new g(this, a02));
        }
    }

    public final Runnable a0() {
        while (true) {
            Runnable runnable = (Runnable) this.f27222z.d();
            if (runnable == null) {
                synchronized (this.A) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = B;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f27222z.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    public final boolean b0() {
        synchronized (this.A) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = B;
            if (atomicIntegerFieldUpdater.get(this) >= this.f27221y) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // pf.v
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27220x);
        sb2.append(".limitedParallelism(");
        return a5.a.i(sb2, this.f27221y, ')');
    }
}
