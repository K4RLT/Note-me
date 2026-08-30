package uf;

import ya.lc;

/* loaded from: classes.dex */
public final class v implements te.e {

    /* renamed from: u, reason: collision with root package name */
    public final Object f27243u;

    /* renamed from: v, reason: collision with root package name */
    public final ThreadLocal f27244v;

    /* renamed from: w, reason: collision with root package name */
    public final w f27245w;

    public v(Object obj, ThreadLocal threadLocal) {
        this.f27243u = obj;
        this.f27244v = threadLocal;
        this.f27245w = new w(threadLocal);
    }

    @Override // te.g
    public final Object H(df.p pVar, Object obj) {
        return pVar.invoke(obj, this);
    }

    @Override // te.g
    public final te.e L(te.f fVar) {
        if (this.f27245w.equals(fVar)) {
            return this;
        }
        return null;
    }

    @Override // te.g
    public final te.g N(te.f fVar) {
        if (this.f27245w.equals(fVar)) {
            return te.h.f25707u;
        }
        return this;
    }

    @Override // te.g
    public final te.g V(te.g gVar) {
        return lc.c(this, gVar);
    }

    @Override // te.e
    public final te.f getKey() {
        return this.f27245w;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f27243u + ", threadLocal = " + this.f27244v + ')';
    }
}
