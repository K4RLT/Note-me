package pf;
import b0.o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class g1 extends uf.j implements n0, a1 {

    /* renamed from: x, reason: collision with root package name */
    public k1 f22749x;

    @Override // pf.n0
    public final void a() {
        k1 j10 = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f22762u;
            Object obj = atomicReferenceFieldUpdater.get(j10);
            if (obj instanceof g1) {
                if (obj == this) {
                    p0 p0Var = b0.f22731j;
                    while (!atomicReferenceFieldUpdater.compareAndSet(j10, obj, p0Var)) {
                        if (atomicReferenceFieldUpdater.get(j10) != obj) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (!(obj instanceof a1) || ((a1) obj).g() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = uf.j.f27224u;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (!(obj2 instanceof uf.o)) {
                    if (obj2 == this) {
                        return;
                    }
                    obj2.getClass();
                    uf.j jVar = (uf.j) obj2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = uf.j.f27226w;
                    uf.o oVar = (uf.o) atomicReferenceFieldUpdater3.get(jVar);
                    if (oVar == null) {
                        oVar = new uf.o(jVar);
                        atomicReferenceFieldUpdater3.set(jVar, oVar);
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    jVar.d();
                    return;
                }
                return;
            }
        }
    }

    @Override // pf.a1
    public final boolean f() {
        return true;
    }

    @Override // pf.a1
    public final n1 g() {
        return null;
    }

    public d1 getParent() {
        return j();
    }

    public final k1 j() {
        k1 k1Var = this.f22749x;
        if (k1Var != null) {
            return k1Var;
        }
        kotlin.jvm.internal.l.h("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // uf.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + o(this) + "[job@" + o(j()) + ']';
    }
}
