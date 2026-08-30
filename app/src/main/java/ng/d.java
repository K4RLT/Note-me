package ng;

import java.net.ProtocolException;
import q.x;
import sg.g;
import sg.i;
import sg.r;
import sg.v;

/* loaded from: classes.dex */
public final class d implements r {

    /* renamed from: u, reason: collision with root package name */
    public final i f21365u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21366v;

    /* renamed from: w, reason: collision with root package name */
    public long f21367w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m2.a f21368x;

    public d(m2.a aVar, long j10) {
        this.f21368x = aVar;
        this.f21365u = new i(((g) aVar.f20438f).a());
        this.f21367w = j10;
    }

    @Override // sg.r
    public final void G(sg.f fVar, long j10) {
        if (!this.f21366v) {
            long j11 = fVar.f25274v;
            byte[] bArr = jg.b.f19199a;
            if (j10 >= 0 && 0 <= j11 && j11 >= j10) {
                if (j10 <= this.f21367w) {
                    ((g) this.f21368x.f20438f).G(fVar, j10);
                    this.f21367w -= j10;
                    return;
                }
                throw new ProtocolException("expected " + this.f21367w + " bytes but received " + j10);
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        x.o("closed");
    }

    @Override // sg.r
    public final v a() {
        return this.f21365u;
    }

    @Override // sg.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21366v) {
            return;
        }
        this.f21366v = true;
        if (this.f21367w <= 0) {
            i iVar = this.f21365u;
            v vVar = iVar.e;
            iVar.e = v.f25310d;
            vVar.a();
            vVar.b();
            this.f21368x.f20434a = 3;
            return;
        }
        throw new ProtocolException("unexpected end of stream");
    }

    @Override // sg.r, java.io.Flushable
    public final void flush() {
        if (this.f21366v) {
            return;
        }
        ((g) this.f21368x.f20438f).flush();
    }
}
