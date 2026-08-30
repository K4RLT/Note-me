package wa;
import a1.g;
import d1.r;
import h8.f;
import h8.j;
import h8.l;
import h8.m;
import j1.b;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import s7.a;
import t7.a;
import y2.l;

/* loaded from: classes.dex */
public abstract class u7 {
    public static final void a(r rVar, f fVar, boolean z3, df.l lVar, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        r rVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        rVar.getClass();
        fVar.getClass();
        r rVar3 = (r) mVar;
        rVar3.c0(-108190900);
        if (rVar3.f(fVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i | i10 | 11392;
        if (rVar3.h(lVar)) {
            i11 = 131072;
        } else {
            i11 = 65536;
        }
        int i14 = i13 | i11 | 1572864;
        if ((2995931 & i14) == 599186 && rVar3.D()) {
            rVar3.U();
            rVar2 = rVar;
            z12 = z3;
        } else {
            rVar3.W();
            if ((i & 1) != 0 && !rVar3.A()) {
                rVar3.U();
                i12 = i14 & (-57345);
                z9 = z3;
            } else {
                i12 = i14 & (-57345);
                z9 = true;
            }
            rVar3.q();
            rVar3.b0(1187531648);
            Object O = rVar3.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = y.B(new l(0L));
                rVar3.k0(O);
            }
            a1 a1Var = (a1) O;
            rVar3.p(false);
            rVar3.b0(1187533503);
            Object O2 = rVar3.O();
            if (O2 == v0Var) {
                long j10 = ((l) a1Var.getValue()).f30813a;
                O2 = y.B(Float.valueOf(Math.min((int) (j10 >> 32), (int) (j10 & 4294967295L)) * 0.5f));
                rVar3.k0(O2);
            }
            a1 a1Var2 = (a1) O2;
            rVar3.p(false);
            rVar3.b0(1187535327);
            Object O3 = rVar3.O();
            if (O3 == v0Var) {
                O3 = y.B(new b(a(((l) a1Var.getValue()).f30813a)));
                rVar3.k0(O3);
            }
            a1 a1Var3 = (a1) O3;
            rVar3.p(false);
            rVar2 = rVar;
            r d2 = rVar2.d(androidx.compose.foundation.layout.d.f506c);
            rVar3.b0(1187545700);
            Object O4 = rVar3.O();
            if (O4 == v0Var) {
                O4 = new l(0, a1Var, a1Var2, a1Var3);
                rVar3.k0(O4);
            }
            df.l lVar2 = (df.l) O4;
            rVar3.p(false);
            rVar3.b0(1187549276);
            int i15 = i12 & 112;
            if (i15 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object O5 = rVar3.O();
            if (z10 || O5 == v0Var) {
                O5 = new g(9, fVar, a1Var3, a1Var2);
                rVar3.k0(O5);
            }
            df.l lVar3 = (df.l) O5;
            rVar3.p(false);
            rVar3.b0(1187572710);
            if (i15 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object O6 = rVar3.O();
            if (z11 || O6 == v0Var) {
                O6 = new j(fVar, 1);
                rVar3.k0(O6);
            }
            rVar3.p(false);
            boolean z13 = z9;
            a(d2, fVar, z13, lVar, lVar2, lVar3, (df.p) O6, rVar3, 1576448 | i15 | (i12 & 458752));
            z12 = z13;
        }
        q1 t3 = rVar3.t();
        if (t3 != null) {
            t3.f24332d = new m(rVar2, fVar, z12, lVar, i, 0);
        }
    }
}
