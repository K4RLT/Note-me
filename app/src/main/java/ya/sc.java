package ya;
import b8.ib;
import df.p;
import r0.a1;
import r0.l;
import r0.m;
import r0.r;
import r0.v0;
import r0.y;
import v.i;

/* loaded from: classes.dex */
public abstract class sc {
    public static final a1 a(i iVar, m mVar, int i) {
        boolean z3;
        r rVar = (r) mVar;
        Object O = rVar.O();
        v0 v0Var = l.f24285a;
        if (O == v0Var) {
            O = y.B(Boolean.FALSE);
            rVar.k0(O);
        }
        a1 a1Var = (a1) O;
        if ((((i & 14) ^ 6) > 4 && rVar.f(iVar)) || (i & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        Object O2 = rVar.O();
        if (z3 || O2 == v0Var) {
            O2 = new ib(iVar, a1Var, null, 1);
            rVar.k0(O2);
        }
        y.f((p) O2, iVar, rVar);
        return a1Var;
    }
}
