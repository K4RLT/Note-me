package u7;
import j1.b;
import k.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class c8 implements List, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f26029u;

    /* renamed from: v, reason: collision with root package name */
    public final int f26030v;

    /* renamed from: w, reason: collision with root package name */
    public final float f26031w;

    /* renamed from: x, reason: collision with root package name */
    public final String f26032x;

    public c8(ArrayList arrayList, int i, float f10, String str) {
        str.getClass();
        this.f26029u = arrayList;
        this.f26030v = i;
        this.f26031w = f10;
        this.f26032x = str;
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
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f26029u.contains(new b(((b) obj).f18762a));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f26029u.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c8) {
                c8 c8Var = (c8) obj;
                if (!this.f26029u.equals(c8Var.f26029u) || this.f26030v != c8Var.f26030v || Float.compare(this.f26031w, c8Var.f26031w) != 0 || !kotlin.jvm.internal.a(this.f26032x, c8Var.f26032x)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return new b(((b) this.f26029u.get(i)).f18762a);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f26032x.hashCode() + a.a(a.b(this.f26030v, this.f26029u.hashCode() * 31, 31), 31, this.f26031w);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof b)) {
            return -1;
        }
        return this.f26029u.indexOf(new b(((b) obj).f18762a));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f26029u.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f26029u.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof b)) {
            return -1;
        }
        return this.f26029u.lastIndexOf(new b(((b) obj).f18762a));
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f26029u.listIterator();
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
        return this.f26029u.size();
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        return this.f26029u.subList(i, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return kotlin.jvm.internal.b(this, objArr);
    }

    public final String toString() {
        return "Stroke(points=" + this.f26029u + ", color=" + this.f26030v + ", width=" + this.f26031w + ", id=" + this.f26032x + ")";
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f26029u.listIterator(i);
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

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.a(this);
    }
}
