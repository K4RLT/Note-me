package i1;
import l.e;
import q.x;

import android.os.Trace;
import b2.f1;
import b2.g2;
import b2.i0;
import b2.q1;
import c2.p1;
import c2.x;

/* loaded from: classes.dex */
public final class s extends d1.q implements b2.i, q1, a2.e, b2.j {
    public final df.p I;
    public boolean J;
    public boolean K;
    public final int L;

    public s(int i, df.p pVar, int i10) {
        i = (i10 & 1) != 0 ? 1 : i;
        this.I = (i10 & 2) != 0 ? null : pVar;
        this.L = i;
    }

    public static /* synthetic */ boolean d1(s sVar) {
        return sVar.c1(7);
    }

    @Override // d1.q
    public final boolean N0() {
        return false;
    }

    @Override // d1.q
    public final void R0() {
        int ordinal = a1().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        l4.a.o();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        j jVar = (j) ((x) b2.l.v(this)).getFocusOwner();
        jVar.c(8, true, false);
        jVar.f18109d.a();
    }

    @Override // d1.q
    public final void S0() {
        if (a1().b()) {
            ((j) ((x) b2.l.v(this)).getFocusOwner()).c(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [t0.e] */
    public final void Y0(r rVar, r rVar2) {
        f1 f1Var;
        df.p pVar;
        j jVar = (j) ((x) b2.l.v(this)).getFocusOwner();
        s sVar = jVar.f18112h;
        if (!rVar.equals(rVar2) && (pVar = this.I) != null) {
            pVar.invoke(rVar, rVar2);
        }
        d1.q qVar = this.f15688u;
        if (!qVar.H) {
            y1.a.b("visitAncestors called on an unattached node");
        }
        d1.q qVar2 = this.f15688u;
        i0 u9 = b2.l.u(this);
        while (u9 != null) {
            if ((((d1.q) u9.Z.A).f15691x & 5120) != 0) {
                while (qVar2 != null) {
                    int i = qVar2.f15690w;
                    if ((i & 5120) != 0) {
                        if (qVar2 == qVar || (i & 1024) == 0) {
                            if ((i & 4096) != 0) {
                                b2.k kVar = qVar2;
                                Object r62 = 0;
                                while (kVar != 0) {
                                    if (kVar instanceof e) {
                                        e eVar = (e) kVar;
                                        if (sVar == jVar.f18112h) {
                                            eVar.L0(rVar2);
                                        }
                                    } else if ((kVar.f15690w & 4096) != 0 && (kVar instanceof b2.k)) {
                                        d1.q qVar3 = kVar.J;
                                        int i10 = 0;
                                        kVar = kVar;
                                        r62 = r62;
                                        while (qVar3 != null) {
                                            if ((qVar3.f15690w & 4096) != 0) {
                                                i10++;
                                                r62 = r62;
                                                if (i10 == 1) {
                                                    kVar = qVar3;
                                                } else {
                                                    if (r62 == 0) {
                                                        r62 = new t0.e(new d1.q[16]);
                                                    }
                                                    if (kVar != 0) {
                                                        r62.b(kVar);
                                                        kVar = 0;
                                                    }
                                                    r62.b(qVar3);
                                                }
                                            }
                                            qVar3 = qVar3.f15693z;
                                            kVar = kVar;
                                            r62 = r62;
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    kVar = b2.e(r62);
                                }
                            }
                        } else {
                            return;
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
    /* JADX WARN: Type inference failed for: r0v0, types: [i1.k, i1.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r6v9, types: [i1.n] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [t0.e] */
    public final m Z0() {
        boolean z3;
        boolean z9;
        f1 f1Var;
        Object obj = new Object();
        obj.f18117a = true;
        o oVar = o.f18126b;
        obj.f18118b = oVar;
        obj.f18119c = oVar;
        obj.f18120d = oVar;
        obj.e = oVar;
        obj.f18121f = oVar;
        obj.f18122g = oVar;
        obj.f18123h = oVar;
        obj.i = oVar;
        obj.f18124j = l.f18113v;
        obj.f18125k = l.f18114w;
        int i = this.L;
        if (i == 1) {
            z3 = true;
        } else if (i == 0) {
            if (((s1.a) ((s1.c) ((s1.b) b2.l.h(this, p1.f3610m))).f24907a.getValue()).f24906a == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            z3 = !z9;
        } else if (i == 2) {
            z3 = false;
        } else {
            x.o("Unknown Focusability");
            return null;
        }
        obj.f18117a = z3;
        d1.q qVar = this.f15688u;
        if (!qVar.H) {
            y1.a.b("visitAncestors called on an unattached node");
        }
        d1.q qVar2 = this.f15688u;
        i0 u9 = b2.l.u(this);
        loop0: while (u9 != null) {
            if ((((d1.q) u9.Z.A).f15691x & 3072) != 0) {
                while (qVar2 != null) {
                    int i10 = qVar2.f15690w;
                    if ((i10 & 3072) != 0) {
                        if (qVar2 != qVar && (i10 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i10 & 2048) != 0) {
                            b2.k kVar = qVar2;
                            Object r8 = 0;
                            while (kVar != 0) {
                                if (kVar instanceof n) {
                                    ((n) kVar).A0(obj);
                                } else if ((kVar.f15690w & 2048) != 0 && (kVar instanceof b2.k)) {
                                    d1.q qVar3 = kVar.J;
                                    int i11 = 0;
                                    kVar = kVar;
                                    r8 = r8;
                                    while (qVar3 != null) {
                                        if ((qVar3.f15690w & 2048) != 0) {
                                            i11++;
                                            r8 = r8;
                                            if (i11 == 1) {
                                                kVar = qVar3;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new t0.e(new d1.q[16]);
                                                }
                                                if (kVar != 0) {
                                                    r8.b(kVar);
                                                    kVar = 0;
                                                }
                                                r8.b(qVar3);
                                            }
                                        }
                                        qVar3 = qVar3.f15693z;
                                        kVar = kVar;
                                        r8 = r8;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                kVar = b2.e(r8);
                            }
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
        return obj;
    }

    public final r a1() {
        f1 f1Var;
        boolean z3 = this.H;
        r rVar = r.f18133x;
        if (!z3) {
            return rVar;
        }
        j jVar = (j) ((x) b2.l.v(this)).getFocusOwner();
        s sVar = jVar.f18112h;
        if (sVar == null) {
            return rVar;
        }
        if (this == sVar) {
            jVar.getClass();
            return r.f18130u;
        }
        if (sVar.H) {
            if (!sVar.f15688u.H) {
                y1.a.b("visitAncestors called on an unattached node");
            }
            d1.q qVar = sVar.f15688u.f15692y;
            i0 u9 = b2.l.u(sVar);
            while (u9 != null) {
                if ((((d1.q) u9.Z.A).f15691x & 1024) != 0) {
                    while (qVar != null) {
                        if ((qVar.f15690w & 1024) != 0) {
                            d1.q qVar2 = qVar;
                            t0.e eVar = null;
                            while (qVar2 != null) {
                                if (qVar2 instanceof s) {
                                    if (this == ((s) qVar2)) {
                                        return r.f18131v;
                                    }
                                } else if ((qVar2.f15690w & 1024) != 0 && (qVar2 instanceof b2.k)) {
                                    int i = 0;
                                    for (d1.q qVar3 = ((b2.k) qVar2).J; qVar3 != null; qVar3 = qVar3.f15693z) {
                                        if ((qVar3.f15690w & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                qVar2 = qVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new t0.e(new d1.q[16]);
                                                }
                                                if (qVar2 != null) {
                                                    eVar.b(qVar2);
                                                    qVar2 = null;
                                                }
                                                eVar.b(qVar3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                qVar2 = b2.e(eVar);
                            }
                        }
                        qVar = qVar.f15692y;
                    }
                }
                u9 = u9.v();
                if (u9 != null && (f1Var = u9.Z) != null) {
                    qVar = (g2) f1Var.f1460z;
                } else {
                    qVar = null;
                }
            }
        }
        return rVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.jvm.internal.y] */
    public final void b1() {
        int ordinal = a1().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        l4.a.o();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        Object obj = new Object();
        b2.l.q(this, new a0.o((Object) obj, 15, this));
        Object obj2 = obj.f19787u;
        if (obj2 != null) {
            if (!((k) obj2).b()) {
                ((j) ((x) b2.l.v(this)).getFocusOwner()).c(8, true, true);
                return;
            }
            return;
        }
        kotlin.jvm.internal.l.h("focusProperties");
        throw null;
    }

    public final boolean c1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z3 = false;
            if (!Z0().f18117a) {
                Trace.endSection();
                return false;
            }
            int ordinal = f.u(this, i).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new ab.b(false);
                        }
                    } else {
                        z3 = true;
                    }
                }
            } else {
                z3 = f.v(this);
            }
            return z3;
        } finally {
            Trace.endSection();
        }
    }

    @Override // b2.q1
    public final void r0() {
        b1();
    }
}