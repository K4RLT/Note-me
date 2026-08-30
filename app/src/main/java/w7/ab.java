package w7;
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
import p.k;
import p7.b;
import q2.s;
import r0.a1;
import r0.l;
import r0.m;
import r0.y;
import z1.p0;

import ya.ae;

/* loaded from: classes.dex */
public final /* synthetic */ class ab implements df.r {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27910u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f27911v;

    public /* synthetic */ ab(a1 a1Var, int i) {
        this.f27910u = i;
        this.f27911v = a1Var;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z3;
        boolean z9;
        long c10;
        long c11;
        s sVar;
        int i;
        switch (this.f27910u) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                m mVar = (m) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((b) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    if (((r) mVar).d(intValue)) {
                        i = 32;
                    } else {
                        i = 16;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 145) != 144) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue2 & 1, z3)) {
                    b bVar = b.values()[intValue];
                    a1 a1Var = this.f27911v;
                    if (bVar == ((b) a1Var.getValue())) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    r a10 = wa.j7.a(o.f15687a, f0.e.a(8));
                    if (z9) {
                        c10 = l0.d(4284246976L);
                    } else {
                        c10 = r.c(r.f19515d, 0.08f);
                    }
                    r b10 = androidx.compose.foundation.a.b(a10, c10, l0.f19495a);
                    boolean d2 = rVar.d(bVar.ordinal());
                    Object O = rVar.O();
                    if (d2 || O == l.f24285a) {
                        O = new androidx.ink.brush.b(bVar, 21, a1Var);
                        rVar.k0(O);
                    }
                    r l10 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.f(null, false, b10, (df.a) O, 7), 10, 5);
                    p0 d10 = m.d(c.f15670u, false);
                    int hashCode = Long.hashCode(rVar.T);
                    g l11 = rVar.l();
                    r c12 = a.c(l10, rVar);
                    h.f1471d.getClass();
                    b0 b0Var = g.f1462b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(g.e, d10, rVar);
                    y.I(g.f1464d, l11, rVar);
                    f fVar = g.f1465f;
                    if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                        a.t(hashCode, rVar, hashCode, fVar);
                    }
                    y.I(g.f1463c, c12, rVar);
                    String displayName = bVar.getDisplayName();
                    if (z9) {
                        c11 = r.f19515d;
                    } else {
                        c11 = r.c(r.f19515d, 0.75f);
                    }
                    long j10 = c11;
                    long e = ae.e(11);
                    if (z9) {
                        sVar = s.B;
                    } else {
                        sVar = s.f23367y;
                    }
                    x1.b(displayName, null, j10, e, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 3072, 0, 131026);
                    rVar.p(true);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
            default:
                m mVar2 = (m) obj2;
                m mVar3 = (m) obj3;
                ((Integer) obj4).getClass();
                ((k) obj).getClass();
                mVar2.getClass();
                int i10 = k.f31961a[mVar2.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        r rVar2 = (r) mVar3;
                        rVar2.a0(377545983);
                        l.e(0, rVar2);
                        rVar2.p(false);
                    } else {
                        r rVar3 = (r) mVar3;
                        rVar3.a0(377541324);
                        rVar3.p(false);
                        l4.a.o();
                        return null;
                    }
                } else {
                    r rVar4 = (r) mVar3;
                    rVar4.a0(377542942);
                    Object O2 = rVar4.O();
                    if (O2 == l.f24285a) {
                        O2 = new z8(this.f27911v, 7);
                        rVar4.k0(O2);
                    }
                    l.b((df.l) O2, rVar4, 6);
                    rVar4.p(false);
                }
                return pe.z.f22715a;
        }
    }
}
