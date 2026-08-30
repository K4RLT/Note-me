package ya;
import b0.b;
import df.p;
import pf.b0;
import pf.t;
import ue.a;
import uf.q;
import ve.a;

/* loaded from: classes.dex */
public abstract class bd {
    public static final Object a(q qVar, q qVar2, p pVar) {
        Object tVar;
        Object X;
        try {
            if (!(pVar instanceof a)) {
                tVar = rc.c(pVar, qVar2, qVar);
            } else {
                kotlin.jvm.internal.b(2, pVar);
                tVar = pVar.invoke(qVar2, qVar);
            }
        } catch (Throwable th) {
            tVar = new t(th, false);
        }
        a aVar = a.f27192u;
        if (tVar != aVar && (X = qVar.X(tVar)) != b0.e) {
            if (!(X instanceof t)) {
                return b0.H(X);
            }
            throw ((t) X).f22793a;
        }
        return aVar;
    }
}
