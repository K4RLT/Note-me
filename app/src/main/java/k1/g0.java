package k1;
import i0.a;

import wa.t8;

/* loaded from: classes.dex */
public final class g0 extends l0 {
    public final j1.d e;

    /* renamed from: f, reason: collision with root package name */
    public final h f19480f;

    public g0(j1.d dVar) {
        h hVar;
        this.e = dVar;
        if (!t8.b(dVar)) {
            hVar = a();
            a(hVar, dVar);
        } else {
            hVar = null;
        }
        this.f19480f = hVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                if (!this.e.equals(((g0) obj).e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // k1.l0
    public final j1.c r() {
        j1.d dVar = this.e;
        return new j1.c(dVar.f18767a, dVar.f18768b, dVar.f18769c, dVar.f18770d);
    }
}
