package ya;
import b8.p7;
import ib.o;
import pf.l;
import vd.p;
import zf.a;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class ff {
    public static final Object a(o oVar, p pVar) {
        if (oVar.k()) {
            Exception i = oVar.i();
            if (i == null) {
                if (!oVar.f18384d) {
                    return oVar.j();
                }
                throw new CancellationException("Task " + oVar + " was cancelled normally.");
            }
            throw i;
        }
        l lVar = new l(1, rc.b(pVar));
        lVar.s();
        oVar.c(a.f32044u, new p7(lVar));
        return lVar.r();
    }
}
