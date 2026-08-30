package b2;
import b1.c0;
import d1.q;
import k.a;
import k.b;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class p implements List, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final int f1568u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1569v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f1570w;

    public p(q qVar, int i, int i10) {
        this.f1570w = qVar;
        this.f1568u = i;
        this.f1569v = i10;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof q) || indexOf((q) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((q) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object e = this.f1570w.f1578u.e(i + this.f1568u);
        e.getClass();
        return (q) e;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            int i = this.f1568u;
            int i10 = this.f1569v;
            if (i <= i10) {
                int i11 = i;
                while (!kotlin.jvm.internal.a(this.f1570w.f1578u.e(i11), qVar)) {
                    if (i11 != i10) {
                        i11++;
                    } else {
                        return -1;
                    }
                }
                return i11 - i;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f1568u;
        return new c0(this.f1570w, i, i, this.f1569v);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            int i = this.f1569v;
            int i10 = this.f1568u;
            if (i10 <= i) {
                while (!kotlin.jvm.internal.a(this.f1570w.f1578u.e(i), qVar)) {
                    if (i != i10) {
                        i--;
                    } else {
                        return -1;
                    }
                }
                return i - i10;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i10 = this.f1568u;
        int i11 = this.f1569v;
        return new c0(this.f1570w, i + i10, i10, i11);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f1569v - this.f1568u;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        int i11 = this.f1568u;
        return new p(this.f1570w, i + i11, i11 + i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.f1568u;
        return new c0(this.f1570w, i, i, this.f1569v);
    }
}
