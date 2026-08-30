package j2;
import l.e;
import n.i0;
import q.a;

import a0.k0;
import b2.e2;
import b2.k1;
import java.util.ArrayList;
import java.util.List;
import z1.h1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final d1.q f18820a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18821b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f18822c;

    /* renamed from: d, reason: collision with root package name */
    public final j f18823d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public n f18824f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18825g;

    public n(d1.q qVar, boolean z3, i0 i0Var, j jVar) {
        this.f18820a = qVar;
        this.f18821b = z3;
        this.f18822c = i0Var;
        this.f18823d = jVar;
        this.f18825g = i0Var.f1490v;
    }

    public static /* synthetic */ List j(int i, n nVar) {
        boolean z3;
        boolean z9 = false;
        if ((i & 1) != 0) {
            z3 = !nVar.f18821b;
        } else {
            z3 = false;
        }
        if ((i & 2) == 0) {
            z9 = true;
        }
        return nVar.i(z3, z9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final j1.c a(k1 k1Var) {
        b2.k kVar;
        n l10 = l();
        if (l10 == null) {
            return j1.c.e;
        }
        d1.q qVar = (d1.q) l10.f18822c.Z.A;
        k1 k1Var2 = null;
        if ((qVar.f15691x & 8) != 0) {
            loop0: while (qVar != null) {
                if ((qVar.f15690w & 8) != 0) {
                    kVar = qVar;
                    Object r62 = 0;
                    while (kVar != 0) {
                        if (kVar instanceof e2) {
                            if (kVar.g()) {
                                break loop0;
                            }
                        } else if ((kVar.f15690w & 8) != 0 && (kVar instanceof b2.k)) {
                            d1.q qVar2 = kVar.J;
                            int i = 0;
                            kVar = kVar;
                            r62 = r62;
                            while (qVar2 != null) {
                                if ((qVar2.f15690w & 8) != 0) {
                                    i++;
                                    r62 = r62;
                                    if (i == 1) {
                                        kVar = qVar2;
                                    } else {
                                        if (r62 == 0) {
                                            r62 = new t0.e(new d1.q[16]);
                                        }
                                        if (kVar != 0) {
                                            r62.b(kVar);
                                            kVar = 0;
                                        }
                                        r62.b(qVar2);
                                    }
                                }
                                qVar2 = qVar2.f15693z;
                                kVar = kVar;
                                r62 = r62;
                            }
                            if (i == 1) {
                            }
                        }
                        kVar = b2.e(r62);
                    }
                }
                if ((qVar.f15691x & 8) == 0) {
                    break;
                }
                qVar = qVar.f15693z;
            }
        }
        kVar = 0;
        e2 e2Var = (e2) kVar;
        if (e2Var != null) {
            k1Var2 = b2.l.s(e2Var, 8);
        }
        if (k1Var2 == null) {
            return l10.a(k1Var);
        }
        return k1Var2.u(k1Var, true);
    }

    public final n b(g gVar, df.l lVar) {
        int i;
        j jVar = new j();
        jVar.f18815w = false;
        jVar.f18816x = false;
        lVar.invoke(jVar);
        m mVar = new m(lVar);
        int i10 = this.f18825g;
        if (gVar != null) {
            i = 1000000000;
        } else {
            i = 2000000000;
        }
        n nVar = new n(mVar, false, new i0(i10 + i, true), jVar);
        nVar.e = true;
        nVar.f18824f = this;
        return nVar;
    }

    public final void c(i0 i0Var, ArrayList arrayList) {
        t0.e y10 = i0Var.y();
        Object[] objArr = y10.f25617u;
        int i = y10.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var2 = (i0) objArr[i10];
            if (i0Var2.I() && !i0Var2.f1488k0) {
                if (i0Var2.Z.n(8)) {
                    arrayList.add(a(i0Var2, this.f18821b));
                } else {
                    c(i0Var2, arrayList);
                }
            }
        }
    }

    public final k1 d() {
        if (this.e) {
            n l10 = l();
            if (l10 != null) {
                return l10.d();
            }
            return null;
        }
        e2 f10 = f();
        if (f10 != null) {
            return b2.l.s(f10, 8);
        }
        return (b2.s) this.f18822c.Z.f1458x;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            n nVar = (n) arrayList.get(size2);
            if (nVar.n()) {
                arrayList2.add(nVar);
            } else if (!nVar.f18823d.f18816x) {
                nVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r6v14, types: [b2.e2] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    public final e2 f() {
        d1.q qVar;
        boolean z3 = this.f18823d.f18815w;
        Object obj = null;
        i0 i0Var = this.f18822c;
        if (z3) {
            d1.q qVar2 = (d1.q) i0Var.Z.A;
            if ((qVar2.f15691x & 8) != 0) {
                qVar = null;
                while (qVar2 != null) {
                    if ((qVar2.f15690w & 8) != 0) {
                        b2.k kVar = qVar2;
                        Object r72 = 0;
                        while (kVar != 0) {
                            if (kVar instanceof e2) {
                                Object r62 = (e2) kVar;
                                if (r62.g()) {
                                    if (r62.H0()) {
                                        return r62;
                                    }
                                    if (qVar == null) {
                                        qVar = r62;
                                    }
                                }
                            } else if ((kVar.f15690w & 8) != 0 && (kVar instanceof b2.k)) {
                                d1.q qVar3 = kVar.J;
                                int i = 0;
                                kVar = kVar;
                                r72 = r72;
                                while (qVar3 != null) {
                                    if ((qVar3.f15690w & 8) != 0) {
                                        i++;
                                        r72 = r72;
                                        if (i == 1) {
                                            kVar = qVar3;
                                        } else {
                                            if (r72 == 0) {
                                                r72 = new t0.e(new d1.q[16]);
                                            }
                                            if (kVar != 0) {
                                                r72.b(kVar);
                                                kVar = 0;
                                            }
                                            r72.b(qVar3);
                                        }
                                    }
                                    qVar3 = qVar3.f15693z;
                                    kVar = kVar;
                                    r72 = r72;
                                }
                                if (i == 1) {
                                }
                            }
                            kVar = b2.e(r72);
                        }
                    }
                    if ((qVar2.f15691x & 8) == 0) {
                        break;
                    }
                    qVar2 = qVar2.f15693z;
                }
                obj = qVar;
            }
            return (e2) obj;
        }
        d1.q qVar4 = (d1.q) i0Var.Z.A;
        if ((qVar4.f15691x & 8) != 0) {
            loop3: while (qVar4 != null) {
                if ((qVar4.f15690w & 8) != 0) {
                    qVar = qVar4;
                    t0.e eVar = null;
                    while (qVar != null) {
                        if (qVar instanceof e2) {
                            if (((e2) qVar).g()) {
                                obj = qVar;
                            }
                        } else if ((qVar.f15690w & 8) != 0 && (qVar instanceof b2.k)) {
                            int i10 = 0;
                            for (d1.q qVar5 = ((b2.k) qVar).J; qVar5 != null; qVar5 = qVar5.f15693z) {
                                if ((qVar5.f15690w & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        qVar = qVar5;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new t0.e(new d1.q[16]);
                                        }
                                        if (qVar != null) {
                                            eVar.b(qVar);
                                            qVar = null;
                                        }
                                        eVar.b(qVar5);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        qVar = b2.e(eVar);
                    }
                }
                if ((qVar4.f15691x & 8) == 0) {
                    break;
                }
                qVar4 = qVar4.f15693z;
            }
        }
        return (e2) obj;
    }

    public final j1.c g() {
        k1 d2 = d();
        if (d2 != null) {
            if (!d2.h1().H) {
                d2 = null;
            }
            if (d2 != null) {
                return h1.i(d2).u(d2, true);
            }
        }
        return j1.c.e;
    }

    public final j1.c h() {
        k1 d2 = d();
        if (d2 != null) {
            if (!d2.h1().H) {
                d2 = null;
            }
            if (d2 != null) {
                return h1.g(d2);
            }
        }
        return j1.c.e;
    }

    public final List i(boolean z3, boolean z9) {
        if (!z3 && this.f18823d.f18816x) {
            return qe.s.f24023u;
        }
        ArrayList arrayList = new ArrayList();
        if (n()) {
            ArrayList arrayList2 = new ArrayList();
            e(arrayList, arrayList2);
            return arrayList2;
        }
        return q(arrayList, z9);
    }

    public final j k() {
        boolean n10 = n();
        j jVar = this.f18823d;
        if (n10) {
            j a10 = jVar.a();
            p(new ArrayList(), a10);
            return a10;
        }
        return jVar;
    }

    public final n l() {
        i0 i0Var;
        n nVar = this.f18824f;
        if (nVar != null) {
            return nVar;
        }
        i0 i0Var2 = this.f18822c;
        boolean z3 = this.f18821b;
        if (z3) {
            i0Var = i0Var2.v();
            while (i0Var != null) {
                j x9 = i0Var.x();
                if (x9 != null && x9.f18815w) {
                    break;
                }
                i0Var = i0Var.v();
            }
        }
        i0Var = null;
        if (i0Var == null) {
            i0 v2 = i0Var2.v();
            while (true) {
                if (v2 != null) {
                    if (v2.Z.n(8)) {
                        i0Var = v2;
                        break;
                    }
                    v2 = v2.v();
                } else {
                    i0Var = null;
                    break;
                }
            }
        }
        if (i0Var == null) {
            return null;
        }
        return a(i0Var, z3);
    }

    public final j m() {
        return this.f18823d;
    }

    public final boolean n() {
        if (this.f18821b && this.f18823d.f18815w) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (!this.e && j(4, this).isEmpty()) {
            i0 v2 = this.f18822c.v();
            while (true) {
                if (v2 != null) {
                    j x9 = v2.x();
                    if (x9 != null && x9.f18815w) {
                        break;
                    }
                    v2 = v2.v();
                } else {
                    v2 = null;
                    break;
                }
            }
            if (v2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p(ArrayList arrayList, j jVar) {
        if (!this.f18823d.f18816x) {
            q(arrayList, false);
            int size = arrayList.size();
            for (int size2 = arrayList.size(); size2 < size; size2++) {
                n nVar = (n) arrayList.get(size2);
                if (!nVar.n()) {
                    jVar.g(nVar.f18823d);
                    nVar.p(arrayList, jVar);
                }
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z3) {
        String str;
        if (this.e) {
            return qe.s.f24023u;
        }
        c(this.f18822c, arrayList);
        if (z3) {
            j jVar = this.f18823d;
            i0 i0Var = jVar.f18813u;
            Object g8 = i0Var.g(s.f18860x);
            if (g8 == null) {
                g8 = null;
            }
            g gVar = (g) g8;
            if (gVar != null && jVar.f18815w && !arrayList.isEmpty()) {
                arrayList.add(b(gVar, new k0(22, gVar)));
            }
            v vVar = s.f18839a;
            if (i0Var.c(vVar) && !arrayList.isEmpty() && jVar.f18815w) {
                Object g10 = i0Var.g(vVar);
                if (g10 == null) {
                    g10 = null;
                }
                List list = (List) g10;
                if (list != null) {
                    str = (String) qe.l.x(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, b(null, new l(str, 0)));
                }
            }
        }
        return arrayList;
    }
}