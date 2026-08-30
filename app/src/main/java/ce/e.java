package ce;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4104a = new HashMap();

    public e(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            this.f4104a.put(dVar.f4102a, dVar.f4103b);
        }
    }
}
