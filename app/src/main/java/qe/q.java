package qe;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q extends p {
    public static void n(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void o(b1.v vVar, df.l lVar) {
        int size;
        lVar.getClass();
        int size2 = vVar.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i10 = 0;
            while (true) {
                Object obj = vVar.get(i);
                if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                    if (i10 != i) {
                        vVar.set(i10, obj);
                    }
                    i10++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i10;
        }
        if (i >= vVar.size() || i > (size = vVar.size() - 1)) {
            return;
        }
        while (true) {
            vVar.remove(size);
            if (size != i) {
                size--;
            } else {
                return;
            }
        }
    }

    public static Object p(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object q(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        l4.a.h("List is empty.");
        return null;
    }
}
