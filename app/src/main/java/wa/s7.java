package wa;
import a1.g;
import d1.r;
import h8.f;
import h8.h;
import h8.i;
import j1.b;
import j1.e;
import k1.p;
import m1.d;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import ta.a;
import v1.c0;

import a0.f0;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import pe.z;

/* loaded from: classes.dex */
public abstract class s7 {
    public static final void a(r rVar, final f fVar, final boolean z3, df.l lVar, df.l lVar2, df.l lVar3, final df.p pVar, m mVar, int i) {
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        r d2;
        boolean z12;
        r d10;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        rVar.getClass();
        fVar.getClass();
        lVar3.getClass();
        pVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(-1444864183);
        if ((i & 14) == 0) {
            if (rVar2.f(rVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i;
        } else {
            i10 = i;
        }
        if ((i & 112) == 0) {
            if (rVar2.f(fVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i10 |= i17;
        }
        if ((i & 7168) == 0) {
            if (rVar2.h(null)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i10 |= i16;
        }
        if ((i & 57344) == 0) {
            if (rVar2.g(z3)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i10 |= i15;
        }
        if ((i & 458752) == 0) {
            if (rVar2.h(lVar)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i10 |= i14;
        }
        if ((i & 3670016) == 0) {
            if (rVar2.h(lVar2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i10 |= i13;
        }
        if ((i & 29360128) == 0) {
            if (rVar2.h(lVar3)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i10 |= i12;
        }
        if ((i & 234881024) == 0) {
            if (rVar2.h(pVar)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i10 |= i11;
        }
        rVar2.W();
        if ((i & 1) != 0 && !rVar2.A()) {
            rVar2.U();
        }
        rVar2.q();
        rVar2.b0(-1602609214);
        Object O = rVar2.O();
        v0 v0Var = l.f24285a;
        if (O == v0Var) {
            O = y.B(Boolean.FALSE);
            rVar2.k0(O);
        }
        a1 a1Var = (a1) O;
        rVar2.p(false);
        Long l10 = (Long) fVar.f17931k.getValue();
        rVar2.b0(-1602604173);
        int i19 = i10 & 112;
        boolean z16 = true;
        if (i19 == 32) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean f10 = z9 | rVar2.f(l10);
        if ((i10 & 458752) == 131072) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z17 = f10 | z10;
        Object O2 = rVar2.O();
        if (z17 || O2 == v0Var) {
            O2 = new g(8, fVar, l10, lVar);
            rVar2.k0(O2);
        }
        rVar2.p(false);
        y.d(fVar, l10, (df.l) O2, rVar2);
        r e = androidx.compose.ui.layout.a.e(rVar, new androidx.ink.authoring.compose.c(lVar2, fVar, lVar3, a1Var));
        rVar2.b0(-1602584849);
        if (i19 == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object O3 = rVar2.O();
        if (z11 || O3 == v0Var) {
            O3 = new i(fVar, null, 0);
            rVar2.k0(O3);
        }
        rVar2.p(false);
        d2 = e.d(new SuspendPointerInputElement(pe.z.f22715a, null, null, new c0((df.p) O3), 6));
        rVar2.b0(-1602580420);
        if (i19 == 32) {
            z12 = true;
        } else {
            z12 = false;
        }
        Object O4 = rVar2.O();
        if (z12 || O4 == v0Var) {
            O4 = new i(fVar, null, 1);
            rVar2.k0(O4);
        }
        rVar2.p(false);
        d10 = d2.d(new SuspendPointerInputElement(pe.z.f22715a, null, null, new c0((df.p) O4), 6));
        rVar2.b0(-1602575779);
        if ((i10 & 234881024) == 67108864) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (i19 == 32) {
            z14 = true;
        } else {
            z14 = false;
        }
        boolean z18 = z13 | z14;
        if ((((i10 & 57344) ^ 24576) > 16384 && rVar2.g(z3)) || (i10 & 24576) == 16384) {
            z15 = true;
        } else {
            z15 = false;
        }
        boolean z19 = z18 | z15;
        if ((i10 & 7168) != 2048) {
            z16 = false;
        }
        boolean z20 = z19 | z16;
        Object O5 = rVar2.O();
        if (z20 || O5 == v0Var) {
            O5 = new df.l() { // from class: h8.g
                @Override // df.l
                public final Object invoke(Object obj) {
                    d dVar = (d) obj;
                    f fVar2 = f.this;
                    fVar2.getClass();
                    df.p pVar2 = pVar;
                    pVar2.getClass();
                    dVar.getClass();
                    p j10 = dVar.p0().j();
                    j10.l();
                    j10.p(0.0f, 0.0f, e.d(dVar.e()), e.b(dVar.e()), 1);
                    pVar2.invoke(j10, new e(dVar.e()));
                    j10.s();
                    long j11 = ((b) fVar2.f17926d.getValue()).f18762a;
                    float l0 = dVar.l0(fVar2.f17932l);
                    f0 f0Var = fVar2.f17933m;
                    if (z3) {
                        j10.u(l0, j11, f0Var);
                    }
                    fVar2.f17936p.h();
                    return z.f22715a;
                }
            };
            rVar2.k0(O5);
        }
        rVar2.p(false);
        ya.a(d10, (df.l) O5, rVar2, 0);
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new h(rVar, fVar, z3, lVar, lVar2, lVar3, pVar, i);
        }
    }
}
