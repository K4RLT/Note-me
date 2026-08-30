package l6;

import ya.j0;

/* loaded from: classes.dex */
public final class f extends j0 {
    @Override // ya.j0
    public final boolean a(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f19963v == cVar) {
                    hVar.f19963v = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ya.j0
    public final boolean b(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f19962u == obj) {
                    hVar.f19962u = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ya.j0
    public final boolean c(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f19964w == gVar) {
                    hVar.f19964w = gVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ya.j0
    public final void d(g gVar, g gVar2) {
        gVar.f19958b = gVar2;
    }

    @Override // ya.j0
    public final void e(g gVar, Thread thread) {
        gVar.f19957a = thread;
    }
}
