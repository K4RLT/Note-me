package pf;
import g0.u1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class c1 extends g1 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22735z = AtomicIntegerFieldUpdater.newUpdater(c1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: y, reason: collision with root package name */
    public final u1 f22736y;

    public c1(u1 u1Var) {
        this.f22736y = u1Var;
    }

    @Override // pf.g1
    public final boolean k() {
        return true;
    }

    @Override // pf.g1
    public final void l(Throwable th) {
        if (f22735z.compareAndSet(this, 0, 1)) {
            this.f22736y.invoke(th);
        }
    }
}
