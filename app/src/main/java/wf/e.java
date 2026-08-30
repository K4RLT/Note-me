package wf;
import c.k;
import j.e;

import pf.v;
import pf.w0;

/* loaded from: classes.dex */
public final class e extends w0 {

    /* renamed from: x, reason: collision with root package name */
    public static final e f29915x;

    /* renamed from: w, reason: collision with root package name */
    public c f29916w;

    /* JADX WARN: Type inference failed for: r0v0, types: [wf.e, pf.v] */
    static {
        int i = j.f29923c;
        int i10 = j.f29924d;
        long j10 = j.e;
        String str = j.f29921a;
        v vVar = new v();
        vVar.f29916w = new c(i, i10, j10, str);
        f29915x = vVar;
    }

    @Override // pf.v
    public final void W(te.g gVar, Runnable runnable) {
        k(this.f29916w, runnable, 6);
    }

    @Override // pf.v
    public final void X(te.g gVar, Runnable runnable) {
        k(this.f29916w, runnable, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // pf.v
    public final String toString() {
        return "Dispatchers.Default";
    }
}