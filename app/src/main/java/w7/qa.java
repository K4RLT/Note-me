package w7;
import b.b;
import r.c;
import x1.b;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import k1.l0;
import o0.x1;
import q2.s;
import r0.e1;
import r0.l;
import r0.m;
import r0.y;
import x.b;
import x.q;
import z.e;
import z1.p0;

import ya.ae;

/* loaded from: classes.dex */
public final /* synthetic */ class qa implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28963u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28964v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28965w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f28966x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u7.d f28967y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f28968z;

    public /* synthetic */ qa(u7.m3 m3Var, int i, int i10, u7.d dVar, e1 e1Var) {
        this.f28964v = m3Var;
        this.f28965w = i;
        this.f28966x = i10;
        this.f28967y = dVar;
        this.f28968z = e1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f28963u) {
            case 0:
                final u7.d8 d8Var = (u7.d8) this.f28968z;
                e eVar = (e) obj;
                eVar.getClass();
                int size = u7.e8.f26153a.size();
                final u7.d dVar = this.f28967y;
                final u7.m3 m3Var = this.f28964v;
                final int i = this.f28965w;
                final int i10 = this.f28966x;
                e.p(eVar, size, null, new c(-1015865614, new df.r() { // from class: w7.ta
                    @Override // df.r
                    public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                        boolean z3;
                        float f10;
                        long j10;
                        int i11;
                        float f11;
                        long c10;
                        s sVar;
                        int i12;
                        int intValue = ((Integer) obj3).intValue();
                        m mVar = (m) obj4;
                        int intValue2 = ((Integer) obj5).intValue();
                        ((b) obj2).getClass();
                        if ((intValue2 & 48) == 0) {
                            if (((r) mVar).d(intValue)) {
                                i12 = 32;
                            } else {
                                i12 = 16;
                            }
                            intValue2 |= i12;
                        }
                        if ((intValue2 & 145) != 144) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        r rVar = (r) mVar;
                        if (rVar.R(intValue2 & 1, z3)) {
                            u7.d8 d8Var2 = (u7.d8) u7.e8.f26153a.get(intValue);
                            String str = d8Var2.f26105a;
                            String str2 = d8Var2.f26105a;
                            boolean equals = str.equals(u7.d8.this.f26105a);
                            r a10 = q.a(h.f29962b, c.H, rVar, 48);
                            int hashCode = Long.hashCode(rVar.T);
                            g l10 = rVar.l();
                            o oVar = o.f15687a;
                            r c11 = a.c(oVar, rVar);
                            h.f1471d.getClass();
                            b0 b0Var = g.f1462b;
                            rVar.e0();
                            if (rVar.S) {
                                rVar.k(b0Var);
                            } else {
                                rVar.n0();
                            }
                            f fVar = g.e;
                            y.I(fVar, a10, rVar);
                            f fVar2 = g.f1464d;
                            y.I(fVar2, l10, rVar);
                            f fVar3 = g.f1465f;
                            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                                a.t(hashCode, rVar, hashCode, fVar3);
                            }
                            f fVar4 = g.f1463c;
                            y.I(fVar4, c11, rVar);
                            float f12 = 10;
                            r b10 = androidx.compose.foundation.a.b(wa.j7.a(androidx.compose.foundation.layout.d.l(oVar, xa.f29464a, xa.f29465b), f0.e.a(f12)), l0.d(4293520110L), l0.f19495a);
                            if (equals) {
                                f10 = 2;
                            } else {
                                f10 = 0;
                            }
                            if (equals) {
                                j10 = l0.d(4286352632L);
                            } else {
                                j10 = r.f19520k;
                            }
                            r a11 = ya.a(b10, f10, j10, f0.e.a(f12));
                            boolean f13 = rVar.f(d8Var2);
                            u7.d dVar2 = dVar;
                            boolean f14 = f13 | rVar.f(dVar2);
                            u7.m3 m3Var2 = m3Var;
                            boolean h3 = f14 | rVar.h(m3Var2);
                            int i13 = i;
                            boolean d2 = h3 | rVar.d(i13);
                            int i14 = i10;
                            boolean d10 = d2 | rVar.d(i14);
                            Object O = rVar.O();
                            if (d10 || O == l.f24285a) {
                                u7.i0 i0Var = new u7.i0(d8Var2, dVar2, m3Var2, i13, i14);
                                rVar.k0(i0Var);
                                O = i0Var;
                            }
                            r f15 = androidx.compose.foundation.a.f(null, false, a11, (df.a) O, 7);
                            p0 d11 = m.d(c.f15674y, false);
                            int hashCode2 = Long.hashCode(rVar.T);
                            g l11 = rVar.l();
                            r c12 = a.c(f15, rVar);
                            rVar.e0();
                            if (rVar.S) {
                                rVar.k(b0Var);
                            } else {
                                rVar.n0();
                            }
                            y.I(fVar, d11, rVar);
                            y.I(fVar2, l11, rVar);
                            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode2))) {
                                a.t(hashCode2, rVar, hashCode2, fVar3);
                            }
                            y.I(fVar4, c12, rVar);
                            if (str2.equals(dVar2.f26047q)) {
                                i11 = dVar2.f26048r;
                            } else {
                                i11 = d8Var2.e;
                            }
                            int i15 = i11;
                            if (str2.equals(dVar2.f26047q)) {
                                f11 = dVar2.f26049s;
                            } else {
                                f11 = d8Var2.f26109f;
                            }
                            a(dVar2, str2, i15, f11, rVar, 0);
                            rVar.p(true);
                            b.b(androidx.compose.foundation.layout.f(oVar, 3), rVar);
                            String b11 = wa.n7.b(d8Var2.f26106b, rVar);
                            if (equals) {
                                c10 = r.f19515d;
                            } else {
                                c10 = r.c(r.f19515d, 0.6f);
                            }
                            long j11 = c10;
                            long e = ae.e(9);
                            if (equals) {
                                sVar = s.A;
                            } else {
                                sVar = s.f23367y;
                            }
                            x1.b(b11, null, j11, e, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 3072, 0, 131026);
                            rVar.p(true);
                        } else {
                            rVar.U();
                        }
                        return pe.z.f22715a;
                    }
                }, true), 6);
                break;
            default:
                Float f10 = (Float) obj;
                ((e1) this.f28968z).i(f10.floatValue());
                u7.m3.r1(this.f28964v, this.f28965w, this.f28966x, this.f28967y.f26033a, null, null, null, null, null, null, null, f10, 1016);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ qa(u7.d8 d8Var, u7.d dVar, u7.m3 m3Var, int i, int i10) {
        this.f28968z = d8Var;
        this.f28967y = dVar;
        this.f28964v = m3Var;
        this.f28965w = i;
        this.f28966x = i10;
    }
}
