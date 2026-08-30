package te;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.x;

/* loaded from: classes.dex */
public final class i implements c, ve.d {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f25708v = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");
    private volatile Object result;

    /* renamed from: u, reason: collision with root package name */
    public final c f25709u;

    public i(c cVar) {
        ue.a aVar = ue.a.f27192u;
        this.f25709u = cVar;
        this.result = aVar;
    }

    @Override // ve.d
    public final ve.d getCallerFrame() {
        c cVar = this.f25709u;
        if (cVar instanceof ve.d) {
            return (ve.d) cVar;
        }
        return null;
    }

    @Override // te.c
    public final g getContext() {
        return this.f25709u.getContext();
    }

    @Override // te.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            ue.a aVar = ue.a.f27193v;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25708v;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            ue.a aVar2 = ue.a.f27192u;
            if (obj2 == aVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f25708v;
                ue.a aVar3 = ue.a.f27194w;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                        break;
                    }
                }
                this.f25709u.resumeWith(obj);
                return;
            }
            x.o("Already resumed");
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f25709u;
    }
}
