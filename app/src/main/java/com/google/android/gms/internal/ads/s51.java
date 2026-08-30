package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class s51 extends AbstractSequentialList implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final List f10528u;

    /* renamed from: v, reason: collision with root package name */
    public final f31 f10529v;

    public s51(List list, f31 f31Var) {
        list.getClass();
        this.f10528u = list;
        this.f10529v = f31Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f10528u.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new q51(this, this.f10528u.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        this.f10528u.subList(i, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10528u.size();
    }
}
