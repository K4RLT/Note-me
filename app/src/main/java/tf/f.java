package tf;
import c.a;
import l.a;

import m2.a0;
import pe.z;
import pf.b0;

/* loaded from: classes.dex */
public abstract class f extends e {

    /* renamed from: x, reason: collision with root package name */
    public final sf.g f25722x;

    public f(sf.g gVar, te.g gVar2, int i, rf.a aVar) {
        super(gVar2, i, aVar);
        this.f25722x = gVar;
    }

    @Override // tf.e, sf.g
    public final Object b(sf.h hVar, te.c cVar) {
        te.g l10;
        int i = this.f25720v;
        ue.a aVar = ue.a.f27192u;
        if (i == -3) {
            te.g context = cVar.getContext();
            Boolean bool = Boolean.FALSE;
            a0 a0Var = new a0(15);
            te.g gVar = this.f25719u;
            if (!((Boolean) gVar.H(a0Var, bool)).booleanValue()) {
                l10 = context.V(gVar);
            } else {
                l10 = b0.l(context, gVar, false);
            }
            if (kotlin.jvm.internal.a(l10, context)) {
                Object f10 = f(hVar, cVar);
                if (f10 == aVar) {
                    return f10;
                }
            } else {
                te.d dVar = te.d.f25706u;
                if (kotlin.jvm.internal.a(l10.L(dVar), context.L(dVar))) {
                    te.g context2 = cVar.getContext();
                    if (!(hVar instanceof v) && !(hVar instanceof r)) {
                        hVar = new i5.j(hVar, context2);
                    }
                    Object a10 = a(l10, hVar, uf.a.k(l10), new l5.a(this, null, 12), cVar);
                    if (a10 == aVar) {
                        return a10;
                    }
                }
            }
            return z.f22715a;
        }
        Object b10 = super.b(hVar, cVar);
        if (b10 == aVar) {
            return b10;
        }
        return z.f22715a;
    }

    @Override // tf.e
    public final Object c(rf.t tVar, te.c cVar) {
        Object f10 = f(new v(tVar), cVar);
        if (f10 == ue.a.f27192u) {
            return f10;
        }
        return z.f22715a;
    }

    public abstract Object f(sf.h hVar, te.c cVar);

    @Override // tf.e
    public final String toString() {
        return this.f25722x + " -> " + super.toString();
    }
}
