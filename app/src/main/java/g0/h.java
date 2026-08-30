package g0;
import b0.x;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d1.a;
import d1.o;
import d1.r;
import l.a;
import m2.e;
import m2.g;
import p.a;
import r0.m;
import r0.q1;
import r0.r;
import r0.y;
import z0.g;

import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final pe.j f17116a;

    static {
        qe.s sVar = qe.s.f24023u;
        f17116a = new pe.j(sVar, sVar);
    }

    public static final void a(g gVar, List list, m mVar, int i) {
        int i10;
        boolean z3;
        int i11;
        int i12;
        r rVar = (r) mVar;
        rVar.c0(-1794596951);
        if ((i & 6) == 0) {
            if (rVar.f(gVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.h(list)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar = (e) list.get(i13);
                df.q qVar = (df.q) eVar.f20451a;
                int i14 = eVar.f20452b;
                int i15 = eVar.f20453c;
                g gVar2 = g.f17103b;
                int hashCode = Long.hashCode(rVar.T);
                g l10 = rVar.l();
                r c10 = a.c(o.f15687a, rVar);
                b2.h.f1471d.getClass();
                b0 b0Var = g.f1462b;
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                y.I(g.e, gVar2, rVar);
                y.I(g.f1464d, l10, rVar);
                f fVar = g.f1465f;
                if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                    a.t(hashCode, rVar, hashCode, fVar);
                }
                y.I(g.f1463c, c10, rVar);
                qVar.b(gVar.subSequence(i14, i15).f20477v, rVar, 0);
                rVar.p(true);
            }
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new x(i, 1, gVar, list);
        }
    }
}
