package r7;
import a.a;
import m.d;
import m.h;

import b2.b0;
import d1.o;
import d1.r;
import df.p;
import k1.c0;
import k1.l0;
import o0.x1;
import pe.z;
import q2.s;
import r0.q1;
import r0.y;
import wa.j7;
import ya.ae;
import z1.p0;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final long f24622a = l0.d(4062323239L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f24623b = l0.d(4294551589L);

    public static final void a(int i, r rVar, r0.m mVar) {
        boolean z3;
        r rVar2;
        r0.r rVar3 = (r0.r) mVar;
        rVar3.c0(1384254778);
        int i10 = i | 6;
        if ((i10 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar3.R(i10 & 1, z3)) {
            f0.d a10 = f0.e.a(6);
            o oVar = o.f15687a;
            r l10 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a(j7.a(oVar, a10), new c0(qe.h(new k1.r(f24623b), new k1.r(l0.d(4293880832L))), null, 0L, 9187343241974906880L), 6), 5, 1);
            p0 d2 = x.d(d1.c.f15670u, false);
            int hashCode = Long.hashCode(rVar3.T);
            z0.g l11 = rVar3.l();
            r c10 = d1.a.c(l10, rVar3);
            b2.h.f1471d.getClass();
            b0 b0Var = b2.g.f1462b;
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(b0Var);
            } else {
                rVar3.n0();
            }
            y.I(b2.g.e, d2, rVar3);
            y.I(b2.g.f1464d, l11, rVar3);
            b2.f fVar = b2.g.f1465f;
            if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode))) {
                p.a.t(hashCode, rVar3, hashCode, fVar);
            }
            y.I(b2.g.f1463c, c10, rVar3);
            x1.b("PRO", null, k1.r.f19515d, ae.e(8), null, s.B, null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 200070, 0, 131026);
            rVar3 = rVar3;
            rVar3.p(true);
            rVar2 = oVar;
        } else {
            rVar3.U();
            rVar2 = rVar;
        }
        q1 t3 = rVar3.t();
        if (t3 != null) {
            t3.f24332d = new b8.m(i, 4, rVar2);
        }
    }

    public static final void b(final boolean z3, final String str, final df.a aVar, r0.m mVar, final int i) {
        int i10;
        boolean z9;
        final boolean z10;
        String str2;
        df.a aVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        aVar.getClass();
        r0.r rVar = (r0.r) mVar;
        rVar.c0(-129278789);
        if ((i & 6) == 0) {
            if (rVar.g(z3)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.f(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i & 384) == 0) {
            if (rVar.h(aVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        int i15 = i10 | 3072;
        if ((i15 & 1171) != 1170) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i15 & 1, z9)) {
            if (!z3) {
                q1 t3 = rVar.t();
                if (t3 != null) {
                    final int i16 = 0;
                    t3.f24332d = new p() { // from class: r7.c
                        @Override // df.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i17 = i16;
                            r0.m mVar2 = (r0.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i17) {
                                case 0:
                                    e.b(z3, str, aVar, mVar2, y.L(i | 1));
                                    break;
                                default:
                                    e.b(z3, str, aVar, mVar2, y.L(i | 1));
                                    break;
                            }
                            return z.f22715a;
                        }
                    };
                    return;
                }
                return;
            }
            z10 = z3;
            str2 = str;
            aVar2 = aVar;
            i11 = i;
            wa.p.a(aVar2, null, z0.h.d(-1670061500, new d(str2, aVar2), rVar), rVar, ((i15 >> 6) & 14) | 384, 2);
        } else {
            z10 = z3;
            str2 = str;
            aVar2 = aVar;
            i11 = i;
            rVar.U();
        }
        q1 t10 = rVar.t();
        if (t10 != null) {
            final int i17 = 1;
            final String str3 = str2;
            final int i18 = i11;
            final df.a aVar3 = aVar2;
            t10.f24332d = new p() { // from class: r7.c
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    int i172 = i17;
                    r0.m mVar2 = (r0.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i172) {
                        case 0:
                            e.b(z10, str3, aVar3, mVar2, y.L(i18 | 1));
                            break;
                        default:
                            e.b(z10, str3, aVar3, mVar2, y.L(i18 | 1));
                            break;
                    }
                    return z.f22715a;
                }
            };
        }
    }
}
