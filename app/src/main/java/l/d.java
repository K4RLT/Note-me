package l;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public c f19797u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f19798v = true;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f19799w;

    public d(f fVar) {
        this.f19799w = fVar;
    }

    @Override // l.e
    public final void a(c cVar) {
        boolean z3;
        c cVar2 = this.f19797u;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f19796x;
            this.f19797u = cVar3;
            if (cVar3 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f19798v = z3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f19798v) {
            if (this.f19799w.f19800u != null) {
                return true;
            }
            return false;
        }
        c cVar = this.f19797u;
        if (cVar != null && cVar.f19795w != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        if (this.f19798v) {
            this.f19798v = false;
            this.f19797u = this.f19799w.f19800u;
        } else {
            c cVar2 = this.f19797u;
            if (cVar2 != null) {
                cVar = cVar2.f19795w;
            } else {
                cVar = null;
            }
            this.f19797u = cVar;
        }
        return this.f19797u;
    }
}
