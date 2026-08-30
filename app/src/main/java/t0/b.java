package t0;
import f.a;
import f.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b implements List, ef.b {

    /* renamed from: u, reason: collision with root package name */
    public final e f25611u;

    public b(e eVar) {
        this.f25611u = eVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f25611u.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        e eVar = this.f25611u;
        return eVar.g(eVar.f25619w, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f25611u.j();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f25611u.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f25611u.k(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a(i, this);
        return this.f25611u.f25617u[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f25611u.l(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.f25611u.f25619w == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f25611u;
        Object[] objArr = eVar.f25617u;
        for (int i = eVar.f25619w - 1; i >= 0; i--) {
            if (l.a(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a(i, this);
        return this.f25611u.n(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (!collection.isEmpty()) {
            e eVar = this.f25611u;
            int i = eVar.f25619w;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                eVar.m(it.next());
            }
            if (i != eVar.f25619w) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f25611u;
        int i = eVar.f25619w;
        for (int i10 = i - 1; -1 < i10; i10--) {
            if (!collection.contains(eVar.f25617u[i10])) {
                eVar.n(i10);
            }
        }
        if (i != eVar.f25619w) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        a(i, this);
        Object[] objArr = this.f25611u.f25617u;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f25611u.f25619w;
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        f.b(i, i10, this);
        return new c(i, i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return k.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f25611u.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new d(i, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f25611u.g(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f25611u.m(obj);
    }
}
