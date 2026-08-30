package a;

import a0.b;
import a0.g;
import a0.l0;
import b6.t;
import d1.r;
import df.l;
import p.u1;
import q.u;
import r.a1;
import r0.m;
import r0.q1;
import t.j;
import t.n0;
import x.d;
import x.f;
import x.k0;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(b bVar, r rVar, l0 l0Var, k0 k0Var, f fVar, d dVar, n0 n0Var, boolean z3, r.f fVar2, l lVar, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        n0 n0Var2;
        boolean z10;
        r.f fVar3;
        n0 n0Var3;
        r.f a10;
        int i15;
        boolean z11;
        boolean z12;
        d dVar2;
        r0.r rVar2 = (r0.r) mVar;
        rVar2.c0(-2072102870);
        if (rVar2.f(bVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i16 = i | i10;
        if (rVar2.f(l0Var)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i17 = i16 | i11;
        if (rVar2.f(k0Var)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i18 = i17 | i12 | 24576;
        if (rVar2.f(fVar)) {
            i13 = 131072;
        } else {
            i13 = 65536;
        }
        int i19 = i18 | i13 | 373293056;
        if (rVar2.h(lVar)) {
            i14 = 4;
        } else {
            i14 = 2;
        }
        if ((306783379 & i19) == 306783378 && (i14 & 3) == 2) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (rVar2.R(i19 & 1, z9)) {
            rVar2.W();
            int i20 = i & 1;
            Object obj = r0.l.f24285a;
            if (i20 != 0 && !rVar2.A()) {
                rVar2.U();
                n0Var3 = n0Var;
                a10 = fVar2;
                i15 = i19 & (-1908408321);
                z11 = z3;
            } else {
                u a11 = u1.a(rVar2);
                boolean f10 = rVar2.f(a11);
                Object O = rVar2.O();
                if (f10 || O == obj) {
                    O = new j(a11);
                    rVar2.k0(O);
                }
                n0Var3 = (j) O;
                a10 = a1.a(rVar2);
                i15 = i19 & (-1908408321);
                z11 = true;
            }
            rVar2.q();
            int i21 = (i15 & 14) | 48;
            if ((((i21 & 14) ^ 6) > 4 && rVar2.f(bVar)) || (i21 & 6) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object O2 = rVar2.O();
            if (!z12 && O2 != obj) {
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                O2 = new a0.d(new g(bVar, 0, dVar2));
                rVar2.k0(O2);
            }
            int i22 = ((i15 >> 3) & 112) | 196614 | (i15 & 7168) | 12607488 | ((i15 << 12) & 1879048192);
            int i23 = 6 | ((i14 << 3) & 112);
            n0 n0Var4 = n0Var3;
            boolean z13 = z11;
            t.a(rVar, l0Var, (a0.d) O2, k0Var, n0Var4, z13, a10, fVar, dVar2, lVar, rVar2, i22, i23);
            fVar3 = a10;
            z10 = z13;
            n0Var2 = n0Var4;
        } else {
            rVar2.U();
            n0Var2 = n0Var;
            z10 = z3;
            fVar3 = fVar2;
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new a0.f(bVar, rVar, l0Var, k0Var, fVar, dVar, n0Var2, z10, fVar3, lVar, i);
        }
    }
}
