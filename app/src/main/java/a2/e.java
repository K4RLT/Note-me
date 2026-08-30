package a2;
import a.a;

import b2.f1;
import b2.g2;
import b2.i0;
import b2.j;
import b2.k;
import b2.l;
import d1.q;
import p.y0;

/* loaded from: classes.dex */
public interface e extends f, j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [b2.j, a2.e] */
    @Override // a2.f
    default Object b(g gVar) {
        f1 f1Var;
        q qVar = (q) this;
        if (!qVar.f15688u.H) {
            y1.a("ModifierLocal accessed from an unattached node");
        }
        if (!qVar.f15688u.H) {
            y1.a.b("visitAncestors called on an unattached node");
        }
        q qVar2 = qVar.f15688u.f15692y;
        i0 u9 = l.u(this);
        while (u9 != null) {
            if ((((q) u9.Z.A).f15691x & 32) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.f15690w & 32) != 0) {
                        k kVar = qVar2;
                        Object r42 = 0;
                        while (kVar != 0) {
                            if (kVar instanceof e) {
                                e eVar = (e) kVar;
                                if (eVar.f0().a(gVar)) {
                                    return eVar.f0().b(gVar);
                                }
                            } else if ((kVar.f15690w & 32) != 0 && (kVar instanceof k)) {
                                q qVar3 = kVar.J;
                                int i = 0;
                                kVar = kVar;
                                r42 = r42;
                                while (qVar3 != null) {
                                    if ((qVar3.f15690w & 32) != 0) {
                                        i++;
                                        r42 = r42;
                                        if (i == 1) {
                                            kVar = qVar3;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new t0.e(new q[16]);
                                            }
                                            if (kVar != 0) {
                                                r42.b(kVar);
                                                kVar = 0;
                                            }
                                            r42.b(qVar3);
                                        }
                                    }
                                    qVar3 = qVar3.f15693z;
                                    kVar = kVar;
                                    r42 = r42;
                                }
                                if (i == 1) {
                                }
                            }
                            kVar = l.e(r42);
                        }
                    }
                    qVar2 = qVar2.f15692y;
                }
            }
            u9 = u9.v();
            if (u9 != null && (f1Var = u9.Z) != null) {
                qVar2 = (g2) f1Var.f1460z;
            } else {
                qVar2 = null;
            }
        }
        return gVar.f234a.invoke();
    }

    default bc.b f0() {
        return b.f226a;
    }

    default void u(g gVar, Object obj) {
        b bVar = b.f226a;
        h hVar = ((y0) this).K;
        if (hVar == bVar) {
            y1.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!hVar.a(gVar)) {
            y1.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + gVar + " was not found.");
        }
        hVar.c(gVar, obj);
    }
}