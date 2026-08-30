package ng;

import q.x;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: y, reason: collision with root package name */
    public boolean f21370y;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21357v) {
            return;
        }
        if (!this.f21370y) {
            f(false, null);
        }
        this.f21357v = true;
    }

    @Override // ng.a, sg.t
    public final long q(sg.f fVar, long j10) {
        if (j10 >= 0) {
            if (!this.f21357v) {
                if (this.f21370y) {
                    return -1L;
                }
                long q10 = super.q(fVar, j10);
                if (q10 == -1) {
                    this.f21370y = true;
                    f(true, null);
                    return -1L;
                }
                return q10;
            }
            x.o("closed");
            return 0L;
        }
        x.n(g3.a.h(j10, "byteCount < 0: "));
        return 0L;
    }
}
