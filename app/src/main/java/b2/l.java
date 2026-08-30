package b2;
import x.e;
import b2.j2;
import b2.j;
import c2.x;
import d1.q;
import e1.b;
import e1.c;
import l.a;
import l1.g;
import r0.p1;
import r0.y;
import z1.o;

import android.view.View;
import com.google.android.gms.internal.ads.wd0;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f1532a = new s1(1);

    public static final long a(float f10, boolean z3, boolean z9) {
        long j10;
        long floatToRawIntBits = Float.floatToRawIntBits(f10);
        long j11 = 0;
        if (z3) {
            j10 = 1;
        } else {
            j10 = 0;
        }
        if (z9) {
            j11 = 2;
        }
        return ((j10 | j11) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static final void b(e eVar, q qVar) {
        e z3 = u(qVar).z();
        int i = z3.f25619w - 1;
        Object[] objArr = z3.f25617u;
        if (i < objArr.length) {
            while (i >= 0) {
                eVar.b((q) ((i0) objArr[i]).Z.A);
                i--;
            }
        }
    }

    public static final int c(r0 r0Var, o oVar) {
        long R0;
        r0 L0 = r0Var.L0();
        if (L0 == null) {
            a.b("Child of " + r0Var + " cannot be null when calculating alignment line");
        }
        if (r0Var.P0().b().containsKey(oVar)) {
            Integer num = (Integer) r0Var.P0().b().get(oVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int K0 = L0.K0(oVar);
            if (K0 != Integer.MIN_VALUE) {
                L0.D = true;
                r0Var.E = true;
                r0Var.V0();
                L0.D = false;
                r0Var.E = false;
                if (oVar instanceof o) {
                    R0 = L0.R0() & 4294967295L;
                } else {
                    R0 = L0.R0() >> 32;
                }
                return K0 + ((int) R0);
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final q d(j jVar, int i) {
        q qVar = ((q) jVar).f15688u.f15693z;
        if (qVar != null && (qVar.f15691x & i) != 0) {
            while (qVar != null) {
                int i10 = qVar.f15690w;
                if ((i10 & 2) == 0) {
                    if ((i10 & i) != 0) {
                        return qVar;
                    }
                    qVar = qVar.f15693z;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static final q e(e eVar) {
        int i;
        if (eVar != null && (i = eVar.f25619w) != 0) {
            return (q) eVar.n(i - 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final x f(q qVar) {
        if ((qVar.f15690w & 2) != 0) {
            if (qVar instanceof x) {
                return (x) qVar;
            }
            if (qVar instanceof k) {
                q qVar2 = ((k) qVar).J;
                while (qVar2 != 0) {
                    if (qVar2 instanceof x) {
                        return (x) qVar2;
                    }
                    if ((qVar2 instanceof k) && (qVar2.f15690w & 2) != 0) {
                        qVar2 = ((k) qVar2).J;
                    } else {
                        qVar2 = qVar2.f15693z;
                    }
                }
            }
        }
        return null;
    }

    public static final int g(long j10, long j11) {
        boolean o10 = o(j10);
        if (o10 != o(j11)) {
            if (!o10) {
                return 1;
            }
            return -1;
        }
        int signum = (int) Math.signum(j(j10) - j(j11));
        if (Math.min(j(j10), j(j11)) >= 0.0f && n(j10) != n(j11)) {
            if (!n(j10)) {
                return 1;
            }
            return -1;
        }
        return signum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(i iVar, p1 p1Var) {
        if (!((q) iVar).f15688u.H) {
            a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        g gVar = (g) u(iVar).V;
        gVar.getClass();
        return y.E(gVar, p1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [j, j2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [q] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [q] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final j2 i(j2 j2Var) {
        f1 f1Var;
        q qVar = (q) j2Var;
        if (!qVar.f15688u.H) {
            a.b("visitAncestors called on an unattached node");
        }
        q qVar2 = qVar.f15688u.f15692y;
        i0 u9 = u(j2Var);
        while (u9 != null) {
            if ((((q) u9.Z.A).f15691x & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.f15690w & 262144) != 0) {
                        k kVar = qVar2;
                        Object r52 = 0;
                        while (kVar != 0) {
                            if (kVar instanceof j2) {
                                j2 j2Var2 = (j2) kVar;
                                if (kotlin.jvm.internal.a(j2Var.j(), j2Var2.j()) && j2Var.getClass() == j2Var2.getClass()) {
                                    return j2Var2;
                                }
                            } else if ((kVar.f15690w & 262144) != 0 && (kVar instanceof k)) {
                                q qVar3 = kVar.J;
                                int i = 0;
                                kVar = kVar;
                                r52 = r52;
                                while (qVar3 != null) {
                                    if ((qVar3.f15690w & 262144) != 0) {
                                        i++;
                                        r52 = r52;
                                        if (i == 1) {
                                            kVar = qVar3;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new e(new q[16]);
                                            }
                                            if (kVar != 0) {
                                                r52.b(kVar);
                                                kVar = 0;
                                            }
                                            r52.b(qVar3);
                                        }
                                    }
                                    qVar3 = qVar3.f15693z;
                                    kVar = kVar;
                                    r52 = r52;
                                }
                                if (i == 1) {
                                }
                            }
                            kVar = e(r52);
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
        return null;
    }

    public static final float j(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(n nVar) {
        if (((q) nVar).f15688u.H) {
            s(nVar, 1).o1();
        }
    }

    public static final void l(x xVar) {
        u(xVar).E();
    }

    public static final void m(e2 e2Var) {
        u(e2Var).G();
    }

    public static final boolean n(long j10) {
        if ((j10 & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean o(long j10) {
        if ((j10 & 1) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean p(i0 i0Var) {
        i0 i0Var2;
        if (i0Var.B != null) {
            i0 v2 = i0Var.v();
            if (v2 != null) {
                i0Var2 = v2.B;
            } else {
                i0Var2 = null;
            }
            if (i0Var2 == null || i0Var.f1478a0.f1546b) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(q qVar, df.a aVar) {
        r1 r1Var = qVar.A;
        if (r1Var == null) {
            r1Var = new r1((q1) qVar);
            qVar.A = r1Var;
        }
        ((x) v(qVar)).getSnapshotObserver().a(r1Var, d.f1428z, aVar);
    }

    public static final void r(j jVar) {
        c cVar;
        i0 u9 = u(jVar);
        if (!u9.N) {
            x xVar = (x) m0.a(u9);
            if (x.e() && (cVar = xVar.f3690c0) != null) {
                cVar.f15878d.f19536a.j(u9.f1490v, new b(cVar, 0, u9));
            }
        }
    }

    public static final k1 s(j jVar, int i) {
        k1 k1Var = ((q) jVar).f15688u.B;
        k1Var.getClass();
        if (k1Var.h1() == jVar && g(i)) {
            k1 k1Var2 = k1Var.L;
            k1Var2.getClass();
            return k1Var2;
        }
        return k1Var;
    }

    public static final k1 t(j jVar) {
        if (!((q) jVar).f15688u.H) {
            a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        k1 s10 = s(jVar, 2);
        if (!s10.h1().H) {
            a.b("LayoutCoordinates is not attached.");
        }
        return s10;
    }

    public static final i0 u(j jVar) {
        k1 k1Var = ((q) jVar).f15688u.B;
        if (k1Var != null) {
            return k1Var.I;
        }
        throw wd0.m("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final v1 v(j jVar) {
        v1 v1Var = u(jVar).H;
        if (v1Var != null) {
            return v1Var;
        }
        throw wd0.m("This node does not have an owner.");
    }

    public static final View w(j jVar) {
        if (!((q) jVar).f15688u.H) {
            a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) m0.a(u(jVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [j, j2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [df.l] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [q] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [q] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void x(j2 j2Var, df.l lVar) {
        f1 f1Var;
        boolean z3;
        boolean z9;
        q qVar = (q) j2Var;
        if (!qVar.f15688u.H) {
            a.b("visitAncestors called on an unattached node");
        }
        q qVar2 = qVar.f15688u.f15692y;
        i0 u9 = u(j2Var);
        while (u9 != null) {
            if ((((q) u9.Z.A).f15691x & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.f15690w & 262144) != 0) {
                        k kVar = qVar2;
                        Object r52 = 0;
                        while (kVar != 0) {
                            boolean z10 = true;
                            if (kVar instanceof j2) {
                                j2 j2Var2 = (j2) kVar;
                                if (kotlin.jvm.internal.a(j2Var.j(), j2Var2.j()) && j2Var.getClass() == j2Var2.getClass()) {
                                    z10 = ((Boolean) lVar.invoke(j2Var2)).booleanValue();
                                }
                                if (!z10) {
                                    return;
                                }
                            } else {
                                if ((kVar.f15690w & 262144) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3 && (kVar instanceof k)) {
                                    q qVar3 = kVar.J;
                                    int i = 0;
                                    kVar = kVar;
                                    r52 = r52;
                                    while (qVar3 != null) {
                                        if ((qVar3.f15690w & 262144) != 0) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (z9) {
                                            i++;
                                            r52 = r52;
                                            if (i == 1) {
                                                kVar = qVar3;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new e(new q[16]);
                                                }
                                                if (kVar != 0) {
                                                    r52.b(kVar);
                                                    kVar = 0;
                                                }
                                                r52.b(qVar3);
                                            }
                                        }
                                        qVar3 = qVar3.f15693z;
                                        kVar = kVar;
                                        r52 = r52;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            kVar = e(r52);
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [j2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [df.l] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [q] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void y(j2 j2Var, df.l lVar) {
        i2 i2Var;
        q qVar = (q) j2Var;
        if (!qVar.f15688u.H) {
            a.b("visitSubtreeIf called on an unattached node");
        }
        e eVar = new e(new q[16]);
        q qVar2 = qVar.f15688u;
        q qVar3 = qVar2.f15693z;
        if (qVar3 == null) {
            b(eVar, qVar2);
        } else {
            eVar.b(qVar3);
        }
        while (true) {
            int i = eVar.f25619w;
            if (i != 0) {
                q qVar4 = (q) eVar.n(i - 1);
                if ((qVar4.f15691x & 262144) != 0) {
                    for (q qVar5 = qVar4; qVar5 != null; qVar5 = qVar5.f15693z) {
                        if ((qVar5.f15690w & 262144) != 0) {
                            k kVar = qVar5;
                            Object r72 = 0;
                            while (kVar != 0) {
                                if (kVar instanceof j2) {
                                    j2 j2Var2 = (j2) kVar;
                                    if (kotlin.jvm.internal.a(j2Var.j(), j2Var2.j()) && j2Var.getClass() == j2Var2.getClass()) {
                                        i2Var = (i2) lVar.invoke(j2Var2);
                                    } else {
                                        i2Var = i2.f1501u;
                                    }
                                    if (i2Var != i2.f1503w) {
                                        if (i2Var == i2.f1502v) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((kVar.f15690w & 262144) != 0 && (kVar instanceof k)) {
                                    q qVar6 = kVar.J;
                                    int i10 = 0;
                                    kVar = kVar;
                                    r72 = r72;
                                    while (qVar6 != null) {
                                        if ((qVar6.f15690w & 262144) != 0) {
                                            i10++;
                                            r72 = r72;
                                            if (i10 == 1) {
                                                kVar = qVar6;
                                            } else {
                                                if (r72 == 0) {
                                                    r72 = new e(new q[16]);
                                                }
                                                if (kVar != 0) {
                                                    r72.b(kVar);
                                                    kVar = 0;
                                                }
                                                r72.b(qVar6);
                                            }
                                        }
                                        qVar6 = qVar6.f15693z;
                                        kVar = kVar;
                                        r72 = r72;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                kVar = e(r72);
                            }
                        }
                    }
                }
                b(eVar, qVar4);
            } else {
                return;
            }
        }
    }
}