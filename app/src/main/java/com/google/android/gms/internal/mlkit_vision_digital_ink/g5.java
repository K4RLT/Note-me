package com.google.android.gms.internal.mlkit_vision_digital_ink;
import l4.a;
import pa.i;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class g5 extends n4 implements NavigableSet, Iterable {
    public static final g5 A;

    /* renamed from: x, reason: collision with root package name */
    public final transient Comparator f14358x;

    /* renamed from: y, reason: collision with root package name */
    public transient g5 f14359y;

    /* renamed from: z, reason: collision with root package name */
    public final transient h4 f14360z;

    static {
        e4 e4Var = h4.f14393v;
        A = new g5(z4.f15325y, w4.f15177v);
    }

    public g5(h4 h4Var, Comparator comparator) {
        this.f14358x = comparator;
        this.f14360z = h4Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int a(Object[] objArr, int i) {
        return this.f14360z.a(objArr, i);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int b() {
        return this.f14360z.b();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int w10 = w(obj, true);
        h4 h4Var = this.f14360z;
        if (w10 == h4Var.size()) {
            return null;
        }
        return h4Var.get(w10);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f14358x;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f14360z, obj, this.f14358x) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof v4) {
            collection = ((v4) collection).zza();
        }
        Comparator comparator = this.f14358x;
        if (i(comparator, collection) && collection.size() > 1) {
            e4 listIterator = this.f14360z.listIterator(0);
            Iterator it = collection.iterator();
            if (listIterator.hasNext()) {
                Object next = it.next();
                Object next2 = listIterator.next();
                while (true) {
                    try {
                        int compare = comparator.compare(next2, next);
                        if (compare < 0) {
                            if (!listIterator.hasNext()) {
                                break;
                            }
                            next2 = listIterator.next();
                        } else {
                            if (compare != 0) {
                                break;
                            }
                            if (!it.hasNext()) {
                                return true;
                            }
                            next = it.next();
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
            }
            return false;
        }
        return super.containsAll(collection);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int d() {
        return this.f14360z.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f14360z.p().listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        g5 g5Var;
        g5 g5Var2 = this.f14359y;
        if (g5Var2 == null) {
            Comparator reverseOrder = Collections.reverseOrder(this.f14358x);
            if (isEmpty()) {
                if (w4.f15177v.equals(reverseOrder)) {
                    g5Var2 = A;
                    this.f14359y = g5Var2;
                    g5Var2.f14359y = this;
                } else {
                    e4 e4Var = h4.f14393v;
                    g5Var = new g5(z4.f15325y, reverseOrder);
                }
            } else {
                g5Var = new g5(this.f14360z.p(), reverseOrder);
            }
            g5Var2 = g5Var;
            this.f14359y = g5Var2;
            g5Var2.f14359y = this;
        }
        return g5Var2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n4, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                h4 h4Var = this.f14360z;
                if (h4Var.size() == set.size()) {
                    if (!isEmpty()) {
                        Comparator comparator = this.f14358x;
                        if (i(comparator, set)) {
                            Iterator it = set.iterator();
                            try {
                                e4 listIterator = h4Var.listIterator(0);
                                while (listIterator.hasNext()) {
                                    Object next = listIterator.next();
                                    Object next2 = it.next();
                                    if (next2 != null && comparator.compare(next, next2) == 0) {
                                    }
                                }
                                return true;
                            } catch (ClassCastException | NoSuchElementException unused) {
                            }
                        } else {
                            return containsAll(set);
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f14360z.get(0);
        }
        a.c();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int v2 = v(obj, true) - 1;
        if (v2 == -1) {
            return null;
        }
        return this.f14360z.get(v2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n4, com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final h4 g() {
        return this.f14360z;
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        return t(0, v(obj, false));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int w10 = w(obj, false);
        h4 h4Var = this.f14360z;
        if (w10 == h4Var.size()) {
            return null;
        }
        return h4Var.get(w10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f14360z.listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final k5 k() {
        return this.f14360z.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            return this.f14360z.get(r0.size() - 1);
        }
        a.c();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int v2 = v(obj, false) - 1;
        if (v2 == -1) {
            return null;
        }
        return this.f14360z.get(v2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final boolean n() {
        return this.f14360z.n();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final Object[] o() {
        return this.f14360z.o();
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14360z.size();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final g5 t(int i, int i10) {
        h4 h4Var = this.f14360z;
        if (i == 0) {
            if (i10 != h4Var.size()) {
                i = 0;
            } else {
                return this;
            }
        }
        Comparator comparator = this.f14358x;
        if (i < i10) {
            return new g5(h4Var.subList(i, i10), comparator);
        }
        if (w4.f15177v.equals(comparator)) {
            return A;
        }
        e4 e4Var = h4.f14393v;
        return new g5(z4.f15325y, comparator);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return t(w(obj, true), this.f14360z.size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final g5 subSet(Object obj, boolean z3, Object obj2, boolean z9) {
        boolean z10;
        obj.getClass();
        obj2.getClass();
        if (this.f14358x.compare(obj, obj2) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        pa.p(z10);
        g5 t3 = t(w(obj, z3), this.f14360z.size());
        return t3.t(0, t3.v(obj2, z9));
    }

    public final int v(Object obj, boolean z3) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f14360z, obj, this.f14358x);
        if (binarySearch >= 0) {
            if (z3) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int w(Object obj, boolean z3) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f14360z, obj, this.f14358x);
        if (binarySearch >= 0) {
            if (z3) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z3) {
        obj.getClass();
        return t(0, v(obj, z3));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z3) {
        obj.getClass();
        return t(w(obj, z3), this.f14360z.size());
    }
}
