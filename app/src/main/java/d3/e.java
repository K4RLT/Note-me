package d3;

import wa.b6;

/* loaded from: classes.dex */
public final class e extends b6 {
    @Override // wa.b6
    public final boolean a(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f15716v == cVar) {
                    gVar.f15716v = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // wa.b6
    public final boolean b(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f15715u == obj) {
                    gVar.f15715u = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // wa.b6
    public final boolean c(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f15717w == fVar) {
                    gVar.f15717w = fVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // wa.b6
    public final void d(f fVar, f fVar2) {
        fVar.f15711b = fVar2;
    }

    @Override // wa.b6
    public final void e(f fVar, Thread thread) {
        fVar.f15710a = thread;
    }
}
