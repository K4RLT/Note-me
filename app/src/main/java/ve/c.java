package ve;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pf.l;
import pf.v;

/* loaded from: classes.dex */
public abstract class c extends a {
    private final te.g _context;
    private transient te.c intercepted;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(te.c r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L7
            te.g r0 = r2.getContext()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.c.<init>(te.c):void");
    }

    @Override // te.c
    public te.g getContext() {
        te.g gVar = this._context;
        gVar.getClass();
        return gVar;
    }

    public final te.c intercepted() {
        te.c cVar;
        te.c cVar2 = this.intercepted;
        if (cVar2 == null) {
            v vVar = (v) getContext().L(te.d.f25706u);
            if (vVar != null) {
                cVar = new uf.f(vVar, this);
            } else {
                cVar = this;
            }
            this.intercepted = cVar;
            return cVar;
        }
        return cVar2;
    }

    @Override // ve.a
    public void releaseIntercepted() {
        l lVar;
        te.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            te.e L = getContext().L(te.d.f25706u);
            L.getClass();
            uf.f fVar = (uf.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uf.f.B;
            do {
            } while (atomicReferenceFieldUpdater.get(fVar) == uf.a.f27204c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            if (obj instanceof l) {
                lVar = (l) obj;
            } else {
                lVar = null;
            }
            if (lVar != null) {
                lVar.o();
            }
        }
        this.intercepted = b.f27654u;
    }

    public c(te.c cVar, te.g gVar) {
        super(cVar);
        this._context = gVar;
    }
}
