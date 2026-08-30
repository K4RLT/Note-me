package ib;

import fa.y;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final o f18363a = new o();

    public h(pd.c cVar) {
        z5.h hVar = new z5.h(23, this);
        cVar.getClass();
        ((o) cVar.f22681u).f(i.f18364a, new z5.h(21, hVar));
    }

    public final void a(Exception exc) {
        this.f18363a.o(exc);
    }

    public final void b(Object obj) {
        this.f18363a.p(obj);
    }

    public final boolean c(Exception exc) {
        o oVar = this.f18363a;
        oVar.getClass();
        y.i(exc, "Exception must not be null");
        synchronized (oVar.f18381a) {
            try {
                if (oVar.f18383c) {
                    return false;
                }
                oVar.f18383c = true;
                oVar.f18385f = exc;
                oVar.f18382b.h(oVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.f18363a.r(obj);
    }

    public h() {
    }
}
