package sg;
import p.a;

import com.google.android.gms.internal.ads.is0;
import java.io.IOException;
import java.io.OutputStream;
import ya.bc;

/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25261u;

    /* renamed from: v, reason: collision with root package name */
    public final v f25262v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f25263w;

    /* JADX WARN: Type inference failed for: r2v1, types: [sg.v, java.lang.Object] */
    public b(is0 is0Var) {
        this.f25261u = 2;
        this.f25263w = is0Var;
        this.f25262v = new Object();
    }

    @Override // sg.r
    public final void G(f fVar, long j10) {
        switch (this.f25261u) {
            case 0:
                s sVar = (s) this.f25262v;
                fVar.getClass();
                bc.a(fVar.f25274v, 0L, j10);
                long j11 = j10;
                while (true) {
                    long j12 = 0;
                    if (j11 > 0) {
                        o oVar = fVar.f25273u;
                        if (oVar == null) {
                            kotlin.jvm.internal.l.g();
                            throw null;
                        }
                        do {
                            if (j12 < 65536) {
                                j12 += oVar.f25300c - oVar.f25299b;
                                if (j12 >= j11) {
                                    j12 = j11;
                                } else {
                                    oVar = oVar.f25302f;
                                }
                            }
                            sVar.j();
                            try {
                                try {
                                    ((b) this.f25263w).G(fVar, j12);
                                    j11 -= j12;
                                    sVar.l(true);
                                } catch (IOException e) {
                                    if (!sVar.k()) {
                                        throw e;
                                    }
                                    throw sVar.m(e);
                                }
                            } catch (Throwable th) {
                                sVar.l(false);
                                throw th;
                            }
                        } while (oVar != null);
                        kotlin.jvm.internal.l.g();
                        throw null;
                    }
                    return;
                }
            case 1:
                fVar.getClass();
                bc.a(fVar.f25274v, 0L, j10);
                while (j10 > 0) {
                    ((s) this.f25262v).f();
                    o oVar2 = fVar.f25273u;
                    if (oVar2 != null) {
                        int min = (int) Math.min(j10, oVar2.f25300c - oVar2.f25299b);
                        ((OutputStream) this.f25263w).write(oVar2.f25298a, oVar2.f25299b, min);
                        int i = oVar2.f25299b + min;
                        oVar2.f25299b = i;
                        long j13 = min;
                        j10 -= j13;
                        fVar.f25274v -= j13;
                        if (i == oVar2.f25300c) {
                            fVar.f25273u = oVar2.a();
                            a(oVar2);
                        }
                    } else {
                        kotlin.jvm.internal.l.g();
                        throw null;
                    }
                }
                return;
            default:
                fVar.getClass();
                synchronized (((f) ((is0) this.f25263w).f7206w)) {
                    try {
                        if (!((is0) this.f25263w).f7204u) {
                            while (j10 > 0) {
                                is0 is0Var = (is0) this.f25263w;
                                if (!is0Var.f7205v) {
                                    f fVar2 = (f) is0Var.f7206w;
                                    long j14 = 8192 - fVar2.f25274v;
                                    if (j14 == 0) {
                                        this.f25262v.i(fVar2);
                                    } else {
                                        long min2 = Math.min(j14, j10);
                                        ((f) ((is0) this.f25263w).f7206w).G(fVar, min2);
                                        j10 -= min2;
                                        f fVar3 = (f) ((is0) this.f25263w).f7206w;
                                        if (fVar3 != null) {
                                            fVar3.notifyAll();
                                        } else {
                                            throw new ClassCastException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                } else {
                                    throw new IOException("source is closed");
                                }
                            }
                        } else {
                            throw new IllegalStateException("closed");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // sg.r
    public final v a() {
        switch (this.f25261u) {
            case 0:
                return (s) this.f25262v;
            case 1:
                return (s) this.f25262v;
            default:
                return this.f25262v;
        }
    }

    @Override // sg.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f25261u) {
            case 0:
                s sVar = (s) this.f25262v;
                sVar.j();
                try {
                    try {
                        ((b) this.f25263w).close();
                        sVar.l(true);
                        return;
                    } catch (IOException e) {
                        if (!sVar.k()) {
                            throw e;
                        }
                        throw sVar.m(e);
                    }
                } catch (Throwable th) {
                    sVar.l(false);
                    throw th;
                }
            case 1:
                ((OutputStream) this.f25263w).close();
                return;
            default:
                synchronized (((f) ((is0) this.f25263w).f7206w)) {
                    try {
                        is0 is0Var = (is0) this.f25263w;
                        if (!is0Var.f7204u) {
                            if (is0Var.f7205v && ((f) is0Var.f7206w).f25274v > 0) {
                                throw new IOException("source is closed");
                            }
                            is0Var.f7204u = true;
                            f fVar = (f) is0Var.f7206w;
                            if (fVar != null) {
                                fVar.notifyAll();
                                return;
                            }
                            throw new ClassCastException("null cannot be cast to non-null type java.lang.Object");
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // sg.r, java.io.Flushable
    public final void flush() {
        switch (this.f25261u) {
            case 0:
                s sVar = (s) this.f25262v;
                sVar.j();
                try {
                    try {
                        ((b) this.f25263w).flush();
                        sVar.l(true);
                        return;
                    } catch (IOException e) {
                        if (!sVar.k()) {
                            throw e;
                        }
                        throw sVar.m(e);
                    }
                } catch (Throwable th) {
                    sVar.l(false);
                    throw th;
                }
            case 1:
                ((OutputStream) this.f25263w).flush();
                return;
            default:
                synchronized (((f) ((is0) this.f25263w).f7206w)) {
                    is0 is0Var = (is0) this.f25263w;
                    if (!is0Var.f7204u) {
                        if (is0Var.f7205v && ((f) is0Var.f7206w).f25274v > 0) {
                            throw new IOException("source is closed");
                        }
                    } else {
                        throw new IllegalStateException("closed");
                    }
                }
                return;
        }
    }

    public String toString() {
        switch (this.f25261u) {
            case 0:
                return "AsyncTimeout.sink(" + ((b) this.f25263w) + ')';
            case 1:
                return "sink(" + ((OutputStream) this.f25263w) + ')';
            default:
                return super.toString();
        }
    }

    public b(OutputStream outputStream, s sVar) {
        this.f25261u = 1;
        this.f25263w = outputStream;
        this.f25262v = sVar;
    }

    public b(s sVar, b bVar) {
        this.f25261u = 0;
        this.f25262v = sVar;
        this.f25263w = bVar;
    }
}
