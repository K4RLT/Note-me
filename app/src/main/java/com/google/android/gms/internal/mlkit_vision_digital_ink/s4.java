package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class s4 implements ListIterator {

    /* renamed from: u, reason: collision with root package name */
    public boolean f14955u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ListIterator f14956v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t4 f14957w;

    public s4(t4 t4Var, ListIterator listIterator) {
        this.f14956v = listIterator;
        this.f14957w = t4Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f14956v;
        listIterator.add(obj);
        listIterator.previous();
        this.f14955u = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f14956v.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14956v.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f14956v;
        if (listIterator.hasPrevious()) {
            this.f14955u = true;
            return listIterator.previous();
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int nextIndex = this.f14956v.nextIndex();
        int size = this.f14957w.f15001u.size();
        pa.l(nextIndex, size);
        return size - nextIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f14956v;
        if (listIterator.hasNext()) {
            this.f14955u = true;
            return listIterator.next();
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        pa.s("no calls to next() since the last call to remove()", this.f14955u);
        this.f14956v.remove();
        this.f14955u = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (this.f14955u) {
            this.f14956v.set(obj);
        } else {
            g5.q.l();
        }
    }
}
