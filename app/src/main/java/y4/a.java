package y4;

import pf.b0;
import pf.z;
import te.g;

/* loaded from: classes.dex */
public final class a implements AutoCloseable, z {

    /* renamed from: u, reason: collision with root package name */
    public final g f30907u;

    public a(g gVar) {
        gVar.getClass();
        this.f30907u = gVar;
    }

    @Override // pf.z
    public final g A() {
        return this.f30907u;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b0.h(this.f30907u, null);
    }
}
