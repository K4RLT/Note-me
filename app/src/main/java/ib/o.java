package ib;

import com.google.android.gms.internal.ads.mf;
import eb.z1;
import fa.y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18381a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final mf f18382b = new mf(8);

    /* renamed from: c, reason: collision with root package name */
    public boolean f18383c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f18384d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f18385f;

    public final void a(Executor executor, b bVar) {
        this.f18382b.d(new l(executor, bVar));
        t();
    }

    public final void b(c cVar) {
        this.f18382b.d(new l(i.f18364a, cVar));
        t();
    }

    public final void c(Executor executor, c cVar) {
        this.f18382b.d(new l(executor, cVar));
        t();
    }

    public final void d(d dVar) {
        e(i.f18364a, dVar);
    }

    public final void e(Executor executor, d dVar) {
        this.f18382b.d(new l(executor, dVar));
        t();
    }

    public final void f(Executor executor, e eVar) {
        this.f18382b.d(new l(executor, eVar));
        t();
    }

    public final o g(Executor executor, a aVar) {
        o oVar = new o();
        this.f18382b.d(new k(executor, aVar, oVar, 0));
        t();
        return oVar;
    }

    public final o h(Executor executor, a aVar) {
        o oVar = new o();
        this.f18382b.d(new k(executor, aVar, oVar, 1));
        t();
        return oVar;
    }

    public final Exception i() {
        Exception exc;
        synchronized (this.f18381a) {
            exc = this.f18385f;
        }
        return exc;
    }

    public final Object j() {
        Object obj;
        synchronized (this.f18381a) {
            try {
                y.j("Task is not yet complete", this.f18383c);
                if (!this.f18384d) {
                    Exception exc = this.f18385f;
                    if (exc == null) {
                        obj = this.e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean k() {
        boolean z3;
        synchronized (this.f18381a) {
            z3 = this.f18383c;
        }
        return z3;
    }

    public final boolean l() {
        boolean z3;
        synchronized (this.f18381a) {
            try {
                z3 = false;
                if (this.f18383c && !this.f18384d && this.f18385f == null) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    public final o m(g gVar) {
        z1 z1Var = i.f18364a;
        o oVar = new o();
        this.f18382b.d(new l(z1Var, gVar, oVar));
        t();
        return oVar;
    }

    public final o n(Executor executor, g gVar) {
        o oVar = new o();
        this.f18382b.d(new l(executor, gVar, oVar));
        t();
        return oVar;
    }

    public final void o(Exception exc) {
        y.i(exc, "Exception must not be null");
        synchronized (this.f18381a) {
            s();
            this.f18383c = true;
            this.f18385f = exc;
        }
        this.f18382b.h(this);
    }

    public final void p(Object obj) {
        synchronized (this.f18381a) {
            s();
            this.f18383c = true;
            this.e = obj;
        }
        this.f18382b.h(this);
    }

    public final void q() {
        synchronized (this.f18381a) {
            try {
                if (this.f18383c) {
                    return;
                }
                this.f18383c = true;
                this.f18384d = true;
                this.f18382b.h(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean r(Object obj) {
        synchronized (this.f18381a) {
            try {
                if (this.f18383c) {
                    return false;
                }
                this.f18383c = true;
                this.e = obj;
                this.f18382b.h(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        String str;
        if (this.f18383c) {
            if (k()) {
                Exception i = i();
                if (i == null) {
                    if (!l()) {
                        if (this.f18384d) {
                            str = "cancellation";
                        } else {
                            str = "unknown issue";
                        }
                    } else {
                        str = "result ".concat(String.valueOf(j()));
                    }
                } else {
                    str = "failure";
                }
                throw new IllegalStateException("Complete with: ".concat(str), i);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void t() {
        synchronized (this.f18381a) {
            try {
                if (!this.f18383c) {
                    return;
                }
                this.f18382b.h(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
