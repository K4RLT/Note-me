package k0;
import a.a;
import a1.t;
import b0.e1;
import c0.l0;
import d0.b;
import d1.e;
import d1.g;
import d1.o;
import d1.r;
import g0.a1;
import g0.d;
import g0.p0;
import g0.p1;
import j0.i;
import j1.c;
import k0.e0;
import k0.l;
import k0.v0;
import k1.f;
import q.x;
import r.t0;
import r0.m;
import r0.y;
import z0.h;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c2.o2;
import c2.r2;
import g0.f2;
import g0.g2;
import java.util.ArrayList;
import java.util.Collection;
import r0.q1;
import wa.b9;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f19439a = new c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static f f19440b;

    /* renamed from: c, reason: collision with root package name */
    public static a f19441c;

    /* renamed from: d, reason: collision with root package name */
    public static b f19442d;

    public static final void a(o oVar, e eVar, c cVar, m mVar, int i) {
        int i10;
        boolean z3;
        c cVar2;
        boolean z9;
        int i11;
        int i12;
        boolean h3;
        int i13;
        r rVar = (r) mVar;
        rVar.c0(476043083);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h3 = rVar.f(oVar);
            } else {
                h3 = rVar.h(oVar);
            }
            if (h3) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.f(eVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i & 384) == 0) {
            if (rVar.h(cVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        boolean z10 = true;
        if ((i10 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            if ((i10 & 112) == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i10 & 14) != 4 && ((i10 & 8) == 0 || !rVar.f(oVar))) {
                z10 = false;
            }
            boolean z11 = z9 | z10;
            Object O = rVar.O();
            if (z11 || O == l.f24285a) {
                O = new k(eVar, oVar);
                rVar.k0(O);
            }
            cVar2 = cVar;
            c3.a((k) O, null, new c3.b0(false, c3.c0.f3757u, false), cVar2, rVar, ((i10 << 3) & 7168) | 384, 2);
        } else {
            cVar2 = cVar;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b3.n(oVar, eVar, cVar2, i);
        }
    }

    public static final void b(r rVar, r rVar2, df.l lVar, c cVar, m mVar, int i) {
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        r rVar3 = (r) mVar;
        rVar3.c0(2078139907);
        if ((i & 6) == 0) {
            if (rVar3.f(rVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar3.f(rVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i & 384) == 0) {
            if (rVar3.h(lVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i & 3072) == 0) {
            if (rVar3.h(cVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        boolean z9 = true;
        if ((i10 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar3.R(i10 & 1, z3)) {
            a1 a1Var = (a1) t.c(new Object[0], a1.f19216l, c0.f19242v, rVar3, 3072, 4);
            Object O = rVar3.O();
            r0.v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = new t0(a1Var);
                rVar3.k0(O);
            }
            t0 t0Var = (t0) O;
            c2.k1 k1Var = (c2.k1) rVar3.j(c2.p1.f3604f);
            Object O2 = rVar3.O();
            if (O2 == v0Var) {
                O2 = y.p(rVar3);
                rVar3.k0(O2);
            }
            pf.z zVar = (pf.z) O2;
            t0Var.e = (r1.a) rVar3.j(c2.p1.f3609l);
            boolean f10 = rVar3.f(zVar) | rVar3.f(k1Var);
            Object O3 = rVar3.O();
            if (f10 || O3 == v0Var) {
                O3 = new w(zVar, 0, k1Var);
                rVar3.k0(O3);
            }
            t0Var.f19417f = (df.l) O3;
            t0Var.f19418g = (o2) rVar3.j(c2.p1.f3614q);
            t0Var.f19416d = new w(t0Var, 1, lVar);
            t0Var.m(rVar2);
            p0 p0Var = new p0(t0Var, 2, new y(t0Var, 3));
            r rVar4 = o.f15687a;
            r a10 = androidx.compose.ui.input.key.a(v1.b(androidx.compose.foundation.a.i(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a(androidx.compose.ui.layout.a.d(v1.b(rVar4, pe.z.f22715a, p0Var), new a0(t0Var, 4)), t0Var.f19419h), new a0(t0Var, 5)), true, null), 8675309, new i0(0, new a0(t0Var, 6))), new a0(t0Var, 7));
            if (t0Var.d() != null && t0Var.g()) {
                r e = t0Var.e();
                if (e != null) {
                    z9 = kotlin.jvm.internal.a(e.f19399a, e.f19400b);
                }
                if (!z9 && t0.a()) {
                    rVar4 = a(rVar4, new f2(3, t0Var));
                }
            }
            f(rVar.d(a10.d(rVar4)), h.d(-1869667463, new z(t0Var, a1Var, cVar), rVar3), rVar3, 48);
            boolean h3 = rVar3.h(t0Var);
            Object O4 = rVar3.O();
            if (h3 || O4 == v0Var) {
                O4 = new a0(t0Var, 0);
                rVar3.k0(O4);
            }
            y.c(t0Var, (df.l) O4, rVar3);
        } else {
            rVar3.U();
        }
        q1 t3 = rVar3.t();
        if (t3 != null) {
            t3.f24332d = new b0(rVar, rVar2, lVar, cVar, i, 0);
        }
    }

    public static final void c(r rVar, c cVar, m mVar, int i) {
        boolean z3;
        c cVar2;
        r rVar2 = (r) mVar;
        rVar2.c0(-1075498320);
        int i10 = i | 6;
        if ((i10 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i10 & 1, z3)) {
            Object O = rVar2.O();
            r0.v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = y.B(null);
                rVar2.k0(O);
            }
            a1 a1Var = (a1) O;
            r rVar3 = (r) a1Var.getValue();
            Object O2 = rVar2.O();
            if (O2 == v0Var) {
                O2 = new c2.p0(a1Var, 4);
                rVar2.k0(O2);
            }
            df.l lVar = (df.l) O2;
            o oVar = o.f15687a;
            cVar2 = cVar;
            b(oVar, rVar3, lVar, cVar2, rVar2, 3462);
            rVar = oVar;
        } else {
            cVar2 = cVar;
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new v(rVar, cVar2, i, 0);
        }
    }

    public static final void d(o oVar, boolean z3, x2.j jVar, boolean z9, long j10, float f10, r rVar, m mVar, int i) {
        int i10;
        boolean z10;
        long j11;
        int i11;
        long j12;
        boolean z11;
        boolean z12;
        g gVar;
        boolean z13;
        boolean z14;
        boolean z15;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean h3;
        int i16;
        r rVar2 = (r) mVar;
        rVar2.c0(-466280168);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h3 = rVar2.f(oVar);
            } else {
                h3 = rVar2.h(oVar);
            }
            if (h3) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar2.g(z3)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i & 384) == 0) {
            if (rVar2.f(jVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i & 3072) == 0) {
            if (rVar2.g(z9)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        }
        if ((i & 24576) == 0) {
            i10 |= 8192;
        }
        if ((1572864 & i) == 0) {
            if (rVar2.f(rVar)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i10 |= i12;
        }
        if ((533651 & i10) != 533650) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.R(i10 & 1, z10)) {
            rVar2.W();
            if ((i & 1) != 0 && !rVar2.A()) {
                rVar2.U();
                i11 = i10 & (-57345);
                j12 = j10;
            } else {
                i11 = i10 & (-57345);
                j12 = 9205357640488583168L;
            }
            rVar2.q();
            x2.j jVar2 = x2.j.f30058v;
            x2.j jVar3 = x2.j.f30057u;
            if (z3) {
                float f11 = l0.f19349a;
                if ((jVar == jVar3 && !z9) || (jVar == jVar2 && z9)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z12 = z15;
            } else {
                float f12 = l0.f19349a;
                if ((jVar == jVar3 && !z9) || (jVar == jVar2 && z9)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (z12) {
                gVar = a.f15666b;
            } else {
                gVar = a.f15665a;
            }
            int i17 = i11 & 14;
            if (i17 != 4 && ((i11 & 8) == 0 || !rVar2.h(oVar))) {
                z13 = false;
            } else {
                z13 = true;
            }
            if ((i11 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean g8 = z14 | z13 | rVar2.g(z12);
            Object O = rVar2.O();
            if (g8 || O == l.f24285a) {
                O = new e(oVar, z3, z12);
                rVar2.k0(O);
            }
            long j13 = j12;
            g gVar2 = gVar;
            j11 = j13;
            a(oVar, gVar2, h.d(1365123137, new c((r2) rVar2.j(c2.p1.f3616s), j11, z12, j2.a(rVar, false, (df.l) O), oVar), rVar2), rVar2, i17 | 384);
        } else {
            rVar2.U();
            j11 = j10;
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new d(oVar, z3, jVar, z9, j11, f10, rVar, i);
        }
    }

    public static final void e(int i, r rVar, df.a aVar, m mVar, boolean z3) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        int i13;
        r rVar2 = (r) mVar;
        rVar2.c0(2111672474);
        if ((i & 6) == 0) {
            if (rVar2.f(rVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i;
        } else {
            i10 = i;
        }
        if (rVar2.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i10 | i11;
        if (rVar2.g(z3)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 147) != 146) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar2.R(i15 & 1, z9)) {
            b.b(a(androidx.compose.foundation.layout.d.l(rVar, l0.f19349a, l0.f19350b), new h(z3, aVar)), rVar2);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new f(i, rVar, aVar, z3);
        }
    }

    public static final void f(r rVar, c cVar, m mVar, int i) {
        int i10;
        boolean z3;
        r rVar2 = (r) mVar;
        rVar2.c0(-2105228848);
        if (rVar2.f(rVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i11 & 1, z3)) {
            int hashCode = Long.hashCode(rVar2.T);
            g l10 = rVar2.l();
            r c10 = a.c(rVar, rVar2);
            b2.h.f1471d.getClass();
            b2.b0 b0Var = b2.g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(b2.g.e, c1.f19246a, rVar2);
            y.I(b2.g.f1464d, l10, rVar2);
            b2.f fVar = b2.g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar);
            }
            y.I(b2.g.f1463c, c10, rVar2);
            cVar.invoke(rVar2, 6);
            rVar2.p(true);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new v(rVar, cVar, i, 1);
        }
    }

    public static final void g(boolean z3, x2.j jVar, j1 j1Var, m mVar, int i) {
        int i10;
        boolean z9;
        boolean z10;
        x2.j jVar2;
        boolean z11;
        long j10;
        float f10;
        g2 d2;
        int i11;
        int i12;
        int i13;
        r rVar = (r) mVar;
        rVar.c0(-1344558920);
        if ((i & 6) == 0) {
            if (rVar.g(z3)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.f(jVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i & 384) == 0) {
            if (rVar.h(j1Var)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        boolean z12 = false;
        if ((i10 & 147) != 146) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i10 & 1, z9)) {
            int i14 = i10 & 14;
            if (i14 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean f11 = z11 | rVar.f(j1Var);
            Object O = rVar.O();
            Object obj = l.f24285a;
            if (f11 || O == obj) {
                O = new s0(j1Var, z3);
                rVar.k0(O);
            }
            p1 p1Var = (p1) O;
            boolean h3 = rVar.h(j1Var);
            if (i14 == 4) {
                z12 = true;
            }
            boolean z13 = h3 | z12;
            Object O2 = rVar.O();
            if (z13 || O2 == obj) {
                O2 = new k1(j1Var, z3);
                rVar.k0(O2);
            }
            o oVar = (o) O2;
            boolean f12 = m2.f(j1Var.k().f24516b);
            r2.x k3 = j1Var.k();
            if (z3) {
                j10 = k3.f24516b >> 32;
            } else {
                j10 = k3.f24516b & 4294967295L;
            }
            int i15 = (int) j10;
            e1 e1Var = j1Var.f19321d;
            if (e1Var != null && (d2 = e1Var.d()) != null) {
                f10 = a1.x(d2.f17113a, i15);
            } else {
                f10 = 0.0f;
            }
            boolean h10 = rVar.h(p1Var);
            Object O3 = rVar.O();
            if (h10 || O3 == obj) {
                O3 = new x(p1Var, 1);
                rVar.k0(O3);
            }
            jVar2 = jVar;
            float f13 = f10;
            z10 = z3;
            d(oVar, z10, jVar2, f12, 0L, f13, v1.b(o.f15687a, p1Var, (PointerInputEventHandler) O3), rVar, (i10 << 3) & 1008);
        } else {
            z10 = z3;
            jVar2 = jVar;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new f(z10, jVar2, j1Var, i);
        }
    }

    public static final r h(m0 m0Var, t tVar) {
        boolean z3;
        if (m0Var.i() == i.f19302u) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new r(m(m0Var.j(), z3, true, m0Var.l(), tVar), m(m0Var.h(), z3, false, m0Var.g(), tVar), z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:10:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(v1.b r6, ve.a r7) {
        /*
            boolean r0 = r7 instanceof e0
            if (r0 == 0) goto L13
            r0 = r7
            e0 r0 = (e0) r0
            int r1 = r0.f19263w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19263w = r1
            goto L18
        L13:
            e0 r0 = new e0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19262v
            int r1 = r0.f19263w
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            v1.b r6 = r0.f19261u
            pe.a.e(r7)
            goto L42
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r6)
            r6 = 0
            return r6
        L2e:
            pe.a.e(r7)
        L31:
            r0.f19261u = r6
            r0.f19263w = r2
            v1.g0 r6 = (v1.g0) r6
            v1.l r7 = v1.l.f27332v
            java.lang.Object r7 = r6.b(r7, r0)
            ue.a r1 = ue.a.f27192u
            if (r7 != r1) goto L42
            return r1
        L42:
            v1.k r7 = (v1.k) r7
            java.lang.Object r1 = r7.f27327a
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
        L4e:
            if (r4 >= r3) goto L60
            java.lang.Object r5 = r1.get(r4)
            v1.t r5 = (v1.t) r5
            boolean r5 = v1.b(r5)
            if (r5 != 0) goto L5d
            goto L31
        L5d:
            int r4 = r4 + 1
            goto L4e
        L60:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.v0.i(v1.b, ve.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(v1.b r17, l r18, e1 r19, v1.k r20, ve.a r21) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.v0.j(v1.b, l, e1, v1.k, ve.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        if (r14 == r5) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00a2, B:15:0x00aa, B:17:0x00bb, B:19:0x00c7, B:21:0x00ca, B:24:0x00cd, B:28:0x00d1, B:32:0x0040, B:34:0x0063, B:36:0x0067, B:40:0x0087, B:45:0x004a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(v1.b r11, p1 r12, v1.k r13, ve.a r14) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.v0.k(v1.b, p1, v1.k, ve.a):java.lang.Object");
    }

    public static final q l(m0 m0Var, p pVar, q qVar) {
        int i;
        int g8;
        int i10;
        boolean z3;
        if (m0Var.a()) {
            i = pVar.f19385c;
        } else {
            i = pVar.f19386d;
        }
        int i11 = i;
        if (m0Var.a()) {
            g8 = m0Var.l();
        } else {
            g8 = m0Var.g();
        }
        int i12 = pVar.f19384b;
        m2.m0 m0Var2 = pVar.f19387f;
        int i13 = pVar.e;
        if (g8 != i12) {
            return pVar.a(i11);
        }
        l0 l0Var = new l0(pVar, i11);
        pe.h hVar = pe.h.f22691v;
        pe.g c10 = pe.a.c(hVar, l0Var);
        if (m0Var.a()) {
            i10 = pVar.f19386d;
        } else {
            i10 = pVar.f19385c;
        }
        pe.g c11 = pe.a.c(hVar, new u(pVar, i11, i10, m0Var, c10));
        if (pVar.f19383a != qVar.f19394c) {
            return (q) c11.getValue();
        }
        if (i11 == i13) {
            return qVar;
        }
        if (((Number) c10.getValue()).intValue() != m0Var2.f20525b.d(i13)) {
            return (q) c11.getValue();
        }
        int i14 = qVar.f19393b;
        long k3 = m0Var2.k(i14);
        boolean a10 = m0Var.a();
        if (i13 != -1) {
            if (i11 != i13) {
                if (pVar.b() == i.f19302u) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!(a10 ^ z3)) {
                }
            }
            return pVar.a(i11);
        }
        int i15 = m2.p0.f20545c;
        if (i14 != ((int) (k3 >> 32)) && i14 != ((int) (k3 & 4294967295L))) {
            return pVar.a(i11);
        }
        return (q) c11.getValue();
    }

    public static final q m(p pVar, boolean z3, boolean z9, int i, t tVar) {
        int i10;
        long b10;
        long j10;
        if (z9) {
            i10 = pVar.f19385c;
        } else {
            i10 = pVar.f19386d;
        }
        if (i != pVar.f19384b) {
            return pVar.a(i10);
        }
        switch (tVar.f19412a) {
            case 0:
                String str = pVar.f19387f.f20524a.f20514a.f20477v;
                b10 = m2.b(a1.u(str, i10), g0.t(str, i10));
                break;
            default:
                b10 = pVar.f19387f.k(i10);
                break;
        }
        if (z3 ^ z9) {
            int i11 = m2.p0.f20545c;
            j10 = b10 >> 32;
        } else {
            int i12 = m2.p0.f20545c;
            j10 = 4294967295L & b10;
        }
        return pVar.a((int) j10);
    }

    public static final j n(j jVar, j jVar2, n0 n0Var, long j10, q qVar) {
        if (qVar != null) {
            int compare = n0Var.f19370f.compare(Long.valueOf(qVar.f19394c), Long.valueOf(j10));
            if (compare < 0) {
                return j.f19310u;
            }
            if (compare > 0) {
                return j.f19312w;
            }
            return j.f19311v;
        }
        return x(jVar, jVar2);
    }

    public static final q o(q qVar, p pVar, int i) {
        return new q(pVar.f19387f.a(i), i, qVar.f19394c);
    }

    public static final boolean p(c cVar, long j10) {
        float f10 = cVar.f18763a;
        float f11 = cVar.f18765c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        if (f10 <= intBitsToFloat && intBitsToFloat <= f11) {
            float f12 = cVar.f18764b;
            float f13 = cVar.f18766d;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
            if (f12 <= intBitsToFloat2 && intBitsToFloat2 <= f13) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f q(d r29, float r30) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.v0.q(d, float):f");
    }

    public static final long r(t0 t0Var, long j10, q qVar) {
        z1.x c10;
        int b10;
        long b11;
        long j11;
        float f10;
        m2.q qVar2;
        int d2;
        float g8;
        float d10;
        m2.q qVar3;
        int d11;
        m2.q qVar4;
        int d12;
        float b12;
        m2.q qVar5;
        int d13;
        n c11 = t0Var.c(qVar);
        if (c11 != null) {
            i iVar = c11.f19363c;
            z1.x xVar = t0Var.f19421k;
            if (xVar != null && (c10 = c11.c()) != null) {
                int i = qVar.f19393b;
                m2.m0 m0Var = (m2.m0) iVar.invoke();
                if (m0Var == null) {
                    b10 = 0;
                } else {
                    b10 = c11.b(m0Var);
                }
                if (i <= b10) {
                    b bVar = (b) t0Var.f19427q.getValue();
                    bVar.getClass();
                    float intBitsToFloat = Float.intBitsToFloat((int) (c10.d(xVar, bVar.f18762a) >> 32));
                    m2.m0 m0Var2 = (m2.m0) iVar.invoke();
                    if (m0Var2 == null) {
                        b11 = m2.p0.f20544b;
                    } else {
                        m2.q qVar6 = m0Var2.f20525b;
                        int b13 = c11.b(m0Var2);
                        if (b13 < 1) {
                            b11 = m2.p0.f20544b;
                        } else {
                            int d14 = qVar6.d(b9.e(i, 0, b13 - 1));
                            b11 = m2.b(m0Var2.h(d14), qVar6.c(d14, true));
                        }
                    }
                    if (m2.b(b11)) {
                        m2.m0 m0Var3 = (m2.m0) iVar.invoke();
                        if (m0Var3 == null || (d13 = (qVar5 = m0Var3.f20525b).d(i)) >= qVar5.f20551f) {
                            d10 = -1.0f;
                        } else {
                            d10 = m0Var3.f(d13);
                        }
                        j11 = 4294967295L;
                    } else {
                        j11 = 4294967295L;
                        int i10 = (int) (b11 >> 32);
                        m2.m0 m0Var4 = (m2.m0) iVar.invoke();
                        if (m0Var4 == null || (d11 = (qVar3 = m0Var4.f20525b).d(i10)) >= qVar3.f20551f) {
                            f10 = -1.0f;
                        } else {
                            f10 = m0Var4.f(d11);
                        }
                        int i11 = ((int) (b11 & 4294967295L)) - 1;
                        m2.m0 m0Var5 = (m2.m0) iVar.invoke();
                        if (m0Var5 == null || (d2 = (qVar2 = m0Var5.f20525b).d(i11)) >= qVar2.f20551f) {
                            g8 = -1.0f;
                        } else {
                            g8 = m0Var5.g(d2);
                        }
                        d10 = b9.d(intBitsToFloat, Math.min(f10, g8), Math.max(f10, g8));
                    }
                    if (d10 != -1.0f) {
                        if (y2.c(j10, 0L) || Math.abs(intBitsToFloat - d10) <= ((int) (j10 >> 32)) / 2) {
                            m2.m0 m0Var6 = (m2.m0) iVar.invoke();
                            if (m0Var6 == null || (d12 = (qVar4 = m0Var6.f20525b).d(i)) >= qVar4.f20551f) {
                                b12 = -1.0f;
                            } else {
                                float f11 = qVar4.f(d12);
                                b12 = ((qVar4.b(d12) - f11) / 2) + f11;
                            }
                            if (b12 == -1.0f) {
                                return 9205357640488583168L;
                            }
                            return xVar.d(c10, (Float.floatToRawIntBits(d10) << 32) | (Float.floatToRawIntBits(b12) & j11));
                        }
                        return 9205357640488583168L;
                    }
                    return 9205357640488583168L;
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    public static final int s(long j10, m2.m0 m0Var) {
        int i = (int) (4294967295L & j10);
        if (Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        m2.q qVar = m0Var.f20525b;
        if (intBitsToFloat >= qVar.e) {
            return m0Var.f20524a.f20514a.f20477v.length();
        }
        return qVar.g(j10);
    }

    public static final long t(m2.m0 m0Var, int i, boolean z3, boolean z9) {
        int max;
        boolean z10;
        int d2;
        float i10;
        m2.q qVar = m0Var.f20525b;
        long j10 = m0Var.f20526c;
        int d10 = qVar.d(i);
        if (d10 >= qVar.f20551f) {
            return 9205357640488583168L;
        }
        if ((z3 && !z9) || (!z3 && z9)) {
            max = i;
        } else {
            max = Math.max(i - 1, 0);
        }
        if (m0Var.a(max) == m0Var.i(i)) {
            z10 = true;
        } else {
            z10 = false;
        }
        qVar.l(i);
        int length = ((m2.g) qVar.f20547a.f15036v).f20477v.length();
        ArrayList arrayList = qVar.f20553h;
        if (i == length) {
            d2 = qe.f(arrayList);
        } else {
            d2 = m2.d(i, arrayList);
        }
        m2.s sVar = (m2.s) arrayList.get(d2);
        m2.a aVar = sVar.f20561a;
        int d11 = sVar.d(i);
        n2.h hVar = (n2.h) aVar.f20437d;
        if (z10) {
            i10 = hVar.h(d11, false);
        } else {
            i10 = hVar.i(d11, false);
        }
        float d12 = b9.d(i10, 0.0f, (int) (j10 >> 32));
        float d13 = b9.d(qVar.b(d10), 0.0f, (int) (j10 & 4294967295L));
        return (Float.floatToRawIntBits(d12) << 32) | (Float.floatToRawIntBits(d13) & 4294967295L);
    }

    public static final x2.j u(m2.m0 m0Var, int i) {
        m2.l0 l0Var = m0Var.f20524a;
        m2.q qVar = m0Var.f20525b;
        if (l0Var.f20514a.f20477v.length() != 0) {
            int d2 = qVar.d(i);
            if ((i != 0 && d2 == qVar.d(i - 1)) || (i != l0Var.f20514a.f20477v.length() && d2 == qVar.d(i + 1))) {
                return m0Var.a(i);
            }
        }
        return m0Var.i(i);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.lang.Object] */
    public static final boolean v(v1.k kVar) {
        Object r52 = kVar.f27327a;
        int size = ((Collection) r52).size();
        for (int i = 0; i < size; i++) {
            if (((v1.t) r52.get(i)).i != 2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean w(j1 j1Var, boolean z3) {
        z1.x c10;
        e1 e1Var = j1Var.f19321d;
        if (e1Var != null && (c10 = e1Var.c()) != null) {
            return p(y(c10), j1Var.j(z3));
        }
        return false;
    }

    public static final j x(j jVar, j jVar2) {
        int ordinal = jVar2.ordinal();
        j jVar3 = j.f19310u;
        if (ordinal != 0) {
            j jVar4 = j.f19312w;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return jVar4;
                }
                l4.a.o();
                return null;
            }
            int ordinal2 = jVar.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        return jVar4;
                    }
                    l4.a.o();
                    return null;
                }
                return j.f19311v;
            }
        }
        return jVar3;
    }

    public static final c y(z1.x xVar) {
        c g8 = z1.g(xVar);
        long E = xVar.E(g8.d());
        float f10 = g8.f18765c;
        float f11 = g8.f18766d;
        long E2 = xVar.E((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
        return new c(Float.intBitsToFloat((int) (E >> 32)), Float.intBitsToFloat((int) (E & 4294967295L)), Float.intBitsToFloat((int) (E2 >> 32)), Float.intBitsToFloat((int) (E2 & 4294967295L)));
    }
}