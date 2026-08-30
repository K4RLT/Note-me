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
public final class a extends qe.f implements RandomAccess, Serializable {

    /* renamed from: u */
    public Object[] f24744u;

    /* renamed from: v */
    public final int f24745v;

    /* renamed from: w */
    public int f24746w;

    /* renamed from: x */
    public final a f24747x;

    /* renamed from: y */
    public final b f24748y;

    public a(Object[] objArr, int i, int i10, a aVar, b bVar) {
        int i11;
        objArr.getClass();
        bVar.getClass();
        this.f24744u = objArr;
        this.f24745v = i;
        this.f24746w = i10;
        this.f24747x = aVar;
        this.f24748y = bVar;
        i11 = ((AbstractList) bVar).modCount;
        ((AbstractList) this).modCount = i11;
    }

    @Override // qe.f
    public final int a() {
        o();
        return this.f24746w;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        p();
        o();
        int i10 = this.f24746w;
        if (i >= 0 && i <= i10) {
            n(this.f24745v + i, obj);
        } else {
            x.l(i1.c("index: ", i, i10, ", size: "));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        p();
        o();
        int i10 = this.f24746w;
        if (i >= 0 && i <= i10) {
            int size = collection.size();
            k(this.f24745v + i, collection, size);
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
        p();
        o();
        int i10 = this.f24746w;
        if (i >= 0 && i < i10) {
            return q(this.f24745v + i);
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        p();
        o();
        r(this.f24745v, this.f24746w);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        o();
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f24744u;
                int i = this.f24746w;
                if (i == list.size()) {
                    for (int i10 = 0; i10 < i; i10++) {
                        if (l.a(objArr[this.f24745v + i10], list.get(i10))) {
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
        o();
        int i10 = this.f24746w;
        if (i >= 0 && i < i10) {
            return this.f24744u[this.f24745v + i];
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        o();
        Object[] objArr = this.f24744u;
        int i10 = this.f24746w;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[this.f24745v + i12];
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
        o();
        for (int i = 0; i < this.f24746w; i++) {
            if (l.a(this.f24744u[this.f24745v + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        o();
        if (this.f24746w == 0) {
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
        b bVar = this.f24748y;
        a aVar = this.f24747x;
        if (aVar != null) {
            aVar.k(i, collection, i10);
        } else {
            b bVar2 = b.f24749x;
            bVar.k(i, collection, i10);
        }
        this.f24744u = bVar.f24750u;
        this.f24746w += i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        o();
        for (int i = this.f24746w - 1; i >= 0; i--) {
            if (l.a(this.f24744u[this.f24745v + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        o();
        int i10 = this.f24746w;
        if (i >= 0 && i <= i10) {
            return new c0(this, i);
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return null;
    }

    public final void n(int i, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f24748y;
        a aVar = this.f24747x;
        if (aVar != null) {
            aVar.n(i, obj);
        } else {
            b bVar2 = b.f24749x;
            bVar.n(i, obj);
        }
        this.f24744u = bVar.f24750u;
        this.f24746w++;
    }

    public final void o() {
        int i;
        i = ((AbstractList) this.f24748y).modCount;
        if (i == ((AbstractList) this).modCount) {
            return;
        }
        l4.a.m();
    }

    public final void p() {
        if (!this.f24748y.f24752w) {
            return;
        }
        x.h();
    }

    public final Object q(int i) {
        Object q10;
        ((AbstractList) this).modCount++;
        a aVar = this.f24747x;
        if (aVar != null) {
            q10 = aVar.q(i);
        } else {
            b bVar = b.f24749x;
            q10 = this.f24748y.q(i);
        }
        this.f24746w--;
        return q10;
    }

    public final void r(int i, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.f24747x;
        if (aVar != null) {
            aVar.r(i, i10);
        } else {
            b bVar = b.f24749x;
            this.f24748y.r(i, i10);
        }
        this.f24746w -= i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        p();
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
        p();
        o();
        if (s(this.f24745v, this.f24746w, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        p();
        o();
        if (s(this.f24745v, this.f24746w, collection, true) > 0) {
            return true;
        }
        return false;
    }

    public final int s(int i, int i10, Collection collection, boolean z3) {
        int s10;
        a aVar = this.f24747x;
        if (aVar != null) {
            s10 = aVar.s(i, i10, collection, z3);
        } else {
            b bVar = b.f24749x;
            s10 = this.f24748y.s(i, i10, collection, z3);
        }
        if (s10 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f24746w -= s10;
        return s10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        p();
        o();
        int i10 = this.f24746w;
        if (i >= 0 && i < i10) {
            Object[] objArr = this.f24744u;
            int i11 = this.f24745v;
            Object obj2 = objArr[i11 + i];
            objArr[i11 + i] = obj;
            return obj2;
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        pa.a(i, i10, this.f24746w);
        return new a(this.f24744u, this.f24745v + i, i10 - i, this, this.f24748y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        o();
        int length = objArr.length;
        int i = this.f24746w;
        Object[] objArr2 = this.f24744u;
        int i10 = this.f24745v;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i10, i + i10, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        k.d(0, i10, i + i10, objArr2, objArr);
        int i11 = this.f24746w;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        o();
        return ib.a(this.f24744u, this.f24745v, this.f24746w, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        p();
        o();
        n(this.f24745v + this.f24746w, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        o();
        Object[] objArr = this.f24744u;
        int i = this.f24746w;
        int i10 = this.f24745v;
        return k.i(objArr, i10, i + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        p();
        o();
        int size = collection.size();
        k(this.f24745v + this.f24746w, collection, size);
        return size > 0;
    }
}
