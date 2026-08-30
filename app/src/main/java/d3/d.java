package d3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wa.b6;

/* loaded from: classes.dex */
public final class d extends b6 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15705a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15706b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15707c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15708d;
    public final AtomicReferenceFieldUpdater e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f15705a = atomicReferenceFieldUpdater;
        this.f15706b = atomicReferenceFieldUpdater2;
        this.f15707c = atomicReferenceFieldUpdater3;
        this.f15708d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // wa.b6
    public final boolean a(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15708d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // wa.b6
    public final boolean b(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // wa.b6
    public final boolean c(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15707c;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // wa.b6
    public final void d(f fVar, f fVar2) {
        this.f15706b.lazySet(fVar, fVar2);
    }

    @Override // wa.b6
    public final void e(f fVar, Thread thread) {
        this.f15705a.lazySet(fVar, thread);
    }
}
