package ya;
import n.b;
import vd.n;
import z5.c;
import z5.k;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ee {
    public static boolean a(String str) {
        b bVar = k.f31924a;
        Set<c> unmodifiableSet = Collections.unmodifiableSet(c.f31913c);
        HashSet hashSet = new HashSet();
        for (c cVar : unmodifiableSet) {
            if (cVar.f31914a.equals(str)) {
                hashSet.add(cVar);
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                c cVar2 = (c) it.next();
                if (cVar2.a() || cVar2.b()) {
                    return true;
                }
            }
            return false;
        }
        n.b("Unknown feature ".concat(str));
        return false;
    }
}
