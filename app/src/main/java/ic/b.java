package ic;
import r.a;

import java.util.Set;

/* loaded from: classes.dex */
public interface b {
    default Object a(Class cls) {
        return h(a(cls));
    }

    gd.b d(r rVar);

    default gd.b e(Class cls) {
        return d(a(cls));
    }

    p f(r rVar);

    gd.b g(r rVar);

    default Object h(r rVar) {
        gd.b d2 = d(rVar);
        if (d2 == null) {
            return null;
        }
        return d2.get();
    }

    default Set i(r rVar) {
        return (Set) g(rVar).get();
    }
}
