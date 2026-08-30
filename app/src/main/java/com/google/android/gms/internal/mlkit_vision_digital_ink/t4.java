package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class t4 extends AbstractList {

    /* renamed from: u, reason: collision with root package name */
    public final List f15001u;

    public t4(List list) {
        list.getClass();
        this.f15001u = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        List list = this.f15001u;
        int size = list.size();
        pa.l(i, size);
        list.add(size - i, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f15001u.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f15001u;
        int size = list.size();
        pa.d(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        List list = this.f15001u;
        int size = list.size();
        pa.l(i, size);
        return new s4(this, list.listIterator(size - i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.f15001u;
        int size = list.size();
        pa.d(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        subList(i, i10).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        List list = this.f15001u;
        int size = list.size();
        pa.d(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15001u.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        List list = this.f15001u;
        pa.r(i, i10, list.size());
        int size = list.size();
        pa.l(i10, size);
        int i11 = size - i10;
        int size2 = list.size();
        pa.l(i, size2);
        return nw.l(list.subList(i11, size2 - i));
    }
}
