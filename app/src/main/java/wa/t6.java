package wa;
import l.e;
import a0.o;
import b2.f1;
import b2.g2;
import b2.i0;
import b2.j;
import b2.k1;
import b2.k;
import b2.l;
import d1.q;
import g2.a;
import t0.e;

/* loaded from: classes.dex */
public abstract class t6 {
    public static final Object a(j jVar, df.a aVar, ve.c cVar) {
        Object obj;
        k1 t3;
        Object K0;
        f1 f1Var;
        q qVar = (q) jVar;
        boolean z3 = qVar.f15688u.H;
        if (z3) {
            if (!z3) {
                a.b("visitAncestors called on an unattached node");
            }
            q qVar2 = qVar.f15688u.f15692y;
            i0 u9 = l.u(jVar);
            loop0: while (true) {
                obj = null;
                if (u9 == null) {
                    break;
                }
                if ((((q) u9.Z.A).f15691x & 524288) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.f15690w & 524288) != 0) {
                            q qVar3 = qVar2;
                            e eVar = null;
                            while (qVar3 != null) {
                                if (qVar3 instanceof a) {
                                    obj = qVar3;
                                    break loop0;
                                }
                                if ((qVar3.f15690w & 524288) != 0 && (qVar3 instanceof k)) {
                                    int i = 0;
                                    for (q qVar4 = ((k) qVar3).J; qVar4 != null; qVar4 = qVar4.f15693z) {
                                        if ((qVar4.f15690w & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                qVar3 = qVar4;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new e(new q[16]);
                                                }
                                                if (qVar3 != null) {
                                                    eVar.b(qVar3);
                                                    qVar3 = null;
                                                }
                                                eVar.b(qVar4);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                qVar3 = l.e(eVar);
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
            a aVar2 = (a) obj;
            if (aVar2 != null && (K0 = aVar2.K0((t3 = l.t(jVar)), new o(aVar, 12, t3), cVar)) == ue.a.f27192u) {
                return K0;
            }
        }
        return pe.z.f22715a;
    }
}
