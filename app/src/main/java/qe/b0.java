package qe;
import q.n;
import x.b;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class b0 {
    public static re.h a(re.h hVar) {
        re.e eVar = hVar.f24768u;
        eVar.b();
        if (eVar.C > 0) {
            return hVar;
        }
        return re.h.f24767v;
    }

    public static Set b(Set set, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            iterable = l.P(iterable);
        }
        Collection<?> collection = (Collection) iterable;
        if (collection.isEmpty()) {
            return l.U(set);
        }
        if (collection instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!((Set) collection).contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(collection);
        return linkedHashSet2;
    }

    public static LinkedHashSet c(Set set, Iterable iterable) {
        Integer num;
        int size;
        set.getClass();
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            size = set.size() + num.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(b(size));
        linkedHashSet.addAll(set);
        n(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static Set d(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }
}
