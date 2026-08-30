package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* loaded from: classes.dex */
public final class qt0 extends xy implements Queue, Collection {
    public final LinkedList P;

    public qt0() {
        super(24);
        this.P = new LinkedList();
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final /* synthetic */ Object F() {
        return this.P;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        kt0 kt0Var = (kt0) obj;
        int i = kt0Var.f7876f;
        LinkedList linkedList = this.P;
        if (i == 3) {
            ListIterator listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                kt0 kt0Var2 = (kt0) listIterator.next();
                if (kt0Var2.f7876f == 3) {
                    double d2 = kt0Var2.e;
                    double d10 = kt0Var.e;
                    if (d2 < d10 || (d2 == d10 && kt0Var2.a() > kt0Var.a())) {
                        listIterator.set(kt0Var);
                        kt0Var = kt0Var2;
                    }
                }
            }
            linkedList.add(kt0Var);
            return true;
        }
        linkedList.add(kt0Var);
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.P.addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.P.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.P.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.P.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return this.P.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.P.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.P.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return this.P.offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.P.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.P.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return this.P.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.P.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.P.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.P.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.P.toArray();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.P.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.P.toArray(objArr);
    }
}
