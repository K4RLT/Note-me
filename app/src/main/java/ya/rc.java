package ya;
import b0.b;
import df.p;
import te.c;
import te.g;
import te.h;
import ve.a;

/* loaded from: classes.dex */
public abstract class rc {
    /* JADX WARN: Multi-variable type inference failed */
    public static c a(p pVar, c cVar, c cVar2) {
        pVar.getClass();
        if (pVar instanceof a) {
            return ((a) pVar).create(cVar, cVar2);
        }
        g context = cVar2.getContext();
        if (context == h.f25707u) {
            return new b(pVar, cVar2, cVar);
        }
        return new c(cVar2, context, pVar, cVar);
    }

    public static c b(c cVar) {
        c cVar2;
        c intercepted;
        cVar.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }

    public static Object c(p pVar, Object obj, c cVar) {
        Object cVar2;
        pVar.getClass();
        g context = cVar.getContext();
        if (context == h.f25707u) {
            cVar2 = new g(cVar);
        } else {
            cVar2 = new c(cVar, context);
        }
        kotlin.jvm.internal.b(2, pVar);
        return pVar.invoke(obj, cVar2);
    }
}
