package b2;
import q.a;
import x.l;
import x.n;
import b1.c0;
import b2.q;
import k.b;
import n.d0;
import n.z;
import q.x;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class q implements List, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final d0 f1578u = new d0(16);

    /* renamed from: v, reason: collision with root package name */
    public final z f1579v = new z(16);

    /* renamed from: w, reason: collision with root package name */
    public int f1580w = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = a(r0, r1, r1)
            int r2 = r7.f1580w
            int r2 = r2 + 1
            d0 r3 = r7.f1578u
            int r3 = r3.f20856b
            int r3 = r3 + (-1)
            if (r2 > r3) goto L46
        L13:
            z r4 = r7.f1579v
            if (r2 < 0) goto L3c
            int r5 = r4.f20965b
            if (r2 >= r5) goto L3f
            long[] r4 = r4.f20964a
            r5 = r4[r2]
            int r4 = l.g(r5, r0)
            if (r4 >= 0) goto L26
            r0 = r5
        L26:
            float r4 = l.j(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L36
            boolean r4 = l.o(r0)
            if (r4 == 0) goto L36
            goto L3b
        L36:
            if (r2 == r3) goto L3b
            int r2 = r2 + 1
            goto L13
        L3b:
            return r0
        L3c:
            r4.getClass()
        L3f:
            java.lang.String r0 = "Index must be between 0 and size"
            x.l(r0)
            r0 = 0
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.q.a():long");
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

    public final void b(int i, int i10) {
        if (i < i10) {
            this.f1578u.k(i, i10);
            z zVar = this.f1579v;
            if (i >= 0) {
                int i11 = zVar.f20965b;
                if (i <= i11 && i10 >= 0 && i10 <= i11) {
                    if (i10 >= i) {
                        if (i10 != i) {
                            if (i10 < i11) {
                                long[] jArr = zVar.f20964a;
                                qe.k.e(jArr, jArr, i, i10, i11);
                            }
                            zVar.f20965b -= i10 - i;
                            return;
                        }
                        return;
                    }
                    x.n("The end index must be < start index");
                    return;
                }
            } else {
                zVar.getClass();
            }
            x.l("Index must be between 0 and size");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f1580w = -1;
        this.f1578u.c();
        this.f1579v.f20965b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof d1.q) || indexOf((d1.q) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((d1.q) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object e = this.f1578u.e(i);
        e.getClass();
        return (d1.q) e;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof d1.q)) {
            return -1;
        }
        d1.q qVar = (d1.q) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!kotlin.jvm.internal.a(this.f1578u.e(i), qVar)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f1578u.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c0(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof d1.q)) {
            return -1;
        }
        d1.q qVar = (d1.q) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (kotlin.jvm.internal.a(this.f1578u.e(size), qVar)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c0(this, 0, 7);
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
        return this.f1578u.f20856b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        return new p(this, i, i10);
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

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new c0(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
