package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class r51 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final List f10101u;

    /* renamed from: v, reason: collision with root package name */
    public final f31 f10102v;

    public r51(List list, f31 f31Var) {
        list.getClass();
        this.f10101u = list;
        this.f10102v = f31Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f10102v.apply(this.f10101u.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f10101u.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new q51(this, this.f10101u.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f10102v.apply(this.f10101u.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        this.f10101u.subList(i, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10101u.size();
    }
}
