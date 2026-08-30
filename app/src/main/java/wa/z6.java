package wa;
import b5.a;
import ba.j;
import g5.c0;
import g5.d0;
import g5.v;
import g5.y;

import java.util.concurrent.RejectedExecutionException;
import ya.rc;

/* loaded from: classes.dex */
public abstract class z6 {
    public static final Object a(v vVar, df.l lVar, te.c cVar) {
        if (vVar.q() && vVar.t() && vVar.r()) {
            return lVar.invoke(cVar);
        }
        if (cVar.getContext().L(y.f17548u) == null) {
            return lVar.invoke(cVar);
        }
        return b(vVar, lVar, cVar);
    }

    public static final Object b(v vVar, df.l lVar, te.c cVar) {
        pf.v vVar2;
        d0 d0Var;
        a aVar = new a(lVar, (te.c) null, 19);
        c0 c0Var = (c0) cVar.getContext().L(c0.f17425v);
        if (c0Var != null) {
            vVar2 = c0Var.f17426u;
        } else {
            vVar2 = null;
        }
        if (vVar2 != null) {
            return pf.b0.J(vVar2, aVar, cVar);
        }
        pf.l lVar2 = new pf.l(1, rc.b(cVar));
        lVar2.s();
        try {
            d0Var = vVar.f17538d;
        } catch (RejectedExecutionException e) {
            lVar2.i(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        if (d0Var != null) {
            d0Var.execute(new j(22, lVar2, vVar, aVar));
            return lVar2.r();
        }
        kotlin.jvm.internal.l.h("internalTransactionExecutor");
        throw null;
    }
}
