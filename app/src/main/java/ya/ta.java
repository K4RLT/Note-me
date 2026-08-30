package ya;
import b.b;
import a.a;
import b0.x;
import d1.r;
import df.l;
import r0.m;
import r0.q1;

/* loaded from: classes.dex */
public abstract class ta {
    public static final void a(r rVar, l lVar, m mVar, int i) {
        int i10;
        boolean z3;
        int i11;
        int i12;
        r rVar2 = (r) mVar;
        rVar2.c0(-932836462);
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
            if (rVar2.h(lVar)) {
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
            b.b(androidx.compose.ui.draw.a(rVar, lVar), rVar2);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new x(i, 5, rVar, lVar);
        }
    }
}
