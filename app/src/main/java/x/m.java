package x;
import a0.k;
import l.a;
import n.i0;
import p.a;
import r0.m;
import r0.r;
import r0.y;
import z0.g;
import z0.j;

import r0.q1;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f29976a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f29977b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final o f29978c = new o(d1.c.f15670u, false);

    /* renamed from: d, reason: collision with root package name */
    public static final l f29979d = l.f29973b;

    public static final void a(int i, d1.r rVar, r0.m mVar) {
        int i10;
        boolean z3;
        int i11;
        r rVar2 = (r) mVar;
        rVar2.c0(-211209833);
        if ((i & 6) == 0) {
            if (rVar2.f(rVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i;
        } else {
            i10 = i;
        }
        if ((i10 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i10 & 1, z3)) {
            int hashCode = Long.hashCode(rVar2.T);
            d1.r c10 = d1.a.c(rVar, rVar2);
            g l10 = rVar2.l();
            b2.h.f1471d.getClass();
            b2.b0 b0Var = b2.g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(b2.g.e, f29979d, rVar2);
            y.I(b2.g.f1464d, l10, rVar2);
            y.I(b2.g.f1463c, c10, rVar2);
            b2.f fVar = b2.g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar);
            }
            rVar2.p(true);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new k(rVar, i, 2);
        }
    }

    public static final void b(z1.z0 z0Var, z1.a1 a1Var, z1.o0 o0Var, y2.m mVar, int i, int i10, d1.e eVar) {
        j jVar;
        d1.e eVar2;
        d1.j jVar2;
        Object H = o0Var.H();
        if (H instanceof j) {
            jVar = (j) H;
        } else {
            jVar = null;
        }
        if (jVar != null && (jVar2 = jVar.I) != null) {
            eVar2 = jVar2;
        } else {
            eVar2 = eVar;
        }
        z1.j(z0Var, a1Var, eVar2.a((a1Var.f31769u << 32) | (a1Var.f31770v & 4294967295L), (i << 32) | (i10 & 4294967295L), mVar));
    }

    public static final i0 c(boolean z3) {
        i0 i0Var = new i0(9);
        d1.j jVar = d1.c.f15670u;
        i0Var.m(jVar, new o(jVar, z3));
        d1.j jVar2 = d1.c.f15671v;
        i0Var.m(jVar2, new o(jVar2, z3));
        d1.j jVar3 = d1.c.f15672w;
        i0Var.m(jVar3, new o(jVar3, z3));
        d1.j jVar4 = d1.c.f15673x;
        i0Var.m(jVar4, new o(jVar4, z3));
        d1.j jVar5 = d1.c.f15674y;
        i0Var.m(jVar5, new o(jVar5, z3));
        d1.j jVar6 = d1.c.f15675z;
        i0Var.m(jVar6, new o(jVar6, z3));
        d1.j jVar7 = d1.c.A;
        i0Var.m(jVar7, new o(jVar7, z3));
        d1.j jVar8 = d1.c.B;
        i0Var.m(jVar8, new o(jVar8, z3));
        d1.j jVar9 = d1.c.C;
        i0Var.m(jVar9, new o(jVar9, z3));
        return i0Var;
    }

    public static final z1.p0 d(d1.j jVar, boolean z3) {
        i0 i0Var;
        if (z3) {
            i0Var = f29976a;
        } else {
            i0Var = f29977b;
        }
        z1.p0 p0Var = (z1.p0) i0Var.g(jVar);
        if (p0Var == null) {
            return new o(jVar, z3);
        }
        return p0Var;
    }
}
