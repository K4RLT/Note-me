package pf;
import l.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n extends g1 {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f22772y;

    /* renamed from: z, reason: collision with root package name */
    public final l f22773z;

    public /* synthetic */ n(l lVar, int i) {
        this.f22772y = i;
        this.f22773z = lVar;
    }

    @Override // pf.g1
    public final boolean k() {
        switch (this.f22772y) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // pf.g1
    public final void l(Throwable th) {
        switch (this.f22772y) {
            case 0:
                k1 j10 = j();
                l lVar = this.f22773z;
                Throwable q10 = lVar.q(j10);
                if (lVar.x()) {
                    uf.f fVar = (uf.f) lVar.f22765x;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uf.f.B;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        c4.s sVar = uf.a.f27204c;
                        if (kotlin.jvm.internal.a(obj, sVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, sVar, q10)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != sVar) {
                                    break;
                                }
                            }
                            return;
                        } else {
                            if (obj instanceof Throwable) {
                                return;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                lVar.i(q10);
                if (!lVar.x()) {
                    lVar.o();
                    return;
                }
                return;
            default:
                this.f22773z.resumeWith(pe.z.f22715a);
                return;
        }
    }
}
