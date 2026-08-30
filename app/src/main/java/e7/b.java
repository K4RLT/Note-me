package e7;
import l.a;
import m.d;
import p.a;
import q.a;

import b2.b0;
import com.daren.scraply.R;
import k1.k0;
import k1.l0;
import o0.f1;
import o0.x1;
import r0.q1;
import r0.v0;
import r0.y;
import wa.j7;
import wa.n7;
import ya.ae;
import z1.p0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f15933a = l0.d(3003121664L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f15934b = l0.d(4062323239L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f15935c = l0.d(4284246976L);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15936d = 0;

    public static final void a(int i, r0.m mVar) {
        boolean z3;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(261228903);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            if (!((Boolean) y.o(a.f15932b, rVar).getValue()).booleanValue()) {
                q1 t3 = rVar.t();
                if (t3 != null) {
                    t3.f24332d = new a1.i(i, 15);
                    return;
                }
                return;
            }
            d1.r d2 = d1.a.d(androidx.compose.foundation.layout.d.f506c, 10.0f);
            long j10 = f15933a;
            k0 k0Var = l0.f19495a;
            d1.r b10 = androidx.compose.foundation.a.b(d2, j10, k0Var);
            Object O = rVar.O();
            v0 v0Var = r0.l.f24285a;
            if (O == v0Var) {
                O = a.r(rVar);
            }
            v.i iVar = (v.i) O;
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = new a1.m(26);
                rVar.k0(O2);
            }
            d1.r e = androidx.compose.foundation.a.e(b10, iVar, null, false, null, (df.a) O2, 28);
            p0 d10 = x.d(d1.c.f15674y, false);
            int hashCode = Long.hashCode(rVar.T);
            z0.g l10 = rVar.l();
            d1.r c10 = d1.a.c(e, rVar);
            b2.h.f1471d.getClass();
            b0 b0Var = b2.g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            b2.f fVar = b2.g.e;
            y.I(fVar, d10, rVar);
            b2.f fVar2 = b2.g.f1464d;
            y.I(fVar2, l10, rVar);
            b2.f fVar3 = b2.g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar3);
            }
            b2.f fVar4 = b2.g.f1463c;
            y.I(fVar4, c10, rVar);
            d1.h hVar = d1.c.H;
            x.e i10 = x.h.i(14);
            f0.d a10 = f0.e.a(18);
            d1.o oVar = d1.o.f15687a;
            d1.r l11 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.b(j7.a(oVar, a10), f15934b, k0Var), 28, 22);
            x.r a11 = x.a(i10, hVar, rVar, 54);
            int hashCode2 = Long.hashCode(rVar.T);
            z0.g l12 = rVar.l();
            d1.r c11 = d1.a.c(l11, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(fVar, a11, rVar);
            y.I(fVar2, l12, rVar);
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar, hashCode2, fVar3);
            }
            y.I(fVar4, c11, rVar);
            f1.b(androidx.compose.foundation.layout.d.k(oVar, 34), f15935c, 3, 0L, 0, rVar, 438, 24);
            x1.b(n7.b(R.string.ad_wait, rVar), null, k1.r.f19515d, ae.e(15), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 3456, 0, 131058);
            rVar = rVar;
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar.U();
        }
        q1 t10 = rVar.t();
        if (t10 != null) {
            t10.f24332d = new a1.i(i, 16);
        }
    }
}
