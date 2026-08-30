package ya;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d1.a;
import d1.c;
import d1.j;
import d1.o;
import d1.r;
import df.l;
import j2.k;
import j2.l;
import k0.b0;
import k1.f;
import l.a;
import p.a;
import p1.a;
import p1.b;
import r.k0;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.y;
import wa.j7;
import z0.g;
import z1.n;
import z1.u0;

/* loaded from: classes.dex */
public abstract class wa {
    public static final void a(b bVar, String str, r rVar, u0 u0Var, m mVar, int i) {
        int i10;
        boolean z3;
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        j jVar = c.f15674y;
        r rVar2 = (r) mVar;
        rVar2.c0(1142754848);
        if ((i & 6) == 0) {
            if (rVar2.h(bVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar2.f(str)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        if ((i & 384) == 0) {
            if (rVar2.f(rVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i10 |= i15;
        }
        if ((i & 3072) == 0) {
            if (rVar2.f(jVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        }
        if ((i & 24576) == 0) {
            if (rVar2.f(u0Var)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i10 |= i13;
        }
        if ((196608 & i) == 0) {
            if (rVar2.c(1.0f)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i10 |= i12;
        }
        if ((1572864 & i) == 0) {
            if (rVar2.f(null)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i10 |= i11;
        }
        if ((599187 & i10) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i10 & 1, z3)) {
            r rVar3 = o.f15687a;
            if (str != null) {
                rVar2.a0(1040425059);
                if ((i10 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Object O = rVar2.O();
                if (z9 || O == l.f24285a) {
                    O = new l(str, 2);
                    rVar2.k0(O);
                }
                rVar3 = k.a(rVar3, false, (l) O);
                rVar2.p(false);
            } else {
                rVar2.a0(1040583841);
                rVar2.p(false);
            }
            r d2 = androidx.compose.ui.draw.a.d(j7.b(rVar.d(rVar3)), bVar, u0Var, null, 2);
            int hashCode = Long.hashCode(rVar2.T);
            r c10 = a.c(d2, rVar2);
            g l10 = rVar2.l();
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(g.e, k0.f24107a, rVar2);
            y.I(g.f1464d, l10, rVar2);
            y.I(g.f1463c, c10, rVar2);
            f fVar = g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar);
            }
            rVar2.p(true);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new b0(bVar, str, rVar, u0Var, i);
        }
    }

    public static final void b(f fVar, String str, r rVar, u0 u0Var, m mVar, int i, int i10) {
        if ((i10 & 16) != 0) {
            u0Var = n.f31849b;
        }
        u0 u0Var2 = u0Var;
        r rVar2 = (r) mVar;
        boolean f10 = rVar2.f(fVar);
        Object O = rVar2.O();
        if (f10 || O == l.f24285a) {
            a aVar = new a(fVar, (fVar.f19477a.getHeight() & 4294967295L) | (fVar.f19477a.getWidth() << 32));
            aVar.f22356g = 1;
            rVar2.k0(aVar);
            O = aVar;
        }
        a((a) O, str, rVar, u0Var2, rVar2, i & 4194288);
    }
}
