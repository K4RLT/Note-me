package r0;
import r0.y;
import x.o;
import y.a;
import b1.v;
import b1.y;
import b1.z;
import b2.t;
import l.a;
import q.x;
import r0.a2;
import r0.c1;
import r0.d;
import r0.e;
import r0.l;
import r0.m;
import r0.p1;
import r0.q1;
import r0.q2;
import r0.r;
import r0.s;
import r0.v0;
import s.c;
import s0.a0;
import s0.k0;
import z0.f;
import z0.g;

import b8.l3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ya.sb;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f24436a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f24437b = new Object();

    public static final b1.y A() {
        return new b1.y();
    }

    public static i1 B(Object obj) {
        return new i1(obj, v0.f24421z);
    }

    public static final a1 C(Object obj, Object obj2, Object obj3, df.p pVar, m mVar, int i) {
        r rVar = (r) mVar;
        Object O = rVar.O();
        v0 v0Var = l.f24285a;
        if (O == v0Var) {
            O = B(obj);
            rVar.k0(O);
        }
        a1 a1Var = (a1) O;
        boolean h3 = rVar.h(pVar);
        Object O2 = rVar.O();
        if (h3 || O2 == v0Var) {
            O2 = new k2(pVar, a1Var, null, 2);
            rVar.k0(O2);
        }
        g(obj2, obj3, (df.p) O2, rVar);
        return a1Var;
    }

    public static final a1 D(String str, Object obj, df.p pVar, m mVar, int i) {
        r rVar = (r) mVar;
        Object O = rVar.O();
        v0 v0Var = l.f24285a;
        if (O == v0Var) {
            O = B(str);
            rVar.k0(O);
        }
        a1 a1Var = (a1) O;
        boolean h3 = rVar.h(pVar);
        Object O2 = rVar.O();
        if (h3 || O2 == v0Var) {
            O2 = new k2(pVar, a1Var, null, 1);
            rVar.k0(O2);
        }
        f((df.p) O2, obj, rVar);
        return a1Var;
    }

    public static final Object E(g gVar, p1 p1Var) {
        p1Var.getClass();
        Object obj = gVar.get(p1Var);
        if (obj == null) {
            obj = p1Var.b();
        }
        return ((q2) obj).a(gVar);
    }

    public static final p F(m mVar) {
        o oVar;
        r rVar = (r) mVar;
        rVar.X(206, e);
        if (rVar.S) {
            e2.y(rVar.I);
        }
        Object G = rVar.G();
        if (G instanceof o) {
            oVar = (o) G;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            oVar = new o(new p(rVar, rVar.T, rVar.f24349q, rVar.C, rVar.f24341h.L));
            rVar.l0(oVar);
        }
        p pVar = oVar.f24307u;
        pVar.f24315f.setValue(rVar.l());
        rVar.p(false);
        return pVar;
    }

    public static final a1 G(Object obj, m mVar) {
        r rVar = (r) mVar;
        Object O = rVar.O();
        if (O == l.f24285a) {
            O = B(obj);
            rVar.k0(O);
        }
        a1 a1Var = (a1) O;
        a1Var.setValue(obj);
        return a1Var;
    }

    public static final void I(df.p pVar, Object obj, m mVar) {
        r rVar = (r) mVar;
        if (!rVar.S && kotlin.jvm.internal.a(rVar.O(), obj)) {
            return;
        }
        rVar.k0(obj);
        rVar.b(pVar, obj);
    }

    public static final f6.h J(df.a aVar) {
        return new f6.h(new l3(aVar, null));
    }

    public static final int K(v vVar) {
        int c10;
        int i = vVar.f20953b;
        int c11 = vVar.c(0);
        while (vVar.f20953b != 0 && vVar.c(0) == c11) {
            int i10 = vVar.f20953b;
            if (i10 != 0) {
                vVar.e(0, vVar.f20952a[i10 - 1]);
                vVar.d(vVar.f20953b - 1);
                int i11 = vVar.f20953b;
                int i12 = i11 >>> 1;
                int i13 = 0;
                while (i13 < i12) {
                    int c12 = vVar.c(i13);
                    int i14 = (i13 + 1) * 2;
                    int i15 = i14 - 1;
                    int c13 = vVar.c(i15);
                    if (i14 < i11 && (c10 = vVar.c(i14)) > c13) {
                        if (c10 > c12) {
                            vVar.e(i13, c10);
                            vVar.e(i14, c12);
                            i13 = i14;
                        }
                    } else if (c13 > c12) {
                        vVar.e(i13, c13);
                        vVar.e(i15, c12);
                        i13 = i15;
                    }
                }
            } else {
                l4.a.h("IntList is empty.");
                return 0;
            }
        }
        return c11;
    }

    public static final int L(int i) {
        int i10 = 306783378 & i;
        int i11 = 613566756 & i;
        return (i & (-920350135)) | (i11 >> 1) | i10 | ((i10 << 1) & i11);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f, d] */
    public static final g M(k9.z[] zVarArr, g gVar, g gVar2) {
        g gVar3 = g.f31761x;
        d dVar = new d(gVar3);
        dVar.A = gVar3;
        for (k9.z zVar : zVarArr) {
            p1 p1Var = (p1) zVar.f19734d;
            if (zVar.f19733c || !gVar.containsKey(p1Var)) {
                dVar.put(p1Var, p1Var.c(zVar, (q2) gVar2.get(p1Var)));
            }
        }
        return dVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(k9.z r11, df.p r12, m r13, int r14) {
        /*
            r r13 = (r) r13
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.c0(r0)
            t r0 = r13.f24356x
            g r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            c1 r3 = s.f24368b
            r13.X(r2, r3)
            java.lang.Object r2 = r13.O()
            v0 r3 = l.f24285a
            boolean r3 = kotlin.jvm.internal.a(r2, r3)
            r4 = 0
            if (r3 == 0) goto L24
            r2 = r4
            goto L29
        L24:
            r2.getClass()
            q2 r2 = (q2) r2
        L29:
            java.lang.Object r3 = r11.f19734d
            p1 r3 = (p1) r3
            q2 r5 = r3.c(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3a
            r13.k0(r5)
        L3a:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L52
            boolean r2 = r11.f19733c
            if (r2 != 0) goto L4a
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4e
        L4a:
            g r1 = r1.e(r3, r5)
        L4e:
            r13.J = r7
        L50:
            r2 = r8
            goto L8d
        L52:
            a2 r6 = r13.G
            int r9 = r6.f24183g
            int[] r10 = r6.f24179b
            java.lang.Object r6 = r6.b(r9, r10)
            r6.getClass()
            g r6 = (g) r6
            boolean r9 = r13.D()
            if (r9 == 0) goto L69
            if (r2 != 0) goto L74
        L69:
            boolean r9 = r11.f19733c
            if (r9 != 0) goto L82
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L74
            goto L82
        L74:
            if (r2 == 0) goto L7b
            boolean r2 = r13.f24355w
            if (r2 != 0) goto L7b
            goto L80
        L7b:
            boolean r2 = r13.f24355w
            if (r2 == 0) goto L80
            goto L86
        L80:
            r1 = r6
            goto L86
        L82:
            g r1 = r1.e(r3, r5)
        L86:
            boolean r2 = r13.f24357y
            if (r2 != 0) goto L8c
            if (r6 == r1) goto L50
        L8c:
            r2 = r7
        L8d:
            if (r2 == 0) goto L96
            boolean r3 = r13.S
            if (r3 != 0) goto L96
            r13.M(r1)
        L96:
            boolean r3 = r13.f24355w
            e(r3)
            r13.f24355w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            c1 r3 = s.f24369c
            r13.V(r2, r8, r3, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r13, r1)
            r13.p(r8)
            r13.p(r8)
            int r0 = d()
            if (r0 == 0) goto Lbe
            goto Lbf
        Lbe:
            r7 = r8
        Lbf:
            r13.f24355w = r7
            r13.K = r4
            q1 r13 = r13.t()
            if (r13 == 0) goto Ld1
            b8.h r0 = new b8.h
            r1 = 2
            r0.<init>(r14, r1, r11, r12)
            r13.f24332d = r0
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.y.a(k9.z, df.p, m, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v4, types: [f, d] */
    /* JADX WARN: Type inference failed for: r7v6, types: [f, d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(k9.z[] r10, df.p r11, m r12, int r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.y.b(k9.z[], df.p, m, int):void");
    }

    public static final void c(Object obj, df.l lVar, m mVar) {
        r rVar = (r) mVar;
        boolean f10 = rVar.f(obj);
        Object O = rVar.O();
        if (f10 || O == l.f24285a) {
            O = new h0(lVar);
            rVar.k0(O);
        }
    }

    public static final void d(Object obj, Object obj2, df.l lVar, m mVar) {
        r rVar = (r) mVar;
        boolean f10 = rVar.f(obj) | rVar.f(obj2);
        Object O = rVar.O();
        if (f10 || O == l.f24285a) {
            O = new h0(lVar);
            rVar.k0(O);
        }
    }

    public static final void e(Object[] objArr, df.l lVar, m mVar) {
        boolean z3 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z3 |= ((r) mVar).f(obj);
        }
        r rVar = (r) mVar;
        Object O = rVar.O();
        if (!z3 && O != l.f24285a) {
            return;
        }
        rVar.k0(new h0(lVar));
    }

    public static final void f(df.p pVar, Object obj, m mVar) {
        r rVar = (r) mVar;
        te.g gVar = rVar.R;
        boolean f10 = rVar.f(obj);
        Object O = rVar.O();
        if (f10 || O == l.f24285a) {
            O = new t0(gVar, pVar);
            rVar.k0(O);
        }
    }

    public static final void g(Object obj, Object obj2, df.p pVar, m mVar) {
        r rVar = (r) mVar;
        te.g gVar = rVar.R;
        boolean f10 = rVar.f(obj) | rVar.f(obj2);
        Object O = rVar.O();
        if (f10 || O == l.f24285a) {
            O = new t0(gVar, pVar);
            rVar.k0(O);
        }
    }

    public static final void h(Object obj, Object obj2, Object obj3, df.p pVar, m mVar) {
        r rVar = (r) mVar;
        te.g gVar = rVar.R;
        boolean f10 = rVar.f(obj) | rVar.f(obj2) | rVar.f(obj3);
        Object O = rVar.O();
        if (f10 || O == l.f24285a) {
            O = new t0(gVar, pVar);
            rVar.k0(O);
        }
    }

    public static final void i(Object[] objArr, df.p pVar, m mVar) {
        r rVar = (r) mVar;
        te.g gVar = rVar.R;
        boolean z3 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z3 |= rVar.f(obj);
        }
        Object O = rVar.O();
        if (!z3 && O != l.f24285a) {
            return;
        }
        rVar.k0(new t0(gVar, pVar));
    }

    public static final void j(df.a aVar, m mVar) {
        k0 k0Var = ((r) mVar).M.f24855b.f24852a;
        k0Var.e(a0.f24853c);
        sb.a(k0Var, 0, aVar);
    }

    public static final void k(v vVar, int i) {
        if (vVar.f20953b != 0 && (vVar.c(0) == i || vVar.c(vVar.f20953b - 1) == i)) {
            return;
        }
        int i10 = vVar.f20953b;
        vVar.a(i);
        while (i10 > 0) {
            int i11 = ((i10 + 1) >>> 1) - 1;
            int c10 = vVar.c(i11);
            if (i <= c10) {
                break;
            }
            vVar.e(i10, c10);
            i10 = i11;
        }
        vVar.e(i10, i);
    }

    public static void l(e2 e2Var, List list, x xVar) {
        Object obj;
        q1 q1Var;
        List list2 = list;
        if (!list2.isEmpty()) {
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                int c10 = e2Var.c((a) list.get(i));
                int M = e2Var.M(e2Var.r(c10), e2Var.f24218b);
                if (M < e2Var.g(e2Var.r(c10 + 1), e2Var.f24218b)) {
                    obj = e2Var.f24219c[e2Var.h(M)];
                } else {
                    obj = l.f24285a;
                }
                if (obj instanceof q1) {
                    q1Var = (q1) obj;
                } else {
                    q1Var = null;
                }
                if (q1Var != null) {
                    q1Var.f24329a = xVar;
                }
            }
        }
    }

    public static final a1 n(sf.l0 l0Var, Object obj, te.g gVar, m mVar, int i, int i10) {
        if ((i10 & 2) != 0) {
            gVar = te.h.f25707u;
        }
        te.g gVar2 = gVar;
        r rVar = (r) mVar;
        boolean h3 = rVar.h(gVar2) | rVar.h(l0Var);
        Object O = rVar.O();
        if (h3 || O == l.f24285a) {
            O = new a6.f(gVar2, l0Var, null, 27);
            rVar.k0(O);
        }
        return C(obj, l0Var, gVar2, (df.p) O, rVar, i & 896);
    }

    public static final a1 o(sf.l0 l0Var, m mVar) {
        return n(l0Var, l0Var.getValue(), te.h.f25707u, mVar, 0, 0);
    }

    public static final pf.z p(m mVar) {
        return new y1(((r) mVar).R);
    }

    public static final e q() {
        ya.y yVar = j2.f24273b;
        e eVar = (e) yVar.b();
        if (eVar == null) {
            e eVar2 = new e(new z[0]);
            yVar.c(eVar2);
            return eVar2;
        }
        return eVar;
    }

    public static final g0 r(df.a aVar) {
        ya.y yVar = j2.f24272a;
        return new g0(aVar, null);
    }

    public static final g0 s(df.a aVar, v0 v0Var) {
        ya.y yVar = j2.f24272a;
        return new g0(aVar, v0Var);
    }

    public static final int t(m mVar) {
        mVar.getClass();
        return Long.hashCode(((r) mVar).T);
    }

    public static final w0 u(te.g gVar) {
        w0 w0Var = (w0) gVar.L(v0.f24417v);
        if (w0Var != null) {
            return w0Var;
        }
        x.o("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List w(e2 e2Var, int i, e2 e2Var2, boolean z3, boolean z9, boolean z10) {
        boolean z11;
        qe.s sVar;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int t3 = e2Var.t(i);
        int i13 = i + t3;
        int f10 = e2Var.f(i);
        int f11 = e2Var.f(i13);
        int i14 = f11 - f10;
        if (i >= 0 && (e2Var.f24218b[(e2Var.r(i) * 5) + 1] & 201326592) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2Var2.v(t3);
        e2Var2.w(i14, e2Var2.f24234t);
        if (e2Var.f24222g < i13) {
            e2Var.A(i13);
        }
        if (e2Var.f24225k < f11) {
            e2Var.B(f11, i13);
        }
        int[] iArr = e2Var2.f24218b;
        int i15 = e2Var2.f24234t;
        int i16 = i15 * 5;
        qe.k.c(i16, i * 5, i13 * 5, e2Var.f24218b, iArr);
        Object[] objArr = e2Var2.f24219c;
        int i17 = e2Var2.i;
        System.arraycopy(e2Var.f24219c, f10, objArr, i17, i14);
        int i18 = e2Var2.f24236v;
        iArr[i16 + 2] = i18;
        int i19 = i15 - i;
        int i20 = i15 + t3;
        int g8 = i17 - e2Var2.g(i15, iArr);
        int i21 = e2Var2.f24227m;
        int i22 = e2Var2.f24226l;
        int length = objArr.length;
        boolean z14 = z11;
        int i23 = i21;
        int i24 = i15;
        while (i24 < i20) {
            if (i24 != i15) {
                int i25 = (i24 * 5) + 2;
                iArr[i25] = iArr[i25] + i19;
            }
            int[] iArr2 = iArr;
            int g10 = e2Var2.g(i24, iArr) + g8;
            if (i23 < i24) {
                i11 = i15;
                i12 = 0;
            } else {
                i11 = i15;
                i12 = e2Var2.f24225k;
            }
            iArr2[(i24 * 5) + 4] = e2.i(g10, i12, i22, length);
            if (i24 == i23) {
                i23++;
            }
            i24++;
            i15 = i11;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        e2Var2.f24227m = i23;
        int a10 = d2.a(e2Var.f24220d, i, e2Var.p());
        int a11 = d2.a(e2Var.f24220d, i13, e2Var.p());
        if (a10 < a11) {
            ArrayList arrayList = e2Var.f24220d;
            ArrayList arrayList2 = new ArrayList(a11 - a10);
            for (int i26 = a10; i26 < a11; i26++) {
                a aVar = (a) arrayList.get(i26);
                aVar.f24176a += i19;
                arrayList2.add(aVar);
            }
            e2Var2.f24220d.addAll(d2.a(e2Var2.f24220d, e2Var2.f24234t, e2Var2.p()), arrayList2);
            arrayList.subList(a10, a11).clear();
            sVar = arrayList2;
        } else {
            sVar = qe.s.f24023u;
        }
        qe.s sVar2 = sVar;
        if (!sVar2.isEmpty()) {
            HashMap hashMap = e2Var.e;
            HashMap hashMap2 = e2Var2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = sVar2.size();
                for (int i27 = 0; i27 < size; i27++) {
                }
            }
        }
        int i28 = e2Var2.f24236v;
        e2Var2.N(i18);
        int D = e2Var.D(i, e2Var.f24218b);
        if (!z10) {
            z12 = false;
        } else if (z3) {
            if (D >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                e2Var.O();
                e2Var.a(D - e2Var.f24234t);
                e2Var.O();
            }
            e2Var.a(i - e2Var.f24234t);
            boolean G = e2Var.G();
            if (z13) {
                e2Var.L();
                e2Var.j();
                e2Var.L();
                e2Var.j();
            }
            z12 = G;
        } else {
            boolean H = e2Var.H(i, t3);
            e2Var.I(f10, i14, i - 1);
            z12 = H;
        }
        if (z12) {
            c("Unexpectedly removed anchors");
        }
        int i29 = e2Var2.f24229o;
        int i30 = iArr3[i16 + 1];
        if ((1073741824 & i30) != 0) {
            i10 = 1;
        } else {
            i10 = i30 & 67108863;
        }
        e2Var2.f24229o = i29 + i10;
        if (z9) {
            e2Var2.f24234t = i20;
            e2Var2.i = i17 + i14;
        }
        if (z14) {
            e2Var2.S(i18);
        }
        return sVar;
    }

    public static final e1 x(float f10) {
        return new e1(f10);
    }

    public static final f1 y(int i) {
        return new f1(i);
    }

    public static final v z() {
        return new v();
    }

    public abstract void H(vd.n nVar);

    public abstract void m();

    public abstract void v();
}