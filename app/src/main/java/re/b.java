package re;

import b1.c0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;
import q.x;
import qe.k;
import w7.i1;
import ya.ib;
import ya.pa;

/* loaded from: classes.dex */
public final class b extends qe.f implements RandomAccess, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public static final b f24749x;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f24750u;

    /* renamed from: v, reason: collision with root package name */
    public int f24751v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24752w;

    static {
        b bVar = new b(0);
        bVar.f24752w = true;
        f24749x = bVar;
    }

    public b(int i) {
        if (i >= 0) {
            this.f24750u = new Object[i];
        } else {
            x.n("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // qe.f
    public final int a() {
        return this.f24751v;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        o();
        int i10 = this.f24751v;
        if (i >= 0 && i <= i10) {
            ((AbstractList) this).modCount++;
            p(i, 1);
            this.f24750u[i] = obj;
            return;
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        o();
        int i10 = this.f24751v;
        if (i >= 0 && i <= i10) {
            int size = collection.size();
            k(i, collection, size);
            if (size > 0) {
                return true;
            }
            return false;
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return false;
    }

    @Override // qe.f
    public final Object b(int i) {
        o();
        int i10 = this.f24751v;
        if (i >= 0 && i < i10) {
            return q(i);
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        o();
        r(0, this.f24751v);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f24750u;
                int i = this.f24751v;
                if (i == list.size()) {
                    for (int i10 = 0; i10 < i; i10++) {
                        if (l.a(objArr[i10], list.get(i10))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i10 = this.f24751v;
        if (i >= 0 && i < i10) {
            return this.f24750u[i];
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        Object[] objArr = this.f24750u;
        int i10 = this.f24751v;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            int i13 = i11 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i11 = i13 + i;
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f24751v; i++) {
            if (l.a(this.f24750u[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f24751v == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(int i, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        p(i, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f24750u[i + i11] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f24751v - 1; i >= 0; i--) {
            if (l.a(this.f24750u[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i10 = this.f24751v;
        if (i >= 0 && i <= i10) {
            return new c0(this, i);
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return null;
    }

    public final void n(int i, Object obj) {
        ((AbstractList) this).modCount++;
        p(i, 1);
        this.f24750u[i] = obj;
    }

    public final void o() {
        if (!this.f24752w) {
            return;
        }
        x.h();
    }

    public final void p(int i, int i10) {
        int i11 = this.f24751v + i10;
        if (i11 >= 0) {
            Object[] objArr = this.f24750u;
            if (i11 > objArr.length) {
                int length = objArr.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                if (i12 - 2147483639 > 0) {
                    if (i11 > 2147483639) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i12 = 2147483639;
                    }
                }
                this.f24750u = Arrays.copyOf(objArr, i12);
            }
            Object[] objArr2 = this.f24750u;
            k.d(i + i10, i, this.f24751v, objArr2, objArr2);
            this.f24751v += i10;
            return;
        }
        throw new OutOfMemoryError();
    }

    public final Object q(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f24750u;
        Object obj = objArr[i];
        k.d(i, i + 1, this.f24751v, objArr, objArr);
        Object[] objArr2 = this.f24750u;
        int i10 = this.f24751v - 1;
        objArr2.getClass();
        objArr2[i10] = null;
        this.f24751v--;
        return obj;
    }

    public final void r(int i, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f24750u;
        k.d(i, i + i10, this.f24751v, objArr, objArr);
        Object[] objArr2 = this.f24750u;
        int i11 = this.f24751v;
        ib.b(objArr2, i11 - i10, i11);
        this.f24751v -= i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        o();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        o();
        if (s(0, this.f24751v, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        o();
        if (s(0, this.f24751v, collection, true) <= 0) {
            return false;
        }
        return true;
    }

    public final int s(int i, int i10, Collection collection, boolean z3) {
        Object[] objArr;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            objArr = this.f24750u;
            if (i11 >= i10) {
                break;
            }
            int i13 = i + i11;
            if (collection.contains(objArr[i13]) == z3) {
                Object[] objArr2 = this.f24750u;
                i11++;
                objArr2[i12 + i] = objArr2[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        k.d(i + i12, i10 + i, this.f24751v, objArr, objArr);
        Object[] objArr3 = this.f24750u;
        int i15 = this.f24751v;
        ib.b(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f24751v -= i14;
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        o();
        int i10 = this.f24751v;
        if (i >= 0 && i < i10) {
            Object[] objArr = this.f24750u;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        pa.a(i, i10, this.f24751v);
        return new a(this.f24750u, i, i10 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f24751v;
        Object[] objArr2 = this.f24750u;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        k.d(0, 0, i, objArr2, objArr);
        int i10 = this.f24751v;
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ib.a(this.f24750u, 0, this.f24751v, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        o();
        int i = this.f24751v;
        ((AbstractList) this).modCount++;
        p(i, 1);
        this.f24750u[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return k.i(this.f24750u, 0, this.f24751v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        o();
        int size = collection.size();
        k(this.f24751v, collection, size);
        return size > 0;
    }
}
