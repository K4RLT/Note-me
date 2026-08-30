package mg;

import sg.r;
import sg.v;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: u, reason: collision with root package name */
    public final r f20814u;

    public a(r rVar) {
        rVar.getClass();
        this.f20814u = rVar;
    }

    @Override // sg.r
    public final void G(sg.f fVar, long j10) {
        fVar.getClass();
        this.f20814u.G(fVar, j10);
    }

    @Override // sg.r
    public final v a() {
        return this.f20814u.a();
    }

    @Override // sg.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20814u.close();
    }

    @Override // sg.r, java.io.Flushable
    public final void flush() {
        this.f20814u.flush();
    }

    public final String toString() {
        return a.class.getSimpleName() + '(' + this.f20814u + ')';
    }
}
