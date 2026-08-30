package l6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ya.j0;

/* loaded from: classes.dex */
public final class d extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19950a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19951b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19952c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19953d;
    public final AtomicReferenceFieldUpdater e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f19950a = atomicReferenceFieldUpdater;
        this.f19951b = atomicReferenceFieldUpdater2;
        this.f19952c = atomicReferenceFieldUpdater3;
        this.f19953d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // ya.j0
    public final boolean a(h hVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19953d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == cVar);
        return false;
    }

    @Override // ya.j0
    public final boolean b(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // ya.j0
    public final boolean c(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19952c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override // ya.j0
    public final void d(g gVar, g gVar2) {
        this.f19951b.lazySet(gVar, gVar2);
    }

    @Override // ya.j0
    public final void e(g gVar, Thread thread) {
        this.f19950a.lazySet(gVar, thread);
    }
}
