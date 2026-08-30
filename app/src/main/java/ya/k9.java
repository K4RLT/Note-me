package ya;
import df.p;
import k1.r;
import k9.z;
import m2.q0;
import o0.q;
import o0.x1;
import p0.h;
import r0.c0;
import r0.m;
import r0.q1;
import r0.y;

/* loaded from: classes.dex */
public abstract class k9 {
    public static final void a(long j10, q0 q0Var, p pVar, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        r rVar = (r) mVar;
        rVar.c0(-716124955);
        if ((i & 6) == 0) {
            if (rVar.e(j10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.f(q0Var)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i & 384) == 0) {
            if (rVar.h(pVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 147) == 146 && rVar.D()) {
            rVar.U();
        } else {
            c0 c0Var = x1.f21744a;
            y.b(new z[]{q.f21634a.a(new r(j10)), c0Var.a(((q0) rVar.j(c0Var)).d(q0Var))}, pVar, rVar, ((i10 >> 3) & 112) | 8);
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new h(j10, q0Var, pVar, i, 0);
        }
    }
}
