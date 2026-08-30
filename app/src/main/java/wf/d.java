package wf;

import java.util.concurrent.Executor;
import pf.v;
import pf.w0;
import uf.t;

/* loaded from: classes.dex */
public final class d extends w0 implements Executor {

    /* renamed from: w, reason: collision with root package name */
    public static final d f29913w = new v();

    /* renamed from: x, reason: collision with root package name */
    public static final v f29914x;

    /* JADX WARN: Type inference failed for: r0v0, types: [wf.d, pf.v] */
    static {
        k kVar = k.f29926w;
        int i = t.f27241a;
        if (64 >= i) {
            i = 64;
        }
        f29914x = kVar.Z(uf.a.j("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // pf.v
    public final void W(te.g gVar, Runnable runnable) {
        f29914x.W(gVar, runnable);
    }

    @Override // pf.v
    public final void X(te.g gVar, Runnable runnable) {
        f29914x.X(gVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        W(te.h.f25707u, runnable);
    }

    @Override // pf.v
    public final String toString() {
        return "Dispatchers.IO";
    }
}
