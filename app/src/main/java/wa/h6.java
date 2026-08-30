package wa;
import a1.i;
import r0.m;
import r0.q1;
import r0.r;

/* loaded from: classes.dex */
public abstract class h6 {
    public static final void a(int i, m mVar) {
        boolean z3;
        q1 t3;
        i iVar;
        r rVar = (r) mVar;
        rVar.c0(1155390774);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            t3 = rVar.t();
            if (t3 != null) {
                iVar = new i(i, 17);
            } else {
                return;
            }
        } else {
            rVar.U();
            t3 = rVar.t();
            if (t3 != null) {
                iVar = new i(i, 18);
            } else {
                return;
            }
        }
        t3.f24332d = iVar;
    }
}
