package ya;

import com.google.android.gms.internal.ads.j61;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class le {
    public static boolean a(j61 j61Var, Collection collection) {
        collection.getClass();
        if (collection instanceof l) {
            collection = ((l) collection).zza();
        }
        boolean z3 = false;
        if ((collection instanceof Set) && collection.size() > j61Var.size()) {
            Iterator<E> it = j61Var.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z3 = true;
                }
            }
            return z3;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            z3 |= j61Var.remove(it2.next());
        }
        return z3;
    }
}
