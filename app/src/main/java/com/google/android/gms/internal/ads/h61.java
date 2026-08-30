package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class h61 extends AbstractCollection implements Set {

    /* renamed from: u, reason: collision with root package name */
    public final Set f6613u;

    /* renamed from: v, reason: collision with root package name */
    public final i31 f6614v;

    public h61(Set set, i31 i31Var) {
        this.f6613u = set;
        this.f6614v = i31Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        b80.l(this.f6614v.l(obj));
        return this.f6613u.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b80.l(this.f6614v.l(it.next()));
        }
        return this.f6613u.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f6613u;
        boolean z3 = set instanceof RandomAccess;
        i31 i31Var = this.f6614v;
        if (z3 && (set instanceof List)) {
            List list = (List) set;
            i31Var.getClass();
            int i = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (!i31Var.l(obj)) {
                    if (i10 > i) {
                        try {
                            list.set(i, obj);
                        } catch (IllegalArgumentException unused) {
                            x21.L(list, i31Var, i, i10);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            x21.L(list, i31Var, i, i10);
                            return;
                        }
                    }
                    i++;
                }
            }
            list.subList(i, list.size()).clear();
            return;
        }
        Iterator it = set.iterator();
        i31Var.getClass();
        while (it.hasNext()) {
            if (i31Var.l(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z3;
        Set set = this.f6613u;
        set.getClass();
        try {
            z3 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        return this.f6614v.l(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return xy.P(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return xy.K(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f6613u.iterator();
        i31 i31Var = this.f6614v;
        b80.M(i31Var, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (i31Var.l(it.next())) {
                if (i != -1) {
                    return false;
                }
                return true;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f6613u.iterator();
        it.getClass();
        i31 i31Var = this.f6614v;
        i31Var.getClass();
        return new m51(it, i31Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f6613u.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f6613u.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f6614v.l(next) && collection.contains(next)) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f6613u.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f6614v.l(next) && !collection.contains(next)) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f6613u.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f6614v.l(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ed1.i((m61) iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return ed1.i((m61) iterator()).toArray(objArr);
    }
}
