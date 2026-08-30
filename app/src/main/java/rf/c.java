package rf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pf.b0;
import pf.b2;
import q.x;
import ya.rc;

/* loaded from: classes.dex */
public final class c implements b2 {

    /* renamed from: u, reason: collision with root package name */
    public Object f24773u = j.f24804p;

    /* renamed from: v, reason: collision with root package name */
    public pf.l f24774v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f24775w;

    public c(h hVar) {
        this.f24775w = hVar;
    }

    @Override // pf.b2
    public final void a(uf.r rVar, int i) {
        pf.l lVar = this.f24774v;
        if (lVar != null) {
            lVar.a(rVar, i);
        }
    }

    public final Object b(ve.c cVar) {
        p pVar;
        Object obj = this.f24773u;
        boolean z3 = true;
        if (obj == j.f24804p || obj == j.f24800l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.A;
            h hVar = this.f24775w;
            p pVar2 = (p) atomicReferenceFieldUpdater.get(hVar);
            while (true) {
                if (hVar.w()) {
                    this.f24773u = j.f24800l;
                    Throwable q10 = hVar.q();
                    if (q10 == null) {
                        z3 = false;
                    } else {
                        int i = uf.s.f27240a;
                        throw q10;
                    }
                } else {
                    long andIncrement = h.f24785w.getAndIncrement(hVar);
                    long j10 = j.f24792b;
                    long j11 = andIncrement / j10;
                    int i10 = (int) (andIncrement % j10);
                    if (pVar2.f27239w != j11) {
                        pVar = hVar.p(j11, pVar2);
                        if (pVar == null) {
                            continue;
                        }
                    } else {
                        pVar = pVar2;
                    }
                    Object H = hVar.H(pVar, i10, andIncrement, null);
                    c4.s sVar = j.f24801m;
                    if (H != sVar) {
                        c4.s sVar2 = j.f24803o;
                        if (H == sVar2) {
                            if (andIncrement < hVar.t()) {
                                pVar.a();
                            }
                            pVar2 = pVar;
                        } else {
                            if (H == j.f24802n) {
                                h hVar2 = this.f24775w;
                                pf.l q11 = b0.q(rc.b(cVar));
                                try {
                                    this.f24774v = q11;
                                    Object H2 = hVar2.H(pVar, i10, andIncrement, this);
                                    if (H2 == sVar) {
                                        a(pVar, i10);
                                    } else {
                                        if (H2 == sVar2) {
                                            if (andIncrement < hVar2.t()) {
                                                pVar.a();
                                            }
                                            p pVar3 = (p) h.A.get(hVar2);
                                            while (true) {
                                                if (hVar2.w()) {
                                                    pf.l lVar = this.f24774v;
                                                    lVar.getClass();
                                                    this.f24774v = null;
                                                    this.f24773u = j.f24800l;
                                                    Throwable q12 = hVar.q();
                                                    if (q12 == null) {
                                                        lVar.resumeWith(Boolean.FALSE);
                                                    } else {
                                                        lVar.resumeWith(new pe.k(q12));
                                                    }
                                                } else {
                                                    long andIncrement2 = h.f24785w.getAndIncrement(hVar2);
                                                    long j12 = j.f24792b;
                                                    long j13 = andIncrement2 / j12;
                                                    int i11 = (int) (andIncrement2 % j12);
                                                    if (pVar3.f27239w != j13) {
                                                        p p10 = hVar2.p(j13, pVar3);
                                                        if (p10 != null) {
                                                            pVar3 = p10;
                                                        }
                                                    }
                                                    Object H3 = hVar2.H(pVar3, i11, andIncrement2, this);
                                                    if (H3 == j.f24801m) {
                                                        a(pVar3, i11);
                                                        break;
                                                    }
                                                    if (H3 == j.f24803o) {
                                                        if (andIncrement2 < hVar2.t()) {
                                                            pVar3.a();
                                                        }
                                                    } else if (H3 != j.f24802n) {
                                                        pVar3.a();
                                                        this.f24773u = H3;
                                                        this.f24774v = null;
                                                    } else {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                }
                                            }
                                        } else {
                                            pVar.a();
                                            this.f24773u = H2;
                                            this.f24774v = null;
                                        }
                                        q11.h(Boolean.TRUE, null);
                                    }
                                    return q11.r();
                                } catch (Throwable th) {
                                    q11.A();
                                    throw th;
                                }
                            }
                            pVar.a();
                            this.f24773u = H;
                        }
                    } else {
                        x.o("unreachable");
                        return null;
                    }
                }
            }
        }
        return Boolean.valueOf(z3);
    }

    public final Object c() {
        Object obj = this.f24773u;
        c4.s sVar = j.f24804p;
        if (obj != sVar) {
            this.f24773u = sVar;
            if (obj != j.f24800l) {
                return obj;
            }
            Throwable r8 = this.f24775w.r();
            int i = uf.s.f27240a;
            throw r8;
        }
        x.o("`hasNext()` has not been invoked");
        return null;
    }
}
