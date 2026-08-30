package ya;
import za.c;
import za.d;
import za.e;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class af {
    public static c a(c cVar) {
        if (!(cVar instanceof e)) {
            if (cVar instanceof d) {
                return cVar;
            }
            if (cVar instanceof Serializable) {
                return new d(cVar);
            }
            return new e(cVar);
        }
        return cVar;
    }
}
