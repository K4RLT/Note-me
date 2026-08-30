package ya;
import r0.c;
import r0.e2;

/* loaded from: classes.dex */
public abstract class rb {
    public static final void a(e2 e2Var, c cVar, int i) {
        while (true) {
            int i10 = e2Var.f24236v;
            if (i <= i10 || i >= e2Var.f24235u) {
                if (i10 == 0 && i == 0) {
                    return;
                }
                e2Var.L();
                if (e2Var.x(e2Var.f24236v)) {
                    cVar.l();
                }
                e2Var.j();
            } else {
                return;
            }
        }
    }
}
