package pf;
import g0.u1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class o1 extends te.a implements d1 {

    /* renamed from: v, reason: collision with root package name */
    public static final o1 f22776v = new te.a(w.f22803v);

    @Override // pf.d1
    public final n0 B(boolean z3, boolean z9, u1 u1Var) {
        return p1.f22779u;
    }

    @Override // pf.d1
    public final o O(k1 k1Var) {
        return p1.f22779u;
    }

    @Override // pf.d1
    public final boolean f() {
        return true;
    }

    @Override // pf.d1
    public final boolean isCancelled() {
        return false;
    }

    @Override // pf.d1
    public final Object m(ve.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // pf.d1
    public final n0 p(df.l lVar) {
        return p1.f22779u;
    }

    @Override // pf.d1
    public final CancellationException r() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // pf.d1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // pf.d1
    public final void j(CancellationException cancellationException) {
    }
}
