package i5;

import wa.o7;
import ya.n9;

/* loaded from: classes.dex */
public final class w implements p5.c {

    /* renamed from: u, reason: collision with root package name */
    public final p5.c f18304u;

    /* renamed from: v, reason: collision with root package name */
    public final long f18305v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f18306w;

    public w(c0 c0Var, p5.c cVar) {
        cVar.getClass();
        this.f18306w = c0Var;
        this.f18304u = cVar;
        this.f18305v = o7.a();
    }

    @Override // p5.c
    public final String D(int i) {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                return this.f18304u.D(i);
            }
            n9.b(21, "Attempted to use statement on a different thread");
            throw null;
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // p5.c
    public final boolean P() {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                return this.f18304u.P();
            }
            n9.b(21, "Attempted to use statement on a different thread");
            throw null;
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // p5.c
    public final void b(int i, long j10) {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                this.f18304u.b(i, j10);
                return;
            } else {
                n9.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // p5.c
    public final void c(double d2, int i) {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                this.f18304u.c(d2, i);
                return;
            } else {
                n9.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                this.f18304u.close();
                return;
            } else {
                n9.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // p5.c
    public final void g(int i) {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                this.f18304u.g(i);
                return;
            } else {
                n9.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // p5.c
    public final int getColumnCount() {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                return this.f18304u.getColumnCount();
            }
            n9.b(21, "Attempted to use statement on a different thread");
            throw null;
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // p5.c
    public final String getColumnName(int i) {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                return this.f18304u.getColumnName(i);
            }
            n9.b(21, "Attempted to use statement on a different thread");
            throw null;
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // p5.c
    public final double getDouble(int i) {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                return this.f18304u.getDouble(i);
            }
            n9.b(21, "Attempted to use statement on a different thread");
            throw null;
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // p5.c
    public final long getLong(int i) {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                return this.f18304u.getLong(i);
            }
            n9.b(21, "Attempted to use statement on a different thread");
            throw null;
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // p5.c
    public final void h() {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                this.f18304u.h();
                return;
            } else {
                n9.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // p5.c
    public final boolean isNull(int i) {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                return this.f18304u.isNull(i);
            }
            n9.b(21, "Attempted to use statement on a different thread");
            throw null;
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // p5.c
    public final void reset() {
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                this.f18304u.reset();
                return;
            } else {
                n9.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }

    @Override // p5.c
    public final void s(int i, String str) {
        str.getClass();
        if (!this.f18306w.e) {
            if (this.f18305v == o7.a()) {
                this.f18304u.s(i, str);
                return;
            } else {
                n9.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        n9.b(21, "Statement is recycled");
        throw null;
    }
}
