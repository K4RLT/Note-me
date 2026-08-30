package ya;
import m2.a0;
import r0.m;
import r0.q1;
import r0.r;

/* loaded from: classes.dex */
public abstract class kc {
    public static final void a(int i, m mVar) {
        boolean z3;
        q1 t3;
        a0 a0Var;
        r rVar = (r) mVar;
        rVar.c0(1541877747);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            t3 = rVar.t();
            if (t3 != null) {
                a0Var = new a0(i, 22);
            } else {
                return;
            }
        } else {
            rVar.U();
            t3 = rVar.t();
            if (t3 != null) {
                a0Var = new a0(i, 23);
            } else {
                return;
            }
        }
        t3.f24332d = a0Var;
    }
}
