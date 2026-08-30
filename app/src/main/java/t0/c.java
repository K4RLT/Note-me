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
public final class c implements List, ef.b {

    /* renamed from: u, reason: collision with root package name */
    public final Object f25612u;

    /* renamed from: v, reason: collision with root package name */
    public final int f25613v;

    /* renamed from: w, reason: collision with root package name */
    public int f25614w;

    public c(int i, int i10, List list) {
        this.f25612u = list;
        this.f25613v = i;
        this.f25614w = i10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f25612u.add(i + this.f25613v, obj);
        this.f25614w++;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.f25612u.addAll(i + this.f25613v, collection);
        int size = collection.size();
        this.f25614w += size;
        if (size > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f25614w - 1;
        int i10 = this.f25613v;
        if (i10 <= i) {
            while (true) {
                this.f25612u.remove(i);
                if (i == i10) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.f25614w = i10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f25614w;
        for (int i10 = this.f25613v; i10 < i; i10++) {
            if (l.a(this.f25612u.get(i10), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object get(int i) {
        a(i, this);
        return this.f25612u.get(i + this.f25613v);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f25614w;
        int i10 = this.f25613v;
        for (int i11 = i10; i11 < i; i11++) {
            if (l.a(this.f25612u.get(i11), obj)) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.f25614w == this.f25613v) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f25614w - 1;
        int i10 = this.f25613v;
        if (i10 <= i) {
            while (!l.a(this.f25612u.get(i), obj)) {
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

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f25614w;
        for (int i10 = this.f25613v; i10 < i; i10++) {
            Object r22 = this.f25612u;
            if (l.a(r22.get(i10), obj)) {
                r22.remove(i10);
                this.f25614w--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f25614w;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        if (i != this.f25614w) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f25614w;
        int i10 = i - 1;
        int i11 = this.f25613v;
        if (i11 <= i10) {
            while (true) {
                Object r32 = this.f25612u;
                if (!collection.contains(r32.get(i10))) {
                    r32.remove(i10);
                    this.f25614w--;
                }
                if (i10 == i11) {
                    break;
                }
                i10--;
            }
        }
        if (i != this.f25614w) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        a(i, this);
        return this.f25612u.set(i + this.f25613v, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f25614w - this.f25613v;
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        b(i, i10, this);
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
    public final ListIterator listIterator(int i) {
        return new d(i, this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f25614w;
        this.f25614w = i + 1;
        this.f25612u.add(i, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f25612u.addAll(this.f25614w, collection);
        int size = collection.size();
        this.f25614w += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object remove(int i) {
        a(i, this);
        this.f25614w--;
        return this.f25612u.remove(i + this.f25613v);
    }
}