package b1;
import p.a;
import p.f;

/* loaded from: classes.dex */
public final class c extends d {
    @Override // b1.d
    public final d C(df.l lVar, df.l lVar2) {
        return (d) ((i) f(new o(0, new a(lVar, 0, lVar2))));
    }

    @Override // b1.d, b1.i
    public final void c() {
        synchronized (p.f1387c) {
            o();
        }
    }

    @Override // b1.d, b1.i
    public final void k() {
        w.k();
        throw null;
    }

    @Override // b1.d, b1.i
    public final void l() {
        w.k();
        throw null;
    }

    @Override // b1.d, b1.i
    public final void m() {
        a();
    }

    @Override // b1.d, b1.i
    public final i u(df.l lVar) {
        int i = 0;
        return (g) ((i) f(new o(i, new b(i, lVar))));
    }

    @Override // b1.d
    public final w w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
