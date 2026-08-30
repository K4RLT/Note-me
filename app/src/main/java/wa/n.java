package wa;
import a.a;
import c1.e;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n {
    public static final boolean a(Throwable th, df.a aVar) {
        Iterable asList;
        Object invoke;
        th.getClass();
        Integer num = ye.a.f31639a;
        e eVar = null;
        if (num != null && num.intValue() < 19) {
            Method method = xe.a.f30765b;
            if (method != null && (invoke = method.invoke(th, null)) != null) {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            } else {
                asList = qe.s.f24023u;
            }
        } else {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        }
        Iterable iterable = asList;
        boolean z3 = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof e) {
                    return false;
                }
            }
        }
        try {
            List list = (List) aVar.invoke();
            boolean isEmpty = list.isEmpty();
            z3 = !isEmpty;
            if (!isEmpty) {
                eVar = new e(list);
            }
        } catch (Throwable th2) {
            eVar = th2;
        }
        if (eVar != null) {
            pe.a(th, eVar);
        }
        return z3;
    }
}
