package x7;
import m.a;
import m.d;
import a.a;
import f0.e;
import m.h;
import r.c;
import x.m;

import com.daren.scraply.R;
import o0.x1;
import r0.q1;
import w7.s5;
import wa.j7;
import wa.n7;
import ya.ae;
import ya.sa;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f30202a = k1.l0.d(4294929259L);

    public static final void a(int i, d1.r rVar, r0.m mVar) {
        int i10;
        boolean z3;
        int i11;
        r0.r rVar2 = (r0.r) mVar;
        rVar2.c0(-1504588811);
        if ((i & 6) == 0) {
            if (rVar2.f(rVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i | i11;
        } else {
            i10 = i;
        }
        if ((i10 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i10 & 1, z3)) {
            k1.c0 b10 = eb.w.b(qe.h(new k1.r(k1.l0.d(4283385573L)), new k1.r(k1.l0.d(4286331629L))), 0.0f, 0.0f, 14);
            long j10 = k1.r.f19515d;
            float f10 = 8;
            d1.r l10 = androidx.compose.foundation.layout.a.l(sa.b(androidx.compose.foundation.a(j7.a(rVar, e.a(f10)), b10, 6), (float) 0.7d, eb.w.k(qe.h(new k1.r(k1.c(j10, 0.4f)), new k1.r(k1.c(j10, 0.12f))), 0.0f, 0.0f, 14), e.a(f10)), 6, 2);
            z1.p0 d2 = m.d(d1.c.f15674y, false);
            int hashCode = Long.hashCode(rVar2.T);
            z0.g l11 = rVar2.l();
            d1.r c10 = d1.a.c(l10, rVar2);
            b2.h.f1471d.getClass();
            b2.b0 b0Var = b2.g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            r0.y.I(b2.g.e, d2, rVar2);
            r0.y.I(b2.g.f1464d, l11, rVar2);
            b2.f fVar = b2.g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar);
            }
            r0.y.I(b2.g.f1463c, c10, rVar2);
            x1.b(n7.b(R.string.badge_new, rVar2), null, j10, ae.d(7.5d), null, q2.s.B, null, ae.d(0.8d), null, 0L, 0, false, 0, 0, null, rVar2, 12782976, 0, 130898);
            rVar2 = rVar2;
            rVar2.p(true);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new s5(rVar, i, 2);
        }
    }

    public static final void b(int i, d1.r rVar, r0.m mVar) {
        int i10;
        boolean z3;
        r0.r rVar2 = (r0.r) mVar;
        rVar2.c0(-38612081);
        if (rVar2.f(rVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i11 & 1, z3)) {
            m.a(0, androidx.compose.foundation.a.b(j7.a(androidx.compose.foundation.layout.d.k(rVar, 8), e.f16629a), f30202a, k1.l0.f19495a), rVar2);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new b8.m(i, 7, rVar);
        }
    }
}
