package wa;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import c3.u;
import d1.a;
import d1.r;
import r0.l;
import r0.m;
import r0.q1;
import r0.y;
import wa.p;
import z0.c;
import z1.p0;

/* loaded from: classes.dex */
public abstract class p {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(df.a r20, u r21, c r22, m r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.a(df.a, u, c, m, int, int):void");
    }

    public static final void b(r rVar, df.p pVar, m mVar, int i) {
        int i10;
        boolean z3;
        int i11;
        int i12;
        r rVar2 = (r) mVar;
        rVar2.c0(1090521195);
        if ((i & 6) == 0) {
            if (rVar2.f(rVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar2.h(pVar)) {
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
        if (rVar2.R(i10 & 1, z3)) {
            Object O = rVar2.O();
            if (O == l.f24285a) {
                O = f.f3766b;
                rVar2.k0(O);
            }
            p0 p0Var = (p0) O;
            int hashCode = Long.hashCode(rVar2.T);
            g l10 = rVar2.l();
            r c10 = a.c(rVar, rVar2);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            int i13 = (((((i10 << 3) & 112) | (((i10 >> 3) & 14) | 384)) << 6) & 896) | 6;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(g.e, p0Var, rVar2);
            y.I(g.f1464d, l10, rVar2);
            f fVar = g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar2);
            pVar.invoke(rVar2, Integer.valueOf((i13 >> 6) & 14));
            rVar2.p(true);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new g(rVar, pVar, i, 0);
        }
    }
}
