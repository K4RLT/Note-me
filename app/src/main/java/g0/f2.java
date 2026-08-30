package g0;
import g0.b;
import g0.i;
import a.a;
import a0.o;
import b0.n;
import b2.f;
import b2.g;
import b2.h;
import b2.k0;
import c2.p1;
import d1.r;
import g0.e2;
import k0.j1;
import k0.q0;
import k0.t0;
import k0.w;
import k0.y0;
import m2.g0;
import m2.h0;
import m2.p0;
import p.d0;
import p.i1;
import q.k1;
import r0.a1;
import r0.l;
import r0.m;
import r0.v0;
import r0.y;
import r0.z1;
import s1.b;
import z0.c;
import z1.m0;
import z1.o0;
import z1.r0;

import r0.n2;
import wa.b9;

/* loaded from: classes.dex */
public final class f2 extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17101u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f17102v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(int i, Object obj) {
        super(3);
        this.f17101u = i;
        this.f17102v = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [e2, java.lang.Object] */
    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i;
        int i10;
        int i11 = this.f17101u;
        int i12 = 16;
        o oVar = o.f15687a;
        pe.z zVar = pe.z.f22715a;
        qe.t tVar = qe.t.f24024u;
        boolean z3 = true;
        int i13 = 2;
        v0 v0Var = l.f24285a;
        int i14 = 0;
        Object obj4 = this.f17102v;
        switch (i11) {
            case 0:
                long j10 = ((y2.a) obj3).f30799a;
                long j11 = ((e2) obj4).f17090f;
                a1 z9 = ((o0) obj2).z(y2.a(j10, b9.e((int) (j11 >> 32), y2.a.j(j10), y2.a.h(j10)), 0, b9.e((int) (j11 & 4294967295L), y2.a.i(j10), y2.a.g(j10)), 0, 10));
                return ((r0) obj).u0(z9.f31769u, z9.f31770v, tVar, new n(z9, 2));
            case 1:
                ((Number) obj3).intValue();
                r rVar = (r) ((m) obj2);
                rVar.a0(1582736677);
                y2.c cVar = (y2.c) rVar.j(p1.f3606h);
                q2.h hVar = (q2.h) rVar.j(p1.f3608k);
                y2.m mVar = (y2.m) rVar.j(p1.f3611n);
                q0 q0Var = (q0) obj4;
                boolean f10 = rVar.f(q0Var) | rVar.f(mVar);
                Object O = rVar.O();
                Object obj5 = O;
                if (f10 || O == v0Var) {
                    q0 i15 = g0.i(q0Var, mVar);
                    rVar.k0(i15);
                    obj5 = i15;
                }
                q0 q0Var2 = (q0) obj5;
                boolean f11 = rVar.f(hVar) | rVar.f(q0Var2);
                Object O2 = rVar.O();
                Object obj6 = O2;
                if (f11 || O2 == v0Var) {
                    h0 h0Var = q0Var2.f20555a;
                    q2.i iVar = h0Var.f20488f;
                    q2.s sVar = h0Var.f20486c;
                    if (sVar == null) {
                        sVar = q2.s.f23367y;
                    }
                    q2.o oVar2 = h0Var.f20487d;
                    if (oVar2 != null) {
                        i = oVar2.f23361a;
                    } else {
                        i = 0;
                    }
                    q2.p pVar = h0Var.e;
                    if (pVar != null) {
                        i10 = pVar.f23362a;
                    } else {
                        i10 = 65535;
                    }
                    q2.f0 b10 = ((q2.j) hVar).b(iVar, sVar, i, i10);
                    rVar.k0(b10);
                    obj6 = b10;
                }
                n2 n2Var = (n2) obj6;
                Object O3 = rVar.O();
                Object obj7 = O3;
                if (O3 == v0Var) {
                    Object value = n2Var.getValue();
                    Object obj8 = new Object();
                    obj8.f17086a = mVar;
                    obj8.f17087b = cVar;
                    obj8.f17088c = hVar;
                    obj8.f17089d = q0Var;
                    obj8.e = value;
                    obj8.f17090f = b(q0Var, cVar, hVar);
                    rVar.k0(obj8);
                    obj7 = obj8;
                }
                e2 e2Var = (e2) obj7;
                Object value2 = n2Var.getValue();
                if (mVar != e2Var.f17086a || !kotlin.jvm.internal.a(cVar, e2Var.f17087b) || !kotlin.jvm.internal.a(hVar, e2Var.f17088c) || !kotlin.jvm.internal.a(q0Var2, e2Var.f17089d) || !kotlin.jvm.internal.a(value2, e2Var.e)) {
                    e2Var.f17086a = mVar;
                    e2Var.f17087b = cVar;
                    e2Var.f17088c = hVar;
                    e2Var.f17089d = q0Var2;
                    e2Var.e = value2;
                    e2Var.f17090f = b(q0Var2, cVar, hVar);
                }
                boolean h3 = rVar.h(e2Var);
                Object O4 = rVar.O();
                Object obj9 = O4;
                if (h3 || O4 == v0Var) {
                    f2 f2Var = new f2(i14, e2Var);
                    rVar.k0(f2Var);
                    obj9 = f2Var;
                }
                r b11 = androidx.compose.ui.layout.a.b(oVar, (df.q) obj9);
                rVar.p(false);
                return b11;
            case 2:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                g gVar = (g) obj4;
                if (!booleanValue) {
                    intValue = gVar.P.c(intValue);
                }
                if (!booleanValue) {
                    intValue2 = gVar.P.c(intValue2);
                }
                if (gVar.N) {
                    long j12 = gVar.L.f24516b;
                    int i16 = p0.f20545c;
                    if (intValue != ((int) (j12 >> 32)) || intValue2 != ((int) (j12 & 4294967295L))) {
                        int min = Math.min(intValue, intValue2);
                        s0 s0Var = s0.f17275u;
                        if (min >= 0 && Math.max(intValue, intValue2) <= gVar.L.f24515a.f20477v.length()) {
                            if (!booleanValue && intValue != intValue2) {
                                gVar.Q.f(true);
                            } else {
                                j1 j1Var = gVar.Q;
                                j1Var.q(false);
                                j1Var.o(s0Var);
                            }
                            gVar.M.f17081v.invoke(new r2.x(gVar.L.f24515a, g0.b(intValue, intValue2), (p0) null));
                            return Boolean.valueOf(z3);
                        }
                        j1 j1Var2 = gVar.Q;
                        j1Var2.q(false);
                        j1Var2.o(s0Var);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            case 3:
                r rVar2 = (r) obj;
                ((Number) obj3).intValue();
                t0 t0Var = (t0) obj4;
                r rVar3 = (r) ((m) obj2);
                rVar3.a0(-1914520728);
                y2.c cVar2 = (y2.c) rVar3.j(p1.f3606h);
                Object O5 = rVar3.O();
                Object obj10 = O5;
                if (O5 == v0Var) {
                    i1 B = y.B(new y2.l(0L));
                    rVar3.k0(B);
                    obj10 = B;
                }
                a1 a1Var = (a1) obj10;
                boolean h10 = rVar3.h(t0Var);
                Object O6 = rVar3.O();
                Object obj11 = O6;
                if (h10 || O6 == v0Var) {
                    o oVar3 = new o(t0Var, 16, a1Var);
                    rVar3.k0(oVar3);
                    obj11 = oVar3;
                }
                df.a aVar = (df.a) obj11;
                boolean f12 = rVar3.f(cVar2);
                Object O7 = rVar3.O();
                Object obj12 = O7;
                if (f12 || O7 == v0Var) {
                    y0 y0Var = new y0(cVar2, a1Var, 1);
                    rVar3.k0(y0Var);
                    obj12 = y0Var;
                }
                n nVar = q0.f19395a;
                r a10 = a(rVar2, new n(aVar, 2, (df.l) obj12));
                rVar3.p(false);
                return a10;
            case 4:
                r rVar4 = (r) obj;
                ((Number) obj3).intValue();
                j1 j1Var3 = (j1) obj4;
                r rVar5 = (r) ((m) obj2);
                rVar5.a0(1980580247);
                y2.c cVar3 = (y2.c) rVar5.j(p1.f3606h);
                Object O8 = rVar5.O();
                Object obj13 = O8;
                if (O8 == v0Var) {
                    i1 B2 = y.B(new y2.l(0L));
                    rVar5.k0(B2);
                    obj13 = B2;
                }
                a1 a1Var2 = (a1) obj13;
                boolean h11 = rVar5.h(j1Var3);
                Object O9 = rVar5.O();
                Object obj14 = O9;
                if (h11 || O9 == v0Var) {
                    o oVar4 = new o(j1Var3, 17, a1Var2);
                    rVar5.k0(oVar4);
                    obj14 = oVar4;
                }
                df.a aVar2 = (df.a) obj14;
                boolean f13 = rVar5.f(cVar3);
                Object O10 = rVar5.O();
                Object obj15 = O10;
                if (f13 || O10 == v0Var) {
                    y0 y0Var2 = new y0(cVar3, a1Var2, 3);
                    rVar5.k0(y0Var2);
                    obj15 = y0Var2;
                }
                n nVar2 = q0.f19395a;
                r a11 = a(rVar4, new n(aVar2, 2, (df.l) obj15));
                rVar5.p(false);
                return a11;
            case 5:
                a1 z10 = ((o0) obj2).z(((y2.a) obj3).f30799a);
                return ((r0) obj).u0(z10.f31769u, z10.f31770v, tVar, new w(z10, 6, (d0) obj4));
            case 6:
                ((Number) obj3).intValue();
                r rVar6 = (r) ((m) obj2);
                rVar6.a0(438406499);
                k1 k1Var = (k1) obj4;
                rVar6.p(false);
                return k1Var;
            case 7:
                r0 r0Var = (r0) obj;
                a1 z11 = ((o0) obj2).z(((y2.a) obj3).f30799a);
                return r0Var.u0(z11.f31769u, z11.f31770v, tVar, new k0(i12, r0Var, (j1) obj4, z11));
            case 8:
                m0 m0Var = (m0) obj;
                ((Number) obj3).intValue();
                r rVar7 = (r) ((m) obj2);
                Object O11 = rVar7.O();
                if (O11 == v0Var) {
                    O11 = y.p(rVar7);
                    rVar7.k0(O11);
                }
                pf.z zVar2 = (pf.z) O11;
                Object O12 = rVar7.O();
                if (O12 == v0Var) {
                    O12 = new j1(m0Var, zVar2);
                    rVar7.k0(O12);
                }
                j1 j1Var4 = (j1) O12;
                c cVar4 = (c) obj4;
                Object O13 = rVar7.O();
                if (O13 == v0Var) {
                    O13 = new f2(7, j1Var4);
                    rVar7.k0(O13);
                }
                r b12 = androidx.compose.ui.layout.a.b(oVar, (df.q) O13);
                Object O14 = rVar7.O();
                if (O14 == v0Var) {
                    O14 = new i1(j1Var4, true ? 1 : 0);
                    rVar7.k0(O14);
                }
                cVar4.d(j1Var4, androidx.compose.ui.draw.a.c(b12, (df.l) O14), rVar7, 6);
                Object O15 = rVar7.O();
                if (O15 == v0Var) {
                    O15 = new i1(j1Var4, i13);
                    rVar7.k0(O15);
                }
                y.c(zVar, (df.l) O15, rVar7);
                return zVar;
            default:
                r rVar8 = ((z1) obj).f24444a;
                m mVar2 = (m) obj2;
                ((Number) obj3).intValue();
                int hashCode = Long.hashCode(((r) mVar2).T);
                r c10 = a.c((r) obj4, mVar2);
                rVar8.b0(509942095);
                h.f1471d.getClass();
                y.I(g.f1463c, c10, rVar8);
                f fVar = g.f1465f;
                if (rVar8.S || !kotlin.jvm.internal.a(rVar8.O(), Integer.valueOf(hashCode))) {
                    a.t(hashCode, rVar8, hashCode, fVar);
                }
                rVar8.p(false);
                return zVar;
        }
    }
}