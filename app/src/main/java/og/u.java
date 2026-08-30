package og;

import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class u implements sg.r {

    /* renamed from: u, reason: collision with root package name */
    public final sg.f f22055u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public boolean f22056v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f22057w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f22058x;

    /* JADX WARN: Type inference failed for: r1v1, types: [sg.f, java.lang.Object] */
    public u(w wVar) {
        this.f22058x = wVar;
    }

    @Override // sg.r
    public final void G(sg.f fVar, long j10) {
        sg.f fVar2 = this.f22055u;
        fVar2.G(fVar, j10);
        while (fVar2.f25274v >= 16384) {
            f(false);
        }
    }

    @Override // sg.r
    public final sg.v a() {
        return this.f22058x.f22072j;
    }

    @Override // sg.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f22058x) {
            try {
                if (this.f22056v) {
                    return;
                }
                w wVar = this.f22058x;
                if (!wVar.f22071h.f22057w) {
                    if (this.f22055u.f25274v > 0) {
                        while (this.f22055u.f25274v > 0) {
                            f(true);
                        }
                    } else {
                        wVar.f22068d.A(wVar.f22067c, true, null, 0L);
                    }
                }
                synchronized (this.f22058x) {
                    this.f22056v = true;
                }
                this.f22058x.f22068d.flush();
                this.f22058x.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(boolean z3) {
        w wVar;
        long min;
        w wVar2;
        boolean z9;
        synchronized (this.f22058x) {
            this.f22058x.f22072j.j();
            while (true) {
                try {
                    wVar = this.f22058x;
                    if (wVar.f22066b > 0 || this.f22057w || this.f22056v || wVar.f22073k != 0) {
                        break;
                    }
                    try {
                        wVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } finally {
                    this.f22058x.f22072j.o();
                }
            }
            wVar.f22072j.o();
            this.f22058x.b();
            min = Math.min(this.f22058x.f22066b, this.f22055u.f25274v);
            wVar2 = this.f22058x;
            wVar2.f22066b -= min;
        }
        wVar2.f22072j.j();
        try {
            w wVar3 = this.f22058x;
            r rVar = wVar3.f22068d;
            int i = wVar3.f22067c;
            if (z3 && min == this.f22055u.f25274v) {
                z9 = true;
            } else {
                z9 = false;
            }
            rVar.A(i, z9, this.f22055u, min);
            this.f22058x.f22072j.o();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // sg.r, java.io.Flushable
    public final void flush() {
        synchronized (this.f22058x) {
            this.f22058x.b();
        }
        while (this.f22055u.f25274v > 0) {
            f(false);
            this.f22058x.f22068d.flush();
        }
    }
}
