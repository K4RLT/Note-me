package pf;
import q.x;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ya.rc;

/* loaded from: classes.dex */
public final class i0 extends uf.q {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22754y = AtomicIntegerFieldUpdater.newUpdater(i0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // uf.q, pf.k1
    public final void q(Object obj) {
        s(obj);
    }

    @Override // uf.q, pf.k1
    public final void s(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f22754y;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    uf.a.h(b0.A(obj), rc.b(this.f27237x));
                    return;
                } else {
                    x.o("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
