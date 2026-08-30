package sg;

import java.io.IOException;
import java.io.InterruptedIOException;
import q.x;

/* loaded from: classes.dex */
public class d extends v {

    /* renamed from: h, reason: collision with root package name */
    public static final long f25267h = 60000000000L;
    public static d i;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public d f25268f;

    /* renamed from: g, reason: collision with root package name */
    public long f25269g;

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, sg.d] */
    public final void j() {
        d dVar;
        if (!this.e) {
            long j10 = this.f25313c;
            boolean z3 = this.f25311a;
            if (j10 == 0 && !z3) {
                return;
            }
            this.e = true;
            synchronized (d.class) {
                try {
                    if (i == null) {
                        i = new Object();
                        pa.e eVar = new pa.e("Okio Watchdog");
                        eVar.setDaemon(true);
                        eVar.start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j10 != 0 && z3) {
                        this.f25269g = Math.min(j10, c() - nanoTime) + nanoTime;
                    } else if (j10 != 0) {
                        this.f25269g = j10 + nanoTime;
                    } else if (z3) {
                        this.f25269g = c();
                    } else {
                        throw new AssertionError();
                    }
                    long j11 = this.f25269g - nanoTime;
                    d dVar2 = i;
                    if (dVar2 != null) {
                        while (true) {
                            dVar = dVar2.f25268f;
                            if (dVar == null || j11 < dVar.f25269g - nanoTime) {
                                break;
                            } else {
                                dVar2 = dVar;
                            }
                        }
                        this.f25268f = dVar;
                        dVar2.f25268f = this;
                        if (dVar2 == i) {
                            d.class.notify();
                        }
                    } else {
                        kotlin.jvm.internal.l.g();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        x.o("Unbalanced enter/exit");
    }

    public final boolean k() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        synchronized (d.class) {
            d dVar = i;
            while (dVar != null) {
                d dVar2 = dVar.f25268f;
                if (dVar2 == this) {
                    dVar.f25268f = this.f25268f;
                    this.f25268f = null;
                    return false;
                }
                dVar = dVar2;
            }
            return true;
        }
    }

    public final void l(boolean z3) {
        if (k() && z3) {
            throw m(null);
        }
    }

    public IOException m(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void n() {
    }
}
