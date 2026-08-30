package te;

import df.p;
import java.io.Serializable;
import kotlin.jvm.internal.l;
import m2.a0;

/* loaded from: classes.dex */
public final class b implements g, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final g f25704u;

    /* renamed from: v, reason: collision with root package name */
    public final e f25705v;

    public b(e eVar, g gVar) {
        gVar.getClass();
        eVar.getClass();
        this.f25704u = gVar;
        this.f25705v = eVar;
    }

    @Override // te.g
    public final Object H(p pVar, Object obj) {
        return pVar.invoke(this.f25704u.H(pVar, obj), this.f25705v);
    }

    @Override // te.g
    public final e L(f fVar) {
        fVar.getClass();
        b bVar = this;
        while (true) {
            e L = bVar.f25705v.L(fVar);
            if (L != null) {
                return L;
            }
            g gVar = bVar.f25704u;
            if (gVar instanceof b) {
                bVar = (b) gVar;
            } else {
                return gVar.L(fVar);
            }
        }
    }

    @Override // te.g
    public final g N(f fVar) {
        fVar.getClass();
        e eVar = this.f25705v;
        e L = eVar.L(fVar);
        g gVar = this.f25704u;
        if (L != null) {
            return gVar;
        }
        g N = gVar.N(fVar);
        if (N == gVar) {
            return this;
        }
        if (N == h.f25707u) {
            return eVar;
        }
        return new b(eVar, N);
    }

    @Override // te.g
    public final g V(g gVar) {
        gVar.getClass();
        if (gVar == h.f25707u) {
            return this;
        }
        return (g) gVar.H(new a0(26), this);
    }

    public final boolean equals(Object obj) {
        boolean z3;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i = 2;
                b bVar2 = bVar;
                int i10 = 2;
                while (true) {
                    g gVar = bVar2.f25704u;
                    if (gVar instanceof b) {
                        bVar2 = (b) gVar;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        break;
                    }
                    i10++;
                }
                b bVar3 = this;
                while (true) {
                    g gVar2 = bVar3.f25704u;
                    if (gVar2 instanceof b) {
                        bVar3 = (b) gVar2;
                    } else {
                        bVar3 = null;
                    }
                    if (bVar3 == null) {
                        break;
                    }
                    i++;
                }
                if (i10 == i) {
                    b bVar4 = this;
                    while (true) {
                        e eVar = bVar4.f25705v;
                        if (!l.a(bVar.L(eVar.getKey()), eVar)) {
                            z3 = false;
                            break;
                        }
                        g gVar3 = bVar4.f25704u;
                        if (gVar3 instanceof b) {
                            bVar4 = (b) gVar3;
                        } else {
                            gVar3.getClass();
                            e eVar2 = (e) gVar3;
                            z3 = l.a(bVar.L(eVar2.getKey()), eVar2);
                            break;
                        }
                    }
                    if (z3) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f25705v.hashCode() + this.f25704u.hashCode();
    }

    public final String toString() {
        return p.a.n(new StringBuilder("["), (String) H(new a0(25), ""), ']');
    }
}
