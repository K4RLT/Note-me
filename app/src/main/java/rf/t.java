package rf;

import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pf.b0;
import pf.e1;
import q.x;
import ya.lb;

/* loaded from: classes.dex */
public final class t extends pf.a implements l, v {

    /* renamed from: x, reason: collision with root package name */
    public final h f24819x;

    public t(te.g gVar, h hVar) {
        super(gVar, true);
        this.f24819x = hVar;
    }

    @Override // rf.v
    public final Object a(Object obj, te.c cVar) {
        return this.f24819x.a(obj, cVar);
    }

    @Override // rf.l
    public final gw b() {
        return this.f24819x.b();
    }

    @Override // rf.l
    public final Object c() {
        return this.f24819x.c();
    }

    @Override // rf.l
    public final Object d(tf.n nVar) {
        h hVar = this.f24819x;
        hVar.getClass();
        return h.C(hVar, nVar);
    }

    @Override // rf.v
    public final Object e(Object obj) {
        return this.f24819x.e(obj);
    }

    @Override // rf.l
    public final c iterator() {
        h hVar = this.f24819x;
        hVar.getClass();
        return new c(hVar);
    }

    @Override // pf.k1, pf.d1
    public final void j(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new e1(y(), null, this);
        }
        v(cancellationException);
    }

    @Override // pf.a
    public final void j0(Throwable th, boolean z3) {
        if (!this.f24819x.k(th, false) && !z3) {
            b0.r(th, this.f22716w);
        }
    }

    @Override // pf.a
    public final void k0(Object obj) {
        lb.a(this.f24819x);
    }

    @Override // rf.l
    public final Object l(ve.c cVar) {
        return this.f24819x.l(cVar);
    }

    public final void m0(p7.g gVar) {
        h hVar = this.f24819x;
        hVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.D;
        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, null, gVar)) {
            if (atomicReferenceFieldUpdater.get(hVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(hVar);
                    c4.s sVar = j.f24805q;
                    if (obj == sVar) {
                        c4.s sVar2 = j.f24806r;
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, sVar, sVar2)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != sVar) {
                                break;
                            }
                        }
                        gVar.invoke(hVar.q());
                        return;
                    }
                    if (obj == j.f24806r) {
                        x.o("Another handler was already registered and successfully invoked");
                        return;
                    } else {
                        l4.a.n(obj, "Another handler is already registered: ");
                        return;
                    }
                }
            }
        }
    }

    @Override // pf.k1
    public final void v(CancellationException cancellationException) {
        this.f24819x.k(cancellationException, true);
        u(cancellationException);
    }
}
