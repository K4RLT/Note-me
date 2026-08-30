package og;

import java.io.IOException;

/* loaded from: classes.dex */
public final class g implements sg.t {

    /* renamed from: u, reason: collision with root package name */
    public final sg.t f22006u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f22007v;

    /* renamed from: w, reason: collision with root package name */
    public long f22008w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f22009x;

    public g(h hVar, sg.t tVar) {
        this.f22009x = hVar;
        tVar.getClass();
        this.f22006u = tVar;
        this.f22007v = false;
        this.f22008w = 0L;
    }

    @Override // sg.t
    public final sg.v a() {
        return this.f22006u.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f();
        if (this.f22007v) {
            return;
        }
        this.f22007v = true;
        h hVar = this.f22009x;
        hVar.f22013b.h(false, hVar, null);
    }

    public final void f() {
        this.f22006u.close();
    }

    @Override // sg.t
    public final long q(sg.f fVar, long j10) {
        try {
            long q10 = this.f22006u.q(fVar, j10);
            if (q10 > 0) {
                this.f22008w += q10;
                return q10;
            }
            return q10;
        } catch (IOException e) {
            if (!this.f22007v) {
                this.f22007v = true;
                h hVar = this.f22009x;
                hVar.f22013b.h(false, hVar, e);
            }
            throw e;
        }
    }

    public final String toString() {
        return g.class.getSimpleName() + '(' + this.f22006u + ')';
    }
}
