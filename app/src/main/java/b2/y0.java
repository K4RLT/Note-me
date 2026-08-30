package b2;
import b2.i0;
import b2.s1;
import b2.y0;
import c2.v;
import c2.x;
import d1.q;
import k1.m0;
import l.a;
import l.e;
import l1.g;
import t0.e;
import y1.a;
import z1.z0;

import com.google.android.gms.internal.mlkit_vision_digital_ink.iw;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f1625a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1627c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1628d;
    public y2.a i;

    /* renamed from: b, reason: collision with root package name */
    public final ra.e f1626b = new ra.e(6);
    public final iw e = new iw(1);

    /* renamed from: f, reason: collision with root package name */
    public final e f1629f = new e(new i0[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f1630g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final e f1631h = new e(new x0[16]);

    public y0(i0 i0Var) {
        this.f1625a = i0Var;
    }

    public static boolean b(i0 i0Var, y2.a aVar) {
        y2.a aVar2;
        boolean M0;
        i0 i0Var2 = i0Var.B;
        n0 n0Var = i0Var.f1478a0;
        if (i0Var2 == null) {
            return false;
        }
        if (aVar != null) {
            if (i0Var2 != null) {
                w0 w0Var = n0Var.f1559q;
                w0Var.getClass();
                M0 = w0Var.M0(aVar.f30799a);
            }
            M0 = false;
        } else {
            w0 w0Var2 = n0Var.f1559q;
            if (w0Var2 != null) {
                aVar2 = w0Var2.G;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null && i0Var2 != null) {
                w0Var2.getClass();
                M0 = w0Var2.M0(aVar2.f30799a);
            }
            M0 = false;
        }
        i0 v2 = i0Var.v();
        if (M0 && v2 != null) {
            if (v2.B == null) {
                i0.V(v2, false, 3);
                return M0;
            }
            if (i0Var.t() == g0.f1466u) {
                i0.T(v2, false, 3);
                return M0;
            }
            if (i0Var.t() == g0.f1467v) {
                v2.S(false);
            }
        }
        return M0;
    }

    public static boolean c(i0 i0Var, y2.a aVar) {
        y2.a aVar2;
        boolean z3;
        if (aVar != null) {
            if (i0Var.W == g0.f1468w) {
                i0Var.e();
            }
            z3 = i0Var.f1478a0.f1558p.O0(aVar.f30799a);
        } else {
            a1 a1Var = i0Var.f1478a0.f1558p;
            if (a1Var.D) {
                aVar2 = new y2.a(a1Var.f31772x);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                if (i0Var.W == g0.f1468w) {
                    i0Var.e();
                }
                z3 = i0Var.f1478a0.f1558p.O0(aVar2.f30799a);
            } else {
                i0Var.getClass();
                z3 = false;
            }
        }
        i0 v2 = i0Var.v();
        if (z3 && v2 != null) {
            if (i0Var.s() == g0.f1466u) {
                i0.V(v2, false, 3);
                return z3;
            }
            if (i0Var.s() == g0.f1467v) {
                v2.U(false);
            }
        }
        return z3;
    }

    public static boolean h(i0 i0Var) {
        w0 w0Var;
        j0 j0Var;
        if (i0Var.f1478a0.e) {
            if (i0Var.t() != g0.f1468w || ((w0Var = i0Var.f1478a0.f1559q) != null && (j0Var = w0Var.K) != null && j0Var.e())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean i(i0 i0Var) {
        e0 e0Var;
        if (!i0Var.q()) {
            return false;
        }
        do {
            if (i0Var.s() == g0.f1468w && !i0Var.f1478a0.f1558p.Q.e()) {
                i0 v2 = i0Var.v();
                if (v2 != null) {
                    e0Var = v2.f1478a0.f1548d;
                } else {
                    e0Var = null;
                }
                if (e0Var != e0.f1443u) {
                    return false;
                }
            }
            i0Var = i0Var.v();
            if (i0Var == null) {
                return false;
            }
        } while (!i0Var.J());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r4 < r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r8) {
        /*
            r7 = this;
            r0 = 1
            com.google.android.gms.internal.mlkit_vision_digital_ink.iw r1 = r7.e
            if (r8 == 0) goto L17
            java.lang.Object r8 = r1.f14489v
            e r8 = (e) r8
            i0 r2 = r7.f1625a
            int r3 = r2.f1487j0
            if (r3 <= 0) goto L17
            r8.j()
            r8.b(r2)
            r2.f1486i0 = r0
        L17:
            java.lang.Object r8 = r1.f14489v
            e r8 = (e) r8
            int r2 = r8.f25619w
            if (r2 == 0) goto L62
            s1 r3 = s1.f1590v
            java.lang.Object[] r4 = r8.f25617u
            r5 = 0
            java.util.Arrays.sort(r4, r5, r2, r3)
            int r2 = r8.f25619w
            java.lang.Object r3 = r1.f14490w
            i0[] r3 = (i0[]) r3
            if (r3 == 0) goto L32
            int r4 = r3.length
            if (r4 >= r2) goto L3a
        L32:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            i0[] r3 = new i0[r3]
        L3a:
            r4 = 0
            r1.f14490w = r4
        L3d:
            if (r5 >= r2) goto L48
            java.lang.Object[] r6 = r8.f25617u
            r6 = r6[r5]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L48:
            r8.j()
            int r2 = r2 - r0
        L4c:
            r8 = -1
            if (r8 >= r2) goto L60
            r8 = r3[r2]
            r8.getClass()
            boolean r0 = r8.f1486i0
            if (r0 == 0) goto L5b
            com.google.android.gms.internal.mlkit_vision_digital_ink.iw.A(r8)
        L5b:
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L4c
        L60:
            r1.f14490w = r3
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.y0.a(boolean):void");
    }

    public final void d() {
        e eVar = this.f1631h;
        int i = eVar.f25619w;
        if (i != 0) {
            Object[] objArr = eVar.f25617u;
            for (int i10 = 0; i10 < i; i10++) {
                x0 x0Var = (x0) objArr[i10];
                if (x0Var.f1615a.I()) {
                    boolean z3 = x0Var.f1616b;
                    i0 i0Var = x0Var.f1615a;
                    boolean z9 = x0Var.f1617c;
                    if (!z3) {
                        i0.V(i0Var, z9, 2);
                    } else {
                        i0.T(i0Var, z9, 2);
                    }
                }
            }
            eVar.j();
        }
    }

    public final void e(i0 i0Var) {
        e z3 = i0Var.z();
        Object[] objArr = z3.f25617u;
        int i = z3.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var2 = (i0) objArr[i10];
            if (kotlin.jvm.internal.a(i0Var2.K(), Boolean.TRUE) && !i0Var2.f1488k0) {
                if (this.f1626b.s(i0Var2)) {
                    i0Var2.L();
                }
                e(i0Var2);
            }
        }
    }

    public final void f(i0 i0Var, boolean z3) {
        boolean q10;
        if (!this.f1627c) {
            a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z3) {
            q10 = i0Var.f1478a0.e;
        } else {
            q10 = i0Var.q();
        }
        if (q10) {
            a.a("node not yet measured");
        }
        g(i0Var, z3);
    }

    public final void g(i0 i0Var, boolean z3) {
        boolean q10;
        w0 w0Var;
        j0 j0Var;
        boolean q11;
        boolean q12;
        e z9 = i0Var.z();
        Object[] objArr = z9.f25617u;
        int i = z9.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var2 = (i0) objArr[i10];
            g0 g0Var = g0.f1466u;
            if ((!z3 && (i0Var2.s() == g0Var || i0Var2.f1478a0.f1558p.Q.e())) || (z3 && (i0Var2.t() == g0Var || ((w0Var = i0Var2.f1478a0.f1559q) != null && (j0Var = w0Var.K) != null && j0Var.e())))) {
                boolean p10 = l.p(i0Var2);
                n0 n0Var = i0Var2.f1478a0;
                if (p10 && !z3) {
                    if (n0Var.e && this.f1626b.s(i0Var2)) {
                        m(i0Var2, true, false);
                    } else {
                        f(i0Var2, true);
                    }
                }
                if (z3) {
                    q11 = n0Var.e;
                } else {
                    q11 = i0Var2.q();
                }
                if (q11) {
                    m(i0Var2, z3, false);
                }
                if (z3) {
                    q12 = n0Var.e;
                } else {
                    q12 = i0Var2.q();
                }
                if (!q12) {
                    g(i0Var2, z3);
                }
            }
        }
        if (z3) {
            q10 = i0Var.f1478a0.e;
        } else {
            q10 = i0Var.q();
        }
        if (q10) {
            m(i0Var, z3, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [q] */
    public final boolean j(v vVar) {
        boolean z3;
        q qVar;
        q qVar2;
        boolean z9;
        i0 i0Var;
        boolean z10;
        ra.e eVar = this.f1626b;
        i0 i0Var2 = this.f1625a;
        if (!i0Var2.I()) {
            a.a("performMeasureAndLayout called with unattached root");
        }
        if (!i0Var2.J()) {
            a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f1627c) {
            a.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        if (this.i != null) {
            this.f1627c = true;
            this.f1628d = true;
            try {
                boolean w10 = eVar.w();
                z5.h hVar = (z5.h) eVar.f24675v;
                if (w10) {
                    z3 = false;
                    while (true) {
                        z5.h hVar2 = (z5.h) eVar.f24677x;
                        z5.h hVar3 = (z5.h) eVar.f24676w;
                        if (!((f2) hVar.f31922v).isEmpty()) {
                            i0Var = (i0) ((f2) hVar.f31922v).first();
                            hVar.n(i0Var);
                            if (i0Var.B != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z9 = false;
                        } else if (!((f2) hVar3.f31922v).isEmpty()) {
                            i0Var = (i0) ((f2) hVar3.f31922v).first();
                            hVar3.n(i0Var);
                            if (i0Var.B != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z9 = true;
                        } else {
                            if (((f2) hVar2.f31922v).isEmpty()) {
                                break;
                            }
                            i0 i0Var3 = (i0) ((f2) hVar2.f31922v).first();
                            hVar2.n(i0Var3);
                            z9 = true;
                            i0Var = i0Var3;
                            z10 = false;
                        }
                        boolean m4 = m(i0Var, z10, z9);
                        if (!z9) {
                            if (i0Var.f1478a0.f1549f) {
                                eVar.i(i0Var, u.f1599v);
                            }
                            if (i0Var.p()) {
                                eVar.i(i0Var, u.f1601x);
                            }
                        }
                        if (i0Var == i0Var2 && m4) {
                            z3 = true;
                        }
                    }
                    if (vVar != null) {
                        vVar.invoke();
                    }
                } else {
                    z3 = false;
                }
            } finally {
            }
        } else {
            z3 = false;
        }
        e eVar2 = this.f1629f;
        Object[] objArr = eVar2.f25617u;
        int i10 = eVar2.f25619w;
        int i11 = 0;
        while (i11 < i10) {
            f1 f1Var = ((i0) objArr[i11]).Z;
            s sVar = (s) f1Var.f1458x;
            boolean g8 = g(128);
            if (g8) {
                qVar = sVar.f1589k0;
            } else {
                qVar = sVar.f1589k0.f15692y;
                if (qVar == null) {
                    i11++;
                    i = 0;
                }
            }
            m0 m0Var = k1.f1522f0;
            q j12 = sVar.j1(g8);
            while (j12 != null && (j12.f15691x & 128) != 0) {
                if ((j12.f15690w & 128) != 0) {
                    k kVar = j12;
                    e eVar3 = null;
                    while (kVar != 0) {
                        if (kVar instanceof w) {
                            ((w) kVar).f((s) f1Var.f1458x);
                        } else if ((kVar.f15690w & 128) != 0 && (kVar instanceof k)) {
                            q qVar3 = kVar.J;
                            qVar2 = kVar;
                            eVar3 = eVar3;
                            while (qVar3 != null) {
                                if ((qVar3.f15690w & 128) != 0) {
                                    i++;
                                    eVar3 = eVar3;
                                    if (i == 1) {
                                        qVar2 = qVar3;
                                    } else {
                                        if (eVar3 == null) {
                                            eVar3 = new e(new q[16]);
                                        }
                                        if (qVar2 != null) {
                                            eVar3.b(qVar2);
                                            qVar2 = null;
                                        }
                                        eVar3.b(qVar3);
                                    }
                                }
                                qVar3 = qVar3.f15693z;
                                qVar2 = qVar2;
                                eVar3 = eVar3;
                            }
                            if (i == 1) {
                                i = 0;
                                kVar = qVar2;
                                eVar3 = eVar3;
                            }
                        }
                        qVar2 = e(eVar3);
                        i = 0;
                        kVar = qVar2;
                        eVar3 = eVar3;
                    }
                }
                if (j12 != qVar) {
                    j12 = j12.f15693z;
                    i = 0;
                }
            }
            i11++;
            i = 0;
        }
        eVar2.j();
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0043, B:23:0x0065, B:26:0x007b, B:28:0x0084, B:29:0x0087, B:32:0x0095, B:34:0x009d, B:35:0x00a2, B:37:0x00aa, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00c5, B:45:0x00ce, B:48:0x006c, B:50:0x0078), top: B:20:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0043, B:23:0x0065, B:26:0x007b, B:28:0x0084, B:29:0x0087, B:32:0x0095, B:34:0x009d, B:35:0x00a2, B:37:0x00aa, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00c5, B:45:0x00ce, B:48:0x006c, B:50:0x0078), top: B:20:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0043, B:23:0x0065, B:26:0x007b, B:28:0x0084, B:29:0x0087, B:32:0x0095, B:34:0x009d, B:35:0x00a2, B:37:0x00aa, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00c5, B:45:0x00ce, B:48:0x006c, B:50:0x0078), top: B:20:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0043, B:23:0x0065, B:26:0x007b, B:28:0x0084, B:29:0x0087, B:32:0x0095, B:34:0x009d, B:35:0x00a2, B:37:0x00aa, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00c5, B:45:0x00ce, B:48:0x006c, B:50:0x0078), top: B:20:0x0043 }] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [q] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [i0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(i0 r17, long r18) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.y0.k(i0, long):void");
    }

    public final void l() {
        ra.e eVar = this.f1626b;
        if (eVar.w()) {
            i0 i0Var = this.f1625a;
            if (!i0Var.I()) {
                a.a("performMeasureAndLayout called with unattached root");
            }
            if (!i0Var.J()) {
                a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f1627c) {
                a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.f1627c = true;
                this.f1628d = false;
                try {
                    if (!((f2) ((z5.h) eVar.f24677x).f31922v).isEmpty() && !((f2) ((z5.h) eVar.f24675v).f31922v).isEmpty()) {
                        if (i0Var.B != null) {
                            o(i0Var, true);
                        } else {
                            n(i0Var);
                        }
                    }
                    o(i0Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f1627c = false;
                        this.f1628d = false;
                    }
                }
            }
        }
    }

    public final boolean m(i0 i0Var, boolean z3, boolean z9) {
        y2.a aVar;
        boolean z10;
        z0 placementScope;
        s sVar;
        i0 v2;
        w0 w0Var;
        j0 j0Var;
        boolean z11 = i0Var.f1488k0;
        n0 n0Var = i0Var.f1478a0;
        boolean z12 = false;
        if (z11 || (!i0Var.J() && !n0Var.f1558p.M && !i(i0Var) && !kotlin.jvm.internal.a(i0Var.K(), Boolean.TRUE) && !h(i0Var) && !n0Var.f1558p.Q.e() && ((w0Var = n0Var.f1559q) == null || (j0Var = w0Var.K) == null || !j0Var.e()))) {
            return false;
        }
        i0 i0Var2 = this.f1625a;
        if (i0Var == i0Var2) {
            aVar = this.i;
            aVar.getClass();
        } else {
            aVar = null;
        }
        if (z3) {
            if (n0Var.e) {
                z12 = b(i0Var, aVar);
            }
            if (z9 && ((z12 || n0Var.f1549f) && kotlin.jvm.internal.a(i0Var.K(), Boolean.TRUE))) {
                i0Var.L();
            }
        } else {
            if (i0Var.q()) {
                z10 = c(i0Var, aVar);
            } else {
                z10 = false;
            }
            if (z9 && i0Var.p() && (i0Var == i0Var2 || ((v2 = i0Var.v()) != null && v2.J() && n0Var.f1558p.M))) {
                if (i0Var == i0Var2) {
                    if (i0Var.W == g0.f1468w) {
                        i0Var.f();
                    }
                    i0 v4 = i0Var.v();
                    if (v4 == null || (sVar = (s) v4.Z.f1458x) == null || (placementScope = sVar.F) == null) {
                        placementScope = ((x) m0.a(i0Var)).getPlacementScope();
                    }
                    z0.k(placementScope, n0Var.f1558p, 0, 0);
                } else {
                    i0Var.R();
                }
                iw iwVar = this.e;
                iwVar.getClass();
                if (i0Var.f1487j0 > 0) {
                    ((e) iwVar.f14489v).b(i0Var);
                    i0Var.f1486i0 = true;
                }
                ((x) m0.a(i0Var)).getRectManager().d(i0Var);
            }
            z12 = z10;
        }
        d();
        return z12;
    }

    public final void n(i0 i0Var) {
        e z3 = i0Var.z();
        Object[] objArr = z3.f25617u;
        int i = z3.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var2 = (i0) objArr[i10];
            if (i0Var2.s() == g0.f1466u || i0Var2.f1478a0.f1558p.Q.e()) {
                if (l.p(i0Var2)) {
                    o(i0Var2, true);
                } else {
                    n(i0Var2);
                }
            }
        }
    }

    public final void o(i0 i0Var, boolean z3) {
        y2.a aVar;
        if (i0Var.f1488k0) {
            return;
        }
        if (i0Var == this.f1625a) {
            aVar = this.i;
            aVar.getClass();
        } else {
            aVar = null;
        }
        if (z3) {
            b(i0Var, aVar);
        } else {
            c(i0Var, aVar);
        }
    }

    public final boolean p(i0 i0Var, boolean z3) {
        int ordinal = i0Var.f1478a0.f1548d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal == 4) {
                    if (!i0Var.q() || z3) {
                        i0Var.f1478a0.f1558p.N = true;
                        if (!i0Var.f1488k0 && (i0Var.J() || i(i0Var))) {
                            i0 v2 = i0Var.v();
                            if (v2 == null || !v2.q()) {
                                this.f1626b.i(i0Var, u.f1600w);
                            }
                            if (!this.f1628d) {
                                return true;
                            }
                        }
                    }
                } else {
                    l4.a.o();
                    return false;
                }
            } else {
                this.f1631h.b(new x0(i0Var, false, z3));
            }
        }
        return false;
    }

    public final void q(long j10) {
        boolean b10;
        u uVar;
        y2.a aVar = this.i;
        if (aVar == null) {
            b10 = false;
        } else {
            b10 = y2.a.b(aVar.f30799a, j10);
        }
        if (!b10) {
            if (this.f1627c) {
                a.a("updateRootConstraints called while measuring");
            }
            this.i = new y2.a(j10);
            i0 i0Var = this.f1625a;
            i0 i0Var2 = i0Var.B;
            n0 n0Var = i0Var.f1478a0;
            if (i0Var2 != null) {
                n0Var.e = true;
            }
            n0Var.f1558p.N = true;
            if (i0Var2 != null) {
                uVar = u.f1598u;
            } else {
                uVar = u.f1600w;
            }
            this.f1626b.i(i0Var, uVar);
        }
    }
}
