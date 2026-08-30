package ng;

import java.io.IOException;
import java.net.ProtocolException;
import q.x;

/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: y, reason: collision with root package name */
    public long f21369y;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z3;
        if (this.f21357v) {
            return;
        }
        if (this.f21369y != 0) {
            try {
                z3 = jg.b.p(this, 100);
            } catch (IOException unused) {
                z3 = false;
            }
            if (!z3) {
                f(false, null);
            }
        }
        this.f21357v = true;
    }

    @Override // ng.a, sg.t
    public final long q(sg.f fVar, long j10) {
        if (j10 >= 0) {
            if (!this.f21357v) {
                long j11 = this.f21369y;
                if (j11 == 0) {
                    return -1L;
                }
                long q10 = super.q(fVar, Math.min(j11, j10));
                if (q10 != -1) {
                    long j12 = this.f21369y - q10;
                    this.f21369y = j12;
                    if (j12 == 0) {
                        f(true, null);
                    }
                    return q10;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                f(false, protocolException);
                throw protocolException;
            }
            x.o("closed");
            return 0L;
        }
        x.n(g3.a.h(j10, "byteCount < 0: "));
        return 0L;
    }
}
