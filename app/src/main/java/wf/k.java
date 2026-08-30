package wf;
import a.a;

import pf.v;

/* loaded from: classes.dex */
public final class k extends v {

    /* renamed from: w, reason: collision with root package name */
    public static final k f29926w = new v();

    @Override // pf.v
    public final void W(te.g gVar, Runnable runnable) {
        e.f29915x.f29916w.j(runnable, true, false);
    }

    @Override // pf.v
    public final void X(te.g gVar, Runnable runnable) {
        e.f29915x.f29916w.j(runnable, true, true);
    }

    @Override // pf.v
    public final v Z(int i) {
        uf.a(i);
        if (i >= j.f29924d) {
            return this;
        }
        return super.Z(i);
    }

    @Override // pf.v
    public final String toString() {
        return "Dispatchers.IO";
    }
}
