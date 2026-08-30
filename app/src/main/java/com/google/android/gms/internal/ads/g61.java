package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class g61 extends AbstractSet {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Set f6316u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Set f6317v;

    public g61(Set set, Set set2) {
        this.f6316u = set;
        this.f6317v = set2;
    }

    public final int a() {
        int size;
        int size2;
        Set set = this.f6316u;
        if (set instanceof g61) {
            size = ((g61) set).a();
        } else {
            size = set.size();
        }
        Set set2 = this.f6317v;
        if (set2 instanceof g61) {
            size2 = ((g61) set2).a();
        } else {
            size2 = set2.size();
        }
        return Math.min(size, size2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f6316u.contains(obj) && this.f6317v.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (this.f6316u.containsAll(collection) && this.f6317v.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        int size;
        int size2;
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z3 = set instanceof g61;
                if (z3) {
                    size = ((g61) set).a();
                } else {
                    size = set.size();
                }
                if (size >= 0) {
                    if (z3) {
                        size2 = 0;
                    } else {
                        size2 = set.size();
                    }
                    if (a() >= size2) {
                        m51 m51Var = new m51(this, this.f6316u, this.f6317v);
                        int i = 0;
                        while (true) {
                            if (m51Var.hasNext()) {
                                try {
                                    if (!set.contains(m51Var.next())) {
                                        break;
                                    }
                                    i++;
                                } catch (ClassCastException | NullPointerException unused) {
                                }
                            } else if (i != size) {
                                if (i >= size2) {
                                    Iterator it = set.iterator();
                                    int i10 = 0;
                                    while (it.hasNext()) {
                                        it.next();
                                        i10++;
                                        if (i10 > i) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f6317v, this.f6316u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new m51(this, this.f6316u, this.f6317v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f6316u.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f6317v.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
