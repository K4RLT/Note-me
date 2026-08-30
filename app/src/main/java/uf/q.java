package uf;

import pf.b0;
import ya.rc;

/* loaded from: classes.dex */
public class q extends pf.a implements ve.d {

    /* renamed from: x, reason: collision with root package name */
    public final te.c f27237x;

    public q(te.c cVar, te.g gVar) {
        super(gVar, true);
        this.f27237x = cVar;
    }

    @Override // pf.k1
    public final boolean U() {
        return true;
    }

    @Override // ve.d
    public final ve.d getCallerFrame() {
        te.c cVar = this.f27237x;
        if (cVar instanceof ve.d) {
            return (ve.d) cVar;
        }
        return null;
    }

    @Override // pf.k1
    public void q(Object obj) {
        a.h(b0.A(obj), rc.b(this.f27237x));
    }

    @Override // pf.k1
    public void s(Object obj) {
        this.f27237x.resumeWith(b0.A(obj));
    }
}
