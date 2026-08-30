package wa;
import a0.f0;
import a1.c;
import b8.b7;
import h8.b;
import h8.f;
import k1.l0;
import k1.r;
import p7.a;
import r0.l;
import r0.m;
import r0.q1;

import pe.z;
import r0.y;
import wa.p7;

/* loaded from: classes.dex */
public abstract class p7 {
    public static final void a(final r rVar, final f fVar, float f10, float f11, long j10, float f12, long j11, float f13, f0 f0Var, m mVar, final int i) {
        int i10;
        int i11;
        long j12;
        long j13;
        f0 i12;
        int i13;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z3;
        final f0 f0Var2;
        final float f18;
        final long j14;
        final float f19;
        final long j15;
        final float f20;
        final float f21;
        int i14;
        fVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(713000284);
        if ((i & 14) == 0) {
            if (rVar2.f(rVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i | i14;
        } else {
            i10 = i;
        }
        if (rVar2.f(fVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i10 | i11 | 383348096;
        if ((1533916891 & i15) == 306783378 && rVar2.D()) {
            rVar2.U();
            f21 = f10;
            f20 = f11;
            j15 = j10;
            f19 = f12;
            j14 = j11;
            f18 = f13;
            f0Var2 = f0Var;
        } else {
            rVar2.W();
            if ((i & 1) != 0 && !rVar2.A()) {
                rVar2.U();
                f15 = f11;
                j12 = j10;
                f16 = f12;
                j13 = j11;
                f17 = f13;
                i12 = f0Var;
                i13 = i15 & (-1879048193);
                f14 = f10;
            } else {
                j12 = r.f19514c;
                j13 = r.f19515d;
                i12 = l0.i();
                i12.H(j13);
                i12.F(1.0f);
                i13 = i15 & (-1879048193);
                f14 = 6;
                f15 = 5;
                f16 = 12;
                f17 = 1.0f;
            }
            rVar2.q();
            rVar2.b0(-1857524615);
            int i16 = i13 & 112;
            if (i16 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object O = rVar2.O();
            if (z3 || O == l.f24285a) {
                O = new c(20, fVar);
                rVar2.k0(O);
            }
            rVar2.p(false);
            y.j((df.a) O, rVar2);
            long j16 = j13;
            long j17 = j12;
            f0 f0Var3 = i12;
            b7 b7Var = new b7(24);
            b bVar = b.f17917u;
            a(rVar, fVar, f14, f15, j17, f16, j16, f17, f0Var3, null, b7Var, new b7(25), rVar2, 1074003968 | (i13 & 14) | i16 | 114847104, 221574);
            f0Var2 = f0Var3;
            f18 = f17;
            j14 = j16;
            f19 = f16;
            j15 = j17;
            f20 = f15;
            f21 = f14;
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new df.p() { // from class: h8.a
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f fVar2 = fVar;
                    fVar2.getClass();
                    a(r.this, fVar2, f21, f20, j15, f19, j14, f18, f0Var2, (m) obj, y.L(i | 1));
                    return z.f22715a;
                }
            };
        }
    }
}
