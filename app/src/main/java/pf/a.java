package pf;
import b0.b;
import b0.e;
import b0.r;
import l.a;

import ya.rc;

/* loaded from: classes.dex */
public abstract class a extends k1 implements te.c, z {

    /* renamed from: w, reason: collision with root package name */
    public final te.g f22716w;

    public a(te.g gVar, boolean z3) {
        super(z3);
        S((d1) gVar.L(w.f22803v));
        this.f22716w = gVar.V(this);
    }

    @Override // pf.z
    public final te.g A() {
        return this.f22716w;
    }

    @Override // pf.k1
    public final void Q(ab.b bVar) {
        r(bVar, this.f22716w);
    }

    @Override // pf.k1
    public final void b0(Object obj) {
        boolean z3;
        if (obj instanceof t) {
            t tVar = (t) obj;
            Throwable th = tVar.f22793a;
            if (t.f22792b.get(tVar) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            j0(th, z3);
            return;
        }
        k0(obj);
    }

    @Override // te.c
    public final te.g getContext() {
        return this.f22716w;
    }

    public final void l0(a0 a0Var, a aVar, df.p pVar) {
        Object invoke;
        int ordinal = a0Var.ordinal();
        pe.z zVar = pe.z.f22715a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            te.g gVar = this.f22716w;
                            Object l10 = uf.a.l(gVar, null);
                            try {
                                if (!(pVar instanceof ve.a)) {
                                    invoke = rc.c(pVar, aVar, this);
                                } else {
                                    kotlin.jvm.internal.b(2, pVar);
                                    invoke = pVar.invoke(aVar, this);
                                }
                                uf.a.g(gVar, l10);
                                if (invoke != ue.a.f27192u) {
                                    resumeWith(invoke);
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                uf.a.g(gVar, l10);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            return;
                        }
                    }
                    l4.a.o();
                    return;
                }
                pVar.getClass();
                rc.b(rc.a(pVar, aVar, this)).resumeWith(zVar);
                return;
            }
            return;
        }
        try {
            uf.a.h(zVar, rc.b(rc.a(pVar, aVar, this)));
        } finally {
            resumeWith(new pe.k(th2));
        }
    }

    @Override // te.c
    public final void resumeWith(Object obj) {
        Throwable a10 = pe.l.a(obj);
        if (a10 != null) {
            obj = new t(a10, false);
        }
        Object X = X(obj);
        if (X == e) {
            return;
        }
        s(X);
    }

    @Override // pf.k1
    public final String y() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void k0(Object obj) {
    }

    public void j0(Throwable th, boolean z3) {
    }
}
