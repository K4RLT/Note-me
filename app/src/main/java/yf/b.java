package yf;

import b8.e8;
import c4.s;
import df.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pe.z;
import pf.b2;
import pf.k;
import pf.l;
import uf.r;
import w7.k8;

/* loaded from: classes.dex */
public final class b implements k, b2 {

    /* renamed from: u, reason: collision with root package name */
    public final l f31640u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f31641v;

    public b(c cVar, l lVar) {
        this.f31641v = cVar;
        this.f31640u = lVar;
    }

    @Override // pf.b2
    public final void a(r rVar, int i) {
        this.f31640u.a(rVar, i);
    }

    @Override // pf.k
    public final s g(Object obj, q qVar) {
        c cVar = this.f31641v;
        e8 e8Var = new e8(cVar, this);
        s E = this.f31640u.E((z) obj, e8Var);
        if (E != null) {
            c.B.set(cVar, null);
        }
        return E;
    }

    @Override // te.c
    public final te.g getContext() {
        return this.f31640u.f22766y;
    }

    @Override // pf.k
    public final void h(Object obj, q qVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.B;
        c cVar = this.f31641v;
        atomicReferenceFieldUpdater.set(cVar, null);
        k8 k8Var = new k8(cVar, this);
        l lVar = this.f31640u;
        lVar.B(lVar.f22757w, new e8(2, k8Var), z.f22715a);
    }

    @Override // pf.k
    public final boolean i(Throwable th) {
        return this.f31640u.i(th);
    }

    @Override // pf.k
    public final void n(Object obj) {
        this.f31640u.n(obj);
    }

    @Override // te.c
    public final void resumeWith(Object obj) {
        this.f31640u.resumeWith(obj);
    }
}
