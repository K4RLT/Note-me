package o0;
import a0.g;
import i1.a;
import k0.b0;
import k0.o1;
import k0.p1;
import k1.r;
import n0.m;
import r.l0;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.u0;
import r0.y;
import z0.c;
import z0.h;

/* loaded from: classes.dex */
public abstract class a0 {
    static {
        new u0(n.A);
    }

    public static final void a(m mVar, l1 l1Var, b2 b2Var, c cVar, m mVar2, int i) {
        int i10;
        l1 l1Var2;
        int i11;
        int i12;
        int i13;
        r rVar = (r) mVar2;
        rVar.c0(-2127166334);
        if ((i & 6) == 0) {
            if (rVar.f(mVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            i10 |= 16;
        }
        if ((i & 384) == 0) {
            if (rVar.f(b2Var)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i & 3072) == 0) {
            if (rVar.h(cVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) == 1170 && rVar.D()) {
            rVar.U();
            l1Var2 = l1Var;
        } else {
            rVar.W();
            if ((i & 1) != 0 && !rVar.A()) {
                rVar.U();
                l1Var2 = l1Var;
            } else {
                l1Var2 = (l1) rVar.j(m1.f21585a);
            }
            rVar.q();
            l0 a10 = a(false, 0.0f, rVar, 0, 7);
            long j10 = mVar.f21555a;
            boolean e = rVar.e(j10);
            Object O = rVar.O();
            if (e || O == l.f24285a) {
                O = new o1(j10, r.c(j10, 0.4f));
                rVar.k0(O);
            }
            y.b(new k9.z[]{o.f21604a.a(mVar), androidx.compose.foundation.d.f469a.a(a10), m.f20994a.a(p.f21613a), m1.f21585a.a(l1Var2), p1.f19390a.a((o1) O), c2.f21442a.a(b2Var)}, h.d(-1066563262, new g(b2Var, 9, cVar), rVar), rVar, 56);
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b0(mVar, l1Var2, b2Var, cVar, i, 1);
        }
    }
}
