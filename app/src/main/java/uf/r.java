package uf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import pf.q1;

/* loaded from: classes.dex */
public abstract class r extends b implements q1 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f27238x = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: w, reason: collision with root package name */
    public final long f27239w;

    public r(long j10, r rVar, int i) {
        super(rVar);
        this.f27239w = j10;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // uf.b
    public final boolean d() {
        if (f27238x.get(this) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (f27238x.addAndGet(this, -65536) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public abstract int g();

    public abstract void h(int i, te.g gVar);

    public final void i() {
        if (f27238x.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f27238x;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
