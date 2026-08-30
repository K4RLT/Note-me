package ng;

import q.x;
import sg.g;
import sg.i;
import sg.r;
import sg.v;

/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: u, reason: collision with root package name */
    public final i f21360u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21361v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m2.a f21362w;

    public b(m2.a aVar) {
        this.f21362w = aVar;
        this.f21360u = new i(((g) aVar.f20438f).a());
    }

    @Override // sg.r
    public final void G(sg.f fVar, long j10) {
        g gVar = (g) this.f21362w.f20438f;
        if (!this.f21361v) {
            if (j10 == 0) {
                return;
            }
            gVar.C(j10);
            gVar.x("\r\n");
            gVar.G(fVar, j10);
            gVar.x("\r\n");
            return;
        }
        x.o("closed");
    }

    @Override // sg.r
    public final v a() {
        return this.f21360u;
    }

    @Override // sg.r, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f21361v) {
            return;
        }
        this.f21361v = true;
        ((g) this.f21362w.f20438f).x("0\r\n\r\n");
        i iVar = this.f21360u;
        v vVar = iVar.e;
        iVar.e = v.f25310d;
        vVar.a();
        vVar.b();
        this.f21362w.f20434a = 3;
    }

    @Override // sg.r, java.io.Flushable
    public final synchronized void flush() {
        if (this.f21361v) {
            return;
        }
        ((g) this.f21362w.f20438f).flush();
    }
}
