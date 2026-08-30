package r;
import a0.o;
import b0.j0;
import b0.x;
import d1.q;
import i1.s;
import k0.w;
import l.a;
import l.e;
import t0.e;
import v.d;
import v.e;
import v.h;
import v.i;

import b2.e2;
import b2.g2;
import b2.j2;
import b2.q1;
import g0.u1;

/* loaded from: classes.dex */
public final class b0 extends b2.k implements e2, b2.o, b2.i, q1, j2 {
    public static final x0 R = new Object();
    public i K;
    public final df.l L;
    public d M;
    public j0 N;
    public b2.k1 O;
    public final s P;
    public a2.c Q;

    public b0(i iVar, int i, u1 u1Var) {
        this.K = iVar;
        this.L = u1Var;
        s sVar = new s(i, new g5.u(2, this, b0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 3), 4);
        Y0(sVar);
        this.P = sVar;
    }

    @Override // b2.e2
    public final void F0(j2.j jVar) {
        boolean b10 = this.P.a1().b();
        kf.g[] gVarArr = j2.u.f18865a;
        j2.v vVar = j2.s.f18847k;
        kf.g gVar = j2.u.f18865a[4];
        jVar.k(vVar, Boolean.valueOf(b10));
        if (this.Q == null) {
            this.Q = new a2.c(29, this);
        }
        jVar.k(j2.i.f18808v, new j2.a(null, this.Q));
    }

    @Override // q
    public final void S0() {
        j0 j0Var = this.N;
        if (j0Var != null) {
            j0Var.b();
        }
        this.N = null;
    }

    public final void b1(i iVar, h hVar) {
        pf.n0 n0Var;
        if (this.H) {
            pf.d1 d1Var = (pf.d1) ((uf.c) M0()).f27210u.L(pf.w.f22803v);
            te.c cVar = null;
            if (d1Var != null) {
                n0Var = d1Var.p(new w(iVar, 16, hVar));
            } else {
                n0Var = null;
            }
            pf.x(M0(), null, new a6.f(iVar, hVar, n0Var, cVar, 25), 3);
            return;
        }
        iVar.b(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [q] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [q] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
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
    public final c0 c1() {
        j2 j2Var;
        b2.f1 f1Var;
        if (this.H) {
            if (!this.f15688u.H) {
                y1.a.b("visitAncestors called on an unattached node");
            }
            q qVar = this.f15688u.f15692y;
            b2.i0 u9 = b2.l.u(this);
            loop0: while (true) {
                if (u9 != null) {
                    if ((((q) u9.Z.A).f15691x & 262144) != 0) {
                        while (qVar != null) {
                            if ((qVar.f15690w & 262144) != 0) {
                                b2.k kVar = qVar;
                                Object r52 = 0;
                                while (kVar != 0) {
                                    if (kVar instanceof j2) {
                                        j2Var = (j2) kVar;
                                        if (c0.J.equals(j2Var.j())) {
                                            break loop0;
                                        }
                                    } else if ((kVar.f15690w & 262144) != 0 && (kVar instanceof b2.k)) {
                                        q qVar2 = kVar.J;
                                        int i = 0;
                                        kVar = kVar;
                                        r52 = r52;
                                        while (qVar2 != null) {
                                            if ((qVar2.f15690w & 262144) != 0) {
                                                i++;
                                                r52 = r52;
                                                if (i == 1) {
                                                    kVar = qVar2;
                                                } else {
                                                    if (r52 == 0) {
                                                        r52 = new e(new q[16]);
                                                    }
                                                    if (kVar != 0) {
                                                        r52.b(kVar);
                                                        kVar = 0;
                                                    }
                                                    r52.b(qVar2);
                                                }
                                            }
                                            qVar2 = qVar2.f15693z;
                                            kVar = kVar;
                                            r52 = r52;
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    kVar = b2.e(r52);
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
                } else {
                    j2Var = null;
                    break;
                }
            }
            if (j2Var instanceof c0) {
                return (c0) j2Var;
            }
        }
        return null;
    }

    public final void d1(i iVar) {
        d dVar;
        if (!kotlin.jvm.internal.a(this.K, iVar)) {
            i iVar2 = this.K;
            if (iVar2 != null && (dVar = this.M) != null) {
                iVar2.b(new e(dVar));
            }
            this.M = null;
            this.K = iVar;
        }
    }

    @Override // b2.o
    public final void h0(b2.k1 k1Var) {
        c0 c12;
        this.O = k1Var;
        if (this.P.a1().b()) {
            if (k1Var.h1().H) {
                b2.k1 k1Var2 = this.O;
                if (k1Var2 != null && k1Var2.h1().H && (c12 = c1()) != null) {
                    c12.Y0(this.O);
                    return;
                }
                return;
            }
            c0 c13 = c1();
            if (c13 != null) {
                c13.Y0(null);
            }
        }
    }

    @Override // b2.j2
    public final Object j() {
        return R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    @Override // b2.q1
    public final void r0() {
        Object obj = new Object();
        b2.l.q(this, new o((Object) obj, 20, this));
        j0 j0Var = (j0) obj.f19787u;
        if (this.P.a1().b()) {
            j0 j0Var2 = this.N;
            if (j0Var2 != null) {
                j0Var2.b();
            }
            if (j0Var != null) {
                j0Var.a();
            } else {
                j0Var = null;
            }
            this.N = j0Var;
        }
    }
}