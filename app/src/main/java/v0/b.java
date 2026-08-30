package v0;

import b1.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class b extends qe.e {
    public abstract b b(int i, Object obj);

    @Override // qe.a, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // qe.a, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract b g(Object obj);

    @Override // qe.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public b k(Collection collection) {
        e n10 = n();
        n10.addAll(collection);
        return n10.g();
    }

    @Override // qe.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract e n();

    public abstract b o(s sVar);

    public abstract b p(int i);

    public abstract b q(int i, Object obj);

    @Override // qe.e, java.util.List
    public final List subList(int i, int i10) {
        return new u0.a(this, i, i10);
    }
}
